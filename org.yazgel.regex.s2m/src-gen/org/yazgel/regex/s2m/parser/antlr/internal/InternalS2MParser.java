package org.yazgel.regex.s2m.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'model'", "':'", "';'", "'attr'", "'{'", "'type'", "'}'", "'rule'", "'start'", "','", "'end'", "'.'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
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
    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:69:2: iv_ruleModel= ruleModel EOF
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
    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:76:1: ruleModel returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'model' otherlv_2= ':' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ( (lv_attributes_5_0= ruleAttribute ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rules_6_0= ruleRule ) ) )+ ) ) )+ {...}?) ) ) ;
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
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:79:28: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'model' otherlv_2= ':' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ( (lv_attributes_5_0= ruleAttribute ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rules_6_0= ruleRule ) ) )+ ) ) )+ {...}?) ) ) )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:80:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'model' otherlv_2= ':' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ( (lv_attributes_5_0= ruleAttribute ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rules_6_0= ruleRule ) ) )+ ) ) )+ {...}?) ) )
            {
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:80:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'model' otherlv_2= ':' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ( (lv_attributes_5_0= ruleAttribute ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rules_6_0= ruleRule ) ) )+ ) ) )+ {...}?) ) )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:82:1: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'model' otherlv_2= ':' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ( (lv_attributes_5_0= ruleAttribute ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rules_6_0= ruleRule ) ) )+ ) ) )+ {...}?) )
            {
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:82:1: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'model' otherlv_2= ':' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ( (lv_attributes_5_0= ruleAttribute ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rules_6_0= ruleRule ) ) )+ ) ) )+ {...}?) )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:83:2: ( ( ({...}? => ( ({...}? => (otherlv_1= 'model' otherlv_2= ':' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ( (lv_attributes_5_0= ruleAttribute ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rules_6_0= ruleRule ) ) )+ ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getModelAccess().getUnorderedGroup());
            	
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:86:2: ( ( ({...}? => ( ({...}? => (otherlv_1= 'model' otherlv_2= ':' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ( (lv_attributes_5_0= ruleAttribute ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rules_6_0= ruleRule ) ) )+ ) ) )+ {...}?)
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:87:3: ( ({...}? => ( ({...}? => (otherlv_1= 'model' otherlv_2= ':' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ( (lv_attributes_5_0= ruleAttribute ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rules_6_0= ruleRule ) ) )+ ) ) )+ {...}?
            {
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:87:3: ( ({...}? => ( ({...}? => (otherlv_1= 'model' otherlv_2= ':' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ( (lv_attributes_5_0= ruleAttribute ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rules_6_0= ruleRule ) ) )+ ) ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( LA3_0 ==11 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 0) ) {
                    alt3=1;
                }
                else if ( LA3_0 ==18 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:89:4: ({...}? => ( ({...}? => (otherlv_1= 'model' otherlv_2= ':' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ( (lv_attributes_5_0= ruleAttribute ) )* ) ) ) )
            	    {
            	    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:89:4: ({...}? => ( ({...}? => (otherlv_1= 'model' otherlv_2= ':' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ( (lv_attributes_5_0= ruleAttribute ) )* ) ) ) )
            	    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:90:5: {...}? => ( ({...}? => (otherlv_1= 'model' otherlv_2= ':' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ( (lv_attributes_5_0= ruleAttribute ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 0)");
            	    }
            	    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:90:100: ( ({...}? => (otherlv_1= 'model' otherlv_2= ':' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ( (lv_attributes_5_0= ruleAttribute ) )* ) ) )
            	    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:91:6: ({...}? => (otherlv_1= 'model' otherlv_2= ':' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ( (lv_attributes_5_0= ruleAttribute ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup(), 0);
            	    	 				
            	    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:94:6: ({...}? => (otherlv_1= 'model' otherlv_2= ':' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ( (lv_attributes_5_0= ruleAttribute ) )* ) )
            	    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:94:7: {...}? => (otherlv_1= 'model' otherlv_2= ':' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ( (lv_attributes_5_0= ruleAttribute ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleModel", "true");
            	    }
            	    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:94:16: (otherlv_1= 'model' otherlv_2= ':' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ( (lv_attributes_5_0= ruleAttribute ) )* )
            	    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:94:18: otherlv_1= 'model' otherlv_2= ':' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ( (lv_attributes_5_0= ruleAttribute ) )*
            	    {
            	    otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleModel167); 

            	        	newLeafNode(otherlv_1, grammarAccess.getModelAccess().getModelKeyword_0_0());
            	        
            	    otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleModel179); 

            	        	newLeafNode(otherlv_2, grammarAccess.getModelAccess().getColonKeyword_0_1());
            	        
            	    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:102:1: ( (lv_name_3_0= RULE_ID ) )
            	    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:103:1: (lv_name_3_0= RULE_ID )
            	    {
            	    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:103:1: (lv_name_3_0= RULE_ID )
            	    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:104:3: lv_name_3_0= RULE_ID
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

            	    otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleModel213); 

            	        	newLeafNode(otherlv_4, grammarAccess.getModelAccess().getSemicolonKeyword_0_3());
            	        
            	    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:124:1: ( (lv_attributes_5_0= ruleAttribute ) )*
            	    loop1:
            	    do {
            	        int alt1=2;
            	        int LA1_0 = input.LA(1);

            	        if ( (LA1_0==14) ) {
            	            alt1=1;
            	        }


            	        switch (alt1) {
            	    	case 1 :
            	    	    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:125:1: (lv_attributes_5_0= ruleAttribute )
            	    	    {
            	    	    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:125:1: (lv_attributes_5_0= ruleAttribute )
            	    	    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:126:3: lv_attributes_5_0= ruleAttribute
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
            	    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:149:4: ({...}? => ( ({...}? => ( (lv_rules_6_0= ruleRule ) ) )+ ) )
            	    {
            	    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:149:4: ({...}? => ( ({...}? => ( (lv_rules_6_0= ruleRule ) ) )+ ) )
            	    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:150:5: {...}? => ( ({...}? => ( (lv_rules_6_0= ruleRule ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1)");
            	    }
            	    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:150:100: ( ({...}? => ( (lv_rules_6_0= ruleRule ) ) )+ )
            	    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:151:6: ({...}? => ( (lv_rules_6_0= ruleRule ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup(), 1);
            	    	 				
            	    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:154:6: ({...}? => ( (lv_rules_6_0= ruleRule ) ) )+
            	    int cnt2=0;
            	    loop2:
            	    do {
            	        int alt2=2;
            	        int LA2_0 = input.LA(1);

            	        if ( (LA2_0==18) ) {
            	            int LA2_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt2=1;
            	            }


            	        }


            	        switch (alt2) {
            	    	case 1 :
            	    	    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:154:7: {...}? => ( (lv_rules_6_0= ruleRule ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleModel", "true");
            	    	    }
            	    	    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:154:16: ( (lv_rules_6_0= ruleRule ) )
            	    	    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:155:1: (lv_rules_6_0= ruleRule )
            	    	    {
            	    	    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:155:1: (lv_rules_6_0= ruleRule )
            	    	    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:156:3: lv_rules_6_0= ruleRule
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
    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:195:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:196:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:197:2: iv_ruleAttribute= ruleAttribute EOF
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
    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:204:1: ruleAttribute returns [EObject current=null] : (otherlv_0= 'attr' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' otherlv_4= ':' ( ( ruleQualifiedName ) ) otherlv_6= '}' ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:207:28: ( (otherlv_0= 'attr' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' otherlv_4= ':' ( ( ruleQualifiedName ) ) otherlv_6= '}' ) )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:208:1: (otherlv_0= 'attr' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' otherlv_4= ':' ( ( ruleQualifiedName ) ) otherlv_6= '}' )
            {
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:208:1: (otherlv_0= 'attr' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' otherlv_4= ':' ( ( ruleQualifiedName ) ) otherlv_6= '}' )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:208:3: otherlv_0= 'attr' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' otherlv_4= ':' ( ( ruleQualifiedName ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleAttribute440); 

                	newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttrKeyword_0());
                
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:212:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:213:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:213:1: (lv_name_1_0= RULE_ID )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:214:3: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleAttribute474); 

                	newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleAttribute486); 

                	newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getTypeKeyword_3());
                
            otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleAttribute498); 

                	newLeafNode(otherlv_4, grammarAccess.getAttributeAccess().getColonKeyword_4());
                
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:242:1: ( ( ruleQualifiedName ) )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:243:1: ( ruleQualifiedName )
            {
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:243:1: ( ruleQualifiedName )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:244:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getTypeJvmTypeCrossReference_5_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleAttribute521);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleAttribute533); 

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
    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:269:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:270:2: (iv_ruleRule= ruleRule EOF )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:271:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_ruleRule_in_entryRuleRule569);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRule579); 

            }

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
    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:278:1: ruleRule returns [EObject current=null] : this_RulePosition_0= ruleRulePosition ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        EObject this_RulePosition_0 = null;


         enterRule(); 
            
        try {
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:281:28: (this_RulePosition_0= ruleRulePosition )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:283:5: this_RulePosition_0= ruleRulePosition
            {
             
                    newCompositeNode(grammarAccess.getRuleAccess().getRulePositionParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleRulePosition_in_ruleRule625);
            this_RulePosition_0=ruleRulePosition();

            state._fsp--;

             
                    current = this_RulePosition_0; 
                    afterParserOrEnumRuleCall();
                

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


    // $ANTLR start "entryRuleRulePosition"
    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:299:1: entryRuleRulePosition returns [EObject current=null] : iv_ruleRulePosition= ruleRulePosition EOF ;
    public final EObject entryRuleRulePosition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRulePosition = null;


        try {
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:300:2: (iv_ruleRulePosition= ruleRulePosition EOF )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:301:2: iv_ruleRulePosition= ruleRulePosition EOF
            {
             newCompositeNode(grammarAccess.getRulePositionRule()); 
            pushFollow(FOLLOW_ruleRulePosition_in_entryRuleRulePosition659);
            iv_ruleRulePosition=ruleRulePosition();

            state._fsp--;

             current =iv_ruleRulePosition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRulePosition669); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRulePosition"


    // $ANTLR start "ruleRulePosition"
    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:308:1: ruleRulePosition returns [EObject current=null] : (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= 'start' ( (lv_startIndex_4_0= RULE_INT ) ) otherlv_5= ',' ) | (otherlv_6= 'start' ( (lv_startDelimeter_7_0= RULE_STRING ) ) otherlv_8= ',' ) ) ( (otherlv_9= 'end' ( (lv_endIndex_10_0= RULE_INT ) ) otherlv_11= ',' ) | (otherlv_12= 'end' ( (lv_endDelimeter_13_0= RULE_STRING ) ) otherlv_14= ',' ) ) otherlv_15= 'attr' otherlv_16= ':' ( (otherlv_17= RULE_ID ) ) otherlv_18= '}' ) ;
    public final EObject ruleRulePosition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_startIndex_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_startDelimeter_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_endIndex_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_endDelimeter_13_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;

         enterRule(); 
            
        try {
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:311:28: ( (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= 'start' ( (lv_startIndex_4_0= RULE_INT ) ) otherlv_5= ',' ) | (otherlv_6= 'start' ( (lv_startDelimeter_7_0= RULE_STRING ) ) otherlv_8= ',' ) ) ( (otherlv_9= 'end' ( (lv_endIndex_10_0= RULE_INT ) ) otherlv_11= ',' ) | (otherlv_12= 'end' ( (lv_endDelimeter_13_0= RULE_STRING ) ) otherlv_14= ',' ) ) otherlv_15= 'attr' otherlv_16= ':' ( (otherlv_17= RULE_ID ) ) otherlv_18= '}' ) )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:312:1: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= 'start' ( (lv_startIndex_4_0= RULE_INT ) ) otherlv_5= ',' ) | (otherlv_6= 'start' ( (lv_startDelimeter_7_0= RULE_STRING ) ) otherlv_8= ',' ) ) ( (otherlv_9= 'end' ( (lv_endIndex_10_0= RULE_INT ) ) otherlv_11= ',' ) | (otherlv_12= 'end' ( (lv_endDelimeter_13_0= RULE_STRING ) ) otherlv_14= ',' ) ) otherlv_15= 'attr' otherlv_16= ':' ( (otherlv_17= RULE_ID ) ) otherlv_18= '}' )
            {
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:312:1: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= 'start' ( (lv_startIndex_4_0= RULE_INT ) ) otherlv_5= ',' ) | (otherlv_6= 'start' ( (lv_startDelimeter_7_0= RULE_STRING ) ) otherlv_8= ',' ) ) ( (otherlv_9= 'end' ( (lv_endIndex_10_0= RULE_INT ) ) otherlv_11= ',' ) | (otherlv_12= 'end' ( (lv_endDelimeter_13_0= RULE_STRING ) ) otherlv_14= ',' ) ) otherlv_15= 'attr' otherlv_16= ':' ( (otherlv_17= RULE_ID ) ) otherlv_18= '}' )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:312:3: otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= 'start' ( (lv_startIndex_4_0= RULE_INT ) ) otherlv_5= ',' ) | (otherlv_6= 'start' ( (lv_startDelimeter_7_0= RULE_STRING ) ) otherlv_8= ',' ) ) ( (otherlv_9= 'end' ( (lv_endIndex_10_0= RULE_INT ) ) otherlv_11= ',' ) | (otherlv_12= 'end' ( (lv_endDelimeter_13_0= RULE_STRING ) ) otherlv_14= ',' ) ) otherlv_15= 'attr' otherlv_16= ':' ( (otherlv_17= RULE_ID ) ) otherlv_18= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleRulePosition706); 

                	newLeafNode(otherlv_0, grammarAccess.getRulePositionAccess().getRuleKeyword_0());
                
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:316:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:317:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:317:1: (lv_name_1_0= RULE_ID )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:318:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRulePosition723); 

            			newLeafNode(lv_name_1_0, grammarAccess.getRulePositionAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRulePositionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleRulePosition740); 

                	newLeafNode(otherlv_2, grammarAccess.getRulePositionAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:338:1: ( (otherlv_3= 'start' ( (lv_startIndex_4_0= RULE_INT ) ) otherlv_5= ',' ) | (otherlv_6= 'start' ( (lv_startDelimeter_7_0= RULE_STRING ) ) otherlv_8= ',' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==RULE_INT) ) {
                    alt4=1;
                }
                else if ( (LA4_1==RULE_STRING) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:338:2: (otherlv_3= 'start' ( (lv_startIndex_4_0= RULE_INT ) ) otherlv_5= ',' )
                    {
                    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:338:2: (otherlv_3= 'start' ( (lv_startIndex_4_0= RULE_INT ) ) otherlv_5= ',' )
                    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:338:4: otherlv_3= 'start' ( (lv_startIndex_4_0= RULE_INT ) ) otherlv_5= ','
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleRulePosition754); 

                        	newLeafNode(otherlv_3, grammarAccess.getRulePositionAccess().getStartKeyword_3_0_0());
                        
                    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:342:1: ( (lv_startIndex_4_0= RULE_INT ) )
                    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:343:1: (lv_startIndex_4_0= RULE_INT )
                    {
                    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:343:1: (lv_startIndex_4_0= RULE_INT )
                    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:344:3: lv_startIndex_4_0= RULE_INT
                    {
                    lv_startIndex_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRulePosition771); 

                    			newLeafNode(lv_startIndex_4_0, grammarAccess.getRulePositionAccess().getStartIndexINTTerminalRuleCall_3_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRulePositionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"startIndex",
                            		lv_startIndex_4_0, 
                            		"INT");
                    	    

                    }


                    }

                    otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleRulePosition788); 

                        	newLeafNode(otherlv_5, grammarAccess.getRulePositionAccess().getCommaKeyword_3_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:365:6: (otherlv_6= 'start' ( (lv_startDelimeter_7_0= RULE_STRING ) ) otherlv_8= ',' )
                    {
                    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:365:6: (otherlv_6= 'start' ( (lv_startDelimeter_7_0= RULE_STRING ) ) otherlv_8= ',' )
                    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:365:8: otherlv_6= 'start' ( (lv_startDelimeter_7_0= RULE_STRING ) ) otherlv_8= ','
                    {
                    otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleRulePosition808); 

                        	newLeafNode(otherlv_6, grammarAccess.getRulePositionAccess().getStartKeyword_3_1_0());
                        
                    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:369:1: ( (lv_startDelimeter_7_0= RULE_STRING ) )
                    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:370:1: (lv_startDelimeter_7_0= RULE_STRING )
                    {
                    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:370:1: (lv_startDelimeter_7_0= RULE_STRING )
                    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:371:3: lv_startDelimeter_7_0= RULE_STRING
                    {
                    lv_startDelimeter_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRulePosition825); 

                    			newLeafNode(lv_startDelimeter_7_0, grammarAccess.getRulePositionAccess().getStartDelimeterSTRINGTerminalRuleCall_3_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRulePositionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"startDelimeter",
                            		lv_startDelimeter_7_0, 
                            		"STRING");
                    	    

                    }


                    }

                    otherlv_8=(Token)match(input,20,FOLLOW_20_in_ruleRulePosition842); 

                        	newLeafNode(otherlv_8, grammarAccess.getRulePositionAccess().getCommaKeyword_3_1_2());
                        

                    }


                    }
                    break;

            }

            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:391:3: ( (otherlv_9= 'end' ( (lv_endIndex_10_0= RULE_INT ) ) otherlv_11= ',' ) | (otherlv_12= 'end' ( (lv_endDelimeter_13_0= RULE_STRING ) ) otherlv_14= ',' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==RULE_INT) ) {
                    alt5=1;
                }
                else if ( (LA5_1==RULE_STRING) ) {
                    alt5=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:391:4: (otherlv_9= 'end' ( (lv_endIndex_10_0= RULE_INT ) ) otherlv_11= ',' )
                    {
                    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:391:4: (otherlv_9= 'end' ( (lv_endIndex_10_0= RULE_INT ) ) otherlv_11= ',' )
                    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:391:6: otherlv_9= 'end' ( (lv_endIndex_10_0= RULE_INT ) ) otherlv_11= ','
                    {
                    otherlv_9=(Token)match(input,21,FOLLOW_21_in_ruleRulePosition858); 

                        	newLeafNode(otherlv_9, grammarAccess.getRulePositionAccess().getEndKeyword_4_0_0());
                        
                    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:395:1: ( (lv_endIndex_10_0= RULE_INT ) )
                    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:396:1: (lv_endIndex_10_0= RULE_INT )
                    {
                    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:396:1: (lv_endIndex_10_0= RULE_INT )
                    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:397:3: lv_endIndex_10_0= RULE_INT
                    {
                    lv_endIndex_10_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRulePosition875); 

                    			newLeafNode(lv_endIndex_10_0, grammarAccess.getRulePositionAccess().getEndIndexINTTerminalRuleCall_4_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRulePositionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"endIndex",
                            		lv_endIndex_10_0, 
                            		"INT");
                    	    

                    }


                    }

                    otherlv_11=(Token)match(input,20,FOLLOW_20_in_ruleRulePosition892); 

                        	newLeafNode(otherlv_11, grammarAccess.getRulePositionAccess().getCommaKeyword_4_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:418:6: (otherlv_12= 'end' ( (lv_endDelimeter_13_0= RULE_STRING ) ) otherlv_14= ',' )
                    {
                    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:418:6: (otherlv_12= 'end' ( (lv_endDelimeter_13_0= RULE_STRING ) ) otherlv_14= ',' )
                    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:418:8: otherlv_12= 'end' ( (lv_endDelimeter_13_0= RULE_STRING ) ) otherlv_14= ','
                    {
                    otherlv_12=(Token)match(input,21,FOLLOW_21_in_ruleRulePosition912); 

                        	newLeafNode(otherlv_12, grammarAccess.getRulePositionAccess().getEndKeyword_4_1_0());
                        
                    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:422:1: ( (lv_endDelimeter_13_0= RULE_STRING ) )
                    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:423:1: (lv_endDelimeter_13_0= RULE_STRING )
                    {
                    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:423:1: (lv_endDelimeter_13_0= RULE_STRING )
                    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:424:3: lv_endDelimeter_13_0= RULE_STRING
                    {
                    lv_endDelimeter_13_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRulePosition929); 

                    			newLeafNode(lv_endDelimeter_13_0, grammarAccess.getRulePositionAccess().getEndDelimeterSTRINGTerminalRuleCall_4_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRulePositionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"endDelimeter",
                            		lv_endDelimeter_13_0, 
                            		"STRING");
                    	    

                    }


                    }

                    otherlv_14=(Token)match(input,20,FOLLOW_20_in_ruleRulePosition946); 

                        	newLeafNode(otherlv_14, grammarAccess.getRulePositionAccess().getCommaKeyword_4_1_2());
                        

                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,14,FOLLOW_14_in_ruleRulePosition960); 

                	newLeafNode(otherlv_15, grammarAccess.getRulePositionAccess().getAttrKeyword_5());
                
            otherlv_16=(Token)match(input,12,FOLLOW_12_in_ruleRulePosition972); 

                	newLeafNode(otherlv_16, grammarAccess.getRulePositionAccess().getColonKeyword_6());
                
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:452:1: ( (otherlv_17= RULE_ID ) )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:453:1: (otherlv_17= RULE_ID )
            {
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:453:1: (otherlv_17= RULE_ID )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:454:3: otherlv_17= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRulePositionRule());
            	        }
                    
            otherlv_17=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRulePosition992); 

            		newLeafNode(otherlv_17, grammarAccess.getRulePositionAccess().getAttrAttributeCrossReference_7_0()); 
            	

            }


            }

            otherlv_18=(Token)match(input,17,FOLLOW_17_in_ruleRulePosition1004); 

                	newLeafNode(otherlv_18, grammarAccess.getRulePositionAccess().getRightCurlyBracketKeyword_8());
                

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
    // $ANTLR end "ruleRulePosition"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:477:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:478:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:479:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1041);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1052); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:486:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:489:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:490:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:490:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:490:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1092); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:497:1: (kw= '.' this_ID_2= RULE_ID )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==22) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.yazgel.regex.s2m/src-gen/org/yazgel/regex/s2m/parser/antlr/internal/InternalS2M.g:498:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,22,FOLLOW_22_in_ruleQualifiedName1111); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1126); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop6;
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
    // $ANTLR end "ruleQualifiedName"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleModel167 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleModel179 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleModel196 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleModel213 = new BitSet(new long[]{0x0000000000044802L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleModel234 = new BitSet(new long[]{0x0000000000044802L});
    public static final BitSet FOLLOW_ruleRule_in_ruleModel311 = new BitSet(new long[]{0x0000000000044802L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute393 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleAttribute440 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute457 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleAttribute474 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleAttribute486 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAttribute498 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAttribute521 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleAttribute533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_entryRuleRule569 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRule579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRulePosition_in_ruleRule625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRulePosition_in_entryRuleRulePosition659 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRulePosition669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleRulePosition706 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRulePosition723 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleRulePosition740 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleRulePosition754 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRulePosition771 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleRulePosition788 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_19_in_ruleRulePosition808 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRulePosition825 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleRulePosition842 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleRulePosition858 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRulePosition875 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleRulePosition892 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_21_in_ruleRulePosition912 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRulePosition929 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleRulePosition946 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleRulePosition960 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleRulePosition972 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRulePosition992 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleRulePosition1004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1041 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1092 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleQualifiedName1111 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1126 = new BitSet(new long[]{0x0000000000400002L});

}
