// Generated from EclRecord.g4 by ANTLR 4.5
package org.hpccsystems.ws.client.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EclRecordParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, OPAREN=8, CPAREN=9, 
		OCURLY=10, CCURLY=11, COMMA=12, SEMI=13, EQ=14, ASSING_SYM=15, REC_SYM=16, 
		END_SYM=17, DATASET_SYM=18, WS=19, INT=20, STRING=21, TOKEN=22, UTOKEN=23, 
		COMMENT=24, ML_COMMENT=25, ECL_NUMBERED_TYPE=26;
	public static final int
		RULE_program = 0, RULE_value = 1, RULE_value_list = 2, RULE_token_list = 3, 
		RULE_assign = 4, RULE_assign_list = 5, RULE_eclfield_decl = 6, RULE_eclfield_type = 7, 
		RULE_eclfield_name = 8, RULE_eclfield_recref = 9, RULE_record_def_inline = 10, 
		RULE_record_def = 11, RULE_defined_record_def = 12, RULE_exploded_dataset_record_def = 13, 
		RULE_inline_dataset_record_def = 14, RULE_record_defs = 15, RULE_nested_dataset_decl = 16, 
		RULE_nested_inline_dataset_decl = 17, RULE_opts = 18, RULE_opt = 19, RULE_maxlength = 20, 
		RULE_maxcount = 21, RULE_defaultval = 22, RULE_xpath = 23, RULE_xmldefaultval = 24;
	public static final String[] ruleNames = {
		"program", "value", "value_list", "token_list", "assign", "assign_list", 
		"eclfield_decl", "eclfield_type", "eclfield_name", "eclfield_recref", 
		"record_def_inline", "record_def", "defined_record_def", "exploded_dataset_record_def", 
		"inline_dataset_record_def", "record_defs", "nested_dataset_decl", "nested_inline_dataset_decl", 
		"opts", "opt", "maxlength", "maxcount", "defaultval", "xpath", "xmldefaultval"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'SET OF'", "'set of'", "'MAXLENGTH'", "'MAXCOUNT'", "'DEFAULT'", 
		"'XPATH'", "'XMLDEFAULT'", "'('", "')'", "'{'", "'}'", "','", "';'", "'='", 
		"':='", "'RECORD'", "'END'", "'DATASET'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "OPAREN", "CPAREN", "OCURLY", 
		"CCURLY", "COMMA", "SEMI", "EQ", "ASSING_SYM", "REC_SYM", "END_SYM", "DATASET_SYM", 
		"WS", "INT", "STRING", "TOKEN", "UTOKEN", "COMMENT", "ML_COMMENT", "ECL_NUMBERED_TYPE"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "EclRecord.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public EclRecordParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<Record_defsContext> record_defs() {
			return getRuleContexts(Record_defsContext.class);
		}
		public Record_defsContext record_defs(int i) {
			return getRuleContext(Record_defsContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclRecordListener ) ((EclRecordListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclRecordListener ) ((EclRecordListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			record_defs();
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OCURLY) | (1L << REC_SYM) | (1L << TOKEN))) != 0)) {
				{
				{
				setState(51);
				record_defs();
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode UTOKEN() { return getToken(EclRecordParser.UTOKEN, 0); }
		public TerminalNode TOKEN() { return getToken(EclRecordParser.TOKEN, 0); }
		public TerminalNode INT() { return getToken(EclRecordParser.INT, 0); }
		public TerminalNode STRING() { return getToken(EclRecordParser.STRING, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclRecordListener ) ((EclRecordListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclRecordListener ) ((EclRecordListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << STRING) | (1L << TOKEN) | (1L << UTOKEN))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Value_listContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(EclRecordParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EclRecordParser.COMMA, i);
		}
		public Value_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclRecordListener ) ((EclRecordListener)listener).enterValue_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclRecordListener ) ((EclRecordListener)listener).exitValue_list(this);
		}
	}

	public final Value_listContext value_list() throws RecognitionException {
		Value_listContext _localctx = new Value_listContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_value_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			value();
			setState(64);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(60);
					match(COMMA);
					setState(61);
					value();
					}
					} 
				}
				setState(66);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Token_listContext extends ParserRuleContext {
		public List<TerminalNode> TOKEN() { return getTokens(EclRecordParser.TOKEN); }
		public TerminalNode TOKEN(int i) {
			return getToken(EclRecordParser.TOKEN, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(EclRecordParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EclRecordParser.COMMA, i);
		}
		public Token_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_token_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclRecordListener ) ((EclRecordListener)listener).enterToken_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclRecordListener ) ((EclRecordListener)listener).exitToken_list(this);
		}
	}

	public final Token_listContext token_list() throws RecognitionException {
		Token_listContext _localctx = new Token_listContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_token_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(TOKEN);
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(68);
				match(COMMA);
				setState(69);
				match(TOKEN);
				}
				}
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode EQ() { return getToken(EclRecordParser.EQ, 0); }
		public Value_listContext value_list() {
			return getRuleContext(Value_listContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclRecordListener ) ((EclRecordListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclRecordListener ) ((EclRecordListener)listener).exitAssign(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			value();
			setState(76);
			match(EQ);
			setState(77);
			value_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assign_listContext extends ParserRuleContext {
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}
		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(EclRecordParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EclRecordParser.COMMA, i);
		}
		public Assign_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclRecordListener ) ((EclRecordListener)listener).enterAssign_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclRecordListener ) ((EclRecordListener)listener).exitAssign_list(this);
		}
	}

	public final Assign_listContext assign_list() throws RecognitionException {
		Assign_listContext _localctx = new Assign_listContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assign_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			assign();
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(80);
				match(COMMA);
				setState(81);
				assign();
				}
				}
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Eclfield_declContext extends ParserRuleContext {
		public Eclfield_typeContext eclfield_type() {
			return getRuleContext(Eclfield_typeContext.class,0);
		}
		public Eclfield_nameContext eclfield_name() {
			return getRuleContext(Eclfield_nameContext.class,0);
		}
		public Nested_dataset_declContext nested_dataset_decl() {
			return getRuleContext(Nested_dataset_declContext.class,0);
		}
		public Nested_inline_dataset_declContext nested_inline_dataset_decl() {
			return getRuleContext(Nested_inline_dataset_declContext.class,0);
		}
		public Eclfield_recrefContext eclfield_recref() {
			return getRuleContext(Eclfield_recrefContext.class,0);
		}
		public TerminalNode OCURLY() { return getToken(EclRecordParser.OCURLY, 0); }
		public OptsContext opts() {
			return getRuleContext(OptsContext.class,0);
		}
		public TerminalNode CCURLY() { return getToken(EclRecordParser.CCURLY, 0); }
		public Eclfield_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eclfield_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclRecordListener ) ((EclRecordListener)listener).enterEclfield_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclRecordListener ) ((EclRecordListener)listener).exitEclfield_decl(this);
		}
	}

	public final Eclfield_declContext eclfield_decl() throws RecognitionException {
		Eclfield_declContext _localctx = new Eclfield_declContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_eclfield_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(87);
				eclfield_type();
				setState(88);
				eclfield_name();
				setState(93);
				_la = _input.LA(1);
				if (_la==OCURLY) {
					{
					setState(89);
					match(OCURLY);
					setState(90);
					opts();
					setState(91);
					match(CCURLY);
					}
				}

				}
				break;
			case 2:
				{
				setState(95);
				nested_dataset_decl();
				}
				break;
			case 3:
				{
				setState(96);
				nested_inline_dataset_decl();
				}
				break;
			case 4:
				{
				setState(97);
				eclfield_recref();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Eclfield_typeContext extends ParserRuleContext {
		public TerminalNode TOKEN() { return getToken(EclRecordParser.TOKEN, 0); }
		public Eclfield_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eclfield_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclRecordListener ) ((EclRecordListener)listener).enterEclfield_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclRecordListener ) ((EclRecordListener)listener).exitEclfield_type(this);
		}
	}

	public final Eclfield_typeContext eclfield_type() throws RecognitionException {
		Eclfield_typeContext _localctx = new Eclfield_typeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_eclfield_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_la = _input.LA(1);
			if (_la==T__0 || _la==T__1) {
				{
				setState(100);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==T__1) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(103);
			match(TOKEN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Eclfield_nameContext extends ParserRuleContext {
		public TerminalNode UTOKEN() { return getToken(EclRecordParser.UTOKEN, 0); }
		public TerminalNode TOKEN() { return getToken(EclRecordParser.TOKEN, 0); }
		public Eclfield_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eclfield_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclRecordListener ) ((EclRecordListener)listener).enterEclfield_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclRecordListener ) ((EclRecordListener)listener).exitEclfield_name(this);
		}
	}

	public final Eclfield_nameContext eclfield_name() throws RecognitionException {
		Eclfield_nameContext _localctx = new Eclfield_nameContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_eclfield_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			_la = _input.LA(1);
			if ( !(_la==TOKEN || _la==UTOKEN) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Eclfield_recrefContext extends ParserRuleContext {
		public TerminalNode OPAREN() { return getToken(EclRecordParser.OPAREN, 0); }
		public TerminalNode TOKEN() { return getToken(EclRecordParser.TOKEN, 0); }
		public TerminalNode CPAREN() { return getToken(EclRecordParser.CPAREN, 0); }
		public Eclfield_recrefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eclfield_recref; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclRecordListener ) ((EclRecordListener)listener).enterEclfield_recref(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclRecordListener ) ((EclRecordListener)listener).exitEclfield_recref(this);
		}
	}

	public final Eclfield_recrefContext eclfield_recref() throws RecognitionException {
		Eclfield_recrefContext _localctx = new Eclfield_recrefContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_eclfield_recref);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(OPAREN);
			setState(108);
			match(TOKEN);
			setState(109);
			match(CPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Record_def_inlineContext extends ParserRuleContext {
		public TerminalNode OCURLY() { return getToken(EclRecordParser.OCURLY, 0); }
		public List<Eclfield_declContext> eclfield_decl() {
			return getRuleContexts(Eclfield_declContext.class);
		}
		public Eclfield_declContext eclfield_decl(int i) {
			return getRuleContext(Eclfield_declContext.class,i);
		}
		public TerminalNode CCURLY() { return getToken(EclRecordParser.CCURLY, 0); }
		public TerminalNode SEMI() { return getToken(EclRecordParser.SEMI, 0); }
		public List<TerminalNode> COMMA() { return getTokens(EclRecordParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EclRecordParser.COMMA, i);
		}
		public Record_def_inlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_record_def_inline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclRecordListener ) ((EclRecordListener)listener).enterRecord_def_inline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclRecordListener ) ((EclRecordListener)listener).exitRecord_def_inline(this);
		}
	}

	public final Record_def_inlineContext record_def_inline() throws RecognitionException {
		Record_def_inlineContext _localctx = new Record_def_inlineContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_record_def_inline);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(OCURLY);
			setState(112);
			eclfield_decl();
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << OPAREN) | (1L << COMMA) | (1L << DATASET_SYM) | (1L << TOKEN))) != 0)) {
				{
				{
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(113);
					match(COMMA);
					}
					}
					setState(118);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(119);
				eclfield_decl();
				}
				}
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(125);
			match(CCURLY);
			setState(126);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Record_defContext extends ParserRuleContext {
		public TerminalNode REC_SYM() { return getToken(EclRecordParser.REC_SYM, 0); }
		public List<Eclfield_declContext> eclfield_decl() {
			return getRuleContexts(Eclfield_declContext.class);
		}
		public Eclfield_declContext eclfield_decl(int i) {
			return getRuleContext(Eclfield_declContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(EclRecordParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(EclRecordParser.SEMI, i);
		}
		public TerminalNode END_SYM() { return getToken(EclRecordParser.END_SYM, 0); }
		public TerminalNode COMMA() { return getToken(EclRecordParser.COMMA, 0); }
		public MaxlengthContext maxlength() {
			return getRuleContext(MaxlengthContext.class,0);
		}
		public Record_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_record_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclRecordListener ) ((EclRecordListener)listener).enterRecord_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclRecordListener ) ((EclRecordListener)listener).exitRecord_def(this);
		}
	}

	public final Record_defContext record_def() throws RecognitionException {
		Record_defContext _localctx = new Record_defContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_record_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(REC_SYM);
			setState(131);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(129);
				match(COMMA);
				setState(130);
				maxlength();
				}
			}

			setState(133);
			eclfield_decl();
			setState(134);
			match(SEMI);
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << OPAREN) | (1L << DATASET_SYM) | (1L << TOKEN))) != 0)) {
				{
				{
				setState(135);
				eclfield_decl();
				setState(136);
				match(SEMI);
				}
				}
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(143);
			match(END_SYM);
			setState(144);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Defined_record_defContext extends ParserRuleContext {
		public TerminalNode TOKEN() { return getToken(EclRecordParser.TOKEN, 0); }
		public TerminalNode ASSING_SYM() { return getToken(EclRecordParser.ASSING_SYM, 0); }
		public Record_defContext record_def() {
			return getRuleContext(Record_defContext.class,0);
		}
		public Record_def_inlineContext record_def_inline() {
			return getRuleContext(Record_def_inlineContext.class,0);
		}
		public Defined_record_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defined_record_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclRecordListener ) ((EclRecordListener)listener).enterDefined_record_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclRecordListener ) ((EclRecordListener)listener).exitDefined_record_def(this);
		}
	}

	public final Defined_record_defContext defined_record_def() throws RecognitionException {
		Defined_record_defContext _localctx = new Defined_record_defContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_defined_record_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(TOKEN);
			setState(147);
			match(ASSING_SYM);
			setState(150);
			switch (_input.LA(1)) {
			case REC_SYM:
				{
				setState(148);
				record_def();
				}
				break;
			case OCURLY:
				{
				setState(149);
				record_def_inline();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exploded_dataset_record_defContext extends ParserRuleContext {
		public TerminalNode REC_SYM() { return getToken(EclRecordParser.REC_SYM, 0); }
		public List<Eclfield_declContext> eclfield_decl() {
			return getRuleContexts(Eclfield_declContext.class);
		}
		public Eclfield_declContext eclfield_decl(int i) {
			return getRuleContext(Eclfield_declContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(EclRecordParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(EclRecordParser.SEMI, i);
		}
		public TerminalNode END_SYM() { return getToken(EclRecordParser.END_SYM, 0); }
		public TerminalNode COMMA() { return getToken(EclRecordParser.COMMA, 0); }
		public MaxlengthContext maxlength() {
			return getRuleContext(MaxlengthContext.class,0);
		}
		public Exploded_dataset_record_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exploded_dataset_record_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclRecordListener ) ((EclRecordListener)listener).enterExploded_dataset_record_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclRecordListener ) ((EclRecordListener)listener).exitExploded_dataset_record_def(this);
		}
	}

	public final Exploded_dataset_record_defContext exploded_dataset_record_def() throws RecognitionException {
		Exploded_dataset_record_defContext _localctx = new Exploded_dataset_record_defContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_exploded_dataset_record_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(REC_SYM);
			setState(155);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(153);
				match(COMMA);
				setState(154);
				maxlength();
				}
			}

			setState(157);
			eclfield_decl();
			setState(158);
			match(SEMI);
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << OPAREN) | (1L << DATASET_SYM) | (1L << TOKEN))) != 0)) {
				{
				{
				setState(159);
				eclfield_decl();
				setState(160);
				match(SEMI);
				}
				}
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(167);
			match(END_SYM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Inline_dataset_record_defContext extends ParserRuleContext {
		public TerminalNode OCURLY() { return getToken(EclRecordParser.OCURLY, 0); }
		public List<Eclfield_declContext> eclfield_decl() {
			return getRuleContexts(Eclfield_declContext.class);
		}
		public Eclfield_declContext eclfield_decl(int i) {
			return getRuleContext(Eclfield_declContext.class,i);
		}
		public TerminalNode CCURLY() { return getToken(EclRecordParser.CCURLY, 0); }
		public List<TerminalNode> COMMA() { return getTokens(EclRecordParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EclRecordParser.COMMA, i);
		}
		public Inline_dataset_record_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inline_dataset_record_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclRecordListener ) ((EclRecordListener)listener).enterInline_dataset_record_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclRecordListener ) ((EclRecordListener)listener).exitInline_dataset_record_def(this);
		}
	}

	public final Inline_dataset_record_defContext inline_dataset_record_def() throws RecognitionException {
		Inline_dataset_record_defContext _localctx = new Inline_dataset_record_defContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_inline_dataset_record_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(OCURLY);
			setState(170);
			eclfield_decl();
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(171);
				match(COMMA);
				setState(172);
				eclfield_decl();
				}
				}
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(178);
			match(CCURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Record_defsContext extends ParserRuleContext {
		public Record_def_inlineContext record_def_inline() {
			return getRuleContext(Record_def_inlineContext.class,0);
		}
		public Record_defContext record_def() {
			return getRuleContext(Record_defContext.class,0);
		}
		public Defined_record_defContext defined_record_def() {
			return getRuleContext(Defined_record_defContext.class,0);
		}
		public Record_defsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_record_defs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclRecordListener ) ((EclRecordListener)listener).enterRecord_defs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclRecordListener ) ((EclRecordListener)listener).exitRecord_defs(this);
		}
	}

	public final Record_defsContext record_defs() throws RecognitionException {
		Record_defsContext _localctx = new Record_defsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_record_defs);
		try {
			setState(183);
			switch (_input.LA(1)) {
			case OCURLY:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				record_def_inline();
				}
				break;
			case REC_SYM:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				record_def();
				}
				break;
			case TOKEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(182);
				defined_record_def();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Nested_dataset_declContext extends ParserRuleContext {
		public List<TerminalNode> TOKEN() { return getTokens(EclRecordParser.TOKEN); }
		public TerminalNode TOKEN(int i) {
			return getToken(EclRecordParser.TOKEN, i);
		}
		public TerminalNode UTOKEN() { return getToken(EclRecordParser.UTOKEN, 0); }
		public OptsContext opts() {
			return getRuleContext(OptsContext.class,0);
		}
		public Nested_dataset_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nested_dataset_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclRecordListener ) ((EclRecordListener)listener).enterNested_dataset_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclRecordListener ) ((EclRecordListener)listener).exitNested_dataset_decl(this);
		}
	}

	public final Nested_dataset_declContext nested_dataset_decl() throws RecognitionException {
		Nested_dataset_declContext _localctx = new Nested_dataset_declContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_nested_dataset_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(DATASET_SYM);
			setState(186);
			match(OPAREN);
			setState(187);
			match(TOKEN);
			setState(188);
			match(CPAREN);
			setState(189);
			_la = _input.LA(1);
			if ( !(_la==TOKEN || _la==UTOKEN) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(194);
			_la = _input.LA(1);
			if (_la==OCURLY) {
				{
				setState(190);
				match(OCURLY);
				setState(191);
				opts();
				setState(192);
				match(CCURLY);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Nested_inline_dataset_declContext extends ParserRuleContext {
		public TerminalNode DATASET_SYM() { return getToken(EclRecordParser.DATASET_SYM, 0); }
		public TerminalNode OPAREN() { return getToken(EclRecordParser.OPAREN, 0); }
		public TerminalNode CPAREN() { return getToken(EclRecordParser.CPAREN, 0); }
		public TerminalNode TOKEN() { return getToken(EclRecordParser.TOKEN, 0); }
		public TerminalNode UTOKEN() { return getToken(EclRecordParser.UTOKEN, 0); }
		public Exploded_dataset_record_defContext exploded_dataset_record_def() {
			return getRuleContext(Exploded_dataset_record_defContext.class,0);
		}
		public Inline_dataset_record_defContext inline_dataset_record_def() {
			return getRuleContext(Inline_dataset_record_defContext.class,0);
		}
		public TerminalNode OCURLY() { return getToken(EclRecordParser.OCURLY, 0); }
		public OptsContext opts() {
			return getRuleContext(OptsContext.class,0);
		}
		public TerminalNode CCURLY() { return getToken(EclRecordParser.CCURLY, 0); }
		public Nested_inline_dataset_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nested_inline_dataset_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclRecordListener ) ((EclRecordListener)listener).enterNested_inline_dataset_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclRecordListener ) ((EclRecordListener)listener).exitNested_inline_dataset_decl(this);
		}
	}

	public final Nested_inline_dataset_declContext nested_inline_dataset_decl() throws RecognitionException {
		Nested_inline_dataset_declContext _localctx = new Nested_inline_dataset_declContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_nested_inline_dataset_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(DATASET_SYM);
			setState(197);
			match(OPAREN);
			setState(200);
			switch (_input.LA(1)) {
			case REC_SYM:
				{
				setState(198);
				exploded_dataset_record_def();
				}
				break;
			case OCURLY:
				{
				setState(199);
				inline_dataset_record_def();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(202);
			match(CPAREN);
			setState(203);
			_la = _input.LA(1);
			if ( !(_la==TOKEN || _la==UTOKEN) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(208);
			_la = _input.LA(1);
			if (_la==OCURLY) {
				{
				setState(204);
				match(OCURLY);
				setState(205);
				opts();
				setState(206);
				match(CCURLY);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptsContext extends ParserRuleContext {
		public List<OptContext> opt() {
			return getRuleContexts(OptContext.class);
		}
		public OptContext opt(int i) {
			return getRuleContext(OptContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(EclRecordParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EclRecordParser.COMMA, i);
		}
		public OptsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclRecordListener ) ((EclRecordListener)listener).enterOpts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclRecordListener ) ((EclRecordListener)listener).exitOpts(this);
		}
	}

	public final OptsContext opts() throws RecognitionException {
		OptsContext _localctx = new OptsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_opts);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			opt();
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(211);
				match(COMMA);
				setState(212);
				opt();
				}
				}
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptContext extends ParserRuleContext {
		public MaxlengthContext maxlength() {
			return getRuleContext(MaxlengthContext.class,0);
		}
		public MaxcountContext maxcount() {
			return getRuleContext(MaxcountContext.class,0);
		}
		public DefaultvalContext defaultval() {
			return getRuleContext(DefaultvalContext.class,0);
		}
		public XpathContext xpath() {
			return getRuleContext(XpathContext.class,0);
		}
		public XmldefaultvalContext xmldefaultval() {
			return getRuleContext(XmldefaultvalContext.class,0);
		}
		public OptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclRecordListener ) ((EclRecordListener)listener).enterOpt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclRecordListener ) ((EclRecordListener)listener).exitOpt(this);
		}
	}

	public final OptContext opt() throws RecognitionException {
		OptContext _localctx = new OptContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_opt);
		try {
			setState(223);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				maxlength();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				maxcount();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(220);
				defaultval();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 4);
				{
				setState(221);
				xpath();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 5);
				{
				setState(222);
				xmldefaultval();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MaxlengthContext extends ParserRuleContext {
		public TerminalNode OPAREN() { return getToken(EclRecordParser.OPAREN, 0); }
		public TerminalNode INT() { return getToken(EclRecordParser.INT, 0); }
		public TerminalNode CPAREN() { return getToken(EclRecordParser.CPAREN, 0); }
		public MaxlengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maxlength; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclRecordListener ) ((EclRecordListener)listener).enterMaxlength(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclRecordListener ) ((EclRecordListener)listener).exitMaxlength(this);
		}
	}

	public final MaxlengthContext maxlength() throws RecognitionException {
		MaxlengthContext _localctx = new MaxlengthContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_maxlength);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(T__2);
			setState(226);
			match(OPAREN);
			setState(227);
			match(INT);
			setState(228);
			match(CPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MaxcountContext extends ParserRuleContext {
		public TerminalNode OPAREN() { return getToken(EclRecordParser.OPAREN, 0); }
		public TerminalNode INT() { return getToken(EclRecordParser.INT, 0); }
		public TerminalNode CPAREN() { return getToken(EclRecordParser.CPAREN, 0); }
		public MaxcountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maxcount; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclRecordListener ) ((EclRecordListener)listener).enterMaxcount(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclRecordListener ) ((EclRecordListener)listener).exitMaxcount(this);
		}
	}

	public final MaxcountContext maxcount() throws RecognitionException {
		MaxcountContext _localctx = new MaxcountContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_maxcount);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(T__3);
			setState(231);
			match(OPAREN);
			setState(232);
			match(INT);
			setState(233);
			match(CPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefaultvalContext extends ParserRuleContext {
		public TerminalNode OPAREN() { return getToken(EclRecordParser.OPAREN, 0); }
		public TerminalNode STRING() { return getToken(EclRecordParser.STRING, 0); }
		public TerminalNode CPAREN() { return getToken(EclRecordParser.CPAREN, 0); }
		public DefaultvalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclRecordListener ) ((EclRecordListener)listener).enterDefaultval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclRecordListener ) ((EclRecordListener)listener).exitDefaultval(this);
		}
	}

	public final DefaultvalContext defaultval() throws RecognitionException {
		DefaultvalContext _localctx = new DefaultvalContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_defaultval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(T__4);
			setState(236);
			match(OPAREN);
			setState(237);
			match(STRING);
			setState(238);
			match(CPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class XpathContext extends ParserRuleContext {
		public TerminalNode OPAREN() { return getToken(EclRecordParser.OPAREN, 0); }
		public TerminalNode STRING() { return getToken(EclRecordParser.STRING, 0); }
		public TerminalNode CPAREN() { return getToken(EclRecordParser.CPAREN, 0); }
		public XpathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xpath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclRecordListener ) ((EclRecordListener)listener).enterXpath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclRecordListener ) ((EclRecordListener)listener).exitXpath(this);
		}
	}

	public final XpathContext xpath() throws RecognitionException {
		XpathContext _localctx = new XpathContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_xpath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(T__5);
			setState(241);
			match(OPAREN);
			setState(242);
			match(STRING);
			setState(243);
			match(CPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class XmldefaultvalContext extends ParserRuleContext {
		public TerminalNode OPAREN() { return getToken(EclRecordParser.OPAREN, 0); }
		public TerminalNode STRING() { return getToken(EclRecordParser.STRING, 0); }
		public TerminalNode CPAREN() { return getToken(EclRecordParser.CPAREN, 0); }
		public XmldefaultvalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xmldefaultval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclRecordListener ) ((EclRecordListener)listener).enterXmldefaultval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclRecordListener ) ((EclRecordListener)listener).exitXmldefaultval(this);
		}
	}

	public final XmldefaultvalContext xmldefaultval() throws RecognitionException {
		XmldefaultvalContext _localctx = new XmldefaultvalContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_xmldefaultval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(T__6);
			setState(246);
			match(OPAREN);
			setState(247);
			match(STRING);
			setState(248);
			match(CPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\34\u00fd\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\7\2\67\n\2\f\2\16\2:\13\2\3\3\3\3\3\4\3\4\3\4\7\4A"+
		"\n\4\f\4\16\4D\13\4\3\5\3\5\3\5\7\5I\n\5\f\5\16\5L\13\5\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\7\7U\n\7\f\7\16\7X\13\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b`\n"+
		"\b\3\b\3\b\3\b\5\be\n\b\3\t\5\th\n\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\7\fu\n\f\f\f\16\fx\13\f\3\f\7\f{\n\f\f\f\16\f~\13\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\5\r\u0086\n\r\3\r\3\r\3\r\3\r\3\r\7\r\u008d\n\r"+
		"\f\r\16\r\u0090\13\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\5\16\u0099\n\16\3"+
		"\17\3\17\3\17\5\17\u009e\n\17\3\17\3\17\3\17\3\17\3\17\7\17\u00a5\n\17"+
		"\f\17\16\17\u00a8\13\17\3\17\3\17\3\20\3\20\3\20\3\20\7\20\u00b0\n\20"+
		"\f\20\16\20\u00b3\13\20\3\20\3\20\3\21\3\21\3\21\5\21\u00ba\n\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00c5\n\22\3\23\3\23\3\23"+
		"\3\23\5\23\u00cb\n\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00d3\n\23\3"+
		"\24\3\24\3\24\7\24\u00d8\n\24\f\24\16\24\u00db\13\24\3\25\3\25\3\25\3"+
		"\25\3\25\5\25\u00e2\n\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\2\2\33\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,"+
		".\60\62\2\5\3\2\26\31\3\2\3\4\3\2\30\31\u00fe\2\64\3\2\2\2\4;\3\2\2\2"+
		"\6=\3\2\2\2\bE\3\2\2\2\nM\3\2\2\2\fQ\3\2\2\2\16d\3\2\2\2\20g\3\2\2\2\22"+
		"k\3\2\2\2\24m\3\2\2\2\26q\3\2\2\2\30\u0082\3\2\2\2\32\u0094\3\2\2\2\34"+
		"\u009a\3\2\2\2\36\u00ab\3\2\2\2 \u00b9\3\2\2\2\"\u00bb\3\2\2\2$\u00c6"+
		"\3\2\2\2&\u00d4\3\2\2\2(\u00e1\3\2\2\2*\u00e3\3\2\2\2,\u00e8\3\2\2\2."+
		"\u00ed\3\2\2\2\60\u00f2\3\2\2\2\62\u00f7\3\2\2\2\648\5 \21\2\65\67\5 "+
		"\21\2\66\65\3\2\2\2\67:\3\2\2\28\66\3\2\2\289\3\2\2\29\3\3\2\2\2:8\3\2"+
		"\2\2;<\t\2\2\2<\5\3\2\2\2=B\5\4\3\2>?\7\16\2\2?A\5\4\3\2@>\3\2\2\2AD\3"+
		"\2\2\2B@\3\2\2\2BC\3\2\2\2C\7\3\2\2\2DB\3\2\2\2EJ\7\30\2\2FG\7\16\2\2"+
		"GI\7\30\2\2HF\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2K\t\3\2\2\2LJ\3\2\2"+
		"\2MN\5\4\3\2NO\7\20\2\2OP\5\6\4\2P\13\3\2\2\2QV\5\n\6\2RS\7\16\2\2SU\5"+
		"\n\6\2TR\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2W\r\3\2\2\2XV\3\2\2\2YZ"+
		"\5\20\t\2Z_\5\22\n\2[\\\7\f\2\2\\]\5&\24\2]^\7\r\2\2^`\3\2\2\2_[\3\2\2"+
		"\2_`\3\2\2\2`e\3\2\2\2ae\5\"\22\2be\5$\23\2ce\5\24\13\2dY\3\2\2\2da\3"+
		"\2\2\2db\3\2\2\2dc\3\2\2\2e\17\3\2\2\2fh\t\3\2\2gf\3\2\2\2gh\3\2\2\2h"+
		"i\3\2\2\2ij\7\30\2\2j\21\3\2\2\2kl\t\4\2\2l\23\3\2\2\2mn\7\n\2\2no\7\30"+
		"\2\2op\7\13\2\2p\25\3\2\2\2qr\7\f\2\2r|\5\16\b\2su\7\16\2\2ts\3\2\2\2"+
		"ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2wy\3\2\2\2xv\3\2\2\2y{\5\16\b\2zv\3\2\2"+
		"\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\177\3\2\2\2~|\3\2\2\2\177\u0080\7\r"+
		"\2\2\u0080\u0081\7\17\2\2\u0081\27\3\2\2\2\u0082\u0085\7\22\2\2\u0083"+
		"\u0084\7\16\2\2\u0084\u0086\5*\26\2\u0085\u0083\3\2\2\2\u0085\u0086\3"+
		"\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\5\16\b\2\u0088\u008e\7\17\2\2\u0089"+
		"\u008a\5\16\b\2\u008a\u008b\7\17\2\2\u008b\u008d\3\2\2\2\u008c\u0089\3"+
		"\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\u0091\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0092\7\23\2\2\u0092\u0093\7"+
		"\17\2\2\u0093\31\3\2\2\2\u0094\u0095\7\30\2\2\u0095\u0098\7\21\2\2\u0096"+
		"\u0099\5\30\r\2\u0097\u0099\5\26\f\2\u0098\u0096\3\2\2\2\u0098\u0097\3"+
		"\2\2\2\u0099\33\3\2\2\2\u009a\u009d\7\22\2\2\u009b\u009c\7\16\2\2\u009c"+
		"\u009e\5*\26\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\3\2"+
		"\2\2\u009f\u00a0\5\16\b\2\u00a0\u00a6\7\17\2\2\u00a1\u00a2\5\16\b\2\u00a2"+
		"\u00a3\7\17\2\2\u00a3\u00a5\3\2\2\2\u00a4\u00a1\3\2\2\2\u00a5\u00a8\3"+
		"\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a9\3\2\2\2\u00a8"+
		"\u00a6\3\2\2\2\u00a9\u00aa\7\23\2\2\u00aa\35\3\2\2\2\u00ab\u00ac\7\f\2"+
		"\2\u00ac\u00b1\5\16\b\2\u00ad\u00ae\7\16\2\2\u00ae\u00b0\5\16\b\2\u00af"+
		"\u00ad\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2"+
		"\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b5\7\r\2\2\u00b5"+
		"\37\3\2\2\2\u00b6\u00ba\5\26\f\2\u00b7\u00ba\5\30\r\2\u00b8\u00ba\5\32"+
		"\16\2\u00b9\u00b6\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00b8\3\2\2\2\u00ba"+
		"!\3\2\2\2\u00bb\u00bc\7\24\2\2\u00bc\u00bd\7\n\2\2\u00bd\u00be\7\30\2"+
		"\2\u00be\u00bf\7\13\2\2\u00bf\u00c4\t\4\2\2\u00c0\u00c1\7\f\2\2\u00c1"+
		"\u00c2\5&\24\2\u00c2\u00c3\7\r\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00c0\3\2"+
		"\2\2\u00c4\u00c5\3\2\2\2\u00c5#\3\2\2\2\u00c6\u00c7\7\24\2\2\u00c7\u00ca"+
		"\7\n\2\2\u00c8\u00cb\5\34\17\2\u00c9\u00cb\5\36\20\2\u00ca\u00c8\3\2\2"+
		"\2\u00ca\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\7\13\2\2\u00cd"+
		"\u00d2\t\4\2\2\u00ce\u00cf\7\f\2\2\u00cf\u00d0\5&\24\2\u00d0\u00d1\7\r"+
		"\2\2\u00d1\u00d3\3\2\2\2\u00d2\u00ce\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3"+
		"%\3\2\2\2\u00d4\u00d9\5(\25\2\u00d5\u00d6\7\16\2\2\u00d6\u00d8\5(\25\2"+
		"\u00d7\u00d5\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da"+
		"\3\2\2\2\u00da\'\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc\u00e2\5*\26\2\u00dd"+
		"\u00e2\5,\27\2\u00de\u00e2\5.\30\2\u00df\u00e2\5\60\31\2\u00e0\u00e2\5"+
		"\62\32\2\u00e1\u00dc\3\2\2\2\u00e1\u00dd\3\2\2\2\u00e1\u00de\3\2\2\2\u00e1"+
		"\u00df\3\2\2\2\u00e1\u00e0\3\2\2\2\u00e2)\3\2\2\2\u00e3\u00e4\7\5\2\2"+
		"\u00e4\u00e5\7\n\2\2\u00e5\u00e6\7\26\2\2\u00e6\u00e7\7\13\2\2\u00e7+"+
		"\3\2\2\2\u00e8\u00e9\7\6\2\2\u00e9\u00ea\7\n\2\2\u00ea\u00eb\7\26\2\2"+
		"\u00eb\u00ec\7\13\2\2\u00ec-\3\2\2\2\u00ed\u00ee\7\7\2\2\u00ee\u00ef\7"+
		"\n\2\2\u00ef\u00f0\7\27\2\2\u00f0\u00f1\7\13\2\2\u00f1/\3\2\2\2\u00f2"+
		"\u00f3\7\b\2\2\u00f3\u00f4\7\n\2\2\u00f4\u00f5\7\27\2\2\u00f5\u00f6\7"+
		"\13\2\2\u00f6\61\3\2\2\2\u00f7\u00f8\7\t\2\2\u00f8\u00f9\7\n\2\2\u00f9"+
		"\u00fa\7\27\2\2\u00fa\u00fb\7\13\2\2\u00fb\63\3\2\2\2\278BJV_dgv|\u0085"+
		"\u008e\u0098\u009d\u00a6\u00b1\u00b9\u00c4\u00ca\u00d2\u00d9\u00e1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}