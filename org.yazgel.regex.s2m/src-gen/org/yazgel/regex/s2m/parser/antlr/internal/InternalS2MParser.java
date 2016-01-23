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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_BOOLEAN", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'model'", "':'", "';'", "'attr'", "'{'", "'type'", "'}'", "'rule'", "'start'", "','", "'end'", "'String'", "'Integer'", "'Long'", "'Short'", "'Decimal'", "'Boolean'"
    };
    public static final int RULE_BOOLEAN=7;
    public static final int RULE_STRING=6;
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
    public static final int RULE_INT=5;
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
                else if ( LA3_0 ==19 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1) ) {
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

            	        if ( (LA2_0==19) ) {
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
    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:205:1: ruleAttribute returns [EObject current=null] : (otherlv_0= 'attr' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' otherlv_4= ':' ( (lv_type_5_0= ruleAttributeType ) ) otherlv_6= '}' ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Enumerator lv_type_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:208:28: ( (otherlv_0= 'attr' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' otherlv_4= ':' ( (lv_type_5_0= ruleAttributeType ) ) otherlv_6= '}' ) )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:209:1: (otherlv_0= 'attr' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' otherlv_4= ':' ( (lv_type_5_0= ruleAttributeType ) ) otherlv_6= '}' )
            {
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:209:1: (otherlv_0= 'attr' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' otherlv_4= ':' ( (lv_type_5_0= ruleAttributeType ) ) otherlv_6= '}' )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:209:3: otherlv_0= 'attr' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' otherlv_4= ':' ( (lv_type_5_0= ruleAttributeType ) ) otherlv_6= '}'
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
                
            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleAttribute486); 

                	newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getTypeKeyword_3());
                
            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleAttribute498); 

                	newLeafNode(otherlv_4, grammarAccess.getAttributeAccess().getColonKeyword_4());
                
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:243:1: ( (lv_type_5_0= ruleAttributeType ) )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:244:1: (lv_type_5_0= ruleAttributeType )
            {
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:244:1: (lv_type_5_0= ruleAttributeType )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:245:3: lv_type_5_0= ruleAttributeType
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getTypeAttributeTypeEnumRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleAttributeType_in_ruleAttribute519);
            lv_type_5_0=ruleAttributeType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAttributeRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_5_0, 
                    		"AttributeType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleAttribute531); 

                	newLeafNode(otherlv_6, grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_6());
                

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
    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:273:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:274:2: (iv_ruleRule= ruleRule EOF )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:275:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_ruleRule_in_entryRuleRule567);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRule577); 

            }

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
    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:282:1: ruleRule returns [EObject current=null] : (this_RuleIndex_0= ruleRuleIndex | this_RuleKeyword_1= ruleRuleKeyword | this_RuleIndexToKeyword_2= ruleRuleIndexToKeyword | this_RuleKeywordToIndex_3= ruleRuleKeywordToIndex ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        EObject this_RuleIndex_0 = null;

        EObject this_RuleKeyword_1 = null;

        EObject this_RuleIndexToKeyword_2 = null;

        EObject this_RuleKeywordToIndex_3 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:285:28: ( (this_RuleIndex_0= ruleRuleIndex | this_RuleKeyword_1= ruleRuleKeyword | this_RuleIndexToKeyword_2= ruleRuleIndexToKeyword | this_RuleKeywordToIndex_3= ruleRuleKeywordToIndex ) )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:286:1: (this_RuleIndex_0= ruleRuleIndex | this_RuleKeyword_1= ruleRuleKeyword | this_RuleIndexToKeyword_2= ruleRuleIndexToKeyword | this_RuleKeywordToIndex_3= ruleRuleKeywordToIndex )
            {
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:286:1: (this_RuleIndex_0= ruleRuleIndex | this_RuleKeyword_1= ruleRuleKeyword | this_RuleIndexToKeyword_2= ruleRuleIndexToKeyword | this_RuleKeywordToIndex_3= ruleRuleKeywordToIndex )
            int alt4=4;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:287:5: this_RuleIndex_0= ruleRuleIndex
                    {
                     
                            newCompositeNode(grammarAccess.getRuleAccess().getRuleIndexParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleRuleIndex_in_ruleRule624);
                    this_RuleIndex_0=ruleRuleIndex();

                    state._fsp--;

                     
                            current = this_RuleIndex_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:297:5: this_RuleKeyword_1= ruleRuleKeyword
                    {
                     
                            newCompositeNode(grammarAccess.getRuleAccess().getRuleKeywordParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleRuleKeyword_in_ruleRule651);
                    this_RuleKeyword_1=ruleRuleKeyword();

                    state._fsp--;

                     
                            current = this_RuleKeyword_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:307:5: this_RuleIndexToKeyword_2= ruleRuleIndexToKeyword
                    {
                     
                            newCompositeNode(grammarAccess.getRuleAccess().getRuleIndexToKeywordParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleRuleIndexToKeyword_in_ruleRule678);
                    this_RuleIndexToKeyword_2=ruleRuleIndexToKeyword();

                    state._fsp--;

                     
                            current = this_RuleIndexToKeyword_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:317:5: this_RuleKeywordToIndex_3= ruleRuleKeywordToIndex
                    {
                     
                            newCompositeNode(grammarAccess.getRuleAccess().getRuleKeywordToIndexParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleRuleKeywordToIndex_in_ruleRule705);
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
    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:333:1: entryRuleRuleIndex returns [EObject current=null] : iv_ruleRuleIndex= ruleRuleIndex EOF ;
    public final EObject entryRuleRuleIndex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleIndex = null;


        try {
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:334:2: (iv_ruleRuleIndex= ruleRuleIndex EOF )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:335:2: iv_ruleRuleIndex= ruleRuleIndex EOF
            {
             newCompositeNode(grammarAccess.getRuleIndexRule()); 
            pushFollow(FOLLOW_ruleRuleIndex_in_entryRuleRuleIndex740);
            iv_ruleRuleIndex=ruleRuleIndex();

            state._fsp--;

             current =iv_ruleRuleIndex; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRuleIndex750); 

            }

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
    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:342:1: ruleRuleIndex returns [EObject current=null] : (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'start' ( (lv_startIndex_4_0= RULE_INT ) ) otherlv_5= ',' ) (otherlv_6= 'end' ( (lv_endIndex_7_0= RULE_INT ) ) otherlv_8= ',' ) otherlv_9= 'attr' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}' ) ;
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
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:345:28: ( (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'start' ( (lv_startIndex_4_0= RULE_INT ) ) otherlv_5= ',' ) (otherlv_6= 'end' ( (lv_endIndex_7_0= RULE_INT ) ) otherlv_8= ',' ) otherlv_9= 'attr' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}' ) )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:346:1: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'start' ( (lv_startIndex_4_0= RULE_INT ) ) otherlv_5= ',' ) (otherlv_6= 'end' ( (lv_endIndex_7_0= RULE_INT ) ) otherlv_8= ',' ) otherlv_9= 'attr' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}' )
            {
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:346:1: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'start' ( (lv_startIndex_4_0= RULE_INT ) ) otherlv_5= ',' ) (otherlv_6= 'end' ( (lv_endIndex_7_0= RULE_INT ) ) otherlv_8= ',' ) otherlv_9= 'attr' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}' )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:346:3: otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'start' ( (lv_startIndex_4_0= RULE_INT ) ) otherlv_5= ',' ) (otherlv_6= 'end' ( (lv_endIndex_7_0= RULE_INT ) ) otherlv_8= ',' ) otherlv_9= 'attr' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleRuleIndex787); 

                	newLeafNode(otherlv_0, grammarAccess.getRuleIndexAccess().getRuleKeyword_0());
                
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:350:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:351:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:351:1: (lv_name_1_0= RULE_ID )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:352:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRuleIndex804); 

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

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleRuleIndex821); 

                	newLeafNode(otherlv_2, grammarAccess.getRuleIndexAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:372:1: (otherlv_3= 'start' ( (lv_startIndex_4_0= RULE_INT ) ) otherlv_5= ',' )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:372:3: otherlv_3= 'start' ( (lv_startIndex_4_0= RULE_INT ) ) otherlv_5= ','
            {
            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleRuleIndex834); 

                	newLeafNode(otherlv_3, grammarAccess.getRuleIndexAccess().getStartKeyword_3_0());
                
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:376:1: ( (lv_startIndex_4_0= RULE_INT ) )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:377:1: (lv_startIndex_4_0= RULE_INT )
            {
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:377:1: (lv_startIndex_4_0= RULE_INT )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:378:3: lv_startIndex_4_0= RULE_INT
            {
            lv_startIndex_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRuleIndex851); 

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

            otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleRuleIndex868); 

                	newLeafNode(otherlv_5, grammarAccess.getRuleIndexAccess().getCommaKeyword_3_2());
                

            }

            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:398:2: (otherlv_6= 'end' ( (lv_endIndex_7_0= RULE_INT ) ) otherlv_8= ',' )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:398:4: otherlv_6= 'end' ( (lv_endIndex_7_0= RULE_INT ) ) otherlv_8= ','
            {
            otherlv_6=(Token)match(input,22,FOLLOW_22_in_ruleRuleIndex882); 

                	newLeafNode(otherlv_6, grammarAccess.getRuleIndexAccess().getEndKeyword_4_0());
                
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:402:1: ( (lv_endIndex_7_0= RULE_INT ) )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:403:1: (lv_endIndex_7_0= RULE_INT )
            {
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:403:1: (lv_endIndex_7_0= RULE_INT )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:404:3: lv_endIndex_7_0= RULE_INT
            {
            lv_endIndex_7_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRuleIndex899); 

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

            otherlv_8=(Token)match(input,21,FOLLOW_21_in_ruleRuleIndex916); 

                	newLeafNode(otherlv_8, grammarAccess.getRuleIndexAccess().getCommaKeyword_4_2());
                

            }

            otherlv_9=(Token)match(input,15,FOLLOW_15_in_ruleRuleIndex929); 

                	newLeafNode(otherlv_9, grammarAccess.getRuleIndexAccess().getAttrKeyword_5());
                
            otherlv_10=(Token)match(input,13,FOLLOW_13_in_ruleRuleIndex941); 

                	newLeafNode(otherlv_10, grammarAccess.getRuleIndexAccess().getColonKeyword_6());
                
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:432:1: ( (otherlv_11= RULE_ID ) )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:433:1: (otherlv_11= RULE_ID )
            {
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:433:1: (otherlv_11= RULE_ID )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:434:3: otherlv_11= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRuleIndexRule());
            	        }
                    
            otherlv_11=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRuleIndex961); 

            		newLeafNode(otherlv_11, grammarAccess.getRuleIndexAccess().getAttrAttributeCrossReference_7_0()); 
            	

            }


            }

            otherlv_12=(Token)match(input,18,FOLLOW_18_in_ruleRuleIndex973); 

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
    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:457:1: entryRuleRuleIndexToKeyword returns [EObject current=null] : iv_ruleRuleIndexToKeyword= ruleRuleIndexToKeyword EOF ;
    public final EObject entryRuleRuleIndexToKeyword() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleIndexToKeyword = null;


        try {
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:458:2: (iv_ruleRuleIndexToKeyword= ruleRuleIndexToKeyword EOF )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:459:2: iv_ruleRuleIndexToKeyword= ruleRuleIndexToKeyword EOF
            {
             newCompositeNode(grammarAccess.getRuleIndexToKeywordRule()); 
            pushFollow(FOLLOW_ruleRuleIndexToKeyword_in_entryRuleRuleIndexToKeyword1009);
            iv_ruleRuleIndexToKeyword=ruleRuleIndexToKeyword();

            state._fsp--;

             current =iv_ruleRuleIndexToKeyword; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRuleIndexToKeyword1019); 

            }

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
    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:466:1: ruleRuleIndexToKeyword returns [EObject current=null] : (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'start' ( (lv_startIndex_4_0= RULE_INT ) ) otherlv_5= ',' ) (otherlv_6= 'end' ( (lv_endDelimeter_7_0= RULE_STRING ) ) otherlv_8= ',' ) otherlv_9= 'attr' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}' ) ;
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
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:469:28: ( (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'start' ( (lv_startIndex_4_0= RULE_INT ) ) otherlv_5= ',' ) (otherlv_6= 'end' ( (lv_endDelimeter_7_0= RULE_STRING ) ) otherlv_8= ',' ) otherlv_9= 'attr' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}' ) )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:470:1: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'start' ( (lv_startIndex_4_0= RULE_INT ) ) otherlv_5= ',' ) (otherlv_6= 'end' ( (lv_endDelimeter_7_0= RULE_STRING ) ) otherlv_8= ',' ) otherlv_9= 'attr' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}' )
            {
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:470:1: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'start' ( (lv_startIndex_4_0= RULE_INT ) ) otherlv_5= ',' ) (otherlv_6= 'end' ( (lv_endDelimeter_7_0= RULE_STRING ) ) otherlv_8= ',' ) otherlv_9= 'attr' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}' )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:470:3: otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'start' ( (lv_startIndex_4_0= RULE_INT ) ) otherlv_5= ',' ) (otherlv_6= 'end' ( (lv_endDelimeter_7_0= RULE_STRING ) ) otherlv_8= ',' ) otherlv_9= 'attr' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleRuleIndexToKeyword1056); 

                	newLeafNode(otherlv_0, grammarAccess.getRuleIndexToKeywordAccess().getRuleKeyword_0());
                
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:474:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:475:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:475:1: (lv_name_1_0= RULE_ID )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:476:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRuleIndexToKeyword1073); 

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

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleRuleIndexToKeyword1090); 

                	newLeafNode(otherlv_2, grammarAccess.getRuleIndexToKeywordAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:496:1: (otherlv_3= 'start' ( (lv_startIndex_4_0= RULE_INT ) ) otherlv_5= ',' )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:496:3: otherlv_3= 'start' ( (lv_startIndex_4_0= RULE_INT ) ) otherlv_5= ','
            {
            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleRuleIndexToKeyword1103); 

                	newLeafNode(otherlv_3, grammarAccess.getRuleIndexToKeywordAccess().getStartKeyword_3_0());
                
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:500:1: ( (lv_startIndex_4_0= RULE_INT ) )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:501:1: (lv_startIndex_4_0= RULE_INT )
            {
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:501:1: (lv_startIndex_4_0= RULE_INT )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:502:3: lv_startIndex_4_0= RULE_INT
            {
            lv_startIndex_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRuleIndexToKeyword1120); 

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

            otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleRuleIndexToKeyword1137); 

                	newLeafNode(otherlv_5, grammarAccess.getRuleIndexToKeywordAccess().getCommaKeyword_3_2());
                

            }

            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:522:2: (otherlv_6= 'end' ( (lv_endDelimeter_7_0= RULE_STRING ) ) otherlv_8= ',' )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:522:4: otherlv_6= 'end' ( (lv_endDelimeter_7_0= RULE_STRING ) ) otherlv_8= ','
            {
            otherlv_6=(Token)match(input,22,FOLLOW_22_in_ruleRuleIndexToKeyword1151); 

                	newLeafNode(otherlv_6, grammarAccess.getRuleIndexToKeywordAccess().getEndKeyword_4_0());
                
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:526:1: ( (lv_endDelimeter_7_0= RULE_STRING ) )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:527:1: (lv_endDelimeter_7_0= RULE_STRING )
            {
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:527:1: (lv_endDelimeter_7_0= RULE_STRING )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:528:3: lv_endDelimeter_7_0= RULE_STRING
            {
            lv_endDelimeter_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRuleIndexToKeyword1168); 

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

            otherlv_8=(Token)match(input,21,FOLLOW_21_in_ruleRuleIndexToKeyword1185); 

                	newLeafNode(otherlv_8, grammarAccess.getRuleIndexToKeywordAccess().getCommaKeyword_4_2());
                

            }

            otherlv_9=(Token)match(input,15,FOLLOW_15_in_ruleRuleIndexToKeyword1198); 

                	newLeafNode(otherlv_9, grammarAccess.getRuleIndexToKeywordAccess().getAttrKeyword_5());
                
            otherlv_10=(Token)match(input,13,FOLLOW_13_in_ruleRuleIndexToKeyword1210); 

                	newLeafNode(otherlv_10, grammarAccess.getRuleIndexToKeywordAccess().getColonKeyword_6());
                
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:556:1: ( (otherlv_11= RULE_ID ) )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:557:1: (otherlv_11= RULE_ID )
            {
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:557:1: (otherlv_11= RULE_ID )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:558:3: otherlv_11= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRuleIndexToKeywordRule());
            	        }
                    
            otherlv_11=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRuleIndexToKeyword1230); 

            		newLeafNode(otherlv_11, grammarAccess.getRuleIndexToKeywordAccess().getAttrAttributeCrossReference_7_0()); 
            	

            }


            }

            otherlv_12=(Token)match(input,18,FOLLOW_18_in_ruleRuleIndexToKeyword1242); 

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
    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:581:1: entryRuleRuleKeyword returns [EObject current=null] : iv_ruleRuleKeyword= ruleRuleKeyword EOF ;
    public final EObject entryRuleRuleKeyword() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleKeyword = null;


        try {
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:582:2: (iv_ruleRuleKeyword= ruleRuleKeyword EOF )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:583:2: iv_ruleRuleKeyword= ruleRuleKeyword EOF
            {
             newCompositeNode(grammarAccess.getRuleKeywordRule()); 
            pushFollow(FOLLOW_ruleRuleKeyword_in_entryRuleRuleKeyword1278);
            iv_ruleRuleKeyword=ruleRuleKeyword();

            state._fsp--;

             current =iv_ruleRuleKeyword; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRuleKeyword1288); 

            }

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
    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:590:1: ruleRuleKeyword returns [EObject current=null] : (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'start' ( (lv_startDelimeter_4_0= RULE_STRING ) ) otherlv_5= ',' ) (otherlv_6= 'end' ( (lv_endDelimeter_7_0= RULE_STRING ) ) otherlv_8= ',' ) otherlv_9= 'attr' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}' ) ;
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
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:593:28: ( (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'start' ( (lv_startDelimeter_4_0= RULE_STRING ) ) otherlv_5= ',' ) (otherlv_6= 'end' ( (lv_endDelimeter_7_0= RULE_STRING ) ) otherlv_8= ',' ) otherlv_9= 'attr' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}' ) )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:594:1: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'start' ( (lv_startDelimeter_4_0= RULE_STRING ) ) otherlv_5= ',' ) (otherlv_6= 'end' ( (lv_endDelimeter_7_0= RULE_STRING ) ) otherlv_8= ',' ) otherlv_9= 'attr' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}' )
            {
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:594:1: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'start' ( (lv_startDelimeter_4_0= RULE_STRING ) ) otherlv_5= ',' ) (otherlv_6= 'end' ( (lv_endDelimeter_7_0= RULE_STRING ) ) otherlv_8= ',' ) otherlv_9= 'attr' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}' )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:594:3: otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'start' ( (lv_startDelimeter_4_0= RULE_STRING ) ) otherlv_5= ',' ) (otherlv_6= 'end' ( (lv_endDelimeter_7_0= RULE_STRING ) ) otherlv_8= ',' ) otherlv_9= 'attr' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleRuleKeyword1325); 

                	newLeafNode(otherlv_0, grammarAccess.getRuleKeywordAccess().getRuleKeyword_0());
                
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:598:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:599:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:599:1: (lv_name_1_0= RULE_ID )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:600:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRuleKeyword1342); 

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

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleRuleKeyword1359); 

                	newLeafNode(otherlv_2, grammarAccess.getRuleKeywordAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:620:1: (otherlv_3= 'start' ( (lv_startDelimeter_4_0= RULE_STRING ) ) otherlv_5= ',' )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:620:3: otherlv_3= 'start' ( (lv_startDelimeter_4_0= RULE_STRING ) ) otherlv_5= ','
            {
            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleRuleKeyword1372); 

                	newLeafNode(otherlv_3, grammarAccess.getRuleKeywordAccess().getStartKeyword_3_0());
                
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:624:1: ( (lv_startDelimeter_4_0= RULE_STRING ) )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:625:1: (lv_startDelimeter_4_0= RULE_STRING )
            {
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:625:1: (lv_startDelimeter_4_0= RULE_STRING )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:626:3: lv_startDelimeter_4_0= RULE_STRING
            {
            lv_startDelimeter_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRuleKeyword1389); 

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

            otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleRuleKeyword1406); 

                	newLeafNode(otherlv_5, grammarAccess.getRuleKeywordAccess().getCommaKeyword_3_2());
                

            }

            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:646:2: (otherlv_6= 'end' ( (lv_endDelimeter_7_0= RULE_STRING ) ) otherlv_8= ',' )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:646:4: otherlv_6= 'end' ( (lv_endDelimeter_7_0= RULE_STRING ) ) otherlv_8= ','
            {
            otherlv_6=(Token)match(input,22,FOLLOW_22_in_ruleRuleKeyword1420); 

                	newLeafNode(otherlv_6, grammarAccess.getRuleKeywordAccess().getEndKeyword_4_0());
                
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:650:1: ( (lv_endDelimeter_7_0= RULE_STRING ) )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:651:1: (lv_endDelimeter_7_0= RULE_STRING )
            {
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:651:1: (lv_endDelimeter_7_0= RULE_STRING )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:652:3: lv_endDelimeter_7_0= RULE_STRING
            {
            lv_endDelimeter_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRuleKeyword1437); 

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

            otherlv_8=(Token)match(input,21,FOLLOW_21_in_ruleRuleKeyword1454); 

                	newLeafNode(otherlv_8, grammarAccess.getRuleKeywordAccess().getCommaKeyword_4_2());
                

            }

            otherlv_9=(Token)match(input,15,FOLLOW_15_in_ruleRuleKeyword1467); 

                	newLeafNode(otherlv_9, grammarAccess.getRuleKeywordAccess().getAttrKeyword_5());
                
            otherlv_10=(Token)match(input,13,FOLLOW_13_in_ruleRuleKeyword1479); 

                	newLeafNode(otherlv_10, grammarAccess.getRuleKeywordAccess().getColonKeyword_6());
                
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:680:1: ( (otherlv_11= RULE_ID ) )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:681:1: (otherlv_11= RULE_ID )
            {
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:681:1: (otherlv_11= RULE_ID )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:682:3: otherlv_11= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRuleKeywordRule());
            	        }
                    
            otherlv_11=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRuleKeyword1499); 

            		newLeafNode(otherlv_11, grammarAccess.getRuleKeywordAccess().getAttrAttributeCrossReference_7_0()); 
            	

            }


            }

            otherlv_12=(Token)match(input,18,FOLLOW_18_in_ruleRuleKeyword1511); 

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
    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:705:1: entryRuleRuleKeywordToIndex returns [EObject current=null] : iv_ruleRuleKeywordToIndex= ruleRuleKeywordToIndex EOF ;
    public final EObject entryRuleRuleKeywordToIndex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleKeywordToIndex = null;


        try {
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:706:2: (iv_ruleRuleKeywordToIndex= ruleRuleKeywordToIndex EOF )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:707:2: iv_ruleRuleKeywordToIndex= ruleRuleKeywordToIndex EOF
            {
             newCompositeNode(grammarAccess.getRuleKeywordToIndexRule()); 
            pushFollow(FOLLOW_ruleRuleKeywordToIndex_in_entryRuleRuleKeywordToIndex1547);
            iv_ruleRuleKeywordToIndex=ruleRuleKeywordToIndex();

            state._fsp--;

             current =iv_ruleRuleKeywordToIndex; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRuleKeywordToIndex1557); 

            }

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
    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:714:1: ruleRuleKeywordToIndex returns [EObject current=null] : (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'start' ( (lv_startDelimeter_4_0= RULE_STRING ) ) otherlv_5= ',' ) (otherlv_6= 'end' ( (lv_endIndex_7_0= RULE_INT ) ) otherlv_8= ',' ) otherlv_9= 'attr' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}' ) ;
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
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:717:28: ( (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'start' ( (lv_startDelimeter_4_0= RULE_STRING ) ) otherlv_5= ',' ) (otherlv_6= 'end' ( (lv_endIndex_7_0= RULE_INT ) ) otherlv_8= ',' ) otherlv_9= 'attr' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}' ) )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:718:1: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'start' ( (lv_startDelimeter_4_0= RULE_STRING ) ) otherlv_5= ',' ) (otherlv_6= 'end' ( (lv_endIndex_7_0= RULE_INT ) ) otherlv_8= ',' ) otherlv_9= 'attr' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}' )
            {
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:718:1: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'start' ( (lv_startDelimeter_4_0= RULE_STRING ) ) otherlv_5= ',' ) (otherlv_6= 'end' ( (lv_endIndex_7_0= RULE_INT ) ) otherlv_8= ',' ) otherlv_9= 'attr' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}' )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:718:3: otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'start' ( (lv_startDelimeter_4_0= RULE_STRING ) ) otherlv_5= ',' ) (otherlv_6= 'end' ( (lv_endIndex_7_0= RULE_INT ) ) otherlv_8= ',' ) otherlv_9= 'attr' otherlv_10= ':' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleRuleKeywordToIndex1594); 

                	newLeafNode(otherlv_0, grammarAccess.getRuleKeywordToIndexAccess().getRuleKeyword_0());
                
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:722:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:723:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:723:1: (lv_name_1_0= RULE_ID )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:724:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRuleKeywordToIndex1611); 

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

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleRuleKeywordToIndex1628); 

                	newLeafNode(otherlv_2, grammarAccess.getRuleKeywordToIndexAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:744:1: (otherlv_3= 'start' ( (lv_startDelimeter_4_0= RULE_STRING ) ) otherlv_5= ',' )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:744:3: otherlv_3= 'start' ( (lv_startDelimeter_4_0= RULE_STRING ) ) otherlv_5= ','
            {
            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleRuleKeywordToIndex1641); 

                	newLeafNode(otherlv_3, grammarAccess.getRuleKeywordToIndexAccess().getStartKeyword_3_0());
                
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:748:1: ( (lv_startDelimeter_4_0= RULE_STRING ) )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:749:1: (lv_startDelimeter_4_0= RULE_STRING )
            {
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:749:1: (lv_startDelimeter_4_0= RULE_STRING )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:750:3: lv_startDelimeter_4_0= RULE_STRING
            {
            lv_startDelimeter_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRuleKeywordToIndex1658); 

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

            otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleRuleKeywordToIndex1675); 

                	newLeafNode(otherlv_5, grammarAccess.getRuleKeywordToIndexAccess().getCommaKeyword_3_2());
                

            }

            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:770:2: (otherlv_6= 'end' ( (lv_endIndex_7_0= RULE_INT ) ) otherlv_8= ',' )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:770:4: otherlv_6= 'end' ( (lv_endIndex_7_0= RULE_INT ) ) otherlv_8= ','
            {
            otherlv_6=(Token)match(input,22,FOLLOW_22_in_ruleRuleKeywordToIndex1689); 

                	newLeafNode(otherlv_6, grammarAccess.getRuleKeywordToIndexAccess().getEndKeyword_4_0());
                
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:774:1: ( (lv_endIndex_7_0= RULE_INT ) )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:775:1: (lv_endIndex_7_0= RULE_INT )
            {
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:775:1: (lv_endIndex_7_0= RULE_INT )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:776:3: lv_endIndex_7_0= RULE_INT
            {
            lv_endIndex_7_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRuleKeywordToIndex1706); 

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

            otherlv_8=(Token)match(input,21,FOLLOW_21_in_ruleRuleKeywordToIndex1723); 

                	newLeafNode(otherlv_8, grammarAccess.getRuleKeywordToIndexAccess().getCommaKeyword_4_2());
                

            }

            otherlv_9=(Token)match(input,15,FOLLOW_15_in_ruleRuleKeywordToIndex1736); 

                	newLeafNode(otherlv_9, grammarAccess.getRuleKeywordToIndexAccess().getAttrKeyword_5());
                
            otherlv_10=(Token)match(input,13,FOLLOW_13_in_ruleRuleKeywordToIndex1748); 

                	newLeafNode(otherlv_10, grammarAccess.getRuleKeywordToIndexAccess().getColonKeyword_6());
                
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:804:1: ( (otherlv_11= RULE_ID ) )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:805:1: (otherlv_11= RULE_ID )
            {
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:805:1: (otherlv_11= RULE_ID )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:806:3: otherlv_11= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRuleKeywordToIndexRule());
            	        }
                    
            otherlv_11=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRuleKeywordToIndex1768); 

            		newLeafNode(otherlv_11, grammarAccess.getRuleKeywordToIndexAccess().getAttrAttributeCrossReference_7_0()); 
            	

            }


            }

            otherlv_12=(Token)match(input,18,FOLLOW_18_in_ruleRuleKeywordToIndex1780); 

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
    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:829:1: ruleAttributeType returns [Enumerator current=null] : ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Integer' ) | (enumLiteral_2= 'Long' ) | (enumLiteral_3= 'Short' ) | (enumLiteral_4= 'Decimal' ) | (enumLiteral_5= 'Boolean' ) ) ;
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
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:831:28: ( ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Integer' ) | (enumLiteral_2= 'Long' ) | (enumLiteral_3= 'Short' ) | (enumLiteral_4= 'Decimal' ) | (enumLiteral_5= 'Boolean' ) ) )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:832:1: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Integer' ) | (enumLiteral_2= 'Long' ) | (enumLiteral_3= 'Short' ) | (enumLiteral_4= 'Decimal' ) | (enumLiteral_5= 'Boolean' ) )
            {
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:832:1: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Integer' ) | (enumLiteral_2= 'Long' ) | (enumLiteral_3= 'Short' ) | (enumLiteral_4= 'Decimal' ) | (enumLiteral_5= 'Boolean' ) )
            int alt5=6;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt5=1;
                }
                break;
            case 24:
                {
                alt5=2;
                }
                break;
            case 25:
                {
                alt5=3;
                }
                break;
            case 26:
                {
                alt5=4;
                }
                break;
            case 27:
                {
                alt5=5;
                }
                break;
            case 28:
                {
                alt5=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:832:2: (enumLiteral_0= 'String' )
                    {
                    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:832:2: (enumLiteral_0= 'String' )
                    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:832:4: enumLiteral_0= 'String'
                    {
                    enumLiteral_0=(Token)match(input,23,FOLLOW_23_in_ruleAttributeType1830); 

                            current = grammarAccess.getAttributeTypeAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getAttributeTypeAccess().getStringEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:838:6: (enumLiteral_1= 'Integer' )
                    {
                    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:838:6: (enumLiteral_1= 'Integer' )
                    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:838:8: enumLiteral_1= 'Integer'
                    {
                    enumLiteral_1=(Token)match(input,24,FOLLOW_24_in_ruleAttributeType1847); 

                            current = grammarAccess.getAttributeTypeAccess().getIntegerEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getAttributeTypeAccess().getIntegerEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:844:6: (enumLiteral_2= 'Long' )
                    {
                    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:844:6: (enumLiteral_2= 'Long' )
                    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:844:8: enumLiteral_2= 'Long'
                    {
                    enumLiteral_2=(Token)match(input,25,FOLLOW_25_in_ruleAttributeType1864); 

                            current = grammarAccess.getAttributeTypeAccess().getLongEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getAttributeTypeAccess().getLongEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:850:6: (enumLiteral_3= 'Short' )
                    {
                    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:850:6: (enumLiteral_3= 'Short' )
                    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:850:8: enumLiteral_3= 'Short'
                    {
                    enumLiteral_3=(Token)match(input,26,FOLLOW_26_in_ruleAttributeType1881); 

                            current = grammarAccess.getAttributeTypeAccess().getShortEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getAttributeTypeAccess().getShortEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:856:6: (enumLiteral_4= 'Decimal' )
                    {
                    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:856:6: (enumLiteral_4= 'Decimal' )
                    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:856:8: enumLiteral_4= 'Decimal'
                    {
                    enumLiteral_4=(Token)match(input,27,FOLLOW_27_in_ruleAttributeType1898); 

                            current = grammarAccess.getAttributeTypeAccess().getDecimalEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getAttributeTypeAccess().getDecimalEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:862:6: (enumLiteral_5= 'Boolean' )
                    {
                    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:862:6: (enumLiteral_5= 'Boolean' )
                    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:862:8: enumLiteral_5= 'Boolean'
                    {
                    enumLiteral_5=(Token)match(input,28,FOLLOW_28_in_ruleAttributeType1915); 

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


    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA4_eotS =
        "\17\uffff";
    static final String DFA4_eofS =
        "\17\uffff";
    static final String DFA4_minS =
        "\1\23\1\4\1\20\1\24\1\5\2\25\2\26\2\5\4\uffff";
    static final String DFA4_maxS =
        "\1\23\1\4\1\20\1\24\1\6\2\25\2\26\2\6\4\uffff";
    static final String DFA4_acceptS =
        "\13\uffff\1\2\1\4\1\1\1\3";
    static final String DFA4_specialS =
        "\17\uffff}>";
    static final String[] DFA4_transitionS = {
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

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "286:1: (this_RuleIndex_0= ruleRuleIndex | this_RuleKeyword_1= ruleRuleKeyword | this_RuleIndexToKeyword_2= ruleRuleIndexToKeyword | this_RuleKeywordToIndex_3= ruleRuleKeywordToIndex )";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleModel167 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleModel179 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleModel196 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleModel213 = new BitSet(new long[]{0x0000000000089002L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleModel234 = new BitSet(new long[]{0x0000000000089002L});
    public static final BitSet FOLLOW_ruleRule_in_ruleModel311 = new BitSet(new long[]{0x0000000000089002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute393 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleAttribute440 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute457 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleAttribute474 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleAttribute486 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleAttribute498 = new BitSet(new long[]{0x000000001F800000L});
    public static final BitSet FOLLOW_ruleAttributeType_in_ruleAttribute519 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleAttribute531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_entryRuleRule567 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRule577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleIndex_in_ruleRule624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleKeyword_in_ruleRule651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleIndexToKeyword_in_ruleRule678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleKeywordToIndex_in_ruleRule705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleIndex_in_entryRuleRuleIndex740 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRuleIndex750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleRuleIndex787 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRuleIndex804 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleRuleIndex821 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleRuleIndex834 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRuleIndex851 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleRuleIndex868 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleRuleIndex882 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRuleIndex899 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleRuleIndex916 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleRuleIndex929 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleRuleIndex941 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRuleIndex961 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleRuleIndex973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleIndexToKeyword_in_entryRuleRuleIndexToKeyword1009 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRuleIndexToKeyword1019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleRuleIndexToKeyword1056 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRuleIndexToKeyword1073 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleRuleIndexToKeyword1090 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleRuleIndexToKeyword1103 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRuleIndexToKeyword1120 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleRuleIndexToKeyword1137 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleRuleIndexToKeyword1151 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRuleIndexToKeyword1168 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleRuleIndexToKeyword1185 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleRuleIndexToKeyword1198 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleRuleIndexToKeyword1210 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRuleIndexToKeyword1230 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleRuleIndexToKeyword1242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleKeyword_in_entryRuleRuleKeyword1278 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRuleKeyword1288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleRuleKeyword1325 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRuleKeyword1342 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleRuleKeyword1359 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleRuleKeyword1372 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRuleKeyword1389 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleRuleKeyword1406 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleRuleKeyword1420 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRuleKeyword1437 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleRuleKeyword1454 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleRuleKeyword1467 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleRuleKeyword1479 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRuleKeyword1499 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleRuleKeyword1511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuleKeywordToIndex_in_entryRuleRuleKeywordToIndex1547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRuleKeywordToIndex1557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleRuleKeywordToIndex1594 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRuleKeywordToIndex1611 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleRuleKeywordToIndex1628 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleRuleKeywordToIndex1641 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRuleKeywordToIndex1658 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleRuleKeywordToIndex1675 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleRuleKeywordToIndex1689 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRuleKeywordToIndex1706 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleRuleKeywordToIndex1723 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleRuleKeywordToIndex1736 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleRuleKeywordToIndex1748 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRuleKeywordToIndex1768 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleRuleKeywordToIndex1780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleAttributeType1830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleAttributeType1847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleAttributeType1864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleAttributeType1881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleAttributeType1898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleAttributeType1915 = new BitSet(new long[]{0x0000000000000002L});

}
