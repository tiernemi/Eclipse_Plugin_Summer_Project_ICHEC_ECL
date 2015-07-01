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
import java.util.Map;
import java.util.HashMap;
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
        	return "Program";	
       	}
       	
       	@Override
       	protected HIPIEGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleProgram"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:67:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:68:2: (iv_ruleProgram= ruleProgram EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:69:2: iv_ruleProgram= ruleProgram EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProgramRule()); 
            }
            pushFollow(FOLLOW_ruleProgram_in_entryRuleProgram75);
            iv_ruleProgram=ruleProgram();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProgram; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProgram85); if (state.failed) return current;

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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:76:1: ruleProgram returns [EObject current=null] : ( ( (lv_composition_header_0_0= ruleCompositionHeader ) )? ( (lv_base_props_1_0= ruleBaseProp ) )+ ( (lv_contract_instances_2_0= ruleContractInstance ) )* ( (lv_input_section_3_0= ruleInputSection ) )? ( (lv_output_section_4_0= ruleOutputSection ) )? ( (lv_visual_section_5_0= ruleVisualSection ) )* ( (lv_generate_section_6_0= ruleGenerateSection ) )? ( (lv_custom_section_7_0= ruleCustomSection ) )? ( (lv_sesource_section_8_0= ruleResourceSection ) )? ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_composition_header_0_0 = null;

        EObject lv_base_props_1_0 = null;

        EObject lv_contract_instances_2_0 = null;

        EObject lv_input_section_3_0 = null;

        EObject lv_output_section_4_0 = null;

        EObject lv_visual_section_5_0 = null;

        EObject lv_generate_section_6_0 = null;

        EObject lv_custom_section_7_0 = null;

        EObject lv_sesource_section_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:79:28: ( ( ( (lv_composition_header_0_0= ruleCompositionHeader ) )? ( (lv_base_props_1_0= ruleBaseProp ) )+ ( (lv_contract_instances_2_0= ruleContractInstance ) )* ( (lv_input_section_3_0= ruleInputSection ) )? ( (lv_output_section_4_0= ruleOutputSection ) )? ( (lv_visual_section_5_0= ruleVisualSection ) )* ( (lv_generate_section_6_0= ruleGenerateSection ) )? ( (lv_custom_section_7_0= ruleCustomSection ) )? ( (lv_sesource_section_8_0= ruleResourceSection ) )? ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:80:1: ( ( (lv_composition_header_0_0= ruleCompositionHeader ) )? ( (lv_base_props_1_0= ruleBaseProp ) )+ ( (lv_contract_instances_2_0= ruleContractInstance ) )* ( (lv_input_section_3_0= ruleInputSection ) )? ( (lv_output_section_4_0= ruleOutputSection ) )? ( (lv_visual_section_5_0= ruleVisualSection ) )* ( (lv_generate_section_6_0= ruleGenerateSection ) )? ( (lv_custom_section_7_0= ruleCustomSection ) )? ( (lv_sesource_section_8_0= ruleResourceSection ) )? )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:80:1: ( ( (lv_composition_header_0_0= ruleCompositionHeader ) )? ( (lv_base_props_1_0= ruleBaseProp ) )+ ( (lv_contract_instances_2_0= ruleContractInstance ) )* ( (lv_input_section_3_0= ruleInputSection ) )? ( (lv_output_section_4_0= ruleOutputSection ) )? ( (lv_visual_section_5_0= ruleVisualSection ) )* ( (lv_generate_section_6_0= ruleGenerateSection ) )? ( (lv_custom_section_7_0= ruleCustomSection ) )? ( (lv_sesource_section_8_0= ruleResourceSection ) )? )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:80:2: ( (lv_composition_header_0_0= ruleCompositionHeader ) )? ( (lv_base_props_1_0= ruleBaseProp ) )+ ( (lv_contract_instances_2_0= ruleContractInstance ) )* ( (lv_input_section_3_0= ruleInputSection ) )? ( (lv_output_section_4_0= ruleOutputSection ) )? ( (lv_visual_section_5_0= ruleVisualSection ) )* ( (lv_generate_section_6_0= ruleGenerateSection ) )? ( (lv_custom_section_7_0= ruleCustomSection ) )? ( (lv_sesource_section_8_0= ruleResourceSection ) )?
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:80:2: ( (lv_composition_header_0_0= ruleCompositionHeader ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==32) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:81:1: (lv_composition_header_0_0= ruleCompositionHeader )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:81:1: (lv_composition_header_0_0= ruleCompositionHeader )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:82:3: lv_composition_header_0_0= ruleCompositionHeader
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getProgramAccess().getComposition_headerCompositionHeaderParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCompositionHeader_in_ruleProgram131);
                    lv_composition_header_0_0=ruleCompositionHeader();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getProgramRule());
                      	        }
                             		add(
                             			current, 
                             			"composition_header",
                              		lv_composition_header_0_0, 
                              		"CompositionHeader");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:98:3: ( (lv_base_props_1_0= ruleBaseProp ) )+
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
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:99:1: (lv_base_props_1_0= ruleBaseProp )
            	    {
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:99:1: (lv_base_props_1_0= ruleBaseProp )
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:100:3: lv_base_props_1_0= ruleBaseProp
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getProgramAccess().getBase_propsBasePropParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBaseProp_in_ruleProgram153);
            	    lv_base_props_1_0=ruleBaseProp();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getProgramRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"base_props",
            	              		lv_base_props_1_0, 
            	              		"BaseProp");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:116:3: ( (lv_contract_instances_2_0= ruleContractInstance ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==34) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:117:1: (lv_contract_instances_2_0= ruleContractInstance )
            	    {
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:117:1: (lv_contract_instances_2_0= ruleContractInstance )
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:118:3: lv_contract_instances_2_0= ruleContractInstance
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getProgramAccess().getContract_instancesContractInstanceParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleContractInstance_in_ruleProgram175);
            	    lv_contract_instances_2_0=ruleContractInstance();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getProgramRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"contract_instances",
            	              		lv_contract_instances_2_0, 
            	              		"ContractInstance");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:134:3: ( (lv_input_section_3_0= ruleInputSection ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==40) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:135:1: (lv_input_section_3_0= ruleInputSection )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:135:1: (lv_input_section_3_0= ruleInputSection )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:136:3: lv_input_section_3_0= ruleInputSection
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getProgramAccess().getInput_sectionInputSectionParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleInputSection_in_ruleProgram197);
                    lv_input_section_3_0=ruleInputSection();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getProgramRule());
                      	        }
                             		add(
                             			current, 
                             			"input_section",
                              		lv_input_section_3_0, 
                              		"InputSection");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:152:3: ( (lv_output_section_4_0= ruleOutputSection ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==77) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:153:1: (lv_output_section_4_0= ruleOutputSection )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:153:1: (lv_output_section_4_0= ruleOutputSection )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:154:3: lv_output_section_4_0= ruleOutputSection
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getProgramAccess().getOutput_sectionOutputSectionParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOutputSection_in_ruleProgram219);
                    lv_output_section_4_0=ruleOutputSection();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getProgramRule());
                      	        }
                             		add(
                             			current, 
                             			"output_section",
                              		lv_output_section_4_0, 
                              		"OutputSection");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:170:3: ( (lv_visual_section_5_0= ruleVisualSection ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==28) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:171:1: (lv_visual_section_5_0= ruleVisualSection )
            	    {
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:171:1: (lv_visual_section_5_0= ruleVisualSection )
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:172:3: lv_visual_section_5_0= ruleVisualSection
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getProgramAccess().getVisual_sectionVisualSectionParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleVisualSection_in_ruleProgram241);
            	    lv_visual_section_5_0=ruleVisualSection();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getProgramRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"visual_section",
            	              		lv_visual_section_5_0, 
            	              		"VisualSection");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:188:3: ( (lv_generate_section_6_0= ruleGenerateSection ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==90) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:189:1: (lv_generate_section_6_0= ruleGenerateSection )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:189:1: (lv_generate_section_6_0= ruleGenerateSection )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:190:3: lv_generate_section_6_0= ruleGenerateSection
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getProgramAccess().getGenerate_sectionGenerateSectionParserRuleCall_6_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleGenerateSection_in_ruleProgram263);
                    lv_generate_section_6_0=ruleGenerateSection();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getProgramRule());
                      	        }
                             		add(
                             			current, 
                             			"generate_section",
                              		lv_generate_section_6_0, 
                              		"GenerateSection");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:206:3: ( (lv_custom_section_7_0= ruleCustomSection ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==27) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:207:1: (lv_custom_section_7_0= ruleCustomSection )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:207:1: (lv_custom_section_7_0= ruleCustomSection )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:208:3: lv_custom_section_7_0= ruleCustomSection
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getProgramAccess().getCustom_sectionCustomSectionParserRuleCall_7_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCustomSection_in_ruleProgram285);
                    lv_custom_section_7_0=ruleCustomSection();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getProgramRule());
                      	        }
                             		add(
                             			current, 
                             			"custom_section",
                              		lv_custom_section_7_0, 
                              		"CustomSection");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:224:3: ( (lv_sesource_section_8_0= ruleResourceSection ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==121) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:225:1: (lv_sesource_section_8_0= ruleResourceSection )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:225:1: (lv_sesource_section_8_0= ruleResourceSection )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:226:3: lv_sesource_section_8_0= ruleResourceSection
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getProgramAccess().getSesource_sectionResourceSectionParserRuleCall_8_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleResourceSection_in_ruleProgram307);
                    lv_sesource_section_8_0=ruleResourceSection();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getProgramRule());
                      	        }
                             		add(
                             			current, 
                             			"sesource_section",
                              		lv_sesource_section_8_0, 
                              		"ResourceSection");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleBaseProp"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:250:1: entryRuleBaseProp returns [EObject current=null] : iv_ruleBaseProp= ruleBaseProp EOF ;
    public final EObject entryRuleBaseProp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseProp = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:251:2: (iv_ruleBaseProp= ruleBaseProp EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:252:2: iv_ruleBaseProp= ruleBaseProp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBasePropRule()); 
            }
            pushFollow(FOLLOW_ruleBaseProp_in_entryRuleBaseProp344);
            iv_ruleBaseProp=ruleBaseProp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBaseProp; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBaseProp354); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBaseProp"


    // $ANTLR start "ruleBaseProp"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:259:1: ruleBaseProp returns [EObject current=null] : ( ( ( ( (lv_name_0_0= 'NAME' ) ) | ( (lv_name_1_0= 'DESCRIPTION' ) ) | ( (lv_name_2_0= 'AUTHOR' ) ) | ( (lv_name_3_0= 'LICENSE' ) ) | ( (lv_name_4_0= 'COPYRIGHT' ) ) | ( (lv_name_5_0= 'VERSION' ) ) | ( (lv_name_6_0= 'LABEL' ) ) | ( (lv_name_7_0= 'ID' ) ) ) ( (lv_val_list_8_0= ruleValueList ) ) otherlv_9= ';' ) | ( ( (lv_name_10_0= 'CATEGORY' ) ) ( (lv_cat_list_11_0= ruleCategoryTypeList ) ) otherlv_12= ';' ) ) ;
    public final EObject ruleBaseProp() throws RecognitionException {
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
        EObject lv_val_list_8_0 = null;

        EObject lv_cat_list_11_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:262:28: ( ( ( ( ( (lv_name_0_0= 'NAME' ) ) | ( (lv_name_1_0= 'DESCRIPTION' ) ) | ( (lv_name_2_0= 'AUTHOR' ) ) | ( (lv_name_3_0= 'LICENSE' ) ) | ( (lv_name_4_0= 'COPYRIGHT' ) ) | ( (lv_name_5_0= 'VERSION' ) ) | ( (lv_name_6_0= 'LABEL' ) ) | ( (lv_name_7_0= 'ID' ) ) ) ( (lv_val_list_8_0= ruleValueList ) ) otherlv_9= ';' ) | ( ( (lv_name_10_0= 'CATEGORY' ) ) ( (lv_cat_list_11_0= ruleCategoryTypeList ) ) otherlv_12= ';' ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:263:1: ( ( ( ( (lv_name_0_0= 'NAME' ) ) | ( (lv_name_1_0= 'DESCRIPTION' ) ) | ( (lv_name_2_0= 'AUTHOR' ) ) | ( (lv_name_3_0= 'LICENSE' ) ) | ( (lv_name_4_0= 'COPYRIGHT' ) ) | ( (lv_name_5_0= 'VERSION' ) ) | ( (lv_name_6_0= 'LABEL' ) ) | ( (lv_name_7_0= 'ID' ) ) ) ( (lv_val_list_8_0= ruleValueList ) ) otherlv_9= ';' ) | ( ( (lv_name_10_0= 'CATEGORY' ) ) ( (lv_cat_list_11_0= ruleCategoryTypeList ) ) otherlv_12= ';' ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:263:1: ( ( ( ( (lv_name_0_0= 'NAME' ) ) | ( (lv_name_1_0= 'DESCRIPTION' ) ) | ( (lv_name_2_0= 'AUTHOR' ) ) | ( (lv_name_3_0= 'LICENSE' ) ) | ( (lv_name_4_0= 'COPYRIGHT' ) ) | ( (lv_name_5_0= 'VERSION' ) ) | ( (lv_name_6_0= 'LABEL' ) ) | ( (lv_name_7_0= 'ID' ) ) ) ( (lv_val_list_8_0= ruleValueList ) ) otherlv_9= ';' ) | ( ( (lv_name_10_0= 'CATEGORY' ) ) ( (lv_cat_list_11_0= ruleCategoryTypeList ) ) otherlv_12= ';' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=12 && LA11_0<=19)) ) {
                alt11=1;
            }
            else if ( (LA11_0==21) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:263:2: ( ( ( (lv_name_0_0= 'NAME' ) ) | ( (lv_name_1_0= 'DESCRIPTION' ) ) | ( (lv_name_2_0= 'AUTHOR' ) ) | ( (lv_name_3_0= 'LICENSE' ) ) | ( (lv_name_4_0= 'COPYRIGHT' ) ) | ( (lv_name_5_0= 'VERSION' ) ) | ( (lv_name_6_0= 'LABEL' ) ) | ( (lv_name_7_0= 'ID' ) ) ) ( (lv_val_list_8_0= ruleValueList ) ) otherlv_9= ';' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:263:2: ( ( ( (lv_name_0_0= 'NAME' ) ) | ( (lv_name_1_0= 'DESCRIPTION' ) ) | ( (lv_name_2_0= 'AUTHOR' ) ) | ( (lv_name_3_0= 'LICENSE' ) ) | ( (lv_name_4_0= 'COPYRIGHT' ) ) | ( (lv_name_5_0= 'VERSION' ) ) | ( (lv_name_6_0= 'LABEL' ) ) | ( (lv_name_7_0= 'ID' ) ) ) ( (lv_val_list_8_0= ruleValueList ) ) otherlv_9= ';' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:263:3: ( ( (lv_name_0_0= 'NAME' ) ) | ( (lv_name_1_0= 'DESCRIPTION' ) ) | ( (lv_name_2_0= 'AUTHOR' ) ) | ( (lv_name_3_0= 'LICENSE' ) ) | ( (lv_name_4_0= 'COPYRIGHT' ) ) | ( (lv_name_5_0= 'VERSION' ) ) | ( (lv_name_6_0= 'LABEL' ) ) | ( (lv_name_7_0= 'ID' ) ) ) ( (lv_val_list_8_0= ruleValueList ) ) otherlv_9= ';'
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
                        if (state.backtracking>0) {state.failed=true; return current;}
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
                            lv_name_0_0=(Token)match(input,12,FOLLOW_12_in_ruleBaseProp399); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_name_0_0, grammarAccess.getBasePropAccess().getNameNAMEKeyword_0_0_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getBasePropRule());
                              	        }
                                     		setWithLastConsumed(current, "name", lv_name_0_0, "NAME");
                              	    
                            }

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
                            lv_name_1_0=(Token)match(input,13,FOLLOW_13_in_ruleBaseProp436); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_name_1_0, grammarAccess.getBasePropAccess().getNameDESCRIPTIONKeyword_0_0_1_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getBasePropRule());
                              	        }
                                     		setWithLastConsumed(current, "name", lv_name_1_0, "DESCRIPTION");
                              	    
                            }

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
                            lv_name_2_0=(Token)match(input,14,FOLLOW_14_in_ruleBaseProp473); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_name_2_0, grammarAccess.getBasePropAccess().getNameAUTHORKeyword_0_0_2_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getBasePropRule());
                              	        }
                                     		setWithLastConsumed(current, "name", lv_name_2_0, "AUTHOR");
                              	    
                            }

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
                            lv_name_3_0=(Token)match(input,15,FOLLOW_15_in_ruleBaseProp510); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_name_3_0, grammarAccess.getBasePropAccess().getNameLICENSEKeyword_0_0_3_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getBasePropRule());
                              	        }
                                     		setWithLastConsumed(current, "name", lv_name_3_0, "LICENSE");
                              	    
                            }

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
                            lv_name_4_0=(Token)match(input,16,FOLLOW_16_in_ruleBaseProp547); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_name_4_0, grammarAccess.getBasePropAccess().getNameCOPYRIGHTKeyword_0_0_4_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getBasePropRule());
                              	        }
                                     		setWithLastConsumed(current, "name", lv_name_4_0, "COPYRIGHT");
                              	    
                            }

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
                            lv_name_5_0=(Token)match(input,17,FOLLOW_17_in_ruleBaseProp584); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_name_5_0, grammarAccess.getBasePropAccess().getNameVERSIONKeyword_0_0_5_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getBasePropRule());
                              	        }
                                     		setWithLastConsumed(current, "name", lv_name_5_0, "VERSION");
                              	    
                            }

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
                            lv_name_6_0=(Token)match(input,18,FOLLOW_18_in_ruleBaseProp621); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_name_6_0, grammarAccess.getBasePropAccess().getNameLABELKeyword_0_0_6_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getBasePropRule());
                              	        }
                                     		setWithLastConsumed(current, "name", lv_name_6_0, "LABEL");
                              	    
                            }

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
                            lv_name_7_0=(Token)match(input,19,FOLLOW_19_in_ruleBaseProp658); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_name_7_0, grammarAccess.getBasePropAccess().getNameIDKeyword_0_0_7_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getBasePropRule());
                              	        }
                                     		setWithLastConsumed(current, "name", lv_name_7_0, "ID");
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }

                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:390:3: ( (lv_val_list_8_0= ruleValueList ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:391:1: (lv_val_list_8_0= ruleValueList )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:391:1: (lv_val_list_8_0= ruleValueList )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:392:3: lv_val_list_8_0= ruleValueList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBasePropAccess().getVal_listValueListParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValueList_in_ruleBaseProp693);
                    lv_val_list_8_0=ruleValueList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBasePropRule());
                      	        }
                             		set(
                             			current, 
                             			"val_list",
                              		lv_val_list_8_0, 
                              		"ValueList");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_9=(Token)match(input,20,FOLLOW_20_in_ruleBaseProp705); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getBasePropAccess().getSemicolonKeyword_0_2());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:413:6: ( ( (lv_name_10_0= 'CATEGORY' ) ) ( (lv_cat_list_11_0= ruleCategoryTypeList ) ) otherlv_12= ';' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:413:6: ( ( (lv_name_10_0= 'CATEGORY' ) ) ( (lv_cat_list_11_0= ruleCategoryTypeList ) ) otherlv_12= ';' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:413:7: ( (lv_name_10_0= 'CATEGORY' ) ) ( (lv_cat_list_11_0= ruleCategoryTypeList ) ) otherlv_12= ';'
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:413:7: ( (lv_name_10_0= 'CATEGORY' ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:414:1: (lv_name_10_0= 'CATEGORY' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:414:1: (lv_name_10_0= 'CATEGORY' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:415:3: lv_name_10_0= 'CATEGORY'
                    {
                    lv_name_10_0=(Token)match(input,21,FOLLOW_21_in_ruleBaseProp731); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_10_0, grammarAccess.getBasePropAccess().getNameCATEGORYKeyword_1_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getBasePropRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_10_0, "CATEGORY");
                      	    
                    }

                    }


                    }

                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:428:2: ( (lv_cat_list_11_0= ruleCategoryTypeList ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:429:1: (lv_cat_list_11_0= ruleCategoryTypeList )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:429:1: (lv_cat_list_11_0= ruleCategoryTypeList )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:430:3: lv_cat_list_11_0= ruleCategoryTypeList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBasePropAccess().getCat_listCategoryTypeListParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCategoryTypeList_in_ruleBaseProp765);
                    lv_cat_list_11_0=ruleCategoryTypeList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBasePropRule());
                      	        }
                             		set(
                             			current, 
                             			"cat_list",
                              		lv_cat_list_11_0, 
                              		"CategoryTypeList");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_12=(Token)match(input,20,FOLLOW_20_in_ruleBaseProp777); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getBasePropAccess().getSemicolonKeyword_1_2());
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleBaseProp"


    // $ANTLR start "entryRuleCategoryType"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:458:1: entryRuleCategoryType returns [String current=null] : iv_ruleCategoryType= ruleCategoryType EOF ;
    public final String entryRuleCategoryType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCategoryType = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:459:2: (iv_ruleCategoryType= ruleCategoryType EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:460:2: iv_ruleCategoryType= ruleCategoryType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCategoryTypeRule()); 
            }
            pushFollow(FOLLOW_ruleCategoryType_in_entryRuleCategoryType815);
            iv_ruleCategoryType=ruleCategoryType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCategoryType.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCategoryType826); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCategoryType"


    // $ANTLR start "ruleCategoryType"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:467:1: ruleCategoryType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'CLEAN' | kw= 'INPUT' | kw= 'APPEND' | kw= 'LINK' | kw= 'ANALYSIS' | kw= 'CUSTOM' | kw= 'VISUALIZE' | kw= 'OUTPUT' ) ;
    public final AntlrDatatypeRuleToken ruleCategoryType() throws RecognitionException {
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
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:472:2: kw= 'CLEAN'
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleCategoryType864); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCategoryTypeAccess().getCLEANKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:479:2: kw= 'INPUT'
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleCategoryType883); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCategoryTypeAccess().getINPUTKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:486:2: kw= 'APPEND'
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleCategoryType902); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCategoryTypeAccess().getAPPENDKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:493:2: kw= 'LINK'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleCategoryType921); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCategoryTypeAccess().getLINKKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:500:2: kw= 'ANALYSIS'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleCategoryType940); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCategoryTypeAccess().getANALYSISKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:507:2: kw= 'CUSTOM'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleCategoryType959); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCategoryTypeAccess().getCUSTOMKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:514:2: kw= 'VISUALIZE'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleCategoryType978); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCategoryTypeAccess().getVISUALIZEKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:521:2: kw= 'OUTPUT'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleCategoryType997); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCategoryTypeAccess().getOUTPUTKeyword_7()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleCategoryType"


    // $ANTLR start "entryRuleCategoryTypeList"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:534:1: entryRuleCategoryTypeList returns [EObject current=null] : iv_ruleCategoryTypeList= ruleCategoryTypeList EOF ;
    public final EObject entryRuleCategoryTypeList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCategoryTypeList = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:535:2: (iv_ruleCategoryTypeList= ruleCategoryTypeList EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:536:2: iv_ruleCategoryTypeList= ruleCategoryTypeList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCategoryTypeListRule()); 
            }
            pushFollow(FOLLOW_ruleCategoryTypeList_in_entryRuleCategoryTypeList1037);
            iv_ruleCategoryTypeList=ruleCategoryTypeList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCategoryTypeList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCategoryTypeList1047); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCategoryTypeList"


    // $ANTLR start "ruleCategoryTypeList"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:543:1: ruleCategoryTypeList returns [EObject current=null] : ( ( (lv_cats_0_0= ruleCategoryType ) ) (otherlv_1= ',' ( (lv_cats_2_0= ruleCategoryType ) ) )* ) ;
    public final EObject ruleCategoryTypeList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_cats_0_0 = null;

        AntlrDatatypeRuleToken lv_cats_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:546:28: ( ( ( (lv_cats_0_0= ruleCategoryType ) ) (otherlv_1= ',' ( (lv_cats_2_0= ruleCategoryType ) ) )* ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:547:1: ( ( (lv_cats_0_0= ruleCategoryType ) ) (otherlv_1= ',' ( (lv_cats_2_0= ruleCategoryType ) ) )* )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:547:1: ( ( (lv_cats_0_0= ruleCategoryType ) ) (otherlv_1= ',' ( (lv_cats_2_0= ruleCategoryType ) ) )* )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:547:2: ( (lv_cats_0_0= ruleCategoryType ) ) (otherlv_1= ',' ( (lv_cats_2_0= ruleCategoryType ) ) )*
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:547:2: ( (lv_cats_0_0= ruleCategoryType ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:548:1: (lv_cats_0_0= ruleCategoryType )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:548:1: (lv_cats_0_0= ruleCategoryType )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:549:3: lv_cats_0_0= ruleCategoryType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCategoryTypeListAccess().getCatsCategoryTypeParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCategoryType_in_ruleCategoryTypeList1093);
            lv_cats_0_0=ruleCategoryType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCategoryTypeListRule());
              	        }
                     		add(
                     			current, 
                     			"cats",
                      		lv_cats_0_0, 
                      		"CategoryType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:565:2: (otherlv_1= ',' ( (lv_cats_2_0= ruleCategoryType ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==30) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:565:4: otherlv_1= ',' ( (lv_cats_2_0= ruleCategoryType ) )
            	    {
            	    otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleCategoryTypeList1106); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getCategoryTypeListAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:569:1: ( (lv_cats_2_0= ruleCategoryType ) )
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:570:1: (lv_cats_2_0= ruleCategoryType )
            	    {
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:570:1: (lv_cats_2_0= ruleCategoryType )
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:571:3: lv_cats_2_0= ruleCategoryType
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCategoryTypeListAccess().getCatsCategoryTypeParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleCategoryType_in_ruleCategoryTypeList1127);
            	    lv_cats_2_0=ruleCategoryType();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getCategoryTypeListRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"cats",
            	              		lv_cats_2_0, 
            	              		"CategoryType");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleCategoryTypeList"


    // $ANTLR start "entryRuleValue"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:595:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:596:2: (iv_ruleValue= ruleValue EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:597:2: iv_ruleValue= ruleValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueRule()); 
            }
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue1165);
            iv_ruleValue=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue1175); if (state.failed) return current;

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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:604:1: ruleValue returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) | ( (lv_int_val_1_0= RULE_INT ) ) | ( (lv_str_val_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_int_val_1_0=null;
        Token lv_str_val_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:607:28: ( ( ( (lv_name_0_0= RULE_ID ) ) | ( (lv_int_val_1_0= RULE_INT ) ) | ( (lv_str_val_2_0= RULE_STRING ) ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:608:1: ( ( (lv_name_0_0= RULE_ID ) ) | ( (lv_int_val_1_0= RULE_INT ) ) | ( (lv_str_val_2_0= RULE_STRING ) ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:608:1: ( ( (lv_name_0_0= RULE_ID ) ) | ( (lv_int_val_1_0= RULE_INT ) ) | ( (lv_str_val_2_0= RULE_STRING ) ) )
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
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:608:2: ( (lv_name_0_0= RULE_ID ) )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:608:2: ( (lv_name_0_0= RULE_ID ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:609:1: (lv_name_0_0= RULE_ID )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:609:1: (lv_name_0_0= RULE_ID )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:610:3: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValue1217); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_0_0, grammarAccess.getValueAccess().getNameIDTerminalRuleCall_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

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


                    }
                    break;
                case 2 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:627:6: ( (lv_int_val_1_0= RULE_INT ) )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:627:6: ( (lv_int_val_1_0= RULE_INT ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:628:1: (lv_int_val_1_0= RULE_INT )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:628:1: (lv_int_val_1_0= RULE_INT )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:629:3: lv_int_val_1_0= RULE_INT
                    {
                    lv_int_val_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleValue1245); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_int_val_1_0, grammarAccess.getValueAccess().getInt_valINTTerminalRuleCall_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

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


                    }
                    break;
                case 3 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:646:6: ( (lv_str_val_2_0= RULE_STRING ) )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:646:6: ( (lv_str_val_2_0= RULE_STRING ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:647:1: (lv_str_val_2_0= RULE_STRING )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:647:1: (lv_str_val_2_0= RULE_STRING )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:648:3: lv_str_val_2_0= RULE_STRING
                    {
                    lv_str_val_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleValue1273); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_str_val_2_0, grammarAccess.getValueAccess().getStr_valSTRINGTerminalRuleCall_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

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


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleValueList"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:672:1: entryRuleValueList returns [EObject current=null] : iv_ruleValueList= ruleValueList EOF ;
    public final EObject entryRuleValueList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueList = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:673:2: (iv_ruleValueList= ruleValueList EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:674:2: iv_ruleValueList= ruleValueList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueListRule()); 
            }
            pushFollow(FOLLOW_ruleValueList_in_entryRuleValueList1314);
            iv_ruleValueList=ruleValueList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValueList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueList1324); if (state.failed) return current;

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
    // $ANTLR end "entryRuleValueList"


    // $ANTLR start "ruleValueList"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:681:1: ruleValueList returns [EObject current=null] : ( ( (lv_vals_0_0= ruleValue ) ) (otherlv_1= ',' ( (lv_vals_2_0= ruleValue ) ) )* ) ;
    public final EObject ruleValueList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_vals_0_0 = null;

        EObject lv_vals_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:684:28: ( ( ( (lv_vals_0_0= ruleValue ) ) (otherlv_1= ',' ( (lv_vals_2_0= ruleValue ) ) )* ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:685:1: ( ( (lv_vals_0_0= ruleValue ) ) (otherlv_1= ',' ( (lv_vals_2_0= ruleValue ) ) )* )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:685:1: ( ( (lv_vals_0_0= ruleValue ) ) (otherlv_1= ',' ( (lv_vals_2_0= ruleValue ) ) )* )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:685:2: ( (lv_vals_0_0= ruleValue ) ) (otherlv_1= ',' ( (lv_vals_2_0= ruleValue ) ) )*
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:685:2: ( (lv_vals_0_0= ruleValue ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:686:1: (lv_vals_0_0= ruleValue )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:686:1: (lv_vals_0_0= ruleValue )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:687:3: lv_vals_0_0= ruleValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getValueListAccess().getValsValueParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValue_in_ruleValueList1370);
            lv_vals_0_0=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getValueListRule());
              	        }
                     		add(
                     			current, 
                     			"vals",
                      		lv_vals_0_0, 
                      		"Value");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:703:2: (otherlv_1= ',' ( (lv_vals_2_0= ruleValue ) ) )*
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
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:703:4: otherlv_1= ',' ( (lv_vals_2_0= ruleValue ) )
            	    {
            	    otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleValueList1383); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getValueListAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:707:1: ( (lv_vals_2_0= ruleValue ) )
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:708:1: (lv_vals_2_0= ruleValue )
            	    {
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:708:1: (lv_vals_2_0= ruleValue )
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:709:3: lv_vals_2_0= ruleValue
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getValueListAccess().getValsValueParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValue_in_ruleValueList1404);
            	    lv_vals_2_0=ruleValue();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getValueListRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"vals",
            	              		lv_vals_2_0, 
            	              		"Value");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

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

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleValueList"


    // $ANTLR start "entryRuleAssign"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:735:1: entryRuleAssign returns [EObject current=null] : iv_ruleAssign= ruleAssign EOF ;
    public final EObject entryRuleAssign() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssign = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:736:2: (iv_ruleAssign= ruleAssign EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:737:2: iv_ruleAssign= ruleAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignRule()); 
            }
            pushFollow(FOLLOW_ruleAssign_in_entryRuleAssign1444);
            iv_ruleAssign=ruleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssign; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssign1454); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAssign"


    // $ANTLR start "ruleAssign"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:744:1: ruleAssign returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_vals_2_0= ruleValueList ) ) ) ;
    public final EObject ruleAssign() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_vals_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:747:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_vals_2_0= ruleValueList ) ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:748:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_vals_2_0= ruleValueList ) ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:748:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_vals_2_0= ruleValueList ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:748:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_vals_2_0= ruleValueList ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:748:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:749:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:749:1: (lv_name_0_0= RULE_ID )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:750:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssign1496); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getAssignAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

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


            }

            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleAssign1513); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAssignAccess().getEqualsSignKeyword_1());
                  
            }
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:770:1: ( (lv_vals_2_0= ruleValueList ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:771:1: (lv_vals_2_0= ruleValueList )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:771:1: (lv_vals_2_0= ruleValueList )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:772:3: lv_vals_2_0= ruleValueList
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssignAccess().getValsValueListParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValueList_in_ruleAssign1534);
            lv_vals_2_0=ruleValueList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAssignRule());
              	        }
                     		set(
                     			current, 
                     			"vals",
                      		lv_vals_2_0, 
                      		"ValueList");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAssign"


    // $ANTLR start "entryRuleAssignList"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:796:1: entryRuleAssignList returns [EObject current=null] : iv_ruleAssignList= ruleAssignList EOF ;
    public final EObject entryRuleAssignList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignList = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:797:2: (iv_ruleAssignList= ruleAssignList EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:798:2: iv_ruleAssignList= ruleAssignList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignListRule()); 
            }
            pushFollow(FOLLOW_ruleAssignList_in_entryRuleAssignList1570);
            iv_ruleAssignList=ruleAssignList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignList1580); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAssignList"


    // $ANTLR start "ruleAssignList"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:805:1: ruleAssignList returns [EObject current=null] : ( ( (lv_assigns_0_0= ruleAssign ) ) (otherlv_1= ',' ( (lv_assigns_2_0= ruleAssign ) ) )* ) ;
    public final EObject ruleAssignList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_assigns_0_0 = null;

        EObject lv_assigns_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:808:28: ( ( ( (lv_assigns_0_0= ruleAssign ) ) (otherlv_1= ',' ( (lv_assigns_2_0= ruleAssign ) ) )* ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:809:1: ( ( (lv_assigns_0_0= ruleAssign ) ) (otherlv_1= ',' ( (lv_assigns_2_0= ruleAssign ) ) )* )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:809:1: ( ( (lv_assigns_0_0= ruleAssign ) ) (otherlv_1= ',' ( (lv_assigns_2_0= ruleAssign ) ) )* )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:809:2: ( (lv_assigns_0_0= ruleAssign ) ) (otherlv_1= ',' ( (lv_assigns_2_0= ruleAssign ) ) )*
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:809:2: ( (lv_assigns_0_0= ruleAssign ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:810:1: (lv_assigns_0_0= ruleAssign )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:810:1: (lv_assigns_0_0= ruleAssign )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:811:3: lv_assigns_0_0= ruleAssign
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssignListAccess().getAssignsAssignParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAssign_in_ruleAssignList1626);
            lv_assigns_0_0=ruleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAssignListRule());
              	        }
                     		add(
                     			current, 
                     			"assigns",
                      		lv_assigns_0_0, 
                      		"Assign");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:827:2: (otherlv_1= ',' ( (lv_assigns_2_0= ruleAssign ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==30) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:827:4: otherlv_1= ',' ( (lv_assigns_2_0= ruleAssign ) )
            	    {
            	    otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleAssignList1639); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getAssignListAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:831:1: ( (lv_assigns_2_0= ruleAssign ) )
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:832:1: (lv_assigns_2_0= ruleAssign )
            	    {
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:832:1: (lv_assigns_2_0= ruleAssign )
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:833:3: lv_assigns_2_0= ruleAssign
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssignListAccess().getAssignsAssignParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAssign_in_ruleAssignList1660);
            	    lv_assigns_2_0=ruleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAssignListRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"assigns",
            	              		lv_assigns_2_0, 
            	              		"Assign");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

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

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAssignList"


    // $ANTLR start "entryRuleCompositionHeader"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:857:1: entryRuleCompositionHeader returns [EObject current=null] : iv_ruleCompositionHeader= ruleCompositionHeader EOF ;
    public final EObject entryRuleCompositionHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositionHeader = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:858:2: (iv_ruleCompositionHeader= ruleCompositionHeader EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:859:2: iv_ruleCompositionHeader= ruleCompositionHeader EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompositionHeaderRule()); 
            }
            pushFollow(FOLLOW_ruleCompositionHeader_in_entryRuleCompositionHeader1698);
            iv_ruleCompositionHeader=ruleCompositionHeader();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompositionHeader; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompositionHeader1708); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCompositionHeader"


    // $ANTLR start "ruleCompositionHeader"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:866:1: ruleCompositionHeader returns [EObject current=null] : ( ( (lv_name_0_0= 'HEADER' ) ) ( (lv_assigns_1_0= ruleAssign ) )* ( ( 'END' )=>otherlv_2= 'END' ) ) ;
    public final EObject ruleCompositionHeader() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        EObject lv_assigns_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:869:28: ( ( ( (lv_name_0_0= 'HEADER' ) ) ( (lv_assigns_1_0= ruleAssign ) )* ( ( 'END' )=>otherlv_2= 'END' ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:870:1: ( ( (lv_name_0_0= 'HEADER' ) ) ( (lv_assigns_1_0= ruleAssign ) )* ( ( 'END' )=>otherlv_2= 'END' ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:870:1: ( ( (lv_name_0_0= 'HEADER' ) ) ( (lv_assigns_1_0= ruleAssign ) )* ( ( 'END' )=>otherlv_2= 'END' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:870:2: ( (lv_name_0_0= 'HEADER' ) ) ( (lv_assigns_1_0= ruleAssign ) )* ( ( 'END' )=>otherlv_2= 'END' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:870:2: ( (lv_name_0_0= 'HEADER' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:871:1: (lv_name_0_0= 'HEADER' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:871:1: (lv_name_0_0= 'HEADER' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:872:3: lv_name_0_0= 'HEADER'
            {
            lv_name_0_0=(Token)match(input,32,FOLLOW_32_in_ruleCompositionHeader1751); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_name_0_0, grammarAccess.getCompositionHeaderAccess().getNameHEADERKeyword_0_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getCompositionHeaderRule());
              	        }
                     		setWithLastConsumed(current, "name", lv_name_0_0, "HEADER");
              	    
            }

            }


            }

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:885:2: ( (lv_assigns_1_0= ruleAssign ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:886:1: (lv_assigns_1_0= ruleAssign )
            	    {
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:886:1: (lv_assigns_1_0= ruleAssign )
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:887:3: lv_assigns_1_0= ruleAssign
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCompositionHeaderAccess().getAssignsAssignParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAssign_in_ruleCompositionHeader1785);
            	    lv_assigns_1_0=ruleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getCompositionHeaderRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"assigns",
            	              		lv_assigns_1_0, 
            	              		"Assign");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:903:3: ( ( 'END' )=>otherlv_2= 'END' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:903:4: ( 'END' )=>otherlv_2= 'END'
            {
            otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleCompositionHeader1806); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCompositionHeaderAccess().getENDKeyword_2());
                  
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleCompositionHeader"


    // $ANTLR start "entryRuleContractInstance"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:916:1: entryRuleContractInstance returns [EObject current=null] : iv_ruleContractInstance= ruleContractInstance EOF ;
    public final EObject entryRuleContractInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContractInstance = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:917:2: (iv_ruleContractInstance= ruleContractInstance EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:918:2: iv_ruleContractInstance= ruleContractInstance EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContractInstanceRule()); 
            }
            pushFollow(FOLLOW_ruleContractInstance_in_entryRuleContractInstance1843);
            iv_ruleContractInstance=ruleContractInstance();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContractInstance; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleContractInstance1853); if (state.failed) return current;

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
    // $ANTLR end "entryRuleContractInstance"


    // $ANTLR start "ruleContractInstance"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:925:1: ruleContractInstance returns [EObject current=null] : ( ( (lv_sec_name_0_0= 'INSTANCE' ) ) (this_ID_1= RULE_ID otherlv_2= ':' )? ( (lv_vals_3_0= ruleValue ) ) otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' ( (lv_assigns_7_0= ruleAssign ) )* ( ( 'END' )=>otherlv_8= 'END' ) ) ;
    public final EObject ruleContractInstance() throws RecognitionException {
        EObject current = null;

        Token lv_sec_name_0_0=null;
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
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:928:28: ( ( ( (lv_sec_name_0_0= 'INSTANCE' ) ) (this_ID_1= RULE_ID otherlv_2= ':' )? ( (lv_vals_3_0= ruleValue ) ) otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' ( (lv_assigns_7_0= ruleAssign ) )* ( ( 'END' )=>otherlv_8= 'END' ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:929:1: ( ( (lv_sec_name_0_0= 'INSTANCE' ) ) (this_ID_1= RULE_ID otherlv_2= ':' )? ( (lv_vals_3_0= ruleValue ) ) otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' ( (lv_assigns_7_0= ruleAssign ) )* ( ( 'END' )=>otherlv_8= 'END' ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:929:1: ( ( (lv_sec_name_0_0= 'INSTANCE' ) ) (this_ID_1= RULE_ID otherlv_2= ':' )? ( (lv_vals_3_0= ruleValue ) ) otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' ( (lv_assigns_7_0= ruleAssign ) )* ( ( 'END' )=>otherlv_8= 'END' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:929:2: ( (lv_sec_name_0_0= 'INSTANCE' ) ) (this_ID_1= RULE_ID otherlv_2= ':' )? ( (lv_vals_3_0= ruleValue ) ) otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' ( (lv_assigns_7_0= ruleAssign ) )* ( ( 'END' )=>otherlv_8= 'END' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:929:2: ( (lv_sec_name_0_0= 'INSTANCE' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:930:1: (lv_sec_name_0_0= 'INSTANCE' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:930:1: (lv_sec_name_0_0= 'INSTANCE' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:931:3: lv_sec_name_0_0= 'INSTANCE'
            {
            lv_sec_name_0_0=(Token)match(input,34,FOLLOW_34_in_ruleContractInstance1896); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_sec_name_0_0, grammarAccess.getContractInstanceAccess().getSec_nameINSTANCEKeyword_0_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getContractInstanceRule());
              	        }
                     		setWithLastConsumed(current, "sec_name", lv_sec_name_0_0, "INSTANCE");
              	    
            }

            }


            }

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:944:2: (this_ID_1= RULE_ID otherlv_2= ':' )?
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
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:944:3: this_ID_1= RULE_ID otherlv_2= ':'
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContractInstance1921); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_1, grammarAccess.getContractInstanceAccess().getIDTerminalRuleCall_1_0()); 
                          
                    }
                    otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleContractInstance1932); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getContractInstanceAccess().getColonKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:952:3: ( (lv_vals_3_0= ruleValue ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:953:1: (lv_vals_3_0= ruleValue )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:953:1: (lv_vals_3_0= ruleValue )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:954:3: lv_vals_3_0= ruleValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getContractInstanceAccess().getValsValueParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValue_in_ruleContractInstance1955);
            lv_vals_3_0=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getContractInstanceRule());
              	        }
                     		add(
                     			current, 
                     			"vals",
                      		lv_vals_3_0, 
                      		"Value");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,36,FOLLOW_36_in_ruleContractInstance1967); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getContractInstanceAccess().getLeftParenthesisKeyword_3());
                  
            }
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:974:1: ( (otherlv_5= RULE_ID ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:975:1: (otherlv_5= RULE_ID )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:975:1: (otherlv_5= RULE_ID )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:976:3: otherlv_5= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getContractInstanceRule());
              	        }
                      
            }
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContractInstance1987); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_5, grammarAccess.getContractInstanceAccess().getVarsValueCrossReference_4_0()); 
              	
            }

            }


            }

            otherlv_6=(Token)match(input,37,FOLLOW_37_in_ruleContractInstance1999); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getContractInstanceAccess().getRightParenthesisKeyword_5());
                  
            }
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:991:1: ( (lv_assigns_7_0= ruleAssign ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:992:1: (lv_assigns_7_0= ruleAssign )
            	    {
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:992:1: (lv_assigns_7_0= ruleAssign )
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:993:3: lv_assigns_7_0= ruleAssign
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getContractInstanceAccess().getAssignsAssignParserRuleCall_6_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAssign_in_ruleContractInstance2020);
            	    lv_assigns_7_0=ruleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getContractInstanceRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"assigns",
            	              		lv_assigns_7_0, 
            	              		"Assign");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1009:3: ( ( 'END' )=>otherlv_8= 'END' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1009:4: ( 'END' )=>otherlv_8= 'END'
            {
            otherlv_8=(Token)match(input,33,FOLLOW_33_in_ruleContractInstance2041); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getContractInstanceAccess().getENDKeyword_7());
                  
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleContractInstance"


    // $ANTLR start "entryRuleFieldDecl"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1022:1: entryRuleFieldDecl returns [EObject current=null] : iv_ruleFieldDecl= ruleFieldDecl EOF ;
    public final EObject entryRuleFieldDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldDecl = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1023:2: (iv_ruleFieldDecl= ruleFieldDecl EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1024:2: iv_ruleFieldDecl= ruleFieldDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFieldDeclRule()); 
            }
            pushFollow(FOLLOW_ruleFieldDecl_in_entryRuleFieldDecl2078);
            iv_ruleFieldDecl=ruleFieldDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFieldDecl; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldDecl2088); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFieldDecl"


    // $ANTLR start "ruleFieldDecl"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1031:1: ruleFieldDecl returns [EObject current=null] : (otherlv_0= 'FIELD' ( (lv_name_1_0= RULE_ID ) ) ( (lv_input_ops_2_0= ruleInputOptions ) )? otherlv_3= ';' ) ;
    public final EObject ruleFieldDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_input_ops_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1034:28: ( (otherlv_0= 'FIELD' ( (lv_name_1_0= RULE_ID ) ) ( (lv_input_ops_2_0= ruleInputOptions ) )? otherlv_3= ';' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1035:1: (otherlv_0= 'FIELD' ( (lv_name_1_0= RULE_ID ) ) ( (lv_input_ops_2_0= ruleInputOptions ) )? otherlv_3= ';' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1035:1: (otherlv_0= 'FIELD' ( (lv_name_1_0= RULE_ID ) ) ( (lv_input_ops_2_0= ruleInputOptions ) )? otherlv_3= ';' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1035:3: otherlv_0= 'FIELD' ( (lv_name_1_0= RULE_ID ) ) ( (lv_input_ops_2_0= ruleInputOptions ) )? otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleFieldDecl2125); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFieldDeclAccess().getFIELDKeyword_0());
                  
            }
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1039:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1040:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1040:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1041:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFieldDecl2142); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getFieldDeclAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFieldDeclRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1057:2: ( (lv_input_ops_2_0= ruleInputOptions ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==35) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1058:1: (lv_input_ops_2_0= ruleInputOptions )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1058:1: (lv_input_ops_2_0= ruleInputOptions )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1059:3: lv_input_ops_2_0= ruleInputOptions
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFieldDeclAccess().getInput_opsInputOptionsParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleInputOptions_in_ruleFieldDecl2168);
                    lv_input_ops_2_0=ruleInputOptions();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFieldDeclRule());
                      	        }
                             		set(
                             			current, 
                             			"input_ops",
                              		lv_input_ops_2_0, 
                              		"InputOptions");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleFieldDecl2181); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getFieldDeclAccess().getSemicolonKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleFieldDecl"


    // $ANTLR start "entryRuleEnumDecl"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1087:1: entryRuleEnumDecl returns [EObject current=null] : iv_ruleEnumDecl= ruleEnumDecl EOF ;
    public final EObject entryRuleEnumDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumDecl = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1088:2: (iv_ruleEnumDecl= ruleEnumDecl EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1089:2: iv_ruleEnumDecl= ruleEnumDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumDeclRule()); 
            }
            pushFollow(FOLLOW_ruleEnumDecl_in_entryRuleEnumDecl2217);
            iv_ruleEnumDecl=ruleEnumDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumDecl; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumDecl2227); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEnumDecl"


    // $ANTLR start "ruleEnumDecl"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1096:1: ruleEnumDecl returns [EObject current=null] : ( ( (lv_enum_dec_0_0= 'ENUM' ) ) otherlv_1= '(' ( ( (lv_vals_2_0= ruleValueList ) ) | ( (lv_assigns_3_0= ruleAssignList ) ) ) otherlv_4= ')' ) ;
    public final EObject ruleEnumDecl() throws RecognitionException {
        EObject current = null;

        Token lv_enum_dec_0_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_vals_2_0 = null;

        EObject lv_assigns_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1099:28: ( ( ( (lv_enum_dec_0_0= 'ENUM' ) ) otherlv_1= '(' ( ( (lv_vals_2_0= ruleValueList ) ) | ( (lv_assigns_3_0= ruleAssignList ) ) ) otherlv_4= ')' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1100:1: ( ( (lv_enum_dec_0_0= 'ENUM' ) ) otherlv_1= '(' ( ( (lv_vals_2_0= ruleValueList ) ) | ( (lv_assigns_3_0= ruleAssignList ) ) ) otherlv_4= ')' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1100:1: ( ( (lv_enum_dec_0_0= 'ENUM' ) ) otherlv_1= '(' ( ( (lv_vals_2_0= ruleValueList ) ) | ( (lv_assigns_3_0= ruleAssignList ) ) ) otherlv_4= ')' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1100:2: ( (lv_enum_dec_0_0= 'ENUM' ) ) otherlv_1= '(' ( ( (lv_vals_2_0= ruleValueList ) ) | ( (lv_assigns_3_0= ruleAssignList ) ) ) otherlv_4= ')'
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1100:2: ( (lv_enum_dec_0_0= 'ENUM' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1101:1: (lv_enum_dec_0_0= 'ENUM' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1101:1: (lv_enum_dec_0_0= 'ENUM' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1102:3: lv_enum_dec_0_0= 'ENUM'
            {
            lv_enum_dec_0_0=(Token)match(input,39,FOLLOW_39_in_ruleEnumDecl2270); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_enum_dec_0_0, grammarAccess.getEnumDeclAccess().getEnum_decENUMKeyword_0_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEnumDeclRule());
              	        }
                     		setWithLastConsumed(current, "enum_dec", lv_enum_dec_0_0, "ENUM");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleEnumDecl2295); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEnumDeclAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1119:1: ( ( (lv_vals_2_0= ruleValueList ) ) | ( (lv_assigns_3_0= ruleAssignList ) ) )
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
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA21_0>=RULE_INT && LA21_0<=RULE_STRING)) ) {
                alt21=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1119:2: ( (lv_vals_2_0= ruleValueList ) )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1119:2: ( (lv_vals_2_0= ruleValueList ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1120:1: (lv_vals_2_0= ruleValueList )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1120:1: (lv_vals_2_0= ruleValueList )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1121:3: lv_vals_2_0= ruleValueList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEnumDeclAccess().getValsValueListParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValueList_in_ruleEnumDecl2317);
                    lv_vals_2_0=ruleValueList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEnumDeclRule());
                      	        }
                             		add(
                             			current, 
                             			"vals",
                              		lv_vals_2_0, 
                              		"ValueList");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1138:6: ( (lv_assigns_3_0= ruleAssignList ) )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1138:6: ( (lv_assigns_3_0= ruleAssignList ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1139:1: (lv_assigns_3_0= ruleAssignList )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1139:1: (lv_assigns_3_0= ruleAssignList )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1140:3: lv_assigns_3_0= ruleAssignList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEnumDeclAccess().getAssignsAssignListParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAssignList_in_ruleEnumDecl2344);
                    lv_assigns_3_0=ruleAssignList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEnumDeclRule());
                      	        }
                             		add(
                             			current, 
                             			"assigns",
                              		lv_assigns_3_0, 
                              		"AssignList");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,37,FOLLOW_37_in_ruleEnumDecl2357); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getEnumDeclAccess().getRightParenthesisKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleEnumDecl"


    // $ANTLR start "entryRuleInputSection"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1168:1: entryRuleInputSection returns [EObject current=null] : iv_ruleInputSection= ruleInputSection EOF ;
    public final EObject entryRuleInputSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputSection = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1169:2: (iv_ruleInputSection= ruleInputSection EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1170:2: iv_ruleInputSection= ruleInputSection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInputSectionRule()); 
            }
            pushFollow(FOLLOW_ruleInputSection_in_entryRuleInputSection2393);
            iv_ruleInputSection=ruleInputSection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInputSection; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInputSection2403); if (state.failed) return current;

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1177:1: ruleInputSection returns [EObject current=null] : ( ( (lv_name_0_0= 'INPUTS' ) ) ( (lv_inputs_1_0= ruleInputValue ) )+ ( ( 'END' )=>otherlv_2= 'END' ) ) ;
    public final EObject ruleInputSection() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        EObject lv_inputs_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1180:28: ( ( ( (lv_name_0_0= 'INPUTS' ) ) ( (lv_inputs_1_0= ruleInputValue ) )+ ( ( 'END' )=>otherlv_2= 'END' ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1181:1: ( ( (lv_name_0_0= 'INPUTS' ) ) ( (lv_inputs_1_0= ruleInputValue ) )+ ( ( 'END' )=>otherlv_2= 'END' ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1181:1: ( ( (lv_name_0_0= 'INPUTS' ) ) ( (lv_inputs_1_0= ruleInputValue ) )+ ( ( 'END' )=>otherlv_2= 'END' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1181:2: ( (lv_name_0_0= 'INPUTS' ) ) ( (lv_inputs_1_0= ruleInputValue ) )+ ( ( 'END' )=>otherlv_2= 'END' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1181:2: ( (lv_name_0_0= 'INPUTS' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1182:1: (lv_name_0_0= 'INPUTS' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1182:1: (lv_name_0_0= 'INPUTS' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1183:3: lv_name_0_0= 'INPUTS'
            {
            lv_name_0_0=(Token)match(input,40,FOLLOW_40_in_ruleInputSection2446); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_name_0_0, grammarAccess.getInputSectionAccess().getNameINPUTSKeyword_0_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getInputSectionRule());
              	        }
                     		setWithLastConsumed(current, "name", lv_name_0_0, "INPUTS");
              	    
            }

            }


            }

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1196:2: ( (lv_inputs_1_0= ruleInputValue ) )+
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
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1197:1: (lv_inputs_1_0= ruleInputValue )
            	    {
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1197:1: (lv_inputs_1_0= ruleInputValue )
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1198:3: lv_inputs_1_0= ruleInputValue
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getInputSectionAccess().getInputsInputValueParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleInputValue_in_ruleInputSection2480);
            	    lv_inputs_1_0=ruleInputValue();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getInputSectionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"inputs",
            	              		lv_inputs_1_0, 
            	              		"InputValue");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1214:3: ( ( 'END' )=>otherlv_2= 'END' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1214:4: ( 'END' )=>otherlv_2= 'END'
            {
            otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleInputSection2501); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getInputSectionAccess().getENDKeyword_2());
                  
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleInputSection"


    // $ANTLR start "entryRuleBool"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1227:1: entryRuleBool returns [EObject current=null] : iv_ruleBool= ruleBool EOF ;
    public final EObject entryRuleBool() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBool = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1228:2: (iv_ruleBool= ruleBool EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1229:2: iv_ruleBool= ruleBool EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolRule()); 
            }
            pushFollow(FOLLOW_ruleBool_in_entryRuleBool2538);
            iv_ruleBool=ruleBool();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBool; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBool2548); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBool"


    // $ANTLR start "ruleBool"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1236:1: ruleBool returns [EObject current=null] : (otherlv_0= 'BOOL' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleBool() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1239:28: ( (otherlv_0= 'BOOL' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1240:1: (otherlv_0= 'BOOL' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1240:1: (otherlv_0= 'BOOL' ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1240:3: otherlv_0= 'BOOL' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,41,FOLLOW_41_in_ruleBool2585); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getBoolAccess().getBOOLKeyword_0());
                  
            }
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1244:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1245:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1245:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1246:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBool2602); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getBoolAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

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


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleBool"


    // $ANTLR start "entryRuleIntVar"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1270:1: entryRuleIntVar returns [EObject current=null] : iv_ruleIntVar= ruleIntVar EOF ;
    public final EObject entryRuleIntVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntVar = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1271:2: (iv_ruleIntVar= ruleIntVar EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1272:2: iv_ruleIntVar= ruleIntVar EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntVarRule()); 
            }
            pushFollow(FOLLOW_ruleIntVar_in_entryRuleIntVar2643);
            iv_ruleIntVar=ruleIntVar();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntVar; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntVar2653); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIntVar"


    // $ANTLR start "ruleIntVar"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1279:1: ruleIntVar returns [EObject current=null] : (otherlv_0= 'INT' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleIntVar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1282:28: ( (otherlv_0= 'INT' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1283:1: (otherlv_0= 'INT' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1283:1: (otherlv_0= 'INT' ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1283:3: otherlv_0= 'INT' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleIntVar2690); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIntVarAccess().getINTKeyword_0());
                  
            }
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1287:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1288:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1288:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1289:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIntVar2707); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getIntVarAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getIntVarRule());
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


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleIntVar"


    // $ANTLR start "entryRuleStringVar"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1313:1: entryRuleStringVar returns [EObject current=null] : iv_ruleStringVar= ruleStringVar EOF ;
    public final EObject entryRuleStringVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringVar = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1314:2: (iv_ruleStringVar= ruleStringVar EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1315:2: iv_ruleStringVar= ruleStringVar EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringVarRule()); 
            }
            pushFollow(FOLLOW_ruleStringVar_in_entryRuleStringVar2748);
            iv_ruleStringVar=ruleStringVar();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringVar; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringVar2758); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStringVar"


    // $ANTLR start "ruleStringVar"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1322:1: ruleStringVar returns [EObject current=null] : (otherlv_0= 'STRING' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleStringVar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1325:28: ( (otherlv_0= 'STRING' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1326:1: (otherlv_0= 'STRING' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1326:1: (otherlv_0= 'STRING' ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1326:3: otherlv_0= 'STRING' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_43_in_ruleStringVar2795); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getStringVarAccess().getSTRINGKeyword_0());
                  
            }
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1330:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1331:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1331:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1332:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStringVar2812); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getStringVarAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getStringVarRule());
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


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleStringVar"


    // $ANTLR start "entryRuleRecord"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1356:1: entryRuleRecord returns [EObject current=null] : iv_ruleRecord= ruleRecord EOF ;
    public final EObject entryRuleRecord() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecord = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1357:2: (iv_ruleRecord= ruleRecord EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1358:2: iv_ruleRecord= ruleRecord EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRecordRule()); 
            }
            pushFollow(FOLLOW_ruleRecord_in_entryRuleRecord2853);
            iv_ruleRecord=ruleRecord();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRecord; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRecord2863); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRecord"


    // $ANTLR start "ruleRecord"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1365:1: ruleRecord returns [EObject current=null] : (otherlv_0= 'RECORD' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleRecord() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1368:28: ( (otherlv_0= 'RECORD' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1369:1: (otherlv_0= 'RECORD' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1369:1: (otherlv_0= 'RECORD' ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1369:3: otherlv_0= 'RECORD' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,44,FOLLOW_44_in_ruleRecord2900); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getRecordAccess().getRECORDKeyword_0());
                  
            }
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1373:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1374:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1374:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1375:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRecord2917); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getRecordAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

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


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleRecord"


    // $ANTLR start "entryRuleDataset"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1399:1: entryRuleDataset returns [EObject current=null] : iv_ruleDataset= ruleDataset EOF ;
    public final EObject entryRuleDataset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataset = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1400:2: (iv_ruleDataset= ruleDataset EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1401:2: iv_ruleDataset= ruleDataset EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDatasetRule()); 
            }
            pushFollow(FOLLOW_ruleDataset_in_entryRuleDataset2958);
            iv_ruleDataset=ruleDataset();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDataset; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataset2968); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDataset"


    // $ANTLR start "ruleDataset"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1408:1: ruleDataset returns [EObject current=null] : (otherlv_0= 'DATASET' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDataset() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1411:28: ( (otherlv_0= 'DATASET' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1412:1: (otherlv_0= 'DATASET' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1412:1: (otherlv_0= 'DATASET' ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1412:3: otherlv_0= 'DATASET' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleDataset3005); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDatasetAccess().getDATASETKeyword_0());
                  
            }
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1416:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1417:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1417:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1418:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataset3022); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getDatasetAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

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


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleDataset"


    // $ANTLR start "entryRuleGroup"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1442:1: entryRuleGroup returns [EObject current=null] : iv_ruleGroup= ruleGroup EOF ;
    public final EObject entryRuleGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroup = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1443:2: (iv_ruleGroup= ruleGroup EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1444:2: iv_ruleGroup= ruleGroup EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGroupRule()); 
            }
            pushFollow(FOLLOW_ruleGroup_in_entryRuleGroup3063);
            iv_ruleGroup=ruleGroup();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGroup; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGroup3073); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGroup"


    // $ANTLR start "ruleGroup"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1451:1: ruleGroup returns [EObject current=null] : (otherlv_0= 'GROUP' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1454:28: ( (otherlv_0= 'GROUP' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1455:1: (otherlv_0= 'GROUP' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1455:1: (otherlv_0= 'GROUP' ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1455:3: otherlv_0= 'GROUP' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,46,FOLLOW_46_in_ruleGroup3110); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getGroupAccess().getGROUPKeyword_0());
                  
            }
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1459:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1460:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1460:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1461:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGroup3127); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getGroupAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

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


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleGroup"


    // $ANTLR start "entryRuleInputValue"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1487:1: entryRuleInputValue returns [EObject current=null] : iv_ruleInputValue= ruleInputValue EOF ;
    public final EObject entryRuleInputValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputValue = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1488:2: (iv_ruleInputValue= ruleInputValue EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1489:2: iv_ruleInputValue= ruleInputValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInputValueRule()); 
            }
            pushFollow(FOLLOW_ruleInputValue_in_entryRuleInputValue3170);
            iv_ruleInputValue=ruleInputValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInputValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInputValue3180); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInputValue"


    // $ANTLR start "ruleInputValue"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1496:1: ruleInputValue returns [EObject current=null] : ( ( (this_Bool_0= ruleBool | this_IntVar_1= ruleIntVar | this_StringVar_2= ruleStringVar | this_Record_3= ruleRecord | this_Dataset_4= ruleDataset | this_EnumDecl_5= ruleEnumDecl ) ( (lv_input_op_list_6_0= ruleInputOptions ) )? otherlv_7= ';' ) | (this_Dataset_8= ruleDataset ( (lv_input_op_list_9_0= ruleInputOptions ) )? ( (lv_fields_10_0= ruleFieldDecl ) )* ( ( 'END' )=>otherlv_11= 'END' ) ) | (this_Group_12= ruleGroup ( (lv_input_op_list_13_0= ruleInputOptions ) )? ( (lv_vals_14_0= ruleInputValue ) )* ( ( 'END' )=>otherlv_15= 'END' ) ) ) ;
    public final EObject ruleInputValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_7=null;
        Token otherlv_11=null;
        Token otherlv_15=null;
        EObject this_Bool_0 = null;

        EObject this_IntVar_1 = null;

        EObject this_StringVar_2 = null;

        EObject this_Record_3 = null;

        EObject this_Dataset_4 = null;

        EObject this_EnumDecl_5 = null;

        EObject lv_input_op_list_6_0 = null;

        EObject this_Dataset_8 = null;

        EObject lv_input_op_list_9_0 = null;

        EObject lv_fields_10_0 = null;

        EObject this_Group_12 = null;

        EObject lv_input_op_list_13_0 = null;

        EObject lv_vals_14_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1499:28: ( ( ( (this_Bool_0= ruleBool | this_IntVar_1= ruleIntVar | this_StringVar_2= ruleStringVar | this_Record_3= ruleRecord | this_Dataset_4= ruleDataset | this_EnumDecl_5= ruleEnumDecl ) ( (lv_input_op_list_6_0= ruleInputOptions ) )? otherlv_7= ';' ) | (this_Dataset_8= ruleDataset ( (lv_input_op_list_9_0= ruleInputOptions ) )? ( (lv_fields_10_0= ruleFieldDecl ) )* ( ( 'END' )=>otherlv_11= 'END' ) ) | (this_Group_12= ruleGroup ( (lv_input_op_list_13_0= ruleInputOptions ) )? ( (lv_vals_14_0= ruleInputValue ) )* ( ( 'END' )=>otherlv_15= 'END' ) ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1500:1: ( ( (this_Bool_0= ruleBool | this_IntVar_1= ruleIntVar | this_StringVar_2= ruleStringVar | this_Record_3= ruleRecord | this_Dataset_4= ruleDataset | this_EnumDecl_5= ruleEnumDecl ) ( (lv_input_op_list_6_0= ruleInputOptions ) )? otherlv_7= ';' ) | (this_Dataset_8= ruleDataset ( (lv_input_op_list_9_0= ruleInputOptions ) )? ( (lv_fields_10_0= ruleFieldDecl ) )* ( ( 'END' )=>otherlv_11= 'END' ) ) | (this_Group_12= ruleGroup ( (lv_input_op_list_13_0= ruleInputOptions ) )? ( (lv_vals_14_0= ruleInputValue ) )* ( ( 'END' )=>otherlv_15= 'END' ) ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1500:1: ( ( (this_Bool_0= ruleBool | this_IntVar_1= ruleIntVar | this_StringVar_2= ruleStringVar | this_Record_3= ruleRecord | this_Dataset_4= ruleDataset | this_EnumDecl_5= ruleEnumDecl ) ( (lv_input_op_list_6_0= ruleInputOptions ) )? otherlv_7= ';' ) | (this_Dataset_8= ruleDataset ( (lv_input_op_list_9_0= ruleInputOptions ) )? ( (lv_fields_10_0= ruleFieldDecl ) )* ( ( 'END' )=>otherlv_11= 'END' ) ) | (this_Group_12= ruleGroup ( (lv_input_op_list_13_0= ruleInputOptions ) )? ( (lv_vals_14_0= ruleInputValue ) )* ( ( 'END' )=>otherlv_15= 'END' ) ) )
            int alt29=3;
            alt29 = dfa29.predict(input);
            switch (alt29) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1500:2: ( (this_Bool_0= ruleBool | this_IntVar_1= ruleIntVar | this_StringVar_2= ruleStringVar | this_Record_3= ruleRecord | this_Dataset_4= ruleDataset | this_EnumDecl_5= ruleEnumDecl ) ( (lv_input_op_list_6_0= ruleInputOptions ) )? otherlv_7= ';' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1500:2: ( (this_Bool_0= ruleBool | this_IntVar_1= ruleIntVar | this_StringVar_2= ruleStringVar | this_Record_3= ruleRecord | this_Dataset_4= ruleDataset | this_EnumDecl_5= ruleEnumDecl ) ( (lv_input_op_list_6_0= ruleInputOptions ) )? otherlv_7= ';' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1500:3: (this_Bool_0= ruleBool | this_IntVar_1= ruleIntVar | this_StringVar_2= ruleStringVar | this_Record_3= ruleRecord | this_Dataset_4= ruleDataset | this_EnumDecl_5= ruleEnumDecl ) ( (lv_input_op_list_6_0= ruleInputOptions ) )? otherlv_7= ';'
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1500:3: (this_Bool_0= ruleBool | this_IntVar_1= ruleIntVar | this_StringVar_2= ruleStringVar | this_Record_3= ruleRecord | this_Dataset_4= ruleDataset | this_EnumDecl_5= ruleEnumDecl )
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
                    case 43:
                        {
                        alt23=3;
                        }
                        break;
                    case 44:
                        {
                        alt23=4;
                        }
                        break;
                    case 45:
                        {
                        alt23=5;
                        }
                        break;
                    case 39:
                        {
                        alt23=6;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 0, input);

                        throw nvae;
                    }

                    switch (alt23) {
                        case 1 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1501:5: this_Bool_0= ruleBool
                            {
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getInputValueAccess().getBoolParserRuleCall_0_0_0()); 
                                  
                            }
                            pushFollow(FOLLOW_ruleBool_in_ruleInputValue3229);
                            this_Bool_0=ruleBool();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                      current = this_Bool_0; 
                                      afterParserOrEnumRuleCall();
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1511:5: this_IntVar_1= ruleIntVar
                            {
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getInputValueAccess().getIntVarParserRuleCall_0_0_1()); 
                                  
                            }
                            pushFollow(FOLLOW_ruleIntVar_in_ruleInputValue3256);
                            this_IntVar_1=ruleIntVar();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                      current = this_IntVar_1; 
                                      afterParserOrEnumRuleCall();
                                  
                            }

                            }
                            break;
                        case 3 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1521:5: this_StringVar_2= ruleStringVar
                            {
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getInputValueAccess().getStringVarParserRuleCall_0_0_2()); 
                                  
                            }
                            pushFollow(FOLLOW_ruleStringVar_in_ruleInputValue3283);
                            this_StringVar_2=ruleStringVar();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                      current = this_StringVar_2; 
                                      afterParserOrEnumRuleCall();
                                  
                            }

                            }
                            break;
                        case 4 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1531:5: this_Record_3= ruleRecord
                            {
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getInputValueAccess().getRecordParserRuleCall_0_0_3()); 
                                  
                            }
                            pushFollow(FOLLOW_ruleRecord_in_ruleInputValue3310);
                            this_Record_3=ruleRecord();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                      current = this_Record_3; 
                                      afterParserOrEnumRuleCall();
                                  
                            }

                            }
                            break;
                        case 5 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1541:5: this_Dataset_4= ruleDataset
                            {
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getInputValueAccess().getDatasetParserRuleCall_0_0_4()); 
                                  
                            }
                            pushFollow(FOLLOW_ruleDataset_in_ruleInputValue3337);
                            this_Dataset_4=ruleDataset();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                      current = this_Dataset_4; 
                                      afterParserOrEnumRuleCall();
                                  
                            }

                            }
                            break;
                        case 6 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1551:5: this_EnumDecl_5= ruleEnumDecl
                            {
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getInputValueAccess().getEnumDeclParserRuleCall_0_0_5()); 
                                  
                            }
                            pushFollow(FOLLOW_ruleEnumDecl_in_ruleInputValue3364);
                            this_EnumDecl_5=ruleEnumDecl();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                      current = this_EnumDecl_5; 
                                      afterParserOrEnumRuleCall();
                                  
                            }

                            }
                            break;

                    }

                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1559:2: ( (lv_input_op_list_6_0= ruleInputOptions ) )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==35) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1560:1: (lv_input_op_list_6_0= ruleInputOptions )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1560:1: (lv_input_op_list_6_0= ruleInputOptions )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1561:3: lv_input_op_list_6_0= ruleInputOptions
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getInputValueAccess().getInput_op_listInputOptionsParserRuleCall_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleInputOptions_in_ruleInputValue3385);
                            lv_input_op_list_6_0=ruleInputOptions();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getInputValueRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"input_op_list",
                                      		lv_input_op_list_6_0, 
                                      		"InputOptions");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }

                    otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleInputValue3398); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getInputValueAccess().getSemicolonKeyword_0_2());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1582:6: (this_Dataset_8= ruleDataset ( (lv_input_op_list_9_0= ruleInputOptions ) )? ( (lv_fields_10_0= ruleFieldDecl ) )* ( ( 'END' )=>otherlv_11= 'END' ) )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1582:6: (this_Dataset_8= ruleDataset ( (lv_input_op_list_9_0= ruleInputOptions ) )? ( (lv_fields_10_0= ruleFieldDecl ) )* ( ( 'END' )=>otherlv_11= 'END' ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1583:5: this_Dataset_8= ruleDataset ( (lv_input_op_list_9_0= ruleInputOptions ) )? ( (lv_fields_10_0= ruleFieldDecl ) )* ( ( 'END' )=>otherlv_11= 'END' )
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInputValueAccess().getDatasetParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDataset_in_ruleInputValue3428);
                    this_Dataset_8=ruleDataset();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Dataset_8; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1591:1: ( (lv_input_op_list_9_0= ruleInputOptions ) )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==35) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1592:1: (lv_input_op_list_9_0= ruleInputOptions )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1592:1: (lv_input_op_list_9_0= ruleInputOptions )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1593:3: lv_input_op_list_9_0= ruleInputOptions
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getInputValueAccess().getInput_op_listInputOptionsParserRuleCall_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleInputOptions_in_ruleInputValue3448);
                            lv_input_op_list_9_0=ruleInputOptions();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getInputValueRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"input_op_list",
                                      		lv_input_op_list_9_0, 
                                      		"InputOptions");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }

                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1609:3: ( (lv_fields_10_0= ruleFieldDecl ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==38) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1610:1: (lv_fields_10_0= ruleFieldDecl )
                    	    {
                    	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1610:1: (lv_fields_10_0= ruleFieldDecl )
                    	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1611:3: lv_fields_10_0= ruleFieldDecl
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getInputValueAccess().getFieldsFieldDeclParserRuleCall_1_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleFieldDecl_in_ruleInputValue3470);
                    	    lv_fields_10_0=ruleFieldDecl();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getInputValueRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"fields",
                    	              		lv_fields_10_0, 
                    	              		"FieldDecl");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1627:3: ( ( 'END' )=>otherlv_11= 'END' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1627:4: ( 'END' )=>otherlv_11= 'END'
                    {
                    otherlv_11=(Token)match(input,33,FOLLOW_33_in_ruleInputValue3491); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getInputValueAccess().getENDKeyword_1_3());
                          
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1633:6: (this_Group_12= ruleGroup ( (lv_input_op_list_13_0= ruleInputOptions ) )? ( (lv_vals_14_0= ruleInputValue ) )* ( ( 'END' )=>otherlv_15= 'END' ) )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1633:6: (this_Group_12= ruleGroup ( (lv_input_op_list_13_0= ruleInputOptions ) )? ( (lv_vals_14_0= ruleInputValue ) )* ( ( 'END' )=>otherlv_15= 'END' ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1634:5: this_Group_12= ruleGroup ( (lv_input_op_list_13_0= ruleInputOptions ) )? ( (lv_vals_14_0= ruleInputValue ) )* ( ( 'END' )=>otherlv_15= 'END' )
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInputValueAccess().getGroupParserRuleCall_2_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGroup_in_ruleInputValue3522);
                    this_Group_12=ruleGroup();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Group_12; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1642:1: ( (lv_input_op_list_13_0= ruleInputOptions ) )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==35) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1643:1: (lv_input_op_list_13_0= ruleInputOptions )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1643:1: (lv_input_op_list_13_0= ruleInputOptions )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1644:3: lv_input_op_list_13_0= ruleInputOptions
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getInputValueAccess().getInput_op_listInputOptionsParserRuleCall_2_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleInputOptions_in_ruleInputValue3542);
                            lv_input_op_list_13_0=ruleInputOptions();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getInputValueRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"input_op_list",
                                      		lv_input_op_list_13_0, 
                                      		"InputOptions");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }

                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1660:3: ( (lv_vals_14_0= ruleInputValue ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==39||(LA28_0>=41 && LA28_0<=46)) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1661:1: (lv_vals_14_0= ruleInputValue )
                    	    {
                    	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1661:1: (lv_vals_14_0= ruleInputValue )
                    	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1662:3: lv_vals_14_0= ruleInputValue
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getInputValueAccess().getValsInputValueParserRuleCall_2_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleInputValue_in_ruleInputValue3564);
                    	    lv_vals_14_0=ruleInputValue();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getInputValueRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"vals",
                    	              		lv_vals_14_0, 
                    	              		"InputValue");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);

                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1678:3: ( ( 'END' )=>otherlv_15= 'END' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1678:4: ( 'END' )=>otherlv_15= 'END'
                    {
                    otherlv_15=(Token)match(input,33,FOLLOW_33_in_ruleInputValue3585); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getInputValueAccess().getENDKeyword_2_3());
                          
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleInputValue"


    // $ANTLR start "entryRuleInputOptions"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1691:1: entryRuleInputOptions returns [EObject current=null] : iv_ruleInputOptions= ruleInputOptions EOF ;
    public final EObject entryRuleInputOptions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputOptions = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1692:2: (iv_ruleInputOptions= ruleInputOptions EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1693:2: iv_ruleInputOptions= ruleInputOptions EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInputOptionsRule()); 
            }
            pushFollow(FOLLOW_ruleInputOptions_in_entryRuleInputOptions3623);
            iv_ruleInputOptions=ruleInputOptions();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInputOptions; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInputOptions3633); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInputOptions"


    // $ANTLR start "ruleInputOptions"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1700:1: ruleInputOptions returns [EObject current=null] : (otherlv_0= ':' ( (lv_input_ops_1_0= ruleInputOption ) ) (otherlv_2= ',' ( (lv_input_ops_3_0= ruleInputOption ) ) )* ) ;
    public final EObject ruleInputOptions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_input_ops_1_0 = null;

        EObject lv_input_ops_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1703:28: ( (otherlv_0= ':' ( (lv_input_ops_1_0= ruleInputOption ) ) (otherlv_2= ',' ( (lv_input_ops_3_0= ruleInputOption ) ) )* ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1704:1: (otherlv_0= ':' ( (lv_input_ops_1_0= ruleInputOption ) ) (otherlv_2= ',' ( (lv_input_ops_3_0= ruleInputOption ) ) )* )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1704:1: (otherlv_0= ':' ( (lv_input_ops_1_0= ruleInputOption ) ) (otherlv_2= ',' ( (lv_input_ops_3_0= ruleInputOption ) ) )* )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1704:3: otherlv_0= ':' ( (lv_input_ops_1_0= ruleInputOption ) ) (otherlv_2= ',' ( (lv_input_ops_3_0= ruleInputOption ) ) )*
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleInputOptions3670); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getInputOptionsAccess().getColonKeyword_0());
                  
            }
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1708:1: ( (lv_input_ops_1_0= ruleInputOption ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1709:1: (lv_input_ops_1_0= ruleInputOption )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1709:1: (lv_input_ops_1_0= ruleInputOption )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1710:3: lv_input_ops_1_0= ruleInputOption
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInputOptionsAccess().getInput_opsInputOptionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleInputOption_in_ruleInputOptions3691);
            lv_input_ops_1_0=ruleInputOption();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getInputOptionsRule());
              	        }
                     		add(
                     			current, 
                     			"input_ops",
                      		lv_input_ops_1_0, 
                      		"InputOption");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1726:2: (otherlv_2= ',' ( (lv_input_ops_3_0= ruleInputOption ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==30) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1726:4: otherlv_2= ',' ( (lv_input_ops_3_0= ruleInputOption ) )
            	    {
            	    otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleInputOptions3704); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getInputOptionsAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1730:1: ( (lv_input_ops_3_0= ruleInputOption ) )
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1731:1: (lv_input_ops_3_0= ruleInputOption )
            	    {
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1731:1: (lv_input_ops_3_0= ruleInputOption )
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1732:3: lv_input_ops_3_0= ruleInputOption
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getInputOptionsAccess().getInput_opsInputOptionParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleInputOption_in_ruleInputOptions3725);
            	    lv_input_ops_3_0=ruleInputOption();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getInputOptionsRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"input_ops",
            	              		lv_input_ops_3_0, 
            	              		"InputOption");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

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

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleInputOptions"


    // $ANTLR start "entryRuleInputOption"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1756:1: entryRuleInputOption returns [EObject current=null] : iv_ruleInputOption= ruleInputOption EOF ;
    public final EObject entryRuleInputOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputOption = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1757:2: (iv_ruleInputOption= ruleInputOption EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1758:2: iv_ruleInputOption= ruleInputOption EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInputOptionRule()); 
            }
            pushFollow(FOLLOW_ruleInputOption_in_entryRuleInputOption3763);
            iv_ruleInputOption=ruleInputOption();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInputOption; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInputOption3773); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInputOption"


    // $ANTLR start "ruleInputOption"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1765:1: ruleInputOption returns [EObject current=null] : ( ( ( (lv_name_0_0= 'OPTIONAL' ) ) | ( (lv_name_1_0= 'DEFINED' ) ) | ( (lv_name_2_0= 'DISABLED' ) ) | ( (lv_name_3_0= 'MAPBYTYPE' ) ) | ( (lv_name_4_0= 'MAPBYNAME' ) ) | ( (lv_name_5_0= 'MANY' ) ) ) | ( ( (lv_name_6_0= 'FORMFIELD' ) ) otherlv_7= '(' ruleFormfieldOption otherlv_9= ')' ) | ( ( (lv_name_10_0= 'ENABLE' ) ) otherlv_11= '(' ( (lv_assigns_list_12_0= ruleAssignList ) ) otherlv_13= ')' ) | ( ( (lv_name_14_0= 'TYPE' ) ) otherlv_15= '(' ruleInputtypeOptions otherlv_17= ')' ) | ( ( ( (lv_name_18_0= 'RANGE' ) ) | ( (lv_name_19_0= 'DEFAULT' ) ) | ( (lv_name_20_0= 'MAXLENGTH' ) ) | ( (lv_name_21_0= 'DISABLED' ) ) | ( (lv_name_22_0= 'DESCRIPTION' ) ) | ( (lv_name_23_0= 'NULL' ) ) | ( (lv_name_24_0= 'FIELDLENGTH' ) ) | ( (lv_name_25_0= 'ROWS' ) ) | ( (lv_name_26_0= 'COLS' ) ) | ( (lv_name_27_0= '_HTML_STYLECLASS' ) ) | ( (lv_name_28_0= 'LABEL' ) ) ) otherlv_29= '(' ( (lv_vals_30_0= ruleValueList ) ) otherlv_31= ')' ) ) ;
    public final EObject ruleInputOption() throws RecognitionException {
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
        EObject lv_assigns_list_12_0 = null;

        EObject lv_vals_30_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1768:28: ( ( ( ( (lv_name_0_0= 'OPTIONAL' ) ) | ( (lv_name_1_0= 'DEFINED' ) ) | ( (lv_name_2_0= 'DISABLED' ) ) | ( (lv_name_3_0= 'MAPBYTYPE' ) ) | ( (lv_name_4_0= 'MAPBYNAME' ) ) | ( (lv_name_5_0= 'MANY' ) ) ) | ( ( (lv_name_6_0= 'FORMFIELD' ) ) otherlv_7= '(' ruleFormfieldOption otherlv_9= ')' ) | ( ( (lv_name_10_0= 'ENABLE' ) ) otherlv_11= '(' ( (lv_assigns_list_12_0= ruleAssignList ) ) otherlv_13= ')' ) | ( ( (lv_name_14_0= 'TYPE' ) ) otherlv_15= '(' ruleInputtypeOptions otherlv_17= ')' ) | ( ( ( (lv_name_18_0= 'RANGE' ) ) | ( (lv_name_19_0= 'DEFAULT' ) ) | ( (lv_name_20_0= 'MAXLENGTH' ) ) | ( (lv_name_21_0= 'DISABLED' ) ) | ( (lv_name_22_0= 'DESCRIPTION' ) ) | ( (lv_name_23_0= 'NULL' ) ) | ( (lv_name_24_0= 'FIELDLENGTH' ) ) | ( (lv_name_25_0= 'ROWS' ) ) | ( (lv_name_26_0= 'COLS' ) ) | ( (lv_name_27_0= '_HTML_STYLECLASS' ) ) | ( (lv_name_28_0= 'LABEL' ) ) ) otherlv_29= '(' ( (lv_vals_30_0= ruleValueList ) ) otherlv_31= ')' ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1769:1: ( ( ( (lv_name_0_0= 'OPTIONAL' ) ) | ( (lv_name_1_0= 'DEFINED' ) ) | ( (lv_name_2_0= 'DISABLED' ) ) | ( (lv_name_3_0= 'MAPBYTYPE' ) ) | ( (lv_name_4_0= 'MAPBYNAME' ) ) | ( (lv_name_5_0= 'MANY' ) ) ) | ( ( (lv_name_6_0= 'FORMFIELD' ) ) otherlv_7= '(' ruleFormfieldOption otherlv_9= ')' ) | ( ( (lv_name_10_0= 'ENABLE' ) ) otherlv_11= '(' ( (lv_assigns_list_12_0= ruleAssignList ) ) otherlv_13= ')' ) | ( ( (lv_name_14_0= 'TYPE' ) ) otherlv_15= '(' ruleInputtypeOptions otherlv_17= ')' ) | ( ( ( (lv_name_18_0= 'RANGE' ) ) | ( (lv_name_19_0= 'DEFAULT' ) ) | ( (lv_name_20_0= 'MAXLENGTH' ) ) | ( (lv_name_21_0= 'DISABLED' ) ) | ( (lv_name_22_0= 'DESCRIPTION' ) ) | ( (lv_name_23_0= 'NULL' ) ) | ( (lv_name_24_0= 'FIELDLENGTH' ) ) | ( (lv_name_25_0= 'ROWS' ) ) | ( (lv_name_26_0= 'COLS' ) ) | ( (lv_name_27_0= '_HTML_STYLECLASS' ) ) | ( (lv_name_28_0= 'LABEL' ) ) ) otherlv_29= '(' ( (lv_vals_30_0= ruleValueList ) ) otherlv_31= ')' ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1769:1: ( ( ( (lv_name_0_0= 'OPTIONAL' ) ) | ( (lv_name_1_0= 'DEFINED' ) ) | ( (lv_name_2_0= 'DISABLED' ) ) | ( (lv_name_3_0= 'MAPBYTYPE' ) ) | ( (lv_name_4_0= 'MAPBYNAME' ) ) | ( (lv_name_5_0= 'MANY' ) ) ) | ( ( (lv_name_6_0= 'FORMFIELD' ) ) otherlv_7= '(' ruleFormfieldOption otherlv_9= ')' ) | ( ( (lv_name_10_0= 'ENABLE' ) ) otherlv_11= '(' ( (lv_assigns_list_12_0= ruleAssignList ) ) otherlv_13= ')' ) | ( ( (lv_name_14_0= 'TYPE' ) ) otherlv_15= '(' ruleInputtypeOptions otherlv_17= ')' ) | ( ( ( (lv_name_18_0= 'RANGE' ) ) | ( (lv_name_19_0= 'DEFAULT' ) ) | ( (lv_name_20_0= 'MAXLENGTH' ) ) | ( (lv_name_21_0= 'DISABLED' ) ) | ( (lv_name_22_0= 'DESCRIPTION' ) ) | ( (lv_name_23_0= 'NULL' ) ) | ( (lv_name_24_0= 'FIELDLENGTH' ) ) | ( (lv_name_25_0= 'ROWS' ) ) | ( (lv_name_26_0= 'COLS' ) ) | ( (lv_name_27_0= '_HTML_STYLECLASS' ) ) | ( (lv_name_28_0= 'LABEL' ) ) ) otherlv_29= '(' ( (lv_vals_30_0= ruleValueList ) ) otherlv_31= ')' ) )
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
                    if (state.backtracking>0) {state.failed=true; return current;}
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
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1769:2: ( ( (lv_name_0_0= 'OPTIONAL' ) ) | ( (lv_name_1_0= 'DEFINED' ) ) | ( (lv_name_2_0= 'DISABLED' ) ) | ( (lv_name_3_0= 'MAPBYTYPE' ) ) | ( (lv_name_4_0= 'MAPBYNAME' ) ) | ( (lv_name_5_0= 'MANY' ) ) )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1769:2: ( ( (lv_name_0_0= 'OPTIONAL' ) ) | ( (lv_name_1_0= 'DEFINED' ) ) | ( (lv_name_2_0= 'DISABLED' ) ) | ( (lv_name_3_0= 'MAPBYTYPE' ) ) | ( (lv_name_4_0= 'MAPBYNAME' ) ) | ( (lv_name_5_0= 'MANY' ) ) )
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
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 0, input);

                        throw nvae;
                    }

                    switch (alt31) {
                        case 1 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1769:3: ( (lv_name_0_0= 'OPTIONAL' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1769:3: ( (lv_name_0_0= 'OPTIONAL' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1770:1: (lv_name_0_0= 'OPTIONAL' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1770:1: (lv_name_0_0= 'OPTIONAL' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1771:3: lv_name_0_0= 'OPTIONAL'
                            {
                            lv_name_0_0=(Token)match(input,47,FOLLOW_47_in_ruleInputOption3817); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_name_0_0, grammarAccess.getInputOptionAccess().getNameOPTIONALKeyword_0_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getInputOptionRule());
                              	        }
                                     		setWithLastConsumed(current, "name", lv_name_0_0, "OPTIONAL");
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1785:6: ( (lv_name_1_0= 'DEFINED' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1785:6: ( (lv_name_1_0= 'DEFINED' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1786:1: (lv_name_1_0= 'DEFINED' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1786:1: (lv_name_1_0= 'DEFINED' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1787:3: lv_name_1_0= 'DEFINED'
                            {
                            lv_name_1_0=(Token)match(input,48,FOLLOW_48_in_ruleInputOption3854); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_name_1_0, grammarAccess.getInputOptionAccess().getNameDEFINEDKeyword_0_1_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getInputOptionRule());
                              	        }
                                     		setWithLastConsumed(current, "name", lv_name_1_0, "DEFINED");
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 3 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1801:6: ( (lv_name_2_0= 'DISABLED' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1801:6: ( (lv_name_2_0= 'DISABLED' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1802:1: (lv_name_2_0= 'DISABLED' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1802:1: (lv_name_2_0= 'DISABLED' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1803:3: lv_name_2_0= 'DISABLED'
                            {
                            lv_name_2_0=(Token)match(input,49,FOLLOW_49_in_ruleInputOption3891); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_name_2_0, grammarAccess.getInputOptionAccess().getNameDISABLEDKeyword_0_2_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getInputOptionRule());
                              	        }
                                     		setWithLastConsumed(current, "name", lv_name_2_0, "DISABLED");
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 4 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1817:6: ( (lv_name_3_0= 'MAPBYTYPE' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1817:6: ( (lv_name_3_0= 'MAPBYTYPE' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1818:1: (lv_name_3_0= 'MAPBYTYPE' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1818:1: (lv_name_3_0= 'MAPBYTYPE' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1819:3: lv_name_3_0= 'MAPBYTYPE'
                            {
                            lv_name_3_0=(Token)match(input,50,FOLLOW_50_in_ruleInputOption3928); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_name_3_0, grammarAccess.getInputOptionAccess().getNameMAPBYTYPEKeyword_0_3_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getInputOptionRule());
                              	        }
                                     		setWithLastConsumed(current, "name", lv_name_3_0, "MAPBYTYPE");
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 5 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1833:6: ( (lv_name_4_0= 'MAPBYNAME' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1833:6: ( (lv_name_4_0= 'MAPBYNAME' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1834:1: (lv_name_4_0= 'MAPBYNAME' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1834:1: (lv_name_4_0= 'MAPBYNAME' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1835:3: lv_name_4_0= 'MAPBYNAME'
                            {
                            lv_name_4_0=(Token)match(input,51,FOLLOW_51_in_ruleInputOption3965); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_name_4_0, grammarAccess.getInputOptionAccess().getNameMAPBYNAMEKeyword_0_4_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getInputOptionRule());
                              	        }
                                     		setWithLastConsumed(current, "name", lv_name_4_0, "MAPBYNAME");
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 6 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1849:6: ( (lv_name_5_0= 'MANY' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1849:6: ( (lv_name_5_0= 'MANY' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1850:1: (lv_name_5_0= 'MANY' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1850:1: (lv_name_5_0= 'MANY' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1851:3: lv_name_5_0= 'MANY'
                            {
                            lv_name_5_0=(Token)match(input,52,FOLLOW_52_in_ruleInputOption4002); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_name_5_0, grammarAccess.getInputOptionAccess().getNameMANYKeyword_0_5_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getInputOptionRule());
                              	        }
                                     		setWithLastConsumed(current, "name", lv_name_5_0, "MANY");
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1865:6: ( ( (lv_name_6_0= 'FORMFIELD' ) ) otherlv_7= '(' ruleFormfieldOption otherlv_9= ')' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1865:6: ( ( (lv_name_6_0= 'FORMFIELD' ) ) otherlv_7= '(' ruleFormfieldOption otherlv_9= ')' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1865:7: ( (lv_name_6_0= 'FORMFIELD' ) ) otherlv_7= '(' ruleFormfieldOption otherlv_9= ')'
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1865:7: ( (lv_name_6_0= 'FORMFIELD' ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1866:1: (lv_name_6_0= 'FORMFIELD' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1866:1: (lv_name_6_0= 'FORMFIELD' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1867:3: lv_name_6_0= 'FORMFIELD'
                    {
                    lv_name_6_0=(Token)match(input,53,FOLLOW_53_in_ruleInputOption4041); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_6_0, grammarAccess.getInputOptionAccess().getNameFORMFIELDKeyword_1_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getInputOptionRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_6_0, "FORMFIELD");
                      	    
                    }

                    }


                    }

                    otherlv_7=(Token)match(input,36,FOLLOW_36_in_ruleInputOption4066); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getInputOptionAccess().getLeftParenthesisKeyword_1_1());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInputOptionAccess().getFormfieldOptionParserRuleCall_1_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFormfieldOption_in_ruleInputOption4082);
                    ruleFormfieldOption();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_9=(Token)match(input,37,FOLLOW_37_in_ruleInputOption4093); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getInputOptionAccess().getRightParenthesisKeyword_1_3());
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1897:6: ( ( (lv_name_10_0= 'ENABLE' ) ) otherlv_11= '(' ( (lv_assigns_list_12_0= ruleAssignList ) ) otherlv_13= ')' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1897:6: ( ( (lv_name_10_0= 'ENABLE' ) ) otherlv_11= '(' ( (lv_assigns_list_12_0= ruleAssignList ) ) otherlv_13= ')' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1897:7: ( (lv_name_10_0= 'ENABLE' ) ) otherlv_11= '(' ( (lv_assigns_list_12_0= ruleAssignList ) ) otherlv_13= ')'
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1897:7: ( (lv_name_10_0= 'ENABLE' ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1898:1: (lv_name_10_0= 'ENABLE' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1898:1: (lv_name_10_0= 'ENABLE' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1899:3: lv_name_10_0= 'ENABLE'
                    {
                    lv_name_10_0=(Token)match(input,54,FOLLOW_54_in_ruleInputOption4119); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_10_0, grammarAccess.getInputOptionAccess().getNameENABLEKeyword_2_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getInputOptionRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_10_0, "ENABLE");
                      	    
                    }

                    }


                    }

                    otherlv_11=(Token)match(input,36,FOLLOW_36_in_ruleInputOption4144); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getInputOptionAccess().getLeftParenthesisKeyword_2_1());
                          
                    }
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1916:1: ( (lv_assigns_list_12_0= ruleAssignList ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1917:1: (lv_assigns_list_12_0= ruleAssignList )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1917:1: (lv_assigns_list_12_0= ruleAssignList )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1918:3: lv_assigns_list_12_0= ruleAssignList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInputOptionAccess().getAssigns_listAssignListParserRuleCall_2_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAssignList_in_ruleInputOption4165);
                    lv_assigns_list_12_0=ruleAssignList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInputOptionRule());
                      	        }
                             		set(
                             			current, 
                             			"assigns_list",
                              		lv_assigns_list_12_0, 
                              		"AssignList");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_13=(Token)match(input,37,FOLLOW_37_in_ruleInputOption4177); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getInputOptionAccess().getRightParenthesisKeyword_2_3());
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1939:6: ( ( (lv_name_14_0= 'TYPE' ) ) otherlv_15= '(' ruleInputtypeOptions otherlv_17= ')' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1939:6: ( ( (lv_name_14_0= 'TYPE' ) ) otherlv_15= '(' ruleInputtypeOptions otherlv_17= ')' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1939:7: ( (lv_name_14_0= 'TYPE' ) ) otherlv_15= '(' ruleInputtypeOptions otherlv_17= ')'
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1939:7: ( (lv_name_14_0= 'TYPE' ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1940:1: (lv_name_14_0= 'TYPE' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1940:1: (lv_name_14_0= 'TYPE' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1941:3: lv_name_14_0= 'TYPE'
                    {
                    lv_name_14_0=(Token)match(input,55,FOLLOW_55_in_ruleInputOption4203); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_14_0, grammarAccess.getInputOptionAccess().getNameTYPEKeyword_3_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getInputOptionRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_14_0, "TYPE");
                      	    
                    }

                    }


                    }

                    otherlv_15=(Token)match(input,36,FOLLOW_36_in_ruleInputOption4228); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getInputOptionAccess().getLeftParenthesisKeyword_3_1());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInputOptionAccess().getInputtypeOptionsParserRuleCall_3_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInputtypeOptions_in_ruleInputOption4244);
                    ruleInputtypeOptions();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_17=(Token)match(input,37,FOLLOW_37_in_ruleInputOption4255); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_17, grammarAccess.getInputOptionAccess().getRightParenthesisKeyword_3_3());
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1971:6: ( ( ( (lv_name_18_0= 'RANGE' ) ) | ( (lv_name_19_0= 'DEFAULT' ) ) | ( (lv_name_20_0= 'MAXLENGTH' ) ) | ( (lv_name_21_0= 'DISABLED' ) ) | ( (lv_name_22_0= 'DESCRIPTION' ) ) | ( (lv_name_23_0= 'NULL' ) ) | ( (lv_name_24_0= 'FIELDLENGTH' ) ) | ( (lv_name_25_0= 'ROWS' ) ) | ( (lv_name_26_0= 'COLS' ) ) | ( (lv_name_27_0= '_HTML_STYLECLASS' ) ) | ( (lv_name_28_0= 'LABEL' ) ) ) otherlv_29= '(' ( (lv_vals_30_0= ruleValueList ) ) otherlv_31= ')' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1971:6: ( ( ( (lv_name_18_0= 'RANGE' ) ) | ( (lv_name_19_0= 'DEFAULT' ) ) | ( (lv_name_20_0= 'MAXLENGTH' ) ) | ( (lv_name_21_0= 'DISABLED' ) ) | ( (lv_name_22_0= 'DESCRIPTION' ) ) | ( (lv_name_23_0= 'NULL' ) ) | ( (lv_name_24_0= 'FIELDLENGTH' ) ) | ( (lv_name_25_0= 'ROWS' ) ) | ( (lv_name_26_0= 'COLS' ) ) | ( (lv_name_27_0= '_HTML_STYLECLASS' ) ) | ( (lv_name_28_0= 'LABEL' ) ) ) otherlv_29= '(' ( (lv_vals_30_0= ruleValueList ) ) otherlv_31= ')' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1971:7: ( ( (lv_name_18_0= 'RANGE' ) ) | ( (lv_name_19_0= 'DEFAULT' ) ) | ( (lv_name_20_0= 'MAXLENGTH' ) ) | ( (lv_name_21_0= 'DISABLED' ) ) | ( (lv_name_22_0= 'DESCRIPTION' ) ) | ( (lv_name_23_0= 'NULL' ) ) | ( (lv_name_24_0= 'FIELDLENGTH' ) ) | ( (lv_name_25_0= 'ROWS' ) ) | ( (lv_name_26_0= 'COLS' ) ) | ( (lv_name_27_0= '_HTML_STYLECLASS' ) ) | ( (lv_name_28_0= 'LABEL' ) ) ) otherlv_29= '(' ( (lv_vals_30_0= ruleValueList ) ) otherlv_31= ')'
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1971:7: ( ( (lv_name_18_0= 'RANGE' ) ) | ( (lv_name_19_0= 'DEFAULT' ) ) | ( (lv_name_20_0= 'MAXLENGTH' ) ) | ( (lv_name_21_0= 'DISABLED' ) ) | ( (lv_name_22_0= 'DESCRIPTION' ) ) | ( (lv_name_23_0= 'NULL' ) ) | ( (lv_name_24_0= 'FIELDLENGTH' ) ) | ( (lv_name_25_0= 'ROWS' ) ) | ( (lv_name_26_0= 'COLS' ) ) | ( (lv_name_27_0= '_HTML_STYLECLASS' ) ) | ( (lv_name_28_0= 'LABEL' ) ) )
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
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 0, input);

                        throw nvae;
                    }

                    switch (alt32) {
                        case 1 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1971:8: ( (lv_name_18_0= 'RANGE' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1971:8: ( (lv_name_18_0= 'RANGE' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1972:1: (lv_name_18_0= 'RANGE' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1972:1: (lv_name_18_0= 'RANGE' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1973:3: lv_name_18_0= 'RANGE'
                            {
                            lv_name_18_0=(Token)match(input,56,FOLLOW_56_in_ruleInputOption4282); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_name_18_0, grammarAccess.getInputOptionAccess().getNameRANGEKeyword_4_0_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getInputOptionRule());
                              	        }
                                     		setWithLastConsumed(current, "name", lv_name_18_0, "RANGE");
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1987:6: ( (lv_name_19_0= 'DEFAULT' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1987:6: ( (lv_name_19_0= 'DEFAULT' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1988:1: (lv_name_19_0= 'DEFAULT' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1988:1: (lv_name_19_0= 'DEFAULT' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1989:3: lv_name_19_0= 'DEFAULT'
                            {
                            lv_name_19_0=(Token)match(input,57,FOLLOW_57_in_ruleInputOption4319); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_name_19_0, grammarAccess.getInputOptionAccess().getNameDEFAULTKeyword_4_0_1_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getInputOptionRule());
                              	        }
                                     		setWithLastConsumed(current, "name", lv_name_19_0, "DEFAULT");
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 3 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2003:6: ( (lv_name_20_0= 'MAXLENGTH' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2003:6: ( (lv_name_20_0= 'MAXLENGTH' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2004:1: (lv_name_20_0= 'MAXLENGTH' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2004:1: (lv_name_20_0= 'MAXLENGTH' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2005:3: lv_name_20_0= 'MAXLENGTH'
                            {
                            lv_name_20_0=(Token)match(input,58,FOLLOW_58_in_ruleInputOption4356); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_name_20_0, grammarAccess.getInputOptionAccess().getNameMAXLENGTHKeyword_4_0_2_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getInputOptionRule());
                              	        }
                                     		setWithLastConsumed(current, "name", lv_name_20_0, "MAXLENGTH");
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 4 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2019:6: ( (lv_name_21_0= 'DISABLED' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2019:6: ( (lv_name_21_0= 'DISABLED' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2020:1: (lv_name_21_0= 'DISABLED' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2020:1: (lv_name_21_0= 'DISABLED' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2021:3: lv_name_21_0= 'DISABLED'
                            {
                            lv_name_21_0=(Token)match(input,49,FOLLOW_49_in_ruleInputOption4393); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_name_21_0, grammarAccess.getInputOptionAccess().getNameDISABLEDKeyword_4_0_3_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getInputOptionRule());
                              	        }
                                     		setWithLastConsumed(current, "name", lv_name_21_0, "DISABLED");
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 5 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2035:6: ( (lv_name_22_0= 'DESCRIPTION' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2035:6: ( (lv_name_22_0= 'DESCRIPTION' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2036:1: (lv_name_22_0= 'DESCRIPTION' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2036:1: (lv_name_22_0= 'DESCRIPTION' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2037:3: lv_name_22_0= 'DESCRIPTION'
                            {
                            lv_name_22_0=(Token)match(input,13,FOLLOW_13_in_ruleInputOption4430); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_name_22_0, grammarAccess.getInputOptionAccess().getNameDESCRIPTIONKeyword_4_0_4_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getInputOptionRule());
                              	        }
                                     		setWithLastConsumed(current, "name", lv_name_22_0, "DESCRIPTION");
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 6 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2051:6: ( (lv_name_23_0= 'NULL' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2051:6: ( (lv_name_23_0= 'NULL' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2052:1: (lv_name_23_0= 'NULL' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2052:1: (lv_name_23_0= 'NULL' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2053:3: lv_name_23_0= 'NULL'
                            {
                            lv_name_23_0=(Token)match(input,59,FOLLOW_59_in_ruleInputOption4467); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_name_23_0, grammarAccess.getInputOptionAccess().getNameNULLKeyword_4_0_5_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getInputOptionRule());
                              	        }
                                     		setWithLastConsumed(current, "name", lv_name_23_0, "NULL");
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 7 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2067:6: ( (lv_name_24_0= 'FIELDLENGTH' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2067:6: ( (lv_name_24_0= 'FIELDLENGTH' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2068:1: (lv_name_24_0= 'FIELDLENGTH' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2068:1: (lv_name_24_0= 'FIELDLENGTH' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2069:3: lv_name_24_0= 'FIELDLENGTH'
                            {
                            lv_name_24_0=(Token)match(input,60,FOLLOW_60_in_ruleInputOption4504); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_name_24_0, grammarAccess.getInputOptionAccess().getNameFIELDLENGTHKeyword_4_0_6_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getInputOptionRule());
                              	        }
                                     		setWithLastConsumed(current, "name", lv_name_24_0, "FIELDLENGTH");
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 8 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2083:6: ( (lv_name_25_0= 'ROWS' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2083:6: ( (lv_name_25_0= 'ROWS' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2084:1: (lv_name_25_0= 'ROWS' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2084:1: (lv_name_25_0= 'ROWS' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2085:3: lv_name_25_0= 'ROWS'
                            {
                            lv_name_25_0=(Token)match(input,61,FOLLOW_61_in_ruleInputOption4541); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_name_25_0, grammarAccess.getInputOptionAccess().getNameROWSKeyword_4_0_7_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getInputOptionRule());
                              	        }
                                     		setWithLastConsumed(current, "name", lv_name_25_0, "ROWS");
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 9 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2099:6: ( (lv_name_26_0= 'COLS' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2099:6: ( (lv_name_26_0= 'COLS' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2100:1: (lv_name_26_0= 'COLS' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2100:1: (lv_name_26_0= 'COLS' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2101:3: lv_name_26_0= 'COLS'
                            {
                            lv_name_26_0=(Token)match(input,62,FOLLOW_62_in_ruleInputOption4578); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_name_26_0, grammarAccess.getInputOptionAccess().getNameCOLSKeyword_4_0_8_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getInputOptionRule());
                              	        }
                                     		setWithLastConsumed(current, "name", lv_name_26_0, "COLS");
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 10 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2115:6: ( (lv_name_27_0= '_HTML_STYLECLASS' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2115:6: ( (lv_name_27_0= '_HTML_STYLECLASS' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2116:1: (lv_name_27_0= '_HTML_STYLECLASS' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2116:1: (lv_name_27_0= '_HTML_STYLECLASS' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2117:3: lv_name_27_0= '_HTML_STYLECLASS'
                            {
                            lv_name_27_0=(Token)match(input,63,FOLLOW_63_in_ruleInputOption4615); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_name_27_0, grammarAccess.getInputOptionAccess().getName_HTML_STYLECLASSKeyword_4_0_9_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getInputOptionRule());
                              	        }
                                     		setWithLastConsumed(current, "name", lv_name_27_0, "_HTML_STYLECLASS");
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 11 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2131:6: ( (lv_name_28_0= 'LABEL' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2131:6: ( (lv_name_28_0= 'LABEL' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2132:1: (lv_name_28_0= 'LABEL' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2132:1: (lv_name_28_0= 'LABEL' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2133:3: lv_name_28_0= 'LABEL'
                            {
                            lv_name_28_0=(Token)match(input,18,FOLLOW_18_in_ruleInputOption4652); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_name_28_0, grammarAccess.getInputOptionAccess().getNameLABELKeyword_4_0_10_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getInputOptionRule());
                              	        }
                                     		setWithLastConsumed(current, "name", lv_name_28_0, "LABEL");
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }

                    otherlv_29=(Token)match(input,36,FOLLOW_36_in_ruleInputOption4678); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_29, grammarAccess.getInputOptionAccess().getLeftParenthesisKeyword_4_1());
                          
                    }
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2150:1: ( (lv_vals_30_0= ruleValueList ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2151:1: (lv_vals_30_0= ruleValueList )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2151:1: (lv_vals_30_0= ruleValueList )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2152:3: lv_vals_30_0= ruleValueList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInputOptionAccess().getValsValueListParserRuleCall_4_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValueList_in_ruleInputOption4699);
                    lv_vals_30_0=ruleValueList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInputOptionRule());
                      	        }
                             		add(
                             			current, 
                             			"vals",
                              		lv_vals_30_0, 
                              		"ValueList");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_31=(Token)match(input,37,FOLLOW_37_in_ruleInputOption4711); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_31, grammarAccess.getInputOptionAccess().getRightParenthesisKeyword_4_3());
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleInputOption"


    // $ANTLR start "entryRuleFormfieldOption"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2180:1: entryRuleFormfieldOption returns [String current=null] : iv_ruleFormfieldOption= ruleFormfieldOption EOF ;
    public final String entryRuleFormfieldOption() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFormfieldOption = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2181:2: (iv_ruleFormfieldOption= ruleFormfieldOption EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2182:2: iv_ruleFormfieldOption= ruleFormfieldOption EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFormfieldOptionRule()); 
            }
            pushFollow(FOLLOW_ruleFormfieldOption_in_entryRuleFormfieldOption4749);
            iv_ruleFormfieldOption=ruleFormfieldOption();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFormfieldOption.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormfieldOption4760); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFormfieldOption"


    // $ANTLR start "ruleFormfieldOption"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2189:1: ruleFormfieldOption returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'CHECKBOX' | kw= 'RADIO' | kw= 'SELECT' | kw= 'MULTIPLESELECT' | kw= 'TEXTAREA' | kw= 'HIDDEN' | kw= 'TEXT' ) ;
    public final AntlrDatatypeRuleToken ruleFormfieldOption() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2192:28: ( (kw= 'CHECKBOX' | kw= 'RADIO' | kw= 'SELECT' | kw= 'MULTIPLESELECT' | kw= 'TEXTAREA' | kw= 'HIDDEN' | kw= 'TEXT' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2193:1: (kw= 'CHECKBOX' | kw= 'RADIO' | kw= 'SELECT' | kw= 'MULTIPLESELECT' | kw= 'TEXTAREA' | kw= 'HIDDEN' | kw= 'TEXT' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2193:1: (kw= 'CHECKBOX' | kw= 'RADIO' | kw= 'SELECT' | kw= 'MULTIPLESELECT' | kw= 'TEXTAREA' | kw= 'HIDDEN' | kw= 'TEXT' )
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
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2194:2: kw= 'CHECKBOX'
                    {
                    kw=(Token)match(input,64,FOLLOW_64_in_ruleFormfieldOption4798); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFormfieldOptionAccess().getCHECKBOXKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2201:2: kw= 'RADIO'
                    {
                    kw=(Token)match(input,65,FOLLOW_65_in_ruleFormfieldOption4817); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFormfieldOptionAccess().getRADIOKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2208:2: kw= 'SELECT'
                    {
                    kw=(Token)match(input,66,FOLLOW_66_in_ruleFormfieldOption4836); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFormfieldOptionAccess().getSELECTKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2215:2: kw= 'MULTIPLESELECT'
                    {
                    kw=(Token)match(input,67,FOLLOW_67_in_ruleFormfieldOption4855); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFormfieldOptionAccess().getMULTIPLESELECTKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2222:2: kw= 'TEXTAREA'
                    {
                    kw=(Token)match(input,68,FOLLOW_68_in_ruleFormfieldOption4874); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFormfieldOptionAccess().getTEXTAREAKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2229:2: kw= 'HIDDEN'
                    {
                    kw=(Token)match(input,69,FOLLOW_69_in_ruleFormfieldOption4893); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFormfieldOptionAccess().getHIDDENKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2236:2: kw= 'TEXT'
                    {
                    kw=(Token)match(input,70,FOLLOW_70_in_ruleFormfieldOption4912); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFormfieldOptionAccess().getTEXTKeyword_6()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleFormfieldOption"


    // $ANTLR start "entryRuleInputtypeOption"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2249:1: entryRuleInputtypeOption returns [String current=null] : iv_ruleInputtypeOption= ruleInputtypeOption EOF ;
    public final String entryRuleInputtypeOption() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInputtypeOption = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2250:2: (iv_ruleInputtypeOption= ruleInputtypeOption EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2251:2: iv_ruleInputtypeOption= ruleInputtypeOption EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInputtypeOptionRule()); 
            }
            pushFollow(FOLLOW_ruleInputtypeOption_in_entryRuleInputtypeOption4953);
            iv_ruleInputtypeOption=ruleInputtypeOption();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInputtypeOption.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInputtypeOption4964); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInputtypeOption"


    // $ANTLR start "ruleInputtypeOption"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2258:1: ruleInputtypeOption returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'STRING' | kw= 'UNICODE' | kw= 'UNISTR' | kw= 'INTEGER' | kw= 'DECIMAL' | kw= 'NUMERIC' | kw= 'REAL' ) ;
    public final AntlrDatatypeRuleToken ruleInputtypeOption() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2261:28: ( (kw= 'STRING' | kw= 'UNICODE' | kw= 'UNISTR' | kw= 'INTEGER' | kw= 'DECIMAL' | kw= 'NUMERIC' | kw= 'REAL' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2262:1: (kw= 'STRING' | kw= 'UNICODE' | kw= 'UNISTR' | kw= 'INTEGER' | kw= 'DECIMAL' | kw= 'NUMERIC' | kw= 'REAL' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2262:1: (kw= 'STRING' | kw= 'UNICODE' | kw= 'UNISTR' | kw= 'INTEGER' | kw= 'DECIMAL' | kw= 'NUMERIC' | kw= 'REAL' )
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
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2263:2: kw= 'STRING'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleInputtypeOption5002); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getInputtypeOptionAccess().getSTRINGKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2270:2: kw= 'UNICODE'
                    {
                    kw=(Token)match(input,71,FOLLOW_71_in_ruleInputtypeOption5021); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getInputtypeOptionAccess().getUNICODEKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2277:2: kw= 'UNISTR'
                    {
                    kw=(Token)match(input,72,FOLLOW_72_in_ruleInputtypeOption5040); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getInputtypeOptionAccess().getUNISTRKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2284:2: kw= 'INTEGER'
                    {
                    kw=(Token)match(input,73,FOLLOW_73_in_ruleInputtypeOption5059); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getInputtypeOptionAccess().getINTEGERKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2291:2: kw= 'DECIMAL'
                    {
                    kw=(Token)match(input,74,FOLLOW_74_in_ruleInputtypeOption5078); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getInputtypeOptionAccess().getDECIMALKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2298:2: kw= 'NUMERIC'
                    {
                    kw=(Token)match(input,75,FOLLOW_75_in_ruleInputtypeOption5097); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getInputtypeOptionAccess().getNUMERICKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2305:2: kw= 'REAL'
                    {
                    kw=(Token)match(input,76,FOLLOW_76_in_ruleInputtypeOption5116); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getInputtypeOptionAccess().getREALKeyword_6()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleInputtypeOption"


    // $ANTLR start "entryRuleInputtypeOptions"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2318:1: entryRuleInputtypeOptions returns [String current=null] : iv_ruleInputtypeOptions= ruleInputtypeOptions EOF ;
    public final String entryRuleInputtypeOptions() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInputtypeOptions = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2319:2: (iv_ruleInputtypeOptions= ruleInputtypeOptions EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2320:2: iv_ruleInputtypeOptions= ruleInputtypeOptions EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInputtypeOptionsRule()); 
            }
            pushFollow(FOLLOW_ruleInputtypeOptions_in_entryRuleInputtypeOptions5157);
            iv_ruleInputtypeOptions=ruleInputtypeOptions();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInputtypeOptions.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInputtypeOptions5168); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInputtypeOptions"


    // $ANTLR start "ruleInputtypeOptions"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2327:1: ruleInputtypeOptions returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_InputtypeOption_0= ruleInputtypeOption (kw= ',' this_InputtypeOption_2= ruleInputtypeOption )* ) ;
    public final AntlrDatatypeRuleToken ruleInputtypeOptions() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_InputtypeOption_0 = null;

        AntlrDatatypeRuleToken this_InputtypeOption_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2330:28: ( (this_InputtypeOption_0= ruleInputtypeOption (kw= ',' this_InputtypeOption_2= ruleInputtypeOption )* ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2331:1: (this_InputtypeOption_0= ruleInputtypeOption (kw= ',' this_InputtypeOption_2= ruleInputtypeOption )* )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2331:1: (this_InputtypeOption_0= ruleInputtypeOption (kw= ',' this_InputtypeOption_2= ruleInputtypeOption )* )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2332:5: this_InputtypeOption_0= ruleInputtypeOption (kw= ',' this_InputtypeOption_2= ruleInputtypeOption )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getInputtypeOptionsAccess().getInputtypeOptionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleInputtypeOption_in_ruleInputtypeOptions5215);
            this_InputtypeOption_0=ruleInputtypeOption();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_InputtypeOption_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2342:1: (kw= ',' this_InputtypeOption_2= ruleInputtypeOption )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==30) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2343:2: kw= ',' this_InputtypeOption_2= ruleInputtypeOption
            	    {
            	    kw=(Token)match(input,30,FOLLOW_30_in_ruleInputtypeOptions5234); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getInputtypeOptionsAccess().getCommaKeyword_1_0()); 
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getInputtypeOptionsAccess().getInputtypeOptionParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleInputtypeOption_in_ruleInputtypeOptions5256);
            	    this_InputtypeOption_2=ruleInputtypeOption();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_InputtypeOption_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleInputtypeOptions"


    // $ANTLR start "entryRuleOutputSection"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2367:1: entryRuleOutputSection returns [EObject current=null] : iv_ruleOutputSection= ruleOutputSection EOF ;
    public final EObject entryRuleOutputSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputSection = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2368:2: (iv_ruleOutputSection= ruleOutputSection EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2369:2: iv_ruleOutputSection= ruleOutputSection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOutputSectionRule()); 
            }
            pushFollow(FOLLOW_ruleOutputSection_in_entryRuleOutputSection5303);
            iv_ruleOutputSection=ruleOutputSection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOutputSection; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOutputSection5313); if (state.failed) return current;

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2376:1: ruleOutputSection returns [EObject current=null] : ( ( (lv_name_0_0= 'OUTPUTS' ) ) ( (lv_outputs_1_0= ruleOutputValue ) )+ ( ( 'END' )=>otherlv_2= 'END' ) ) ;
    public final EObject ruleOutputSection() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        EObject lv_outputs_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2379:28: ( ( ( (lv_name_0_0= 'OUTPUTS' ) ) ( (lv_outputs_1_0= ruleOutputValue ) )+ ( ( 'END' )=>otherlv_2= 'END' ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2380:1: ( ( (lv_name_0_0= 'OUTPUTS' ) ) ( (lv_outputs_1_0= ruleOutputValue ) )+ ( ( 'END' )=>otherlv_2= 'END' ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2380:1: ( ( (lv_name_0_0= 'OUTPUTS' ) ) ( (lv_outputs_1_0= ruleOutputValue ) )+ ( ( 'END' )=>otherlv_2= 'END' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2380:2: ( (lv_name_0_0= 'OUTPUTS' ) ) ( (lv_outputs_1_0= ruleOutputValue ) )+ ( ( 'END' )=>otherlv_2= 'END' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2380:2: ( (lv_name_0_0= 'OUTPUTS' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2381:1: (lv_name_0_0= 'OUTPUTS' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2381:1: (lv_name_0_0= 'OUTPUTS' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2382:3: lv_name_0_0= 'OUTPUTS'
            {
            lv_name_0_0=(Token)match(input,77,FOLLOW_77_in_ruleOutputSection5356); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_name_0_0, grammarAccess.getOutputSectionAccess().getNameOUTPUTSKeyword_0_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getOutputSectionRule());
              	        }
                     		setWithLastConsumed(current, "name", lv_name_0_0, "OUTPUTS");
              	    
            }

            }


            }

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2395:2: ( (lv_outputs_1_0= ruleOutputValue ) )+
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
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2396:1: (lv_outputs_1_0= ruleOutputValue )
            	    {
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2396:1: (lv_outputs_1_0= ruleOutputValue )
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2397:3: lv_outputs_1_0= ruleOutputValue
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOutputSectionAccess().getOutputsOutputValueParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOutputValue_in_ruleOutputSection5390);
            	    lv_outputs_1_0=ruleOutputValue();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getOutputSectionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"outputs",
            	              		lv_outputs_1_0, 
            	              		"OutputValue");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt37 >= 1 ) break loop37;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(37, input);
                        throw eee;
                }
                cnt37++;
            } while (true);

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2413:3: ( ( 'END' )=>otherlv_2= 'END' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2413:4: ( 'END' )=>otherlv_2= 'END'
            {
            otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleOutputSection5411); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getOutputSectionAccess().getENDKeyword_2());
                  
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOutputSection"


    // $ANTLR start "entryRuleECLInteger"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2428:1: entryRuleECLInteger returns [EObject current=null] : iv_ruleECLInteger= ruleECLInteger EOF ;
    public final EObject entryRuleECLInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleECLInteger = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2429:2: (iv_ruleECLInteger= ruleECLInteger EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2430:2: iv_ruleECLInteger= ruleECLInteger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getECLIntegerRule()); 
            }
            pushFollow(FOLLOW_ruleECLInteger_in_entryRuleECLInteger5450);
            iv_ruleECLInteger=ruleECLInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleECLInteger; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleECLInteger5460); if (state.failed) return current;

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
    // $ANTLR end "entryRuleECLInteger"


    // $ANTLR start "ruleECLInteger"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2437:1: ruleECLInteger returns [EObject current=null] : (otherlv_0= 'INTEGER' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleECLInteger() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_INT_1=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2440:28: ( (otherlv_0= 'INTEGER' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2441:1: (otherlv_0= 'INTEGER' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2441:1: (otherlv_0= 'INTEGER' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2441:3: otherlv_0= 'INTEGER' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,73,FOLLOW_73_in_ruleECLInteger5497); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getECLIntegerAccess().getINTEGERKeyword_0());
                  
            }
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2445:1: (this_INT_1= RULE_INT )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_INT) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2445:2: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleECLInteger5509); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_1, grammarAccess.getECLIntegerAccess().getINTTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2449:3: ( (lv_name_2_0= RULE_ID ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2450:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2450:1: (lv_name_2_0= RULE_ID )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2451:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleECLInteger5527); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getECLIntegerAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getECLIntegerRule());
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


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleECLInteger"


    // $ANTLR start "entryRuleECLUnsigned"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2475:1: entryRuleECLUnsigned returns [EObject current=null] : iv_ruleECLUnsigned= ruleECLUnsigned EOF ;
    public final EObject entryRuleECLUnsigned() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleECLUnsigned = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2476:2: (iv_ruleECLUnsigned= ruleECLUnsigned EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2477:2: iv_ruleECLUnsigned= ruleECLUnsigned EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getECLUnsignedRule()); 
            }
            pushFollow(FOLLOW_ruleECLUnsigned_in_entryRuleECLUnsigned5568);
            iv_ruleECLUnsigned=ruleECLUnsigned();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleECLUnsigned; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleECLUnsigned5578); if (state.failed) return current;

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
    // $ANTLR end "entryRuleECLUnsigned"


    // $ANTLR start "ruleECLUnsigned"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2484:1: ruleECLUnsigned returns [EObject current=null] : (otherlv_0= 'UNSIGNED' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleECLUnsigned() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_INT_1=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2487:28: ( (otherlv_0= 'UNSIGNED' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2488:1: (otherlv_0= 'UNSIGNED' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2488:1: (otherlv_0= 'UNSIGNED' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2488:3: otherlv_0= 'UNSIGNED' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,78,FOLLOW_78_in_ruleECLUnsigned5615); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getECLUnsignedAccess().getUNSIGNEDKeyword_0());
                  
            }
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2492:1: (this_INT_1= RULE_INT )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_INT) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2492:2: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleECLUnsigned5627); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_1, grammarAccess.getECLUnsignedAccess().getINTTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2496:3: ( (lv_name_2_0= RULE_ID ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2497:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2497:1: (lv_name_2_0= RULE_ID )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2498:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleECLUnsigned5645); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getECLUnsignedAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getECLUnsignedRule());
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


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleECLUnsigned"


    // $ANTLR start "entryRuleECLString"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2522:1: entryRuleECLString returns [EObject current=null] : iv_ruleECLString= ruleECLString EOF ;
    public final EObject entryRuleECLString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleECLString = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2523:2: (iv_ruleECLString= ruleECLString EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2524:2: iv_ruleECLString= ruleECLString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getECLStringRule()); 
            }
            pushFollow(FOLLOW_ruleECLString_in_entryRuleECLString5686);
            iv_ruleECLString=ruleECLString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleECLString; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleECLString5696); if (state.failed) return current;

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
    // $ANTLR end "entryRuleECLString"


    // $ANTLR start "ruleECLString"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2531:1: ruleECLString returns [EObject current=null] : (otherlv_0= 'STRING' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleECLString() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_INT_1=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2534:28: ( (otherlv_0= 'STRING' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2535:1: (otherlv_0= 'STRING' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2535:1: (otherlv_0= 'STRING' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2535:3: otherlv_0= 'STRING' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_43_in_ruleECLString5733); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getECLStringAccess().getSTRINGKeyword_0());
                  
            }
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2539:1: (this_INT_1= RULE_INT )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_INT) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2539:2: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleECLString5745); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_1, grammarAccess.getECLStringAccess().getINTTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2543:3: ( (lv_name_2_0= RULE_ID ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2544:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2544:1: (lv_name_2_0= RULE_ID )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2545:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleECLString5763); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getECLStringAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getECLStringRule());
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


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleECLString"


    // $ANTLR start "entryRuleECLQstring"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2569:1: entryRuleECLQstring returns [EObject current=null] : iv_ruleECLQstring= ruleECLQstring EOF ;
    public final EObject entryRuleECLQstring() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleECLQstring = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2570:2: (iv_ruleECLQstring= ruleECLQstring EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2571:2: iv_ruleECLQstring= ruleECLQstring EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getECLQstringRule()); 
            }
            pushFollow(FOLLOW_ruleECLQstring_in_entryRuleECLQstring5804);
            iv_ruleECLQstring=ruleECLQstring();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleECLQstring; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleECLQstring5814); if (state.failed) return current;

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
    // $ANTLR end "entryRuleECLQstring"


    // $ANTLR start "ruleECLQstring"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2578:1: ruleECLQstring returns [EObject current=null] : (otherlv_0= 'QSTRING' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleECLQstring() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_INT_1=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2581:28: ( (otherlv_0= 'QSTRING' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2582:1: (otherlv_0= 'QSTRING' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2582:1: (otherlv_0= 'QSTRING' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2582:3: otherlv_0= 'QSTRING' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,79,FOLLOW_79_in_ruleECLQstring5851); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getECLQstringAccess().getQSTRINGKeyword_0());
                  
            }
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2586:1: (this_INT_1= RULE_INT )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_INT) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2586:2: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleECLQstring5863); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_1, grammarAccess.getECLQstringAccess().getINTTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2590:3: ( (lv_name_2_0= RULE_ID ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2591:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2591:1: (lv_name_2_0= RULE_ID )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2592:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleECLQstring5881); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getECLQstringAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getECLQstringRule());
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


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleECLQstring"


    // $ANTLR start "entryRuleECLVarstring"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2616:1: entryRuleECLVarstring returns [EObject current=null] : iv_ruleECLVarstring= ruleECLVarstring EOF ;
    public final EObject entryRuleECLVarstring() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleECLVarstring = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2617:2: (iv_ruleECLVarstring= ruleECLVarstring EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2618:2: iv_ruleECLVarstring= ruleECLVarstring EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getECLVarstringRule()); 
            }
            pushFollow(FOLLOW_ruleECLVarstring_in_entryRuleECLVarstring5922);
            iv_ruleECLVarstring=ruleECLVarstring();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleECLVarstring; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleECLVarstring5932); if (state.failed) return current;

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
    // $ANTLR end "entryRuleECLVarstring"


    // $ANTLR start "ruleECLVarstring"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2625:1: ruleECLVarstring returns [EObject current=null] : (otherlv_0= 'VARSTRING' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleECLVarstring() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_INT_1=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2628:28: ( (otherlv_0= 'VARSTRING' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2629:1: (otherlv_0= 'VARSTRING' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2629:1: (otherlv_0= 'VARSTRING' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2629:3: otherlv_0= 'VARSTRING' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,80,FOLLOW_80_in_ruleECLVarstring5969); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getECLVarstringAccess().getVARSTRINGKeyword_0());
                  
            }
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2633:1: (this_INT_1= RULE_INT )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_INT) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2633:2: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleECLVarstring5981); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_1, grammarAccess.getECLVarstringAccess().getINTTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2637:3: ( (lv_name_2_0= RULE_ID ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2638:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2638:1: (lv_name_2_0= RULE_ID )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2639:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleECLVarstring5999); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getECLVarstringAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getECLVarstringRule());
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


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleECLVarstring"


    // $ANTLR start "entryRuleECLUnicode"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2663:1: entryRuleECLUnicode returns [EObject current=null] : iv_ruleECLUnicode= ruleECLUnicode EOF ;
    public final EObject entryRuleECLUnicode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleECLUnicode = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2664:2: (iv_ruleECLUnicode= ruleECLUnicode EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2665:2: iv_ruleECLUnicode= ruleECLUnicode EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getECLUnicodeRule()); 
            }
            pushFollow(FOLLOW_ruleECLUnicode_in_entryRuleECLUnicode6040);
            iv_ruleECLUnicode=ruleECLUnicode();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleECLUnicode; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleECLUnicode6050); if (state.failed) return current;

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
    // $ANTLR end "entryRuleECLUnicode"


    // $ANTLR start "ruleECLUnicode"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2672:1: ruleECLUnicode returns [EObject current=null] : (otherlv_0= 'UNICODE' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleECLUnicode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_INT_1=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2675:28: ( (otherlv_0= 'UNICODE' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2676:1: (otherlv_0= 'UNICODE' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2676:1: (otherlv_0= 'UNICODE' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2676:3: otherlv_0= 'UNICODE' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,71,FOLLOW_71_in_ruleECLUnicode6087); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getECLUnicodeAccess().getUNICODEKeyword_0());
                  
            }
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2680:1: (this_INT_1= RULE_INT )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_INT) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2680:2: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleECLUnicode6099); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_1, grammarAccess.getECLUnicodeAccess().getINTTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2684:3: ( (lv_name_2_0= RULE_ID ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2685:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2685:1: (lv_name_2_0= RULE_ID )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2686:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleECLUnicode6117); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getECLUnicodeAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getECLUnicodeRule());
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


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleECLUnicode"


    // $ANTLR start "entryRuleECLVarunicode"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2710:1: entryRuleECLVarunicode returns [EObject current=null] : iv_ruleECLVarunicode= ruleECLVarunicode EOF ;
    public final EObject entryRuleECLVarunicode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleECLVarunicode = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2711:2: (iv_ruleECLVarunicode= ruleECLVarunicode EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2712:2: iv_ruleECLVarunicode= ruleECLVarunicode EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getECLVarunicodeRule()); 
            }
            pushFollow(FOLLOW_ruleECLVarunicode_in_entryRuleECLVarunicode6158);
            iv_ruleECLVarunicode=ruleECLVarunicode();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleECLVarunicode; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleECLVarunicode6168); if (state.failed) return current;

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
    // $ANTLR end "entryRuleECLVarunicode"


    // $ANTLR start "ruleECLVarunicode"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2719:1: ruleECLVarunicode returns [EObject current=null] : (otherlv_0= 'VARUNICODE' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleECLVarunicode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_INT_1=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2722:28: ( (otherlv_0= 'VARUNICODE' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2723:1: (otherlv_0= 'VARUNICODE' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2723:1: (otherlv_0= 'VARUNICODE' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2723:3: otherlv_0= 'VARUNICODE' (this_INT_1= RULE_INT )? ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,81,FOLLOW_81_in_ruleECLVarunicode6205); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getECLVarunicodeAccess().getVARUNICODEKeyword_0());
                  
            }
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2727:1: (this_INT_1= RULE_INT )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_INT) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2727:2: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleECLVarunicode6217); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_1, grammarAccess.getECLVarunicodeAccess().getINTTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2731:3: ( (lv_name_2_0= RULE_ID ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2732:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2732:1: (lv_name_2_0= RULE_ID )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2733:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleECLVarunicode6235); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getECLVarunicodeAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getECLVarunicodeRule());
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


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleECLVarunicode"


    // $ANTLR start "entryRuleECLData"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2757:1: entryRuleECLData returns [EObject current=null] : iv_ruleECLData= ruleECLData EOF ;
    public final EObject entryRuleECLData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleECLData = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2758:2: (iv_ruleECLData= ruleECLData EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2759:2: iv_ruleECLData= ruleECLData EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getECLDataRule()); 
            }
            pushFollow(FOLLOW_ruleECLData_in_entryRuleECLData6276);
            iv_ruleECLData=ruleECLData();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleECLData; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleECLData6286); if (state.failed) return current;

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
    // $ANTLR end "entryRuleECLData"


    // $ANTLR start "ruleECLData"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2766:1: ruleECLData returns [EObject current=null] : (otherlv_0= 'DATA' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleECLData() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2769:28: ( (otherlv_0= 'DATA' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2770:1: (otherlv_0= 'DATA' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2770:1: (otherlv_0= 'DATA' ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2770:3: otherlv_0= 'DATA' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,82,FOLLOW_82_in_ruleECLData6323); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getECLDataAccess().getDATAKeyword_0());
                  
            }
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2774:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2775:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2775:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2776:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleECLData6340); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getECLDataAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getECLDataRule());
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


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleECLData"


    // $ANTLR start "entryRuleECLReal"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2800:1: entryRuleECLReal returns [EObject current=null] : iv_ruleECLReal= ruleECLReal EOF ;
    public final EObject entryRuleECLReal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleECLReal = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2801:2: (iv_ruleECLReal= ruleECLReal EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2802:2: iv_ruleECLReal= ruleECLReal EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getECLRealRule()); 
            }
            pushFollow(FOLLOW_ruleECLReal_in_entryRuleECLReal6381);
            iv_ruleECLReal=ruleECLReal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleECLReal; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleECLReal6391); if (state.failed) return current;

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
    // $ANTLR end "entryRuleECLReal"


    // $ANTLR start "ruleECLReal"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2809:1: ruleECLReal returns [EObject current=null] : (otherlv_0= 'REAL' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleECLReal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2812:28: ( (otherlv_0= 'REAL' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2813:1: (otherlv_0= 'REAL' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2813:1: (otherlv_0= 'REAL' ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2813:3: otherlv_0= 'REAL' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,76,FOLLOW_76_in_ruleECLReal6428); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getECLRealAccess().getREALKeyword_0());
                  
            }
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2817:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2818:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2818:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2819:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleECLReal6445); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getECLRealAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getECLRealRule());
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


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleECLReal"


    // $ANTLR start "entryRuleECLfieldType"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2843:1: entryRuleECLfieldType returns [EObject current=null] : iv_ruleECLfieldType= ruleECLfieldType EOF ;
    public final EObject entryRuleECLfieldType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleECLfieldType = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2844:2: (iv_ruleECLfieldType= ruleECLfieldType EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2845:2: iv_ruleECLfieldType= ruleECLfieldType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getECLfieldTypeRule()); 
            }
            pushFollow(FOLLOW_ruleECLfieldType_in_entryRuleECLfieldType6486);
            iv_ruleECLfieldType=ruleECLfieldType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleECLfieldType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleECLfieldType6496); if (state.failed) return current;

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
    // $ANTLR end "entryRuleECLfieldType"


    // $ANTLR start "ruleECLfieldType"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2852:1: ruleECLfieldType returns [EObject current=null] : (this_ECLInteger_0= ruleECLInteger | this_ECLQstring_1= ruleECLQstring | this_ECLString_2= ruleECLString | this_ECLReal_3= ruleECLReal | this_ECLUnicode_4= ruleECLUnicode | this_ECLData_5= ruleECLData | this_ECLVarstring_6= ruleECLVarstring | this_ECLVarunicode_7= ruleECLVarunicode | this_ECLUnsigned_8= ruleECLUnsigned ) ;
    public final EObject ruleECLfieldType() throws RecognitionException {
        EObject current = null;

        EObject this_ECLInteger_0 = null;

        EObject this_ECLQstring_1 = null;

        EObject this_ECLString_2 = null;

        EObject this_ECLReal_3 = null;

        EObject this_ECLUnicode_4 = null;

        EObject this_ECLData_5 = null;

        EObject this_ECLVarstring_6 = null;

        EObject this_ECLVarunicode_7 = null;

        EObject this_ECLUnsigned_8 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2855:28: ( (this_ECLInteger_0= ruleECLInteger | this_ECLQstring_1= ruleECLQstring | this_ECLString_2= ruleECLString | this_ECLReal_3= ruleECLReal | this_ECLUnicode_4= ruleECLUnicode | this_ECLData_5= ruleECLData | this_ECLVarstring_6= ruleECLVarstring | this_ECLVarunicode_7= ruleECLVarunicode | this_ECLUnsigned_8= ruleECLUnsigned ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2856:1: (this_ECLInteger_0= ruleECLInteger | this_ECLQstring_1= ruleECLQstring | this_ECLString_2= ruleECLString | this_ECLReal_3= ruleECLReal | this_ECLUnicode_4= ruleECLUnicode | this_ECLData_5= ruleECLData | this_ECLVarstring_6= ruleECLVarstring | this_ECLVarunicode_7= ruleECLVarunicode | this_ECLUnsigned_8= ruleECLUnsigned )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2856:1: (this_ECLInteger_0= ruleECLInteger | this_ECLQstring_1= ruleECLQstring | this_ECLString_2= ruleECLString | this_ECLReal_3= ruleECLReal | this_ECLUnicode_4= ruleECLUnicode | this_ECLData_5= ruleECLData | this_ECLVarstring_6= ruleECLVarstring | this_ECLVarunicode_7= ruleECLVarunicode | this_ECLUnsigned_8= ruleECLUnsigned )
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
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2857:5: this_ECLInteger_0= ruleECLInteger
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getECLfieldTypeAccess().getECLIntegerParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleECLInteger_in_ruleECLfieldType6543);
                    this_ECLInteger_0=ruleECLInteger();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ECLInteger_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2867:5: this_ECLQstring_1= ruleECLQstring
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getECLfieldTypeAccess().getECLQstringParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleECLQstring_in_ruleECLfieldType6570);
                    this_ECLQstring_1=ruleECLQstring();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ECLQstring_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2877:5: this_ECLString_2= ruleECLString
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getECLfieldTypeAccess().getECLStringParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleECLString_in_ruleECLfieldType6597);
                    this_ECLString_2=ruleECLString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ECLString_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2887:5: this_ECLReal_3= ruleECLReal
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getECLfieldTypeAccess().getECLRealParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleECLReal_in_ruleECLfieldType6624);
                    this_ECLReal_3=ruleECLReal();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ECLReal_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2897:5: this_ECLUnicode_4= ruleECLUnicode
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getECLfieldTypeAccess().getECLUnicodeParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleECLUnicode_in_ruleECLfieldType6651);
                    this_ECLUnicode_4=ruleECLUnicode();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ECLUnicode_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2907:5: this_ECLData_5= ruleECLData
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getECLfieldTypeAccess().getECLDataParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleECLData_in_ruleECLfieldType6678);
                    this_ECLData_5=ruleECLData();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ECLData_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2917:5: this_ECLVarstring_6= ruleECLVarstring
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getECLfieldTypeAccess().getECLVarstringParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleECLVarstring_in_ruleECLfieldType6705);
                    this_ECLVarstring_6=ruleECLVarstring();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ECLVarstring_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2927:5: this_ECLVarunicode_7= ruleECLVarunicode
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getECLfieldTypeAccess().getECLVarunicodeParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleECLVarunicode_in_ruleECLfieldType6732);
                    this_ECLVarunicode_7=ruleECLVarunicode();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ECLVarunicode_7; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2937:5: this_ECLUnsigned_8= ruleECLUnsigned
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getECLfieldTypeAccess().getECLUnsignedParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleECLUnsigned_in_ruleECLfieldType6759);
                    this_ECLUnsigned_8=ruleECLUnsigned();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ECLUnsigned_8; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleECLfieldType"


    // $ANTLR start "entryRuleECLOutputDecl"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2955:1: entryRuleECLOutputDecl returns [EObject current=null] : iv_ruleECLOutputDecl= ruleECLOutputDecl EOF ;
    public final EObject entryRuleECLOutputDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleECLOutputDecl = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2956:2: (iv_ruleECLOutputDecl= ruleECLOutputDecl EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2957:2: iv_ruleECLOutputDecl= ruleECLOutputDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getECLOutputDeclRule()); 
            }
            pushFollow(FOLLOW_ruleECLOutputDecl_in_entryRuleECLOutputDecl6796);
            iv_ruleECLOutputDecl=ruleECLOutputDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleECLOutputDecl; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleECLOutputDecl6806); if (state.failed) return current;

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
    // $ANTLR end "entryRuleECLOutputDecl"


    // $ANTLR start "ruleECLOutputDecl"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2964:1: ruleECLOutputDecl returns [EObject current=null] : (this_ECLfieldType_0= ruleECLfieldType ( (lv_options_1_0= ruleOutputOptions ) )? otherlv_2= ';' ) ;
    public final EObject ruleECLOutputDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ECLfieldType_0 = null;

        EObject lv_options_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2967:28: ( (this_ECLfieldType_0= ruleECLfieldType ( (lv_options_1_0= ruleOutputOptions ) )? otherlv_2= ';' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2968:1: (this_ECLfieldType_0= ruleECLfieldType ( (lv_options_1_0= ruleOutputOptions ) )? otherlv_2= ';' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2968:1: (this_ECLfieldType_0= ruleECLfieldType ( (lv_options_1_0= ruleOutputOptions ) )? otherlv_2= ';' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2969:5: this_ECLfieldType_0= ruleECLfieldType ( (lv_options_1_0= ruleOutputOptions ) )? otherlv_2= ';'
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getECLOutputDeclAccess().getECLfieldTypeParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleECLfieldType_in_ruleECLOutputDecl6853);
            this_ECLfieldType_0=ruleECLfieldType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ECLfieldType_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2977:1: ( (lv_options_1_0= ruleOutputOptions ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==35) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2978:1: (lv_options_1_0= ruleOutputOptions )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2978:1: (lv_options_1_0= ruleOutputOptions )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2979:3: lv_options_1_0= ruleOutputOptions
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getECLOutputDeclAccess().getOptionsOutputOptionsParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOutputOptions_in_ruleECLOutputDecl6873);
                    lv_options_1_0=ruleOutputOptions();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getECLOutputDeclRule());
                      	        }
                             		set(
                             			current, 
                             			"options",
                              		lv_options_1_0, 
                              		"OutputOptions");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleECLOutputDecl6886); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getECLOutputDeclAccess().getSemicolonKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleECLOutputDecl"


    // $ANTLR start "entryRuleOutputOption"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3007:1: entryRuleOutputOption returns [EObject current=null] : iv_ruleOutputOption= ruleOutputOption EOF ;
    public final EObject entryRuleOutputOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputOption = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3008:2: (iv_ruleOutputOption= ruleOutputOption EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3009:2: iv_ruleOutputOption= ruleOutputOption EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOutputOptionRule()); 
            }
            pushFollow(FOLLOW_ruleOutputOption_in_entryRuleOutputOption6922);
            iv_ruleOutputOption=ruleOutputOption();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOutputOption; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOutputOption6932); if (state.failed) return current;

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3016:1: ruleOutputOption returns [EObject current=null] : ( ( ( (lv_name_0_0= 'SIDE' ) ) | ( (lv_name_1_0= 'LARGE' ) ) | ( (lv_name_2_0= 'SMALL' ) ) | ( (lv_name_3_0= 'FEW' ) ) | ( (lv_name_4_0= 'WUID' ) ) ) | ( ( (lv_name_5_0= 'FROM' ) ) otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) otherlv_8= ')' ) | ( ( (lv_name_9_0= 'DESCRIPTION' ) ) otherlv_10= '(' ( (lv_vals_11_0= ruleValue ) ) otherlv_12= ')' ) ) ;
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
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3019:28: ( ( ( ( (lv_name_0_0= 'SIDE' ) ) | ( (lv_name_1_0= 'LARGE' ) ) | ( (lv_name_2_0= 'SMALL' ) ) | ( (lv_name_3_0= 'FEW' ) ) | ( (lv_name_4_0= 'WUID' ) ) ) | ( ( (lv_name_5_0= 'FROM' ) ) otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) otherlv_8= ')' ) | ( ( (lv_name_9_0= 'DESCRIPTION' ) ) otherlv_10= '(' ( (lv_vals_11_0= ruleValue ) ) otherlv_12= ')' ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3020:1: ( ( ( (lv_name_0_0= 'SIDE' ) ) | ( (lv_name_1_0= 'LARGE' ) ) | ( (lv_name_2_0= 'SMALL' ) ) | ( (lv_name_3_0= 'FEW' ) ) | ( (lv_name_4_0= 'WUID' ) ) ) | ( ( (lv_name_5_0= 'FROM' ) ) otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) otherlv_8= ')' ) | ( ( (lv_name_9_0= 'DESCRIPTION' ) ) otherlv_10= '(' ( (lv_vals_11_0= ruleValue ) ) otherlv_12= ')' ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3020:1: ( ( ( (lv_name_0_0= 'SIDE' ) ) | ( (lv_name_1_0= 'LARGE' ) ) | ( (lv_name_2_0= 'SMALL' ) ) | ( (lv_name_3_0= 'FEW' ) ) | ( (lv_name_4_0= 'WUID' ) ) ) | ( ( (lv_name_5_0= 'FROM' ) ) otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) otherlv_8= ')' ) | ( ( (lv_name_9_0= 'DESCRIPTION' ) ) otherlv_10= '(' ( (lv_vals_11_0= ruleValue ) ) otherlv_12= ')' ) )
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
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3020:2: ( ( (lv_name_0_0= 'SIDE' ) ) | ( (lv_name_1_0= 'LARGE' ) ) | ( (lv_name_2_0= 'SMALL' ) ) | ( (lv_name_3_0= 'FEW' ) ) | ( (lv_name_4_0= 'WUID' ) ) )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3020:2: ( ( (lv_name_0_0= 'SIDE' ) ) | ( (lv_name_1_0= 'LARGE' ) ) | ( (lv_name_2_0= 'SMALL' ) ) | ( (lv_name_3_0= 'FEW' ) ) | ( (lv_name_4_0= 'WUID' ) ) )
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
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 47, 0, input);

                        throw nvae;
                    }

                    switch (alt47) {
                        case 1 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3020:3: ( (lv_name_0_0= 'SIDE' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3020:3: ( (lv_name_0_0= 'SIDE' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3021:1: (lv_name_0_0= 'SIDE' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3021:1: (lv_name_0_0= 'SIDE' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3022:3: lv_name_0_0= 'SIDE'
                            {
                            lv_name_0_0=(Token)match(input,83,FOLLOW_83_in_ruleOutputOption6976); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_name_0_0, grammarAccess.getOutputOptionAccess().getNameSIDEKeyword_0_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getOutputOptionRule());
                              	        }
                                     		setWithLastConsumed(current, "name", lv_name_0_0, "SIDE");
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3036:6: ( (lv_name_1_0= 'LARGE' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3036:6: ( (lv_name_1_0= 'LARGE' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3037:1: (lv_name_1_0= 'LARGE' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3037:1: (lv_name_1_0= 'LARGE' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3038:3: lv_name_1_0= 'LARGE'
                            {
                            lv_name_1_0=(Token)match(input,84,FOLLOW_84_in_ruleOutputOption7013); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_name_1_0, grammarAccess.getOutputOptionAccess().getNameLARGEKeyword_0_1_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getOutputOptionRule());
                              	        }
                                     		setWithLastConsumed(current, "name", lv_name_1_0, "LARGE");
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 3 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3052:6: ( (lv_name_2_0= 'SMALL' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3052:6: ( (lv_name_2_0= 'SMALL' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3053:1: (lv_name_2_0= 'SMALL' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3053:1: (lv_name_2_0= 'SMALL' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3054:3: lv_name_2_0= 'SMALL'
                            {
                            lv_name_2_0=(Token)match(input,85,FOLLOW_85_in_ruleOutputOption7050); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_name_2_0, grammarAccess.getOutputOptionAccess().getNameSMALLKeyword_0_2_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getOutputOptionRule());
                              	        }
                                     		setWithLastConsumed(current, "name", lv_name_2_0, "SMALL");
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 4 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3068:6: ( (lv_name_3_0= 'FEW' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3068:6: ( (lv_name_3_0= 'FEW' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3069:1: (lv_name_3_0= 'FEW' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3069:1: (lv_name_3_0= 'FEW' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3070:3: lv_name_3_0= 'FEW'
                            {
                            lv_name_3_0=(Token)match(input,86,FOLLOW_86_in_ruleOutputOption7087); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_name_3_0, grammarAccess.getOutputOptionAccess().getNameFEWKeyword_0_3_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getOutputOptionRule());
                              	        }
                                     		setWithLastConsumed(current, "name", lv_name_3_0, "FEW");
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 5 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3084:6: ( (lv_name_4_0= 'WUID' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3084:6: ( (lv_name_4_0= 'WUID' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3085:1: (lv_name_4_0= 'WUID' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3085:1: (lv_name_4_0= 'WUID' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3086:3: lv_name_4_0= 'WUID'
                            {
                            lv_name_4_0=(Token)match(input,87,FOLLOW_87_in_ruleOutputOption7124); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_name_4_0, grammarAccess.getOutputOptionAccess().getNameWUIDKeyword_0_4_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getOutputOptionRule());
                              	        }
                                     		setWithLastConsumed(current, "name", lv_name_4_0, "WUID");
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3100:6: ( ( (lv_name_5_0= 'FROM' ) ) otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) otherlv_8= ')' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3100:6: ( ( (lv_name_5_0= 'FROM' ) ) otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) otherlv_8= ')' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3100:7: ( (lv_name_5_0= 'FROM' ) ) otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) otherlv_8= ')'
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3100:7: ( (lv_name_5_0= 'FROM' ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3101:1: (lv_name_5_0= 'FROM' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3101:1: (lv_name_5_0= 'FROM' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3102:3: lv_name_5_0= 'FROM'
                    {
                    lv_name_5_0=(Token)match(input,88,FOLLOW_88_in_ruleOutputOption7163); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_5_0, grammarAccess.getOutputOptionAccess().getNameFROMKeyword_1_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getOutputOptionRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_5_0, "FROM");
                      	    
                    }

                    }


                    }

                    otherlv_6=(Token)match(input,36,FOLLOW_36_in_ruleOutputOption7188); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getOutputOptionAccess().getLeftParenthesisKeyword_1_1());
                          
                    }
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3119:1: ( (otherlv_7= RULE_ID ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3120:1: (otherlv_7= RULE_ID )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3120:1: (otherlv_7= RULE_ID )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3121:3: otherlv_7= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getOutputOptionRule());
                      	        }
                              
                    }
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOutputOption7208); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_7, grammarAccess.getOutputOptionAccess().getVarsDatatypeCrossReference_1_2_0()); 
                      	
                    }

                    }


                    }

                    otherlv_8=(Token)match(input,37,FOLLOW_37_in_ruleOutputOption7220); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getOutputOptionAccess().getRightParenthesisKeyword_1_3());
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3137:6: ( ( (lv_name_9_0= 'DESCRIPTION' ) ) otherlv_10= '(' ( (lv_vals_11_0= ruleValue ) ) otherlv_12= ')' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3137:6: ( ( (lv_name_9_0= 'DESCRIPTION' ) ) otherlv_10= '(' ( (lv_vals_11_0= ruleValue ) ) otherlv_12= ')' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3137:7: ( (lv_name_9_0= 'DESCRIPTION' ) ) otherlv_10= '(' ( (lv_vals_11_0= ruleValue ) ) otherlv_12= ')'
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3137:7: ( (lv_name_9_0= 'DESCRIPTION' ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3138:1: (lv_name_9_0= 'DESCRIPTION' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3138:1: (lv_name_9_0= 'DESCRIPTION' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3139:3: lv_name_9_0= 'DESCRIPTION'
                    {
                    lv_name_9_0=(Token)match(input,13,FOLLOW_13_in_ruleOutputOption7246); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_9_0, grammarAccess.getOutputOptionAccess().getNameDESCRIPTIONKeyword_2_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getOutputOptionRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_9_0, "DESCRIPTION");
                      	    
                    }

                    }


                    }

                    otherlv_10=(Token)match(input,36,FOLLOW_36_in_ruleOutputOption7271); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getOutputOptionAccess().getLeftParenthesisKeyword_2_1());
                          
                    }
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3156:1: ( (lv_vals_11_0= ruleValue ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3157:1: (lv_vals_11_0= ruleValue )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3157:1: (lv_vals_11_0= ruleValue )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3158:3: lv_vals_11_0= ruleValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOutputOptionAccess().getValsValueParserRuleCall_2_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValue_in_ruleOutputOption7292);
                    lv_vals_11_0=ruleValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getOutputOptionRule());
                      	        }
                             		set(
                             			current, 
                             			"vals",
                              		lv_vals_11_0, 
                              		"Value");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_12=(Token)match(input,37,FOLLOW_37_in_ruleOutputOption7304); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getOutputOptionAccess().getRightParenthesisKeyword_2_3());
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOutputOption"


    // $ANTLR start "entryRuleOutputOptions"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3186:1: entryRuleOutputOptions returns [EObject current=null] : iv_ruleOutputOptions= ruleOutputOptions EOF ;
    public final EObject entryRuleOutputOptions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputOptions = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3187:2: (iv_ruleOutputOptions= ruleOutputOptions EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3188:2: iv_ruleOutputOptions= ruleOutputOptions EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOutputOptionsRule()); 
            }
            pushFollow(FOLLOW_ruleOutputOptions_in_entryRuleOutputOptions7341);
            iv_ruleOutputOptions=ruleOutputOptions();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOutputOptions; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOutputOptions7351); if (state.failed) return current;

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3195:1: ruleOutputOptions returns [EObject current=null] : (otherlv_0= ':' ( (lv_output_ops_1_0= ruleOutputOption ) ) (otherlv_2= ',' ( (lv_output_ops_3_0= ruleOutputOption ) ) )* ) ;
    public final EObject ruleOutputOptions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_output_ops_1_0 = null;

        EObject lv_output_ops_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3198:28: ( (otherlv_0= ':' ( (lv_output_ops_1_0= ruleOutputOption ) ) (otherlv_2= ',' ( (lv_output_ops_3_0= ruleOutputOption ) ) )* ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3199:1: (otherlv_0= ':' ( (lv_output_ops_1_0= ruleOutputOption ) ) (otherlv_2= ',' ( (lv_output_ops_3_0= ruleOutputOption ) ) )* )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3199:1: (otherlv_0= ':' ( (lv_output_ops_1_0= ruleOutputOption ) ) (otherlv_2= ',' ( (lv_output_ops_3_0= ruleOutputOption ) ) )* )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3199:3: otherlv_0= ':' ( (lv_output_ops_1_0= ruleOutputOption ) ) (otherlv_2= ',' ( (lv_output_ops_3_0= ruleOutputOption ) ) )*
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleOutputOptions7388); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getOutputOptionsAccess().getColonKeyword_0());
                  
            }
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3203:1: ( (lv_output_ops_1_0= ruleOutputOption ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3204:1: (lv_output_ops_1_0= ruleOutputOption )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3204:1: (lv_output_ops_1_0= ruleOutputOption )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3205:3: lv_output_ops_1_0= ruleOutputOption
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOutputOptionsAccess().getOutput_opsOutputOptionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOutputOption_in_ruleOutputOptions7409);
            lv_output_ops_1_0=ruleOutputOption();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getOutputOptionsRule());
              	        }
                     		add(
                     			current, 
                     			"output_ops",
                      		lv_output_ops_1_0, 
                      		"OutputOption");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3221:2: (otherlv_2= ',' ( (lv_output_ops_3_0= ruleOutputOption ) ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==30) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3221:4: otherlv_2= ',' ( (lv_output_ops_3_0= ruleOutputOption ) )
            	    {
            	    otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleOutputOptions7422); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getOutputOptionsAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3225:1: ( (lv_output_ops_3_0= ruleOutputOption ) )
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3226:1: (lv_output_ops_3_0= ruleOutputOption )
            	    {
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3226:1: (lv_output_ops_3_0= ruleOutputOption )
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3227:3: lv_output_ops_3_0= ruleOutputOption
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOutputOptionsAccess().getOutput_opsOutputOptionParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOutputOption_in_ruleOutputOptions7443);
            	    lv_output_ops_3_0=ruleOutputOption();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getOutputOptionsRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"output_ops",
            	              		lv_output_ops_3_0, 
            	              		"OutputOption");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

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

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOutputOptions"


    // $ANTLR start "entryRuleOutType"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3251:1: entryRuleOutType returns [EObject current=null] : iv_ruleOutType= ruleOutType EOF ;
    public final EObject entryRuleOutType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutType = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3252:2: (iv_ruleOutType= ruleOutType EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3253:2: iv_ruleOutType= ruleOutType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOutTypeRule()); 
            }
            pushFollow(FOLLOW_ruleOutType_in_entryRuleOutType7481);
            iv_ruleOutType=ruleOutType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOutType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOutType7491); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOutType"


    // $ANTLR start "ruleOutType"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3260:1: ruleOutType returns [EObject current=null] : ( (otherlv_0= 'BOOL' | otherlv_1= 'INT' | otherlv_2= 'STRING' | otherlv_3= 'ACTION' )? ( (lv_val_4_0= ruleValue ) ) ) ;
    public final EObject ruleOutType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_val_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3263:28: ( ( (otherlv_0= 'BOOL' | otherlv_1= 'INT' | otherlv_2= 'STRING' | otherlv_3= 'ACTION' )? ( (lv_val_4_0= ruleValue ) ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3264:1: ( (otherlv_0= 'BOOL' | otherlv_1= 'INT' | otherlv_2= 'STRING' | otherlv_3= 'ACTION' )? ( (lv_val_4_0= ruleValue ) ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3264:1: ( (otherlv_0= 'BOOL' | otherlv_1= 'INT' | otherlv_2= 'STRING' | otherlv_3= 'ACTION' )? ( (lv_val_4_0= ruleValue ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3264:2: (otherlv_0= 'BOOL' | otherlv_1= 'INT' | otherlv_2= 'STRING' | otherlv_3= 'ACTION' )? ( (lv_val_4_0= ruleValue ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3264:2: (otherlv_0= 'BOOL' | otherlv_1= 'INT' | otherlv_2= 'STRING' | otherlv_3= 'ACTION' )?
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
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3264:4: otherlv_0= 'BOOL'
                    {
                    otherlv_0=(Token)match(input,41,FOLLOW_41_in_ruleOutType7529); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getOutTypeAccess().getBOOLKeyword_0_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3269:7: otherlv_1= 'INT'
                    {
                    otherlv_1=(Token)match(input,42,FOLLOW_42_in_ruleOutType7547); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getOutTypeAccess().getINTKeyword_0_1());
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3274:7: otherlv_2= 'STRING'
                    {
                    otherlv_2=(Token)match(input,43,FOLLOW_43_in_ruleOutType7565); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getOutTypeAccess().getSTRINGKeyword_0_2());
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3279:7: otherlv_3= 'ACTION'
                    {
                    otherlv_3=(Token)match(input,89,FOLLOW_89_in_ruleOutType7583); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getOutTypeAccess().getACTIONKeyword_0_3());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3283:3: ( (lv_val_4_0= ruleValue ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3284:1: (lv_val_4_0= ruleValue )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3284:1: (lv_val_4_0= ruleValue )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3285:3: lv_val_4_0= ruleValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOutTypeAccess().getValValueParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValue_in_ruleOutType7606);
            lv_val_4_0=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getOutTypeRule());
              	        }
                     		set(
                     			current, 
                     			"val",
                      		lv_val_4_0, 
                      		"Value");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOutType"


    // $ANTLR start "entryRuleOutDataset"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3309:1: entryRuleOutDataset returns [EObject current=null] : iv_ruleOutDataset= ruleOutDataset EOF ;
    public final EObject entryRuleOutDataset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutDataset = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3310:2: (iv_ruleOutDataset= ruleOutDataset EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3311:2: iv_ruleOutDataset= ruleOutDataset EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOutDatasetRule()); 
            }
            pushFollow(FOLLOW_ruleOutDataset_in_entryRuleOutDataset7642);
            iv_ruleOutDataset=ruleOutDataset();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOutDataset; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOutDataset7652); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOutDataset"


    // $ANTLR start "ruleOutDataset"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3318:1: ruleOutDataset returns [EObject current=null] : (otherlv_0= 'DATASET' ( (lv_name_1_0= RULE_ID ) ) ( (lv_out_base_2_0= ruleOutputBase ) )? ( (lv_ops_3_0= ruleOutputOptions ) )? ) ;
    public final EObject ruleOutDataset() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_out_base_2_0 = null;

        EObject lv_ops_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3321:28: ( (otherlv_0= 'DATASET' ( (lv_name_1_0= RULE_ID ) ) ( (lv_out_base_2_0= ruleOutputBase ) )? ( (lv_ops_3_0= ruleOutputOptions ) )? ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3322:1: (otherlv_0= 'DATASET' ( (lv_name_1_0= RULE_ID ) ) ( (lv_out_base_2_0= ruleOutputBase ) )? ( (lv_ops_3_0= ruleOutputOptions ) )? )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3322:1: (otherlv_0= 'DATASET' ( (lv_name_1_0= RULE_ID ) ) ( (lv_out_base_2_0= ruleOutputBase ) )? ( (lv_ops_3_0= ruleOutputOptions ) )? )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3322:3: otherlv_0= 'DATASET' ( (lv_name_1_0= RULE_ID ) ) ( (lv_out_base_2_0= ruleOutputBase ) )? ( (lv_ops_3_0= ruleOutputOptions ) )?
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleOutDataset7689); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getOutDatasetAccess().getDATASETKeyword_0());
                  
            }
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3326:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3327:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3327:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3328:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOutDataset7706); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getOutDatasetAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getOutDatasetRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3344:2: ( (lv_out_base_2_0= ruleOutputBase ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==36) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3345:1: (lv_out_base_2_0= ruleOutputBase )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3345:1: (lv_out_base_2_0= ruleOutputBase )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3346:3: lv_out_base_2_0= ruleOutputBase
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOutDatasetAccess().getOut_baseOutputBaseParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOutputBase_in_ruleOutDataset7732);
                    lv_out_base_2_0=ruleOutputBase();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getOutDatasetRule());
                      	        }
                             		set(
                             			current, 
                             			"out_base",
                              		lv_out_base_2_0, 
                              		"OutputBase");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3362:3: ( (lv_ops_3_0= ruleOutputOptions ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==35) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3363:1: (lv_ops_3_0= ruleOutputOptions )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3363:1: (lv_ops_3_0= ruleOutputOptions )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3364:3: lv_ops_3_0= ruleOutputOptions
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOutDatasetAccess().getOpsOutputOptionsParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOutputOptions_in_ruleOutDataset7754);
                    lv_ops_3_0=ruleOutputOptions();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getOutDatasetRule());
                      	        }
                             		add(
                             			current, 
                             			"ops",
                              		lv_ops_3_0, 
                              		"OutputOptions");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOutDataset"


    // $ANTLR start "entryRuleOutputValue"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3388:1: entryRuleOutputValue returns [EObject current=null] : iv_ruleOutputValue= ruleOutputValue EOF ;
    public final EObject entryRuleOutputValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputValue = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3389:2: (iv_ruleOutputValue= ruleOutputValue EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3390:2: iv_ruleOutputValue= ruleOutputValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOutputValueRule()); 
            }
            pushFollow(FOLLOW_ruleOutputValue_in_entryRuleOutputValue7791);
            iv_ruleOutputValue=ruleOutputValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOutputValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOutputValue7801); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOutputValue"


    // $ANTLR start "ruleOutputValue"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3397:1: ruleOutputValue returns [EObject current=null] : ( (this_OutType_0= ruleOutType ( (lv_ops_1_0= ruleOutputOptions ) )? otherlv_2= ';' ) | (this_OutDataset_3= ruleOutDataset ( (lv_ecl_vars_4_0= ruleECLOutputDecl ) )* ( ( 'END' )=>otherlv_5= 'END' ) ) | (this_OutDataset_6= ruleOutDataset otherlv_7= ';' ) ) ;
    public final EObject ruleOutputValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject this_OutType_0 = null;

        EObject lv_ops_1_0 = null;

        EObject this_OutDataset_3 = null;

        EObject lv_ecl_vars_4_0 = null;

        EObject this_OutDataset_6 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3400:28: ( ( (this_OutType_0= ruleOutType ( (lv_ops_1_0= ruleOutputOptions ) )? otherlv_2= ';' ) | (this_OutDataset_3= ruleOutDataset ( (lv_ecl_vars_4_0= ruleECLOutputDecl ) )* ( ( 'END' )=>otherlv_5= 'END' ) ) | (this_OutDataset_6= ruleOutDataset otherlv_7= ';' ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3401:1: ( (this_OutType_0= ruleOutType ( (lv_ops_1_0= ruleOutputOptions ) )? otherlv_2= ';' ) | (this_OutDataset_3= ruleOutDataset ( (lv_ecl_vars_4_0= ruleECLOutputDecl ) )* ( ( 'END' )=>otherlv_5= 'END' ) ) | (this_OutDataset_6= ruleOutDataset otherlv_7= ';' ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3401:1: ( (this_OutType_0= ruleOutType ( (lv_ops_1_0= ruleOutputOptions ) )? otherlv_2= ';' ) | (this_OutDataset_3= ruleOutDataset ( (lv_ecl_vars_4_0= ruleECLOutputDecl ) )* ( ( 'END' )=>otherlv_5= 'END' ) ) | (this_OutDataset_6= ruleOutDataset otherlv_7= ';' ) )
            int alt55=3;
            alt55 = dfa55.predict(input);
            switch (alt55) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3401:2: (this_OutType_0= ruleOutType ( (lv_ops_1_0= ruleOutputOptions ) )? otherlv_2= ';' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3401:2: (this_OutType_0= ruleOutType ( (lv_ops_1_0= ruleOutputOptions ) )? otherlv_2= ';' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3402:5: this_OutType_0= ruleOutType ( (lv_ops_1_0= ruleOutputOptions ) )? otherlv_2= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOutputValueAccess().getOutTypeParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOutType_in_ruleOutputValue7849);
                    this_OutType_0=ruleOutType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_OutType_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3410:1: ( (lv_ops_1_0= ruleOutputOptions ) )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==35) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3411:1: (lv_ops_1_0= ruleOutputOptions )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3411:1: (lv_ops_1_0= ruleOutputOptions )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3412:3: lv_ops_1_0= ruleOutputOptions
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getOutputValueAccess().getOpsOutputOptionsParserRuleCall_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleOutputOptions_in_ruleOutputValue7869);
                            lv_ops_1_0=ruleOutputOptions();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getOutputValueRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"ops",
                                      		lv_ops_1_0, 
                                      		"OutputOptions");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }

                    otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleOutputValue7882); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getOutputValueAccess().getSemicolonKeyword_0_2());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3433:6: (this_OutDataset_3= ruleOutDataset ( (lv_ecl_vars_4_0= ruleECLOutputDecl ) )* ( ( 'END' )=>otherlv_5= 'END' ) )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3433:6: (this_OutDataset_3= ruleOutDataset ( (lv_ecl_vars_4_0= ruleECLOutputDecl ) )* ( ( 'END' )=>otherlv_5= 'END' ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3434:5: this_OutDataset_3= ruleOutDataset ( (lv_ecl_vars_4_0= ruleECLOutputDecl ) )* ( ( 'END' )=>otherlv_5= 'END' )
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOutputValueAccess().getOutDatasetParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOutDataset_in_ruleOutputValue7912);
                    this_OutDataset_3=ruleOutDataset();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_OutDataset_3; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3442:1: ( (lv_ecl_vars_4_0= ruleECLOutputDecl ) )*
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0==43||LA54_0==71||LA54_0==73||LA54_0==76||(LA54_0>=78 && LA54_0<=82)) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3443:1: (lv_ecl_vars_4_0= ruleECLOutputDecl )
                    	    {
                    	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3443:1: (lv_ecl_vars_4_0= ruleECLOutputDecl )
                    	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3444:3: lv_ecl_vars_4_0= ruleECLOutputDecl
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getOutputValueAccess().getEcl_varsECLOutputDeclParserRuleCall_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleECLOutputDecl_in_ruleOutputValue7932);
                    	    lv_ecl_vars_4_0=ruleECLOutputDecl();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getOutputValueRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"ecl_vars",
                    	              		lv_ecl_vars_4_0, 
                    	              		"ECLOutputDecl");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop54;
                        }
                    } while (true);

                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3460:3: ( ( 'END' )=>otherlv_5= 'END' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3460:4: ( 'END' )=>otherlv_5= 'END'
                    {
                    otherlv_5=(Token)match(input,33,FOLLOW_33_in_ruleOutputValue7953); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getOutputValueAccess().getENDKeyword_1_2());
                          
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3466:6: (this_OutDataset_6= ruleOutDataset otherlv_7= ';' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3466:6: (this_OutDataset_6= ruleOutDataset otherlv_7= ';' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3467:5: this_OutDataset_6= ruleOutDataset otherlv_7= ';'
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOutputValueAccess().getOutDatasetParserRuleCall_2_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOutDataset_in_ruleOutputValue7984);
                    this_OutDataset_6=ruleOutDataset();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_OutDataset_6; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleOutputValue7995); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getOutputValueAccess().getSemicolonKeyword_2_1());
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOutputValue"


    // $ANTLR start "entryRuleOutputBase"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3487:1: entryRuleOutputBase returns [EObject current=null] : iv_ruleOutputBase= ruleOutputBase EOF ;
    public final EObject entryRuleOutputBase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputBase = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3488:2: (iv_ruleOutputBase= ruleOutputBase EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3489:2: iv_ruleOutputBase= ruleOutputBase EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOutputBaseRule()); 
            }
            pushFollow(FOLLOW_ruleOutputBase_in_entryRuleOutputBase8032);
            iv_ruleOutputBase=ruleOutputBase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOutputBase; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOutputBase8042); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOutputBase"


    // $ANTLR start "ruleOutputBase"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3496:1: ruleOutputBase returns [EObject current=null] : (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ')' ) ;
    public final EObject ruleOutputBase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3499:28: ( (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ')' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3500:1: (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ')' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3500:1: (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ')' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3500:3: otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleOutputBase8079); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getOutputBaseAccess().getLeftParenthesisKeyword_0());
                  
            }
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3504:1: ( (otherlv_1= RULE_ID ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3505:1: (otherlv_1= RULE_ID )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3505:1: (otherlv_1= RULE_ID )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3506:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getOutputBaseRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOutputBase8099); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getOutputBaseAccess().getBaseDatatypeCrossReference_1_0()); 
              	
            }

            }


            }

            otherlv_2=(Token)match(input,37,FOLLOW_37_in_ruleOutputBase8111); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getOutputBaseAccess().getRightParenthesisKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOutputBase"


    // $ANTLR start "entryRuleGenerateSection"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3529:1: entryRuleGenerateSection returns [EObject current=null] : iv_ruleGenerateSection= ruleGenerateSection EOF ;
    public final EObject entryRuleGenerateSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenerateSection = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3530:2: (iv_ruleGenerateSection= ruleGenerateSection EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3531:2: iv_ruleGenerateSection= ruleGenerateSection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGenerateSectionRule()); 
            }
            pushFollow(FOLLOW_ruleGenerateSection_in_entryRuleGenerateSection8147);
            iv_ruleGenerateSection=ruleGenerateSection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGenerateSection; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGenerateSection8157); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGenerateSection"


    // $ANTLR start "ruleGenerateSection"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3538:1: ruleGenerateSection returns [EObject current=null] : (this_GenerateBodyInline_0= ruleGenerateBodyInline | this_GenerateBodySalt_1= ruleGenerateBodySalt ) ;
    public final EObject ruleGenerateSection() throws RecognitionException {
        EObject current = null;

        EObject this_GenerateBodyInline_0 = null;

        EObject this_GenerateBodySalt_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3541:28: ( (this_GenerateBodyInline_0= ruleGenerateBodyInline | this_GenerateBodySalt_1= ruleGenerateBodySalt ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3542:1: (this_GenerateBodyInline_0= ruleGenerateBodyInline | this_GenerateBodySalt_1= ruleGenerateBodySalt )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3542:1: (this_GenerateBodyInline_0= ruleGenerateBodyInline | this_GenerateBodySalt_1= ruleGenerateBodySalt )
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
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 56, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3543:5: this_GenerateBodyInline_0= ruleGenerateBodyInline
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getGenerateSectionAccess().getGenerateBodyInlineParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGenerateBodyInline_in_ruleGenerateSection8204);
                    this_GenerateBodyInline_0=ruleGenerateBodyInline();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_GenerateBodyInline_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3553:5: this_GenerateBodySalt_1= ruleGenerateBodySalt
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getGenerateSectionAccess().getGenerateBodySaltParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGenerateBodySalt_in_ruleGenerateSection8231);
                    this_GenerateBodySalt_1=ruleGenerateBodySalt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_GenerateBodySalt_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleGenerateSection"


    // $ANTLR start "entryRuleGenerateBodyInline"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3569:1: entryRuleGenerateBodyInline returns [EObject current=null] : iv_ruleGenerateBodyInline= ruleGenerateBodyInline EOF ;
    public final EObject entryRuleGenerateBodyInline() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenerateBodyInline = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3570:2: (iv_ruleGenerateBodyInline= ruleGenerateBodyInline EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3571:2: iv_ruleGenerateBodyInline= ruleGenerateBodyInline EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGenerateBodyInlineRule()); 
            }
            pushFollow(FOLLOW_ruleGenerateBodyInline_in_entryRuleGenerateBodyInline8266);
            iv_ruleGenerateBodyInline=ruleGenerateBodyInline();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGenerateBodyInline; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGenerateBodyInline8276); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGenerateBodyInline"


    // $ANTLR start "ruleGenerateBodyInline"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3578:1: ruleGenerateBodyInline returns [EObject current=null] : ( ( (lv_name_0_0= 'GENERATES' ) ) this_GEN_BLOCK_1= RULE_GEN_BLOCK ) ;
    public final EObject ruleGenerateBodyInline() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token this_GEN_BLOCK_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3581:28: ( ( ( (lv_name_0_0= 'GENERATES' ) ) this_GEN_BLOCK_1= RULE_GEN_BLOCK ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3582:1: ( ( (lv_name_0_0= 'GENERATES' ) ) this_GEN_BLOCK_1= RULE_GEN_BLOCK )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3582:1: ( ( (lv_name_0_0= 'GENERATES' ) ) this_GEN_BLOCK_1= RULE_GEN_BLOCK )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3582:2: ( (lv_name_0_0= 'GENERATES' ) ) this_GEN_BLOCK_1= RULE_GEN_BLOCK
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3582:2: ( (lv_name_0_0= 'GENERATES' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3583:1: (lv_name_0_0= 'GENERATES' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3583:1: (lv_name_0_0= 'GENERATES' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3584:3: lv_name_0_0= 'GENERATES'
            {
            lv_name_0_0=(Token)match(input,90,FOLLOW_90_in_ruleGenerateBodyInline8319); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_name_0_0, grammarAccess.getGenerateBodyInlineAccess().getNameGENERATESKeyword_0_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getGenerateBodyInlineRule());
              	        }
                     		setWithLastConsumed(current, "name", lv_name_0_0, "GENERATES");
              	    
            }

            }


            }

            this_GEN_BLOCK_1=(Token)match(input,RULE_GEN_BLOCK,FOLLOW_RULE_GEN_BLOCK_in_ruleGenerateBodyInline8343); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_GEN_BLOCK_1, grammarAccess.getGenerateBodyInlineAccess().getGEN_BLOCKTerminalRuleCall_1()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleGenerateBodyInline"


    // $ANTLR start "entryRuleGenerateBodySalt"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3609:1: entryRuleGenerateBodySalt returns [EObject current=null] : iv_ruleGenerateBodySalt= ruleGenerateBodySalt EOF ;
    public final EObject entryRuleGenerateBodySalt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenerateBodySalt = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3610:2: (iv_ruleGenerateBodySalt= ruleGenerateBodySalt EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3611:2: iv_ruleGenerateBodySalt= ruleGenerateBodySalt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGenerateBodySaltRule()); 
            }
            pushFollow(FOLLOW_ruleGenerateBodySalt_in_entryRuleGenerateBodySalt8378);
            iv_ruleGenerateBodySalt=ruleGenerateBodySalt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGenerateBodySalt; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGenerateBodySalt8388); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGenerateBodySalt"


    // $ANTLR start "ruleGenerateBodySalt"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3618:1: ruleGenerateBodySalt returns [EObject current=null] : ( ( (lv_name_0_0= 'GENERATES' ) ) otherlv_1= 'SALT' otherlv_2= '(' this_ID_3= RULE_ID otherlv_4= ')' otherlv_5= ':' (otherlv_6= 'SCOREDSEARCH' | otherlv_7= 'PROFILE' ) ( ( 'ENDGENERATES' )=>otherlv_8= 'ENDGENERATES' ) ) ;
    public final EObject ruleGenerateBodySalt() throws RecognitionException {
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
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3621:28: ( ( ( (lv_name_0_0= 'GENERATES' ) ) otherlv_1= 'SALT' otherlv_2= '(' this_ID_3= RULE_ID otherlv_4= ')' otherlv_5= ':' (otherlv_6= 'SCOREDSEARCH' | otherlv_7= 'PROFILE' ) ( ( 'ENDGENERATES' )=>otherlv_8= 'ENDGENERATES' ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3622:1: ( ( (lv_name_0_0= 'GENERATES' ) ) otherlv_1= 'SALT' otherlv_2= '(' this_ID_3= RULE_ID otherlv_4= ')' otherlv_5= ':' (otherlv_6= 'SCOREDSEARCH' | otherlv_7= 'PROFILE' ) ( ( 'ENDGENERATES' )=>otherlv_8= 'ENDGENERATES' ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3622:1: ( ( (lv_name_0_0= 'GENERATES' ) ) otherlv_1= 'SALT' otherlv_2= '(' this_ID_3= RULE_ID otherlv_4= ')' otherlv_5= ':' (otherlv_6= 'SCOREDSEARCH' | otherlv_7= 'PROFILE' ) ( ( 'ENDGENERATES' )=>otherlv_8= 'ENDGENERATES' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3622:2: ( (lv_name_0_0= 'GENERATES' ) ) otherlv_1= 'SALT' otherlv_2= '(' this_ID_3= RULE_ID otherlv_4= ')' otherlv_5= ':' (otherlv_6= 'SCOREDSEARCH' | otherlv_7= 'PROFILE' ) ( ( 'ENDGENERATES' )=>otherlv_8= 'ENDGENERATES' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3622:2: ( (lv_name_0_0= 'GENERATES' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3623:1: (lv_name_0_0= 'GENERATES' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3623:1: (lv_name_0_0= 'GENERATES' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3624:3: lv_name_0_0= 'GENERATES'
            {
            lv_name_0_0=(Token)match(input,90,FOLLOW_90_in_ruleGenerateBodySalt8431); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_name_0_0, grammarAccess.getGenerateBodySaltAccess().getNameGENERATESKeyword_0_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getGenerateBodySaltRule());
              	        }
                     		setWithLastConsumed(current, "name", lv_name_0_0, "GENERATES");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,91,FOLLOW_91_in_ruleGenerateBodySalt8456); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getGenerateBodySaltAccess().getSALTKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,36,FOLLOW_36_in_ruleGenerateBodySalt8468); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getGenerateBodySaltAccess().getLeftParenthesisKeyword_2());
                  
            }
            this_ID_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGenerateBodySalt8479); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_3, grammarAccess.getGenerateBodySaltAccess().getIDTerminalRuleCall_3()); 
                  
            }
            otherlv_4=(Token)match(input,37,FOLLOW_37_in_ruleGenerateBodySalt8490); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getGenerateBodySaltAccess().getRightParenthesisKeyword_4());
                  
            }
            otherlv_5=(Token)match(input,35,FOLLOW_35_in_ruleGenerateBodySalt8502); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getGenerateBodySaltAccess().getColonKeyword_5());
                  
            }
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3657:1: (otherlv_6= 'SCOREDSEARCH' | otherlv_7= 'PROFILE' )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==92) ) {
                alt57=1;
            }
            else if ( (LA57_0==93) ) {
                alt57=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3657:3: otherlv_6= 'SCOREDSEARCH'
                    {
                    otherlv_6=(Token)match(input,92,FOLLOW_92_in_ruleGenerateBodySalt8515); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getGenerateBodySaltAccess().getSCOREDSEARCHKeyword_6_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3662:7: otherlv_7= 'PROFILE'
                    {
                    otherlv_7=(Token)match(input,93,FOLLOW_93_in_ruleGenerateBodySalt8533); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getGenerateBodySaltAccess().getPROFILEKeyword_6_1());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3666:2: ( ( 'ENDGENERATES' )=>otherlv_8= 'ENDGENERATES' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3666:3: ( 'ENDGENERATES' )=>otherlv_8= 'ENDGENERATES'
            {
            otherlv_8=(Token)match(input,94,FOLLOW_94_in_ruleGenerateBodySalt8554); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getGenerateBodySaltAccess().getENDGENERATESKeyword_7());
                  
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleGenerateBodySalt"


    // $ANTLR start "entryRuleVisualSection"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3679:1: entryRuleVisualSection returns [EObject current=null] : iv_ruleVisualSection= ruleVisualSection EOF ;
    public final EObject entryRuleVisualSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVisualSection = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3680:2: (iv_ruleVisualSection= ruleVisualSection EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3681:2: iv_ruleVisualSection= ruleVisualSection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVisualSectionRule()); 
            }
            pushFollow(FOLLOW_ruleVisualSection_in_entryRuleVisualSection8591);
            iv_ruleVisualSection=ruleVisualSection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVisualSection; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVisualSection8601); if (state.failed) return current;

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3688:1: ruleVisualSection returns [EObject current=null] : ( ( (lv_sec_name_0_0= 'VISUALIZE' ) ) this_ID_1= RULE_ID ( (lv_vis_ops_2_0= ruleVisualSectionOptions ) )? ( (lv_vis_elements_3_0= ruleVisualization ) )+ ( ( 'END' )=>otherlv_4= 'END' ) ) ;
    public final EObject ruleVisualSection() throws RecognitionException {
        EObject current = null;

        Token lv_sec_name_0_0=null;
        Token this_ID_1=null;
        Token otherlv_4=null;
        EObject lv_vis_ops_2_0 = null;

        EObject lv_vis_elements_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3691:28: ( ( ( (lv_sec_name_0_0= 'VISUALIZE' ) ) this_ID_1= RULE_ID ( (lv_vis_ops_2_0= ruleVisualSectionOptions ) )? ( (lv_vis_elements_3_0= ruleVisualization ) )+ ( ( 'END' )=>otherlv_4= 'END' ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3692:1: ( ( (lv_sec_name_0_0= 'VISUALIZE' ) ) this_ID_1= RULE_ID ( (lv_vis_ops_2_0= ruleVisualSectionOptions ) )? ( (lv_vis_elements_3_0= ruleVisualization ) )+ ( ( 'END' )=>otherlv_4= 'END' ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3692:1: ( ( (lv_sec_name_0_0= 'VISUALIZE' ) ) this_ID_1= RULE_ID ( (lv_vis_ops_2_0= ruleVisualSectionOptions ) )? ( (lv_vis_elements_3_0= ruleVisualization ) )+ ( ( 'END' )=>otherlv_4= 'END' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3692:2: ( (lv_sec_name_0_0= 'VISUALIZE' ) ) this_ID_1= RULE_ID ( (lv_vis_ops_2_0= ruleVisualSectionOptions ) )? ( (lv_vis_elements_3_0= ruleVisualization ) )+ ( ( 'END' )=>otherlv_4= 'END' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3692:2: ( (lv_sec_name_0_0= 'VISUALIZE' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3693:1: (lv_sec_name_0_0= 'VISUALIZE' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3693:1: (lv_sec_name_0_0= 'VISUALIZE' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3694:3: lv_sec_name_0_0= 'VISUALIZE'
            {
            lv_sec_name_0_0=(Token)match(input,28,FOLLOW_28_in_ruleVisualSection8644); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_sec_name_0_0, grammarAccess.getVisualSectionAccess().getSec_nameVISUALIZEKeyword_0_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getVisualSectionRule());
              	        }
                     		setWithLastConsumed(current, "sec_name", lv_sec_name_0_0, "VISUALIZE");
              	    
            }

            }


            }

            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVisualSection8668); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_1, grammarAccess.getVisualSectionAccess().getIDTerminalRuleCall_1()); 
                  
            }
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3711:1: ( (lv_vis_ops_2_0= ruleVisualSectionOptions ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==35) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3712:1: (lv_vis_ops_2_0= ruleVisualSectionOptions )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3712:1: (lv_vis_ops_2_0= ruleVisualSectionOptions )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3713:3: lv_vis_ops_2_0= ruleVisualSectionOptions
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVisualSectionAccess().getVis_opsVisualSectionOptionsParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVisualSectionOptions_in_ruleVisualSection8688);
                    lv_vis_ops_2_0=ruleVisualSectionOptions();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getVisualSectionRule());
                      	        }
                             		set(
                             			current, 
                             			"vis_ops",
                              		lv_vis_ops_2_0, 
                              		"VisualSectionOptions");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3729:3: ( (lv_vis_elements_3_0= ruleVisualization ) )+
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
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3730:1: (lv_vis_elements_3_0= ruleVisualization )
            	    {
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3730:1: (lv_vis_elements_3_0= ruleVisualization )
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3731:3: lv_vis_elements_3_0= ruleVisualization
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getVisualSectionAccess().getVis_elementsVisualizationParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleVisualization_in_ruleVisualSection8710);
            	    lv_vis_elements_3_0=ruleVisualization();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getVisualSectionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"vis_elements",
            	              		lv_vis_elements_3_0, 
            	              		"Visualization");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt59 >= 1 ) break loop59;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(59, input);
                        throw eee;
                }
                cnt59++;
            } while (true);

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3747:3: ( ( 'END' )=>otherlv_4= 'END' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3747:4: ( 'END' )=>otherlv_4= 'END'
            {
            otherlv_4=(Token)match(input,33,FOLLOW_33_in_ruleVisualSection8731); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getVisualSectionAccess().getENDKeyword_4());
                  
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleVisualSection"


    // $ANTLR start "entryRuleVisualization"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3760:1: entryRuleVisualization returns [EObject current=null] : iv_ruleVisualization= ruleVisualization EOF ;
    public final EObject entryRuleVisualization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVisualization = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3761:2: (iv_ruleVisualization= ruleVisualization EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3762:2: iv_ruleVisualization= ruleVisualization EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVisualizationRule()); 
            }
            pushFollow(FOLLOW_ruleVisualization_in_entryRuleVisualization8768);
            iv_ruleVisualization=ruleVisualization();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVisualization; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVisualization8778); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVisualization"


    // $ANTLR start "ruleVisualization"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3769:1: ruleVisualization returns [EObject current=null] : ( ( (otherlv_0= 'CHORO' | otherlv_1= 'LINE' | otherlv_2= 'TIMELINE' | otherlv_3= 'PIE' | otherlv_4= 'BAR' | otherlv_5= 'TABLE' ) ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '(' ( (lv_input_8_0= ruleVisBasis ) ) otherlv_9= ')' ( (lv_vis_op_10_0= ruleVisualOptions ) )? otherlv_11= ';' ) | (otherlv_12= 'SLIDER' ( (lv_name_13_0= RULE_ID ) ) ( (lv_vis_op_14_0= ruleVisualOptions ) )? otherlv_15= ';' ) ) ;
    public final EObject ruleVisualization() throws RecognitionException {
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
        EObject lv_input_8_0 = null;

        EObject lv_vis_op_10_0 = null;

        EObject lv_vis_op_14_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3772:28: ( ( ( (otherlv_0= 'CHORO' | otherlv_1= 'LINE' | otherlv_2= 'TIMELINE' | otherlv_3= 'PIE' | otherlv_4= 'BAR' | otherlv_5= 'TABLE' ) ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '(' ( (lv_input_8_0= ruleVisBasis ) ) otherlv_9= ')' ( (lv_vis_op_10_0= ruleVisualOptions ) )? otherlv_11= ';' ) | (otherlv_12= 'SLIDER' ( (lv_name_13_0= RULE_ID ) ) ( (lv_vis_op_14_0= ruleVisualOptions ) )? otherlv_15= ';' ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3773:1: ( ( (otherlv_0= 'CHORO' | otherlv_1= 'LINE' | otherlv_2= 'TIMELINE' | otherlv_3= 'PIE' | otherlv_4= 'BAR' | otherlv_5= 'TABLE' ) ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '(' ( (lv_input_8_0= ruleVisBasis ) ) otherlv_9= ')' ( (lv_vis_op_10_0= ruleVisualOptions ) )? otherlv_11= ';' ) | (otherlv_12= 'SLIDER' ( (lv_name_13_0= RULE_ID ) ) ( (lv_vis_op_14_0= ruleVisualOptions ) )? otherlv_15= ';' ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3773:1: ( ( (otherlv_0= 'CHORO' | otherlv_1= 'LINE' | otherlv_2= 'TIMELINE' | otherlv_3= 'PIE' | otherlv_4= 'BAR' | otherlv_5= 'TABLE' ) ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '(' ( (lv_input_8_0= ruleVisBasis ) ) otherlv_9= ')' ( (lv_vis_op_10_0= ruleVisualOptions ) )? otherlv_11= ';' ) | (otherlv_12= 'SLIDER' ( (lv_name_13_0= RULE_ID ) ) ( (lv_vis_op_14_0= ruleVisualOptions ) )? otherlv_15= ';' ) )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( ((LA63_0>=95 && LA63_0<=100)) ) {
                alt63=1;
            }
            else if ( (LA63_0==101) ) {
                alt63=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3773:2: ( (otherlv_0= 'CHORO' | otherlv_1= 'LINE' | otherlv_2= 'TIMELINE' | otherlv_3= 'PIE' | otherlv_4= 'BAR' | otherlv_5= 'TABLE' ) ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '(' ( (lv_input_8_0= ruleVisBasis ) ) otherlv_9= ')' ( (lv_vis_op_10_0= ruleVisualOptions ) )? otherlv_11= ';' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3773:2: ( (otherlv_0= 'CHORO' | otherlv_1= 'LINE' | otherlv_2= 'TIMELINE' | otherlv_3= 'PIE' | otherlv_4= 'BAR' | otherlv_5= 'TABLE' ) ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '(' ( (lv_input_8_0= ruleVisBasis ) ) otherlv_9= ')' ( (lv_vis_op_10_0= ruleVisualOptions ) )? otherlv_11= ';' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3773:3: (otherlv_0= 'CHORO' | otherlv_1= 'LINE' | otherlv_2= 'TIMELINE' | otherlv_3= 'PIE' | otherlv_4= 'BAR' | otherlv_5= 'TABLE' ) ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '(' ( (lv_input_8_0= ruleVisBasis ) ) otherlv_9= ')' ( (lv_vis_op_10_0= ruleVisualOptions ) )? otherlv_11= ';'
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3773:3: (otherlv_0= 'CHORO' | otherlv_1= 'LINE' | otherlv_2= 'TIMELINE' | otherlv_3= 'PIE' | otherlv_4= 'BAR' | otherlv_5= 'TABLE' )
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
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 60, 0, input);

                        throw nvae;
                    }

                    switch (alt60) {
                        case 1 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3773:5: otherlv_0= 'CHORO'
                            {
                            otherlv_0=(Token)match(input,95,FOLLOW_95_in_ruleVisualization8817); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_0, grammarAccess.getVisualizationAccess().getCHOROKeyword_0_0_0());
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3778:7: otherlv_1= 'LINE'
                            {
                            otherlv_1=(Token)match(input,96,FOLLOW_96_in_ruleVisualization8835); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_1, grammarAccess.getVisualizationAccess().getLINEKeyword_0_0_1());
                                  
                            }

                            }
                            break;
                        case 3 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3783:7: otherlv_2= 'TIMELINE'
                            {
                            otherlv_2=(Token)match(input,97,FOLLOW_97_in_ruleVisualization8853); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_2, grammarAccess.getVisualizationAccess().getTIMELINEKeyword_0_0_2());
                                  
                            }

                            }
                            break;
                        case 4 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3788:7: otherlv_3= 'PIE'
                            {
                            otherlv_3=(Token)match(input,98,FOLLOW_98_in_ruleVisualization8871); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getVisualizationAccess().getPIEKeyword_0_0_3());
                                  
                            }

                            }
                            break;
                        case 5 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3793:7: otherlv_4= 'BAR'
                            {
                            otherlv_4=(Token)match(input,99,FOLLOW_99_in_ruleVisualization8889); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getVisualizationAccess().getBARKeyword_0_0_4());
                                  
                            }

                            }
                            break;
                        case 6 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3798:7: otherlv_5= 'TABLE'
                            {
                            otherlv_5=(Token)match(input,100,FOLLOW_100_in_ruleVisualization8907); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_5, grammarAccess.getVisualizationAccess().getTABLEKeyword_0_0_5());
                                  
                            }

                            }
                            break;

                    }

                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3802:2: ( (lv_name_6_0= RULE_ID ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3803:1: (lv_name_6_0= RULE_ID )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3803:1: (lv_name_6_0= RULE_ID )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3804:3: lv_name_6_0= RULE_ID
                    {
                    lv_name_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVisualization8925); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_6_0, grammarAccess.getVisualizationAccess().getNameIDTerminalRuleCall_0_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

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


                    }

                    otherlv_7=(Token)match(input,36,FOLLOW_36_in_ruleVisualization8942); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getVisualizationAccess().getLeftParenthesisKeyword_0_2());
                          
                    }
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3824:1: ( (lv_input_8_0= ruleVisBasis ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3825:1: (lv_input_8_0= ruleVisBasis )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3825:1: (lv_input_8_0= ruleVisBasis )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3826:3: lv_input_8_0= ruleVisBasis
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVisualizationAccess().getInputVisBasisParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVisBasis_in_ruleVisualization8963);
                    lv_input_8_0=ruleVisBasis();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getVisualizationRule());
                      	        }
                             		set(
                             			current, 
                             			"input",
                              		lv_input_8_0, 
                              		"VisBasis");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_9=(Token)match(input,37,FOLLOW_37_in_ruleVisualization8975); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getVisualizationAccess().getRightParenthesisKeyword_0_4());
                          
                    }
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3846:1: ( (lv_vis_op_10_0= ruleVisualOptions ) )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==35) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3847:1: (lv_vis_op_10_0= ruleVisualOptions )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3847:1: (lv_vis_op_10_0= ruleVisualOptions )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3848:3: lv_vis_op_10_0= ruleVisualOptions
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getVisualizationAccess().getVis_opVisualOptionsParserRuleCall_0_5_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleVisualOptions_in_ruleVisualization8996);
                            lv_vis_op_10_0=ruleVisualOptions();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getVisualizationRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"vis_op",
                                      		lv_vis_op_10_0, 
                                      		"VisualOptions");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }

                    otherlv_11=(Token)match(input,20,FOLLOW_20_in_ruleVisualization9009); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getVisualizationAccess().getSemicolonKeyword_0_6());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3869:6: (otherlv_12= 'SLIDER' ( (lv_name_13_0= RULE_ID ) ) ( (lv_vis_op_14_0= ruleVisualOptions ) )? otherlv_15= ';' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3869:6: (otherlv_12= 'SLIDER' ( (lv_name_13_0= RULE_ID ) ) ( (lv_vis_op_14_0= ruleVisualOptions ) )? otherlv_15= ';' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3869:8: otherlv_12= 'SLIDER' ( (lv_name_13_0= RULE_ID ) ) ( (lv_vis_op_14_0= ruleVisualOptions ) )? otherlv_15= ';'
                    {
                    otherlv_12=(Token)match(input,101,FOLLOW_101_in_ruleVisualization9029); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getVisualizationAccess().getSLIDERKeyword_1_0());
                          
                    }
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3873:1: ( (lv_name_13_0= RULE_ID ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3874:1: (lv_name_13_0= RULE_ID )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3874:1: (lv_name_13_0= RULE_ID )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3875:3: lv_name_13_0= RULE_ID
                    {
                    lv_name_13_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVisualization9046); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_13_0, grammarAccess.getVisualizationAccess().getNameIDTerminalRuleCall_1_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

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


                    }

                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3891:2: ( (lv_vis_op_14_0= ruleVisualOptions ) )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==35) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3892:1: (lv_vis_op_14_0= ruleVisualOptions )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3892:1: (lv_vis_op_14_0= ruleVisualOptions )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3893:3: lv_vis_op_14_0= ruleVisualOptions
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getVisualizationAccess().getVis_opVisualOptionsParserRuleCall_1_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleVisualOptions_in_ruleVisualization9072);
                            lv_vis_op_14_0=ruleVisualOptions();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getVisualizationRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"vis_op",
                                      		lv_vis_op_14_0, 
                                      		"VisualOptions");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }

                    otherlv_15=(Token)match(input,20,FOLLOW_20_in_ruleVisualization9085); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getVisualizationAccess().getSemicolonKeyword_1_3());
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleVisualization"


    // $ANTLR start "entryRuleVisBasis"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3921:1: entryRuleVisBasis returns [EObject current=null] : iv_ruleVisBasis= ruleVisBasis EOF ;
    public final EObject entryRuleVisBasis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVisBasis = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3922:2: (iv_ruleVisBasis= ruleVisBasis EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3923:2: iv_ruleVisBasis= ruleVisBasis EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVisBasisRule()); 
            }
            pushFollow(FOLLOW_ruleVisBasis_in_entryRuleVisBasis9122);
            iv_ruleVisBasis=ruleVisBasis();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVisBasis; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVisBasis9132); if (state.failed) return current;

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
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3930:1: ruleVisBasis returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_quals_1_0= ruleVisBasisQualifiers ) )? ) ;
    public final EObject ruleVisBasis() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_quals_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3933:28: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_quals_1_0= ruleVisBasisQualifiers ) )? ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3934:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_quals_1_0= ruleVisBasisQualifiers ) )? )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3934:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_quals_1_0= ruleVisBasisQualifiers ) )? )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3934:2: ( (otherlv_0= RULE_ID ) ) ( (lv_quals_1_0= ruleVisBasisQualifiers ) )?
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3934:2: ( (otherlv_0= RULE_ID ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3935:1: (otherlv_0= RULE_ID )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3935:1: (otherlv_0= RULE_ID )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3936:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getVisBasisRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVisBasis9177); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getVisBasisAccess().getBasisOutDatasetCrossReference_0_0()); 
              	
            }

            }


            }

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3947:2: ( (lv_quals_1_0= ruleVisBasisQualifiers ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==102) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3948:1: (lv_quals_1_0= ruleVisBasisQualifiers )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3948:1: (lv_quals_1_0= ruleVisBasisQualifiers )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3949:3: lv_quals_1_0= ruleVisBasisQualifiers
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVisBasisAccess().getQualsVisBasisQualifiersParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVisBasisQualifiers_in_ruleVisBasis9198);
                    lv_quals_1_0=ruleVisBasisQualifiers();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getVisBasisRule());
                      	        }
                             		set(
                             			current, 
                             			"quals",
                              		lv_quals_1_0, 
                              		"VisBasisQualifiers");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleVisBasis"


    // $ANTLR start "entryRuleVisBasisQualifiers"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3973:1: entryRuleVisBasisQualifiers returns [EObject current=null] : iv_ruleVisBasisQualifiers= ruleVisBasisQualifiers EOF ;
    public final EObject entryRuleVisBasisQualifiers() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVisBasisQualifiers = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3974:2: (iv_ruleVisBasisQualifiers= ruleVisBasisQualifiers EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3975:2: iv_ruleVisBasisQualifiers= ruleVisBasisQualifiers EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVisBasisQualifiersRule()); 
            }
            pushFollow(FOLLOW_ruleVisBasisQualifiers_in_entryRuleVisBasisQualifiers9235);
            iv_ruleVisBasisQualifiers=ruleVisBasisQualifiers();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVisBasisQualifiers; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVisBasisQualifiers9245); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVisBasisQualifiers"


    // $ANTLR start "ruleVisBasisQualifiers"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3982:1: ruleVisBasisQualifiers returns [EObject current=null] : (otherlv_0= '{' ( (lv_funcs_1_0= ruleFunction ) ) (otherlv_2= ',' ( (lv_funcs_3_0= ruleFunction ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleVisBasisQualifiers() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_funcs_1_0 = null;

        EObject lv_funcs_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3985:28: ( (otherlv_0= '{' ( (lv_funcs_1_0= ruleFunction ) ) (otherlv_2= ',' ( (lv_funcs_3_0= ruleFunction ) ) )* otherlv_4= '}' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3986:1: (otherlv_0= '{' ( (lv_funcs_1_0= ruleFunction ) ) (otherlv_2= ',' ( (lv_funcs_3_0= ruleFunction ) ) )* otherlv_4= '}' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3986:1: (otherlv_0= '{' ( (lv_funcs_1_0= ruleFunction ) ) (otherlv_2= ',' ( (lv_funcs_3_0= ruleFunction ) ) )* otherlv_4= '}' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3986:3: otherlv_0= '{' ( (lv_funcs_1_0= ruleFunction ) ) (otherlv_2= ',' ( (lv_funcs_3_0= ruleFunction ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,102,FOLLOW_102_in_ruleVisBasisQualifiers9282); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getVisBasisQualifiersAccess().getLeftCurlyBracketKeyword_0());
                  
            }
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3990:1: ( (lv_funcs_1_0= ruleFunction ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3991:1: (lv_funcs_1_0= ruleFunction )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3991:1: (lv_funcs_1_0= ruleFunction )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3992:3: lv_funcs_1_0= ruleFunction
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVisBasisQualifiersAccess().getFuncsFunctionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFunction_in_ruleVisBasisQualifiers9303);
            lv_funcs_1_0=ruleFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVisBasisQualifiersRule());
              	        }
                     		add(
                     			current, 
                     			"funcs",
                      		lv_funcs_1_0, 
                      		"Function");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4008:2: (otherlv_2= ',' ( (lv_funcs_3_0= ruleFunction ) ) )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==30) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4008:4: otherlv_2= ',' ( (lv_funcs_3_0= ruleFunction ) )
            	    {
            	    otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleVisBasisQualifiers9316); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getVisBasisQualifiersAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4012:1: ( (lv_funcs_3_0= ruleFunction ) )
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4013:1: (lv_funcs_3_0= ruleFunction )
            	    {
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4013:1: (lv_funcs_3_0= ruleFunction )
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4014:3: lv_funcs_3_0= ruleFunction
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getVisBasisQualifiersAccess().getFuncsFunctionParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFunction_in_ruleVisBasisQualifiers9337);
            	    lv_funcs_3_0=ruleFunction();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getVisBasisQualifiersRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"funcs",
            	              		lv_funcs_3_0, 
            	              		"Function");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop65;
                }
            } while (true);

            otherlv_4=(Token)match(input,103,FOLLOW_103_in_ruleVisBasisQualifiers9351); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getVisBasisQualifiersAccess().getRightCurlyBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleVisBasisQualifiers"


    // $ANTLR start "entryRuleFunction"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4042:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4043:2: (iv_ruleFunction= ruleFunction EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4044:2: iv_ruleFunction= ruleFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleFunction_in_entryRuleFunction9387);
            iv_ruleFunction=ruleFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunction9397); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4051:1: ruleFunction returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) | ( (lv_vals_1_0= ruleValue ) ) | (otherlv_2= 'SUM' otherlv_3= '(' ( ( (otherlv_4= RULE_ID ) ) | ( (lv_vals_5_0= ruleValue ) ) ) otherlv_6= ')' ) | (otherlv_7= 'SCALE' otherlv_8= '(' ( ( (otherlv_9= RULE_ID ) ) | ( (lv_vals_10_0= ruleValue ) ) ) otherlv_11= ',' this_INT_12= RULE_INT otherlv_13= ')' ) ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token this_INT_12=null;
        Token otherlv_13=null;
        EObject lv_vals_1_0 = null;

        EObject lv_vals_5_0 = null;

        EObject lv_vals_10_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4054:28: ( ( ( (otherlv_0= RULE_ID ) ) | ( (lv_vals_1_0= ruleValue ) ) | (otherlv_2= 'SUM' otherlv_3= '(' ( ( (otherlv_4= RULE_ID ) ) | ( (lv_vals_5_0= ruleValue ) ) ) otherlv_6= ')' ) | (otherlv_7= 'SCALE' otherlv_8= '(' ( ( (otherlv_9= RULE_ID ) ) | ( (lv_vals_10_0= ruleValue ) ) ) otherlv_11= ',' this_INT_12= RULE_INT otherlv_13= ')' ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4055:1: ( ( (otherlv_0= RULE_ID ) ) | ( (lv_vals_1_0= ruleValue ) ) | (otherlv_2= 'SUM' otherlv_3= '(' ( ( (otherlv_4= RULE_ID ) ) | ( (lv_vals_5_0= ruleValue ) ) ) otherlv_6= ')' ) | (otherlv_7= 'SCALE' otherlv_8= '(' ( ( (otherlv_9= RULE_ID ) ) | ( (lv_vals_10_0= ruleValue ) ) ) otherlv_11= ',' this_INT_12= RULE_INT otherlv_13= ')' ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4055:1: ( ( (otherlv_0= RULE_ID ) ) | ( (lv_vals_1_0= ruleValue ) ) | (otherlv_2= 'SUM' otherlv_3= '(' ( ( (otherlv_4= RULE_ID ) ) | ( (lv_vals_5_0= ruleValue ) ) ) otherlv_6= ')' ) | (otherlv_7= 'SCALE' otherlv_8= '(' ( ( (otherlv_9= RULE_ID ) ) | ( (lv_vals_10_0= ruleValue ) ) ) otherlv_11= ',' this_INT_12= RULE_INT otherlv_13= ')' ) )
            int alt68=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt68=1;
                }
                break;
            case RULE_INT:
            case RULE_STRING:
                {
                alt68=2;
                }
                break;
            case 104:
                {
                alt68=3;
                }
                break;
            case 105:
                {
                alt68=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }

            switch (alt68) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4055:2: ( (otherlv_0= RULE_ID ) )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4055:2: ( (otherlv_0= RULE_ID ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4056:1: (otherlv_0= RULE_ID )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4056:1: (otherlv_0= RULE_ID )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4057:3: otherlv_0= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getFunctionRule());
                      	        }
                              
                    }
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunction9442); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_0, grammarAccess.getFunctionAccess().getVarsPosVizDataCrossReference_0_0()); 
                      	
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4069:6: ( (lv_vals_1_0= ruleValue ) )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4069:6: ( (lv_vals_1_0= ruleValue ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4070:1: (lv_vals_1_0= ruleValue )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4070:1: (lv_vals_1_0= ruleValue )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4071:3: lv_vals_1_0= ruleValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFunctionAccess().getValsValueParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValue_in_ruleFunction9469);
                    lv_vals_1_0=ruleValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFunctionRule());
                      	        }
                             		set(
                             			current, 
                             			"vals",
                              		lv_vals_1_0, 
                              		"Value");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4088:6: (otherlv_2= 'SUM' otherlv_3= '(' ( ( (otherlv_4= RULE_ID ) ) | ( (lv_vals_5_0= ruleValue ) ) ) otherlv_6= ')' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4088:6: (otherlv_2= 'SUM' otherlv_3= '(' ( ( (otherlv_4= RULE_ID ) ) | ( (lv_vals_5_0= ruleValue ) ) ) otherlv_6= ')' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4088:8: otherlv_2= 'SUM' otherlv_3= '(' ( ( (otherlv_4= RULE_ID ) ) | ( (lv_vals_5_0= ruleValue ) ) ) otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,104,FOLLOW_104_in_ruleFunction9488); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getFunctionAccess().getSUMKeyword_2_0());
                          
                    }
                    otherlv_3=(Token)match(input,36,FOLLOW_36_in_ruleFunction9500); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_2_1());
                          
                    }
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4096:1: ( ( (otherlv_4= RULE_ID ) ) | ( (lv_vals_5_0= ruleValue ) ) )
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==RULE_ID) ) {
                        alt66=1;
                    }
                    else if ( ((LA66_0>=RULE_INT && LA66_0<=RULE_STRING)) ) {
                        alt66=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 66, 0, input);

                        throw nvae;
                    }
                    switch (alt66) {
                        case 1 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4096:2: ( (otherlv_4= RULE_ID ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4096:2: ( (otherlv_4= RULE_ID ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4097:1: (otherlv_4= RULE_ID )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4097:1: (otherlv_4= RULE_ID )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4098:3: otherlv_4= RULE_ID
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getFunctionRule());
                              	        }
                                      
                            }
                            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunction9521); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		newLeafNode(otherlv_4, grammarAccess.getFunctionAccess().getVarsPosVizDataCrossReference_2_2_0_0()); 
                              	
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4110:6: ( (lv_vals_5_0= ruleValue ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4110:6: ( (lv_vals_5_0= ruleValue ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4111:1: (lv_vals_5_0= ruleValue )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4111:1: (lv_vals_5_0= ruleValue )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4112:3: lv_vals_5_0= ruleValue
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getFunctionAccess().getValsValueParserRuleCall_2_2_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleValue_in_ruleFunction9548);
                            lv_vals_5_0=ruleValue();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getFunctionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"vals",
                                      		lv_vals_5_0, 
                                      		"Value");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,37,FOLLOW_37_in_ruleFunction9561); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getFunctionAccess().getRightParenthesisKeyword_2_3());
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4133:6: (otherlv_7= 'SCALE' otherlv_8= '(' ( ( (otherlv_9= RULE_ID ) ) | ( (lv_vals_10_0= ruleValue ) ) ) otherlv_11= ',' this_INT_12= RULE_INT otherlv_13= ')' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4133:6: (otherlv_7= 'SCALE' otherlv_8= '(' ( ( (otherlv_9= RULE_ID ) ) | ( (lv_vals_10_0= ruleValue ) ) ) otherlv_11= ',' this_INT_12= RULE_INT otherlv_13= ')' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4133:8: otherlv_7= 'SCALE' otherlv_8= '(' ( ( (otherlv_9= RULE_ID ) ) | ( (lv_vals_10_0= ruleValue ) ) ) otherlv_11= ',' this_INT_12= RULE_INT otherlv_13= ')'
                    {
                    otherlv_7=(Token)match(input,105,FOLLOW_105_in_ruleFunction9581); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getFunctionAccess().getSCALEKeyword_3_0());
                          
                    }
                    otherlv_8=(Token)match(input,36,FOLLOW_36_in_ruleFunction9593); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_3_1());
                          
                    }
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4141:1: ( ( (otherlv_9= RULE_ID ) ) | ( (lv_vals_10_0= ruleValue ) ) )
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==RULE_ID) ) {
                        alt67=1;
                    }
                    else if ( ((LA67_0>=RULE_INT && LA67_0<=RULE_STRING)) ) {
                        alt67=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 67, 0, input);

                        throw nvae;
                    }
                    switch (alt67) {
                        case 1 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4141:2: ( (otherlv_9= RULE_ID ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4141:2: ( (otherlv_9= RULE_ID ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4142:1: (otherlv_9= RULE_ID )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4142:1: (otherlv_9= RULE_ID )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4143:3: otherlv_9= RULE_ID
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getFunctionRule());
                              	        }
                                      
                            }
                            otherlv_9=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunction9614); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		newLeafNode(otherlv_9, grammarAccess.getFunctionAccess().getVarsPosVizDataCrossReference_3_2_0_0()); 
                              	
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4155:6: ( (lv_vals_10_0= ruleValue ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4155:6: ( (lv_vals_10_0= ruleValue ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4156:1: (lv_vals_10_0= ruleValue )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4156:1: (lv_vals_10_0= ruleValue )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4157:3: lv_vals_10_0= ruleValue
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getFunctionAccess().getValsValueParserRuleCall_3_2_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleValue_in_ruleFunction9641);
                            lv_vals_10_0=ruleValue();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getFunctionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"vals",
                                      		lv_vals_10_0, 
                                      		"Value");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }

                    otherlv_11=(Token)match(input,30,FOLLOW_30_in_ruleFunction9654); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getFunctionAccess().getCommaKeyword_3_3());
                          
                    }
                    this_INT_12=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFunction9665); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_12, grammarAccess.getFunctionAccess().getINTTerminalRuleCall_3_4()); 
                          
                    }
                    otherlv_13=(Token)match(input,37,FOLLOW_37_in_ruleFunction9676); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getFunctionAccess().getRightParenthesisKeyword_3_5());
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleVisualSectionOptions"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4193:1: entryRuleVisualSectionOptions returns [EObject current=null] : iv_ruleVisualSectionOptions= ruleVisualSectionOptions EOF ;
    public final EObject entryRuleVisualSectionOptions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVisualSectionOptions = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4194:2: (iv_ruleVisualSectionOptions= ruleVisualSectionOptions EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4195:2: iv_ruleVisualSectionOptions= ruleVisualSectionOptions EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVisualSectionOptionsRule()); 
            }
            pushFollow(FOLLOW_ruleVisualSectionOptions_in_entryRuleVisualSectionOptions9713);
            iv_ruleVisualSectionOptions=ruleVisualSectionOptions();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVisualSectionOptions; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVisualSectionOptions9723); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVisualSectionOptions"


    // $ANTLR start "ruleVisualSectionOptions"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4202:1: ruleVisualSectionOptions returns [EObject current=null] : (otherlv_0= ':' ( (lv_vis_ops_1_0= ruleVisualSectionOption ) ) (otherlv_2= ',' ( (lv_vis_ops_3_0= ruleVisualSectionOption ) ) )* ) ;
    public final EObject ruleVisualSectionOptions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_vis_ops_1_0 = null;

        EObject lv_vis_ops_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4205:28: ( (otherlv_0= ':' ( (lv_vis_ops_1_0= ruleVisualSectionOption ) ) (otherlv_2= ',' ( (lv_vis_ops_3_0= ruleVisualSectionOption ) ) )* ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4206:1: (otherlv_0= ':' ( (lv_vis_ops_1_0= ruleVisualSectionOption ) ) (otherlv_2= ',' ( (lv_vis_ops_3_0= ruleVisualSectionOption ) ) )* )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4206:1: (otherlv_0= ':' ( (lv_vis_ops_1_0= ruleVisualSectionOption ) ) (otherlv_2= ',' ( (lv_vis_ops_3_0= ruleVisualSectionOption ) ) )* )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4206:3: otherlv_0= ':' ( (lv_vis_ops_1_0= ruleVisualSectionOption ) ) (otherlv_2= ',' ( (lv_vis_ops_3_0= ruleVisualSectionOption ) ) )*
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleVisualSectionOptions9760); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getVisualSectionOptionsAccess().getColonKeyword_0());
                  
            }
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4210:1: ( (lv_vis_ops_1_0= ruleVisualSectionOption ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4211:1: (lv_vis_ops_1_0= ruleVisualSectionOption )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4211:1: (lv_vis_ops_1_0= ruleVisualSectionOption )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4212:3: lv_vis_ops_1_0= ruleVisualSectionOption
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVisualSectionOptionsAccess().getVis_opsVisualSectionOptionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVisualSectionOption_in_ruleVisualSectionOptions9781);
            lv_vis_ops_1_0=ruleVisualSectionOption();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVisualSectionOptionsRule());
              	        }
                     		add(
                     			current, 
                     			"vis_ops",
                      		lv_vis_ops_1_0, 
                      		"VisualSectionOption");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4228:2: (otherlv_2= ',' ( (lv_vis_ops_3_0= ruleVisualSectionOption ) ) )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==30) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4228:4: otherlv_2= ',' ( (lv_vis_ops_3_0= ruleVisualSectionOption ) )
            	    {
            	    otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleVisualSectionOptions9794); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getVisualSectionOptionsAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4232:1: ( (lv_vis_ops_3_0= ruleVisualSectionOption ) )
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4233:1: (lv_vis_ops_3_0= ruleVisualSectionOption )
            	    {
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4233:1: (lv_vis_ops_3_0= ruleVisualSectionOption )
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4234:3: lv_vis_ops_3_0= ruleVisualSectionOption
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getVisualSectionOptionsAccess().getVis_opsVisualSectionOptionParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleVisualSectionOption_in_ruleVisualSectionOptions9815);
            	    lv_vis_ops_3_0=ruleVisualSectionOption();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getVisualSectionOptionsRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"vis_ops",
            	              		lv_vis_ops_3_0, 
            	              		"VisualSectionOption");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop69;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleVisualSectionOptions"


    // $ANTLR start "entryRuleVisualSectionOption"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4258:1: entryRuleVisualSectionOption returns [EObject current=null] : iv_ruleVisualSectionOption= ruleVisualSectionOption EOF ;
    public final EObject entryRuleVisualSectionOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVisualSectionOption = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4259:2: (iv_ruleVisualSectionOption= ruleVisualSectionOption EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4260:2: iv_ruleVisualSectionOption= ruleVisualSectionOption EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVisualSectionOptionRule()); 
            }
            pushFollow(FOLLOW_ruleVisualSectionOption_in_entryRuleVisualSectionOption9853);
            iv_ruleVisualSectionOption=ruleVisualSectionOption();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVisualSectionOption; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVisualSectionOption9863); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVisualSectionOption"


    // $ANTLR start "ruleVisualSectionOption"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4267:1: ruleVisualSectionOption returns [EObject current=null] : ( ( (lv_name_0_0= 'LABEL' ) ) otherlv_1= '(' ( (lv_vals_2_0= ruleValue ) ) otherlv_3= ')' ) ;
    public final EObject ruleVisualSectionOption() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_vals_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4270:28: ( ( ( (lv_name_0_0= 'LABEL' ) ) otherlv_1= '(' ( (lv_vals_2_0= ruleValue ) ) otherlv_3= ')' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4271:1: ( ( (lv_name_0_0= 'LABEL' ) ) otherlv_1= '(' ( (lv_vals_2_0= ruleValue ) ) otherlv_3= ')' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4271:1: ( ( (lv_name_0_0= 'LABEL' ) ) otherlv_1= '(' ( (lv_vals_2_0= ruleValue ) ) otherlv_3= ')' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4271:2: ( (lv_name_0_0= 'LABEL' ) ) otherlv_1= '(' ( (lv_vals_2_0= ruleValue ) ) otherlv_3= ')'
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4271:2: ( (lv_name_0_0= 'LABEL' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4272:1: (lv_name_0_0= 'LABEL' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4272:1: (lv_name_0_0= 'LABEL' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4273:3: lv_name_0_0= 'LABEL'
            {
            lv_name_0_0=(Token)match(input,18,FOLLOW_18_in_ruleVisualSectionOption9906); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_name_0_0, grammarAccess.getVisualSectionOptionAccess().getNameLABELKeyword_0_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getVisualSectionOptionRule());
              	        }
                     		setWithLastConsumed(current, "name", lv_name_0_0, "LABEL");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleVisualSectionOption9931); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getVisualSectionOptionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4290:1: ( (lv_vals_2_0= ruleValue ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4291:1: (lv_vals_2_0= ruleValue )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4291:1: (lv_vals_2_0= ruleValue )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4292:3: lv_vals_2_0= ruleValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVisualSectionOptionAccess().getValsValueParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValue_in_ruleVisualSectionOption9952);
            lv_vals_2_0=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVisualSectionOptionRule());
              	        }
                     		set(
                     			current, 
                     			"vals",
                      		lv_vals_2_0, 
                      		"Value");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,37,FOLLOW_37_in_ruleVisualSectionOption9964); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getVisualSectionOptionAccess().getRightParenthesisKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleVisualSectionOption"


    // $ANTLR start "entryRuleVisualOptions"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4320:1: entryRuleVisualOptions returns [EObject current=null] : iv_ruleVisualOptions= ruleVisualOptions EOF ;
    public final EObject entryRuleVisualOptions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVisualOptions = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4321:2: (iv_ruleVisualOptions= ruleVisualOptions EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4322:2: iv_ruleVisualOptions= ruleVisualOptions EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVisualOptionsRule()); 
            }
            pushFollow(FOLLOW_ruleVisualOptions_in_entryRuleVisualOptions10000);
            iv_ruleVisualOptions=ruleVisualOptions();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVisualOptions; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVisualOptions10010); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVisualOptions"


    // $ANTLR start "ruleVisualOptions"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4329:1: ruleVisualOptions returns [EObject current=null] : (otherlv_0= ':' ( (lv_vis_ops_1_0= ruleVisualOption ) ) (otherlv_2= ',' ( (lv_vis_ops_3_0= ruleVisualOption ) ) )* ) ;
    public final EObject ruleVisualOptions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_vis_ops_1_0 = null;

        EObject lv_vis_ops_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4332:28: ( (otherlv_0= ':' ( (lv_vis_ops_1_0= ruleVisualOption ) ) (otherlv_2= ',' ( (lv_vis_ops_3_0= ruleVisualOption ) ) )* ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4333:1: (otherlv_0= ':' ( (lv_vis_ops_1_0= ruleVisualOption ) ) (otherlv_2= ',' ( (lv_vis_ops_3_0= ruleVisualOption ) ) )* )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4333:1: (otherlv_0= ':' ( (lv_vis_ops_1_0= ruleVisualOption ) ) (otherlv_2= ',' ( (lv_vis_ops_3_0= ruleVisualOption ) ) )* )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4333:3: otherlv_0= ':' ( (lv_vis_ops_1_0= ruleVisualOption ) ) (otherlv_2= ',' ( (lv_vis_ops_3_0= ruleVisualOption ) ) )*
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleVisualOptions10047); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getVisualOptionsAccess().getColonKeyword_0());
                  
            }
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4337:1: ( (lv_vis_ops_1_0= ruleVisualOption ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4338:1: (lv_vis_ops_1_0= ruleVisualOption )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4338:1: (lv_vis_ops_1_0= ruleVisualOption )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4339:3: lv_vis_ops_1_0= ruleVisualOption
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVisualOptionsAccess().getVis_opsVisualOptionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVisualOption_in_ruleVisualOptions10068);
            lv_vis_ops_1_0=ruleVisualOption();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVisualOptionsRule());
              	        }
                     		add(
                     			current, 
                     			"vis_ops",
                      		lv_vis_ops_1_0, 
                      		"VisualOption");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4355:2: (otherlv_2= ',' ( (lv_vis_ops_3_0= ruleVisualOption ) ) )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==30) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4355:4: otherlv_2= ',' ( (lv_vis_ops_3_0= ruleVisualOption ) )
            	    {
            	    otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleVisualOptions10081); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getVisualOptionsAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4359:1: ( (lv_vis_ops_3_0= ruleVisualOption ) )
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4360:1: (lv_vis_ops_3_0= ruleVisualOption )
            	    {
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4360:1: (lv_vis_ops_3_0= ruleVisualOption )
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4361:3: lv_vis_ops_3_0= ruleVisualOption
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getVisualOptionsAccess().getVis_opsVisualOptionParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleVisualOption_in_ruleVisualOptions10102);
            	    lv_vis_ops_3_0=ruleVisualOption();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getVisualOptionsRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"vis_ops",
            	              		lv_vis_ops_3_0, 
            	              		"VisualOption");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

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

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleVisualOptions"


    // $ANTLR start "entryRuleVisualOption"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4385:1: entryRuleVisualOption returns [EObject current=null] : iv_ruleVisualOption= ruleVisualOption EOF ;
    public final EObject entryRuleVisualOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVisualOption = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4386:2: (iv_ruleVisualOption= ruleVisualOption EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4387:2: iv_ruleVisualOption= ruleVisualOption EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVisualOptionRule()); 
            }
            pushFollow(FOLLOW_ruleVisualOption_in_entryRuleVisualOption10140);
            iv_ruleVisualOption=ruleVisualOption();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVisualOption; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVisualOption10150); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVisualOption"


    // $ANTLR start "ruleVisualOption"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4394:1: ruleVisualOption returns [EObject current=null] : ( ( ( ( (lv_name_0_0= 'TITLE' ) ) | ( (lv_name_1_0= 'DATE' ) ) | ( (lv_name_2_0= 'DESCRIPTION' ) ) | ( (lv_name_3_0= 'PICTURE' ) ) | ( (lv_name_4_0= 'STATE' ) ) | ( (lv_name_5_0= 'COUNTY' ) ) | ( (lv_name_6_0= 'WEIGHT' ) ) | ( (lv_name_7_0= 'SIZE' ) ) ) otherlv_8= '(' ( (lv_funcs_9_0= ruleFunction ) ) otherlv_10= ')' ) | ( ( (lv_vis_mult_11_0= ruleVisualMultival ) ) otherlv_12= '(' ( (lv_funcs_13_0= ruleFunction ) ) (otherlv_14= ',' ( (lv_funcs_15_0= ruleFunction ) ) )* otherlv_16= ')' ) | ( ( (lv_name_17_0= 'SELECTS' ) ) otherlv_18= '(' this_ID_19= RULE_ID otherlv_20= '->' this_ID_21= RULE_ID otherlv_22= ')' ) ) ;
    public final EObject ruleVisualOption() throws RecognitionException {
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

        EObject lv_vis_mult_11_0 = null;

        EObject lv_funcs_13_0 = null;

        EObject lv_funcs_15_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4397:28: ( ( ( ( ( (lv_name_0_0= 'TITLE' ) ) | ( (lv_name_1_0= 'DATE' ) ) | ( (lv_name_2_0= 'DESCRIPTION' ) ) | ( (lv_name_3_0= 'PICTURE' ) ) | ( (lv_name_4_0= 'STATE' ) ) | ( (lv_name_5_0= 'COUNTY' ) ) | ( (lv_name_6_0= 'WEIGHT' ) ) | ( (lv_name_7_0= 'SIZE' ) ) ) otherlv_8= '(' ( (lv_funcs_9_0= ruleFunction ) ) otherlv_10= ')' ) | ( ( (lv_vis_mult_11_0= ruleVisualMultival ) ) otherlv_12= '(' ( (lv_funcs_13_0= ruleFunction ) ) (otherlv_14= ',' ( (lv_funcs_15_0= ruleFunction ) ) )* otherlv_16= ')' ) | ( ( (lv_name_17_0= 'SELECTS' ) ) otherlv_18= '(' this_ID_19= RULE_ID otherlv_20= '->' this_ID_21= RULE_ID otherlv_22= ')' ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4398:1: ( ( ( ( (lv_name_0_0= 'TITLE' ) ) | ( (lv_name_1_0= 'DATE' ) ) | ( (lv_name_2_0= 'DESCRIPTION' ) ) | ( (lv_name_3_0= 'PICTURE' ) ) | ( (lv_name_4_0= 'STATE' ) ) | ( (lv_name_5_0= 'COUNTY' ) ) | ( (lv_name_6_0= 'WEIGHT' ) ) | ( (lv_name_7_0= 'SIZE' ) ) ) otherlv_8= '(' ( (lv_funcs_9_0= ruleFunction ) ) otherlv_10= ')' ) | ( ( (lv_vis_mult_11_0= ruleVisualMultival ) ) otherlv_12= '(' ( (lv_funcs_13_0= ruleFunction ) ) (otherlv_14= ',' ( (lv_funcs_15_0= ruleFunction ) ) )* otherlv_16= ')' ) | ( ( (lv_name_17_0= 'SELECTS' ) ) otherlv_18= '(' this_ID_19= RULE_ID otherlv_20= '->' this_ID_21= RULE_ID otherlv_22= ')' ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4398:1: ( ( ( ( (lv_name_0_0= 'TITLE' ) ) | ( (lv_name_1_0= 'DATE' ) ) | ( (lv_name_2_0= 'DESCRIPTION' ) ) | ( (lv_name_3_0= 'PICTURE' ) ) | ( (lv_name_4_0= 'STATE' ) ) | ( (lv_name_5_0= 'COUNTY' ) ) | ( (lv_name_6_0= 'WEIGHT' ) ) | ( (lv_name_7_0= 'SIZE' ) ) ) otherlv_8= '(' ( (lv_funcs_9_0= ruleFunction ) ) otherlv_10= ')' ) | ( ( (lv_vis_mult_11_0= ruleVisualMultival ) ) otherlv_12= '(' ( (lv_funcs_13_0= ruleFunction ) ) (otherlv_14= ',' ( (lv_funcs_15_0= ruleFunction ) ) )* otherlv_16= ')' ) | ( ( (lv_name_17_0= 'SELECTS' ) ) otherlv_18= '(' this_ID_19= RULE_ID otherlv_20= '->' this_ID_21= RULE_ID otherlv_22= ')' ) )
            int alt73=3;
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
                alt73=1;
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
                alt73=2;
                }
                break;
            case 113:
                {
                alt73=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }

            switch (alt73) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4398:2: ( ( ( (lv_name_0_0= 'TITLE' ) ) | ( (lv_name_1_0= 'DATE' ) ) | ( (lv_name_2_0= 'DESCRIPTION' ) ) | ( (lv_name_3_0= 'PICTURE' ) ) | ( (lv_name_4_0= 'STATE' ) ) | ( (lv_name_5_0= 'COUNTY' ) ) | ( (lv_name_6_0= 'WEIGHT' ) ) | ( (lv_name_7_0= 'SIZE' ) ) ) otherlv_8= '(' ( (lv_funcs_9_0= ruleFunction ) ) otherlv_10= ')' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4398:2: ( ( ( (lv_name_0_0= 'TITLE' ) ) | ( (lv_name_1_0= 'DATE' ) ) | ( (lv_name_2_0= 'DESCRIPTION' ) ) | ( (lv_name_3_0= 'PICTURE' ) ) | ( (lv_name_4_0= 'STATE' ) ) | ( (lv_name_5_0= 'COUNTY' ) ) | ( (lv_name_6_0= 'WEIGHT' ) ) | ( (lv_name_7_0= 'SIZE' ) ) ) otherlv_8= '(' ( (lv_funcs_9_0= ruleFunction ) ) otherlv_10= ')' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4398:3: ( ( (lv_name_0_0= 'TITLE' ) ) | ( (lv_name_1_0= 'DATE' ) ) | ( (lv_name_2_0= 'DESCRIPTION' ) ) | ( (lv_name_3_0= 'PICTURE' ) ) | ( (lv_name_4_0= 'STATE' ) ) | ( (lv_name_5_0= 'COUNTY' ) ) | ( (lv_name_6_0= 'WEIGHT' ) ) | ( (lv_name_7_0= 'SIZE' ) ) ) otherlv_8= '(' ( (lv_funcs_9_0= ruleFunction ) ) otherlv_10= ')'
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4398:3: ( ( (lv_name_0_0= 'TITLE' ) ) | ( (lv_name_1_0= 'DATE' ) ) | ( (lv_name_2_0= 'DESCRIPTION' ) ) | ( (lv_name_3_0= 'PICTURE' ) ) | ( (lv_name_4_0= 'STATE' ) ) | ( (lv_name_5_0= 'COUNTY' ) ) | ( (lv_name_6_0= 'WEIGHT' ) ) | ( (lv_name_7_0= 'SIZE' ) ) )
                    int alt71=8;
                    switch ( input.LA(1) ) {
                    case 106:
                        {
                        alt71=1;
                        }
                        break;
                    case 107:
                        {
                        alt71=2;
                        }
                        break;
                    case 13:
                        {
                        alt71=3;
                        }
                        break;
                    case 108:
                        {
                        alt71=4;
                        }
                        break;
                    case 109:
                        {
                        alt71=5;
                        }
                        break;
                    case 110:
                        {
                        alt71=6;
                        }
                        break;
                    case 111:
                        {
                        alt71=7;
                        }
                        break;
                    case 112:
                        {
                        alt71=8;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 71, 0, input);

                        throw nvae;
                    }

                    switch (alt71) {
                        case 1 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4398:4: ( (lv_name_0_0= 'TITLE' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4398:4: ( (lv_name_0_0= 'TITLE' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4399:1: (lv_name_0_0= 'TITLE' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4399:1: (lv_name_0_0= 'TITLE' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4400:3: lv_name_0_0= 'TITLE'
                            {
                            lv_name_0_0=(Token)match(input,106,FOLLOW_106_in_ruleVisualOption10195); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_name_0_0, grammarAccess.getVisualOptionAccess().getNameTITLEKeyword_0_0_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getVisualOptionRule());
                              	        }
                                     		setWithLastConsumed(current, "name", lv_name_0_0, "TITLE");
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4414:6: ( (lv_name_1_0= 'DATE' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4414:6: ( (lv_name_1_0= 'DATE' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4415:1: (lv_name_1_0= 'DATE' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4415:1: (lv_name_1_0= 'DATE' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4416:3: lv_name_1_0= 'DATE'
                            {
                            lv_name_1_0=(Token)match(input,107,FOLLOW_107_in_ruleVisualOption10232); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_name_1_0, grammarAccess.getVisualOptionAccess().getNameDATEKeyword_0_0_1_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getVisualOptionRule());
                              	        }
                                     		setWithLastConsumed(current, "name", lv_name_1_0, "DATE");
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 3 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4430:6: ( (lv_name_2_0= 'DESCRIPTION' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4430:6: ( (lv_name_2_0= 'DESCRIPTION' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4431:1: (lv_name_2_0= 'DESCRIPTION' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4431:1: (lv_name_2_0= 'DESCRIPTION' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4432:3: lv_name_2_0= 'DESCRIPTION'
                            {
                            lv_name_2_0=(Token)match(input,13,FOLLOW_13_in_ruleVisualOption10269); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_name_2_0, grammarAccess.getVisualOptionAccess().getNameDESCRIPTIONKeyword_0_0_2_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getVisualOptionRule());
                              	        }
                                     		setWithLastConsumed(current, "name", lv_name_2_0, "DESCRIPTION");
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 4 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4446:6: ( (lv_name_3_0= 'PICTURE' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4446:6: ( (lv_name_3_0= 'PICTURE' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4447:1: (lv_name_3_0= 'PICTURE' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4447:1: (lv_name_3_0= 'PICTURE' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4448:3: lv_name_3_0= 'PICTURE'
                            {
                            lv_name_3_0=(Token)match(input,108,FOLLOW_108_in_ruleVisualOption10306); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_name_3_0, grammarAccess.getVisualOptionAccess().getNamePICTUREKeyword_0_0_3_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getVisualOptionRule());
                              	        }
                                     		setWithLastConsumed(current, "name", lv_name_3_0, "PICTURE");
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 5 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4462:6: ( (lv_name_4_0= 'STATE' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4462:6: ( (lv_name_4_0= 'STATE' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4463:1: (lv_name_4_0= 'STATE' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4463:1: (lv_name_4_0= 'STATE' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4464:3: lv_name_4_0= 'STATE'
                            {
                            lv_name_4_0=(Token)match(input,109,FOLLOW_109_in_ruleVisualOption10343); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_name_4_0, grammarAccess.getVisualOptionAccess().getNameSTATEKeyword_0_0_4_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getVisualOptionRule());
                              	        }
                                     		setWithLastConsumed(current, "name", lv_name_4_0, "STATE");
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 6 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4478:6: ( (lv_name_5_0= 'COUNTY' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4478:6: ( (lv_name_5_0= 'COUNTY' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4479:1: (lv_name_5_0= 'COUNTY' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4479:1: (lv_name_5_0= 'COUNTY' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4480:3: lv_name_5_0= 'COUNTY'
                            {
                            lv_name_5_0=(Token)match(input,110,FOLLOW_110_in_ruleVisualOption10380); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_name_5_0, grammarAccess.getVisualOptionAccess().getNameCOUNTYKeyword_0_0_5_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getVisualOptionRule());
                              	        }
                                     		setWithLastConsumed(current, "name", lv_name_5_0, "COUNTY");
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 7 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4494:6: ( (lv_name_6_0= 'WEIGHT' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4494:6: ( (lv_name_6_0= 'WEIGHT' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4495:1: (lv_name_6_0= 'WEIGHT' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4495:1: (lv_name_6_0= 'WEIGHT' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4496:3: lv_name_6_0= 'WEIGHT'
                            {
                            lv_name_6_0=(Token)match(input,111,FOLLOW_111_in_ruleVisualOption10417); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_name_6_0, grammarAccess.getVisualOptionAccess().getNameWEIGHTKeyword_0_0_6_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getVisualOptionRule());
                              	        }
                                     		setWithLastConsumed(current, "name", lv_name_6_0, "WEIGHT");
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 8 :
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4510:6: ( (lv_name_7_0= 'SIZE' ) )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4510:6: ( (lv_name_7_0= 'SIZE' ) )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4511:1: (lv_name_7_0= 'SIZE' )
                            {
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4511:1: (lv_name_7_0= 'SIZE' )
                            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4512:3: lv_name_7_0= 'SIZE'
                            {
                            lv_name_7_0=(Token)match(input,112,FOLLOW_112_in_ruleVisualOption10454); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_name_7_0, grammarAccess.getVisualOptionAccess().getNameSIZEKeyword_0_0_7_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getVisualOptionRule());
                              	        }
                                     		setWithLastConsumed(current, "name", lv_name_7_0, "SIZE");
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }

                    otherlv_8=(Token)match(input,36,FOLLOW_36_in_ruleVisualOption10480); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getVisualOptionAccess().getLeftParenthesisKeyword_0_1());
                          
                    }
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4529:1: ( (lv_funcs_9_0= ruleFunction ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4530:1: (lv_funcs_9_0= ruleFunction )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4530:1: (lv_funcs_9_0= ruleFunction )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4531:3: lv_funcs_9_0= ruleFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVisualOptionAccess().getFuncsFunctionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFunction_in_ruleVisualOption10501);
                    lv_funcs_9_0=ruleFunction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getVisualOptionRule());
                      	        }
                             		add(
                             			current, 
                             			"funcs",
                              		lv_funcs_9_0, 
                              		"Function");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_10=(Token)match(input,37,FOLLOW_37_in_ruleVisualOption10513); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getVisualOptionAccess().getRightParenthesisKeyword_0_3());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4552:6: ( ( (lv_vis_mult_11_0= ruleVisualMultival ) ) otherlv_12= '(' ( (lv_funcs_13_0= ruleFunction ) ) (otherlv_14= ',' ( (lv_funcs_15_0= ruleFunction ) ) )* otherlv_16= ')' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4552:6: ( ( (lv_vis_mult_11_0= ruleVisualMultival ) ) otherlv_12= '(' ( (lv_funcs_13_0= ruleFunction ) ) (otherlv_14= ',' ( (lv_funcs_15_0= ruleFunction ) ) )* otherlv_16= ')' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4552:7: ( (lv_vis_mult_11_0= ruleVisualMultival ) ) otherlv_12= '(' ( (lv_funcs_13_0= ruleFunction ) ) (otherlv_14= ',' ( (lv_funcs_15_0= ruleFunction ) ) )* otherlv_16= ')'
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4552:7: ( (lv_vis_mult_11_0= ruleVisualMultival ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4553:1: (lv_vis_mult_11_0= ruleVisualMultival )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4553:1: (lv_vis_mult_11_0= ruleVisualMultival )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4554:3: lv_vis_mult_11_0= ruleVisualMultival
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVisualOptionAccess().getVis_multVisualMultivalParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVisualMultival_in_ruleVisualOption10542);
                    lv_vis_mult_11_0=ruleVisualMultival();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getVisualOptionRule());
                      	        }
                             		set(
                             			current, 
                             			"vis_mult",
                              		lv_vis_mult_11_0, 
                              		"VisualMultival");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_12=(Token)match(input,36,FOLLOW_36_in_ruleVisualOption10554); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getVisualOptionAccess().getLeftParenthesisKeyword_1_1());
                          
                    }
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4574:1: ( (lv_funcs_13_0= ruleFunction ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4575:1: (lv_funcs_13_0= ruleFunction )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4575:1: (lv_funcs_13_0= ruleFunction )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4576:3: lv_funcs_13_0= ruleFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVisualOptionAccess().getFuncsFunctionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFunction_in_ruleVisualOption10575);
                    lv_funcs_13_0=ruleFunction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getVisualOptionRule());
                      	        }
                             		add(
                             			current, 
                             			"funcs",
                              		lv_funcs_13_0, 
                              		"Function");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4592:2: (otherlv_14= ',' ( (lv_funcs_15_0= ruleFunction ) ) )*
                    loop72:
                    do {
                        int alt72=2;
                        int LA72_0 = input.LA(1);

                        if ( (LA72_0==30) ) {
                            alt72=1;
                        }


                        switch (alt72) {
                    	case 1 :
                    	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4592:4: otherlv_14= ',' ( (lv_funcs_15_0= ruleFunction ) )
                    	    {
                    	    otherlv_14=(Token)match(input,30,FOLLOW_30_in_ruleVisualOption10588); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_14, grammarAccess.getVisualOptionAccess().getCommaKeyword_1_3_0());
                    	          
                    	    }
                    	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4596:1: ( (lv_funcs_15_0= ruleFunction ) )
                    	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4597:1: (lv_funcs_15_0= ruleFunction )
                    	    {
                    	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4597:1: (lv_funcs_15_0= ruleFunction )
                    	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4598:3: lv_funcs_15_0= ruleFunction
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getVisualOptionAccess().getFuncsFunctionParserRuleCall_1_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleFunction_in_ruleVisualOption10609);
                    	    lv_funcs_15_0=ruleFunction();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getVisualOptionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"funcs",
                    	              		lv_funcs_15_0, 
                    	              		"Function");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop72;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,37,FOLLOW_37_in_ruleVisualOption10623); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_16, grammarAccess.getVisualOptionAccess().getRightParenthesisKeyword_1_4());
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4619:6: ( ( (lv_name_17_0= 'SELECTS' ) ) otherlv_18= '(' this_ID_19= RULE_ID otherlv_20= '->' this_ID_21= RULE_ID otherlv_22= ')' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4619:6: ( ( (lv_name_17_0= 'SELECTS' ) ) otherlv_18= '(' this_ID_19= RULE_ID otherlv_20= '->' this_ID_21= RULE_ID otherlv_22= ')' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4619:7: ( (lv_name_17_0= 'SELECTS' ) ) otherlv_18= '(' this_ID_19= RULE_ID otherlv_20= '->' this_ID_21= RULE_ID otherlv_22= ')'
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4619:7: ( (lv_name_17_0= 'SELECTS' ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4620:1: (lv_name_17_0= 'SELECTS' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4620:1: (lv_name_17_0= 'SELECTS' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4621:3: lv_name_17_0= 'SELECTS'
                    {
                    lv_name_17_0=(Token)match(input,113,FOLLOW_113_in_ruleVisualOption10649); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_17_0, grammarAccess.getVisualOptionAccess().getNameSELECTSKeyword_2_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getVisualOptionRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_17_0, "SELECTS");
                      	    
                    }

                    }


                    }

                    otherlv_18=(Token)match(input,36,FOLLOW_36_in_ruleVisualOption10674); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_18, grammarAccess.getVisualOptionAccess().getLeftParenthesisKeyword_2_1());
                          
                    }
                    this_ID_19=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVisualOption10685); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_19, grammarAccess.getVisualOptionAccess().getIDTerminalRuleCall_2_2()); 
                          
                    }
                    otherlv_20=(Token)match(input,114,FOLLOW_114_in_ruleVisualOption10696); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_20, grammarAccess.getVisualOptionAccess().getHyphenMinusGreaterThanSignKeyword_2_3());
                          
                    }
                    this_ID_21=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVisualOption10707); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_21, grammarAccess.getVisualOptionAccess().getIDTerminalRuleCall_2_4()); 
                          
                    }
                    otherlv_22=(Token)match(input,37,FOLLOW_37_in_ruleVisualOption10718); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_22, grammarAccess.getVisualOptionAccess().getRightParenthesisKeyword_2_5());
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleVisualOption"


    // $ANTLR start "entryRuleVisualMultival"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4662:1: entryRuleVisualMultival returns [EObject current=null] : iv_ruleVisualMultival= ruleVisualMultival EOF ;
    public final EObject entryRuleVisualMultival() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVisualMultival = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4663:2: (iv_ruleVisualMultival= ruleVisualMultival EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4664:2: iv_ruleVisualMultival= ruleVisualMultival EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVisualMultivalRule()); 
            }
            pushFollow(FOLLOW_ruleVisualMultival_in_entryRuleVisualMultival10755);
            iv_ruleVisualMultival=ruleVisualMultival();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVisualMultival; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVisualMultival10765); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVisualMultival"


    // $ANTLR start "ruleVisualMultival"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4671:1: ruleVisualMultival returns [EObject current=null] : ( ( (lv_name_0_0= 'X' ) ) | ( (lv_name_1_0= 'Y' ) ) | ( (lv_name_2_0= 'COLOR' ) ) | ( (lv_name_3_0= 'RANGE' ) ) | ( (lv_name_4_0= 'FILTER' ) ) | ( (lv_name_5_0= 'LABEL' ) ) | ( (lv_name_6_0= 'VALUE' ) ) ) ;
    public final EObject ruleVisualMultival() throws RecognitionException {
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
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4674:28: ( ( ( (lv_name_0_0= 'X' ) ) | ( (lv_name_1_0= 'Y' ) ) | ( (lv_name_2_0= 'COLOR' ) ) | ( (lv_name_3_0= 'RANGE' ) ) | ( (lv_name_4_0= 'FILTER' ) ) | ( (lv_name_5_0= 'LABEL' ) ) | ( (lv_name_6_0= 'VALUE' ) ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4675:1: ( ( (lv_name_0_0= 'X' ) ) | ( (lv_name_1_0= 'Y' ) ) | ( (lv_name_2_0= 'COLOR' ) ) | ( (lv_name_3_0= 'RANGE' ) ) | ( (lv_name_4_0= 'FILTER' ) ) | ( (lv_name_5_0= 'LABEL' ) ) | ( (lv_name_6_0= 'VALUE' ) ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4675:1: ( ( (lv_name_0_0= 'X' ) ) | ( (lv_name_1_0= 'Y' ) ) | ( (lv_name_2_0= 'COLOR' ) ) | ( (lv_name_3_0= 'RANGE' ) ) | ( (lv_name_4_0= 'FILTER' ) ) | ( (lv_name_5_0= 'LABEL' ) ) | ( (lv_name_6_0= 'VALUE' ) ) )
            int alt74=7;
            switch ( input.LA(1) ) {
            case 115:
                {
                alt74=1;
                }
                break;
            case 116:
                {
                alt74=2;
                }
                break;
            case 117:
                {
                alt74=3;
                }
                break;
            case 56:
                {
                alt74=4;
                }
                break;
            case 118:
                {
                alt74=5;
                }
                break;
            case 18:
                {
                alt74=6;
                }
                break;
            case 119:
                {
                alt74=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }

            switch (alt74) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4675:2: ( (lv_name_0_0= 'X' ) )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4675:2: ( (lv_name_0_0= 'X' ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4676:1: (lv_name_0_0= 'X' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4676:1: (lv_name_0_0= 'X' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4677:3: lv_name_0_0= 'X'
                    {
                    lv_name_0_0=(Token)match(input,115,FOLLOW_115_in_ruleVisualMultival10808); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_0_0, grammarAccess.getVisualMultivalAccess().getNameXKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getVisualMultivalRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_0_0, "X");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4691:6: ( (lv_name_1_0= 'Y' ) )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4691:6: ( (lv_name_1_0= 'Y' ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4692:1: (lv_name_1_0= 'Y' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4692:1: (lv_name_1_0= 'Y' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4693:3: lv_name_1_0= 'Y'
                    {
                    lv_name_1_0=(Token)match(input,116,FOLLOW_116_in_ruleVisualMultival10845); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_1_0, grammarAccess.getVisualMultivalAccess().getNameYKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getVisualMultivalRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_1_0, "Y");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4707:6: ( (lv_name_2_0= 'COLOR' ) )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4707:6: ( (lv_name_2_0= 'COLOR' ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4708:1: (lv_name_2_0= 'COLOR' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4708:1: (lv_name_2_0= 'COLOR' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4709:3: lv_name_2_0= 'COLOR'
                    {
                    lv_name_2_0=(Token)match(input,117,FOLLOW_117_in_ruleVisualMultival10882); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_2_0, grammarAccess.getVisualMultivalAccess().getNameCOLORKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getVisualMultivalRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_2_0, "COLOR");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4723:6: ( (lv_name_3_0= 'RANGE' ) )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4723:6: ( (lv_name_3_0= 'RANGE' ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4724:1: (lv_name_3_0= 'RANGE' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4724:1: (lv_name_3_0= 'RANGE' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4725:3: lv_name_3_0= 'RANGE'
                    {
                    lv_name_3_0=(Token)match(input,56,FOLLOW_56_in_ruleVisualMultival10919); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_3_0, grammarAccess.getVisualMultivalAccess().getNameRANGEKeyword_3_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getVisualMultivalRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_3_0, "RANGE");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4739:6: ( (lv_name_4_0= 'FILTER' ) )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4739:6: ( (lv_name_4_0= 'FILTER' ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4740:1: (lv_name_4_0= 'FILTER' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4740:1: (lv_name_4_0= 'FILTER' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4741:3: lv_name_4_0= 'FILTER'
                    {
                    lv_name_4_0=(Token)match(input,118,FOLLOW_118_in_ruleVisualMultival10956); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_4_0, grammarAccess.getVisualMultivalAccess().getNameFILTERKeyword_4_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getVisualMultivalRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_4_0, "FILTER");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4755:6: ( (lv_name_5_0= 'LABEL' ) )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4755:6: ( (lv_name_5_0= 'LABEL' ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4756:1: (lv_name_5_0= 'LABEL' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4756:1: (lv_name_5_0= 'LABEL' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4757:3: lv_name_5_0= 'LABEL'
                    {
                    lv_name_5_0=(Token)match(input,18,FOLLOW_18_in_ruleVisualMultival10993); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_5_0, grammarAccess.getVisualMultivalAccess().getNameLABELKeyword_5_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getVisualMultivalRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_5_0, "LABEL");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4771:6: ( (lv_name_6_0= 'VALUE' ) )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4771:6: ( (lv_name_6_0= 'VALUE' ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4772:1: (lv_name_6_0= 'VALUE' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4772:1: (lv_name_6_0= 'VALUE' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4773:3: lv_name_6_0= 'VALUE'
                    {
                    lv_name_6_0=(Token)match(input,119,FOLLOW_119_in_ruleVisualMultival11030); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_6_0, grammarAccess.getVisualMultivalAccess().getNameVALUEKeyword_6_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getVisualMultivalRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_6_0, "VALUE");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleVisualMultival"


    // $ANTLR start "entryRuleCustomSection"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4794:1: entryRuleCustomSection returns [EObject current=null] : iv_ruleCustomSection= ruleCustomSection EOF ;
    public final EObject entryRuleCustomSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomSection = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4795:2: (iv_ruleCustomSection= ruleCustomSection EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4796:2: iv_ruleCustomSection= ruleCustomSection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCustomSectionRule()); 
            }
            pushFollow(FOLLOW_ruleCustomSection_in_entryRuleCustomSection11079);
            iv_ruleCustomSection=ruleCustomSection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCustomSection; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCustomSection11089); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCustomSection"


    // $ANTLR start "ruleCustomSection"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4803:1: ruleCustomSection returns [EObject current=null] : ( ( (lv_name_0_0= 'CUSTOM' ) ) ( (lv_cust_vals_1_0= ruleCustomValue ) )* ( ( 'END' )=>otherlv_2= 'END' ) ) ;
    public final EObject ruleCustomSection() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        EObject lv_cust_vals_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4806:28: ( ( ( (lv_name_0_0= 'CUSTOM' ) ) ( (lv_cust_vals_1_0= ruleCustomValue ) )* ( ( 'END' )=>otherlv_2= 'END' ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4807:1: ( ( (lv_name_0_0= 'CUSTOM' ) ) ( (lv_cust_vals_1_0= ruleCustomValue ) )* ( ( 'END' )=>otherlv_2= 'END' ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4807:1: ( ( (lv_name_0_0= 'CUSTOM' ) ) ( (lv_cust_vals_1_0= ruleCustomValue ) )* ( ( 'END' )=>otherlv_2= 'END' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4807:2: ( (lv_name_0_0= 'CUSTOM' ) ) ( (lv_cust_vals_1_0= ruleCustomValue ) )* ( ( 'END' )=>otherlv_2= 'END' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4807:2: ( (lv_name_0_0= 'CUSTOM' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4808:1: (lv_name_0_0= 'CUSTOM' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4808:1: (lv_name_0_0= 'CUSTOM' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4809:3: lv_name_0_0= 'CUSTOM'
            {
            lv_name_0_0=(Token)match(input,27,FOLLOW_27_in_ruleCustomSection11132); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_name_0_0, grammarAccess.getCustomSectionAccess().getNameCUSTOMKeyword_0_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getCustomSectionRule());
              	        }
                     		setWithLastConsumed(current, "name", lv_name_0_0, "CUSTOM");
              	    
            }

            }


            }

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4822:2: ( (lv_cust_vals_1_0= ruleCustomValue ) )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==RULE_ID) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4823:1: (lv_cust_vals_1_0= ruleCustomValue )
            	    {
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4823:1: (lv_cust_vals_1_0= ruleCustomValue )
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4824:3: lv_cust_vals_1_0= ruleCustomValue
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCustomSectionAccess().getCust_valsCustomValueParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleCustomValue_in_ruleCustomSection11166);
            	    lv_cust_vals_1_0=ruleCustomValue();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getCustomSectionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"cust_vals",
            	              		lv_cust_vals_1_0, 
            	              		"CustomValue");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop75;
                }
            } while (true);

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4840:3: ( ( 'END' )=>otherlv_2= 'END' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4840:4: ( 'END' )=>otherlv_2= 'END'
            {
            otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleCustomSection11187); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCustomSectionAccess().getENDKeyword_2());
                  
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleCustomSection"


    // $ANTLR start "entryRuleCustomValue"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4853:1: entryRuleCustomValue returns [EObject current=null] : iv_ruleCustomValue= ruleCustomValue EOF ;
    public final EObject entryRuleCustomValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomValue = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4854:2: (iv_ruleCustomValue= ruleCustomValue EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4855:2: iv_ruleCustomValue= ruleCustomValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCustomValueRule()); 
            }
            pushFollow(FOLLOW_ruleCustomValue_in_entryRuleCustomValue11224);
            iv_ruleCustomValue=ruleCustomValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCustomValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCustomValue11234); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCustomValue"


    // $ANTLR start "ruleCustomValue"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4862:1: ruleCustomValue returns [EObject current=null] : (this_ID_0= RULE_ID this_Value_1= ruleValue otherlv_2= ';' ) ;
    public final EObject ruleCustomValue() throws RecognitionException {
        EObject current = null;

        Token this_ID_0=null;
        Token otherlv_2=null;
        EObject this_Value_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4865:28: ( (this_ID_0= RULE_ID this_Value_1= ruleValue otherlv_2= ';' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4866:1: (this_ID_0= RULE_ID this_Value_1= ruleValue otherlv_2= ';' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4866:1: (this_ID_0= RULE_ID this_Value_1= ruleValue otherlv_2= ';' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4866:2: this_ID_0= RULE_ID this_Value_1= ruleValue otherlv_2= ';'
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCustomValue11270); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getCustomValueAccess().getIDTerminalRuleCall_0()); 
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getCustomValueAccess().getValueParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleValue_in_ruleCustomValue11291);
            this_Value_1=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Value_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleCustomValue11302); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCustomValueAccess().getSemicolonKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleCustomValue"


    // $ANTLR start "entryRuleResourceOption"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4891:1: entryRuleResourceOption returns [EObject current=null] : iv_ruleResourceOption= ruleResourceOption EOF ;
    public final EObject entryRuleResourceOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResourceOption = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4892:2: (iv_ruleResourceOption= ruleResourceOption EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4893:2: iv_ruleResourceOption= ruleResourceOption EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getResourceOptionRule()); 
            }
            pushFollow(FOLLOW_ruleResourceOption_in_entryRuleResourceOption11338);
            iv_ruleResourceOption=ruleResourceOption();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleResourceOption; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleResourceOption11348); if (state.failed) return current;

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
    // $ANTLR end "entryRuleResourceOption"


    // $ANTLR start "ruleResourceOption"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4900:1: ruleResourceOption returns [EObject current=null] : ( ( ( (lv_name_0_0= 'DESCRIPTION' ) ) | ( (lv_name_1_0= 'FILE' ) ) | ( (lv_name_2_0= 'LABEL' ) ) | ( (lv_name_3_0= '_HTML_STYLECLASS' ) ) ) otherlv_4= '(' ( (lv_vals_5_0= ruleValue ) ) otherlv_6= ')' ) ;
    public final EObject ruleResourceOption() throws RecognitionException {
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
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4903:28: ( ( ( ( (lv_name_0_0= 'DESCRIPTION' ) ) | ( (lv_name_1_0= 'FILE' ) ) | ( (lv_name_2_0= 'LABEL' ) ) | ( (lv_name_3_0= '_HTML_STYLECLASS' ) ) ) otherlv_4= '(' ( (lv_vals_5_0= ruleValue ) ) otherlv_6= ')' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4904:1: ( ( ( (lv_name_0_0= 'DESCRIPTION' ) ) | ( (lv_name_1_0= 'FILE' ) ) | ( (lv_name_2_0= 'LABEL' ) ) | ( (lv_name_3_0= '_HTML_STYLECLASS' ) ) ) otherlv_4= '(' ( (lv_vals_5_0= ruleValue ) ) otherlv_6= ')' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4904:1: ( ( ( (lv_name_0_0= 'DESCRIPTION' ) ) | ( (lv_name_1_0= 'FILE' ) ) | ( (lv_name_2_0= 'LABEL' ) ) | ( (lv_name_3_0= '_HTML_STYLECLASS' ) ) ) otherlv_4= '(' ( (lv_vals_5_0= ruleValue ) ) otherlv_6= ')' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4904:2: ( ( (lv_name_0_0= 'DESCRIPTION' ) ) | ( (lv_name_1_0= 'FILE' ) ) | ( (lv_name_2_0= 'LABEL' ) ) | ( (lv_name_3_0= '_HTML_STYLECLASS' ) ) ) otherlv_4= '(' ( (lv_vals_5_0= ruleValue ) ) otherlv_6= ')'
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4904:2: ( ( (lv_name_0_0= 'DESCRIPTION' ) ) | ( (lv_name_1_0= 'FILE' ) ) | ( (lv_name_2_0= 'LABEL' ) ) | ( (lv_name_3_0= '_HTML_STYLECLASS' ) ) )
            int alt76=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt76=1;
                }
                break;
            case 120:
                {
                alt76=2;
                }
                break;
            case 18:
                {
                alt76=3;
                }
                break;
            case 63:
                {
                alt76=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }

            switch (alt76) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4904:3: ( (lv_name_0_0= 'DESCRIPTION' ) )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4904:3: ( (lv_name_0_0= 'DESCRIPTION' ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4905:1: (lv_name_0_0= 'DESCRIPTION' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4905:1: (lv_name_0_0= 'DESCRIPTION' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4906:3: lv_name_0_0= 'DESCRIPTION'
                    {
                    lv_name_0_0=(Token)match(input,13,FOLLOW_13_in_ruleResourceOption11392); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_0_0, grammarAccess.getResourceOptionAccess().getNameDESCRIPTIONKeyword_0_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getResourceOptionRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_0_0, "DESCRIPTION");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4920:6: ( (lv_name_1_0= 'FILE' ) )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4920:6: ( (lv_name_1_0= 'FILE' ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4921:1: (lv_name_1_0= 'FILE' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4921:1: (lv_name_1_0= 'FILE' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4922:3: lv_name_1_0= 'FILE'
                    {
                    lv_name_1_0=(Token)match(input,120,FOLLOW_120_in_ruleResourceOption11429); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_1_0, grammarAccess.getResourceOptionAccess().getNameFILEKeyword_0_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getResourceOptionRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_1_0, "FILE");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4936:6: ( (lv_name_2_0= 'LABEL' ) )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4936:6: ( (lv_name_2_0= 'LABEL' ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4937:1: (lv_name_2_0= 'LABEL' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4937:1: (lv_name_2_0= 'LABEL' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4938:3: lv_name_2_0= 'LABEL'
                    {
                    lv_name_2_0=(Token)match(input,18,FOLLOW_18_in_ruleResourceOption11466); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_2_0, grammarAccess.getResourceOptionAccess().getNameLABELKeyword_0_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getResourceOptionRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_2_0, "LABEL");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4952:6: ( (lv_name_3_0= '_HTML_STYLECLASS' ) )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4952:6: ( (lv_name_3_0= '_HTML_STYLECLASS' ) )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4953:1: (lv_name_3_0= '_HTML_STYLECLASS' )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4953:1: (lv_name_3_0= '_HTML_STYLECLASS' )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4954:3: lv_name_3_0= '_HTML_STYLECLASS'
                    {
                    lv_name_3_0=(Token)match(input,63,FOLLOW_63_in_ruleResourceOption11503); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_3_0, grammarAccess.getResourceOptionAccess().getName_HTML_STYLECLASSKeyword_0_3_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getResourceOptionRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_3_0, "_HTML_STYLECLASS");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,36,FOLLOW_36_in_ruleResourceOption11529); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getResourceOptionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4971:1: ( (lv_vals_5_0= ruleValue ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4972:1: (lv_vals_5_0= ruleValue )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4972:1: (lv_vals_5_0= ruleValue )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4973:3: lv_vals_5_0= ruleValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getResourceOptionAccess().getValsValueParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValue_in_ruleResourceOption11550);
            lv_vals_5_0=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getResourceOptionRule());
              	        }
                     		set(
                     			current, 
                     			"vals",
                      		lv_vals_5_0, 
                      		"Value");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,37,FOLLOW_37_in_ruleResourceOption11562); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getResourceOptionAccess().getRightParenthesisKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleResourceOption"


    // $ANTLR start "entryRuleResourceOptions"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:5001:1: entryRuleResourceOptions returns [EObject current=null] : iv_ruleResourceOptions= ruleResourceOptions EOF ;
    public final EObject entryRuleResourceOptions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResourceOptions = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:5002:2: (iv_ruleResourceOptions= ruleResourceOptions EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:5003:2: iv_ruleResourceOptions= ruleResourceOptions EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getResourceOptionsRule()); 
            }
            pushFollow(FOLLOW_ruleResourceOptions_in_entryRuleResourceOptions11598);
            iv_ruleResourceOptions=ruleResourceOptions();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleResourceOptions; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleResourceOptions11608); if (state.failed) return current;

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
    // $ANTLR end "entryRuleResourceOptions"


    // $ANTLR start "ruleResourceOptions"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:5010:1: ruleResourceOptions returns [EObject current=null] : ( ( (lv_res_ops_0_0= ruleResourceOption ) ) (otherlv_1= ',' ( (lv_res_ops_2_0= ruleResourceOption ) ) )* ) ;
    public final EObject ruleResourceOptions() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_res_ops_0_0 = null;

        EObject lv_res_ops_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:5013:28: ( ( ( (lv_res_ops_0_0= ruleResourceOption ) ) (otherlv_1= ',' ( (lv_res_ops_2_0= ruleResourceOption ) ) )* ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:5014:1: ( ( (lv_res_ops_0_0= ruleResourceOption ) ) (otherlv_1= ',' ( (lv_res_ops_2_0= ruleResourceOption ) ) )* )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:5014:1: ( ( (lv_res_ops_0_0= ruleResourceOption ) ) (otherlv_1= ',' ( (lv_res_ops_2_0= ruleResourceOption ) ) )* )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:5014:2: ( (lv_res_ops_0_0= ruleResourceOption ) ) (otherlv_1= ',' ( (lv_res_ops_2_0= ruleResourceOption ) ) )*
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:5014:2: ( (lv_res_ops_0_0= ruleResourceOption ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:5015:1: (lv_res_ops_0_0= ruleResourceOption )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:5015:1: (lv_res_ops_0_0= ruleResourceOption )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:5016:3: lv_res_ops_0_0= ruleResourceOption
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getResourceOptionsAccess().getRes_opsResourceOptionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleResourceOption_in_ruleResourceOptions11654);
            lv_res_ops_0_0=ruleResourceOption();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getResourceOptionsRule());
              	        }
                     		add(
                     			current, 
                     			"res_ops",
                      		lv_res_ops_0_0, 
                      		"ResourceOption");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:5032:2: (otherlv_1= ',' ( (lv_res_ops_2_0= ruleResourceOption ) ) )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==30) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:5032:4: otherlv_1= ',' ( (lv_res_ops_2_0= ruleResourceOption ) )
            	    {
            	    otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleResourceOptions11667); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getResourceOptionsAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:5036:1: ( (lv_res_ops_2_0= ruleResourceOption ) )
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:5037:1: (lv_res_ops_2_0= ruleResourceOption )
            	    {
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:5037:1: (lv_res_ops_2_0= ruleResourceOption )
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:5038:3: lv_res_ops_2_0= ruleResourceOption
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getResourceOptionsAccess().getRes_opsResourceOptionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleResourceOption_in_ruleResourceOptions11688);
            	    lv_res_ops_2_0=ruleResourceOption();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getResourceOptionsRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"res_ops",
            	              		lv_res_ops_2_0, 
            	              		"ResourceOption");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop77;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleResourceOptions"


    // $ANTLR start "entryRuleResourceValue"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:5062:1: entryRuleResourceValue returns [EObject current=null] : iv_ruleResourceValue= ruleResourceValue EOF ;
    public final EObject entryRuleResourceValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResourceValue = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:5063:2: (iv_ruleResourceValue= ruleResourceValue EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:5064:2: iv_ruleResourceValue= ruleResourceValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getResourceValueRule()); 
            }
            pushFollow(FOLLOW_ruleResourceValue_in_entryRuleResourceValue11726);
            iv_ruleResourceValue=ruleResourceValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleResourceValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleResourceValue11736); if (state.failed) return current;

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
    // $ANTLR end "entryRuleResourceValue"


    // $ANTLR start "ruleResourceValue"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:5071:1: ruleResourceValue returns [EObject current=null] : (this_Value_0= ruleValue otherlv_1= ':' ( (lv_res_ops_2_0= ruleResourceOptions ) )? otherlv_3= ';' ) ;
    public final EObject ruleResourceValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_Value_0 = null;

        EObject lv_res_ops_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:5074:28: ( (this_Value_0= ruleValue otherlv_1= ':' ( (lv_res_ops_2_0= ruleResourceOptions ) )? otherlv_3= ';' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:5075:1: (this_Value_0= ruleValue otherlv_1= ':' ( (lv_res_ops_2_0= ruleResourceOptions ) )? otherlv_3= ';' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:5075:1: (this_Value_0= ruleValue otherlv_1= ':' ( (lv_res_ops_2_0= ruleResourceOptions ) )? otherlv_3= ';' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:5076:5: this_Value_0= ruleValue otherlv_1= ':' ( (lv_res_ops_2_0= ruleResourceOptions ) )? otherlv_3= ';'
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getResourceValueAccess().getValueParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleValue_in_ruleResourceValue11783);
            this_Value_0=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Value_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleResourceValue11794); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getResourceValueAccess().getColonKeyword_1());
                  
            }
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:5088:1: ( (lv_res_ops_2_0= ruleResourceOptions ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==13||LA78_0==18||LA78_0==63||LA78_0==120) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:5089:1: (lv_res_ops_2_0= ruleResourceOptions )
                    {
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:5089:1: (lv_res_ops_2_0= ruleResourceOptions )
                    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:5090:3: lv_res_ops_2_0= ruleResourceOptions
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getResourceValueAccess().getRes_opsResourceOptionsParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleResourceOptions_in_ruleResourceValue11815);
                    lv_res_ops_2_0=ruleResourceOptions();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getResourceValueRule());
                      	        }
                             		set(
                             			current, 
                             			"res_ops",
                              		lv_res_ops_2_0, 
                              		"ResourceOptions");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleResourceValue11828); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getResourceValueAccess().getSemicolonKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleResourceValue"


    // $ANTLR start "entryRuleResourceSection"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:5118:1: entryRuleResourceSection returns [EObject current=null] : iv_ruleResourceSection= ruleResourceSection EOF ;
    public final EObject entryRuleResourceSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResourceSection = null;


        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:5119:2: (iv_ruleResourceSection= ruleResourceSection EOF )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:5120:2: iv_ruleResourceSection= ruleResourceSection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getResourceSectionRule()); 
            }
            pushFollow(FOLLOW_ruleResourceSection_in_entryRuleResourceSection11864);
            iv_ruleResourceSection=ruleResourceSection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleResourceSection; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleResourceSection11874); if (state.failed) return current;

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
    // $ANTLR end "entryRuleResourceSection"


    // $ANTLR start "ruleResourceSection"
    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:5127:1: ruleResourceSection returns [EObject current=null] : ( ( (lv_name_0_0= 'RESOURCES' ) ) ( (lv_res_vals_1_0= ruleResourceValue ) )+ ( ( 'END' )=>otherlv_2= 'END' ) ) ;
    public final EObject ruleResourceSection() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        EObject lv_res_vals_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:5130:28: ( ( ( (lv_name_0_0= 'RESOURCES' ) ) ( (lv_res_vals_1_0= ruleResourceValue ) )+ ( ( 'END' )=>otherlv_2= 'END' ) ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:5131:1: ( ( (lv_name_0_0= 'RESOURCES' ) ) ( (lv_res_vals_1_0= ruleResourceValue ) )+ ( ( 'END' )=>otherlv_2= 'END' ) )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:5131:1: ( ( (lv_name_0_0= 'RESOURCES' ) ) ( (lv_res_vals_1_0= ruleResourceValue ) )+ ( ( 'END' )=>otherlv_2= 'END' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:5131:2: ( (lv_name_0_0= 'RESOURCES' ) ) ( (lv_res_vals_1_0= ruleResourceValue ) )+ ( ( 'END' )=>otherlv_2= 'END' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:5131:2: ( (lv_name_0_0= 'RESOURCES' ) )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:5132:1: (lv_name_0_0= 'RESOURCES' )
            {
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:5132:1: (lv_name_0_0= 'RESOURCES' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:5133:3: lv_name_0_0= 'RESOURCES'
            {
            lv_name_0_0=(Token)match(input,121,FOLLOW_121_in_ruleResourceSection11917); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_name_0_0, grammarAccess.getResourceSectionAccess().getNameRESOURCESKeyword_0_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getResourceSectionRule());
              	        }
                     		setWithLastConsumed(current, "name", lv_name_0_0, "RESOURCES");
              	    
            }

            }


            }

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:5146:2: ( (lv_res_vals_1_0= ruleResourceValue ) )+
            int cnt79=0;
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( ((LA79_0>=RULE_ID && LA79_0<=RULE_STRING)) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:5147:1: (lv_res_vals_1_0= ruleResourceValue )
            	    {
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:5147:1: (lv_res_vals_1_0= ruleResourceValue )
            	    // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:5148:3: lv_res_vals_1_0= ruleResourceValue
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getResourceSectionAccess().getRes_valsResourceValueParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleResourceValue_in_ruleResourceSection11951);
            	    lv_res_vals_1_0=ruleResourceValue();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getResourceSectionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"res_vals",
            	              		lv_res_vals_1_0, 
            	              		"ResourceValue");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt79 >= 1 ) break loop79;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(79, input);
                        throw eee;
                }
                cnt79++;
            } while (true);

            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:5164:3: ( ( 'END' )=>otherlv_2= 'END' )
            // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:5164:4: ( 'END' )=>otherlv_2= 'END'
            {
            otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleResourceSection11972); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getResourceSectionAccess().getENDKeyword_2());
                  
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleResourceSection"

    // $ANTLR start synpred1_InternalHIPIE
    public final void synpred1_InternalHIPIE_fragment() throws RecognitionException {   
        // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:903:4: ( 'END' )
        // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:903:6: 'END'
        {
        match(input,33,FOLLOW_33_in_synpred1_InternalHIPIE1798); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalHIPIE

    // $ANTLR start synpred2_InternalHIPIE
    public final void synpred2_InternalHIPIE_fragment() throws RecognitionException {   
        // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1009:4: ( 'END' )
        // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1009:6: 'END'
        {
        match(input,33,FOLLOW_33_in_synpred2_InternalHIPIE2033); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalHIPIE

    // $ANTLR start synpred3_InternalHIPIE
    public final void synpred3_InternalHIPIE_fragment() throws RecognitionException {   
        // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1214:4: ( 'END' )
        // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1214:6: 'END'
        {
        match(input,33,FOLLOW_33_in_synpred3_InternalHIPIE2493); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_InternalHIPIE

    // $ANTLR start synpred4_InternalHIPIE
    public final void synpred4_InternalHIPIE_fragment() throws RecognitionException {   
        // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1627:4: ( 'END' )
        // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1627:6: 'END'
        {
        match(input,33,FOLLOW_33_in_synpred4_InternalHIPIE3483); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_InternalHIPIE

    // $ANTLR start synpred5_InternalHIPIE
    public final void synpred5_InternalHIPIE_fragment() throws RecognitionException {   
        // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1678:4: ( 'END' )
        // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:1678:6: 'END'
        {
        match(input,33,FOLLOW_33_in_synpred5_InternalHIPIE3577); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_InternalHIPIE

    // $ANTLR start synpred6_InternalHIPIE
    public final void synpred6_InternalHIPIE_fragment() throws RecognitionException {   
        // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2413:4: ( 'END' )
        // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:2413:6: 'END'
        {
        match(input,33,FOLLOW_33_in_synpred6_InternalHIPIE5403); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred6_InternalHIPIE

    // $ANTLR start synpred7_InternalHIPIE
    public final void synpred7_InternalHIPIE_fragment() throws RecognitionException {   
        // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3460:4: ( 'END' )
        // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3460:6: 'END'
        {
        match(input,33,FOLLOW_33_in_synpred7_InternalHIPIE7945); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred7_InternalHIPIE

    // $ANTLR start synpred9_InternalHIPIE
    public final void synpred9_InternalHIPIE_fragment() throws RecognitionException {   
        // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3747:4: ( 'END' )
        // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:3747:6: 'END'
        {
        match(input,33,FOLLOW_33_in_synpred9_InternalHIPIE8723); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred9_InternalHIPIE

    // $ANTLR start synpred10_InternalHIPIE
    public final void synpred10_InternalHIPIE_fragment() throws RecognitionException {   
        // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4840:4: ( 'END' )
        // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:4840:6: 'END'
        {
        match(input,33,FOLLOW_33_in_synpred10_InternalHIPIE11179); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred10_InternalHIPIE

    // $ANTLR start synpred11_InternalHIPIE
    public final void synpred11_InternalHIPIE_fragment() throws RecognitionException {   
        // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:5164:4: ( 'END' )
        // ../org.xtext.hipie/src-gen/org/xtext/hipie/parser/antlr/internal/InternalHIPIE.g:5164:6: 'END'
        {
        match(input,33,FOLLOW_33_in_synpred11_InternalHIPIE11964); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred11_InternalHIPIE

    // Delegated rules

    public final boolean synpred2_InternalHIPIE() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalHIPIE_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalHIPIE() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalHIPIE_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalHIPIE() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalHIPIE_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalHIPIE() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalHIPIE_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalHIPIE() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalHIPIE_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalHIPIE() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalHIPIE_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalHIPIE() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalHIPIE_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalHIPIE() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalHIPIE_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalHIPIE() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalHIPIE_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalHIPIE() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalHIPIE_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA29 dfa29 = new DFA29(this);
    protected DFA55 dfa55 = new DFA55(this);
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
            return "1500:1: ( ( (this_Bool_0= ruleBool | this_IntVar_1= ruleIntVar | this_StringVar_2= ruleStringVar | this_Record_3= ruleRecord | this_Dataset_4= ruleDataset | this_EnumDecl_5= ruleEnumDecl ) ( (lv_input_op_list_6_0= ruleInputOptions ) )? otherlv_7= ';' ) | (this_Dataset_8= ruleDataset ( (lv_input_op_list_9_0= ruleInputOptions ) )? ( (lv_fields_10_0= ruleFieldDecl ) )* ( ( 'END' )=>otherlv_11= 'END' ) ) | (this_Group_12= ruleGroup ( (lv_input_op_list_13_0= ruleInputOptions ) )? ( (lv_vals_14_0= ruleInputValue ) )* ( ( 'END' )=>otherlv_15= 'END' ) ) )";
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
        "\1\uffff\1\1\4\uffff\1\3\1\2\41\uffff";
    static final String DFA55_specialS =
        "\51\uffff}>";
    static final String[] DFA55_transitionS = {
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
            return "3401:1: ( (this_OutType_0= ruleOutType ( (lv_ops_1_0= ruleOutputOptions ) )? otherlv_2= ';' ) | (this_OutDataset_3= ruleOutDataset ( (lv_ecl_vars_4_0= ruleECLOutputDecl ) )* ( ( 'END' )=>otherlv_5= 'END' ) ) | (this_OutDataset_6= ruleOutDataset otherlv_7= ';' ) )";
        }
    }
 

    public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgram85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositionHeader_in_ruleProgram131 = new BitSet(new long[]{0x00000000002FF000L});
    public static final BitSet FOLLOW_ruleBaseProp_in_ruleProgram153 = new BitSet(new long[]{0x00000104182FF002L,0x0200000004002000L});
    public static final BitSet FOLLOW_ruleContractInstance_in_ruleProgram175 = new BitSet(new long[]{0x0000010418000002L,0x0200000004002000L});
    public static final BitSet FOLLOW_ruleInputSection_in_ruleProgram197 = new BitSet(new long[]{0x0000000018000002L,0x0200000004002000L});
    public static final BitSet FOLLOW_ruleOutputSection_in_ruleProgram219 = new BitSet(new long[]{0x0000000018000002L,0x0200000004000000L});
    public static final BitSet FOLLOW_ruleVisualSection_in_ruleProgram241 = new BitSet(new long[]{0x0000000018000002L,0x0200000004000000L});
    public static final BitSet FOLLOW_ruleGenerateSection_in_ruleProgram263 = new BitSet(new long[]{0x0000000008000002L,0x0200000000000000L});
    public static final BitSet FOLLOW_ruleCustomSection_in_ruleProgram285 = new BitSet(new long[]{0x0000000000000002L,0x0200000000000000L});
    public static final BitSet FOLLOW_ruleResourceSection_in_ruleProgram307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseProp_in_entryRuleBaseProp344 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBaseProp354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleBaseProp399 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_13_in_ruleBaseProp436 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_14_in_ruleBaseProp473 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_15_in_ruleBaseProp510 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_16_in_ruleBaseProp547 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_17_in_ruleBaseProp584 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_18_in_ruleBaseProp621 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_19_in_ruleBaseProp658 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleValueList_in_ruleBaseProp693 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleBaseProp705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleBaseProp731 = new BitSet(new long[]{0x000000003FC00000L});
    public static final BitSet FOLLOW_ruleCategoryTypeList_in_ruleBaseProp765 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleBaseProp777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCategoryType_in_entryRuleCategoryType815 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCategoryType826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleCategoryType864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleCategoryType883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleCategoryType902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleCategoryType921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleCategoryType940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleCategoryType959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleCategoryType978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleCategoryType997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCategoryTypeList_in_entryRuleCategoryTypeList1037 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCategoryTypeList1047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCategoryType_in_ruleCategoryTypeList1093 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleCategoryTypeList1106 = new BitSet(new long[]{0x000000003FC00000L});
    public static final BitSet FOLLOW_ruleCategoryType_in_ruleCategoryTypeList1127 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue1165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue1175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValue1217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleValue1245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleValue1273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueList_in_entryRuleValueList1314 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueList1324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_ruleValueList1370 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleValueList1383 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleValue_in_ruleValueList1404 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ruleAssign_in_entryRuleAssign1444 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssign1454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssign1496 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleAssign1513 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleValueList_in_ruleAssign1534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignList_in_entryRuleAssignList1570 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignList1580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssign_in_ruleAssignList1626 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleAssignList1639 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAssign_in_ruleAssignList1660 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ruleCompositionHeader_in_entryRuleCompositionHeader1698 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompositionHeader1708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleCompositionHeader1751 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_ruleAssign_in_ruleCompositionHeader1785 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_33_in_ruleCompositionHeader1806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContractInstance_in_entryRuleContractInstance1843 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContractInstance1853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleContractInstance1896 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContractInstance1921 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleContractInstance1932 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleValue_in_ruleContractInstance1955 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleContractInstance1967 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContractInstance1987 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleContractInstance1999 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_ruleAssign_in_ruleContractInstance2020 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_33_in_ruleContractInstance2041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldDecl_in_entryRuleFieldDecl2078 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldDecl2088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleFieldDecl2125 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFieldDecl2142 = new BitSet(new long[]{0x0000000800100000L});
    public static final BitSet FOLLOW_ruleInputOptions_in_ruleFieldDecl2168 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleFieldDecl2181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumDecl_in_entryRuleEnumDecl2217 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumDecl2227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleEnumDecl2270 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleEnumDecl2295 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleValueList_in_ruleEnumDecl2317 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_ruleAssignList_in_ruleEnumDecl2344 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleEnumDecl2357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputSection_in_entryRuleInputSection2393 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInputSection2403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleInputSection2446 = new BitSet(new long[]{0x00007E8000000000L});
    public static final BitSet FOLLOW_ruleInputValue_in_ruleInputSection2480 = new BitSet(new long[]{0x00007E8200000000L});
    public static final BitSet FOLLOW_33_in_ruleInputSection2501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBool_in_entryRuleBool2538 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBool2548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleBool2585 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBool2602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntVar_in_entryRuleIntVar2643 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntVar2653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleIntVar2690 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIntVar2707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringVar_in_entryRuleStringVar2748 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringVar2758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleStringVar2795 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStringVar2812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecord_in_entryRuleRecord2853 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRecord2863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleRecord2900 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRecord2917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataset_in_entryRuleDataset2958 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataset2968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleDataset3005 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataset3022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroup_in_entryRuleGroup3063 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroup3073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleGroup3110 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGroup3127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputValue_in_entryRuleInputValue3170 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInputValue3180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBool_in_ruleInputValue3229 = new BitSet(new long[]{0x0000000800100000L});
    public static final BitSet FOLLOW_ruleIntVar_in_ruleInputValue3256 = new BitSet(new long[]{0x0000000800100000L});
    public static final BitSet FOLLOW_ruleStringVar_in_ruleInputValue3283 = new BitSet(new long[]{0x0000000800100000L});
    public static final BitSet FOLLOW_ruleRecord_in_ruleInputValue3310 = new BitSet(new long[]{0x0000000800100000L});
    public static final BitSet FOLLOW_ruleDataset_in_ruleInputValue3337 = new BitSet(new long[]{0x0000000800100000L});
    public static final BitSet FOLLOW_ruleEnumDecl_in_ruleInputValue3364 = new BitSet(new long[]{0x0000000800100000L});
    public static final BitSet FOLLOW_ruleInputOptions_in_ruleInputValue3385 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleInputValue3398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataset_in_ruleInputValue3428 = new BitSet(new long[]{0x0000004A00000000L});
    public static final BitSet FOLLOW_ruleInputOptions_in_ruleInputValue3448 = new BitSet(new long[]{0x0000004200000000L});
    public static final BitSet FOLLOW_ruleFieldDecl_in_ruleInputValue3470 = new BitSet(new long[]{0x0000004200000000L});
    public static final BitSet FOLLOW_33_in_ruleInputValue3491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroup_in_ruleInputValue3522 = new BitSet(new long[]{0x00007E8A00000000L});
    public static final BitSet FOLLOW_ruleInputOptions_in_ruleInputValue3542 = new BitSet(new long[]{0x00007E8200000000L});
    public static final BitSet FOLLOW_ruleInputValue_in_ruleInputValue3564 = new BitSet(new long[]{0x00007E8200000000L});
    public static final BitSet FOLLOW_33_in_ruleInputValue3585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputOptions_in_entryRuleInputOptions3623 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInputOptions3633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleInputOptions3670 = new BitSet(new long[]{0xFFFF800000042000L});
    public static final BitSet FOLLOW_ruleInputOption_in_ruleInputOptions3691 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleInputOptions3704 = new BitSet(new long[]{0xFFFF800000042000L});
    public static final BitSet FOLLOW_ruleInputOption_in_ruleInputOptions3725 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ruleInputOption_in_entryRuleInputOption3763 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInputOption3773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleInputOption3817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleInputOption3854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleInputOption3891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleInputOption3928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleInputOption3965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleInputOption4002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleInputOption4041 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleInputOption4066 = new BitSet(new long[]{0x0000000000000000L,0x000000000000007FL});
    public static final BitSet FOLLOW_ruleFormfieldOption_in_ruleInputOption4082 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleInputOption4093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleInputOption4119 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleInputOption4144 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleAssignList_in_ruleInputOption4165 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleInputOption4177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleInputOption4203 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleInputOption4228 = new BitSet(new long[]{0x0000080000000000L,0x0000000000001F80L});
    public static final BitSet FOLLOW_ruleInputtypeOptions_in_ruleInputOption4244 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleInputOption4255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleInputOption4282 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_57_in_ruleInputOption4319 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_58_in_ruleInputOption4356 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_49_in_ruleInputOption4393 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_13_in_ruleInputOption4430 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_59_in_ruleInputOption4467 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_60_in_ruleInputOption4504 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_61_in_ruleInputOption4541 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_62_in_ruleInputOption4578 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_63_in_ruleInputOption4615 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_18_in_ruleInputOption4652 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleInputOption4678 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleValueList_in_ruleInputOption4699 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleInputOption4711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormfieldOption_in_entryRuleFormfieldOption4749 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormfieldOption4760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleFormfieldOption4798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleFormfieldOption4817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleFormfieldOption4836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleFormfieldOption4855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleFormfieldOption4874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleFormfieldOption4893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleFormfieldOption4912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputtypeOption_in_entryRuleInputtypeOption4953 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInputtypeOption4964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleInputtypeOption5002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleInputtypeOption5021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleInputtypeOption5040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleInputtypeOption5059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleInputtypeOption5078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleInputtypeOption5097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleInputtypeOption5116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputtypeOptions_in_entryRuleInputtypeOptions5157 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInputtypeOptions5168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputtypeOption_in_ruleInputtypeOptions5215 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleInputtypeOptions5234 = new BitSet(new long[]{0x0000080000000000L,0x0000000000001F80L});
    public static final BitSet FOLLOW_ruleInputtypeOption_in_ruleInputtypeOptions5256 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ruleOutputSection_in_entryRuleOutputSection5303 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOutputSection5313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleOutputSection5356 = new BitSet(new long[]{0x00002E0000000070L,0x0000000002000000L});
    public static final BitSet FOLLOW_ruleOutputValue_in_ruleOutputSection5390 = new BitSet(new long[]{0x00002E0200000070L,0x0000000002000000L});
    public static final BitSet FOLLOW_33_in_ruleOutputSection5411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleECLInteger_in_entryRuleECLInteger5450 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleECLInteger5460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleECLInteger5497 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleECLInteger5509 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleECLInteger5527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleECLUnsigned_in_entryRuleECLUnsigned5568 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleECLUnsigned5578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleECLUnsigned5615 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleECLUnsigned5627 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleECLUnsigned5645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleECLString_in_entryRuleECLString5686 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleECLString5696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleECLString5733 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleECLString5745 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleECLString5763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleECLQstring_in_entryRuleECLQstring5804 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleECLQstring5814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleECLQstring5851 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleECLQstring5863 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleECLQstring5881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleECLVarstring_in_entryRuleECLVarstring5922 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleECLVarstring5932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleECLVarstring5969 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleECLVarstring5981 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleECLVarstring5999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleECLUnicode_in_entryRuleECLUnicode6040 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleECLUnicode6050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleECLUnicode6087 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleECLUnicode6099 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleECLUnicode6117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleECLVarunicode_in_entryRuleECLVarunicode6158 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleECLVarunicode6168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleECLVarunicode6205 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleECLVarunicode6217 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleECLVarunicode6235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleECLData_in_entryRuleECLData6276 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleECLData6286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleECLData6323 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleECLData6340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleECLReal_in_entryRuleECLReal6381 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleECLReal6391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleECLReal6428 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleECLReal6445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleECLfieldType_in_entryRuleECLfieldType6486 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleECLfieldType6496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleECLInteger_in_ruleECLfieldType6543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleECLQstring_in_ruleECLfieldType6570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleECLString_in_ruleECLfieldType6597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleECLReal_in_ruleECLfieldType6624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleECLUnicode_in_ruleECLfieldType6651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleECLData_in_ruleECLfieldType6678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleECLVarstring_in_ruleECLfieldType6705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleECLVarunicode_in_ruleECLfieldType6732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleECLUnsigned_in_ruleECLfieldType6759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleECLOutputDecl_in_entryRuleECLOutputDecl6796 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleECLOutputDecl6806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleECLfieldType_in_ruleECLOutputDecl6853 = new BitSet(new long[]{0x0000000800100000L});
    public static final BitSet FOLLOW_ruleOutputOptions_in_ruleECLOutputDecl6873 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleECLOutputDecl6886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutputOption_in_entryRuleOutputOption6922 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOutputOption6932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleOutputOption6976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleOutputOption7013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleOutputOption7050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleOutputOption7087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleOutputOption7124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleOutputOption7163 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleOutputOption7188 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOutputOption7208 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleOutputOption7220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleOutputOption7246 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleOutputOption7271 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleValue_in_ruleOutputOption7292 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleOutputOption7304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutputOptions_in_entryRuleOutputOptions7341 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOutputOptions7351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOutputOptions7388 = new BitSet(new long[]{0x0000000000002000L,0x0000000001F80000L});
    public static final BitSet FOLLOW_ruleOutputOption_in_ruleOutputOptions7409 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleOutputOptions7422 = new BitSet(new long[]{0x0000000000002000L,0x0000000001F80000L});
    public static final BitSet FOLLOW_ruleOutputOption_in_ruleOutputOptions7443 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ruleOutType_in_entryRuleOutType7481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOutType7491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleOutType7529 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_42_in_ruleOutType7547 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_43_in_ruleOutType7565 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_89_in_ruleOutType7583 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleValue_in_ruleOutType7606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutDataset_in_entryRuleOutDataset7642 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOutDataset7652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleOutDataset7689 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOutDataset7706 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_ruleOutputBase_in_ruleOutDataset7732 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_ruleOutputOptions_in_ruleOutDataset7754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutputValue_in_entryRuleOutputValue7791 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOutputValue7801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutType_in_ruleOutputValue7849 = new BitSet(new long[]{0x0000000800100000L});
    public static final BitSet FOLLOW_ruleOutputOptions_in_ruleOutputValue7869 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleOutputValue7882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutDataset_in_ruleOutputValue7912 = new BitSet(new long[]{0x0000080200000000L,0x000000000007D280L});
    public static final BitSet FOLLOW_ruleECLOutputDecl_in_ruleOutputValue7932 = new BitSet(new long[]{0x0000080200000000L,0x000000000007D280L});
    public static final BitSet FOLLOW_33_in_ruleOutputValue7953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutDataset_in_ruleOutputValue7984 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleOutputValue7995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutputBase_in_entryRuleOutputBase8032 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOutputBase8042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOutputBase8079 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOutputBase8099 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleOutputBase8111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenerateSection_in_entryRuleGenerateSection8147 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGenerateSection8157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenerateBodyInline_in_ruleGenerateSection8204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenerateBodySalt_in_ruleGenerateSection8231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenerateBodyInline_in_entryRuleGenerateBodyInline8266 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGenerateBodyInline8276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleGenerateBodyInline8319 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_GEN_BLOCK_in_ruleGenerateBodyInline8343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGenerateBodySalt_in_entryRuleGenerateBodySalt8378 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGenerateBodySalt8388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleGenerateBodySalt8431 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_ruleGenerateBodySalt8456 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleGenerateBodySalt8468 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGenerateBodySalt8479 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleGenerateBodySalt8490 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleGenerateBodySalt8502 = new BitSet(new long[]{0x0000000000000000L,0x0000000030000000L});
    public static final BitSet FOLLOW_92_in_ruleGenerateBodySalt8515 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_93_in_ruleGenerateBodySalt8533 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_ruleGenerateBodySalt8554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisualSection_in_entryRuleVisualSection8591 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVisualSection8601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleVisualSection8644 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVisualSection8668 = new BitSet(new long[]{0x0000000800000000L,0x0000003F80000000L});
    public static final BitSet FOLLOW_ruleVisualSectionOptions_in_ruleVisualSection8688 = new BitSet(new long[]{0x0000000800000000L,0x0000003F80000000L});
    public static final BitSet FOLLOW_ruleVisualization_in_ruleVisualSection8710 = new BitSet(new long[]{0x0000000A00000000L,0x0000003F80000000L});
    public static final BitSet FOLLOW_33_in_ruleVisualSection8731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisualization_in_entryRuleVisualization8768 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVisualization8778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_ruleVisualization8817 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_96_in_ruleVisualization8835 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_97_in_ruleVisualization8853 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_98_in_ruleVisualization8871 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_99_in_ruleVisualization8889 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_100_in_ruleVisualization8907 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVisualization8925 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleVisualization8942 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVisBasis_in_ruleVisualization8963 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleVisualization8975 = new BitSet(new long[]{0x0000000800100000L});
    public static final BitSet FOLLOW_ruleVisualOptions_in_ruleVisualization8996 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleVisualization9009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_ruleVisualization9029 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVisualization9046 = new BitSet(new long[]{0x0000000800100000L});
    public static final BitSet FOLLOW_ruleVisualOptions_in_ruleVisualization9072 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleVisualization9085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisBasis_in_entryRuleVisBasis9122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVisBasis9132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVisBasis9177 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L});
    public static final BitSet FOLLOW_ruleVisBasisQualifiers_in_ruleVisBasis9198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisBasisQualifiers_in_entryRuleVisBasisQualifiers9235 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVisBasisQualifiers9245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_ruleVisBasisQualifiers9282 = new BitSet(new long[]{0x0000000000000070L,0x0000030000000000L});
    public static final BitSet FOLLOW_ruleFunction_in_ruleVisBasisQualifiers9303 = new BitSet(new long[]{0x0000000040000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_30_in_ruleVisBasisQualifiers9316 = new BitSet(new long[]{0x0000000000000070L,0x0000030000000000L});
    public static final BitSet FOLLOW_ruleFunction_in_ruleVisBasisQualifiers9337 = new BitSet(new long[]{0x0000000040000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_103_in_ruleVisBasisQualifiers9351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_entryRuleFunction9387 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunction9397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunction9442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_ruleFunction9469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_ruleFunction9488 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleFunction9500 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunction9521 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_ruleValue_in_ruleFunction9548 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleFunction9561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_ruleFunction9581 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleFunction9593 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunction9614 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ruleValue_in_ruleFunction9641 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleFunction9654 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFunction9665 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleFunction9676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisualSectionOptions_in_entryRuleVisualSectionOptions9713 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVisualSectionOptions9723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleVisualSectionOptions9760 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleVisualSectionOption_in_ruleVisualSectionOptions9781 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleVisualSectionOptions9794 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleVisualSectionOption_in_ruleVisualSectionOptions9815 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ruleVisualSectionOption_in_entryRuleVisualSectionOption9853 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVisualSectionOption9863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleVisualSectionOption9906 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleVisualSectionOption9931 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleValue_in_ruleVisualSectionOption9952 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleVisualSectionOption9964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisualOptions_in_entryRuleVisualOptions10000 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVisualOptions10010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleVisualOptions10047 = new BitSet(new long[]{0x0100000000042000L,0x00FBFC0000000000L});
    public static final BitSet FOLLOW_ruleVisualOption_in_ruleVisualOptions10068 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleVisualOptions10081 = new BitSet(new long[]{0x0100000000042000L,0x00FBFC0000000000L});
    public static final BitSet FOLLOW_ruleVisualOption_in_ruleVisualOptions10102 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ruleVisualOption_in_entryRuleVisualOption10140 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVisualOption10150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_ruleVisualOption10195 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_107_in_ruleVisualOption10232 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_13_in_ruleVisualOption10269 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_108_in_ruleVisualOption10306 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_109_in_ruleVisualOption10343 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_110_in_ruleVisualOption10380 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_111_in_ruleVisualOption10417 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_112_in_ruleVisualOption10454 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleVisualOption10480 = new BitSet(new long[]{0x0000000000000070L,0x0000030000000000L});
    public static final BitSet FOLLOW_ruleFunction_in_ruleVisualOption10501 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleVisualOption10513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisualMultival_in_ruleVisualOption10542 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleVisualOption10554 = new BitSet(new long[]{0x0000000000000070L,0x0000030000000000L});
    public static final BitSet FOLLOW_ruleFunction_in_ruleVisualOption10575 = new BitSet(new long[]{0x0000002040000000L});
    public static final BitSet FOLLOW_30_in_ruleVisualOption10588 = new BitSet(new long[]{0x0000000000000070L,0x0000030000000000L});
    public static final BitSet FOLLOW_ruleFunction_in_ruleVisualOption10609 = new BitSet(new long[]{0x0000002040000000L});
    public static final BitSet FOLLOW_37_in_ruleVisualOption10623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_113_in_ruleVisualOption10649 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleVisualOption10674 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVisualOption10685 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_ruleVisualOption10696 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVisualOption10707 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleVisualOption10718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisualMultival_in_entryRuleVisualMultival10755 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVisualMultival10765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_115_in_ruleVisualMultival10808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_ruleVisualMultival10845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_ruleVisualMultival10882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleVisualMultival10919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_118_in_ruleVisualMultival10956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleVisualMultival10993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_119_in_ruleVisualMultival11030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomSection_in_entryRuleCustomSection11079 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCustomSection11089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleCustomSection11132 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_ruleCustomValue_in_ruleCustomSection11166 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_33_in_ruleCustomSection11187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCustomValue_in_entryRuleCustomValue11224 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCustomValue11234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCustomValue11270 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleValue_in_ruleCustomValue11291 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleCustomValue11302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResourceOption_in_entryRuleResourceOption11338 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResourceOption11348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleResourceOption11392 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_120_in_ruleResourceOption11429 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_18_in_ruleResourceOption11466 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_63_in_ruleResourceOption11503 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleResourceOption11529 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleValue_in_ruleResourceOption11550 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleResourceOption11562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResourceOptions_in_entryRuleResourceOptions11598 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResourceOptions11608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResourceOption_in_ruleResourceOptions11654 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleResourceOptions11667 = new BitSet(new long[]{0x8000000000042000L,0x0100000000000000L});
    public static final BitSet FOLLOW_ruleResourceOption_in_ruleResourceOptions11688 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ruleResourceValue_in_entryRuleResourceValue11726 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResourceValue11736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_ruleResourceValue11783 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleResourceValue11794 = new BitSet(new long[]{0x8000000000142000L,0x0100000000000000L});
    public static final BitSet FOLLOW_ruleResourceOptions_in_ruleResourceValue11815 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleResourceValue11828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResourceSection_in_entryRuleResourceSection11864 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResourceSection11874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_ruleResourceSection11917 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleResourceValue_in_ruleResourceSection11951 = new BitSet(new long[]{0x0000000200000070L});
    public static final BitSet FOLLOW_33_in_ruleResourceSection11972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_synpred1_InternalHIPIE1798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_synpred2_InternalHIPIE2033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_synpred3_InternalHIPIE2493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_synpred4_InternalHIPIE3483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_synpred5_InternalHIPIE3577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_synpred6_InternalHIPIE5403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_synpred7_InternalHIPIE7945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_synpred9_InternalHIPIE8723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_synpred10_InternalHIPIE11179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_synpred11_InternalHIPIE11964 = new BitSet(new long[]{0x0000000000000002L});

}