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
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:125:1: ruleRule : ( ruleRulePosition ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:129:2: ( ( ruleRulePosition ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:130:1: ( ruleRulePosition )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:130:1: ( ruleRulePosition )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:131:1: ruleRulePosition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuleAccess().getRulePositionParserRuleCall()); 
            }
            pushFollow(FOLLOW_ruleRulePosition_in_ruleRule214);
            ruleRulePosition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuleAccess().getRulePositionParserRuleCall()); 
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


    // $ANTLR start "entryRuleRulePosition"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:144:1: entryRuleRulePosition : ruleRulePosition EOF ;
    public final void entryRuleRulePosition() throws RecognitionException {
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:145:1: ( ruleRulePosition EOF )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:146:1: ruleRulePosition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulePositionRule()); 
            }
            pushFollow(FOLLOW_ruleRulePosition_in_entryRuleRulePosition240);
            ruleRulePosition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRulePositionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRulePosition247); if (state.failed) return ;

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
    // $ANTLR end "entryRuleRulePosition"


    // $ANTLR start "ruleRulePosition"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:153:1: ruleRulePosition : ( ( rule__RulePosition__Group__0 ) ) ;
    public final void ruleRulePosition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:157:2: ( ( ( rule__RulePosition__Group__0 ) ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:158:1: ( ( rule__RulePosition__Group__0 ) )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:158:1: ( ( rule__RulePosition__Group__0 ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:159:1: ( rule__RulePosition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulePositionAccess().getGroup()); 
            }
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:160:1: ( rule__RulePosition__Group__0 )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:160:2: rule__RulePosition__Group__0
            {
            pushFollow(FOLLOW_rule__RulePosition__Group__0_in_ruleRulePosition273);
            rule__RulePosition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRulePositionAccess().getGroup()); 
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
    // $ANTLR end "ruleRulePosition"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:172:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:173:1: ( ruleQualifiedName EOF )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:174:1: ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName300);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName307); if (state.failed) return ;

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
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:181:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:185:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:186:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:186:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:187:1: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:188:1: ( rule__QualifiedName__Group__0 )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:188:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName333);
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


    // $ANTLR start "rule__RulePosition__Alternatives_3"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:200:1: rule__RulePosition__Alternatives_3 : ( ( ( rule__RulePosition__Group_3_0__0 ) ) | ( ( rule__RulePosition__Group_3_1__0 ) ) );
    public final void rule__RulePosition__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:204:1: ( ( ( rule__RulePosition__Group_3_0__0 ) ) | ( ( rule__RulePosition__Group_3_1__0 ) ) )
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
                    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:205:1: ( ( rule__RulePosition__Group_3_0__0 ) )
                    {
                    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:205:1: ( ( rule__RulePosition__Group_3_0__0 ) )
                    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:206:1: ( rule__RulePosition__Group_3_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRulePositionAccess().getGroup_3_0()); 
                    }
                    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:207:1: ( rule__RulePosition__Group_3_0__0 )
                    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:207:2: rule__RulePosition__Group_3_0__0
                    {
                    pushFollow(FOLLOW_rule__RulePosition__Group_3_0__0_in_rule__RulePosition__Alternatives_3369);
                    rule__RulePosition__Group_3_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRulePositionAccess().getGroup_3_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:211:6: ( ( rule__RulePosition__Group_3_1__0 ) )
                    {
                    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:211:6: ( ( rule__RulePosition__Group_3_1__0 ) )
                    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:212:1: ( rule__RulePosition__Group_3_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRulePositionAccess().getGroup_3_1()); 
                    }
                    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:213:1: ( rule__RulePosition__Group_3_1__0 )
                    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:213:2: rule__RulePosition__Group_3_1__0
                    {
                    pushFollow(FOLLOW_rule__RulePosition__Group_3_1__0_in_rule__RulePosition__Alternatives_3387);
                    rule__RulePosition__Group_3_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRulePositionAccess().getGroup_3_1()); 
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
    // $ANTLR end "rule__RulePosition__Alternatives_3"


    // $ANTLR start "rule__RulePosition__Alternatives_4"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:222:1: rule__RulePosition__Alternatives_4 : ( ( ( rule__RulePosition__Group_4_0__0 ) ) | ( ( rule__RulePosition__Group_4_1__0 ) ) );
    public final void rule__RulePosition__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:226:1: ( ( ( rule__RulePosition__Group_4_0__0 ) ) | ( ( rule__RulePosition__Group_4_1__0 ) ) )
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
                    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:227:1: ( ( rule__RulePosition__Group_4_0__0 ) )
                    {
                    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:227:1: ( ( rule__RulePosition__Group_4_0__0 ) )
                    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:228:1: ( rule__RulePosition__Group_4_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRulePositionAccess().getGroup_4_0()); 
                    }
                    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:229:1: ( rule__RulePosition__Group_4_0__0 )
                    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:229:2: rule__RulePosition__Group_4_0__0
                    {
                    pushFollow(FOLLOW_rule__RulePosition__Group_4_0__0_in_rule__RulePosition__Alternatives_4420);
                    rule__RulePosition__Group_4_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRulePositionAccess().getGroup_4_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:233:6: ( ( rule__RulePosition__Group_4_1__0 ) )
                    {
                    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:233:6: ( ( rule__RulePosition__Group_4_1__0 ) )
                    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:234:1: ( rule__RulePosition__Group_4_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRulePositionAccess().getGroup_4_1()); 
                    }
                    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:235:1: ( rule__RulePosition__Group_4_1__0 )
                    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:235:2: rule__RulePosition__Group_4_1__0
                    {
                    pushFollow(FOLLOW_rule__RulePosition__Group_4_1__0_in_rule__RulePosition__Alternatives_4438);
                    rule__RulePosition__Group_4_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRulePositionAccess().getGroup_4_1()); 
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
    // $ANTLR end "rule__RulePosition__Alternatives_4"


    // $ANTLR start "rule__Model__Group_0__0"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:246:1: rule__Model__Group_0__0 : rule__Model__Group_0__0__Impl rule__Model__Group_0__1 ;
    public final void rule__Model__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:250:1: ( rule__Model__Group_0__0__Impl rule__Model__Group_0__1 )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:251:2: rule__Model__Group_0__0__Impl rule__Model__Group_0__1
            {
            pushFollow(FOLLOW_rule__Model__Group_0__0__Impl_in_rule__Model__Group_0__0469);
            rule__Model__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group_0__1_in_rule__Model__Group_0__0472);
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
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:258:1: rule__Model__Group_0__0__Impl : ( 'model' ) ;
    public final void rule__Model__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:262:1: ( ( 'model' ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:263:1: ( 'model' )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:263:1: ( 'model' )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:264:1: 'model'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getModelKeyword_0_0()); 
            }
            match(input,11,FOLLOW_11_in_rule__Model__Group_0__0__Impl500); if (state.failed) return ;
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
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:277:1: rule__Model__Group_0__1 : rule__Model__Group_0__1__Impl rule__Model__Group_0__2 ;
    public final void rule__Model__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:281:1: ( rule__Model__Group_0__1__Impl rule__Model__Group_0__2 )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:282:2: rule__Model__Group_0__1__Impl rule__Model__Group_0__2
            {
            pushFollow(FOLLOW_rule__Model__Group_0__1__Impl_in_rule__Model__Group_0__1531);
            rule__Model__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group_0__2_in_rule__Model__Group_0__1534);
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
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:289:1: rule__Model__Group_0__1__Impl : ( ':' ) ;
    public final void rule__Model__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:293:1: ( ( ':' ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:294:1: ( ':' )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:294:1: ( ':' )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:295:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getColonKeyword_0_1()); 
            }
            match(input,12,FOLLOW_12_in_rule__Model__Group_0__1__Impl562); if (state.failed) return ;
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
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:308:1: rule__Model__Group_0__2 : rule__Model__Group_0__2__Impl rule__Model__Group_0__3 ;
    public final void rule__Model__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:312:1: ( rule__Model__Group_0__2__Impl rule__Model__Group_0__3 )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:313:2: rule__Model__Group_0__2__Impl rule__Model__Group_0__3
            {
            pushFollow(FOLLOW_rule__Model__Group_0__2__Impl_in_rule__Model__Group_0__2593);
            rule__Model__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group_0__3_in_rule__Model__Group_0__2596);
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
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:320:1: rule__Model__Group_0__2__Impl : ( ( rule__Model__NameAssignment_0_2 ) ) ;
    public final void rule__Model__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:324:1: ( ( ( rule__Model__NameAssignment_0_2 ) ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:325:1: ( ( rule__Model__NameAssignment_0_2 ) )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:325:1: ( ( rule__Model__NameAssignment_0_2 ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:326:1: ( rule__Model__NameAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getNameAssignment_0_2()); 
            }
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:327:1: ( rule__Model__NameAssignment_0_2 )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:327:2: rule__Model__NameAssignment_0_2
            {
            pushFollow(FOLLOW_rule__Model__NameAssignment_0_2_in_rule__Model__Group_0__2__Impl623);
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
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:337:1: rule__Model__Group_0__3 : rule__Model__Group_0__3__Impl rule__Model__Group_0__4 ;
    public final void rule__Model__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:341:1: ( rule__Model__Group_0__3__Impl rule__Model__Group_0__4 )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:342:2: rule__Model__Group_0__3__Impl rule__Model__Group_0__4
            {
            pushFollow(FOLLOW_rule__Model__Group_0__3__Impl_in_rule__Model__Group_0__3653);
            rule__Model__Group_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group_0__4_in_rule__Model__Group_0__3656);
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
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:349:1: rule__Model__Group_0__3__Impl : ( ';' ) ;
    public final void rule__Model__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:353:1: ( ( ';' ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:354:1: ( ';' )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:354:1: ( ';' )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:355:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getSemicolonKeyword_0_3()); 
            }
            match(input,13,FOLLOW_13_in_rule__Model__Group_0__3__Impl684); if (state.failed) return ;
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
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:368:1: rule__Model__Group_0__4 : rule__Model__Group_0__4__Impl ;
    public final void rule__Model__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:372:1: ( rule__Model__Group_0__4__Impl )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:373:2: rule__Model__Group_0__4__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group_0__4__Impl_in_rule__Model__Group_0__4715);
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
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:379:1: rule__Model__Group_0__4__Impl : ( ( rule__Model__AttributesAssignment_0_4 )* ) ;
    public final void rule__Model__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:383:1: ( ( ( rule__Model__AttributesAssignment_0_4 )* ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:384:1: ( ( rule__Model__AttributesAssignment_0_4 )* )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:384:1: ( ( rule__Model__AttributesAssignment_0_4 )* )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:385:1: ( rule__Model__AttributesAssignment_0_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getAttributesAssignment_0_4()); 
            }
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:386:1: ( rule__Model__AttributesAssignment_0_4 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:386:2: rule__Model__AttributesAssignment_0_4
            	    {
            	    pushFollow(FOLLOW_rule__Model__AttributesAssignment_0_4_in_rule__Model__Group_0__4__Impl742);
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
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:406:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:410:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:411:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__0783);
            rule__Attribute__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__0786);
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
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:418:1: rule__Attribute__Group__0__Impl : ( 'attr' ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:422:1: ( ( 'attr' ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:423:1: ( 'attr' )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:423:1: ( 'attr' )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:424:1: 'attr'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getAttrKeyword_0()); 
            }
            match(input,14,FOLLOW_14_in_rule__Attribute__Group__0__Impl814); if (state.failed) return ;
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
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:437:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:441:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:442:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__1845);
            rule__Attribute__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__1848);
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
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:449:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:453:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:454:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:454:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:455:1: ( rule__Attribute__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            }
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:456:1: ( rule__Attribute__NameAssignment_1 )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:456:2: rule__Attribute__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Attribute__NameAssignment_1_in_rule__Attribute__Group__1__Impl875);
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
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:466:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:470:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:471:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__2905);
            rule__Attribute__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Attribute__Group__3_in_rule__Attribute__Group__2908);
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
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:478:1: rule__Attribute__Group__2__Impl : ( '{' ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:482:1: ( ( '{' ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:483:1: ( '{' )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:483:1: ( '{' )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:484:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,15,FOLLOW_15_in_rule__Attribute__Group__2__Impl936); if (state.failed) return ;
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
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:497:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:501:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:502:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
            {
            pushFollow(FOLLOW_rule__Attribute__Group__3__Impl_in_rule__Attribute__Group__3967);
            rule__Attribute__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Attribute__Group__4_in_rule__Attribute__Group__3970);
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
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:509:1: rule__Attribute__Group__3__Impl : ( 'type' ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:513:1: ( ( 'type' ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:514:1: ( 'type' )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:514:1: ( 'type' )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:515:1: 'type'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getTypeKeyword_3()); 
            }
            match(input,16,FOLLOW_16_in_rule__Attribute__Group__3__Impl998); if (state.failed) return ;
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
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:528:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl rule__Attribute__Group__5 ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:532:1: ( rule__Attribute__Group__4__Impl rule__Attribute__Group__5 )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:533:2: rule__Attribute__Group__4__Impl rule__Attribute__Group__5
            {
            pushFollow(FOLLOW_rule__Attribute__Group__4__Impl_in_rule__Attribute__Group__41029);
            rule__Attribute__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Attribute__Group__5_in_rule__Attribute__Group__41032);
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
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:540:1: rule__Attribute__Group__4__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:544:1: ( ( ':' ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:545:1: ( ':' )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:545:1: ( ':' )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:546:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getColonKeyword_4()); 
            }
            match(input,12,FOLLOW_12_in_rule__Attribute__Group__4__Impl1060); if (state.failed) return ;
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
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:559:1: rule__Attribute__Group__5 : rule__Attribute__Group__5__Impl rule__Attribute__Group__6 ;
    public final void rule__Attribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:563:1: ( rule__Attribute__Group__5__Impl rule__Attribute__Group__6 )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:564:2: rule__Attribute__Group__5__Impl rule__Attribute__Group__6
            {
            pushFollow(FOLLOW_rule__Attribute__Group__5__Impl_in_rule__Attribute__Group__51091);
            rule__Attribute__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Attribute__Group__6_in_rule__Attribute__Group__51094);
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
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:571:1: rule__Attribute__Group__5__Impl : ( ( rule__Attribute__TypeAssignment_5 ) ) ;
    public final void rule__Attribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:575:1: ( ( ( rule__Attribute__TypeAssignment_5 ) ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:576:1: ( ( rule__Attribute__TypeAssignment_5 ) )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:576:1: ( ( rule__Attribute__TypeAssignment_5 ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:577:1: ( rule__Attribute__TypeAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getTypeAssignment_5()); 
            }
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:578:1: ( rule__Attribute__TypeAssignment_5 )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:578:2: rule__Attribute__TypeAssignment_5
            {
            pushFollow(FOLLOW_rule__Attribute__TypeAssignment_5_in_rule__Attribute__Group__5__Impl1121);
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
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:588:1: rule__Attribute__Group__6 : rule__Attribute__Group__6__Impl ;
    public final void rule__Attribute__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:592:1: ( rule__Attribute__Group__6__Impl )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:593:2: rule__Attribute__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group__6__Impl_in_rule__Attribute__Group__61151);
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
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:599:1: rule__Attribute__Group__6__Impl : ( '}' ) ;
    public final void rule__Attribute__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:603:1: ( ( '}' ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:604:1: ( '}' )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:604:1: ( '}' )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:605:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_6()); 
            }
            match(input,17,FOLLOW_17_in_rule__Attribute__Group__6__Impl1179); if (state.failed) return ;
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


    // $ANTLR start "rule__RulePosition__Group__0"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:632:1: rule__RulePosition__Group__0 : rule__RulePosition__Group__0__Impl rule__RulePosition__Group__1 ;
    public final void rule__RulePosition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:636:1: ( rule__RulePosition__Group__0__Impl rule__RulePosition__Group__1 )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:637:2: rule__RulePosition__Group__0__Impl rule__RulePosition__Group__1
            {
            pushFollow(FOLLOW_rule__RulePosition__Group__0__Impl_in_rule__RulePosition__Group__01224);
            rule__RulePosition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RulePosition__Group__1_in_rule__RulePosition__Group__01227);
            rule__RulePosition__Group__1();

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
    // $ANTLR end "rule__RulePosition__Group__0"


    // $ANTLR start "rule__RulePosition__Group__0__Impl"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:644:1: rule__RulePosition__Group__0__Impl : ( 'rule' ) ;
    public final void rule__RulePosition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:648:1: ( ( 'rule' ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:649:1: ( 'rule' )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:649:1: ( 'rule' )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:650:1: 'rule'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulePositionAccess().getRuleKeyword_0()); 
            }
            match(input,18,FOLLOW_18_in_rule__RulePosition__Group__0__Impl1255); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRulePositionAccess().getRuleKeyword_0()); 
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
    // $ANTLR end "rule__RulePosition__Group__0__Impl"


    // $ANTLR start "rule__RulePosition__Group__1"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:663:1: rule__RulePosition__Group__1 : rule__RulePosition__Group__1__Impl rule__RulePosition__Group__2 ;
    public final void rule__RulePosition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:667:1: ( rule__RulePosition__Group__1__Impl rule__RulePosition__Group__2 )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:668:2: rule__RulePosition__Group__1__Impl rule__RulePosition__Group__2
            {
            pushFollow(FOLLOW_rule__RulePosition__Group__1__Impl_in_rule__RulePosition__Group__11286);
            rule__RulePosition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RulePosition__Group__2_in_rule__RulePosition__Group__11289);
            rule__RulePosition__Group__2();

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
    // $ANTLR end "rule__RulePosition__Group__1"


    // $ANTLR start "rule__RulePosition__Group__1__Impl"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:675:1: rule__RulePosition__Group__1__Impl : ( ( rule__RulePosition__NameAssignment_1 ) ) ;
    public final void rule__RulePosition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:679:1: ( ( ( rule__RulePosition__NameAssignment_1 ) ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:680:1: ( ( rule__RulePosition__NameAssignment_1 ) )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:680:1: ( ( rule__RulePosition__NameAssignment_1 ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:681:1: ( rule__RulePosition__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulePositionAccess().getNameAssignment_1()); 
            }
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:682:1: ( rule__RulePosition__NameAssignment_1 )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:682:2: rule__RulePosition__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__RulePosition__NameAssignment_1_in_rule__RulePosition__Group__1__Impl1316);
            rule__RulePosition__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRulePositionAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__RulePosition__Group__1__Impl"


    // $ANTLR start "rule__RulePosition__Group__2"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:692:1: rule__RulePosition__Group__2 : rule__RulePosition__Group__2__Impl rule__RulePosition__Group__3 ;
    public final void rule__RulePosition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:696:1: ( rule__RulePosition__Group__2__Impl rule__RulePosition__Group__3 )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:697:2: rule__RulePosition__Group__2__Impl rule__RulePosition__Group__3
            {
            pushFollow(FOLLOW_rule__RulePosition__Group__2__Impl_in_rule__RulePosition__Group__21346);
            rule__RulePosition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RulePosition__Group__3_in_rule__RulePosition__Group__21349);
            rule__RulePosition__Group__3();

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
    // $ANTLR end "rule__RulePosition__Group__2"


    // $ANTLR start "rule__RulePosition__Group__2__Impl"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:704:1: rule__RulePosition__Group__2__Impl : ( '{' ) ;
    public final void rule__RulePosition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:708:1: ( ( '{' ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:709:1: ( '{' )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:709:1: ( '{' )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:710:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulePositionAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,15,FOLLOW_15_in_rule__RulePosition__Group__2__Impl1377); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRulePositionAccess().getLeftCurlyBracketKeyword_2()); 
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
    // $ANTLR end "rule__RulePosition__Group__2__Impl"


    // $ANTLR start "rule__RulePosition__Group__3"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:723:1: rule__RulePosition__Group__3 : rule__RulePosition__Group__3__Impl rule__RulePosition__Group__4 ;
    public final void rule__RulePosition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:727:1: ( rule__RulePosition__Group__3__Impl rule__RulePosition__Group__4 )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:728:2: rule__RulePosition__Group__3__Impl rule__RulePosition__Group__4
            {
            pushFollow(FOLLOW_rule__RulePosition__Group__3__Impl_in_rule__RulePosition__Group__31408);
            rule__RulePosition__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RulePosition__Group__4_in_rule__RulePosition__Group__31411);
            rule__RulePosition__Group__4();

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
    // $ANTLR end "rule__RulePosition__Group__3"


    // $ANTLR start "rule__RulePosition__Group__3__Impl"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:735:1: rule__RulePosition__Group__3__Impl : ( ( rule__RulePosition__Alternatives_3 ) ) ;
    public final void rule__RulePosition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:739:1: ( ( ( rule__RulePosition__Alternatives_3 ) ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:740:1: ( ( rule__RulePosition__Alternatives_3 ) )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:740:1: ( ( rule__RulePosition__Alternatives_3 ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:741:1: ( rule__RulePosition__Alternatives_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulePositionAccess().getAlternatives_3()); 
            }
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:742:1: ( rule__RulePosition__Alternatives_3 )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:742:2: rule__RulePosition__Alternatives_3
            {
            pushFollow(FOLLOW_rule__RulePosition__Alternatives_3_in_rule__RulePosition__Group__3__Impl1438);
            rule__RulePosition__Alternatives_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRulePositionAccess().getAlternatives_3()); 
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
    // $ANTLR end "rule__RulePosition__Group__3__Impl"


    // $ANTLR start "rule__RulePosition__Group__4"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:752:1: rule__RulePosition__Group__4 : rule__RulePosition__Group__4__Impl rule__RulePosition__Group__5 ;
    public final void rule__RulePosition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:756:1: ( rule__RulePosition__Group__4__Impl rule__RulePosition__Group__5 )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:757:2: rule__RulePosition__Group__4__Impl rule__RulePosition__Group__5
            {
            pushFollow(FOLLOW_rule__RulePosition__Group__4__Impl_in_rule__RulePosition__Group__41468);
            rule__RulePosition__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RulePosition__Group__5_in_rule__RulePosition__Group__41471);
            rule__RulePosition__Group__5();

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
    // $ANTLR end "rule__RulePosition__Group__4"


    // $ANTLR start "rule__RulePosition__Group__4__Impl"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:764:1: rule__RulePosition__Group__4__Impl : ( ( rule__RulePosition__Alternatives_4 ) ) ;
    public final void rule__RulePosition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:768:1: ( ( ( rule__RulePosition__Alternatives_4 ) ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:769:1: ( ( rule__RulePosition__Alternatives_4 ) )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:769:1: ( ( rule__RulePosition__Alternatives_4 ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:770:1: ( rule__RulePosition__Alternatives_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulePositionAccess().getAlternatives_4()); 
            }
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:771:1: ( rule__RulePosition__Alternatives_4 )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:771:2: rule__RulePosition__Alternatives_4
            {
            pushFollow(FOLLOW_rule__RulePosition__Alternatives_4_in_rule__RulePosition__Group__4__Impl1498);
            rule__RulePosition__Alternatives_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRulePositionAccess().getAlternatives_4()); 
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
    // $ANTLR end "rule__RulePosition__Group__4__Impl"


    // $ANTLR start "rule__RulePosition__Group__5"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:781:1: rule__RulePosition__Group__5 : rule__RulePosition__Group__5__Impl rule__RulePosition__Group__6 ;
    public final void rule__RulePosition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:785:1: ( rule__RulePosition__Group__5__Impl rule__RulePosition__Group__6 )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:786:2: rule__RulePosition__Group__5__Impl rule__RulePosition__Group__6
            {
            pushFollow(FOLLOW_rule__RulePosition__Group__5__Impl_in_rule__RulePosition__Group__51528);
            rule__RulePosition__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RulePosition__Group__6_in_rule__RulePosition__Group__51531);
            rule__RulePosition__Group__6();

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
    // $ANTLR end "rule__RulePosition__Group__5"


    // $ANTLR start "rule__RulePosition__Group__5__Impl"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:793:1: rule__RulePosition__Group__5__Impl : ( 'attr' ) ;
    public final void rule__RulePosition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:797:1: ( ( 'attr' ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:798:1: ( 'attr' )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:798:1: ( 'attr' )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:799:1: 'attr'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulePositionAccess().getAttrKeyword_5()); 
            }
            match(input,14,FOLLOW_14_in_rule__RulePosition__Group__5__Impl1559); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRulePositionAccess().getAttrKeyword_5()); 
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
    // $ANTLR end "rule__RulePosition__Group__5__Impl"


    // $ANTLR start "rule__RulePosition__Group__6"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:812:1: rule__RulePosition__Group__6 : rule__RulePosition__Group__6__Impl rule__RulePosition__Group__7 ;
    public final void rule__RulePosition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:816:1: ( rule__RulePosition__Group__6__Impl rule__RulePosition__Group__7 )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:817:2: rule__RulePosition__Group__6__Impl rule__RulePosition__Group__7
            {
            pushFollow(FOLLOW_rule__RulePosition__Group__6__Impl_in_rule__RulePosition__Group__61590);
            rule__RulePosition__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RulePosition__Group__7_in_rule__RulePosition__Group__61593);
            rule__RulePosition__Group__7();

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
    // $ANTLR end "rule__RulePosition__Group__6"


    // $ANTLR start "rule__RulePosition__Group__6__Impl"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:824:1: rule__RulePosition__Group__6__Impl : ( ':' ) ;
    public final void rule__RulePosition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:828:1: ( ( ':' ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:829:1: ( ':' )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:829:1: ( ':' )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:830:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulePositionAccess().getColonKeyword_6()); 
            }
            match(input,12,FOLLOW_12_in_rule__RulePosition__Group__6__Impl1621); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRulePositionAccess().getColonKeyword_6()); 
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
    // $ANTLR end "rule__RulePosition__Group__6__Impl"


    // $ANTLR start "rule__RulePosition__Group__7"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:843:1: rule__RulePosition__Group__7 : rule__RulePosition__Group__7__Impl rule__RulePosition__Group__8 ;
    public final void rule__RulePosition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:847:1: ( rule__RulePosition__Group__7__Impl rule__RulePosition__Group__8 )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:848:2: rule__RulePosition__Group__7__Impl rule__RulePosition__Group__8
            {
            pushFollow(FOLLOW_rule__RulePosition__Group__7__Impl_in_rule__RulePosition__Group__71652);
            rule__RulePosition__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RulePosition__Group__8_in_rule__RulePosition__Group__71655);
            rule__RulePosition__Group__8();

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
    // $ANTLR end "rule__RulePosition__Group__7"


    // $ANTLR start "rule__RulePosition__Group__7__Impl"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:855:1: rule__RulePosition__Group__7__Impl : ( ( rule__RulePosition__AttrAssignment_7 ) ) ;
    public final void rule__RulePosition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:859:1: ( ( ( rule__RulePosition__AttrAssignment_7 ) ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:860:1: ( ( rule__RulePosition__AttrAssignment_7 ) )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:860:1: ( ( rule__RulePosition__AttrAssignment_7 ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:861:1: ( rule__RulePosition__AttrAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulePositionAccess().getAttrAssignment_7()); 
            }
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:862:1: ( rule__RulePosition__AttrAssignment_7 )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:862:2: rule__RulePosition__AttrAssignment_7
            {
            pushFollow(FOLLOW_rule__RulePosition__AttrAssignment_7_in_rule__RulePosition__Group__7__Impl1682);
            rule__RulePosition__AttrAssignment_7();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRulePositionAccess().getAttrAssignment_7()); 
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
    // $ANTLR end "rule__RulePosition__Group__7__Impl"


    // $ANTLR start "rule__RulePosition__Group__8"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:872:1: rule__RulePosition__Group__8 : rule__RulePosition__Group__8__Impl ;
    public final void rule__RulePosition__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:876:1: ( rule__RulePosition__Group__8__Impl )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:877:2: rule__RulePosition__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__RulePosition__Group__8__Impl_in_rule__RulePosition__Group__81712);
            rule__RulePosition__Group__8__Impl();

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
    // $ANTLR end "rule__RulePosition__Group__8"


    // $ANTLR start "rule__RulePosition__Group__8__Impl"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:883:1: rule__RulePosition__Group__8__Impl : ( '}' ) ;
    public final void rule__RulePosition__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:887:1: ( ( '}' ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:888:1: ( '}' )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:888:1: ( '}' )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:889:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulePositionAccess().getRightCurlyBracketKeyword_8()); 
            }
            match(input,17,FOLLOW_17_in_rule__RulePosition__Group__8__Impl1740); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRulePositionAccess().getRightCurlyBracketKeyword_8()); 
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
    // $ANTLR end "rule__RulePosition__Group__8__Impl"


    // $ANTLR start "rule__RulePosition__Group_3_0__0"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:920:1: rule__RulePosition__Group_3_0__0 : rule__RulePosition__Group_3_0__0__Impl rule__RulePosition__Group_3_0__1 ;
    public final void rule__RulePosition__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:924:1: ( rule__RulePosition__Group_3_0__0__Impl rule__RulePosition__Group_3_0__1 )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:925:2: rule__RulePosition__Group_3_0__0__Impl rule__RulePosition__Group_3_0__1
            {
            pushFollow(FOLLOW_rule__RulePosition__Group_3_0__0__Impl_in_rule__RulePosition__Group_3_0__01789);
            rule__RulePosition__Group_3_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RulePosition__Group_3_0__1_in_rule__RulePosition__Group_3_0__01792);
            rule__RulePosition__Group_3_0__1();

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
    // $ANTLR end "rule__RulePosition__Group_3_0__0"


    // $ANTLR start "rule__RulePosition__Group_3_0__0__Impl"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:932:1: rule__RulePosition__Group_3_0__0__Impl : ( 'start' ) ;
    public final void rule__RulePosition__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:936:1: ( ( 'start' ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:937:1: ( 'start' )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:937:1: ( 'start' )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:938:1: 'start'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulePositionAccess().getStartKeyword_3_0_0()); 
            }
            match(input,19,FOLLOW_19_in_rule__RulePosition__Group_3_0__0__Impl1820); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRulePositionAccess().getStartKeyword_3_0_0()); 
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
    // $ANTLR end "rule__RulePosition__Group_3_0__0__Impl"


    // $ANTLR start "rule__RulePosition__Group_3_0__1"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:951:1: rule__RulePosition__Group_3_0__1 : rule__RulePosition__Group_3_0__1__Impl rule__RulePosition__Group_3_0__2 ;
    public final void rule__RulePosition__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:955:1: ( rule__RulePosition__Group_3_0__1__Impl rule__RulePosition__Group_3_0__2 )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:956:2: rule__RulePosition__Group_3_0__1__Impl rule__RulePosition__Group_3_0__2
            {
            pushFollow(FOLLOW_rule__RulePosition__Group_3_0__1__Impl_in_rule__RulePosition__Group_3_0__11851);
            rule__RulePosition__Group_3_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RulePosition__Group_3_0__2_in_rule__RulePosition__Group_3_0__11854);
            rule__RulePosition__Group_3_0__2();

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
    // $ANTLR end "rule__RulePosition__Group_3_0__1"


    // $ANTLR start "rule__RulePosition__Group_3_0__1__Impl"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:963:1: rule__RulePosition__Group_3_0__1__Impl : ( ( rule__RulePosition__StartIndexAssignment_3_0_1 ) ) ;
    public final void rule__RulePosition__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:967:1: ( ( ( rule__RulePosition__StartIndexAssignment_3_0_1 ) ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:968:1: ( ( rule__RulePosition__StartIndexAssignment_3_0_1 ) )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:968:1: ( ( rule__RulePosition__StartIndexAssignment_3_0_1 ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:969:1: ( rule__RulePosition__StartIndexAssignment_3_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulePositionAccess().getStartIndexAssignment_3_0_1()); 
            }
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:970:1: ( rule__RulePosition__StartIndexAssignment_3_0_1 )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:970:2: rule__RulePosition__StartIndexAssignment_3_0_1
            {
            pushFollow(FOLLOW_rule__RulePosition__StartIndexAssignment_3_0_1_in_rule__RulePosition__Group_3_0__1__Impl1881);
            rule__RulePosition__StartIndexAssignment_3_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRulePositionAccess().getStartIndexAssignment_3_0_1()); 
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
    // $ANTLR end "rule__RulePosition__Group_3_0__1__Impl"


    // $ANTLR start "rule__RulePosition__Group_3_0__2"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:980:1: rule__RulePosition__Group_3_0__2 : rule__RulePosition__Group_3_0__2__Impl ;
    public final void rule__RulePosition__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:984:1: ( rule__RulePosition__Group_3_0__2__Impl )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:985:2: rule__RulePosition__Group_3_0__2__Impl
            {
            pushFollow(FOLLOW_rule__RulePosition__Group_3_0__2__Impl_in_rule__RulePosition__Group_3_0__21911);
            rule__RulePosition__Group_3_0__2__Impl();

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
    // $ANTLR end "rule__RulePosition__Group_3_0__2"


    // $ANTLR start "rule__RulePosition__Group_3_0__2__Impl"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:991:1: rule__RulePosition__Group_3_0__2__Impl : ( ',' ) ;
    public final void rule__RulePosition__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:995:1: ( ( ',' ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:996:1: ( ',' )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:996:1: ( ',' )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:997:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulePositionAccess().getCommaKeyword_3_0_2()); 
            }
            match(input,20,FOLLOW_20_in_rule__RulePosition__Group_3_0__2__Impl1939); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRulePositionAccess().getCommaKeyword_3_0_2()); 
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
    // $ANTLR end "rule__RulePosition__Group_3_0__2__Impl"


    // $ANTLR start "rule__RulePosition__Group_3_1__0"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1016:1: rule__RulePosition__Group_3_1__0 : rule__RulePosition__Group_3_1__0__Impl rule__RulePosition__Group_3_1__1 ;
    public final void rule__RulePosition__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1020:1: ( rule__RulePosition__Group_3_1__0__Impl rule__RulePosition__Group_3_1__1 )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1021:2: rule__RulePosition__Group_3_1__0__Impl rule__RulePosition__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__RulePosition__Group_3_1__0__Impl_in_rule__RulePosition__Group_3_1__01976);
            rule__RulePosition__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RulePosition__Group_3_1__1_in_rule__RulePosition__Group_3_1__01979);
            rule__RulePosition__Group_3_1__1();

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
    // $ANTLR end "rule__RulePosition__Group_3_1__0"


    // $ANTLR start "rule__RulePosition__Group_3_1__0__Impl"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1028:1: rule__RulePosition__Group_3_1__0__Impl : ( 'start' ) ;
    public final void rule__RulePosition__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1032:1: ( ( 'start' ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1033:1: ( 'start' )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1033:1: ( 'start' )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1034:1: 'start'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulePositionAccess().getStartKeyword_3_1_0()); 
            }
            match(input,19,FOLLOW_19_in_rule__RulePosition__Group_3_1__0__Impl2007); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRulePositionAccess().getStartKeyword_3_1_0()); 
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
    // $ANTLR end "rule__RulePosition__Group_3_1__0__Impl"


    // $ANTLR start "rule__RulePosition__Group_3_1__1"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1047:1: rule__RulePosition__Group_3_1__1 : rule__RulePosition__Group_3_1__1__Impl rule__RulePosition__Group_3_1__2 ;
    public final void rule__RulePosition__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1051:1: ( rule__RulePosition__Group_3_1__1__Impl rule__RulePosition__Group_3_1__2 )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1052:2: rule__RulePosition__Group_3_1__1__Impl rule__RulePosition__Group_3_1__2
            {
            pushFollow(FOLLOW_rule__RulePosition__Group_3_1__1__Impl_in_rule__RulePosition__Group_3_1__12038);
            rule__RulePosition__Group_3_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RulePosition__Group_3_1__2_in_rule__RulePosition__Group_3_1__12041);
            rule__RulePosition__Group_3_1__2();

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
    // $ANTLR end "rule__RulePosition__Group_3_1__1"


    // $ANTLR start "rule__RulePosition__Group_3_1__1__Impl"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1059:1: rule__RulePosition__Group_3_1__1__Impl : ( ( rule__RulePosition__StartDelimeterAssignment_3_1_1 ) ) ;
    public final void rule__RulePosition__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1063:1: ( ( ( rule__RulePosition__StartDelimeterAssignment_3_1_1 ) ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1064:1: ( ( rule__RulePosition__StartDelimeterAssignment_3_1_1 ) )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1064:1: ( ( rule__RulePosition__StartDelimeterAssignment_3_1_1 ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1065:1: ( rule__RulePosition__StartDelimeterAssignment_3_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulePositionAccess().getStartDelimeterAssignment_3_1_1()); 
            }
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1066:1: ( rule__RulePosition__StartDelimeterAssignment_3_1_1 )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1066:2: rule__RulePosition__StartDelimeterAssignment_3_1_1
            {
            pushFollow(FOLLOW_rule__RulePosition__StartDelimeterAssignment_3_1_1_in_rule__RulePosition__Group_3_1__1__Impl2068);
            rule__RulePosition__StartDelimeterAssignment_3_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRulePositionAccess().getStartDelimeterAssignment_3_1_1()); 
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
    // $ANTLR end "rule__RulePosition__Group_3_1__1__Impl"


    // $ANTLR start "rule__RulePosition__Group_3_1__2"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1076:1: rule__RulePosition__Group_3_1__2 : rule__RulePosition__Group_3_1__2__Impl ;
    public final void rule__RulePosition__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1080:1: ( rule__RulePosition__Group_3_1__2__Impl )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1081:2: rule__RulePosition__Group_3_1__2__Impl
            {
            pushFollow(FOLLOW_rule__RulePosition__Group_3_1__2__Impl_in_rule__RulePosition__Group_3_1__22098);
            rule__RulePosition__Group_3_1__2__Impl();

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
    // $ANTLR end "rule__RulePosition__Group_3_1__2"


    // $ANTLR start "rule__RulePosition__Group_3_1__2__Impl"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1087:1: rule__RulePosition__Group_3_1__2__Impl : ( ',' ) ;
    public final void rule__RulePosition__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1091:1: ( ( ',' ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1092:1: ( ',' )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1092:1: ( ',' )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1093:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulePositionAccess().getCommaKeyword_3_1_2()); 
            }
            match(input,20,FOLLOW_20_in_rule__RulePosition__Group_3_1__2__Impl2126); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRulePositionAccess().getCommaKeyword_3_1_2()); 
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
    // $ANTLR end "rule__RulePosition__Group_3_1__2__Impl"


    // $ANTLR start "rule__RulePosition__Group_4_0__0"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1112:1: rule__RulePosition__Group_4_0__0 : rule__RulePosition__Group_4_0__0__Impl rule__RulePosition__Group_4_0__1 ;
    public final void rule__RulePosition__Group_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1116:1: ( rule__RulePosition__Group_4_0__0__Impl rule__RulePosition__Group_4_0__1 )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1117:2: rule__RulePosition__Group_4_0__0__Impl rule__RulePosition__Group_4_0__1
            {
            pushFollow(FOLLOW_rule__RulePosition__Group_4_0__0__Impl_in_rule__RulePosition__Group_4_0__02163);
            rule__RulePosition__Group_4_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RulePosition__Group_4_0__1_in_rule__RulePosition__Group_4_0__02166);
            rule__RulePosition__Group_4_0__1();

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
    // $ANTLR end "rule__RulePosition__Group_4_0__0"


    // $ANTLR start "rule__RulePosition__Group_4_0__0__Impl"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1124:1: rule__RulePosition__Group_4_0__0__Impl : ( 'end' ) ;
    public final void rule__RulePosition__Group_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1128:1: ( ( 'end' ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1129:1: ( 'end' )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1129:1: ( 'end' )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1130:1: 'end'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulePositionAccess().getEndKeyword_4_0_0()); 
            }
            match(input,21,FOLLOW_21_in_rule__RulePosition__Group_4_0__0__Impl2194); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRulePositionAccess().getEndKeyword_4_0_0()); 
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
    // $ANTLR end "rule__RulePosition__Group_4_0__0__Impl"


    // $ANTLR start "rule__RulePosition__Group_4_0__1"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1143:1: rule__RulePosition__Group_4_0__1 : rule__RulePosition__Group_4_0__1__Impl rule__RulePosition__Group_4_0__2 ;
    public final void rule__RulePosition__Group_4_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1147:1: ( rule__RulePosition__Group_4_0__1__Impl rule__RulePosition__Group_4_0__2 )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1148:2: rule__RulePosition__Group_4_0__1__Impl rule__RulePosition__Group_4_0__2
            {
            pushFollow(FOLLOW_rule__RulePosition__Group_4_0__1__Impl_in_rule__RulePosition__Group_4_0__12225);
            rule__RulePosition__Group_4_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RulePosition__Group_4_0__2_in_rule__RulePosition__Group_4_0__12228);
            rule__RulePosition__Group_4_0__2();

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
    // $ANTLR end "rule__RulePosition__Group_4_0__1"


    // $ANTLR start "rule__RulePosition__Group_4_0__1__Impl"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1155:1: rule__RulePosition__Group_4_0__1__Impl : ( ( rule__RulePosition__EndIndexAssignment_4_0_1 ) ) ;
    public final void rule__RulePosition__Group_4_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1159:1: ( ( ( rule__RulePosition__EndIndexAssignment_4_0_1 ) ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1160:1: ( ( rule__RulePosition__EndIndexAssignment_4_0_1 ) )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1160:1: ( ( rule__RulePosition__EndIndexAssignment_4_0_1 ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1161:1: ( rule__RulePosition__EndIndexAssignment_4_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulePositionAccess().getEndIndexAssignment_4_0_1()); 
            }
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1162:1: ( rule__RulePosition__EndIndexAssignment_4_0_1 )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1162:2: rule__RulePosition__EndIndexAssignment_4_0_1
            {
            pushFollow(FOLLOW_rule__RulePosition__EndIndexAssignment_4_0_1_in_rule__RulePosition__Group_4_0__1__Impl2255);
            rule__RulePosition__EndIndexAssignment_4_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRulePositionAccess().getEndIndexAssignment_4_0_1()); 
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
    // $ANTLR end "rule__RulePosition__Group_4_0__1__Impl"


    // $ANTLR start "rule__RulePosition__Group_4_0__2"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1172:1: rule__RulePosition__Group_4_0__2 : rule__RulePosition__Group_4_0__2__Impl ;
    public final void rule__RulePosition__Group_4_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1176:1: ( rule__RulePosition__Group_4_0__2__Impl )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1177:2: rule__RulePosition__Group_4_0__2__Impl
            {
            pushFollow(FOLLOW_rule__RulePosition__Group_4_0__2__Impl_in_rule__RulePosition__Group_4_0__22285);
            rule__RulePosition__Group_4_0__2__Impl();

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
    // $ANTLR end "rule__RulePosition__Group_4_0__2"


    // $ANTLR start "rule__RulePosition__Group_4_0__2__Impl"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1183:1: rule__RulePosition__Group_4_0__2__Impl : ( ',' ) ;
    public final void rule__RulePosition__Group_4_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1187:1: ( ( ',' ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1188:1: ( ',' )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1188:1: ( ',' )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1189:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulePositionAccess().getCommaKeyword_4_0_2()); 
            }
            match(input,20,FOLLOW_20_in_rule__RulePosition__Group_4_0__2__Impl2313); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRulePositionAccess().getCommaKeyword_4_0_2()); 
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
    // $ANTLR end "rule__RulePosition__Group_4_0__2__Impl"


    // $ANTLR start "rule__RulePosition__Group_4_1__0"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1208:1: rule__RulePosition__Group_4_1__0 : rule__RulePosition__Group_4_1__0__Impl rule__RulePosition__Group_4_1__1 ;
    public final void rule__RulePosition__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1212:1: ( rule__RulePosition__Group_4_1__0__Impl rule__RulePosition__Group_4_1__1 )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1213:2: rule__RulePosition__Group_4_1__0__Impl rule__RulePosition__Group_4_1__1
            {
            pushFollow(FOLLOW_rule__RulePosition__Group_4_1__0__Impl_in_rule__RulePosition__Group_4_1__02350);
            rule__RulePosition__Group_4_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RulePosition__Group_4_1__1_in_rule__RulePosition__Group_4_1__02353);
            rule__RulePosition__Group_4_1__1();

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
    // $ANTLR end "rule__RulePosition__Group_4_1__0"


    // $ANTLR start "rule__RulePosition__Group_4_1__0__Impl"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1220:1: rule__RulePosition__Group_4_1__0__Impl : ( 'end' ) ;
    public final void rule__RulePosition__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1224:1: ( ( 'end' ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1225:1: ( 'end' )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1225:1: ( 'end' )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1226:1: 'end'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulePositionAccess().getEndKeyword_4_1_0()); 
            }
            match(input,21,FOLLOW_21_in_rule__RulePosition__Group_4_1__0__Impl2381); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRulePositionAccess().getEndKeyword_4_1_0()); 
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
    // $ANTLR end "rule__RulePosition__Group_4_1__0__Impl"


    // $ANTLR start "rule__RulePosition__Group_4_1__1"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1239:1: rule__RulePosition__Group_4_1__1 : rule__RulePosition__Group_4_1__1__Impl rule__RulePosition__Group_4_1__2 ;
    public final void rule__RulePosition__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1243:1: ( rule__RulePosition__Group_4_1__1__Impl rule__RulePosition__Group_4_1__2 )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1244:2: rule__RulePosition__Group_4_1__1__Impl rule__RulePosition__Group_4_1__2
            {
            pushFollow(FOLLOW_rule__RulePosition__Group_4_1__1__Impl_in_rule__RulePosition__Group_4_1__12412);
            rule__RulePosition__Group_4_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RulePosition__Group_4_1__2_in_rule__RulePosition__Group_4_1__12415);
            rule__RulePosition__Group_4_1__2();

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
    // $ANTLR end "rule__RulePosition__Group_4_1__1"


    // $ANTLR start "rule__RulePosition__Group_4_1__1__Impl"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1251:1: rule__RulePosition__Group_4_1__1__Impl : ( ( rule__RulePosition__EndDelimeterAssignment_4_1_1 ) ) ;
    public final void rule__RulePosition__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1255:1: ( ( ( rule__RulePosition__EndDelimeterAssignment_4_1_1 ) ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1256:1: ( ( rule__RulePosition__EndDelimeterAssignment_4_1_1 ) )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1256:1: ( ( rule__RulePosition__EndDelimeterAssignment_4_1_1 ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1257:1: ( rule__RulePosition__EndDelimeterAssignment_4_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulePositionAccess().getEndDelimeterAssignment_4_1_1()); 
            }
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1258:1: ( rule__RulePosition__EndDelimeterAssignment_4_1_1 )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1258:2: rule__RulePosition__EndDelimeterAssignment_4_1_1
            {
            pushFollow(FOLLOW_rule__RulePosition__EndDelimeterAssignment_4_1_1_in_rule__RulePosition__Group_4_1__1__Impl2442);
            rule__RulePosition__EndDelimeterAssignment_4_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRulePositionAccess().getEndDelimeterAssignment_4_1_1()); 
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
    // $ANTLR end "rule__RulePosition__Group_4_1__1__Impl"


    // $ANTLR start "rule__RulePosition__Group_4_1__2"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1268:1: rule__RulePosition__Group_4_1__2 : rule__RulePosition__Group_4_1__2__Impl ;
    public final void rule__RulePosition__Group_4_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1272:1: ( rule__RulePosition__Group_4_1__2__Impl )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1273:2: rule__RulePosition__Group_4_1__2__Impl
            {
            pushFollow(FOLLOW_rule__RulePosition__Group_4_1__2__Impl_in_rule__RulePosition__Group_4_1__22472);
            rule__RulePosition__Group_4_1__2__Impl();

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
    // $ANTLR end "rule__RulePosition__Group_4_1__2"


    // $ANTLR start "rule__RulePosition__Group_4_1__2__Impl"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1279:1: rule__RulePosition__Group_4_1__2__Impl : ( ',' ) ;
    public final void rule__RulePosition__Group_4_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1283:1: ( ( ',' ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1284:1: ( ',' )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1284:1: ( ',' )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1285:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulePositionAccess().getCommaKeyword_4_1_2()); 
            }
            match(input,20,FOLLOW_20_in_rule__RulePosition__Group_4_1__2__Impl2500); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRulePositionAccess().getCommaKeyword_4_1_2()); 
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
    // $ANTLR end "rule__RulePosition__Group_4_1__2__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1304:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1308:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1309:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__02537);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__02540);
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
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1316:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1320:1: ( ( RULE_ID ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1321:1: ( RULE_ID )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1321:1: ( RULE_ID )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1322:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl2567); if (state.failed) return ;
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
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1333:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1337:1: ( rule__QualifiedName__Group__1__Impl )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1338:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__12596);
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
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1344:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1348:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1349:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1349:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1350:1: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1351:1: ( rule__QualifiedName__Group_1__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==22) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1351:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl2623);
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
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1365:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1369:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1370:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__02658);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__02661);
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
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1377:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1381:1: ( ( '.' ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1382:1: ( '.' )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1382:1: ( '.' )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1383:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            match(input,22,FOLLOW_22_in_rule__QualifiedName__Group_1__0__Impl2689); if (state.failed) return ;
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
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1396:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1400:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1401:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__12720);
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
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1407:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1411:1: ( ( RULE_ID ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1412:1: ( RULE_ID )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1412:1: ( RULE_ID )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1413:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl2747); if (state.failed) return ;
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
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1429:1: rule__Model__UnorderedGroup : rule__Model__UnorderedGroup__0 {...}?;
    public final void rule__Model__UnorderedGroup() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getModelAccess().getUnorderedGroup());
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1434:1: ( rule__Model__UnorderedGroup__0 {...}?)
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1435:2: rule__Model__UnorderedGroup__0 {...}?
            {
            pushFollow(FOLLOW_rule__Model__UnorderedGroup__0_in_rule__Model__UnorderedGroup2781);
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
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1446:1: rule__Model__UnorderedGroup__Impl : ( ({...}? => ( ( ( rule__Model__Group_0__0 ) ) ) ) | ({...}? => ( ( ( ( rule__Model__RulesAssignment_1 ) ) ( ( ( rule__Model__RulesAssignment_1 )=> rule__Model__RulesAssignment_1 )* ) ) ) ) ) ;
    public final void rule__Model__UnorderedGroup__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1451:1: ( ( ({...}? => ( ( ( rule__Model__Group_0__0 ) ) ) ) | ({...}? => ( ( ( ( rule__Model__RulesAssignment_1 ) ) ( ( ( rule__Model__RulesAssignment_1 )=> rule__Model__RulesAssignment_1 )* ) ) ) ) ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1452:3: ( ({...}? => ( ( ( rule__Model__Group_0__0 ) ) ) ) | ({...}? => ( ( ( ( rule__Model__RulesAssignment_1 ) ) ( ( ( rule__Model__RulesAssignment_1 )=> rule__Model__RulesAssignment_1 )* ) ) ) ) )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1452:3: ( ({...}? => ( ( ( rule__Model__Group_0__0 ) ) ) ) | ({...}? => ( ( ( ( rule__Model__RulesAssignment_1 ) ) ( ( ( rule__Model__RulesAssignment_1 )=> rule__Model__RulesAssignment_1 )* ) ) ) ) )
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
                    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1454:4: ({...}? => ( ( ( rule__Model__Group_0__0 ) ) ) )
                    {
                    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1454:4: ({...}? => ( ( ( rule__Model__Group_0__0 ) ) ) )
                    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1455:5: {...}? => ( ( ( rule__Model__Group_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Model__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 0)");
                    }
                    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1455:100: ( ( ( rule__Model__Group_0__0 ) ) )
                    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1456:6: ( ( rule__Model__Group_0__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup(), 0);
                    selected = true;
                    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1462:6: ( ( rule__Model__Group_0__0 ) )
                    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1464:7: ( rule__Model__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModelAccess().getGroup_0()); 
                    }
                    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1465:7: ( rule__Model__Group_0__0 )
                    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1465:8: rule__Model__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Model__Group_0__0_in_rule__Model__UnorderedGroup__Impl2870);
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
                    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1471:4: ({...}? => ( ( ( ( rule__Model__RulesAssignment_1 ) ) ( ( ( rule__Model__RulesAssignment_1 )=> rule__Model__RulesAssignment_1 )* ) ) ) )
                    {
                    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1471:4: ({...}? => ( ( ( ( rule__Model__RulesAssignment_1 ) ) ( ( ( rule__Model__RulesAssignment_1 )=> rule__Model__RulesAssignment_1 )* ) ) ) )
                    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1472:5: {...}? => ( ( ( ( rule__Model__RulesAssignment_1 ) ) ( ( ( rule__Model__RulesAssignment_1 )=> rule__Model__RulesAssignment_1 )* ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Model__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1)");
                    }
                    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1472:100: ( ( ( ( rule__Model__RulesAssignment_1 ) ) ( ( ( rule__Model__RulesAssignment_1 )=> rule__Model__RulesAssignment_1 )* ) ) )
                    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1473:6: ( ( ( rule__Model__RulesAssignment_1 ) ) ( ( ( rule__Model__RulesAssignment_1 )=> rule__Model__RulesAssignment_1 )* ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup(), 1);
                    selected = true;
                    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1479:6: ( ( ( rule__Model__RulesAssignment_1 ) ) ( ( ( rule__Model__RulesAssignment_1 )=> rule__Model__RulesAssignment_1 )* ) )
                    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1480:6: ( ( rule__Model__RulesAssignment_1 ) ) ( ( ( rule__Model__RulesAssignment_1 )=> rule__Model__RulesAssignment_1 )* )
                    {
                    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1480:6: ( ( rule__Model__RulesAssignment_1 ) )
                    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1481:7: ( rule__Model__RulesAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModelAccess().getRulesAssignment_1()); 
                    }
                    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1482:7: ( rule__Model__RulesAssignment_1 )
                    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1482:8: rule__Model__RulesAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Model__RulesAssignment_1_in_rule__Model__UnorderedGroup__Impl2962);
                    rule__Model__RulesAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getModelAccess().getRulesAssignment_1()); 
                    }

                    }

                    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1485:6: ( ( ( rule__Model__RulesAssignment_1 )=> rule__Model__RulesAssignment_1 )* )
                    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1486:7: ( ( rule__Model__RulesAssignment_1 )=> rule__Model__RulesAssignment_1 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModelAccess().getRulesAssignment_1()); 
                    }
                    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1487:7: ( ( rule__Model__RulesAssignment_1 )=> rule__Model__RulesAssignment_1 )*
                    loop5:
                    do {
                        int alt5=2;
                        alt5 = dfa5.predict(input);
                        switch (alt5) {
                    	case 1 :
                    	    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1487:8: ( rule__Model__RulesAssignment_1 )=> rule__Model__RulesAssignment_1
                    	    {
                    	    pushFollow(FOLLOW_rule__Model__RulesAssignment_1_in_rule__Model__UnorderedGroup__Impl3006);
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
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1502:1: rule__Model__UnorderedGroup__0 : rule__Model__UnorderedGroup__Impl ( rule__Model__UnorderedGroup__1 )? ;
    public final void rule__Model__UnorderedGroup__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1506:1: ( rule__Model__UnorderedGroup__Impl ( rule__Model__UnorderedGroup__1 )? )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1507:2: rule__Model__UnorderedGroup__Impl ( rule__Model__UnorderedGroup__1 )?
            {
            pushFollow(FOLLOW_rule__Model__UnorderedGroup__Impl_in_rule__Model__UnorderedGroup__03072);
            rule__Model__UnorderedGroup__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1508:2: ( rule__Model__UnorderedGroup__1 )?
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
                    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1508:2: rule__Model__UnorderedGroup__1
                    {
                    pushFollow(FOLLOW_rule__Model__UnorderedGroup__1_in_rule__Model__UnorderedGroup__03075);
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
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1515:1: rule__Model__UnorderedGroup__1 : rule__Model__UnorderedGroup__Impl ;
    public final void rule__Model__UnorderedGroup__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1519:1: ( rule__Model__UnorderedGroup__Impl )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1520:2: rule__Model__UnorderedGroup__Impl
            {
            pushFollow(FOLLOW_rule__Model__UnorderedGroup__Impl_in_rule__Model__UnorderedGroup__13100);
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
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1531:1: rule__Model__NameAssignment_0_2 : ( RULE_ID ) ;
    public final void rule__Model__NameAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1535:1: ( ( RULE_ID ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1536:1: ( RULE_ID )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1536:1: ( RULE_ID )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1537:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_0_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Model__NameAssignment_0_23132); if (state.failed) return ;
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
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1546:1: rule__Model__AttributesAssignment_0_4 : ( ruleAttribute ) ;
    public final void rule__Model__AttributesAssignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1550:1: ( ( ruleAttribute ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1551:1: ( ruleAttribute )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1551:1: ( ruleAttribute )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1552:1: ruleAttribute
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getAttributesAttributeParserRuleCall_0_4_0()); 
            }
            pushFollow(FOLLOW_ruleAttribute_in_rule__Model__AttributesAssignment_0_43163);
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
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1561:1: rule__Model__RulesAssignment_1 : ( ruleRule ) ;
    public final void rule__Model__RulesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1565:1: ( ( ruleRule ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1566:1: ( ruleRule )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1566:1: ( ruleRule )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1567:1: ruleRule
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getRulesRuleParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleRule_in_rule__Model__RulesAssignment_13194);
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
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1576:1: rule__Attribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1580:1: ( ( RULE_ID ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1581:1: ( RULE_ID )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1581:1: ( RULE_ID )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1582:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_13225); if (state.failed) return ;
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
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1591:1: rule__Attribute__TypeAssignment_5 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Attribute__TypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1595:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1596:1: ( ( ruleQualifiedName ) )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1596:1: ( ( ruleQualifiedName ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1597:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getTypeJvmTypeCrossReference_5_0()); 
            }
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1598:1: ( ruleQualifiedName )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1599:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getTypeJvmTypeQualifiedNameParserRuleCall_5_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Attribute__TypeAssignment_53260);
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


    // $ANTLR start "rule__RulePosition__NameAssignment_1"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1610:1: rule__RulePosition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RulePosition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1614:1: ( ( RULE_ID ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1615:1: ( RULE_ID )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1615:1: ( RULE_ID )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1616:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulePositionAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RulePosition__NameAssignment_13295); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRulePositionAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__RulePosition__NameAssignment_1"


    // $ANTLR start "rule__RulePosition__StartIndexAssignment_3_0_1"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1625:1: rule__RulePosition__StartIndexAssignment_3_0_1 : ( RULE_INT ) ;
    public final void rule__RulePosition__StartIndexAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1629:1: ( ( RULE_INT ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1630:1: ( RULE_INT )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1630:1: ( RULE_INT )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1631:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulePositionAccess().getStartIndexINTTerminalRuleCall_3_0_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__RulePosition__StartIndexAssignment_3_0_13326); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRulePositionAccess().getStartIndexINTTerminalRuleCall_3_0_1_0()); 
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
    // $ANTLR end "rule__RulePosition__StartIndexAssignment_3_0_1"


    // $ANTLR start "rule__RulePosition__StartDelimeterAssignment_3_1_1"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1640:1: rule__RulePosition__StartDelimeterAssignment_3_1_1 : ( RULE_STRING ) ;
    public final void rule__RulePosition__StartDelimeterAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1644:1: ( ( RULE_STRING ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1645:1: ( RULE_STRING )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1645:1: ( RULE_STRING )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1646:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulePositionAccess().getStartDelimeterSTRINGTerminalRuleCall_3_1_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__RulePosition__StartDelimeterAssignment_3_1_13357); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRulePositionAccess().getStartDelimeterSTRINGTerminalRuleCall_3_1_1_0()); 
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
    // $ANTLR end "rule__RulePosition__StartDelimeterAssignment_3_1_1"


    // $ANTLR start "rule__RulePosition__EndIndexAssignment_4_0_1"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1655:1: rule__RulePosition__EndIndexAssignment_4_0_1 : ( RULE_INT ) ;
    public final void rule__RulePosition__EndIndexAssignment_4_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1659:1: ( ( RULE_INT ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1660:1: ( RULE_INT )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1660:1: ( RULE_INT )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1661:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulePositionAccess().getEndIndexINTTerminalRuleCall_4_0_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__RulePosition__EndIndexAssignment_4_0_13388); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRulePositionAccess().getEndIndexINTTerminalRuleCall_4_0_1_0()); 
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
    // $ANTLR end "rule__RulePosition__EndIndexAssignment_4_0_1"


    // $ANTLR start "rule__RulePosition__EndDelimeterAssignment_4_1_1"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1670:1: rule__RulePosition__EndDelimeterAssignment_4_1_1 : ( RULE_STRING ) ;
    public final void rule__RulePosition__EndDelimeterAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1674:1: ( ( RULE_STRING ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1675:1: ( RULE_STRING )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1675:1: ( RULE_STRING )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1676:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulePositionAccess().getEndDelimeterSTRINGTerminalRuleCall_4_1_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__RulePosition__EndDelimeterAssignment_4_1_13419); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRulePositionAccess().getEndDelimeterSTRINGTerminalRuleCall_4_1_1_0()); 
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
    // $ANTLR end "rule__RulePosition__EndDelimeterAssignment_4_1_1"


    // $ANTLR start "rule__RulePosition__AttrAssignment_7"
    // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1685:1: rule__RulePosition__AttrAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__RulePosition__AttrAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1689:1: ( ( ( RULE_ID ) ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1690:1: ( ( RULE_ID ) )
            {
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1690:1: ( ( RULE_ID ) )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1691:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulePositionAccess().getAttrAttributeCrossReference_7_0()); 
            }
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1692:1: ( RULE_ID )
            // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1693:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRulePositionAccess().getAttrAttributeIDTerminalRuleCall_7_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RulePosition__AttrAssignment_73454); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRulePositionAccess().getAttrAttributeIDTerminalRuleCall_7_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRulePositionAccess().getAttrAttributeCrossReference_7_0()); 
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
    // $ANTLR end "rule__RulePosition__AttrAssignment_7"

    // $ANTLR start synpred1_InternalS2M
    public final void synpred1_InternalS2M_fragment() throws RecognitionException {   
        // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1487:8: ( rule__Model__RulesAssignment_1 )
        // ../org.yazgel.regex.s2m.ui/src-gen/org/yazgel/regex/s2m/ui/contentassist/antlr/internal/InternalS2M.g:1487:9: rule__Model__RulesAssignment_1
        {
        pushFollow(FOLLOW_rule__Model__RulesAssignment_1_in_synpred1_InternalS2M3003);
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
            "\1\6\1\7",
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
            return "()* loopback of 1487:7: ( ( rule__Model__RulesAssignment_1 )=> rule__Model__RulesAssignment_1 )*";
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
    public static final BitSet FOLLOW_ruleRulePosition_in_ruleRule214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRulePosition_in_entryRuleRulePosition240 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRulePosition247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RulePosition__Group__0_in_ruleRulePosition273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName300 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RulePosition__Group_3_0__0_in_rule__RulePosition__Alternatives_3369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RulePosition__Group_3_1__0_in_rule__RulePosition__Alternatives_3387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RulePosition__Group_4_0__0_in_rule__RulePosition__Alternatives_4420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RulePosition__Group_4_1__0_in_rule__RulePosition__Alternatives_4438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_0__0__Impl_in_rule__Model__Group_0__0469 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Model__Group_0__1_in_rule__Model__Group_0__0472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Model__Group_0__0__Impl500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_0__1__Impl_in_rule__Model__Group_0__1531 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Model__Group_0__2_in_rule__Model__Group_0__1534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Model__Group_0__1__Impl562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_0__2__Impl_in_rule__Model__Group_0__2593 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Model__Group_0__3_in_rule__Model__Group_0__2596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__NameAssignment_0_2_in_rule__Model__Group_0__2__Impl623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_0__3__Impl_in_rule__Model__Group_0__3653 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Model__Group_0__4_in_rule__Model__Group_0__3656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Model__Group_0__3__Impl684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_0__4__Impl_in_rule__Model__Group_0__4715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__AttributesAssignment_0_4_in_rule__Model__Group_0__4__Impl742 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__0783 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__0786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Attribute__Group__0__Impl814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__1845 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__1848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__NameAssignment_1_in_rule__Attribute__Group__1__Impl875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__2905 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__3_in_rule__Attribute__Group__2908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Attribute__Group__2__Impl936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__3__Impl_in_rule__Attribute__Group__3967 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__4_in_rule__Attribute__Group__3970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Attribute__Group__3__Impl998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__4__Impl_in_rule__Attribute__Group__41029 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Attribute__Group__5_in_rule__Attribute__Group__41032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Attribute__Group__4__Impl1060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__5__Impl_in_rule__Attribute__Group__51091 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__6_in_rule__Attribute__Group__51094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__TypeAssignment_5_in_rule__Attribute__Group__5__Impl1121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__6__Impl_in_rule__Attribute__Group__61151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Attribute__Group__6__Impl1179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RulePosition__Group__0__Impl_in_rule__RulePosition__Group__01224 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RulePosition__Group__1_in_rule__RulePosition__Group__01227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__RulePosition__Group__0__Impl1255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RulePosition__Group__1__Impl_in_rule__RulePosition__Group__11286 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__RulePosition__Group__2_in_rule__RulePosition__Group__11289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RulePosition__NameAssignment_1_in_rule__RulePosition__Group__1__Impl1316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RulePosition__Group__2__Impl_in_rule__RulePosition__Group__21346 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__RulePosition__Group__3_in_rule__RulePosition__Group__21349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__RulePosition__Group__2__Impl1377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RulePosition__Group__3__Impl_in_rule__RulePosition__Group__31408 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__RulePosition__Group__4_in_rule__RulePosition__Group__31411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RulePosition__Alternatives_3_in_rule__RulePosition__Group__3__Impl1438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RulePosition__Group__4__Impl_in_rule__RulePosition__Group__41468 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__RulePosition__Group__5_in_rule__RulePosition__Group__41471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RulePosition__Alternatives_4_in_rule__RulePosition__Group__4__Impl1498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RulePosition__Group__5__Impl_in_rule__RulePosition__Group__51528 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__RulePosition__Group__6_in_rule__RulePosition__Group__51531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__RulePosition__Group__5__Impl1559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RulePosition__Group__6__Impl_in_rule__RulePosition__Group__61590 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RulePosition__Group__7_in_rule__RulePosition__Group__61593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__RulePosition__Group__6__Impl1621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RulePosition__Group__7__Impl_in_rule__RulePosition__Group__71652 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__RulePosition__Group__8_in_rule__RulePosition__Group__71655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RulePosition__AttrAssignment_7_in_rule__RulePosition__Group__7__Impl1682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RulePosition__Group__8__Impl_in_rule__RulePosition__Group__81712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__RulePosition__Group__8__Impl1740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RulePosition__Group_3_0__0__Impl_in_rule__RulePosition__Group_3_0__01789 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__RulePosition__Group_3_0__1_in_rule__RulePosition__Group_3_0__01792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__RulePosition__Group_3_0__0__Impl1820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RulePosition__Group_3_0__1__Impl_in_rule__RulePosition__Group_3_0__11851 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__RulePosition__Group_3_0__2_in_rule__RulePosition__Group_3_0__11854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RulePosition__StartIndexAssignment_3_0_1_in_rule__RulePosition__Group_3_0__1__Impl1881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RulePosition__Group_3_0__2__Impl_in_rule__RulePosition__Group_3_0__21911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__RulePosition__Group_3_0__2__Impl1939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RulePosition__Group_3_1__0__Impl_in_rule__RulePosition__Group_3_1__01976 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__RulePosition__Group_3_1__1_in_rule__RulePosition__Group_3_1__01979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__RulePosition__Group_3_1__0__Impl2007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RulePosition__Group_3_1__1__Impl_in_rule__RulePosition__Group_3_1__12038 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__RulePosition__Group_3_1__2_in_rule__RulePosition__Group_3_1__12041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RulePosition__StartDelimeterAssignment_3_1_1_in_rule__RulePosition__Group_3_1__1__Impl2068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RulePosition__Group_3_1__2__Impl_in_rule__RulePosition__Group_3_1__22098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__RulePosition__Group_3_1__2__Impl2126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RulePosition__Group_4_0__0__Impl_in_rule__RulePosition__Group_4_0__02163 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__RulePosition__Group_4_0__1_in_rule__RulePosition__Group_4_0__02166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__RulePosition__Group_4_0__0__Impl2194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RulePosition__Group_4_0__1__Impl_in_rule__RulePosition__Group_4_0__12225 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__RulePosition__Group_4_0__2_in_rule__RulePosition__Group_4_0__12228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RulePosition__EndIndexAssignment_4_0_1_in_rule__RulePosition__Group_4_0__1__Impl2255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RulePosition__Group_4_0__2__Impl_in_rule__RulePosition__Group_4_0__22285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__RulePosition__Group_4_0__2__Impl2313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RulePosition__Group_4_1__0__Impl_in_rule__RulePosition__Group_4_1__02350 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__RulePosition__Group_4_1__1_in_rule__RulePosition__Group_4_1__02353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__RulePosition__Group_4_1__0__Impl2381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RulePosition__Group_4_1__1__Impl_in_rule__RulePosition__Group_4_1__12412 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__RulePosition__Group_4_1__2_in_rule__RulePosition__Group_4_1__12415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RulePosition__EndDelimeterAssignment_4_1_1_in_rule__RulePosition__Group_4_1__1__Impl2442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RulePosition__Group_4_1__2__Impl_in_rule__RulePosition__Group_4_1__22472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__RulePosition__Group_4_1__2__Impl2500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__02537 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__02540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl2567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__12596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl2623 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__02658 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__02661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__QualifiedName__Group_1__0__Impl2689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__12720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl2747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__UnorderedGroup__0_in_rule__Model__UnorderedGroup2781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_0__0_in_rule__Model__UnorderedGroup__Impl2870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__RulesAssignment_1_in_rule__Model__UnorderedGroup__Impl2962 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__Model__RulesAssignment_1_in_rule__Model__UnorderedGroup__Impl3006 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__Model__UnorderedGroup__Impl_in_rule__Model__UnorderedGroup__03072 = new BitSet(new long[]{0x0000000000040802L});
    public static final BitSet FOLLOW_rule__Model__UnorderedGroup__1_in_rule__Model__UnorderedGroup__03075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__UnorderedGroup__Impl_in_rule__Model__UnorderedGroup__13100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Model__NameAssignment_0_23132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__Model__AttributesAssignment_0_43163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_rule__Model__RulesAssignment_13194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_13225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Attribute__TypeAssignment_53260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RulePosition__NameAssignment_13295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__RulePosition__StartIndexAssignment_3_0_13326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__RulePosition__StartDelimeterAssignment_3_1_13357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__RulePosition__EndIndexAssignment_4_0_13388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__RulePosition__EndDelimeterAssignment_4_1_13419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RulePosition__AttrAssignment_73454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__RulesAssignment_1_in_synpred1_InternalS2M3003 = new BitSet(new long[]{0x0000000000000002L});

}
