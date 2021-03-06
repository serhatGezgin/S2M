/*
 * generated by Xtext
 */
package org.yazgel.regex.s2m.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.yazgel.regex.s2m.services.S2MGrammarAccess;

public class S2MParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private S2MGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.yazgel.regex.s2m.parser.antlr.internal.InternalS2MParser createParser(XtextTokenStream stream) {
		return new org.yazgel.regex.s2m.parser.antlr.internal.InternalS2MParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}
	
	public S2MGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(S2MGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
