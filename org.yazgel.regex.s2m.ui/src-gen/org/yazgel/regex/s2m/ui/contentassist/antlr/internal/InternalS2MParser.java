package org.yazgel.regex.s2m.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.yazgel.regex.s2m.services.S2MGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalS2MParser extends AbstractInternalContentAssistParser {
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
    public String getGrammarFileName() { return "../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g"; }


     
     	private S2MGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(S2MGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleModel"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:61:1: ( ruleModel EOF )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:62:1: ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:69:1: ruleModel : ( ( rule__Model__UnorderedGroup ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:73:2: ( ( ( rule__Model__UnorderedGroup ) ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:74:1: ( ( rule__Model__UnorderedGroup ) )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:74:1: ( ( rule__Model__UnorderedGroup ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:75:1: ( rule__Model__UnorderedGroup )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getUnorderedGroup()); 
            }
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:76:1: ( rule__Model__UnorderedGroup )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:76:2: rule__Model__UnorderedGroup
            {
            pushFollow(FOLLOW_rule__Model__UnorderedGroup_in_ruleModel94);
            rule__Model__UnorderedGroup();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getUnorderedGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleAttribute"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:88:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:89:1: ( ruleAttribute EOF )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:90:1: ruleAttribute EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute121);
            ruleAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute128); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:97:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:101:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:102:1: ( ( rule__Attribute__Group__0 ) )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:102:1: ( ( rule__Attribute__Group__0 ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:103:1: ( rule__Attribute__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getGroup()); 
            }
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:104:1: ( rule__Attribute__Group__0 )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:104:2: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0_in_ruleAttribute154);
            rule__Attribute__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleRule"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:116:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:117:1: ( ruleRule EOF )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:118:1: ruleRule EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleRule()); 
            }
            pushFollow(FOLLOW_ruleRule_in_entryRuleRule181);
            ruleRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRule188); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:125:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:129:2: ( ( ( rule__Rule__Group__0 ) ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:130:1: ( ( rule__Rule__Group__0 ) )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:130:1: ( ( rule__Rule__Group__0 ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:131:1: ( rule__Rule__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getGroup()); 
            }
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:132:1: ( rule__Rule__Group__0 )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:132:2: rule__Rule__Group__0
            {
            pushFollow(FOLLOW_rule__Rule__Group__0_in_ruleRule214);
            rule__Rule__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:144:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:145:1: ( ruleQualifiedName EOF )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:146:1: ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName241);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName248); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:153:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:157:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:158:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:158:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:159:1: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:160:1: ( rule__QualifiedName__Group__0 )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:160:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName274);
            rule__QualifiedName__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "rule__Rule__Alternatives_3"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:172:1: rule__Rule__Alternatives_3 : ( ( ( rule__Rule__Group_3_0__0 ) ) | ( ( rule__Rule__Group_3_1__0 ) ) );
    public final void rule__Rule__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:176:1: ( ( ( rule__Rule__Group_3_0__0 ) ) | ( ( rule__Rule__Group_3_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==19) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==RULE_INT) ) {
                    alt1=1;
                }
                else if ( (LA1_1==RULE_STRING) ) {
                    alt1=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:177:1: ( ( rule__Rule__Group_3_0__0 ) )
                    {
                    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:177:1: ( ( rule__Rule__Group_3_0__0 ) )
                    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:178:1: ( rule__Rule__Group_3_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRuleAccess().getGroup_3_0()); 
                    }
                    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:179:1: ( rule__Rule__Group_3_0__0 )
                    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:179:2: rule__Rule__Group_3_0__0
                    {
                    pushFollow(FOLLOW_rule__Rule__Group_3_0__0_in_rule__Rule__Alternatives_3310);
                    rule__Rule__Group_3_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRuleAccess().getGroup_3_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:183:6: ( ( rule__Rule__Group_3_1__0 ) )
                    {
                    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:183:6: ( ( rule__Rule__Group_3_1__0 ) )
                    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:184:1: ( rule__Rule__Group_3_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRuleAccess().getGroup_3_1()); 
                    }
                    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:185:1: ( rule__Rule__Group_3_1__0 )
                    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:185:2: rule__Rule__Group_3_1__0
                    {
                    pushFollow(FOLLOW_rule__Rule__Group_3_1__0_in_rule__Rule__Alternatives_3328);
                    rule__Rule__Group_3_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRuleAccess().getGroup_3_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Alternatives_3"


    // $ANTLR start "rule__Rule__Alternatives_4"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:194:1: rule__Rule__Alternatives_4 : ( ( ( rule__Rule__Group_4_0__0 ) ) | ( ( rule__Rule__Group_4_1__0 ) ) );
    public final void rule__Rule__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:198:1: ( ( ( rule__Rule__Group_4_0__0 ) ) | ( ( rule__Rule__Group_4_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==21) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==RULE_STRING) ) {
                    alt2=2;
                }
                else if ( (LA2_1==RULE_INT) ) {
                    alt2=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:199:1: ( ( rule__Rule__Group_4_0__0 ) )
                    {
                    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:199:1: ( ( rule__Rule__Group_4_0__0 ) )
                    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:200:1: ( rule__Rule__Group_4_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRuleAccess().getGroup_4_0()); 
                    }
                    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:201:1: ( rule__Rule__Group_4_0__0 )
                    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:201:2: rule__Rule__Group_4_0__0
                    {
                    pushFollow(FOLLOW_rule__Rule__Group_4_0__0_in_rule__Rule__Alternatives_4361);
                    rule__Rule__Group_4_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRuleAccess().getGroup_4_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:205:6: ( ( rule__Rule__Group_4_1__0 ) )
                    {
                    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:205:6: ( ( rule__Rule__Group_4_1__0 ) )
                    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:206:1: ( rule__Rule__Group_4_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRuleAccess().getGroup_4_1()); 
                    }
                    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:207:1: ( rule__Rule__Group_4_1__0 )
                    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:207:2: rule__Rule__Group_4_1__0
                    {
                    pushFollow(FOLLOW_rule__Rule__Group_4_1__0_in_rule__Rule__Alternatives_4379);
                    rule__Rule__Group_4_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRuleAccess().getGroup_4_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Alternatives_4"


    // $ANTLR start "rule__Model__Group_0__0"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:218:1: rule__Model__Group_0__0 : rule__Model__Group_0__0__Impl rule__Model__Group_0__1 ;
    public final void rule__Model__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:222:1: ( rule__Model__Group_0__0__Impl rule__Model__Group_0__1 )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:223:2: rule__Model__Group_0__0__Impl rule__Model__Group_0__1
            {
            pushFollow(FOLLOW_rule__Model__Group_0__0__Impl_in_rule__Model__Group_0__0410);
            rule__Model__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group_0__1_in_rule__Model__Group_0__0413);
            rule__Model__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_0__0"


    // $ANTLR start "rule__Model__Group_0__0__Impl"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:230:1: rule__Model__Group_0__0__Impl : ( 'model' ) ;
    public final void rule__Model__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:234:1: ( ( 'model' ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:235:1: ( 'model' )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:235:1: ( 'model' )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:236:1: 'model'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getModelKeyword_0_0()); 
            }
            match(input,11,FOLLOW_11_in_rule__Model__Group_0__0__Impl441); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getModelKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_0__0__Impl"


    // $ANTLR start "rule__Model__Group_0__1"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:249:1: rule__Model__Group_0__1 : rule__Model__Group_0__1__Impl rule__Model__Group_0__2 ;
    public final void rule__Model__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:253:1: ( rule__Model__Group_0__1__Impl rule__Model__Group_0__2 )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:254:2: rule__Model__Group_0__1__Impl rule__Model__Group_0__2
            {
            pushFollow(FOLLOW_rule__Model__Group_0__1__Impl_in_rule__Model__Group_0__1472);
            rule__Model__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group_0__2_in_rule__Model__Group_0__1475);
            rule__Model__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_0__1"


    // $ANTLR start "rule__Model__Group_0__1__Impl"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:261:1: rule__Model__Group_0__1__Impl : ( ':' ) ;
    public final void rule__Model__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:265:1: ( ( ':' ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:266:1: ( ':' )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:266:1: ( ':' )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:267:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getColonKeyword_0_1()); 
            }
            match(input,12,FOLLOW_12_in_rule__Model__Group_0__1__Impl503); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getColonKeyword_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_0__1__Impl"


    // $ANTLR start "rule__Model__Group_0__2"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:280:1: rule__Model__Group_0__2 : rule__Model__Group_0__2__Impl rule__Model__Group_0__3 ;
    public final void rule__Model__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:284:1: ( rule__Model__Group_0__2__Impl rule__Model__Group_0__3 )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:285:2: rule__Model__Group_0__2__Impl rule__Model__Group_0__3
            {
            pushFollow(FOLLOW_rule__Model__Group_0__2__Impl_in_rule__Model__Group_0__2534);
            rule__Model__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group_0__3_in_rule__Model__Group_0__2537);
            rule__Model__Group_0__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_0__2"


    // $ANTLR start "rule__Model__Group_0__2__Impl"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:292:1: rule__Model__Group_0__2__Impl : ( ( rule__Model__NameAssignment_0_2 ) ) ;
    public final void rule__Model__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:296:1: ( ( ( rule__Model__NameAssignment_0_2 ) ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:297:1: ( ( rule__Model__NameAssignment_0_2 ) )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:297:1: ( ( rule__Model__NameAssignment_0_2 ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:298:1: ( rule__Model__NameAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getNameAssignment_0_2()); 
            }
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:299:1: ( rule__Model__NameAssignment_0_2 )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:299:2: rule__Model__NameAssignment_0_2
            {
            pushFollow(FOLLOW_rule__Model__NameAssignment_0_2_in_rule__Model__Group_0__2__Impl564);
            rule__Model__NameAssignment_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getNameAssignment_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_0__2__Impl"


    // $ANTLR start "rule__Model__Group_0__3"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:309:1: rule__Model__Group_0__3 : rule__Model__Group_0__3__Impl rule__Model__Group_0__4 ;
    public final void rule__Model__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:313:1: ( rule__Model__Group_0__3__Impl rule__Model__Group_0__4 )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:314:2: rule__Model__Group_0__3__Impl rule__Model__Group_0__4
            {
            pushFollow(FOLLOW_rule__Model__Group_0__3__Impl_in_rule__Model__Group_0__3594);
            rule__Model__Group_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group_0__4_in_rule__Model__Group_0__3597);
            rule__Model__Group_0__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_0__3"


    // $ANTLR start "rule__Model__Group_0__3__Impl"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:321:1: rule__Model__Group_0__3__Impl : ( ';' ) ;
    public final void rule__Model__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:325:1: ( ( ';' ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:326:1: ( ';' )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:326:1: ( ';' )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:327:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getSemicolonKeyword_0_3()); 
            }
            match(input,13,FOLLOW_13_in_rule__Model__Group_0__3__Impl625); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getSemicolonKeyword_0_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_0__3__Impl"


    // $ANTLR start "rule__Model__Group_0__4"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:340:1: rule__Model__Group_0__4 : rule__Model__Group_0__4__Impl ;
    public final void rule__Model__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:344:1: ( rule__Model__Group_0__4__Impl )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:345:2: rule__Model__Group_0__4__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group_0__4__Impl_in_rule__Model__Group_0__4656);
            rule__Model__Group_0__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_0__4"


    // $ANTLR start "rule__Model__Group_0__4__Impl"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:351:1: rule__Model__Group_0__4__Impl : ( ( rule__Model__AttributesAssignment_0_4 )* ) ;
    public final void rule__Model__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:355:1: ( ( ( rule__Model__AttributesAssignment_0_4 )* ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:356:1: ( ( rule__Model__AttributesAssignment_0_4 )* )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:356:1: ( ( rule__Model__AttributesAssignment_0_4 )* )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:357:1: ( rule__Model__AttributesAssignment_0_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getAttributesAssignment_0_4()); 
            }
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:358:1: ( rule__Model__AttributesAssignment_0_4 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:358:2: rule__Model__AttributesAssignment_0_4
            	    {
            	    pushFollow(FOLLOW_rule__Model__AttributesAssignment_0_4_in_rule__Model__Group_0__4__Impl683);
            	    rule__Model__AttributesAssignment_0_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getAttributesAssignment_0_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_0__4__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:378:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:382:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:383:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__0724);
            rule__Attribute__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__0727);
            rule__Attribute__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:390:1: rule__Attribute__Group__0__Impl : ( 'attr' ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:394:1: ( ( 'attr' ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:395:1: ( 'attr' )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:395:1: ( 'attr' )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:396:1: 'attr'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getAttrKeyword_0()); 
            }
            match(input,14,FOLLOW_14_in_rule__Attribute__Group__0__Impl755); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getAttrKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:409:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:413:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:414:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__1786);
            rule__Attribute__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__1789);
            rule__Attribute__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:421:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:425:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:426:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:426:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:427:1: ( rule__Attribute__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            }
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:428:1: ( rule__Attribute__NameAssignment_1 )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:428:2: rule__Attribute__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Attribute__NameAssignment_1_in_rule__Attribute__Group__1__Impl816);
            rule__Attribute__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:438:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:442:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:443:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__2846);
            rule__Attribute__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Attribute__Group__3_in_rule__Attribute__Group__2849);
            rule__Attribute__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:450:1: rule__Attribute__Group__2__Impl : ( '{' ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:454:1: ( ( '{' ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:455:1: ( '{' )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:455:1: ( '{' )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:456:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,15,FOLLOW_15_in_rule__Attribute__Group__2__Impl877); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__Attribute__Group__3"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:469:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:473:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:474:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
            {
            pushFollow(FOLLOW_rule__Attribute__Group__3__Impl_in_rule__Attribute__Group__3908);
            rule__Attribute__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Attribute__Group__4_in_rule__Attribute__Group__3911);
            rule__Attribute__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__3"


    // $ANTLR start "rule__Attribute__Group__3__Impl"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:481:1: rule__Attribute__Group__3__Impl : ( 'type' ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:485:1: ( ( 'type' ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:486:1: ( 'type' )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:486:1: ( 'type' )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:487:1: 'type'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getTypeKeyword_3()); 
            }
            match(input,16,FOLLOW_16_in_rule__Attribute__Group__3__Impl939); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getTypeKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__3__Impl"


    // $ANTLR start "rule__Attribute__Group__4"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:500:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl rule__Attribute__Group__5 ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:504:1: ( rule__Attribute__Group__4__Impl rule__Attribute__Group__5 )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:505:2: rule__Attribute__Group__4__Impl rule__Attribute__Group__5
            {
            pushFollow(FOLLOW_rule__Attribute__Group__4__Impl_in_rule__Attribute__Group__4970);
            rule__Attribute__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Attribute__Group__5_in_rule__Attribute__Group__4973);
            rule__Attribute__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__4"


    // $ANTLR start "rule__Attribute__Group__4__Impl"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:512:1: rule__Attribute__Group__4__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:516:1: ( ( ':' ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:517:1: ( ':' )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:517:1: ( ':' )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:518:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getColonKeyword_4()); 
            }
            match(input,12,FOLLOW_12_in_rule__Attribute__Group__4__Impl1001); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getColonKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__4__Impl"


    // $ANTLR start "rule__Attribute__Group__5"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:531:1: rule__Attribute__Group__5 : rule__Attribute__Group__5__Impl rule__Attribute__Group__6 ;
    public final void rule__Attribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:535:1: ( rule__Attribute__Group__5__Impl rule__Attribute__Group__6 )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:536:2: rule__Attribute__Group__5__Impl rule__Attribute__Group__6
            {
            pushFollow(FOLLOW_rule__Attribute__Group__5__Impl_in_rule__Attribute__Group__51032);
            rule__Attribute__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Attribute__Group__6_in_rule__Attribute__Group__51035);
            rule__Attribute__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__5"


    // $ANTLR start "rule__Attribute__Group__5__Impl"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:543:1: rule__Attribute__Group__5__Impl : ( ( rule__Attribute__TypeAssignment_5 ) ) ;
    public final void rule__Attribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:547:1: ( ( ( rule__Attribute__TypeAssignment_5 ) ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:548:1: ( ( rule__Attribute__TypeAssignment_5 ) )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:548:1: ( ( rule__Attribute__TypeAssignment_5 ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:549:1: ( rule__Attribute__TypeAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getTypeAssignment_5()); 
            }
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:550:1: ( rule__Attribute__TypeAssignment_5 )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:550:2: rule__Attribute__TypeAssignment_5
            {
            pushFollow(FOLLOW_rule__Attribute__TypeAssignment_5_in_rule__Attribute__Group__5__Impl1062);
            rule__Attribute__TypeAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getTypeAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__5__Impl"


    // $ANTLR start "rule__Attribute__Group__6"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:560:1: rule__Attribute__Group__6 : rule__Attribute__Group__6__Impl ;
    public final void rule__Attribute__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:564:1: ( rule__Attribute__Group__6__Impl )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:565:2: rule__Attribute__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group__6__Impl_in_rule__Attribute__Group__61092);
            rule__Attribute__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__6"


    // $ANTLR start "rule__Attribute__Group__6__Impl"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:571:1: rule__Attribute__Group__6__Impl : ( '}' ) ;
    public final void rule__Attribute__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:575:1: ( ( '}' ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:576:1: ( '}' )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:576:1: ( '}' )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:577:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_6()); 
            }
            match(input,17,FOLLOW_17_in_rule__Attribute__Group__6__Impl1120); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__6__Impl"


    // $ANTLR start "rule__Rule__Group__0"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:604:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:608:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:609:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__01165);
            rule__Rule__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__01168);
            rule__Rule__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0"


    // $ANTLR start "rule__Rule__Group__0__Impl"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:616:1: rule__Rule__Group__0__Impl : ( 'rule' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:620:1: ( ( 'rule' ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:621:1: ( 'rule' )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:621:1: ( 'rule' )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:622:1: 'rule'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getRuleKeyword_0()); 
            }
            match(input,18,FOLLOW_18_in_rule__Rule__Group__0__Impl1196); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getRuleKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0__Impl"


    // $ANTLR start "rule__Rule__Group__1"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:635:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:639:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:640:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__11227);
            rule__Rule__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Rule__Group__2_in_rule__Rule__Group__11230);
            rule__Rule__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1"


    // $ANTLR start "rule__Rule__Group__1__Impl"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:647:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__NameAssignment_1 ) ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:651:1: ( ( ( rule__Rule__NameAssignment_1 ) ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:652:1: ( ( rule__Rule__NameAssignment_1 ) )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:652:1: ( ( rule__Rule__NameAssignment_1 ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:653:1: ( rule__Rule__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getNameAssignment_1()); 
            }
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:654:1: ( rule__Rule__NameAssignment_1 )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:654:2: rule__Rule__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Rule__NameAssignment_1_in_rule__Rule__Group__1__Impl1257);
            rule__Rule__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1__Impl"


    // $ANTLR start "rule__Rule__Group__2"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:664:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:668:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:669:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_rule__Rule__Group__2__Impl_in_rule__Rule__Group__21287);
            rule__Rule__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Rule__Group__3_in_rule__Rule__Group__21290);
            rule__Rule__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2"


    // $ANTLR start "rule__Rule__Group__2__Impl"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:676:1: rule__Rule__Group__2__Impl : ( '{' ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:680:1: ( ( '{' ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:681:1: ( '{' )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:681:1: ( '{' )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:682:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,15,FOLLOW_15_in_rule__Rule__Group__2__Impl1318); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2__Impl"


    // $ANTLR start "rule__Rule__Group__3"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:695:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:699:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:700:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
            {
            pushFollow(FOLLOW_rule__Rule__Group__3__Impl_in_rule__Rule__Group__31349);
            rule__Rule__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Rule__Group__4_in_rule__Rule__Group__31352);
            rule__Rule__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__3"


    // $ANTLR start "rule__Rule__Group__3__Impl"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:707:1: rule__Rule__Group__3__Impl : ( ( rule__Rule__Alternatives_3 ) ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:711:1: ( ( ( rule__Rule__Alternatives_3 ) ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:712:1: ( ( rule__Rule__Alternatives_3 ) )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:712:1: ( ( rule__Rule__Alternatives_3 ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:713:1: ( rule__Rule__Alternatives_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getAlternatives_3()); 
            }
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:714:1: ( rule__Rule__Alternatives_3 )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:714:2: rule__Rule__Alternatives_3
            {
            pushFollow(FOLLOW_rule__Rule__Alternatives_3_in_rule__Rule__Group__3__Impl1379);
            rule__Rule__Alternatives_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getAlternatives_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__3__Impl"


    // $ANTLR start "rule__Rule__Group__4"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:724:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl rule__Rule__Group__5 ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:728:1: ( rule__Rule__Group__4__Impl rule__Rule__Group__5 )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:729:2: rule__Rule__Group__4__Impl rule__Rule__Group__5
            {
            pushFollow(FOLLOW_rule__Rule__Group__4__Impl_in_rule__Rule__Group__41409);
            rule__Rule__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Rule__Group__5_in_rule__Rule__Group__41412);
            rule__Rule__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__4"


    // $ANTLR start "rule__Rule__Group__4__Impl"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:736:1: rule__Rule__Group__4__Impl : ( ( rule__Rule__Alternatives_4 ) ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:740:1: ( ( ( rule__Rule__Alternatives_4 ) ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:741:1: ( ( rule__Rule__Alternatives_4 ) )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:741:1: ( ( rule__Rule__Alternatives_4 ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:742:1: ( rule__Rule__Alternatives_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getAlternatives_4()); 
            }
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:743:1: ( rule__Rule__Alternatives_4 )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:743:2: rule__Rule__Alternatives_4
            {
            pushFollow(FOLLOW_rule__Rule__Alternatives_4_in_rule__Rule__Group__4__Impl1439);
            rule__Rule__Alternatives_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getAlternatives_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__4__Impl"


    // $ANTLR start "rule__Rule__Group__5"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:753:1: rule__Rule__Group__5 : rule__Rule__Group__5__Impl rule__Rule__Group__6 ;
    public final void rule__Rule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:757:1: ( rule__Rule__Group__5__Impl rule__Rule__Group__6 )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:758:2: rule__Rule__Group__5__Impl rule__Rule__Group__6
            {
            pushFollow(FOLLOW_rule__Rule__Group__5__Impl_in_rule__Rule__Group__51469);
            rule__Rule__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Rule__Group__6_in_rule__Rule__Group__51472);
            rule__Rule__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__5"


    // $ANTLR start "rule__Rule__Group__5__Impl"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:765:1: rule__Rule__Group__5__Impl : ( 'attr' ) ;
    public final void rule__Rule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:769:1: ( ( 'attr' ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:770:1: ( 'attr' )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:770:1: ( 'attr' )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:771:1: 'attr'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getAttrKeyword_5()); 
            }
            match(input,14,FOLLOW_14_in_rule__Rule__Group__5__Impl1500); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getAttrKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__5__Impl"


    // $ANTLR start "rule__Rule__Group__6"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:784:1: rule__Rule__Group__6 : rule__Rule__Group__6__Impl rule__Rule__Group__7 ;
    public final void rule__Rule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:788:1: ( rule__Rule__Group__6__Impl rule__Rule__Group__7 )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:789:2: rule__Rule__Group__6__Impl rule__Rule__Group__7
            {
            pushFollow(FOLLOW_rule__Rule__Group__6__Impl_in_rule__Rule__Group__61531);
            rule__Rule__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Rule__Group__7_in_rule__Rule__Group__61534);
            rule__Rule__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__6"


    // $ANTLR start "rule__Rule__Group__6__Impl"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:796:1: rule__Rule__Group__6__Impl : ( ':' ) ;
    public final void rule__Rule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:800:1: ( ( ':' ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:801:1: ( ':' )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:801:1: ( ':' )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:802:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getColonKeyword_6()); 
            }
            match(input,12,FOLLOW_12_in_rule__Rule__Group__6__Impl1562); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getColonKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__6__Impl"


    // $ANTLR start "rule__Rule__Group__7"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:815:1: rule__Rule__Group__7 : rule__Rule__Group__7__Impl rule__Rule__Group__8 ;
    public final void rule__Rule__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:819:1: ( rule__Rule__Group__7__Impl rule__Rule__Group__8 )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:820:2: rule__Rule__Group__7__Impl rule__Rule__Group__8
            {
            pushFollow(FOLLOW_rule__Rule__Group__7__Impl_in_rule__Rule__Group__71593);
            rule__Rule__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Rule__Group__8_in_rule__Rule__Group__71596);
            rule__Rule__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__7"


    // $ANTLR start "rule__Rule__Group__7__Impl"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:827:1: rule__Rule__Group__7__Impl : ( ( rule__Rule__AttrAssignment_7 ) ) ;
    public final void rule__Rule__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:831:1: ( ( ( rule__Rule__AttrAssignment_7 ) ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:832:1: ( ( rule__Rule__AttrAssignment_7 ) )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:832:1: ( ( rule__Rule__AttrAssignment_7 ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:833:1: ( rule__Rule__AttrAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getAttrAssignment_7()); 
            }
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:834:1: ( rule__Rule__AttrAssignment_7 )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:834:2: rule__Rule__AttrAssignment_7
            {
            pushFollow(FOLLOW_rule__Rule__AttrAssignment_7_in_rule__Rule__Group__7__Impl1623);
            rule__Rule__AttrAssignment_7();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getAttrAssignment_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__7__Impl"


    // $ANTLR start "rule__Rule__Group__8"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:844:1: rule__Rule__Group__8 : rule__Rule__Group__8__Impl ;
    public final void rule__Rule__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:848:1: ( rule__Rule__Group__8__Impl )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:849:2: rule__Rule__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Rule__Group__8__Impl_in_rule__Rule__Group__81653);
            rule__Rule__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__8"


    // $ANTLR start "rule__Rule__Group__8__Impl"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:855:1: rule__Rule__Group__8__Impl : ( '}' ) ;
    public final void rule__Rule__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:859:1: ( ( '}' ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:860:1: ( '}' )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:860:1: ( '}' )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:861:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_8()); 
            }
            match(input,17,FOLLOW_17_in_rule__Rule__Group__8__Impl1681); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__8__Impl"


    // $ANTLR start "rule__Rule__Group_3_0__0"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:892:1: rule__Rule__Group_3_0__0 : rule__Rule__Group_3_0__0__Impl rule__Rule__Group_3_0__1 ;
    public final void rule__Rule__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:896:1: ( rule__Rule__Group_3_0__0__Impl rule__Rule__Group_3_0__1 )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:897:2: rule__Rule__Group_3_0__0__Impl rule__Rule__Group_3_0__1
            {
            pushFollow(FOLLOW_rule__Rule__Group_3_0__0__Impl_in_rule__Rule__Group_3_0__01730);
            rule__Rule__Group_3_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Rule__Group_3_0__1_in_rule__Rule__Group_3_0__01733);
            rule__Rule__Group_3_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_3_0__0"


    // $ANTLR start "rule__Rule__Group_3_0__0__Impl"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:904:1: rule__Rule__Group_3_0__0__Impl : ( 'start' ) ;
    public final void rule__Rule__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:908:1: ( ( 'start' ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:909:1: ( 'start' )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:909:1: ( 'start' )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:910:1: 'start'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getStartKeyword_3_0_0()); 
            }
            match(input,19,FOLLOW_19_in_rule__Rule__Group_3_0__0__Impl1761); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getStartKeyword_3_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_3_0__0__Impl"


    // $ANTLR start "rule__Rule__Group_3_0__1"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:923:1: rule__Rule__Group_3_0__1 : rule__Rule__Group_3_0__1__Impl rule__Rule__Group_3_0__2 ;
    public final void rule__Rule__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:927:1: ( rule__Rule__Group_3_0__1__Impl rule__Rule__Group_3_0__2 )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:928:2: rule__Rule__Group_3_0__1__Impl rule__Rule__Group_3_0__2
            {
            pushFollow(FOLLOW_rule__Rule__Group_3_0__1__Impl_in_rule__Rule__Group_3_0__11792);
            rule__Rule__Group_3_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Rule__Group_3_0__2_in_rule__Rule__Group_3_0__11795);
            rule__Rule__Group_3_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_3_0__1"


    // $ANTLR start "rule__Rule__Group_3_0__1__Impl"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:935:1: rule__Rule__Group_3_0__1__Impl : ( ( rule__Rule__StartIndexAssignment_3_0_1 ) ) ;
    public final void rule__Rule__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:939:1: ( ( ( rule__Rule__StartIndexAssignment_3_0_1 ) ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:940:1: ( ( rule__Rule__StartIndexAssignment_3_0_1 ) )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:940:1: ( ( rule__Rule__StartIndexAssignment_3_0_1 ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:941:1: ( rule__Rule__StartIndexAssignment_3_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getStartIndexAssignment_3_0_1()); 
            }
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:942:1: ( rule__Rule__StartIndexAssignment_3_0_1 )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:942:2: rule__Rule__StartIndexAssignment_3_0_1
            {
            pushFollow(FOLLOW_rule__Rule__StartIndexAssignment_3_0_1_in_rule__Rule__Group_3_0__1__Impl1822);
            rule__Rule__StartIndexAssignment_3_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getStartIndexAssignment_3_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_3_0__1__Impl"


    // $ANTLR start "rule__Rule__Group_3_0__2"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:952:1: rule__Rule__Group_3_0__2 : rule__Rule__Group_3_0__2__Impl ;
    public final void rule__Rule__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:956:1: ( rule__Rule__Group_3_0__2__Impl )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:957:2: rule__Rule__Group_3_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Rule__Group_3_0__2__Impl_in_rule__Rule__Group_3_0__21852);
            rule__Rule__Group_3_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_3_0__2"


    // $ANTLR start "rule__Rule__Group_3_0__2__Impl"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:963:1: rule__Rule__Group_3_0__2__Impl : ( ',' ) ;
    public final void rule__Rule__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:967:1: ( ( ',' ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:968:1: ( ',' )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:968:1: ( ',' )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:969:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getCommaKeyword_3_0_2()); 
            }
            match(input,20,FOLLOW_20_in_rule__Rule__Group_3_0__2__Impl1880); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getCommaKeyword_3_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_3_0__2__Impl"


    // $ANTLR start "rule__Rule__Group_3_1__0"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:988:1: rule__Rule__Group_3_1__0 : rule__Rule__Group_3_1__0__Impl rule__Rule__Group_3_1__1 ;
    public final void rule__Rule__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:992:1: ( rule__Rule__Group_3_1__0__Impl rule__Rule__Group_3_1__1 )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:993:2: rule__Rule__Group_3_1__0__Impl rule__Rule__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__Rule__Group_3_1__0__Impl_in_rule__Rule__Group_3_1__01917);
            rule__Rule__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Rule__Group_3_1__1_in_rule__Rule__Group_3_1__01920);
            rule__Rule__Group_3_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_3_1__0"


    // $ANTLR start "rule__Rule__Group_3_1__0__Impl"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1000:1: rule__Rule__Group_3_1__0__Impl : ( 'start' ) ;
    public final void rule__Rule__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1004:1: ( ( 'start' ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1005:1: ( 'start' )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1005:1: ( 'start' )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1006:1: 'start'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getStartKeyword_3_1_0()); 
            }
            match(input,19,FOLLOW_19_in_rule__Rule__Group_3_1__0__Impl1948); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getStartKeyword_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_3_1__0__Impl"


    // $ANTLR start "rule__Rule__Group_3_1__1"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1019:1: rule__Rule__Group_3_1__1 : rule__Rule__Group_3_1__1__Impl rule__Rule__Group_3_1__2 ;
    public final void rule__Rule__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1023:1: ( rule__Rule__Group_3_1__1__Impl rule__Rule__Group_3_1__2 )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1024:2: rule__Rule__Group_3_1__1__Impl rule__Rule__Group_3_1__2
            {
            pushFollow(FOLLOW_rule__Rule__Group_3_1__1__Impl_in_rule__Rule__Group_3_1__11979);
            rule__Rule__Group_3_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Rule__Group_3_1__2_in_rule__Rule__Group_3_1__11982);
            rule__Rule__Group_3_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_3_1__1"


    // $ANTLR start "rule__Rule__Group_3_1__1__Impl"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1031:1: rule__Rule__Group_3_1__1__Impl : ( ( rule__Rule__StartDelimeterAssignment_3_1_1 ) ) ;
    public final void rule__Rule__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1035:1: ( ( ( rule__Rule__StartDelimeterAssignment_3_1_1 ) ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1036:1: ( ( rule__Rule__StartDelimeterAssignment_3_1_1 ) )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1036:1: ( ( rule__Rule__StartDelimeterAssignment_3_1_1 ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1037:1: ( rule__Rule__StartDelimeterAssignment_3_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getStartDelimeterAssignment_3_1_1()); 
            }
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1038:1: ( rule__Rule__StartDelimeterAssignment_3_1_1 )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1038:2: rule__Rule__StartDelimeterAssignment_3_1_1
            {
            pushFollow(FOLLOW_rule__Rule__StartDelimeterAssignment_3_1_1_in_rule__Rule__Group_3_1__1__Impl2009);
            rule__Rule__StartDelimeterAssignment_3_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getStartDelimeterAssignment_3_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_3_1__1__Impl"


    // $ANTLR start "rule__Rule__Group_3_1__2"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1048:1: rule__Rule__Group_3_1__2 : rule__Rule__Group_3_1__2__Impl ;
    public final void rule__Rule__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1052:1: ( rule__Rule__Group_3_1__2__Impl )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1053:2: rule__Rule__Group_3_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Rule__Group_3_1__2__Impl_in_rule__Rule__Group_3_1__22039);
            rule__Rule__Group_3_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_3_1__2"


    // $ANTLR start "rule__Rule__Group_3_1__2__Impl"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1059:1: rule__Rule__Group_3_1__2__Impl : ( ',' ) ;
    public final void rule__Rule__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1063:1: ( ( ',' ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1064:1: ( ',' )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1064:1: ( ',' )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1065:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getCommaKeyword_3_1_2()); 
            }
            match(input,20,FOLLOW_20_in_rule__Rule__Group_3_1__2__Impl2067); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getCommaKeyword_3_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_3_1__2__Impl"


    // $ANTLR start "rule__Rule__Group_4_0__0"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1084:1: rule__Rule__Group_4_0__0 : rule__Rule__Group_4_0__0__Impl rule__Rule__Group_4_0__1 ;
    public final void rule__Rule__Group_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1088:1: ( rule__Rule__Group_4_0__0__Impl rule__Rule__Group_4_0__1 )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1089:2: rule__Rule__Group_4_0__0__Impl rule__Rule__Group_4_0__1
            {
            pushFollow(FOLLOW_rule__Rule__Group_4_0__0__Impl_in_rule__Rule__Group_4_0__02104);
            rule__Rule__Group_4_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Rule__Group_4_0__1_in_rule__Rule__Group_4_0__02107);
            rule__Rule__Group_4_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_4_0__0"


    // $ANTLR start "rule__Rule__Group_4_0__0__Impl"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1096:1: rule__Rule__Group_4_0__0__Impl : ( 'end' ) ;
    public final void rule__Rule__Group_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1100:1: ( ( 'end' ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1101:1: ( 'end' )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1101:1: ( 'end' )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1102:1: 'end'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getEndKeyword_4_0_0()); 
            }
            match(input,21,FOLLOW_21_in_rule__Rule__Group_4_0__0__Impl2135); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getEndKeyword_4_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_4_0__0__Impl"


    // $ANTLR start "rule__Rule__Group_4_0__1"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1115:1: rule__Rule__Group_4_0__1 : rule__Rule__Group_4_0__1__Impl rule__Rule__Group_4_0__2 ;
    public final void rule__Rule__Group_4_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1119:1: ( rule__Rule__Group_4_0__1__Impl rule__Rule__Group_4_0__2 )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1120:2: rule__Rule__Group_4_0__1__Impl rule__Rule__Group_4_0__2
            {
            pushFollow(FOLLOW_rule__Rule__Group_4_0__1__Impl_in_rule__Rule__Group_4_0__12166);
            rule__Rule__Group_4_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Rule__Group_4_0__2_in_rule__Rule__Group_4_0__12169);
            rule__Rule__Group_4_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_4_0__1"


    // $ANTLR start "rule__Rule__Group_4_0__1__Impl"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1127:1: rule__Rule__Group_4_0__1__Impl : ( ( rule__Rule__EndIndexAssignment_4_0_1 ) ) ;
    public final void rule__Rule__Group_4_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1131:1: ( ( ( rule__Rule__EndIndexAssignment_4_0_1 ) ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1132:1: ( ( rule__Rule__EndIndexAssignment_4_0_1 ) )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1132:1: ( ( rule__Rule__EndIndexAssignment_4_0_1 ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1133:1: ( rule__Rule__EndIndexAssignment_4_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getEndIndexAssignment_4_0_1()); 
            }
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1134:1: ( rule__Rule__EndIndexAssignment_4_0_1 )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1134:2: rule__Rule__EndIndexAssignment_4_0_1
            {
            pushFollow(FOLLOW_rule__Rule__EndIndexAssignment_4_0_1_in_rule__Rule__Group_4_0__1__Impl2196);
            rule__Rule__EndIndexAssignment_4_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getEndIndexAssignment_4_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_4_0__1__Impl"


    // $ANTLR start "rule__Rule__Group_4_0__2"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1144:1: rule__Rule__Group_4_0__2 : rule__Rule__Group_4_0__2__Impl ;
    public final void rule__Rule__Group_4_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1148:1: ( rule__Rule__Group_4_0__2__Impl )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1149:2: rule__Rule__Group_4_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Rule__Group_4_0__2__Impl_in_rule__Rule__Group_4_0__22226);
            rule__Rule__Group_4_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_4_0__2"


    // $ANTLR start "rule__Rule__Group_4_0__2__Impl"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1155:1: rule__Rule__Group_4_0__2__Impl : ( ',' ) ;
    public final void rule__Rule__Group_4_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1159:1: ( ( ',' ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1160:1: ( ',' )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1160:1: ( ',' )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1161:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getCommaKeyword_4_0_2()); 
            }
            match(input,20,FOLLOW_20_in_rule__Rule__Group_4_0__2__Impl2254); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getCommaKeyword_4_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_4_0__2__Impl"


    // $ANTLR start "rule__Rule__Group_4_1__0"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1180:1: rule__Rule__Group_4_1__0 : rule__Rule__Group_4_1__0__Impl rule__Rule__Group_4_1__1 ;
    public final void rule__Rule__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1184:1: ( rule__Rule__Group_4_1__0__Impl rule__Rule__Group_4_1__1 )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1185:2: rule__Rule__Group_4_1__0__Impl rule__Rule__Group_4_1__1
            {
            pushFollow(FOLLOW_rule__Rule__Group_4_1__0__Impl_in_rule__Rule__Group_4_1__02291);
            rule__Rule__Group_4_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Rule__Group_4_1__1_in_rule__Rule__Group_4_1__02294);
            rule__Rule__Group_4_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_4_1__0"


    // $ANTLR start "rule__Rule__Group_4_1__0__Impl"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1192:1: rule__Rule__Group_4_1__0__Impl : ( 'end' ) ;
    public final void rule__Rule__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1196:1: ( ( 'end' ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1197:1: ( 'end' )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1197:1: ( 'end' )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1198:1: 'end'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getEndKeyword_4_1_0()); 
            }
            match(input,21,FOLLOW_21_in_rule__Rule__Group_4_1__0__Impl2322); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getEndKeyword_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_4_1__0__Impl"


    // $ANTLR start "rule__Rule__Group_4_1__1"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1211:1: rule__Rule__Group_4_1__1 : rule__Rule__Group_4_1__1__Impl rule__Rule__Group_4_1__2 ;
    public final void rule__Rule__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1215:1: ( rule__Rule__Group_4_1__1__Impl rule__Rule__Group_4_1__2 )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1216:2: rule__Rule__Group_4_1__1__Impl rule__Rule__Group_4_1__2
            {
            pushFollow(FOLLOW_rule__Rule__Group_4_1__1__Impl_in_rule__Rule__Group_4_1__12353);
            rule__Rule__Group_4_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Rule__Group_4_1__2_in_rule__Rule__Group_4_1__12356);
            rule__Rule__Group_4_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_4_1__1"


    // $ANTLR start "rule__Rule__Group_4_1__1__Impl"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1223:1: rule__Rule__Group_4_1__1__Impl : ( ( rule__Rule__EndDelimeterAssignment_4_1_1 ) ) ;
    public final void rule__Rule__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1227:1: ( ( ( rule__Rule__EndDelimeterAssignment_4_1_1 ) ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1228:1: ( ( rule__Rule__EndDelimeterAssignment_4_1_1 ) )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1228:1: ( ( rule__Rule__EndDelimeterAssignment_4_1_1 ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1229:1: ( rule__Rule__EndDelimeterAssignment_4_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getEndDelimeterAssignment_4_1_1()); 
            }
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1230:1: ( rule__Rule__EndDelimeterAssignment_4_1_1 )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1230:2: rule__Rule__EndDelimeterAssignment_4_1_1
            {
            pushFollow(FOLLOW_rule__Rule__EndDelimeterAssignment_4_1_1_in_rule__Rule__Group_4_1__1__Impl2383);
            rule__Rule__EndDelimeterAssignment_4_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getEndDelimeterAssignment_4_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_4_1__1__Impl"


    // $ANTLR start "rule__Rule__Group_4_1__2"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1240:1: rule__Rule__Group_4_1__2 : rule__Rule__Group_4_1__2__Impl ;
    public final void rule__Rule__Group_4_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1244:1: ( rule__Rule__Group_4_1__2__Impl )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1245:2: rule__Rule__Group_4_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Rule__Group_4_1__2__Impl_in_rule__Rule__Group_4_1__22413);
            rule__Rule__Group_4_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_4_1__2"


    // $ANTLR start "rule__Rule__Group_4_1__2__Impl"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1251:1: rule__Rule__Group_4_1__2__Impl : ( ',' ) ;
    public final void rule__Rule__Group_4_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1255:1: ( ( ',' ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1256:1: ( ',' )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1256:1: ( ',' )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1257:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getCommaKeyword_4_1_2()); 
            }
            match(input,20,FOLLOW_20_in_rule__Rule__Group_4_1__2__Impl2441); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getCommaKeyword_4_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_4_1__2__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1276:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1280:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1281:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__02478);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__02481);
            rule__QualifiedName__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1288:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1292:1: ( ( RULE_ID ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1293:1: ( RULE_ID )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1293:1: ( RULE_ID )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1294:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl2508); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1305:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1309:1: ( rule__QualifiedName__Group__1__Impl )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1310:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__12537);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1316:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1320:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1321:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1321:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1322:1: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1323:1: ( rule__QualifiedName__Group_1__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==22) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1323:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl2564);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1337:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1341:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1342:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__02599);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__02602);
            rule__QualifiedName__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1349:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1353:1: ( ( '.' ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1354:1: ( '.' )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1354:1: ( '.' )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1355:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            match(input,22,FOLLOW_22_in_rule__QualifiedName__Group_1__0__Impl2630); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1368:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1372:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1373:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__12661);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1379:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1383:1: ( ( RULE_ID ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1384:1: ( RULE_ID )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1384:1: ( RULE_ID )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1385:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl2688); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__Model__UnorderedGroup"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1401:1: rule__Model__UnorderedGroup : rule__Model__UnorderedGroup__0 {...}?;
    public final void rule__Model__UnorderedGroup() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getModelAccess().getUnorderedGroup());
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1406:1: ( rule__Model__UnorderedGroup__0 {...}?)
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1407:2: rule__Model__UnorderedGroup__0 {...}?
            {
            pushFollow(FOLLOW_rule__Model__UnorderedGroup__0_in_rule__Model__UnorderedGroup2722);
            rule__Model__UnorderedGroup__0();

            state._fsp--;
            if (state.failed) return ;
            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getModelAccess().getUnorderedGroup()) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "rule__Model__UnorderedGroup", "getUnorderedGroupHelper().canLeave(grammarAccess.getModelAccess().getUnorderedGroup())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getModelAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__UnorderedGroup"


    // $ANTLR start "rule__Model__UnorderedGroup__Impl"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1418:1: rule__Model__UnorderedGroup__Impl : ( ({...}? => ( ( ( rule__Model__Group_0__0 ) ) ) ) | ({...}? => ( ( ( ( rule__Model__RulesAssignment_1 ) ) ( ( ( rule__Model__RulesAssignment_1 )=> rule__Model__RulesAssignment_1 )* ) ) ) ) ) ;
    public final void rule__Model__UnorderedGroup__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1423:1: ( ( ({...}? => ( ( ( rule__Model__Group_0__0 ) ) ) ) | ({...}? => ( ( ( ( rule__Model__RulesAssignment_1 ) ) ( ( ( rule__Model__RulesAssignment_1 )=> rule__Model__RulesAssignment_1 )* ) ) ) ) ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1424:3: ( ({...}? => ( ( ( rule__Model__Group_0__0 ) ) ) ) | ({...}? => ( ( ( ( rule__Model__RulesAssignment_1 ) ) ( ( ( rule__Model__RulesAssignment_1 )=> rule__Model__RulesAssignment_1 )* ) ) ) ) )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1424:3: ( ({...}? => ( ( ( rule__Model__Group_0__0 ) ) ) ) | ({...}? => ( ( ( ( rule__Model__RulesAssignment_1 ) ) ( ( ( rule__Model__RulesAssignment_1 )=> rule__Model__RulesAssignment_1 )* ) ) ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( LA6_0 ==11 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 0) ) {
                alt6=1;
            }
            else if ( LA6_0 ==18 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1426:4: ({...}? => ( ( ( rule__Model__Group_0__0 ) ) ) )
                    {
                    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1426:4: ({...}? => ( ( ( rule__Model__Group_0__0 ) ) ) )
                    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1427:5: {...}? => ( ( ( rule__Model__Group_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Model__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 0)");
                    }
                    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1427:100: ( ( ( rule__Model__Group_0__0 ) ) )
                    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1428:6: ( ( rule__Model__Group_0__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup(), 0);
                    selected = true;
                    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1434:6: ( ( rule__Model__Group_0__0 ) )
                    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1436:7: ( rule__Model__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModelAccess().getGroup_0()); 
                    }
                    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1437:7: ( rule__Model__Group_0__0 )
                    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1437:8: rule__Model__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Model__Group_0__0_in_rule__Model__UnorderedGroup__Impl2811);
                    rule__Model__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getModelAccess().getGroup_0()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1443:4: ({...}? => ( ( ( ( rule__Model__RulesAssignment_1 ) ) ( ( ( rule__Model__RulesAssignment_1 )=> rule__Model__RulesAssignment_1 )* ) ) ) )
                    {
                    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1443:4: ({...}? => ( ( ( ( rule__Model__RulesAssignment_1 ) ) ( ( ( rule__Model__RulesAssignment_1 )=> rule__Model__RulesAssignment_1 )* ) ) ) )
                    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1444:5: {...}? => ( ( ( ( rule__Model__RulesAssignment_1 ) ) ( ( ( rule__Model__RulesAssignment_1 )=> rule__Model__RulesAssignment_1 )* ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Model__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1)");
                    }
                    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1444:100: ( ( ( ( rule__Model__RulesAssignment_1 ) ) ( ( ( rule__Model__RulesAssignment_1 )=> rule__Model__RulesAssignment_1 )* ) ) )
                    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1445:6: ( ( ( rule__Model__RulesAssignment_1 ) ) ( ( ( rule__Model__RulesAssignment_1 )=> rule__Model__RulesAssignment_1 )* ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup(), 1);
                    selected = true;
                    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1451:6: ( ( ( rule__Model__RulesAssignment_1 ) ) ( ( ( rule__Model__RulesAssignment_1 )=> rule__Model__RulesAssignment_1 )* ) )
                    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1452:6: ( ( rule__Model__RulesAssignment_1 ) ) ( ( ( rule__Model__RulesAssignment_1 )=> rule__Model__RulesAssignment_1 )* )
                    {
                    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1452:6: ( ( rule__Model__RulesAssignment_1 ) )
                    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1453:7: ( rule__Model__RulesAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModelAccess().getRulesAssignment_1()); 
                    }
                    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1454:7: ( rule__Model__RulesAssignment_1 )
                    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1454:8: rule__Model__RulesAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Model__RulesAssignment_1_in_rule__Model__UnorderedGroup__Impl2903);
                    rule__Model__RulesAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getModelAccess().getRulesAssignment_1()); 
                    }

                    }

                    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1457:6: ( ( ( rule__Model__RulesAssignment_1 )=> rule__Model__RulesAssignment_1 )* )
                    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1458:7: ( ( rule__Model__RulesAssignment_1 )=> rule__Model__RulesAssignment_1 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModelAccess().getRulesAssignment_1()); 
                    }
                    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1459:7: ( ( rule__Model__RulesAssignment_1 )=> rule__Model__RulesAssignment_1 )*
                    loop5:
                    do {
                        int alt5=2;
                        alt5 = dfa5.predict(input);
                        switch (alt5) {
                    	case 1 :
                    	    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1459:8: ( rule__Model__RulesAssignment_1 )=> rule__Model__RulesAssignment_1
                    	    {
                    	    pushFollow(FOLLOW_rule__Model__RulesAssignment_1_in_rule__Model__UnorderedGroup__Impl2947);
                    	    rule__Model__RulesAssignment_1();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getModelAccess().getRulesAssignment_1()); 
                    }

                    }


                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__UnorderedGroup__Impl"


    // $ANTLR start "rule__Model__UnorderedGroup__0"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1474:1: rule__Model__UnorderedGroup__0 : rule__Model__UnorderedGroup__Impl ( rule__Model__UnorderedGroup__1 )? ;
    public final void rule__Model__UnorderedGroup__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1478:1: ( rule__Model__UnorderedGroup__Impl ( rule__Model__UnorderedGroup__1 )? )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1479:2: rule__Model__UnorderedGroup__Impl ( rule__Model__UnorderedGroup__1 )?
            {
            pushFollow(FOLLOW_rule__Model__UnorderedGroup__Impl_in_rule__Model__UnorderedGroup__03013);
            rule__Model__UnorderedGroup__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1480:2: ( rule__Model__UnorderedGroup__1 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( LA7_0 ==11 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 0) ) {
                alt7=1;
            }
            else if ( LA7_0 ==18 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1480:2: rule__Model__UnorderedGroup__1
                    {
                    pushFollow(FOLLOW_rule__Model__UnorderedGroup__1_in_rule__Model__UnorderedGroup__03016);
                    rule__Model__UnorderedGroup__1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__UnorderedGroup__0"


    // $ANTLR start "rule__Model__UnorderedGroup__1"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1487:1: rule__Model__UnorderedGroup__1 : rule__Model__UnorderedGroup__Impl ;
    public final void rule__Model__UnorderedGroup__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1491:1: ( rule__Model__UnorderedGroup__Impl )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1492:2: rule__Model__UnorderedGroup__Impl
            {
            pushFollow(FOLLOW_rule__Model__UnorderedGroup__Impl_in_rule__Model__UnorderedGroup__13041);
            rule__Model__UnorderedGroup__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__UnorderedGroup__1"


    // $ANTLR start "rule__Model__NameAssignment_0_2"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1503:1: rule__Model__NameAssignment_0_2 : ( RULE_ID ) ;
    public final void rule__Model__NameAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1507:1: ( ( RULE_ID ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1508:1: ( RULE_ID )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1508:1: ( RULE_ID )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1509:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_0_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Model__NameAssignment_0_23073); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__NameAssignment_0_2"


    // $ANTLR start "rule__Model__AttributesAssignment_0_4"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1518:1: rule__Model__AttributesAssignment_0_4 : ( ruleAttribute ) ;
    public final void rule__Model__AttributesAssignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1522:1: ( ( ruleAttribute ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1523:1: ( ruleAttribute )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1523:1: ( ruleAttribute )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1524:1: ruleAttribute
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getAttributesAttributeParserRuleCall_0_4_0()); 
            }
            pushFollow(FOLLOW_ruleAttribute_in_rule__Model__AttributesAssignment_0_43104);
            ruleAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getAttributesAttributeParserRuleCall_0_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__AttributesAssignment_0_4"


    // $ANTLR start "rule__Model__RulesAssignment_1"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1533:1: rule__Model__RulesAssignment_1 : ( ruleRule ) ;
    public final void rule__Model__RulesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1537:1: ( ( ruleRule ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1538:1: ( ruleRule )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1538:1: ( ruleRule )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1539:1: ruleRule
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getRulesRuleParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleRule_in_rule__Model__RulesAssignment_13135);
            ruleRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getRulesRuleParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__RulesAssignment_1"


    // $ANTLR start "rule__Attribute__NameAssignment_1"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1548:1: rule__Attribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1552:1: ( ( RULE_ID ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1553:1: ( RULE_ID )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1553:1: ( RULE_ID )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1554:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_13166); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__NameAssignment_1"


    // $ANTLR start "rule__Attribute__TypeAssignment_5"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1563:1: rule__Attribute__TypeAssignment_5 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Attribute__TypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1567:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1568:1: ( ( ruleQualifiedName ) )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1568:1: ( ( ruleQualifiedName ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1569:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getTypeJvmTypeCrossReference_5_0()); 
            }
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1570:1: ( ruleQualifiedName )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1571:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getTypeJvmTypeQualifiedNameParserRuleCall_5_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Attribute__TypeAssignment_53201);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getTypeJvmTypeQualifiedNameParserRuleCall_5_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getTypeJvmTypeCrossReference_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__TypeAssignment_5"


    // $ANTLR start "rule__Rule__NameAssignment_1"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1582:1: rule__Rule__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Rule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1586:1: ( ( RULE_ID ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1587:1: ( RULE_ID )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1587:1: ( RULE_ID )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1588:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Rule__NameAssignment_13236); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__NameAssignment_1"


    // $ANTLR start "rule__Rule__StartIndexAssignment_3_0_1"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1597:1: rule__Rule__StartIndexAssignment_3_0_1 : ( RULE_INT ) ;
    public final void rule__Rule__StartIndexAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1601:1: ( ( RULE_INT ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1602:1: ( RULE_INT )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1602:1: ( RULE_INT )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1603:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getStartIndexINTTerminalRuleCall_3_0_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Rule__StartIndexAssignment_3_0_13267); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getStartIndexINTTerminalRuleCall_3_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__StartIndexAssignment_3_0_1"


    // $ANTLR start "rule__Rule__StartDelimeterAssignment_3_1_1"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1612:1: rule__Rule__StartDelimeterAssignment_3_1_1 : ( RULE_STRING ) ;
    public final void rule__Rule__StartDelimeterAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1616:1: ( ( RULE_STRING ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1617:1: ( RULE_STRING )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1617:1: ( RULE_STRING )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1618:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getStartDelimeterSTRINGTerminalRuleCall_3_1_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Rule__StartDelimeterAssignment_3_1_13298); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getStartDelimeterSTRINGTerminalRuleCall_3_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__StartDelimeterAssignment_3_1_1"


    // $ANTLR start "rule__Rule__EndIndexAssignment_4_0_1"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1627:1: rule__Rule__EndIndexAssignment_4_0_1 : ( RULE_INT ) ;
    public final void rule__Rule__EndIndexAssignment_4_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1631:1: ( ( RULE_INT ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1632:1: ( RULE_INT )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1632:1: ( RULE_INT )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1633:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getEndIndexINTTerminalRuleCall_4_0_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Rule__EndIndexAssignment_4_0_13329); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getEndIndexINTTerminalRuleCall_4_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__EndIndexAssignment_4_0_1"


    // $ANTLR start "rule__Rule__EndDelimeterAssignment_4_1_1"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1642:1: rule__Rule__EndDelimeterAssignment_4_1_1 : ( RULE_STRING ) ;
    public final void rule__Rule__EndDelimeterAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1646:1: ( ( RULE_STRING ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1647:1: ( RULE_STRING )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1647:1: ( RULE_STRING )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1648:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getEndDelimeterSTRINGTerminalRuleCall_4_1_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Rule__EndDelimeterAssignment_4_1_13360); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getEndDelimeterSTRINGTerminalRuleCall_4_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__EndDelimeterAssignment_4_1_1"


    // $ANTLR start "rule__Rule__AttrAssignment_7"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1657:1: rule__Rule__AttrAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__Rule__AttrAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1661:1: ( ( ( RULE_ID ) ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1662:1: ( ( RULE_ID ) )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1662:1: ( ( RULE_ID ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1663:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getAttrAttributeCrossReference_7_0()); 
            }
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1664:1: ( RULE_ID )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1665:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getAttrAttributeIDTerminalRuleCall_7_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Rule__AttrAssignment_73395); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getAttrAttributeIDTerminalRuleCall_7_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getAttrAttributeCrossReference_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__AttrAssignment_7"

    // $ANTLR start synpred1_InternalS2M
    public final void synpred1_InternalS2M_fragment() throws RecognitionException {   
        // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1459:8: ( rule__Model__RulesAssignment_1 )
        // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1459:9: rule__Model__RulesAssignment_1
        {
        pushFollow(FOLLOW_rule__Model__RulesAssignment_1_in_synpred1_InternalS2M2944);
        rule__Model__RulesAssignment_1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalS2M

    // Delegated rules

    public final boolean synpred1_InternalS2M() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalS2M_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA5_eotS =
        "\24\uffff";
    static final String DFA5_eofS =
        "\1\1\23\uffff";
    static final String DFA5_minS =
        "\1\13\1\uffff\1\4\1\17\1\23\1\5\2\24\2\25\1\5\2\24\2\16\1\14\1"+
        "\4\1\21\1\0\1\uffff";
    static final String DFA5_maxS =
        "\1\22\1\uffff\1\4\1\17\1\23\1\6\2\24\2\25\1\6\2\24\2\16\1\14\1"+
        "\4\1\21\1\0\1\uffff";
    static final String DFA5_acceptS =
        "\1\uffff\1\2\21\uffff\1\1";
    static final String DFA5_specialS =
        "\22\uffff\1\0\1\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1\6\uffff\1\2",
            "",
            "\1\3",
            "\1\4",
            "\1\5",
            "\1\7\1\6",
            "\1\10",
            "\1\11",
            "\1\12",
            "\1\12",
            "\1\13\1\14",
            "\1\15",
            "\1\16",
            "\1\17",
            "\1\17",
            "\1\20",
            "\1\21",
            "\1\22",
            "\1\uffff",
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
            return "()* loopback of 1459:7: ( ( rule__Model__RulesAssignment_1 )=> rule__Model__RulesAssignment_1 )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA5_18 = input.LA(1);

                         
                        int index5_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalS2M()) ) {s = 19;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index5_18);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 5, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__UnorderedGroup_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0_in_ruleAttribute154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_entryRuleRule181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRule188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__0_in_ruleRule214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group_3_0__0_in_rule__Rule__Alternatives_3310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group_3_1__0_in_rule__Rule__Alternatives_3328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group_4_0__0_in_rule__Rule__Alternatives_4361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group_4_1__0_in_rule__Rule__Alternatives_4379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_0__0__Impl_in_rule__Model__Group_0__0410 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Model__Group_0__1_in_rule__Model__Group_0__0413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Model__Group_0__0__Impl441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_0__1__Impl_in_rule__Model__Group_0__1472 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Model__Group_0__2_in_rule__Model__Group_0__1475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Model__Group_0__1__Impl503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_0__2__Impl_in_rule__Model__Group_0__2534 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Model__Group_0__3_in_rule__Model__Group_0__2537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__NameAssignment_0_2_in_rule__Model__Group_0__2__Impl564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_0__3__Impl_in_rule__Model__Group_0__3594 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Model__Group_0__4_in_rule__Model__Group_0__3597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Model__Group_0__3__Impl625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_0__4__Impl_in_rule__Model__Group_0__4656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__AttributesAssignment_0_4_in_rule__Model__Group_0__4__Impl683 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__0724 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__0727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Attribute__Group__0__Impl755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__1786 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__1789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__NameAssignment_1_in_rule__Attribute__Group__1__Impl816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__2846 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__3_in_rule__Attribute__Group__2849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Attribute__Group__2__Impl877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__3__Impl_in_rule__Attribute__Group__3908 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__4_in_rule__Attribute__Group__3911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Attribute__Group__3__Impl939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__4__Impl_in_rule__Attribute__Group__4970 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Attribute__Group__5_in_rule__Attribute__Group__4973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Attribute__Group__4__Impl1001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__5__Impl_in_rule__Attribute__Group__51032 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__6_in_rule__Attribute__Group__51035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__TypeAssignment_5_in_rule__Attribute__Group__5__Impl1062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__6__Impl_in_rule__Attribute__Group__61092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Attribute__Group__6__Impl1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__01165 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__01168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Rule__Group__0__Impl1196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__11227 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Rule__Group__2_in_rule__Rule__Group__11230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__NameAssignment_1_in_rule__Rule__Group__1__Impl1257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__2__Impl_in_rule__Rule__Group__21287 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Rule__Group__3_in_rule__Rule__Group__21290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Rule__Group__2__Impl1318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__3__Impl_in_rule__Rule__Group__31349 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Rule__Group__4_in_rule__Rule__Group__31352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Alternatives_3_in_rule__Rule__Group__3__Impl1379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__4__Impl_in_rule__Rule__Group__41409 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Rule__Group__5_in_rule__Rule__Group__41412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Alternatives_4_in_rule__Rule__Group__4__Impl1439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__5__Impl_in_rule__Rule__Group__51469 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Rule__Group__6_in_rule__Rule__Group__51472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Rule__Group__5__Impl1500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__6__Impl_in_rule__Rule__Group__61531 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Rule__Group__7_in_rule__Rule__Group__61534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Rule__Group__6__Impl1562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__7__Impl_in_rule__Rule__Group__71593 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Rule__Group__8_in_rule__Rule__Group__71596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__AttrAssignment_7_in_rule__Rule__Group__7__Impl1623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__8__Impl_in_rule__Rule__Group__81653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Rule__Group__8__Impl1681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group_3_0__0__Impl_in_rule__Rule__Group_3_0__01730 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Rule__Group_3_0__1_in_rule__Rule__Group_3_0__01733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Rule__Group_3_0__0__Impl1761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group_3_0__1__Impl_in_rule__Rule__Group_3_0__11792 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Rule__Group_3_0__2_in_rule__Rule__Group_3_0__11795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__StartIndexAssignment_3_0_1_in_rule__Rule__Group_3_0__1__Impl1822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group_3_0__2__Impl_in_rule__Rule__Group_3_0__21852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Rule__Group_3_0__2__Impl1880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group_3_1__0__Impl_in_rule__Rule__Group_3_1__01917 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Rule__Group_3_1__1_in_rule__Rule__Group_3_1__01920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Rule__Group_3_1__0__Impl1948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group_3_1__1__Impl_in_rule__Rule__Group_3_1__11979 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Rule__Group_3_1__2_in_rule__Rule__Group_3_1__11982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__StartDelimeterAssignment_3_1_1_in_rule__Rule__Group_3_1__1__Impl2009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group_3_1__2__Impl_in_rule__Rule__Group_3_1__22039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Rule__Group_3_1__2__Impl2067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group_4_0__0__Impl_in_rule__Rule__Group_4_0__02104 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Rule__Group_4_0__1_in_rule__Rule__Group_4_0__02107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Rule__Group_4_0__0__Impl2135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group_4_0__1__Impl_in_rule__Rule__Group_4_0__12166 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Rule__Group_4_0__2_in_rule__Rule__Group_4_0__12169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__EndIndexAssignment_4_0_1_in_rule__Rule__Group_4_0__1__Impl2196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group_4_0__2__Impl_in_rule__Rule__Group_4_0__22226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Rule__Group_4_0__2__Impl2254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group_4_1__0__Impl_in_rule__Rule__Group_4_1__02291 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Rule__Group_4_1__1_in_rule__Rule__Group_4_1__02294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Rule__Group_4_1__0__Impl2322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group_4_1__1__Impl_in_rule__Rule__Group_4_1__12353 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Rule__Group_4_1__2_in_rule__Rule__Group_4_1__12356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__EndDelimeterAssignment_4_1_1_in_rule__Rule__Group_4_1__1__Impl2383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group_4_1__2__Impl_in_rule__Rule__Group_4_1__22413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Rule__Group_4_1__2__Impl2441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__02478 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__02481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl2508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__12537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl2564 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__02599 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__02602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__QualifiedName__Group_1__0__Impl2630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__12661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl2688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__UnorderedGroup__0_in_rule__Model__UnorderedGroup2722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_0__0_in_rule__Model__UnorderedGroup__Impl2811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__RulesAssignment_1_in_rule__Model__UnorderedGroup__Impl2903 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__Model__RulesAssignment_1_in_rule__Model__UnorderedGroup__Impl2947 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__Model__UnorderedGroup__Impl_in_rule__Model__UnorderedGroup__03013 = new BitSet(new long[]{0x0000000000040802L});
    public static final BitSet FOLLOW_rule__Model__UnorderedGroup__1_in_rule__Model__UnorderedGroup__03016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__UnorderedGroup__Impl_in_rule__Model__UnorderedGroup__13041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Model__NameAssignment_0_23073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__Model__AttributesAssignment_0_43104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_rule__Model__RulesAssignment_13135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_13166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Attribute__TypeAssignment_53201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Rule__NameAssignment_13236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Rule__StartIndexAssignment_3_0_13267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Rule__StartDelimeterAssignment_3_1_13298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Rule__EndIndexAssignment_4_0_13329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Rule__EndDelimeterAssignment_4_1_13360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Rule__AttrAssignment_73395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__RulesAssignment_1_in_synpred1_InternalS2M2944 = new BitSet(new long[]{0x0000000000000002L});

}
