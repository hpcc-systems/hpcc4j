// Generated from EclRecord.g4 by ANTLR 4.10.1
package org.hpccsystems.ws.client.antlr.gen;
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
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, QUOTE=16, OSQUARE=17, 
		CSQUARE=18, OPAREN=19, CPAREN=20, OCURLY=21, CCURLY=22, COMMA=23, SEMI=24, 
		EQ=25, ASSING_SYM=26, REC_SYM=27, END_SYM=28, DATASET_SYM=29, WS=30, INT=31, 
		SETSTRING=32, STRING=33, ATOKEN=34, TOKEN=35, UTOKEN=36, ECL_NUMBERED_TYPE=37;
	public static final int
		RULE_program = 0, RULE_value = 1, RULE_value_list = 2, RULE_token_list = 3, 
		RULE_assign = 4, RULE_assign_list = 5, RULE_eclfield_decl = 6, RULE_eclfield_type = 7, 
		RULE_eclfield_name = 8, RULE_eclfield_recref = 9, RULE_payload_sep = 10, 
		RULE_record_def_inline = 11, RULE_record_def = 12, RULE_defined_record_def = 13, 
		RULE_exploded_dataset_record_def = 14, RULE_inline_dataset_record_def = 15, 
		RULE_record_defs = 16, RULE_nested_dataset_decl = 17, RULE_nested_inline_dataset_decl = 18, 
		RULE_opts = 19, RULE_opt = 20, RULE_maxlength = 21, RULE_blob = 22, RULE_maxcount = 23, 
		RULE_defaultval = 24, RULE_xpath = 25, RULE_xmldefaultval = 26, RULE_setdefaultval = 27, 
		RULE_annotation_name = 28, RULE_annotation_param = 29, RULE_annotation_arguments = 30, 
		RULE_annotation = 31, RULE_comment = 32;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "value", "value_list", "token_list", "assign", "assign_list", 
			"eclfield_decl", "eclfield_type", "eclfield_name", "eclfield_recref", 
			"payload_sep", "record_def_inline", "record_def", "defined_record_def", 
			"exploded_dataset_record_def", "inline_dataset_record_def", "record_defs", 
			"nested_dataset_decl", "nested_inline_dataset_decl", "opts", "opt", "maxlength", 
			"blob", "maxcount", "defaultval", "xpath", "xmldefaultval", "setdefaultval", 
			"annotation_name", "annotation_param", "annotation_arguments", "annotation", 
			"comment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'SET OF'", "'set of'", "'MAXLENGTH'", "'maxlength'", "'=>'", "'maxLength'", 
			"'BLOB'", "'blob'", "'MAXCOUNT'", "'DEFAULT'", "'XPATH'", "'XMLDEFAULT'", 
			"'//'", "'/*'", "'*/'", "'''", "'['", "']'", "'('", "')'", "'{'", "'}'", 
			"','", null, "'='", "':='", "'RECORD'", "'END'", "'DATASET'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "QUOTE", "OSQUARE", "CSQUARE", "OPAREN", "CPAREN", 
			"OCURLY", "CCURLY", "COMMA", "SEMI", "EQ", "ASSING_SYM", "REC_SYM", "END_SYM", 
			"DATASET_SYM", "WS", "INT", "SETSTRING", "STRING", "ATOKEN", "TOKEN", 
			"UTOKEN", "ECL_NUMBERED_TYPE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
			setState(66);
			record_defs();
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OCURLY) | (1L << REC_SYM) | (1L << TOKEN) | (1L << UTOKEN))) != 0)) {
				{
				{
				setState(67);
				record_defs();
				}
				}
				setState(72);
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
			setState(73);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << STRING) | (1L << TOKEN) | (1L << UTOKEN))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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
			setState(75);
			value();
			setState(80);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(76);
					match(COMMA);
					setState(77);
					value();
					}
					} 
				}
				setState(82);
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
			setState(83);
			match(TOKEN);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(84);
				match(COMMA);
				setState(85);
				match(TOKEN);
				}
				}
				setState(90);
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
			setState(91);
			value();
			setState(92);
			match(EQ);
			setState(93);
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
			setState(95);
			assign();
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(96);
				match(COMMA);
				setState(97);
				assign();
				}
				}
				setState(102);
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
		public Inline_dataset_record_defContext inline_dataset_record_def() {
			return getRuleContext(Inline_dataset_record_defContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(103);
				eclfield_type();
				setState(104);
				eclfield_name();
				setState(109);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(105);
					match(OCURLY);
					setState(106);
					opts();
					setState(107);
					match(CCURLY);
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(111);
				nested_dataset_decl();
				}
				break;
			case 3:
				{
				setState(112);
				nested_inline_dataset_decl();
				}
				break;
			case 4:
				{
				{
				setState(113);
				inline_dataset_record_def();
				setState(114);
				eclfield_name();
				}
				}
				break;
			case 5:
				{
				setState(116);
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
		public TerminalNode UTOKEN() { return getToken(EclRecordParser.UTOKEN, 0); }
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
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0 || _la==T__1) {
				{
				setState(119);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==T__1) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(122);
			_la = _input.LA(1);
			if ( !(_la==TOKEN || _la==UTOKEN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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
			setState(124);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << TOKEN) | (1L << UTOKEN))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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
			setState(126);
			match(OPAREN);
			setState(127);
			match(TOKEN);
			setState(128);
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

	public static class Payload_sepContext extends ParserRuleContext {
		public Payload_sepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_payload_sep; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclRecordListener ) ((EclRecordListener)listener).enterPayload_sep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclRecordListener ) ((EclRecordListener)listener).exitPayload_sep(this);
		}
	}

	public final Payload_sepContext payload_sep() throws RecognitionException {
		Payload_sepContext _localctx = new Payload_sepContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_payload_sep);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(T__4);
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
		public MaxlengthContext maxlength() {
			return getRuleContext(MaxlengthContext.class,0);
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
		enterRule(_localctx, 22, RULE_record_def_inline);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(OCURLY);
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(133);
				match(COMMA);
				setState(134);
				maxlength();
				}
			}

			setState(137);
			eclfield_decl();
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << OPAREN) | (1L << OCURLY) | (1L << COMMA) | (1L << DATASET_SYM) | (1L << TOKEN) | (1L << UTOKEN))) != 0)) {
				{
				{
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(138);
					match(COMMA);
					}
					}
					setState(143);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(144);
				eclfield_decl();
				}
				}
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(150);
			match(CCURLY);
			setState(151);
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
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
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
		enterRule(_localctx, 24, RULE_record_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(REC_SYM);
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(154);
				match(COMMA);
				setState(155);
				maxlength();
				}
			}

			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12 || _la==T__13) {
				{
				setState(158);
				comment();
				}
			}

			setState(161);
			eclfield_decl();
			setState(162);
			match(SEMI);
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12 || _la==T__13) {
				{
				setState(163);
				comment();
				}
			}

			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << OPAREN) | (1L << OCURLY) | (1L << DATASET_SYM) | (1L << TOKEN) | (1L << UTOKEN))) != 0)) {
				{
				{
				setState(166);
				eclfield_decl();
				setState(167);
				match(SEMI);
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12 || _la==T__13) {
					{
					setState(168);
					comment();
					}
				}

				}
				}
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(176);
			match(END_SYM);
			setState(177);
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
		public TerminalNode ASSING_SYM() { return getToken(EclRecordParser.ASSING_SYM, 0); }
		public TerminalNode UTOKEN() { return getToken(EclRecordParser.UTOKEN, 0); }
		public TerminalNode TOKEN() { return getToken(EclRecordParser.TOKEN, 0); }
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
		enterRule(_localctx, 26, RULE_defined_record_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			_la = _input.LA(1);
			if ( !(_la==TOKEN || _la==UTOKEN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(180);
			match(ASSING_SYM);
			setState(183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REC_SYM:
				{
				setState(181);
				record_def();
				}
				break;
			case OCURLY:
				{
				setState(182);
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
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
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
		enterRule(_localctx, 28, RULE_exploded_dataset_record_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(REC_SYM);
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(186);
				match(COMMA);
				setState(187);
				maxlength();
				}
			}

			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12 || _la==T__13) {
				{
				setState(190);
				comment();
				}
			}

			setState(193);
			eclfield_decl();
			setState(194);
			match(SEMI);
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12 || _la==T__13) {
				{
				setState(195);
				comment();
				}
			}

			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << OPAREN) | (1L << OCURLY) | (1L << DATASET_SYM) | (1L << TOKEN) | (1L << UTOKEN))) != 0)) {
				{
				{
				setState(198);
				eclfield_decl();
				setState(199);
				match(SEMI);
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12 || _la==T__13) {
					{
					setState(200);
					comment();
					}
				}

				}
				}
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(208);
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
		enterRule(_localctx, 30, RULE_inline_dataset_record_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(OCURLY);
			setState(211);
			eclfield_decl();
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(212);
				match(COMMA);
				setState(213);
				eclfield_decl();
				}
				}
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(219);
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
		enterRule(_localctx, 32, RULE_record_defs);
		try {
			setState(224);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OCURLY:
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				record_def_inline();
				}
				break;
			case REC_SYM:
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				record_def();
				}
				break;
			case TOKEN:
			case UTOKEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(223);
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
		public TerminalNode DATASET_SYM() { return getToken(EclRecordParser.DATASET_SYM, 0); }
		public TerminalNode OPAREN() { return getToken(EclRecordParser.OPAREN, 0); }
		public TerminalNode CPAREN() { return getToken(EclRecordParser.CPAREN, 0); }
		public List<TerminalNode> UTOKEN() { return getTokens(EclRecordParser.UTOKEN); }
		public TerminalNode UTOKEN(int i) {
			return getToken(EclRecordParser.UTOKEN, i);
		}
		public List<TerminalNode> TOKEN() { return getTokens(EclRecordParser.TOKEN); }
		public TerminalNode TOKEN(int i) {
			return getToken(EclRecordParser.TOKEN, i);
		}
		public TerminalNode OCURLY() { return getToken(EclRecordParser.OCURLY, 0); }
		public OptsContext opts() {
			return getRuleContext(OptsContext.class,0);
		}
		public TerminalNode CCURLY() { return getToken(EclRecordParser.CCURLY, 0); }
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
		enterRule(_localctx, 34, RULE_nested_dataset_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(DATASET_SYM);
			setState(227);
			match(OPAREN);
			setState(228);
			_la = _input.LA(1);
			if ( !(_la==TOKEN || _la==UTOKEN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(229);
			match(CPAREN);
			setState(230);
			_la = _input.LA(1);
			if ( !(_la==TOKEN || _la==UTOKEN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(231);
				match(OCURLY);
				setState(232);
				opts();
				setState(233);
				match(CCURLY);
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
		enterRule(_localctx, 36, RULE_nested_inline_dataset_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(DATASET_SYM);
			setState(238);
			match(OPAREN);
			setState(241);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REC_SYM:
				{
				setState(239);
				exploded_dataset_record_def();
				}
				break;
			case OCURLY:
				{
				setState(240);
				inline_dataset_record_def();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(243);
			match(CPAREN);
			setState(244);
			_la = _input.LA(1);
			if ( !(_la==TOKEN || _la==UTOKEN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(245);
				match(OCURLY);
				setState(246);
				opts();
				setState(247);
				match(CCURLY);
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
		enterRule(_localctx, 38, RULE_opts);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			opt();
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(252);
				match(COMMA);
				setState(253);
				opt();
				}
				}
				setState(258);
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
		public SetdefaultvalContext setdefaultval() {
			return getRuleContext(SetdefaultvalContext.class,0);
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
		public BlobContext blob() {
			return getRuleContext(BlobContext.class,0);
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
		enterRule(_localctx, 40, RULE_opt);
		try {
			setState(266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				maxlength();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
				maxcount();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(261);
				setdefaultval();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(262);
				defaultval();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(263);
				xpath();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(264);
				xmldefaultval();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(265);
				blob();
				}
				break;
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
		enterRule(_localctx, 42, RULE_maxlength);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				{
				setState(268);
				match(T__2);
				setState(269);
				match(OPAREN);
				setState(270);
				match(INT);
				setState(271);
				match(CPAREN);
				}
				break;
			case T__3:
				{
				setState(272);
				match(T__3);
				setState(273);
				match(OPAREN);
				setState(274);
				match(INT);
				setState(275);
				match(CPAREN);
				}
				break;
			case T__5:
				{
				setState(276);
				match(T__5);
				setState(277);
				match(OPAREN);
				setState(278);
				match(INT);
				setState(279);
				match(CPAREN);
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

	public static class BlobContext extends ParserRuleContext {
		public BlobContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blob; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclRecordListener ) ((EclRecordListener)listener).enterBlob(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclRecordListener ) ((EclRecordListener)listener).exitBlob(this);
		}
	}

	public final BlobContext blob() throws RecognitionException {
		BlobContext _localctx = new BlobContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_blob);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			_la = _input.LA(1);
			if ( !(_la==T__6 || _la==T__7) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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
		enterRule(_localctx, 46, RULE_maxcount);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(T__8);
			setState(285);
			match(OPAREN);
			setState(286);
			match(INT);
			setState(287);
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
		enterRule(_localctx, 48, RULE_defaultval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(289);
			match(T__9);
			setState(290);
			match(OPAREN);
			setState(291);
			match(STRING);
			setState(292);
			match(CPAREN);
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
		enterRule(_localctx, 50, RULE_xpath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(T__10);
			setState(295);
			match(OPAREN);
			setState(296);
			match(STRING);
			setState(297);
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
		enterRule(_localctx, 52, RULE_xmldefaultval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(T__11);
			setState(300);
			match(OPAREN);
			setState(301);
			match(STRING);
			setState(302);
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

	public static class SetdefaultvalContext extends ParserRuleContext {
		public TerminalNode OPAREN() { return getToken(EclRecordParser.OPAREN, 0); }
		public TerminalNode OSQUARE() { return getToken(EclRecordParser.OSQUARE, 0); }
		public TerminalNode STRING() { return getToken(EclRecordParser.STRING, 0); }
		public TerminalNode CSQUARE() { return getToken(EclRecordParser.CSQUARE, 0); }
		public TerminalNode CPAREN() { return getToken(EclRecordParser.CPAREN, 0); }
		public TerminalNode SETSTRING() { return getToken(EclRecordParser.SETSTRING, 0); }
		public SetdefaultvalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setdefaultval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclRecordListener ) ((EclRecordListener)listener).enterSetdefaultval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclRecordListener ) ((EclRecordListener)listener).exitSetdefaultval(this);
		}
	}

	public final SetdefaultvalContext setdefaultval() throws RecognitionException {
		SetdefaultvalContext _localctx = new SetdefaultvalContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_setdefaultval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(304);
				match(T__9);
				setState(305);
				match(OPAREN);
				setState(306);
				match(OSQUARE);
				setState(307);
				match(STRING);
				setState(308);
				match(CSQUARE);
				setState(309);
				match(CPAREN);
				}
				break;
			case 2:
				{
				setState(310);
				match(T__9);
				setState(311);
				match(OPAREN);
				setState(312);
				match(SETSTRING);
				setState(313);
				match(CPAREN);
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

	public static class Annotation_nameContext extends ParserRuleContext {
		public TerminalNode ATOKEN() { return getToken(EclRecordParser.ATOKEN, 0); }
		public Annotation_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclRecordListener ) ((EclRecordListener)listener).enterAnnotation_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclRecordListener ) ((EclRecordListener)listener).exitAnnotation_name(this);
		}
	}

	public final Annotation_nameContext annotation_name() throws RecognitionException {
		Annotation_nameContext _localctx = new Annotation_nameContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_annotation_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(ATOKEN);
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

	public static class Annotation_paramContext extends ParserRuleContext {
		public TerminalNode TOKEN() { return getToken(EclRecordParser.TOKEN, 0); }
		public TerminalNode UTOKEN() { return getToken(EclRecordParser.UTOKEN, 0); }
		public Annotation_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclRecordListener ) ((EclRecordListener)listener).enterAnnotation_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclRecordListener ) ((EclRecordListener)listener).exitAnnotation_param(this);
		}
	}

	public final Annotation_paramContext annotation_param() throws RecognitionException {
		Annotation_paramContext _localctx = new Annotation_paramContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_annotation_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			_la = _input.LA(1);
			if ( !(_la==TOKEN || _la==UTOKEN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class Annotation_argumentsContext extends ParserRuleContext {
		public List<Annotation_paramContext> annotation_param() {
			return getRuleContexts(Annotation_paramContext.class);
		}
		public Annotation_paramContext annotation_param(int i) {
			return getRuleContext(Annotation_paramContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(EclRecordParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EclRecordParser.COMMA, i);
		}
		public Annotation_argumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclRecordListener ) ((EclRecordListener)listener).enterAnnotation_arguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclRecordListener ) ((EclRecordListener)listener).exitAnnotation_arguments(this);
		}
	}

	public final Annotation_argumentsContext annotation_arguments() throws RecognitionException {
		Annotation_argumentsContext _localctx = new Annotation_argumentsContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_annotation_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			annotation_param();
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(321);
				match(COMMA);
				setState(322);
				annotation_param();
				}
				}
				setState(327);
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

	public static class AnnotationContext extends ParserRuleContext {
		public Annotation_nameContext annotation_name() {
			return getRuleContext(Annotation_nameContext.class,0);
		}
		public TerminalNode OPAREN() { return getToken(EclRecordParser.OPAREN, 0); }
		public Annotation_argumentsContext annotation_arguments() {
			return getRuleContext(Annotation_argumentsContext.class,0);
		}
		public TerminalNode CPAREN() { return getToken(EclRecordParser.CPAREN, 0); }
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclRecordListener ) ((EclRecordListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclRecordListener ) ((EclRecordListener)listener).exitAnnotation(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_annotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			annotation_name();
			setState(333);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(329);
				match(OPAREN);
				setState(330);
				annotation_arguments();
				setState(331);
				match(CPAREN);
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

	public static class CommentContext extends ParserRuleContext {
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(EclRecordParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EclRecordParser.COMMA, i);
		}
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EclRecordListener ) ((EclRecordListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EclRecordListener ) ((EclRecordListener)listener).exitComment(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_comment);
		try {
			int _alt;
			setState(379);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(335);
				match(T__12);
				setState(337);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(336);
					annotation();
					}
					break;
				}
				setState(343);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(339);
						match(COMMA);
						setState(340);
						annotation();
						}
						} 
					}
					setState(345);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				}
				setState(349);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(346);
						matchWildcard();
						}
						} 
					}
					setState(351);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				}
				}
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(352);
				match(T__13);
				setState(354);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(353);
					annotation();
					}
					break;
				}
				setState(360);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(356);
						match(COMMA);
						setState(357);
						annotation();
						}
						} 
					}
					setState(362);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				}
				setState(366);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(363);
						matchWildcard();
						}
						} 
					}
					setState(368);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				}
				setState(377);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(372);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
					while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1+1 ) {
							{
							{
							setState(369);
							matchWildcard();
							}
							} 
						}
						setState(374);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
					}
					setState(375);
					match(T__14);
					}
					break;
				case 2:
					{
					setState(376);
					match(T__14);
					}
					break;
				}
				}
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

	public static final String _serializedATN =
		"\u0004\u0001%\u017e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0001\u0000\u0001\u0000\u0005\u0000"+
		"E\b\u0000\n\u0000\f\u0000H\t\u0000\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0005\u0002O\b\u0002\n\u0002\f\u0002R\t\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003W\b\u0003\n\u0003\f\u0003"+
		"Z\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0005\u0005c\b\u0005\n\u0005\f\u0005f\t\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006n\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006v\b\u0006\u0001\u0007\u0003\u0007"+
		"y\b\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u0088\b\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u008c\b\u000b\n\u000b"+
		"\f\u000b\u008f\t\u000b\u0001\u000b\u0005\u000b\u0092\b\u000b\n\u000b\f"+
		"\u000b\u0095\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0003\f\u009d\b\f\u0001\f\u0003\f\u00a0\b\f\u0001\f\u0001\f"+
		"\u0001\f\u0003\f\u00a5\b\f\u0001\f\u0001\f\u0001\f\u0003\f\u00aa\b\f\u0005"+
		"\f\u00ac\b\f\n\f\f\f\u00af\t\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0003\r\u00b8\b\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0003\u000e\u00bd\b\u000e\u0001\u000e\u0003\u000e\u00c0\b\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00c5\b\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u00ca\b\u000e\u0005\u000e\u00cc\b\u000e"+
		"\n\u000e\f\u000e\u00cf\t\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00d7\b\u000f\n\u000f\f\u000f"+
		"\u00da\t\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u00e1\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011"+
		"\u00ec\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u00f2\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0003\u0012\u00fa\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0005\u0013\u00ff\b\u0013\n\u0013\f\u0013\u0102\t\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003"+
		"\u0014\u010b\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0003\u0015\u0119\b\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003"+
		"\u001b\u013b\b\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u0144\b\u001e\n\u001e\f\u001e"+
		"\u0147\t\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0003\u001f\u014e\b\u001f\u0001 \u0001 \u0003 \u0152\b \u0001 \u0001"+
		" \u0005 \u0156\b \n \f \u0159\t \u0001 \u0005 \u015c\b \n \f \u015f\t"+
		" \u0001 \u0001 \u0003 \u0163\b \u0001 \u0001 \u0005 \u0167\b \n \f \u016a"+
		"\t \u0001 \u0005 \u016d\b \n \f \u0170\t \u0001 \u0005 \u0173\b \n \f"+
		" \u0176\t \u0001 \u0001 \u0003 \u017a\b \u0003 \u017c\b \u0001 \u0003"+
		"\u015d\u016e\u0174\u0000!\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@\u0000\u0005\u0003"+
		"\u0000\u001f\u001f!!#$\u0001\u0000\u0001\u0002\u0001\u0000#$\u0002\u0000"+
		"\u0003\u0004#$\u0001\u0000\u0007\b\u018f\u0000B\u0001\u0000\u0000\u0000"+
		"\u0002I\u0001\u0000\u0000\u0000\u0004K\u0001\u0000\u0000\u0000\u0006S"+
		"\u0001\u0000\u0000\u0000\b[\u0001\u0000\u0000\u0000\n_\u0001\u0000\u0000"+
		"\u0000\fu\u0001\u0000\u0000\u0000\u000ex\u0001\u0000\u0000\u0000\u0010"+
		"|\u0001\u0000\u0000\u0000\u0012~\u0001\u0000\u0000\u0000\u0014\u0082\u0001"+
		"\u0000\u0000\u0000\u0016\u0084\u0001\u0000\u0000\u0000\u0018\u0099\u0001"+
		"\u0000\u0000\u0000\u001a\u00b3\u0001\u0000\u0000\u0000\u001c\u00b9\u0001"+
		"\u0000\u0000\u0000\u001e\u00d2\u0001\u0000\u0000\u0000 \u00e0\u0001\u0000"+
		"\u0000\u0000\"\u00e2\u0001\u0000\u0000\u0000$\u00ed\u0001\u0000\u0000"+
		"\u0000&\u00fb\u0001\u0000\u0000\u0000(\u010a\u0001\u0000\u0000\u0000*"+
		"\u0118\u0001\u0000\u0000\u0000,\u011a\u0001\u0000\u0000\u0000.\u011c\u0001"+
		"\u0000\u0000\u00000\u0121\u0001\u0000\u0000\u00002\u0126\u0001\u0000\u0000"+
		"\u00004\u012b\u0001\u0000\u0000\u00006\u013a\u0001\u0000\u0000\u00008"+
		"\u013c\u0001\u0000\u0000\u0000:\u013e\u0001\u0000\u0000\u0000<\u0140\u0001"+
		"\u0000\u0000\u0000>\u0148\u0001\u0000\u0000\u0000@\u017b\u0001\u0000\u0000"+
		"\u0000BF\u0003 \u0010\u0000CE\u0003 \u0010\u0000DC\u0001\u0000\u0000\u0000"+
		"EH\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000"+
		"\u0000G\u0001\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000IJ\u0007"+
		"\u0000\u0000\u0000J\u0003\u0001\u0000\u0000\u0000KP\u0003\u0002\u0001"+
		"\u0000LM\u0005\u0017\u0000\u0000MO\u0003\u0002\u0001\u0000NL\u0001\u0000"+
		"\u0000\u0000OR\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000PQ\u0001"+
		"\u0000\u0000\u0000Q\u0005\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000"+
		"\u0000SX\u0005#\u0000\u0000TU\u0005\u0017\u0000\u0000UW\u0005#\u0000\u0000"+
		"VT\u0001\u0000\u0000\u0000WZ\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000"+
		"\u0000XY\u0001\u0000\u0000\u0000Y\u0007\u0001\u0000\u0000\u0000ZX\u0001"+
		"\u0000\u0000\u0000[\\\u0003\u0002\u0001\u0000\\]\u0005\u0019\u0000\u0000"+
		"]^\u0003\u0004\u0002\u0000^\t\u0001\u0000\u0000\u0000_d\u0003\b\u0004"+
		"\u0000`a\u0005\u0017\u0000\u0000ac\u0003\b\u0004\u0000b`\u0001\u0000\u0000"+
		"\u0000cf\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000de\u0001\u0000"+
		"\u0000\u0000e\u000b\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000"+
		"gh\u0003\u000e\u0007\u0000hm\u0003\u0010\b\u0000ij\u0005\u0015\u0000\u0000"+
		"jk\u0003&\u0013\u0000kl\u0005\u0016\u0000\u0000ln\u0001\u0000\u0000\u0000"+
		"mi\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000nv\u0001\u0000\u0000"+
		"\u0000ov\u0003\"\u0011\u0000pv\u0003$\u0012\u0000qr\u0003\u001e\u000f"+
		"\u0000rs\u0003\u0010\b\u0000sv\u0001\u0000\u0000\u0000tv\u0003\u0012\t"+
		"\u0000ug\u0001\u0000\u0000\u0000uo\u0001\u0000\u0000\u0000up\u0001\u0000"+
		"\u0000\u0000uq\u0001\u0000\u0000\u0000ut\u0001\u0000\u0000\u0000v\r\u0001"+
		"\u0000\u0000\u0000wy\u0007\u0001\u0000\u0000xw\u0001\u0000\u0000\u0000"+
		"xy\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z{\u0007\u0002\u0000"+
		"\u0000{\u000f\u0001\u0000\u0000\u0000|}\u0007\u0003\u0000\u0000}\u0011"+
		"\u0001\u0000\u0000\u0000~\u007f\u0005\u0013\u0000\u0000\u007f\u0080\u0005"+
		"#\u0000\u0000\u0080\u0081\u0005\u0014\u0000\u0000\u0081\u0013\u0001\u0000"+
		"\u0000\u0000\u0082\u0083\u0005\u0005\u0000\u0000\u0083\u0015\u0001\u0000"+
		"\u0000\u0000\u0084\u0087\u0005\u0015\u0000\u0000\u0085\u0086\u0005\u0017"+
		"\u0000\u0000\u0086\u0088\u0003*\u0015\u0000\u0087\u0085\u0001\u0000\u0000"+
		"\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000"+
		"\u0000\u0089\u0093\u0003\f\u0006\u0000\u008a\u008c\u0005\u0017\u0000\u0000"+
		"\u008b\u008a\u0001\u0000\u0000\u0000\u008c\u008f\u0001\u0000\u0000\u0000"+
		"\u008d\u008b\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000"+
		"\u008e\u0090\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000"+
		"\u0090\u0092\u0003\f\u0006\u0000\u0091\u008d\u0001\u0000\u0000\u0000\u0092"+
		"\u0095\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0093"+
		"\u0094\u0001\u0000\u0000\u0000\u0094\u0096\u0001\u0000\u0000\u0000\u0095"+
		"\u0093\u0001\u0000\u0000\u0000\u0096\u0097\u0005\u0016\u0000\u0000\u0097"+
		"\u0098\u0005\u0018\u0000\u0000\u0098\u0017\u0001\u0000\u0000\u0000\u0099"+
		"\u009c\u0005\u001b\u0000\u0000\u009a\u009b\u0005\u0017\u0000\u0000\u009b"+
		"\u009d\u0003*\u0015\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009c\u009d"+
		"\u0001\u0000\u0000\u0000\u009d\u009f\u0001\u0000\u0000\u0000\u009e\u00a0"+
		"\u0003@ \u0000\u009f\u009e\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000"+
		"\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u00a2\u0003\f\u0006"+
		"\u0000\u00a2\u00a4\u0005\u0018\u0000\u0000\u00a3\u00a5\u0003@ \u0000\u00a4"+
		"\u00a3\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5"+
		"\u00ad\u0001\u0000\u0000\u0000\u00a6\u00a7\u0003\f\u0006\u0000\u00a7\u00a9"+
		"\u0005\u0018\u0000\u0000\u00a8\u00aa\u0003@ \u0000\u00a9\u00a8\u0001\u0000"+
		"\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u00ac\u0001\u0000"+
		"\u0000\u0000\u00ab\u00a6\u0001\u0000\u0000\u0000\u00ac\u00af\u0001\u0000"+
		"\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000"+
		"\u0000\u0000\u00ae\u00b0\u0001\u0000\u0000\u0000\u00af\u00ad\u0001\u0000"+
		"\u0000\u0000\u00b0\u00b1\u0005\u001c\u0000\u0000\u00b1\u00b2\u0005\u0018"+
		"\u0000\u0000\u00b2\u0019\u0001\u0000\u0000\u0000\u00b3\u00b4\u0007\u0002"+
		"\u0000\u0000\u00b4\u00b7\u0005\u001a\u0000\u0000\u00b5\u00b8\u0003\u0018"+
		"\f\u0000\u00b6\u00b8\u0003\u0016\u000b\u0000\u00b7\u00b5\u0001\u0000\u0000"+
		"\u0000\u00b7\u00b6\u0001\u0000\u0000\u0000\u00b8\u001b\u0001\u0000\u0000"+
		"\u0000\u00b9\u00bc\u0005\u001b\u0000\u0000\u00ba\u00bb\u0005\u0017\u0000"+
		"\u0000\u00bb\u00bd\u0003*\u0015\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000"+
		"\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd\u00bf\u0001\u0000\u0000\u0000"+
		"\u00be\u00c0\u0003@ \u0000\u00bf\u00be\u0001\u0000\u0000\u0000\u00bf\u00c0"+
		"\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\u00c2"+
		"\u0003\f\u0006\u0000\u00c2\u00c4\u0005\u0018\u0000\u0000\u00c3\u00c5\u0003"+
		"@ \u0000\u00c4\u00c3\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000"+
		"\u0000\u00c5\u00cd\u0001\u0000\u0000\u0000\u00c6\u00c7\u0003\f\u0006\u0000"+
		"\u00c7\u00c9\u0005\u0018\u0000\u0000\u00c8\u00ca\u0003@ \u0000\u00c9\u00c8"+
		"\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca\u00cc"+
		"\u0001\u0000\u0000\u0000\u00cb\u00c6\u0001\u0000\u0000\u0000\u00cc\u00cf"+
		"\u0001\u0000\u0000\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000\u00cd\u00ce"+
		"\u0001\u0000\u0000\u0000\u00ce\u00d0\u0001\u0000\u0000\u0000\u00cf\u00cd"+
		"\u0001\u0000\u0000\u0000\u00d0\u00d1\u0005\u001c\u0000\u0000\u00d1\u001d"+
		"\u0001\u0000\u0000\u0000\u00d2\u00d3\u0005\u0015\u0000\u0000\u00d3\u00d8"+
		"\u0003\f\u0006\u0000\u00d4\u00d5\u0005\u0017\u0000\u0000\u00d5\u00d7\u0003"+
		"\f\u0006\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d7\u00da\u0001\u0000"+
		"\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000"+
		"\u0000\u0000\u00d9\u00db\u0001\u0000\u0000\u0000\u00da\u00d8\u0001\u0000"+
		"\u0000\u0000\u00db\u00dc\u0005\u0016\u0000\u0000\u00dc\u001f\u0001\u0000"+
		"\u0000\u0000\u00dd\u00e1\u0003\u0016\u000b\u0000\u00de\u00e1\u0003\u0018"+
		"\f\u0000\u00df\u00e1\u0003\u001a\r\u0000\u00e0\u00dd\u0001\u0000\u0000"+
		"\u0000\u00e0\u00de\u0001\u0000\u0000\u0000\u00e0\u00df\u0001\u0000\u0000"+
		"\u0000\u00e1!\u0001\u0000\u0000\u0000\u00e2\u00e3\u0005\u001d\u0000\u0000"+
		"\u00e3\u00e4\u0005\u0013\u0000\u0000\u00e4\u00e5\u0007\u0002\u0000\u0000"+
		"\u00e5\u00e6\u0005\u0014\u0000\u0000\u00e6\u00eb\u0007\u0002\u0000\u0000"+
		"\u00e7\u00e8\u0005\u0015\u0000\u0000\u00e8\u00e9\u0003&\u0013\u0000\u00e9"+
		"\u00ea\u0005\u0016\u0000\u0000\u00ea\u00ec\u0001\u0000\u0000\u0000\u00eb"+
		"\u00e7\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec"+
		"#\u0001\u0000\u0000\u0000\u00ed\u00ee\u0005\u001d\u0000\u0000\u00ee\u00f1"+
		"\u0005\u0013\u0000\u0000\u00ef\u00f2\u0003\u001c\u000e\u0000\u00f0\u00f2"+
		"\u0003\u001e\u000f\u0000\u00f1\u00ef\u0001\u0000\u0000\u0000\u00f1\u00f0"+
		"\u0001\u0000\u0000\u0000\u00f2\u00f3\u0001\u0000\u0000\u0000\u00f3\u00f4"+
		"\u0005\u0014\u0000\u0000\u00f4\u00f9\u0007\u0002\u0000\u0000\u00f5\u00f6"+
		"\u0005\u0015\u0000\u0000\u00f6\u00f7\u0003&\u0013\u0000\u00f7\u00f8\u0005"+
		"\u0016\u0000\u0000\u00f8\u00fa\u0001\u0000\u0000\u0000\u00f9\u00f5\u0001"+
		"\u0000\u0000\u0000\u00f9\u00fa\u0001\u0000\u0000\u0000\u00fa%\u0001\u0000"+
		"\u0000\u0000\u00fb\u0100\u0003(\u0014\u0000\u00fc\u00fd\u0005\u0017\u0000"+
		"\u0000\u00fd\u00ff\u0003(\u0014\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000"+
		"\u00ff\u0102\u0001\u0000\u0000\u0000\u0100\u00fe\u0001\u0000\u0000\u0000"+
		"\u0100\u0101\u0001\u0000\u0000\u0000\u0101\'\u0001\u0000\u0000\u0000\u0102"+
		"\u0100\u0001\u0000\u0000\u0000\u0103\u010b\u0003*\u0015\u0000\u0104\u010b"+
		"\u0003.\u0017\u0000\u0105\u010b\u00036\u001b\u0000\u0106\u010b\u00030"+
		"\u0018\u0000\u0107\u010b\u00032\u0019\u0000\u0108\u010b\u00034\u001a\u0000"+
		"\u0109\u010b\u0003,\u0016\u0000\u010a\u0103\u0001\u0000\u0000\u0000\u010a"+
		"\u0104\u0001\u0000\u0000\u0000\u010a\u0105\u0001\u0000\u0000\u0000\u010a"+
		"\u0106\u0001\u0000\u0000\u0000\u010a\u0107\u0001\u0000\u0000\u0000\u010a"+
		"\u0108\u0001\u0000\u0000\u0000\u010a\u0109\u0001\u0000\u0000\u0000\u010b"+
		")\u0001\u0000\u0000\u0000\u010c\u010d\u0005\u0003\u0000\u0000\u010d\u010e"+
		"\u0005\u0013\u0000\u0000\u010e\u010f\u0005\u001f\u0000\u0000\u010f\u0119"+
		"\u0005\u0014\u0000\u0000\u0110\u0111\u0005\u0004\u0000\u0000\u0111\u0112"+
		"\u0005\u0013\u0000\u0000\u0112\u0113\u0005\u001f\u0000\u0000\u0113\u0119"+
		"\u0005\u0014\u0000\u0000\u0114\u0115\u0005\u0006\u0000\u0000\u0115\u0116"+
		"\u0005\u0013\u0000\u0000\u0116\u0117\u0005\u001f\u0000\u0000\u0117\u0119"+
		"\u0005\u0014\u0000\u0000\u0118\u010c\u0001\u0000\u0000\u0000\u0118\u0110"+
		"\u0001\u0000\u0000\u0000\u0118\u0114\u0001\u0000\u0000\u0000\u0119+\u0001"+
		"\u0000\u0000\u0000\u011a\u011b\u0007\u0004\u0000\u0000\u011b-\u0001\u0000"+
		"\u0000\u0000\u011c\u011d\u0005\t\u0000\u0000\u011d\u011e\u0005\u0013\u0000"+
		"\u0000\u011e\u011f\u0005\u001f\u0000\u0000\u011f\u0120\u0005\u0014\u0000"+
		"\u0000\u0120/\u0001\u0000\u0000\u0000\u0121\u0122\u0005\n\u0000\u0000"+
		"\u0122\u0123\u0005\u0013\u0000\u0000\u0123\u0124\u0005!\u0000\u0000\u0124"+
		"\u0125\u0005\u0014\u0000\u0000\u01251\u0001\u0000\u0000\u0000\u0126\u0127"+
		"\u0005\u000b\u0000\u0000\u0127\u0128\u0005\u0013\u0000\u0000\u0128\u0129"+
		"\u0005!\u0000\u0000\u0129\u012a\u0005\u0014\u0000\u0000\u012a3\u0001\u0000"+
		"\u0000\u0000\u012b\u012c\u0005\f\u0000\u0000\u012c\u012d\u0005\u0013\u0000"+
		"\u0000\u012d\u012e\u0005!\u0000\u0000\u012e\u012f\u0005\u0014\u0000\u0000"+
		"\u012f5\u0001\u0000\u0000\u0000\u0130\u0131\u0005\n\u0000\u0000\u0131"+
		"\u0132\u0005\u0013\u0000\u0000\u0132\u0133\u0005\u0011\u0000\u0000\u0133"+
		"\u0134\u0005!\u0000\u0000\u0134\u0135\u0005\u0012\u0000\u0000\u0135\u013b"+
		"\u0005\u0014\u0000\u0000\u0136\u0137\u0005\n\u0000\u0000\u0137\u0138\u0005"+
		"\u0013\u0000\u0000\u0138\u0139\u0005 \u0000\u0000\u0139\u013b\u0005\u0014"+
		"\u0000\u0000\u013a\u0130\u0001\u0000\u0000\u0000\u013a\u0136\u0001\u0000"+
		"\u0000\u0000\u013b7\u0001\u0000\u0000\u0000\u013c\u013d\u0005\"\u0000"+
		"\u0000\u013d9\u0001\u0000\u0000\u0000\u013e\u013f\u0007\u0002\u0000\u0000"+
		"\u013f;\u0001\u0000\u0000\u0000\u0140\u0145\u0003:\u001d\u0000\u0141\u0142"+
		"\u0005\u0017\u0000\u0000\u0142\u0144\u0003:\u001d\u0000\u0143\u0141\u0001"+
		"\u0000\u0000\u0000\u0144\u0147\u0001\u0000\u0000\u0000\u0145\u0143\u0001"+
		"\u0000\u0000\u0000\u0145\u0146\u0001\u0000\u0000\u0000\u0146=\u0001\u0000"+
		"\u0000\u0000\u0147\u0145\u0001\u0000\u0000\u0000\u0148\u014d\u00038\u001c"+
		"\u0000\u0149\u014a\u0005\u0013\u0000\u0000\u014a\u014b\u0003<\u001e\u0000"+
		"\u014b\u014c\u0005\u0014\u0000\u0000\u014c\u014e\u0001\u0000\u0000\u0000"+
		"\u014d\u0149\u0001\u0000\u0000\u0000\u014d\u014e\u0001\u0000\u0000\u0000"+
		"\u014e?\u0001\u0000\u0000\u0000\u014f\u0151\u0005\r\u0000\u0000\u0150"+
		"\u0152\u0003>\u001f\u0000\u0151\u0150\u0001\u0000\u0000\u0000\u0151\u0152"+
		"\u0001\u0000\u0000\u0000\u0152\u0157\u0001\u0000\u0000\u0000\u0153\u0154"+
		"\u0005\u0017\u0000\u0000\u0154\u0156\u0003>\u001f\u0000\u0155\u0153\u0001"+
		"\u0000\u0000\u0000\u0156\u0159\u0001\u0000\u0000\u0000\u0157\u0155\u0001"+
		"\u0000\u0000\u0000\u0157\u0158\u0001\u0000\u0000\u0000\u0158\u015d\u0001"+
		"\u0000\u0000\u0000\u0159\u0157\u0001\u0000\u0000\u0000\u015a\u015c\t\u0000"+
		"\u0000\u0000\u015b\u015a\u0001\u0000\u0000\u0000\u015c\u015f\u0001\u0000"+
		"\u0000\u0000\u015d\u015e\u0001\u0000\u0000\u0000\u015d\u015b\u0001\u0000"+
		"\u0000\u0000\u015e\u017c\u0001\u0000\u0000\u0000\u015f\u015d\u0001\u0000"+
		"\u0000\u0000\u0160\u0162\u0005\u000e\u0000\u0000\u0161\u0163\u0003>\u001f"+
		"\u0000\u0162\u0161\u0001\u0000\u0000\u0000\u0162\u0163\u0001\u0000\u0000"+
		"\u0000\u0163\u0168\u0001\u0000\u0000\u0000\u0164\u0165\u0005\u0017\u0000"+
		"\u0000\u0165\u0167\u0003>\u001f\u0000\u0166\u0164\u0001\u0000\u0000\u0000"+
		"\u0167\u016a\u0001\u0000\u0000\u0000\u0168\u0166\u0001\u0000\u0000\u0000"+
		"\u0168\u0169\u0001\u0000\u0000\u0000\u0169\u016e\u0001\u0000\u0000\u0000"+
		"\u016a\u0168\u0001\u0000\u0000\u0000\u016b\u016d\t\u0000\u0000\u0000\u016c"+
		"\u016b\u0001\u0000\u0000\u0000\u016d\u0170\u0001\u0000\u0000\u0000\u016e"+
		"\u016f\u0001\u0000\u0000\u0000\u016e\u016c\u0001\u0000\u0000\u0000\u016f"+
		"\u0179\u0001\u0000\u0000\u0000\u0170\u016e\u0001\u0000\u0000\u0000\u0171"+
		"\u0173\t\u0000\u0000\u0000\u0172\u0171\u0001\u0000\u0000\u0000\u0173\u0176"+
		"\u0001\u0000\u0000\u0000\u0174\u0175\u0001\u0000\u0000\u0000\u0174\u0172"+
		"\u0001\u0000\u0000\u0000\u0175\u0177\u0001\u0000\u0000\u0000\u0176\u0174"+
		"\u0001\u0000\u0000\u0000\u0177\u017a\u0005\u000f\u0000\u0000\u0178\u017a"+
		"\u0005\u000f\u0000\u0000\u0179\u0174\u0001\u0000\u0000\u0000\u0179\u0178"+
		"\u0001\u0000\u0000\u0000\u017a\u017c\u0001\u0000\u0000\u0000\u017b\u014f"+
		"\u0001\u0000\u0000\u0000\u017b\u0160\u0001\u0000\u0000\u0000\u017cA\u0001"+
		"\u0000\u0000\u0000)FPXdmux\u0087\u008d\u0093\u009c\u009f\u00a4\u00a9\u00ad"+
		"\u00b7\u00bc\u00bf\u00c4\u00c9\u00cd\u00d8\u00e0\u00eb\u00f1\u00f9\u0100"+
		"\u010a\u0118\u013a\u0145\u014d\u0151\u0157\u015d\u0162\u0168\u016e\u0174"+
		"\u0179\u017b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}