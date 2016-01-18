package org.yazgel.regex.s2m.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.yazgel.regex.s2m.services.S2MGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalS2MParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_BOOLEAN", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'model'", "':'", "';'", "'attr'", "'{'", "'multi'", "'type'", "'}'", "'rule'", "'start'", "','", "'end'", "'String'", "'Integer'", "'Long'", "'Short'", "'Decimal'", "'Boolean'"
    };
    public static final int RULE_BOOLEAN=5;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalS2MParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalS2MParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalS2MParser.tokenNames; }
    public String getGrammarFileName() { return "../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g"; }



     	private S2MGrammarAccess grammarAccess;
     	
        public InternalS2MParser(TokenStream input, S2MGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected S2MGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:68:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:69:2: (iv_ruleModel= ruleModel EOF )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:70:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:77:1: ruleModel returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'model' otherlv_2= ':' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ( (lv_attributes_5_0= ruleAttribute ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rules_6_0= ruleRule ) ) )+ ) ) )+ {...}?) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        EObject lv_attributes_5_0 = null;

        EObject lv_rules_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:80:28: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'model' otherlv_2= ':' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ( (lv_attributes_5_0= ruleAttribute ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rules_6_0= ruleRule ) ) )+ ) ) )+ {...}?) ) ) )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:81:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'model' otherlv_2= ':' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ( (lv_attributes_5_0= ruleAttribute ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rules_6_0= ruleRule ) ) )+ ) ) )+ {...}?) ) )
            {
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:81:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'model' otherlv_2= ':' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ( (lv_attributes_5_0= ruleAttribute ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rules_6_0= ruleRule ) ) )+ ) ) )+ {...}?) ) )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:83:1: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'model' otherlv_2= ':' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ( (lv_attributes_5_0= ruleAttribute ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rules_6_0= ruleRule ) ) )+ ) ) )+ {...}?) )
            {
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:83:1: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'model' otherlv_2= ':' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ( (lv_attributes_5_0= ruleAttribute ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rules_6_0= ruleRule ) ) )+ ) ) )+ {...}?) )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:84:2: ( ( ({...}? => ( ({...}? => (otherlv_1= 'model' otherlv_2= ':' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ( (lv_attributes_5_0= ruleAttribute ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rules_6_0= ruleRule ) ) )+ ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getModelAccess().getUnorderedGroup());
            	
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:87:2: ( ( ({...}? => ( ({...}? => (otherlv_1= 'model' otherlv_2= ':' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ( (lv_attributes_5_0= ruleAttribute ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rules_6_0= ruleRule ) ) )+ ) ) )+ {...}?)
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:88:3: ( ({...}? => ( ({...}? => (otherlv_1= 'model' otherlv_2= ':' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ( (lv_attributes_5_0= ruleAttribute ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rules_6_0= ruleRule ) ) )+ ) ) )+ {...}?
            {
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:88:3: ( ({...}? => ( ({...}? => (otherlv_1= 'model' otherlv_2= ':' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ( (lv_attributes_5_0= ruleAttribute ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rules_6_0= ruleRule ) ) )+ ) ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( LA3_0 ==12 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 0) ) {
                    alt3=1;
                }
                else if ( LA3_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:90:4: ({...}? => ( ({...}? => (otherlv_1= 'model' otherlv_2= ':' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ( (lv_attributes_5_0= ruleAttribute ) )* ) ) ) )
            	    {
            	    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:90:4: ({...}? => ( ({...}? => (otherlv_1= 'model' otherlv_2= ':' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ( (lv_attributes_5_0= ruleAttribute ) )* ) ) ) )
            	    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:91:5: {...}? => ( ({...}? => (otherlv_1= 'model' otherlv_2= ':' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ( (lv_attributes_5_0= ruleAttribute ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 0)");
            	    }
            	    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:91:100: ( ({...}? => (otherlv_1= 'model' otherlv_2= ':' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ( (lv_attributes_5_0= ruleAttribute ) )* ) ) )
            	    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:92:6: ({...}? => (otherlv_1= 'model' otherlv_2= ':' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ( (lv_attributes_5_0= ruleAttribute ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup(), 0);
            	    	 				
            	    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:95:6: ({...}? => (otherlv_1= 'model' otherlv_2= ':' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ( (lv_attributes_5_0= ruleAttribute ) )* ) )
            	    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:95:7: {...}? => (otherlv_1= 'model' otherlv_2= ':' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ( (lv_attributes_5_0= ruleAttribute ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleModel", "true");
            	    }
            	    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:95:16: (otherlv_1= 'model' otherlv_2= ':' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ( (lv_attributes_5_0= ruleAttribute ) )* )
            	    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:95:18: otherlv_1= 'model' otherlv_2= ':' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ( (lv_attributes_5_0= ruleAttribute ) )*
            	    {
            	    otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleModel167); 

            	        	newLeafNode(otherlv_1, grammarAccess.getModelAccess().getModelKeyword_0_0());
            	        
            	    otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleModel179); 

            	        	newLeafNode(otherlv_2, grammarAccess.getModelAccess().getColonKeyword_0_1());
            	        
            	    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:103:1: ( (lv_name_3_0= RULE_ID ) )
            	    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:104:1: (lv_name_3_0= RULE_ID )
            	    {
            	    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:104:1: (lv_name_3_0= RULE_ID )
            	    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:105:3: lv_name_3_0= RULE_ID
            	    {
            	    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleModel196); 

            	    			newLeafNode(lv_name_3_0, grammarAccess.getModelAccess().getNameIDTerminalRuleCall_0_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getModelRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"name",
            	            		lv_name_3_0, 
            	            		"ID");
            	    	    

            	    }


            	    }

            	    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleModel213); 

            	        	newLeafNode(otherlv_4, grammarAccess.getModelAccess().getSemicolonKeyword_0_3());
            	        
            	    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:125:1: ( (lv_attributes_5_0= ruleAttribute ) )*
            	    loop1:
            	    do {
            	        int alt1=2;
            	        int LA1_0 = input.LA(1);

            	        if ( (LA1_0==15) ) {
            	            alt1=1;
            	        }


            	        switch (alt1) {
            	    	case 1 :
            	    	    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:126:1: (lv_attributes_5_0= ruleAttribute )
            	    	    {
            	    	    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:126:1: (lv_attributes_5_0= ruleAttribute )
            	    	    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:127:3: lv_attributes_5_0= ruleAttribute
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getModelAccess().getAttributesAttributeParserRuleCall_0_4_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleAttribute_in_ruleModel234);
            	    	    lv_attributes_5_0=ruleAttribute();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"attributes",
            	    	            		lv_attributes_5_0, 
            	    	            		"Attribute");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop1;
            	        }
            	    } while (true);


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:150:4: ({...}? => ( ({...}? => ( (lv_rules_6_0= ruleRule ) ) )+ ) )
            	    {
            	    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:150:4: ({...}? => ( ({...}? => ( (lv_rules_6_0= ruleRule ) ) )+ ) )
            	    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:151:5: {...}? => ( ({...}? => ( (lv_rules_6_0= ruleRule ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1)");
            	    }
            	    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:151:100: ( ({...}? => ( (lv_rules_6_0= ruleRule ) ) )+ )
            	    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:152:6: ({...}? => ( (lv_rules_6_0= ruleRule ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup(), 1);
            	    	 				
            	    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:155:6: ({...}? => ( (lv_rules_6_0= ruleRule ) ) )+
            	    int cnt2=0;
            	    loop2:
            	    do {
            	        int alt2=2;
            	        int LA2_0 = input.LA(1);

            	        if ( (LA2_0==20) ) {
            	            int LA2_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt2=1;
            	            }


            	        }


            	        switch (alt2) {
            	    	case 1 :
            	    	    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:155:7: {...}? => ( (lv_rules_6_0= ruleRule ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleModel", "true");
            	    	    }
            	    	    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:155:16: ( (lv_rules_6_0= ruleRule ) )
            	    	    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:156:1: (lv_rules_6_0= ruleRule )
            	    	    {
            	    	    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:156:1: (lv_rules_6_0= ruleRule )
            	    	    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:157:3: lv_rules_6_0= ruleRule
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getModelAccess().getRulesRuleParserRuleCall_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleRule_in_ruleModel311);
            	    	    lv_rules_6_0=ruleRule();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"rules",
            	    	            		lv_rules_6_0, 
            	    	            		"Rule");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


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

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getModelAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canLeave(grammarAccess.getModelAccess().getUnorderedGroup())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getModelAccess().getUnorderedGroup());
            	

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleAttribute"
    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:196:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:197:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:198:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute393);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute403); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:205:1: ruleAttribute returns [EObject current=null] : (otherlv_0= 'attr' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'multi' ( (lv_multi_4_0= RULE_BOOLEAN ) ) )? otherlv_5= 'type' otherlv_6= ':' ( (lv_type_7_0= ruleAttributeType ) ) otherlv_8= '}' ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_multi_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Enumerator lv_type_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:208:28: ( (otherlv_0= 'attr' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'multi' ( (lv_multi_4_0= RULE_BOOLEAN ) ) )? otherlv_5= 'type' otherlv_6= ':' ( (lv_type_7_0= ruleAttributeType ) ) otherlv_8= '}' ) )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:209:1: (otherlv_0= 'attr' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'multi' ( (lv_multi_4_0= RULE_BOOLEAN ) ) )? otherlv_5= 'type' otherlv_6= ':' ( (lv_type_7_0= ruleAttributeType ) ) otherlv_8= '}' )
            {
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:209:1: (otherlv_0= 'attr' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'multi' ( (lv_multi_4_0= RULE_BOOLEAN ) ) )? otherlv_5= 'type' otherlv_6= ':' ( (lv_type_7_0= ruleAttributeType ) ) otherlv_8= '}' )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:209:3: otherlv_0= 'attr' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'multi' ( (lv_multi_4_0= RULE_BOOLEAN ) ) )? otherlv_5= 'type' otherlv_6= ':' ( (lv_type_7_0= ruleAttributeType ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleAttribute440); 

                	newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttrKeyword_0());
                
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:213:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:214:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:214:1: (lv_name_1_0= RULE_ID )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:215:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute457); 

            			newLeafNode(lv_name_1_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleAttribute474); 

                	newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:235:1: (otherlv_3= 'multi' ( (lv_multi_4_0= RULE_BOOLEAN ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:235:3: otherlv_3= 'multi' ( (lv_multi_4_0= RULE_BOOLEAN ) )
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleAttribute487); 

                        	newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getMultiKeyword_3_0());
                        
                    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:239:1: ( (lv_multi_4_0= RULE_BOOLEAN ) )
                    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:240:1: (lv_multi_4_0= RULE_BOOLEAN )
                    {
                    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:240:1: (lv_multi_4_0= RULE_BOOLEAN )
                    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:241:3: lv_multi_4_0= RULE_BOOLEAN
                    {
                    lv_multi_4_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleAttribute504); 

                    			newLeafNode(lv_multi_4_0, grammarAccess.getAttributeAccess().getMultiBOOLEANTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"multi",
                            		lv_multi_4_0, 
                            		"BOOLEAN");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleAttribute523); 

                	newLeafNode(otherlv_5, grammarAccess.getAttributeAccess().getTypeKeyword_4());
                
            otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleAttribute535); 

                	newLeafNode(otherlv_6, grammarAccess.getAttributeAccess().getColonKeyword_5());
                
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:265:1: ( (lv_type_7_0= ruleAttributeType ) )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:266:1: (lv_type_7_0= ruleAttributeType )
            {
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:266:1: (lv_type_7_0= ruleAttributeType )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:267:3: lv_type_7_0= ruleAttributeType
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getTypeAttributeTypeEnumRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleAttributeType_in_ruleAttribute556);
            lv_type_7_0=ruleAttributeType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAttributeRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_7_0, 
                    		"AttributeType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleAttribute568); 

                	newLeafNode(otherlv_8, grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_7());
                

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleRule"
    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:295:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:296:2: (iv_ruleRule= ruleRule EOF )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:297:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_ruleRule_in_entryRuleRule604);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRule614); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:304:1: ruleRule returns [EObject current=null] : (this_RuleIndex_0= ruleRuleIndex | this_RuleKeyword_1= ruleRuleKeyword | this_RuleIndexToKeyword_2= ruleRuleIndexToKeyword | this_RuleKeywordToIndex_3= ruleRuleKeywordToIndex ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        EObject this_RuleIndex_0 = null;

        EObject this_RuleKeyword_1 = null;

        EObject this_RuleIndexToKeyword_2 = null;

        EObject this_RuleKeywordToIndex_3 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:307:28: ( (this_RuleIndex_0= ruleRuleIndex | this_RuleKeyword_1= ruleRuleKeyword | this_RuleIndexToKeyword_2= ruleRuleIndexToKeyword | this_RuleKeywordToIndex_3= ruleRuleKeywordToIndex ) )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:308:1: (this_RuleIndex_0= ruleRuleIndex | this_RuleKeyword_1= ruleRuleKeyword | this_RuleIndexToKeyword_2= ruleRuleIndexToKeyword | this_RuleKeywordToIndex_3= ruleRuleKeywordToIndex )
            {
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:308:1: (this_RuleIndex_0= ruleRuleIndex | this_RuleKeyword_1= ruleRuleKeyword | this_RuleIndexToKeyword_2= ruleRuleIndexToKeyword | this_RuleKeywordToIndex_3= ruleRuleKeywordToIndex )
            int alt5=4;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:309:5: this_RuleIndex_0= ruleRuleIndex
                    {
                     
                            newCompositeNode(grammarAccess.getRuleAccess().getRuleIndexParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleRuleIndex_in_ruleRule661);
                    this_RuleIndex_0=ruleRuleIndex();

                    state._fsp--;

                     
                            current = this_RuleIndex_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:319:5: this_RuleKeyword_1= ruleRuleKeyword
                    {
                     
                            newCompositeNode(grammarAccess.getRuleAccess().getRuleKeywordParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleRuleKeyword_in_ruleRule688);
                    this_RuleKeyword_1=ruleRuleKeyword();

                    state._fsp--;

                     
                            current = this_RuleKeyword_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:329:5: this_RuleIndexToKeyword_2= ruleRuleIndexToKeyword
                    {
                     
                            newCompositeNode(grammarAccess.getRuleAccess().getRuleIndexToKeywordParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleRuleIndexToKeyword_in_ruleRule715);
                    this_RuleIndexToKeyword_2=ruleRuleIndexToKeyword();

                    state._fsp--;

                     
                            current = this_RuleIndexToKeyword_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:339:5: this_RuleKeywordToIndex_3= ruleRuleKeywordToIndex
                    {
                     
                            newCompositeNode(grammarAccess.getRuleAccess().getRuleKeywordToIndexParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleRuleKeywordToIndex_in_ruleRule742);
                    this_RuleKeywordToIndex_3=ruleRuleKeywordToIndex();

                    state._fsp--;

                     
                            current = this_RuleKeywordToIndex_3; 
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
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleRuleIndex"
    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:355:1: entryRuleRuleIndex returns [EObject current=null] : iv_ruleRuleIndex= ruleRuleIndex EOF ;
    public final EObject entryRuleRuleIndex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleIndex = null;


        try {
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:356:2: (iv_ruleRuleIndex= ruleRuleIndex EOF )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:357:2: iv_ruleRuleIndex= ruleRuleIndex EOF
            {
             newCompositeNode(grammarAccess.getRuleIndexRule()); 
            pushFollow(FOLLOW_ruleRuleIndex_in_entryRuleRuleIndex777);
            iv_ruleRuleIndex=ruleRuleIndex();

            state._fsp--;

             current =iv_ruleRuleIndex; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRuleIndex787); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRuleIndex"


    // $ANTLR start "ruleRuleIndex"
    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:364:1: ruleRuleIndex returns [EObject current=null] : (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'start' ( (lv_startIndex_4_0= RULE_INT ) ) otherlv_5= ',' ) (otherlv_6= 'end' ( (lv_endIndex_7_0= RULE_INT ) ) otherlv_8= ',' ) otherlv_9= 'attr' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}' ) ;
    public final EObject ruleRuleIndex() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_startIndex_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_endIndex_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;

         enterRule(); 
            
        try {
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:367:28: ( (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'start' ( (lv_startIndex_4_0= RULE_INT ) ) otherlv_5= ',' ) (otherlv_6= 'end' ( (lv_endIndex_7_0= RULE_INT ) ) otherlv_8= ',' ) otherlv_9= 'attr' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}' ) )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:368:1: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'start' ( (lv_startIndex_4_0= RULE_INT ) ) otherlv_5= ',' ) (otherlv_6= 'end' ( (lv_endIndex_7_0= RULE_INT ) ) otherlv_8= ',' ) otherlv_9= 'attr' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}' )
            {
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:368:1: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'start' ( (lv_startIndex_4_0= RULE_INT ) ) otherlv_5= ',' ) (otherlv_6= 'end' ( (lv_endIndex_7_0= RULE_INT ) ) otherlv_8= ',' ) otherlv_9= 'attr' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}' )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:368:3: otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'start' ( (lv_startIndex_4_0= RULE_INT ) ) otherlv_5= ',' ) (otherlv_6= 'end' ( (lv_endIndex_7_0= RULE_INT ) ) otherlv_8= ',' ) otherlv_9= 'attr' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleRuleIndex824); 

                	newLeafNode(otherlv_0, grammarAccess.getRuleIndexAccess().getRuleKeyword_0());
                
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:372:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:373:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:373:1: (lv_name_1_0= RULE_ID )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:374:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRuleIndex841); 

            			newLeafNode(lv_name_1_0, grammarAccess.getRuleIndexAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRuleIndexRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleRuleIndex858); 

                	newLeafNode(otherlv_2, grammarAccess.getRuleIndexAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:394:1: (otherlv_3= 'start' ( (lv_startIndex_4_0= RULE_INT ) ) otherlv_5= ',' )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:394:3: otherlv_3= 'start' ( (lv_startIndex_4_0= RULE_INT ) ) otherlv_5= ','
            {
            otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleRuleIndex871); 

                	newLeafNode(otherlv_3, grammarAccess.getRuleIndexAccess().getStartKeyword_3_0());
                
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:398:1: ( (lv_startIndex_4_0= RULE_INT ) )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:399:1: (lv_startIndex_4_0= RULE_INT )
            {
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:399:1: (lv_startIndex_4_0= RULE_INT )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:400:3: lv_startIndex_4_0= RULE_INT
            {
            lv_startIndex_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRuleIndex888); 

            			newLeafNode(lv_startIndex_4_0, grammarAccess.getRuleIndexAccess().getStartIndexINTTerminalRuleCall_3_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRuleIndexRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"startIndex",
                    		lv_startIndex_4_0, 
                    		"INT");
            	    

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleRuleIndex905); 

                	newLeafNode(otherlv_5, grammarAccess.getRuleIndexAccess().getCommaKeyword_3_2());
                

            }

            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:420:2: (otherlv_6= 'end' ( (lv_endIndex_7_0= RULE_INT ) ) otherlv_8= ',' )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:420:4: otherlv_6= 'end' ( (lv_endIndex_7_0= RULE_INT ) ) otherlv_8= ','
            {
            otherlv_6=(Token)match(input,23,FOLLOW_23_in_ruleRuleIndex919); 

                	newLeafNode(otherlv_6, grammarAccess.getRuleIndexAccess().getEndKeyword_4_0());
                
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:424:1: ( (lv_endIndex_7_0= RULE_INT ) )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:425:1: (lv_endIndex_7_0= RULE_INT )
            {
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:425:1: (lv_endIndex_7_0= RULE_INT )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:426:3: lv_endIndex_7_0= RULE_INT
            {
            lv_endIndex_7_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRuleIndex936); 

            			newLeafNode(lv_endIndex_7_0, grammarAccess.getRuleIndexAccess().getEndIndexINTTerminalRuleCall_4_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRuleIndexRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"endIndex",
                    		lv_endIndex_7_0, 
                    		"INT");
            	    

            }


            }

            otherlv_8=(Token)match(input,22,FOLLOW_22_in_ruleRuleIndex953); 

                	newLeafNode(otherlv_8, grammarAccess.getRuleIndexAccess().getCommaKeyword_4_2());
                

            }

            otherlv_9=(Token)match(input,15,FOLLOW_15_in_ruleRuleIndex966); 

                	newLeafNode(otherlv_9, grammarAccess.getRuleIndexAccess().getAttrKeyword_5());
                
            otherlv_10=(Token)match(input,13,FOLLOW_13_in_ruleRuleIndex978); 

                	newLeafNode(otherlv_10, grammarAccess.getRuleIndexAccess().getColonKeyword_6());
                
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:454:1: ( (otherlv_11= RULE_ID ) )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:455:1: (otherlv_11= RULE_ID )
            {
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:455:1: (otherlv_11= RULE_ID )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:456:3: otherlv_11= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRuleIndexRule());
            	        }
                    
            otherlv_11=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRuleIndex998); 

            		newLeafNode(otherlv_11, grammarAccess.getRuleIndexAccess().getAttrAttributeCrossReference_7_0()); 
            	

            }


            }

            otherlv_12=(Token)match(input,19,FOLLOW_19_in_ruleRuleIndex1010); 

                	newLeafNode(otherlv_12, grammarAccess.getRuleIndexAccess().getRightCurlyBracketKeyword_8());
                

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
    // $ANTLR end "ruleRuleIndex"


    // $ANTLR start "entryRuleRuleIndexToKeyword"
    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:479:1: entryRuleRuleIndexToKeyword returns [EObject current=null] : iv_ruleRuleIndexToKeyword= ruleRuleIndexToKeyword EOF ;
    public final EObject entryRuleRuleIndexToKeyword() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleIndexToKeyword = null;


        try {
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:480:2: (iv_ruleRuleIndexToKeyword= ruleRuleIndexToKeyword EOF )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:481:2: iv_ruleRuleIndexToKeyword= ruleRuleIndexToKeyword EOF
            {
             newCompositeNode(grammarAccess.getRuleIndexToKeywordRule()); 
            pushFollow(FOLLOW_ruleRuleIndexToKeyword_in_entryRuleRuleIndexToKeyword1046);
            iv_ruleRuleIndexToKeyword=ruleRuleIndexToKeyword();

            state._fsp--;

             current =iv_ruleRuleIndexToKeyword; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRuleIndexToKeyword1056); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRuleIndexToKeyword"


    // $ANTLR start "ruleRuleIndexToKeyword"
    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:488:1: ruleRuleIndexToKeyword returns [EObject current=null] : (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'start' ( (lv_startIndex_4_0= RULE_INT ) ) otherlv_5= ',' ) (otherlv_6= 'end' ( (lv_endDelimeter_7_0= RULE_STRING ) ) otherlv_8= ',' ) otherlv_9= 'attr' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}' ) ;
    public final EObject ruleRuleIndexToKeyword() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_startIndex_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_endDelimeter_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;

         enterRule(); 
            
        try {
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:491:28: ( (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'start' ( (lv_startIndex_4_0= RULE_INT ) ) otherlv_5= ',' ) (otherlv_6= 'end' ( (lv_endDelimeter_7_0= RULE_STRING ) ) otherlv_8= ',' ) otherlv_9= 'attr' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}' ) )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:492:1: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'start' ( (lv_startIndex_4_0= RULE_INT ) ) otherlv_5= ',' ) (otherlv_6= 'end' ( (lv_endDelimeter_7_0= RULE_STRING ) ) otherlv_8= ',' ) otherlv_9= 'attr' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}' )
            {
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:492:1: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'start' ( (lv_startIndex_4_0= RULE_INT ) ) otherlv_5= ',' ) (otherlv_6= 'end' ( (lv_endDelimeter_7_0= RULE_STRING ) ) otherlv_8= ',' ) otherlv_9= 'attr' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}' )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:492:3: otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'start' ( (lv_startIndex_4_0= RULE_INT ) ) otherlv_5= ',' ) (otherlv_6= 'end' ( (lv_endDelimeter_7_0= RULE_STRING ) ) otherlv_8= ',' ) otherlv_9= 'attr' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleRuleIndexToKeyword1093); 

                	newLeafNode(otherlv_0, grammarAccess.getRuleIndexToKeywordAccess().getRuleKeyword_0());
                
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:496:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:497:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:497:1: (lv_name_1_0= RULE_ID )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:498:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRuleIndexToKeyword1110); 

            			newLeafNode(lv_name_1_0, grammarAccess.getRuleIndexToKeywordAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRuleIndexToKeywordRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleRuleIndexToKeyword1127); 

                	newLeafNode(otherlv_2, grammarAccess.getRuleIndexToKeywordAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:518:1: (otherlv_3= 'start' ( (lv_startIndex_4_0= RULE_INT ) ) otherlv_5= ',' )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:518:3: otherlv_3= 'start' ( (lv_startIndex_4_0= RULE_INT ) ) otherlv_5= ','
            {
            otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleRuleIndexToKeyword1140); 

                	newLeafNode(otherlv_3, grammarAccess.getRuleIndexToKeywordAccess().getStartKeyword_3_0());
                
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:522:1: ( (lv_startIndex_4_0= RULE_INT ) )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:523:1: (lv_startIndex_4_0= RULE_INT )
            {
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:523:1: (lv_startIndex_4_0= RULE_INT )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:524:3: lv_startIndex_4_0= RULE_INT
            {
            lv_startIndex_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRuleIndexToKeyword1157); 

            			newLeafNode(lv_startIndex_4_0, grammarAccess.getRuleIndexToKeywordAccess().getStartIndexINTTerminalRuleCall_3_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRuleIndexToKeywordRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"startIndex",
                    		lv_startIndex_4_0, 
                    		"INT");
            	    

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleRuleIndexToKeyword1174); 

                	newLeafNode(otherlv_5, grammarAccess.getRuleIndexToKeywordAccess().getCommaKeyword_3_2());
                

            }

            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:544:2: (otherlv_6= 'end' ( (lv_endDelimeter_7_0= RULE_STRING ) ) otherlv_8= ',' )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:544:4: otherlv_6= 'end' ( (lv_endDelimeter_7_0= RULE_STRING ) ) otherlv_8= ','
            {
            otherlv_6=(Token)match(input,23,FOLLOW_23_in_ruleRuleIndexToKeyword1188); 

                	newLeafNode(otherlv_6, grammarAccess.getRuleIndexToKeywordAccess().getEndKeyword_4_0());
                
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:548:1: ( (lv_endDelimeter_7_0= RULE_STRING ) )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:549:1: (lv_endDelimeter_7_0= RULE_STRING )
            {
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:549:1: (lv_endDelimeter_7_0= RULE_STRING )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:550:3: lv_endDelimeter_7_0= RULE_STRING
            {
            lv_endDelimeter_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRuleIndexToKeyword1205); 

            			newLeafNode(lv_endDelimeter_7_0, grammarAccess.getRuleIndexToKeywordAccess().getEndDelimeterSTRINGTerminalRuleCall_4_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRuleIndexToKeywordRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"endDelimeter",
                    		lv_endDelimeter_7_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_8=(Token)match(input,22,FOLLOW_22_in_ruleRuleIndexToKeyword1222); 

                	newLeafNode(otherlv_8, grammarAccess.getRuleIndexToKeywordAccess().getCommaKeyword_4_2());
                

            }

            otherlv_9=(Token)match(input,15,FOLLOW_15_in_ruleRuleIndexToKeyword1235); 

                	newLeafNode(otherlv_9, grammarAccess.getRuleIndexToKeywordAccess().getAttrKeyword_5());
                
            otherlv_10=(Token)match(input,13,FOLLOW_13_in_ruleRuleIndexToKeyword1247); 

                	newLeafNode(otherlv_10, grammarAccess.getRuleIndexToKeywordAccess().getColonKeyword_6());
                
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:578:1: ( (otherlv_11= RULE_ID ) )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:579:1: (otherlv_11= RULE_ID )
            {
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:579:1: (otherlv_11= RULE_ID )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:580:3: otherlv_11= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRuleIndexToKeywordRule());
            	        }
                    
            otherlv_11=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRuleIndexToKeyword1267); 

            		newLeafNode(otherlv_11, grammarAccess.getRuleIndexToKeywordAccess().getAttrAttributeCrossReference_7_0()); 
            	

            }


            }

            otherlv_12=(Token)match(input,19,FOLLOW_19_in_ruleRuleIndexToKeyword1279); 

                	newLeafNode(otherlv_12, grammarAccess.getRuleIndexToKeywordAccess().getRightCurlyBracketKeyword_8());
                

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
    // $ANTLR end "ruleRuleIndexToKeyword"


    // $ANTLR start "entryRuleRuleKeyword"
    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:603:1: entryRuleRuleKeyword returns [EObject current=null] : iv_ruleRuleKeyword= ruleRuleKeyword EOF ;
    public final EObject entryRuleRuleKeyword() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleKeyword = null;


        try {
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:604:2: (iv_ruleRuleKeyword= ruleRuleKeyword EOF )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:605:2: iv_ruleRuleKeyword= ruleRuleKeyword EOF
            {
             newCompositeNode(grammarAccess.getRuleKeywordRule()); 
            pushFollow(FOLLOW_ruleRuleKeyword_in_entryRuleRuleKeyword1315);
            iv_ruleRuleKeyword=ruleRuleKeyword();

            state._fsp--;

             current =iv_ruleRuleKeyword; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRuleKeyword1325); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRuleKeyword"


    // $ANTLR start "ruleRuleKeyword"
    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:612:1: ruleRuleKeyword returns [EObject current=null] : (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'start' ( (lv_startDelimeter_4_0= RULE_STRING ) ) otherlv_5= ',' ) (otherlv_6= 'end' ( (lv_endDelimeter_7_0= RULE_STRING ) ) otherlv_8= ',' ) otherlv_9= 'attr' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}' ) ;
    public final EObject ruleRuleKeyword() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_startDelimeter_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_endDelimeter_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;

         enterRule(); 
            
        try {
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:615:28: ( (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'start' ( (lv_startDelimeter_4_0= RULE_STRING ) ) otherlv_5= ',' ) (otherlv_6= 'end' ( (lv_endDelimeter_7_0= RULE_STRING ) ) otherlv_8= ',' ) otherlv_9= 'attr' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}' ) )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:616:1: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'start' ( (lv_startDelimeter_4_0= RULE_STRING ) ) otherlv_5= ',' ) (otherlv_6= 'end' ( (lv_endDelimeter_7_0= RULE_STRING ) ) otherlv_8= ',' ) otherlv_9= 'attr' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}' )
            {
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:616:1: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'start' ( (lv_startDelimeter_4_0= RULE_STRING ) ) otherlv_5= ',' ) (otherlv_6= 'end' ( (lv_endDelimeter_7_0= RULE_STRING ) ) otherlv_8= ',' ) otherlv_9= 'attr' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}' )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:616:3: otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'start' ( (lv_startDelimeter_4_0= RULE_STRING ) ) otherlv_5= ',' ) (otherlv_6= 'end' ( (lv_endDelimeter_7_0= RULE_STRING ) ) otherlv_8= ',' ) otherlv_9= 'attr' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleRuleKeyword1362); 

                	newLeafNode(otherlv_0, grammarAccess.getRuleKeywordAccess().getRuleKeyword_0());
                
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:620:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:621:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:621:1: (lv_name_1_0= RULE_ID )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:622:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRuleKeyword1379); 

            			newLeafNode(lv_name_1_0, grammarAccess.getRuleKeywordAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRuleKeywordRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleRuleKeyword1396); 

                	newLeafNode(otherlv_2, grammarAccess.getRuleKeywordAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:642:1: (otherlv_3= 'start' ( (lv_startDelimeter_4_0= RULE_STRING ) ) otherlv_5= ',' )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:642:3: otherlv_3= 'start' ( (lv_startDelimeter_4_0= RULE_STRING ) ) otherlv_5= ','
            {
            otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleRuleKeyword1409); 

                	newLeafNode(otherlv_3, grammarAccess.getRuleKeywordAccess().getStartKeyword_3_0());
                
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:646:1: ( (lv_startDelimeter_4_0= RULE_STRING ) )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:647:1: (lv_startDelimeter_4_0= RULE_STRING )
            {
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:647:1: (lv_startDelimeter_4_0= RULE_STRING )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:648:3: lv_startDelimeter_4_0= RULE_STRING
            {
            lv_startDelimeter_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRuleKeyword1426); 

            			newLeafNode(lv_startDelimeter_4_0, grammarAccess.getRuleKeywordAccess().getStartDelimeterSTRINGTerminalRuleCall_3_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRuleKeywordRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"startDelimeter",
                    		lv_startDelimeter_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleRuleKeyword1443); 

                	newLeafNode(otherlv_5, grammarAccess.getRuleKeywordAccess().getCommaKeyword_3_2());
                

            }

            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:668:2: (otherlv_6= 'end' ( (lv_endDelimeter_7_0= RULE_STRING ) ) otherlv_8= ',' )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:668:4: otherlv_6= 'end' ( (lv_endDelimeter_7_0= RULE_STRING ) ) otherlv_8= ','
            {
            otherlv_6=(Token)match(input,23,FOLLOW_23_in_ruleRuleKeyword1457); 

                	newLeafNode(otherlv_6, grammarAccess.getRuleKeywordAccess().getEndKeyword_4_0());
                
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:672:1: ( (lv_endDelimeter_7_0= RULE_STRING ) )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:673:1: (lv_endDelimeter_7_0= RULE_STRING )
            {
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:673:1: (lv_endDelimeter_7_0= RULE_STRING )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:674:3: lv_endDelimeter_7_0= RULE_STRING
            {
            lv_endDelimeter_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRuleKeyword1474); 

            			newLeafNode(lv_endDelimeter_7_0, grammarAccess.getRuleKeywordAccess().getEndDelimeterSTRINGTerminalRuleCall_4_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRuleKeywordRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"endDelimeter",
                    		lv_endDelimeter_7_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_8=(Token)match(input,22,FOLLOW_22_in_ruleRuleKeyword1491); 

                	newLeafNode(otherlv_8, grammarAccess.getRuleKeywordAccess().getCommaKeyword_4_2());
                

            }

            otherlv_9=(Token)match(input,15,FOLLOW_15_in_ruleRuleKeyword1504); 

                	newLeafNode(otherlv_9, grammarAccess.getRuleKeywordAccess().getAttrKeyword_5());
                
            otherlv_10=(Token)match(input,13,FOLLOW_13_in_ruleRuleKeyword1516); 

                	newLeafNode(otherlv_10, grammarAccess.getRuleKeywordAccess().getColonKeyword_6());
                
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:702:1: ( (otherlv_11= RULE_ID ) )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:703:1: (otherlv_11= RULE_ID )
            {
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:703:1: (otherlv_11= RULE_ID )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:704:3: otherlv_11= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRuleKeywordRule());
            	        }
                    
            otherlv_11=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRuleKeyword1536); 

            		newLeafNode(otherlv_11, grammarAccess.getRuleKeywordAccess().getAttrAttributeCrossReference_7_0()); 
            	

            }


            }

            otherlv_12=(Token)match(input,19,FOLLOW_19_in_ruleRuleKeyword1548); 

                	newLeafNode(otherlv_12, grammarAccess.getRuleKeywordAccess().getRightCurlyBracketKeyword_8());
                

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
    // $ANTLR end "ruleRuleKeyword"


    // $ANTLR start "entryRuleRuleKeywordToIndex"
    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:727:1: entryRuleRuleKeywordToIndex returns [EObject current=null] : iv_ruleRuleKeywordToIndex= ruleRuleKeywordToIndex EOF ;
    public final EObject entryRuleRuleKeywordToIndex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleKeywordToIndex = null;


        try {
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:728:2: (iv_ruleRuleKeywordToIndex= ruleRuleKeywordToIndex EOF )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:729:2: iv_ruleRuleKeywordToIndex= ruleRuleKeywordToIndex EOF
            {
             newCompositeNode(grammarAccess.getRuleKeywordToIndexRule()); 
            pushFollow(FOLLOW_ruleRuleKeywordToIndex_in_entryRuleRuleKeywordToIndex1584);
            iv_ruleRuleKeywordToIndex=ruleRuleKeywordToIndex();

            state._fsp--;

             current =iv_ruleRuleKeywordToIndex; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRuleKeywordToIndex1594); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRuleKeywordToIndex"


    // $ANTLR start "ruleRuleKeywordToIndex"
    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:736:1: ruleRuleKeywordToIndex returns [EObject current=null] : (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'start' ( (lv_startDelimeter_4_0= RULE_STRING ) ) otherlv_5= ',' ) (otherlv_6= 'end' ( (lv_endIndex_7_0= RULE_INT ) ) otherlv_8= ',' ) otherlv_9= 'attr' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}' ) ;
    public final EObject ruleRuleKeywordToIndex() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_startDelimeter_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_endIndex_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;

         enterRule(); 
            
        try {
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:739:28: ( (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'start' ( (lv_startDelimeter_4_0= RULE_STRING ) ) otherlv_5= ',' ) (otherlv_6= 'end' ( (lv_endIndex_7_0= RULE_INT ) ) otherlv_8= ',' ) otherlv_9= 'attr' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}' ) )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:740:1: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'start' ( (lv_startDelimeter_4_0= RULE_STRING ) ) otherlv_5= ',' ) (otherlv_6= 'end' ( (lv_endIndex_7_0= RULE_INT ) ) otherlv_8= ',' ) otherlv_9= 'attr' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}' )
            {
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:740:1: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'start' ( (lv_startDelimeter_4_0= RULE_STRING ) ) otherlv_5= ',' ) (otherlv_6= 'end' ( (lv_endIndex_7_0= RULE_INT ) ) otherlv_8= ',' ) otherlv_9= 'attr' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}' )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:740:3: otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'start' ( (lv_startDelimeter_4_0= RULE_STRING ) ) otherlv_5= ',' ) (otherlv_6= 'end' ( (lv_endIndex_7_0= RULE_INT ) ) otherlv_8= ',' ) otherlv_9= 'attr' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleRuleKeywordToIndex1631); 

                	newLeafNode(otherlv_0, grammarAccess.getRuleKeywordToIndexAccess().getRuleKeyword_0());
                
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:744:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:745:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:745:1: (lv_name_1_0= RULE_ID )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:746:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRuleKeywordToIndex1648); 

            			newLeafNode(lv_name_1_0, grammarAccess.getRuleKeywordToIndexAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRuleKeywordToIndexRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleRuleKeywordToIndex1665); 

                	newLeafNode(otherlv_2, grammarAccess.getRuleKeywordToIndexAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:766:1: (otherlv_3= 'start' ( (lv_startDelimeter_4_0= RULE_STRING ) ) otherlv_5= ',' )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:766:3: otherlv_3= 'start' ( (lv_startDelimeter_4_0= RULE_STRING ) ) otherlv_5= ','
            {
            otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleRuleKeywordToIndex1678); 

                	newLeafNode(otherlv_3, grammarAccess.getRuleKeywordToIndexAccess().getStartKeyword_3_0());
                
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:770:1: ( (lv_startDelimeter_4_0= RULE_STRING ) )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:771:1: (lv_startDelimeter_4_0= RULE_STRING )
            {
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:771:1: (lv_startDelimeter_4_0= RULE_STRING )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:772:3: lv_startDelimeter_4_0= RULE_STRING
            {
            lv_startDelimeter_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRuleKeywordToIndex1695); 

            			newLeafNode(lv_startDelimeter_4_0, grammarAccess.getRuleKeywordToIndexAccess().getStartDelimeterSTRINGTerminalRuleCall_3_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRuleKeywordToIndexRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"startDelimeter",
                    		lv_startDelimeter_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleRuleKeywordToIndex1712); 

                	newLeafNode(otherlv_5, grammarAccess.getRuleKeywordToIndexAccess().getCommaKeyword_3_2());
                

            }

            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:792:2: (otherlv_6= 'end' ( (lv_endIndex_7_0= RULE_INT ) ) otherlv_8= ',' )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:792:4: otherlv_6= 'end' ( (lv_endIndex_7_0= RULE_INT ) ) otherlv_8= ','
            {
            otherlv_6=(Token)match(input,23,FOLLOW_23_in_ruleRuleKeywordToIndex1726); 

                	newLeafNode(otherlv_6, grammarAccess.getRuleKeywordToIndexAccess().getEndKeyword_4_0());
                
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:796:1: ( (lv_endIndex_7_0= RULE_INT ) )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:797:1: (lv_endIndex_7_0= RULE_INT )
            {
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:797:1: (lv_endIndex_7_0= RULE_INT )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:798:3: lv_endIndex_7_0= RULE_INT
            {
            lv_endIndex_7_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRuleKeywordToIndex1743); 

            			newLeafNode(lv_endIndex_7_0, grammarAccess.getRuleKeywordToIndexAccess().getEndIndexINTTerminalRuleCall_4_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRuleKeywordToIndexRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"endIndex",
                    		lv_endIndex_7_0, 
                    		"INT");
            	    

            }


            }

            otherlv_8=(Token)match(input,22,FOLLOW_22_in_ruleRuleKeywordToIndex1760); 

                	newLeafNode(otherlv_8, grammarAccess.getRuleKeywordToIndexAccess().getCommaKeyword_4_2());
                

            }

            otherlv_9=(Token)match(input,15,FOLLOW_15_in_ruleRuleKeywordToIndex1773); 

                	newLeafNode(otherlv_9, grammarAccess.getRuleKeywordToIndexAccess().getAttrKeyword_5());
                
            otherlv_10=(Token)match(input,13,FOLLOW_13_in_ruleRuleKeywordToIndex1785); 

                	newLeafNode(otherlv_10, grammarAccess.getRuleKeywordToIndexAccess().getColonKeyword_6());
                
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:826:1: ( (otherlv_11= RULE_ID ) )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:827:1: (otherlv_11= RULE_ID )
            {
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:827:1: (otherlv_11= RULE_ID )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:828:3: otherlv_11= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRuleKeywordToIndexRule());
            	        }
                    
            otherlv_11=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRuleKeywordToIndex1805); 

            		newLeafNode(otherlv_11, grammarAccess.getRuleKeywordToIndexAccess().getAttrAttributeCrossReference_7_0()); 
            	

            }


            }

            otherlv_12=(Token)match(input,19,FOLLOW_19_in_ruleRuleKeywordToIndex1817); 

                	newLeafNode(otherlv_12, grammarAccess.getRuleKeywordToIndexAccess().getRightCurlyBracketKeyword_8());
                

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
    // $ANTLR end "ruleRuleKeywordToIndex"


    // $ANTLR start "ruleAttributeType"
    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:851:1: ruleAttributeType returns [Enumerator current=null] : ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Integer' ) | (enumLiteral_2= 'Long' ) | (enumLiteral_3= 'Short' ) | (enumLiteral_4= 'Decimal' ) | (enumLiteral_5= 'Boolean' ) ) ;
    public final Enumerator ruleAttributeType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;

         enterRule(); 
        try {
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:853:28: ( ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Integer' ) | (enumLiteral_2= 'Long' ) | (enumLiteral_3= 'Short' ) | (enumLiteral_4= 'Decimal' ) | (enumLiteral_5= 'Boolean' ) ) )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:854:1: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Integer' ) | (enumLiteral_2= 'Long' ) | (enumLiteral_3= 'Short' ) | (enumLiteral_4= 'Decimal' ) | (enumLiteral_5= 'Boolean' ) )
            {
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:854:1: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Integer' ) | (enumLiteral_2= 'Long' ) | (enumLiteral_3= 'Short' ) | (enumLiteral_4= 'Decimal' ) | (enumLiteral_5= 'Boolean' ) )
            int alt6=6;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt6=1;
                }
                break;
            case 25:
                {
                alt6=2;
                }
                break;
            case 26:
                {
                alt6=3;
                }
                break;
            case 27:
                {
                alt6=4;
                }
                break;
            case 28:
                {
                alt6=5;
                }
                break;
            case 29:
                {
                alt6=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:854:2: (enumLiteral_0= 'String' )
                    {
                    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:854:2: (enumLiteral_0= 'String' )
                    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:854:4: enumLiteral_0= 'String'
                    {
                    enumLiteral_0=(Token)match(input,24,FOLLOW_24_in_ruleAttributeType1867); 

                            current = grammarAccess.getAttributeTypeAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getAttributeTypeAccess().getStringEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:860:6: (enumLiteral_1= 'Integer' )
                    {
                    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:860:6: (enumLiteral_1= 'Integer' )
                    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:860:8: enumLiteral_1= 'Integer'
                    {
                    enumLiteral_1=(Token)match(input,25,FOLLOW_25_in_ruleAttributeType1884); 

                            current = grammarAccess.getAttributeTypeAccess().getIntegerEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getAttributeTypeAccess().getIntegerEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:866:6: (enumLiteral_2= 'Long' )
                    {
                    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:866:6: (enumLiteral_2= 'Long' )
                    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:866:8: enumLiteral_2= 'Long'
                    {
                    enumLiteral_2=(Token)match(input,26,FOLLOW_26_in_ruleAttributeType1901); 

                            current = grammarAccess.getAttributeTypeAccess().getLongEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getAttributeTypeAccess().getLongEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:872:6: (enumLiteral_3= 'Short' )
                    {
                    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:872:6: (enumLiteral_3= 'Short' )
                    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:872:8: enumLiteral_3= 'Short'
                    {
                    enumLiteral_3=(Token)match(input,27,FOLLOW_27_in_ruleAttributeType1918); 

                            current = grammarAccess.getAttributeTypeAccess().getShortEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getAttributeTypeAccess().getShortEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:878:6: (enumLiteral_4= 'Decimal' )
                    {
                    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:878:6: (enumLiteral_4= 'Decimal' )
                    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:878:8: enumLiteral_4= 'Decimal'
                    {
                    enumLiteral_4=(Token)match(input,28,FOLLOW_28_in_ruleAttributeType1935); 

                            current = grammarAccess.getAttributeTypeAccess().getDecimalEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getAttributeTypeAccess().getDecimalEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:884:6: (enumLiteral_5= 'Boolean' )
                    {
                    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:884:6: (enumLiteral_5= 'Boolean' )
                    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:884:8: enumLiteral_5= 'Boolean'
                    {
                    enumLiteral_5=(Token)match(input,29,FOLLOW_29_in_ruleAttributeType1952); 

                            current = grammarAccess.getAttributeTypeAccess().getBooleanEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getAttributeTypeAccess().getBooleanEnumLiteralDeclaration_5()); 
                        

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
    // $ANTLR end "ruleAttributeType"

    // Delegated rules


    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA5_eotS =
        "\17\uffff";
    static final String DFA5_eofS =
        "\17\uffff";
    static final String DFA5_minS =
        "\1\24\1\4\1\20\1\25\1\6\2\26\2\27\2\6\4\uffff";
    static final String DFA5_maxS =
        "\1\24\1\4\1\20\1\25\1\7\2\26\2\27\2\7\4\uffff";
    static final String DFA5_acceptS =
        "\13\uffff\1\2\1\4\1\1\1\3";
    static final String DFA5_specialS =
        "\17\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\4",
            "\1\6\1\5",
            "\1\7",
            "\1\10",
            "\1\11",
            "\1\12",
            "\1\14\1\13",
            "\1\15\1\16",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "308:1: (this_RuleIndex_0= ruleRuleIndex | this_RuleKeyword_1= ruleRuleKeyword | this_RuleIndexToKeyword_2= ruleRuleIndexToKeyword | this_RuleKeywordToIndex_3= ruleRuleKeywordToIndex )";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleModel167 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleModel179 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleModel196 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleModel213 = new BitSet(new long[]{0x0000000000109002L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleModel234 = new BitSet(new long[]{0x0000000000109002L});
    public static final BitSet FOLLOW_ruleRule_in_ruleModel311 = new BitSet(new long[]{0x0000000000109002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute393 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleAttribute440 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute457 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleAttribute474 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleAttribute487 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleAttribute504 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleAttribute523 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleAttribute535 = new BitSet(new long[]{0x000000003F000000L});
    public static final BitSet FOLLOW_ruleAttributeType_in_ruleAttribute556 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleAttribute568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_entryRuleRule604 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRule614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleIndex_in_ruleRule661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleKeyword_in_ruleRule688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleIndexToKeyword_in_ruleRule715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleKeywordToIndex_in_ruleRule742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleIndex_in_entryRuleRuleIndex777 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRuleIndex787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleRuleIndex824 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRuleIndex841 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleRuleIndex858 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleRuleIndex871 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRuleIndex888 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleRuleIndex905 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleRuleIndex919 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRuleIndex936 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleRuleIndex953 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleRuleIndex966 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleRuleIndex978 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRuleIndex998 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleRuleIndex1010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleIndexToKeyword_in_entryRuleRuleIndexToKeyword1046 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRuleIndexToKeyword1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleRuleIndexToKeyword1093 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRuleIndexToKeyword1110 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleRuleIndexToKeyword1127 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleRuleIndexToKeyword1140 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRuleIndexToKeyword1157 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleRuleIndexToKeyword1174 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleRuleIndexToKeyword1188 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRuleIndexToKeyword1205 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleRuleIndexToKeyword1222 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleRuleIndexToKeyword1235 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleRuleIndexToKeyword1247 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRuleIndexToKeyword1267 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleRuleIndexToKeyword1279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleKeyword_in_entryRuleRuleKeyword1315 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRuleKeyword1325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleRuleKeyword1362 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRuleKeyword1379 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleRuleKeyword1396 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleRuleKeyword1409 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRuleKeyword1426 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleRuleKeyword1443 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleRuleKeyword1457 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRuleKeyword1474 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleRuleKeyword1491 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleRuleKeyword1504 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleRuleKeyword1516 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRuleKeyword1536 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleRuleKeyword1548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleKeywordToIndex_in_entryRuleRuleKeywordToIndex1584 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRuleKeywordToIndex1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleRuleKeywordToIndex1631 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRuleKeywordToIndex1648 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleRuleKeywordToIndex1665 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleRuleKeywordToIndex1678 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRuleKeywordToIndex1695 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleRuleKeywordToIndex1712 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleRuleKeywordToIndex1726 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRuleKeywordToIndex1743 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleRuleKeywordToIndex1760 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleRuleKeywordToIndex1773 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleRuleKeywordToIndex1785 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRuleKeywordToIndex1805 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleRuleKeywordToIndex1817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleAttributeType1867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleAttributeType1884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleAttributeType1901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleAttributeType1918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleAttributeType1935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleAttributeType1952 = new BitSet(new long[]{0x0000000000000002L});

}
