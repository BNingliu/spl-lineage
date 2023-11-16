// Generated from com\myxql\parser\job\antlr4\MyxqlJobParser.g4 by ANTLR 4.10.1
package com.myxql.parser.job.antlr4;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MyxqlJobParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SPACE=1, SPEC_MYSQL_COMMENT=2, COMMENT_INPUT=3, LINE_COMMENT=4, SET=5, 
		UNSET=6, USE=7, STAR=8, DIVIDE=9, MODULE=10, PLUS=11, MINUS=12, EQUAL_SYMBOL=13, 
		GREATER_SYMBOL=14, LESS_SYMBOL=15, EXCLAMATION_SYMBOL=16, BIT_NOT_OP=17, 
		BIT_OR_OP=18, BIT_AND_OP=19, BIT_XOR_OP=20, DOT=21, LR_BRACKET=22, RR_BRACKET=23, 
		COMMA=24, SEMI=25, OPEN_BRACKET=26, CLOSE_BRACKET=27, UNDERLINE=28, QUESTION_MARK=29, 
		SELECT=30, CREATE=31, INSERT=32, ALTER=33, DROP=34, SHOW=35, ANALYZE=36, 
		EXPLAIN=37, DESC=38, REFRESH=39, COMMENT=40, CACHE=41, UNCACHE=42, LOAD=43, 
		CLEAR=44, TRUNCATE=45, RESET=46, DOT_ID=47, ID=48, REVERSE_QUOTE_ID=49, 
		STRING_LITERAL=50, ERROR_RECONGNIGION=51;
	public static final int
		RULE_root = 0, RULE_jobCommonds = 1, RULE_jobCommond = 2, RULE_execCommond = 3, 
		RULE_resourceNameExpr = 4, RULE_classNameExpr = 5, RULE_paramsExpr = 6, 
		RULE_paramExpr = 7, RULE_filePath = 8, RULE_setCommond = 9, RULE_unsetCommond = 10, 
		RULE_useCommond = 11, RULE_sqlCommond = 12, RULE_keyExpr = 13, RULE_valueExpr = 14, 
		RULE_word = 15, RULE_emptyCommond = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "jobCommonds", "jobCommond", "execCommond", "resourceNameExpr", 
			"classNameExpr", "paramsExpr", "paramExpr", "filePath", "setCommond", 
			"unsetCommond", "useCommond", "sqlCommond", "keyExpr", "valueExpr", "word", 
			"emptyCommond"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'SET'", "'UNSET'", "'USE'", "'*'", "'/'", 
			"'%'", "'+'", "'-'", "'='", "'>'", "'<'", "'!'", "'~'", "'|'", "'&'", 
			"'^'", "'.'", "'('", "')'", "','", "';'", "'['", "']'", "'_'", "'?'", 
			"'SELECT'", "'CREATE'", "'INSERT'", "'ALTER'", "'DROP'", "'SHOW'", "'ANALYZE'", 
			"'EXPLAIN'", "'DESC'", "'REFRESH'", "'COMMENT'", "'CACHE'", "'UNCACHE'", 
			"'LOAD'", "'CLEAR'", "'TRUNCATE'", "'RESET'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SPACE", "SPEC_MYSQL_COMMENT", "COMMENT_INPUT", "LINE_COMMENT", 
			"SET", "UNSET", "USE", "STAR", "DIVIDE", "MODULE", "PLUS", "MINUS", "EQUAL_SYMBOL", 
			"GREATER_SYMBOL", "LESS_SYMBOL", "EXCLAMATION_SYMBOL", "BIT_NOT_OP", 
			"BIT_OR_OP", "BIT_AND_OP", "BIT_XOR_OP", "DOT", "LR_BRACKET", "RR_BRACKET", 
			"COMMA", "SEMI", "OPEN_BRACKET", "CLOSE_BRACKET", "UNDERLINE", "QUESTION_MARK", 
			"SELECT", "CREATE", "INSERT", "ALTER", "DROP", "SHOW", "ANALYZE", "EXPLAIN", 
			"DESC", "REFRESH", "COMMENT", "CACHE", "UNCACHE", "LOAD", "CLEAR", "TRUNCATE", 
			"RESET", "DOT_ID", "ID", "REVERSE_QUOTE_ID", "STRING_LITERAL", "ERROR_RECONGNIGION"
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
	public String getGrammarFileName() { return "MyxqlJobParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MyxqlJobParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class RootContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MyxqlJobParser.EOF, 0); }
		public JobCommondsContext jobCommonds() {
			return getRuleContext(JobCommondsContext.class,0);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyxqlJobParserListener ) ((MyxqlJobParserListener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyxqlJobParserListener ) ((MyxqlJobParserListener)listener).exitRoot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyxqlJobParserVisitor ) return ((MyxqlJobParserVisitor<? extends T>)visitor).visitRoot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SET) | (1L << UNSET) | (1L << USE) | (1L << DIVIDE) | (1L << SEMI) | (1L << SELECT) | (1L << CREATE) | (1L << INSERT) | (1L << ALTER) | (1L << DROP) | (1L << SHOW) | (1L << ANALYZE) | (1L << EXPLAIN) | (1L << DESC) | (1L << REFRESH) | (1L << COMMENT) | (1L << CACHE) | (1L << UNCACHE) | (1L << LOAD) | (1L << CLEAR) | (1L << TRUNCATE) | (1L << RESET) | (1L << ID))) != 0)) {
				{
				setState(34);
				jobCommonds();
				}
			}

			setState(37);
			match(EOF);
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

	public static class JobCommondsContext extends ParserRuleContext {
		public List<JobCommondContext> jobCommond() {
			return getRuleContexts(JobCommondContext.class);
		}
		public JobCommondContext jobCommond(int i) {
			return getRuleContext(JobCommondContext.class,i);
		}
		public List<EmptyCommondContext> emptyCommond() {
			return getRuleContexts(EmptyCommondContext.class);
		}
		public EmptyCommondContext emptyCommond(int i) {
			return getRuleContext(EmptyCommondContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(MyxqlJobParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(MyxqlJobParser.SEMI, i);
		}
		public JobCommondsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jobCommonds; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyxqlJobParserListener ) ((MyxqlJobParserListener)listener).enterJobCommonds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyxqlJobParserListener ) ((MyxqlJobParserListener)listener).exitJobCommonds(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyxqlJobParserVisitor ) return ((MyxqlJobParserVisitor<? extends T>)visitor).visitJobCommonds(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JobCommondsContext jobCommonds() throws RecognitionException {
		JobCommondsContext _localctx = new JobCommondsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_jobCommonds);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(43);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case SET:
					case UNSET:
					case USE:
					case DIVIDE:
					case SELECT:
					case CREATE:
					case INSERT:
					case ALTER:
					case DROP:
					case SHOW:
					case ANALYZE:
					case EXPLAIN:
					case DESC:
					case REFRESH:
					case COMMENT:
					case CACHE:
					case UNCACHE:
					case LOAD:
					case CLEAR:
					case TRUNCATE:
					case RESET:
					case ID:
						{
						setState(39);
						jobCommond();
						setState(40);
						match(SEMI);
						}
						break;
					case SEMI:
						{
						setState(42);
						emptyCommond();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(47);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(53);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SET:
			case UNSET:
			case USE:
			case DIVIDE:
			case SELECT:
			case CREATE:
			case INSERT:
			case ALTER:
			case DROP:
			case SHOW:
			case ANALYZE:
			case EXPLAIN:
			case DESC:
			case REFRESH:
			case COMMENT:
			case CACHE:
			case UNCACHE:
			case LOAD:
			case CLEAR:
			case TRUNCATE:
			case RESET:
			case ID:
				{
				setState(48);
				jobCommond();
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(49);
					match(SEMI);
					}
				}

				}
				break;
			case SEMI:
				{
				setState(52);
				emptyCommond();
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

	public static class JobCommondContext extends ParserRuleContext {
		public SetCommondContext setCommond() {
			return getRuleContext(SetCommondContext.class,0);
		}
		public UnsetCommondContext unsetCommond() {
			return getRuleContext(UnsetCommondContext.class,0);
		}
		public UseCommondContext useCommond() {
			return getRuleContext(UseCommondContext.class,0);
		}
		public SqlCommondContext sqlCommond() {
			return getRuleContext(SqlCommondContext.class,0);
		}
		public ExecCommondContext execCommond() {
			return getRuleContext(ExecCommondContext.class,0);
		}
		public JobCommondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jobCommond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyxqlJobParserListener ) ((MyxqlJobParserListener)listener).enterJobCommond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyxqlJobParserListener ) ((MyxqlJobParserListener)listener).exitJobCommond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyxqlJobParserVisitor ) return ((MyxqlJobParserVisitor<? extends T>)visitor).visitJobCommond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JobCommondContext jobCommond() throws RecognitionException {
		JobCommondContext _localctx = new JobCommondContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_jobCommond);
		try {
			setState(60);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SET:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				setCommond();
				}
				break;
			case UNSET:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				unsetCommond();
				}
				break;
			case USE:
				enterOuterAlt(_localctx, 3);
				{
				setState(57);
				useCommond();
				}
				break;
			case SELECT:
			case CREATE:
			case INSERT:
			case ALTER:
			case DROP:
			case SHOW:
			case ANALYZE:
			case EXPLAIN:
			case DESC:
			case REFRESH:
			case COMMENT:
			case CACHE:
			case UNCACHE:
			case LOAD:
			case CLEAR:
			case TRUNCATE:
			case RESET:
				enterOuterAlt(_localctx, 4);
				{
				setState(58);
				sqlCommond();
				}
				break;
			case DIVIDE:
			case ID:
				enterOuterAlt(_localctx, 5);
				{
				setState(59);
				execCommond();
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

	public static class ExecCommondContext extends ParserRuleContext {
		public ResourceNameExprContext resourceNameExpr() {
			return getRuleContext(ResourceNameExprContext.class,0);
		}
		public ClassNameExprContext classNameExpr() {
			return getRuleContext(ClassNameExprContext.class,0);
		}
		public ParamsExprContext paramsExpr() {
			return getRuleContext(ParamsExprContext.class,0);
		}
		public ExecCommondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execCommond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyxqlJobParserListener ) ((MyxqlJobParserListener)listener).enterExecCommond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyxqlJobParserListener ) ((MyxqlJobParserListener)listener).exitExecCommond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyxqlJobParserVisitor ) return ((MyxqlJobParserVisitor<? extends T>)visitor).visitExecCommond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExecCommondContext execCommond() throws RecognitionException {
		ExecCommondContext _localctx = new ExecCommondContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_execCommond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			resourceNameExpr();
			setState(63);
			classNameExpr();
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIVIDE) | (1L << ID) | (1L << STRING_LITERAL))) != 0)) {
				{
				setState(64);
				paramsExpr();
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

	public static class ResourceNameExprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MyxqlJobParser.ID, 0); }
		public List<TerminalNode> DOT_ID() { return getTokens(MyxqlJobParser.DOT_ID); }
		public TerminalNode DOT_ID(int i) {
			return getToken(MyxqlJobParser.DOT_ID, i);
		}
		public FilePathContext filePath() {
			return getRuleContext(FilePathContext.class,0);
		}
		public ResourceNameExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceNameExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyxqlJobParserListener ) ((MyxqlJobParserListener)listener).enterResourceNameExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyxqlJobParserListener ) ((MyxqlJobParserListener)listener).exitResourceNameExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyxqlJobParserVisitor ) return ((MyxqlJobParserVisitor<? extends T>)visitor).visitResourceNameExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceNameExprContext resourceNameExpr() throws RecognitionException {
		ResourceNameExprContext _localctx = new ResourceNameExprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_resourceNameExpr);
		int _la;
		try {
			setState(75);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				match(ID);
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT_ID) {
					{
					{
					setState(68);
					match(DOT_ID);
					}
					}
					setState(73);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case DIVIDE:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				filePath();
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

	public static class ClassNameExprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MyxqlJobParser.ID, 0); }
		public List<TerminalNode> DOT_ID() { return getTokens(MyxqlJobParser.DOT_ID); }
		public TerminalNode DOT_ID(int i) {
			return getToken(MyxqlJobParser.DOT_ID, i);
		}
		public ClassNameExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classNameExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyxqlJobParserListener ) ((MyxqlJobParserListener)listener).enterClassNameExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyxqlJobParserListener ) ((MyxqlJobParserListener)listener).exitClassNameExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyxqlJobParserVisitor ) return ((MyxqlJobParserVisitor<? extends T>)visitor).visitClassNameExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassNameExprContext classNameExpr() throws RecognitionException {
		ClassNameExprContext _localctx = new ClassNameExprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_classNameExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(ID);
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT_ID) {
				{
				{
				setState(78);
				match(DOT_ID);
				}
				}
				setState(83);
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

	public static class ParamsExprContext extends ParserRuleContext {
		public List<ParamExprContext> paramExpr() {
			return getRuleContexts(ParamExprContext.class);
		}
		public ParamExprContext paramExpr(int i) {
			return getRuleContext(ParamExprContext.class,i);
		}
		public ParamsExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramsExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyxqlJobParserListener ) ((MyxqlJobParserListener)listener).enterParamsExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyxqlJobParserListener ) ((MyxqlJobParserListener)listener).exitParamsExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyxqlJobParserVisitor ) return ((MyxqlJobParserVisitor<? extends T>)visitor).visitParamsExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsExprContext paramsExpr() throws RecognitionException {
		ParamsExprContext _localctx = new ParamsExprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_paramsExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			paramExpr();
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIVIDE) | (1L << ID) | (1L << STRING_LITERAL))) != 0)) {
				{
				{
				setState(85);
				paramExpr();
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

	public static class ParamExprContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MyxqlJobParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MyxqlJobParser.ID, i);
		}
		public List<TerminalNode> DOT_ID() { return getTokens(MyxqlJobParser.DOT_ID); }
		public TerminalNode DOT_ID(int i) {
			return getToken(MyxqlJobParser.DOT_ID, i);
		}
		public FilePathContext filePath() {
			return getRuleContext(FilePathContext.class,0);
		}
		public List<TerminalNode> DIVIDE() { return getTokens(MyxqlJobParser.DIVIDE); }
		public TerminalNode DIVIDE(int i) {
			return getToken(MyxqlJobParser.DIVIDE, i);
		}
		public TerminalNode STRING_LITERAL() { return getToken(MyxqlJobParser.STRING_LITERAL, 0); }
		public ParamExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyxqlJobParserListener ) ((MyxqlJobParserListener)listener).enterParamExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyxqlJobParserListener ) ((MyxqlJobParserListener)listener).exitParamExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyxqlJobParserVisitor ) return ((MyxqlJobParserVisitor<? extends T>)visitor).visitParamExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamExprContext paramExpr() throws RecognitionException {
		ParamExprContext _localctx = new ParamExprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_paramExpr);
		int _la;
		try {
			int _alt;
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				match(ID);
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT_ID) {
					{
					{
					setState(92);
					match(DOT_ID);
					}
					}
					setState(97);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				filePath();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(99);
				match(ID);
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT_ID) {
					{
					{
					setState(100);
					match(DOT_ID);
					}
					}
					setState(105);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(119);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(106);
						match(DIVIDE);
						setState(108);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==DIVIDE) {
							{
							setState(107);
							match(DIVIDE);
							}
						}

						setState(110);
						match(ID);
						setState(114);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==DOT_ID) {
							{
							{
							setState(111);
							match(DOT_ID);
							}
							}
							setState(116);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						} 
					}
					setState(121);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(122);
				match(STRING_LITERAL);
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

	public static class FilePathContext extends ParserRuleContext {
		public List<TerminalNode> DIVIDE() { return getTokens(MyxqlJobParser.DIVIDE); }
		public TerminalNode DIVIDE(int i) {
			return getToken(MyxqlJobParser.DIVIDE, i);
		}
		public List<TerminalNode> ID() { return getTokens(MyxqlJobParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MyxqlJobParser.ID, i);
		}
		public List<TerminalNode> DOT_ID() { return getTokens(MyxqlJobParser.DOT_ID); }
		public TerminalNode DOT_ID(int i) {
			return getToken(MyxqlJobParser.DOT_ID, i);
		}
		public List<TerminalNode> STAR() { return getTokens(MyxqlJobParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(MyxqlJobParser.STAR, i);
		}
		public FilePathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filePath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyxqlJobParserListener ) ((MyxqlJobParserListener)listener).enterFilePath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyxqlJobParserListener ) ((MyxqlJobParserListener)listener).exitFilePath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyxqlJobParserVisitor ) return ((MyxqlJobParserVisitor<? extends T>)visitor).visitFilePath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilePathContext filePath() throws RecognitionException {
		FilePathContext _localctx = new FilePathContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_filePath);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(DIVIDE);
			setState(126);
			match(ID);
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT_ID) {
				{
				{
				setState(127);
				match(DOT_ID);
				}
				}
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(146);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(133);
					match(DIVIDE);
					setState(142);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ID:
						{
						setState(134);
						match(ID);
						setState(138);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==DOT_ID) {
							{
							{
							setState(135);
							match(DOT_ID);
							}
							}
							setState(140);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					case STAR:
						{
						setState(141);
						match(STAR);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(148);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(149);
				match(DIVIDE);
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

	public static class SetCommondContext extends ParserRuleContext {
		public ValueExprContext value;
		public TerminalNode SET() { return getToken(MyxqlJobParser.SET, 0); }
		public KeyExprContext keyExpr() {
			return getRuleContext(KeyExprContext.class,0);
		}
		public TerminalNode EQUAL_SYMBOL() { return getToken(MyxqlJobParser.EQUAL_SYMBOL, 0); }
		public ValueExprContext valueExpr() {
			return getRuleContext(ValueExprContext.class,0);
		}
		public SetCommondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setCommond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyxqlJobParserListener ) ((MyxqlJobParserListener)listener).enterSetCommond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyxqlJobParserListener ) ((MyxqlJobParserListener)listener).exitSetCommond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyxqlJobParserVisitor ) return ((MyxqlJobParserVisitor<? extends T>)visitor).visitSetCommond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetCommondContext setCommond() throws RecognitionException {
		SetCommondContext _localctx = new SetCommondContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_setCommond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(SET);
			setState(153);
			keyExpr();
			setState(154);
			match(EQUAL_SYMBOL);
			setState(155);
			((SetCommondContext)_localctx).value = valueExpr();
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

	public static class UnsetCommondContext extends ParserRuleContext {
		public TerminalNode UNSET() { return getToken(MyxqlJobParser.UNSET, 0); }
		public KeyExprContext keyExpr() {
			return getRuleContext(KeyExprContext.class,0);
		}
		public UnsetCommondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsetCommond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyxqlJobParserListener ) ((MyxqlJobParserListener)listener).enterUnsetCommond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyxqlJobParserListener ) ((MyxqlJobParserListener)listener).exitUnsetCommond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyxqlJobParserVisitor ) return ((MyxqlJobParserVisitor<? extends T>)visitor).visitUnsetCommond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnsetCommondContext unsetCommond() throws RecognitionException {
		UnsetCommondContext _localctx = new UnsetCommondContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_unsetCommond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(UNSET);
			setState(158);
			keyExpr();
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

	public static class UseCommondContext extends ParserRuleContext {
		public TerminalNode USE() { return getToken(MyxqlJobParser.USE, 0); }
		public TerminalNode ID() { return getToken(MyxqlJobParser.ID, 0); }
		public UseCommondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useCommond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyxqlJobParserListener ) ((MyxqlJobParserListener)listener).enterUseCommond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyxqlJobParserListener ) ((MyxqlJobParserListener)listener).exitUseCommond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyxqlJobParserVisitor ) return ((MyxqlJobParserVisitor<? extends T>)visitor).visitUseCommond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseCommondContext useCommond() throws RecognitionException {
		UseCommondContext _localctx = new UseCommondContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_useCommond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(USE);
			setState(161);
			match(ID);
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

	public static class SqlCommondContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(MyxqlJobParser.CREATE, 0); }
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public TerminalNode INSERT() { return getToken(MyxqlJobParser.INSERT, 0); }
		public TerminalNode SELECT() { return getToken(MyxqlJobParser.SELECT, 0); }
		public TerminalNode ALTER() { return getToken(MyxqlJobParser.ALTER, 0); }
		public TerminalNode DROP() { return getToken(MyxqlJobParser.DROP, 0); }
		public TerminalNode SHOW() { return getToken(MyxqlJobParser.SHOW, 0); }
		public TerminalNode ANALYZE() { return getToken(MyxqlJobParser.ANALYZE, 0); }
		public TerminalNode EXPLAIN() { return getToken(MyxqlJobParser.EXPLAIN, 0); }
		public TerminalNode DESC() { return getToken(MyxqlJobParser.DESC, 0); }
		public TerminalNode REFRESH() { return getToken(MyxqlJobParser.REFRESH, 0); }
		public TerminalNode COMMENT() { return getToken(MyxqlJobParser.COMMENT, 0); }
		public TerminalNode CACHE() { return getToken(MyxqlJobParser.CACHE, 0); }
		public TerminalNode UNCACHE() { return getToken(MyxqlJobParser.UNCACHE, 0); }
		public TerminalNode LOAD() { return getToken(MyxqlJobParser.LOAD, 0); }
		public TerminalNode CLEAR() { return getToken(MyxqlJobParser.CLEAR, 0); }
		public TerminalNode TRUNCATE() { return getToken(MyxqlJobParser.TRUNCATE, 0); }
		public TerminalNode RESET() { return getToken(MyxqlJobParser.RESET, 0); }
		public SqlCommondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlCommond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyxqlJobParserListener ) ((MyxqlJobParserListener)listener).enterSqlCommond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyxqlJobParserListener ) ((MyxqlJobParserListener)listener).exitSqlCommond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyxqlJobParserVisitor ) return ((MyxqlJobParserVisitor<? extends T>)visitor).visitSqlCommond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlCommondContext sqlCommond() throws RecognitionException {
		SqlCommondContext _localctx = new SqlCommondContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_sqlCommond);
		int _la;
		try {
			setState(265);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CREATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				match(CREATE);
				setState(165); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(164);
					word();
					}
					}
					setState(167); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SET) | (1L << UNSET) | (1L << STAR) | (1L << DIVIDE) | (1L << MODULE) | (1L << PLUS) | (1L << MINUS) | (1L << EQUAL_SYMBOL) | (1L << GREATER_SYMBOL) | (1L << LESS_SYMBOL) | (1L << EXCLAMATION_SYMBOL) | (1L << BIT_NOT_OP) | (1L << BIT_OR_OP) | (1L << BIT_AND_OP) | (1L << BIT_XOR_OP) | (1L << LR_BRACKET) | (1L << RR_BRACKET) | (1L << COMMA) | (1L << DOT_ID) | (1L << ID) | (1L << STRING_LITERAL))) != 0) );
				}
				break;
			case INSERT:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				match(INSERT);
				setState(171); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(170);
					word();
					}
					}
					setState(173); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SET) | (1L << UNSET) | (1L << STAR) | (1L << DIVIDE) | (1L << MODULE) | (1L << PLUS) | (1L << MINUS) | (1L << EQUAL_SYMBOL) | (1L << GREATER_SYMBOL) | (1L << LESS_SYMBOL) | (1L << EXCLAMATION_SYMBOL) | (1L << BIT_NOT_OP) | (1L << BIT_OR_OP) | (1L << BIT_AND_OP) | (1L << BIT_XOR_OP) | (1L << LR_BRACKET) | (1L << RR_BRACKET) | (1L << COMMA) | (1L << DOT_ID) | (1L << ID) | (1L << STRING_LITERAL))) != 0) );
				}
				break;
			case SELECT:
				enterOuterAlt(_localctx, 3);
				{
				setState(175);
				match(SELECT);
				setState(177); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(176);
					word();
					}
					}
					setState(179); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SET) | (1L << UNSET) | (1L << STAR) | (1L << DIVIDE) | (1L << MODULE) | (1L << PLUS) | (1L << MINUS) | (1L << EQUAL_SYMBOL) | (1L << GREATER_SYMBOL) | (1L << LESS_SYMBOL) | (1L << EXCLAMATION_SYMBOL) | (1L << BIT_NOT_OP) | (1L << BIT_OR_OP) | (1L << BIT_AND_OP) | (1L << BIT_XOR_OP) | (1L << LR_BRACKET) | (1L << RR_BRACKET) | (1L << COMMA) | (1L << DOT_ID) | (1L << ID) | (1L << STRING_LITERAL))) != 0) );
				}
				break;
			case ALTER:
				enterOuterAlt(_localctx, 4);
				{
				setState(181);
				match(ALTER);
				setState(183); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(182);
					word();
					}
					}
					setState(185); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SET) | (1L << UNSET) | (1L << STAR) | (1L << DIVIDE) | (1L << MODULE) | (1L << PLUS) | (1L << MINUS) | (1L << EQUAL_SYMBOL) | (1L << GREATER_SYMBOL) | (1L << LESS_SYMBOL) | (1L << EXCLAMATION_SYMBOL) | (1L << BIT_NOT_OP) | (1L << BIT_OR_OP) | (1L << BIT_AND_OP) | (1L << BIT_XOR_OP) | (1L << LR_BRACKET) | (1L << RR_BRACKET) | (1L << COMMA) | (1L << DOT_ID) | (1L << ID) | (1L << STRING_LITERAL))) != 0) );
				}
				break;
			case DROP:
				enterOuterAlt(_localctx, 5);
				{
				setState(187);
				match(DROP);
				setState(189); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(188);
					word();
					}
					}
					setState(191); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SET) | (1L << UNSET) | (1L << STAR) | (1L << DIVIDE) | (1L << MODULE) | (1L << PLUS) | (1L << MINUS) | (1L << EQUAL_SYMBOL) | (1L << GREATER_SYMBOL) | (1L << LESS_SYMBOL) | (1L << EXCLAMATION_SYMBOL) | (1L << BIT_NOT_OP) | (1L << BIT_OR_OP) | (1L << BIT_AND_OP) | (1L << BIT_XOR_OP) | (1L << LR_BRACKET) | (1L << RR_BRACKET) | (1L << COMMA) | (1L << DOT_ID) | (1L << ID) | (1L << STRING_LITERAL))) != 0) );
				}
				break;
			case SHOW:
				enterOuterAlt(_localctx, 6);
				{
				setState(193);
				match(SHOW);
				setState(195); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(194);
					word();
					}
					}
					setState(197); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SET) | (1L << UNSET) | (1L << STAR) | (1L << DIVIDE) | (1L << MODULE) | (1L << PLUS) | (1L << MINUS) | (1L << EQUAL_SYMBOL) | (1L << GREATER_SYMBOL) | (1L << LESS_SYMBOL) | (1L << EXCLAMATION_SYMBOL) | (1L << BIT_NOT_OP) | (1L << BIT_OR_OP) | (1L << BIT_AND_OP) | (1L << BIT_XOR_OP) | (1L << LR_BRACKET) | (1L << RR_BRACKET) | (1L << COMMA) | (1L << DOT_ID) | (1L << ID) | (1L << STRING_LITERAL))) != 0) );
				}
				break;
			case ANALYZE:
				enterOuterAlt(_localctx, 7);
				{
				setState(199);
				match(ANALYZE);
				setState(201); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(200);
					word();
					}
					}
					setState(203); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SET) | (1L << UNSET) | (1L << STAR) | (1L << DIVIDE) | (1L << MODULE) | (1L << PLUS) | (1L << MINUS) | (1L << EQUAL_SYMBOL) | (1L << GREATER_SYMBOL) | (1L << LESS_SYMBOL) | (1L << EXCLAMATION_SYMBOL) | (1L << BIT_NOT_OP) | (1L << BIT_OR_OP) | (1L << BIT_AND_OP) | (1L << BIT_XOR_OP) | (1L << LR_BRACKET) | (1L << RR_BRACKET) | (1L << COMMA) | (1L << DOT_ID) | (1L << ID) | (1L << STRING_LITERAL))) != 0) );
				}
				break;
			case EXPLAIN:
				enterOuterAlt(_localctx, 8);
				{
				setState(205);
				match(EXPLAIN);
				setState(207); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(206);
					word();
					}
					}
					setState(209); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SET) | (1L << UNSET) | (1L << STAR) | (1L << DIVIDE) | (1L << MODULE) | (1L << PLUS) | (1L << MINUS) | (1L << EQUAL_SYMBOL) | (1L << GREATER_SYMBOL) | (1L << LESS_SYMBOL) | (1L << EXCLAMATION_SYMBOL) | (1L << BIT_NOT_OP) | (1L << BIT_OR_OP) | (1L << BIT_AND_OP) | (1L << BIT_XOR_OP) | (1L << LR_BRACKET) | (1L << RR_BRACKET) | (1L << COMMA) | (1L << DOT_ID) | (1L << ID) | (1L << STRING_LITERAL))) != 0) );
				}
				break;
			case DESC:
				enterOuterAlt(_localctx, 9);
				{
				setState(211);
				match(DESC);
				setState(213); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(212);
					word();
					}
					}
					setState(215); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SET) | (1L << UNSET) | (1L << STAR) | (1L << DIVIDE) | (1L << MODULE) | (1L << PLUS) | (1L << MINUS) | (1L << EQUAL_SYMBOL) | (1L << GREATER_SYMBOL) | (1L << LESS_SYMBOL) | (1L << EXCLAMATION_SYMBOL) | (1L << BIT_NOT_OP) | (1L << BIT_OR_OP) | (1L << BIT_AND_OP) | (1L << BIT_XOR_OP) | (1L << LR_BRACKET) | (1L << RR_BRACKET) | (1L << COMMA) | (1L << DOT_ID) | (1L << ID) | (1L << STRING_LITERAL))) != 0) );
				}
				break;
			case REFRESH:
				enterOuterAlt(_localctx, 10);
				{
				setState(217);
				match(REFRESH);
				setState(219); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(218);
					word();
					}
					}
					setState(221); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SET) | (1L << UNSET) | (1L << STAR) | (1L << DIVIDE) | (1L << MODULE) | (1L << PLUS) | (1L << MINUS) | (1L << EQUAL_SYMBOL) | (1L << GREATER_SYMBOL) | (1L << LESS_SYMBOL) | (1L << EXCLAMATION_SYMBOL) | (1L << BIT_NOT_OP) | (1L << BIT_OR_OP) | (1L << BIT_AND_OP) | (1L << BIT_XOR_OP) | (1L << LR_BRACKET) | (1L << RR_BRACKET) | (1L << COMMA) | (1L << DOT_ID) | (1L << ID) | (1L << STRING_LITERAL))) != 0) );
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 11);
				{
				setState(223);
				match(COMMENT);
				setState(225); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(224);
					word();
					}
					}
					setState(227); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SET) | (1L << UNSET) | (1L << STAR) | (1L << DIVIDE) | (1L << MODULE) | (1L << PLUS) | (1L << MINUS) | (1L << EQUAL_SYMBOL) | (1L << GREATER_SYMBOL) | (1L << LESS_SYMBOL) | (1L << EXCLAMATION_SYMBOL) | (1L << BIT_NOT_OP) | (1L << BIT_OR_OP) | (1L << BIT_AND_OP) | (1L << BIT_XOR_OP) | (1L << LR_BRACKET) | (1L << RR_BRACKET) | (1L << COMMA) | (1L << DOT_ID) | (1L << ID) | (1L << STRING_LITERAL))) != 0) );
				}
				break;
			case CACHE:
				enterOuterAlt(_localctx, 12);
				{
				setState(229);
				match(CACHE);
				setState(231); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(230);
					word();
					}
					}
					setState(233); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SET) | (1L << UNSET) | (1L << STAR) | (1L << DIVIDE) | (1L << MODULE) | (1L << PLUS) | (1L << MINUS) | (1L << EQUAL_SYMBOL) | (1L << GREATER_SYMBOL) | (1L << LESS_SYMBOL) | (1L << EXCLAMATION_SYMBOL) | (1L << BIT_NOT_OP) | (1L << BIT_OR_OP) | (1L << BIT_AND_OP) | (1L << BIT_XOR_OP) | (1L << LR_BRACKET) | (1L << RR_BRACKET) | (1L << COMMA) | (1L << DOT_ID) | (1L << ID) | (1L << STRING_LITERAL))) != 0) );
				}
				break;
			case UNCACHE:
				enterOuterAlt(_localctx, 13);
				{
				setState(235);
				match(UNCACHE);
				setState(237); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(236);
					word();
					}
					}
					setState(239); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SET) | (1L << UNSET) | (1L << STAR) | (1L << DIVIDE) | (1L << MODULE) | (1L << PLUS) | (1L << MINUS) | (1L << EQUAL_SYMBOL) | (1L << GREATER_SYMBOL) | (1L << LESS_SYMBOL) | (1L << EXCLAMATION_SYMBOL) | (1L << BIT_NOT_OP) | (1L << BIT_OR_OP) | (1L << BIT_AND_OP) | (1L << BIT_XOR_OP) | (1L << LR_BRACKET) | (1L << RR_BRACKET) | (1L << COMMA) | (1L << DOT_ID) | (1L << ID) | (1L << STRING_LITERAL))) != 0) );
				}
				break;
			case LOAD:
				enterOuterAlt(_localctx, 14);
				{
				setState(241);
				match(LOAD);
				setState(243); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(242);
					word();
					}
					}
					setState(245); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SET) | (1L << UNSET) | (1L << STAR) | (1L << DIVIDE) | (1L << MODULE) | (1L << PLUS) | (1L << MINUS) | (1L << EQUAL_SYMBOL) | (1L << GREATER_SYMBOL) | (1L << LESS_SYMBOL) | (1L << EXCLAMATION_SYMBOL) | (1L << BIT_NOT_OP) | (1L << BIT_OR_OP) | (1L << BIT_AND_OP) | (1L << BIT_XOR_OP) | (1L << LR_BRACKET) | (1L << RR_BRACKET) | (1L << COMMA) | (1L << DOT_ID) | (1L << ID) | (1L << STRING_LITERAL))) != 0) );
				}
				break;
			case CLEAR:
				enterOuterAlt(_localctx, 15);
				{
				setState(247);
				match(CLEAR);
				setState(249); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(248);
					word();
					}
					}
					setState(251); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SET) | (1L << UNSET) | (1L << STAR) | (1L << DIVIDE) | (1L << MODULE) | (1L << PLUS) | (1L << MINUS) | (1L << EQUAL_SYMBOL) | (1L << GREATER_SYMBOL) | (1L << LESS_SYMBOL) | (1L << EXCLAMATION_SYMBOL) | (1L << BIT_NOT_OP) | (1L << BIT_OR_OP) | (1L << BIT_AND_OP) | (1L << BIT_XOR_OP) | (1L << LR_BRACKET) | (1L << RR_BRACKET) | (1L << COMMA) | (1L << DOT_ID) | (1L << ID) | (1L << STRING_LITERAL))) != 0) );
				}
				break;
			case TRUNCATE:
				enterOuterAlt(_localctx, 16);
				{
				setState(253);
				match(TRUNCATE);
				setState(255); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(254);
					word();
					}
					}
					setState(257); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SET) | (1L << UNSET) | (1L << STAR) | (1L << DIVIDE) | (1L << MODULE) | (1L << PLUS) | (1L << MINUS) | (1L << EQUAL_SYMBOL) | (1L << GREATER_SYMBOL) | (1L << LESS_SYMBOL) | (1L << EXCLAMATION_SYMBOL) | (1L << BIT_NOT_OP) | (1L << BIT_OR_OP) | (1L << BIT_AND_OP) | (1L << BIT_XOR_OP) | (1L << LR_BRACKET) | (1L << RR_BRACKET) | (1L << COMMA) | (1L << DOT_ID) | (1L << ID) | (1L << STRING_LITERAL))) != 0) );
				}
				break;
			case RESET:
				enterOuterAlt(_localctx, 17);
				{
				setState(259);
				match(RESET);
				setState(261); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(260);
					word();
					}
					}
					setState(263); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SET) | (1L << UNSET) | (1L << STAR) | (1L << DIVIDE) | (1L << MODULE) | (1L << PLUS) | (1L << MINUS) | (1L << EQUAL_SYMBOL) | (1L << GREATER_SYMBOL) | (1L << LESS_SYMBOL) | (1L << EXCLAMATION_SYMBOL) | (1L << BIT_NOT_OP) | (1L << BIT_OR_OP) | (1L << BIT_AND_OP) | (1L << BIT_XOR_OP) | (1L << LR_BRACKET) | (1L << RR_BRACKET) | (1L << COMMA) | (1L << DOT_ID) | (1L << ID) | (1L << STRING_LITERAL))) != 0) );
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

	public static class KeyExprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MyxqlJobParser.ID, 0); }
		public List<TerminalNode> DOT_ID() { return getTokens(MyxqlJobParser.DOT_ID); }
		public TerminalNode DOT_ID(int i) {
			return getToken(MyxqlJobParser.DOT_ID, i);
		}
		public KeyExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyxqlJobParserListener ) ((MyxqlJobParserListener)listener).enterKeyExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyxqlJobParserListener ) ((MyxqlJobParserListener)listener).exitKeyExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyxqlJobParserVisitor ) return ((MyxqlJobParserVisitor<? extends T>)visitor).visitKeyExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyExprContext keyExpr() throws RecognitionException {
		KeyExprContext _localctx = new KeyExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_keyExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(ID);
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT_ID) {
				{
				{
				setState(268);
				match(DOT_ID);
				}
				}
				setState(273);
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

	public static class ValueExprContext extends ParserRuleContext {
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public ValueExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyxqlJobParserListener ) ((MyxqlJobParserListener)listener).enterValueExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyxqlJobParserListener ) ((MyxqlJobParserListener)listener).exitValueExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyxqlJobParserVisitor ) return ((MyxqlJobParserVisitor<? extends T>)visitor).visitValueExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueExprContext valueExpr() throws RecognitionException {
		ValueExprContext _localctx = new ValueExprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_valueExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			word();
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SET) | (1L << UNSET) | (1L << STAR) | (1L << DIVIDE) | (1L << MODULE) | (1L << PLUS) | (1L << MINUS) | (1L << EQUAL_SYMBOL) | (1L << GREATER_SYMBOL) | (1L << LESS_SYMBOL) | (1L << EXCLAMATION_SYMBOL) | (1L << BIT_NOT_OP) | (1L << BIT_OR_OP) | (1L << BIT_AND_OP) | (1L << BIT_XOR_OP) | (1L << LR_BRACKET) | (1L << RR_BRACKET) | (1L << COMMA) | (1L << DOT_ID) | (1L << ID) | (1L << STRING_LITERAL))) != 0)) {
				{
				{
				setState(275);
				word();
				}
				}
				setState(280);
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

	public static class WordContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MyxqlJobParser.ID, 0); }
		public TerminalNode DOT_ID() { return getToken(MyxqlJobParser.DOT_ID, 0); }
		public TerminalNode SET() { return getToken(MyxqlJobParser.SET, 0); }
		public TerminalNode UNSET() { return getToken(MyxqlJobParser.UNSET, 0); }
		public TerminalNode STAR() { return getToken(MyxqlJobParser.STAR, 0); }
		public TerminalNode DIVIDE() { return getToken(MyxqlJobParser.DIVIDE, 0); }
		public TerminalNode MODULE() { return getToken(MyxqlJobParser.MODULE, 0); }
		public TerminalNode PLUS() { return getToken(MyxqlJobParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(MyxqlJobParser.MINUS, 0); }
		public TerminalNode EQUAL_SYMBOL() { return getToken(MyxqlJobParser.EQUAL_SYMBOL, 0); }
		public TerminalNode GREATER_SYMBOL() { return getToken(MyxqlJobParser.GREATER_SYMBOL, 0); }
		public TerminalNode LESS_SYMBOL() { return getToken(MyxqlJobParser.LESS_SYMBOL, 0); }
		public TerminalNode EXCLAMATION_SYMBOL() { return getToken(MyxqlJobParser.EXCLAMATION_SYMBOL, 0); }
		public TerminalNode BIT_NOT_OP() { return getToken(MyxqlJobParser.BIT_NOT_OP, 0); }
		public TerminalNode BIT_OR_OP() { return getToken(MyxqlJobParser.BIT_OR_OP, 0); }
		public TerminalNode BIT_AND_OP() { return getToken(MyxqlJobParser.BIT_AND_OP, 0); }
		public TerminalNode BIT_XOR_OP() { return getToken(MyxqlJobParser.BIT_XOR_OP, 0); }
		public TerminalNode LR_BRACKET() { return getToken(MyxqlJobParser.LR_BRACKET, 0); }
		public TerminalNode RR_BRACKET() { return getToken(MyxqlJobParser.RR_BRACKET, 0); }
		public TerminalNode COMMA() { return getToken(MyxqlJobParser.COMMA, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(MyxqlJobParser.STRING_LITERAL, 0); }
		public WordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_word; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyxqlJobParserListener ) ((MyxqlJobParserListener)listener).enterWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyxqlJobParserListener ) ((MyxqlJobParserListener)listener).exitWord(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyxqlJobParserVisitor ) return ((MyxqlJobParserVisitor<? extends T>)visitor).visitWord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WordContext word() throws RecognitionException {
		WordContext _localctx = new WordContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_word);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SET) | (1L << UNSET) | (1L << STAR) | (1L << DIVIDE) | (1L << MODULE) | (1L << PLUS) | (1L << MINUS) | (1L << EQUAL_SYMBOL) | (1L << GREATER_SYMBOL) | (1L << LESS_SYMBOL) | (1L << EXCLAMATION_SYMBOL) | (1L << BIT_NOT_OP) | (1L << BIT_OR_OP) | (1L << BIT_AND_OP) | (1L << BIT_XOR_OP) | (1L << LR_BRACKET) | (1L << RR_BRACKET) | (1L << COMMA) | (1L << DOT_ID) | (1L << ID) | (1L << STRING_LITERAL))) != 0)) ) {
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

	public static class EmptyCommondContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(MyxqlJobParser.SEMI, 0); }
		public EmptyCommondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyCommond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyxqlJobParserListener ) ((MyxqlJobParserListener)listener).enterEmptyCommond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyxqlJobParserListener ) ((MyxqlJobParserListener)listener).exitEmptyCommond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyxqlJobParserVisitor ) return ((MyxqlJobParserVisitor<? extends T>)visitor).visitEmptyCommond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptyCommondContext emptyCommond() throws RecognitionException {
		EmptyCommondContext _localctx = new EmptyCommondContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_emptyCommond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
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

	public static final String _serializedATN =
		"\u0004\u00013\u011e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0001\u0000\u0003\u0000$\b\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001"+
		",\b\u0001\n\u0001\f\u0001/\t\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"3\b\u0001\u0001\u0001\u0003\u00016\b\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002=\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003B\b\u0003\u0001\u0004\u0001\u0004\u0005"+
		"\u0004F\b\u0004\n\u0004\f\u0004I\t\u0004\u0001\u0004\u0003\u0004L\b\u0004"+
		"\u0001\u0005\u0001\u0005\u0005\u0005P\b\u0005\n\u0005\f\u0005S\t\u0005"+
		"\u0001\u0006\u0001\u0006\u0005\u0006W\b\u0006\n\u0006\f\u0006Z\t\u0006"+
		"\u0001\u0007\u0001\u0007\u0005\u0007^\b\u0007\n\u0007\f\u0007a\t\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007f\b\u0007\n\u0007\f\u0007"+
		"i\t\u0007\u0001\u0007\u0001\u0007\u0003\u0007m\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0005\u0007q\b\u0007\n\u0007\f\u0007t\t\u0007\u0005\u0007v\b\u0007"+
		"\n\u0007\f\u0007y\t\u0007\u0001\u0007\u0003\u0007|\b\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0005\b\u0081\b\b\n\b\f\b\u0084\t\b\u0001\b\u0001\b\u0001\b"+
		"\u0005\b\u0089\b\b\n\b\f\b\u008c\t\b\u0001\b\u0003\b\u008f\b\b\u0005\b"+
		"\u0091\b\b\n\b\f\b\u0094\t\b\u0001\b\u0003\b\u0097\b\b\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0004\f\u00a6\b\f\u000b\f\f\f\u00a7\u0001"+
		"\f\u0001\f\u0004\f\u00ac\b\f\u000b\f\f\f\u00ad\u0001\f\u0001\f\u0004\f"+
		"\u00b2\b\f\u000b\f\f\f\u00b3\u0001\f\u0001\f\u0004\f\u00b8\b\f\u000b\f"+
		"\f\f\u00b9\u0001\f\u0001\f\u0004\f\u00be\b\f\u000b\f\f\f\u00bf\u0001\f"+
		"\u0001\f\u0004\f\u00c4\b\f\u000b\f\f\f\u00c5\u0001\f\u0001\f\u0004\f\u00ca"+
		"\b\f\u000b\f\f\f\u00cb\u0001\f\u0001\f\u0004\f\u00d0\b\f\u000b\f\f\f\u00d1"+
		"\u0001\f\u0001\f\u0004\f\u00d6\b\f\u000b\f\f\f\u00d7\u0001\f\u0001\f\u0004"+
		"\f\u00dc\b\f\u000b\f\f\f\u00dd\u0001\f\u0001\f\u0004\f\u00e2\b\f\u000b"+
		"\f\f\f\u00e3\u0001\f\u0001\f\u0004\f\u00e8\b\f\u000b\f\f\f\u00e9\u0001"+
		"\f\u0001\f\u0004\f\u00ee\b\f\u000b\f\f\f\u00ef\u0001\f\u0001\f\u0004\f"+
		"\u00f4\b\f\u000b\f\f\f\u00f5\u0001\f\u0001\f\u0004\f\u00fa\b\f\u000b\f"+
		"\f\f\u00fb\u0001\f\u0001\f\u0004\f\u0100\b\f\u000b\f\f\f\u0101\u0001\f"+
		"\u0001\f\u0004\f\u0106\b\f\u000b\f\f\f\u0107\u0003\f\u010a\b\f\u0001\r"+
		"\u0001\r\u0005\r\u010e\b\r\n\r\f\r\u0111\t\r\u0001\u000e\u0001\u000e\u0005"+
		"\u000e\u0115\b\u000e\n\u000e\f\u000e\u0118\t\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0000\u0000\u0011\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \u0000"+
		"\u0001\u0005\u0000\u0005\u0006\b\u0014\u0016\u0018/022\u014a\u0000#\u0001"+
		"\u0000\u0000\u0000\u0002-\u0001\u0000\u0000\u0000\u0004<\u0001\u0000\u0000"+
		"\u0000\u0006>\u0001\u0000\u0000\u0000\bK\u0001\u0000\u0000\u0000\nM\u0001"+
		"\u0000\u0000\u0000\fT\u0001\u0000\u0000\u0000\u000e{\u0001\u0000\u0000"+
		"\u0000\u0010}\u0001\u0000\u0000\u0000\u0012\u0098\u0001\u0000\u0000\u0000"+
		"\u0014\u009d\u0001\u0000\u0000\u0000\u0016\u00a0\u0001\u0000\u0000\u0000"+
		"\u0018\u0109\u0001\u0000\u0000\u0000\u001a\u010b\u0001\u0000\u0000\u0000"+
		"\u001c\u0112\u0001\u0000\u0000\u0000\u001e\u0119\u0001\u0000\u0000\u0000"+
		" \u011b\u0001\u0000\u0000\u0000\"$\u0003\u0002\u0001\u0000#\"\u0001\u0000"+
		"\u0000\u0000#$\u0001\u0000\u0000\u0000$%\u0001\u0000\u0000\u0000%&\u0005"+
		"\u0000\u0000\u0001&\u0001\u0001\u0000\u0000\u0000\'(\u0003\u0004\u0002"+
		"\u0000()\u0005\u0019\u0000\u0000),\u0001\u0000\u0000\u0000*,\u0003 \u0010"+
		"\u0000+\'\u0001\u0000\u0000\u0000+*\u0001\u0000\u0000\u0000,/\u0001\u0000"+
		"\u0000\u0000-+\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000.5\u0001"+
		"\u0000\u0000\u0000/-\u0001\u0000\u0000\u000002\u0003\u0004\u0002\u0000"+
		"13\u0005\u0019\u0000\u000021\u0001\u0000\u0000\u000023\u0001\u0000\u0000"+
		"\u000036\u0001\u0000\u0000\u000046\u0003 \u0010\u000050\u0001\u0000\u0000"+
		"\u000054\u0001\u0000\u0000\u00006\u0003\u0001\u0000\u0000\u00007=\u0003"+
		"\u0012\t\u00008=\u0003\u0014\n\u00009=\u0003\u0016\u000b\u0000:=\u0003"+
		"\u0018\f\u0000;=\u0003\u0006\u0003\u0000<7\u0001\u0000\u0000\u0000<8\u0001"+
		"\u0000\u0000\u0000<9\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000"+
		"<;\u0001\u0000\u0000\u0000=\u0005\u0001\u0000\u0000\u0000>?\u0003\b\u0004"+
		"\u0000?A\u0003\n\u0005\u0000@B\u0003\f\u0006\u0000A@\u0001\u0000\u0000"+
		"\u0000AB\u0001\u0000\u0000\u0000B\u0007\u0001\u0000\u0000\u0000CG\u0005"+
		"0\u0000\u0000DF\u0005/\u0000\u0000ED\u0001\u0000\u0000\u0000FI\u0001\u0000"+
		"\u0000\u0000GE\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000HL\u0001"+
		"\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000JL\u0003\u0010\b\u0000KC\u0001"+
		"\u0000\u0000\u0000KJ\u0001\u0000\u0000\u0000L\t\u0001\u0000\u0000\u0000"+
		"MQ\u00050\u0000\u0000NP\u0005/\u0000\u0000ON\u0001\u0000\u0000\u0000P"+
		"S\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000"+
		"\u0000R\u000b\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000TX\u0003"+
		"\u000e\u0007\u0000UW\u0003\u000e\u0007\u0000VU\u0001\u0000\u0000\u0000"+
		"WZ\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000"+
		"\u0000Y\r\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000[_\u00050\u0000"+
		"\u0000\\^\u0005/\u0000\u0000]\\\u0001\u0000\u0000\u0000^a\u0001\u0000"+
		"\u0000\u0000_]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`|\u0001"+
		"\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000b|\u0003\u0010\b\u0000cg\u0005"+
		"0\u0000\u0000df\u0005/\u0000\u0000ed\u0001\u0000\u0000\u0000fi\u0001\u0000"+
		"\u0000\u0000ge\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hw\u0001"+
		"\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000jl\u0005\t\u0000\u0000km\u0005"+
		"\t\u0000\u0000lk\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000mn\u0001"+
		"\u0000\u0000\u0000nr\u00050\u0000\u0000oq\u0005/\u0000\u0000po\u0001\u0000"+
		"\u0000\u0000qt\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000rs\u0001"+
		"\u0000\u0000\u0000sv\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000"+
		"uj\u0001\u0000\u0000\u0000vy\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000"+
		"\u0000wx\u0001\u0000\u0000\u0000x|\u0001\u0000\u0000\u0000yw\u0001\u0000"+
		"\u0000\u0000z|\u00052\u0000\u0000{[\u0001\u0000\u0000\u0000{b\u0001\u0000"+
		"\u0000\u0000{c\u0001\u0000\u0000\u0000{z\u0001\u0000\u0000\u0000|\u000f"+
		"\u0001\u0000\u0000\u0000}~\u0005\t\u0000\u0000~\u0082\u00050\u0000\u0000"+
		"\u007f\u0081\u0005/\u0000\u0000\u0080\u007f\u0001\u0000\u0000\u0000\u0081"+
		"\u0084\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0082"+
		"\u0083\u0001\u0000\u0000\u0000\u0083\u0092\u0001\u0000\u0000\u0000\u0084"+
		"\u0082\u0001\u0000\u0000\u0000\u0085\u008e\u0005\t\u0000\u0000\u0086\u008a"+
		"\u00050\u0000\u0000\u0087\u0089\u0005/\u0000\u0000\u0088\u0087\u0001\u0000"+
		"\u0000\u0000\u0089\u008c\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000"+
		"\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u008f\u0001\u0000"+
		"\u0000\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008d\u008f\u0005\b\u0000"+
		"\u0000\u008e\u0086\u0001\u0000\u0000\u0000\u008e\u008d\u0001\u0000\u0000"+
		"\u0000\u008f\u0091\u0001\u0000\u0000\u0000\u0090\u0085\u0001\u0000\u0000"+
		"\u0000\u0091\u0094\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000"+
		"\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0096\u0001\u0000\u0000"+
		"\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0095\u0097\u0005\t\u0000\u0000"+
		"\u0096\u0095\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000"+
		"\u0097\u0011\u0001\u0000\u0000\u0000\u0098\u0099\u0005\u0005\u0000\u0000"+
		"\u0099\u009a\u0003\u001a\r\u0000\u009a\u009b\u0005\r\u0000\u0000\u009b"+
		"\u009c\u0003\u001c\u000e\u0000\u009c\u0013\u0001\u0000\u0000\u0000\u009d"+
		"\u009e\u0005\u0006\u0000\u0000\u009e\u009f\u0003\u001a\r\u0000\u009f\u0015"+
		"\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005\u0007\u0000\u0000\u00a1\u00a2"+
		"\u00050\u0000\u0000\u00a2\u0017\u0001\u0000\u0000\u0000\u00a3\u00a5\u0005"+
		"\u001f\u0000\u0000\u00a4\u00a6\u0003\u001e\u000f\u0000\u00a5\u00a4\u0001"+
		"\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001"+
		"\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8\u010a\u0001"+
		"\u0000\u0000\u0000\u00a9\u00ab\u0005 \u0000\u0000\u00aa\u00ac\u0003\u001e"+
		"\u000f\u0000\u00ab\u00aa\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000"+
		"\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000"+
		"\u0000\u0000\u00ae\u010a\u0001\u0000\u0000\u0000\u00af\u00b1\u0005\u001e"+
		"\u0000\u0000\u00b0\u00b2\u0003\u001e\u000f\u0000\u00b1\u00b0\u0001\u0000"+
		"\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u010a\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b7\u0005!\u0000\u0000\u00b6\u00b8\u0003\u001e\u000f"+
		"\u0000\u00b7\u00b6\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000"+
		"\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000"+
		"\u0000\u00ba\u010a\u0001\u0000\u0000\u0000\u00bb\u00bd\u0005\"\u0000\u0000"+
		"\u00bc\u00be\u0003\u001e\u000f\u0000\u00bd\u00bc\u0001\u0000\u0000\u0000"+
		"\u00be\u00bf\u0001\u0000\u0000\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000"+
		"\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0\u010a\u0001\u0000\u0000\u0000"+
		"\u00c1\u00c3\u0005#\u0000\u0000\u00c2\u00c4\u0003\u001e\u000f\u0000\u00c3"+
		"\u00c2\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5"+
		"\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6"+
		"\u010a\u0001\u0000\u0000\u0000\u00c7\u00c9\u0005$\u0000\u0000\u00c8\u00ca"+
		"\u0003\u001e\u000f\u0000\u00c9\u00c8\u0001\u0000\u0000\u0000\u00ca\u00cb"+
		"\u0001\u0000\u0000\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000\u00cb\u00cc"+
		"\u0001\u0000\u0000\u0000\u00cc\u010a\u0001\u0000\u0000\u0000\u00cd\u00cf"+
		"\u0005%\u0000\u0000\u00ce\u00d0\u0003\u001e\u000f\u0000\u00cf\u00ce\u0001"+
		"\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1\u00cf\u0001"+
		"\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000\u0000\u00d2\u010a\u0001"+
		"\u0000\u0000\u0000\u00d3\u00d5\u0005&\u0000\u0000\u00d4\u00d6\u0003\u001e"+
		"\u000f\u0000\u00d5\u00d4\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000"+
		"\u0000\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000"+
		"\u0000\u0000\u00d8\u010a\u0001\u0000\u0000\u0000\u00d9\u00db\u0005\'\u0000"+
		"\u0000\u00da\u00dc\u0003\u001e\u000f\u0000\u00db\u00da\u0001\u0000\u0000"+
		"\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000\u00dd\u00db\u0001\u0000\u0000"+
		"\u0000\u00dd\u00de\u0001\u0000\u0000\u0000\u00de\u010a\u0001\u0000\u0000"+
		"\u0000\u00df\u00e1\u0005(\u0000\u0000\u00e0\u00e2\u0003\u001e\u000f\u0000"+
		"\u00e1\u00e0\u0001\u0000\u0000\u0000\u00e2\u00e3\u0001\u0000\u0000\u0000"+
		"\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000"+
		"\u00e4\u010a\u0001\u0000\u0000\u0000\u00e5\u00e7\u0005)\u0000\u0000\u00e6"+
		"\u00e8\u0003\u001e\u000f\u0000\u00e7\u00e6\u0001\u0000\u0000\u0000\u00e8"+
		"\u00e9\u0001\u0000\u0000\u0000\u00e9\u00e7\u0001\u0000\u0000\u0000\u00e9"+
		"\u00ea\u0001\u0000\u0000\u0000\u00ea\u010a\u0001\u0000\u0000\u0000\u00eb"+
		"\u00ed\u0005*\u0000\u0000\u00ec\u00ee\u0003\u001e\u000f\u0000\u00ed\u00ec"+
		"\u0001\u0000\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000\u0000\u00ef\u00ed"+
		"\u0001\u0000\u0000\u0000\u00ef\u00f0\u0001\u0000\u0000\u0000\u00f0\u010a"+
		"\u0001\u0000\u0000\u0000\u00f1\u00f3\u0005+\u0000\u0000\u00f2\u00f4\u0003"+
		"\u001e\u000f\u0000\u00f3\u00f2\u0001\u0000\u0000\u0000\u00f4\u00f5\u0001"+
		"\u0000\u0000\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f5\u00f6\u0001"+
		"\u0000\u0000\u0000\u00f6\u010a\u0001\u0000\u0000\u0000\u00f7\u00f9\u0005"+
		",\u0000\u0000\u00f8\u00fa\u0003\u001e\u000f\u0000\u00f9\u00f8\u0001\u0000"+
		"\u0000\u0000\u00fa\u00fb\u0001\u0000\u0000\u0000\u00fb\u00f9\u0001\u0000"+
		"\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc\u010a\u0001\u0000"+
		"\u0000\u0000\u00fd\u00ff\u0005-\u0000\u0000\u00fe\u0100\u0003\u001e\u000f"+
		"\u0000\u00ff\u00fe\u0001\u0000\u0000\u0000\u0100\u0101\u0001\u0000\u0000"+
		"\u0000\u0101\u00ff\u0001\u0000\u0000\u0000\u0101\u0102\u0001\u0000\u0000"+
		"\u0000\u0102\u010a\u0001\u0000\u0000\u0000\u0103\u0105\u0005.\u0000\u0000"+
		"\u0104\u0106\u0003\u001e\u000f\u0000\u0105\u0104\u0001\u0000\u0000\u0000"+
		"\u0106\u0107\u0001\u0000\u0000\u0000\u0107\u0105\u0001\u0000\u0000\u0000"+
		"\u0107\u0108\u0001\u0000\u0000\u0000\u0108\u010a\u0001\u0000\u0000\u0000"+
		"\u0109\u00a3\u0001\u0000\u0000\u0000\u0109\u00a9\u0001\u0000\u0000\u0000"+
		"\u0109\u00af\u0001\u0000\u0000\u0000\u0109\u00b5\u0001\u0000\u0000\u0000"+
		"\u0109\u00bb\u0001\u0000\u0000\u0000\u0109\u00c1\u0001\u0000\u0000\u0000"+
		"\u0109\u00c7\u0001\u0000\u0000\u0000\u0109\u00cd\u0001\u0000\u0000\u0000"+
		"\u0109\u00d3\u0001\u0000\u0000\u0000\u0109\u00d9\u0001\u0000\u0000\u0000"+
		"\u0109\u00df\u0001\u0000\u0000\u0000\u0109\u00e5\u0001\u0000\u0000\u0000"+
		"\u0109\u00eb\u0001\u0000\u0000\u0000\u0109\u00f1\u0001\u0000\u0000\u0000"+
		"\u0109\u00f7\u0001\u0000\u0000\u0000\u0109\u00fd\u0001\u0000\u0000\u0000"+
		"\u0109\u0103\u0001\u0000\u0000\u0000\u010a\u0019\u0001\u0000\u0000\u0000"+
		"\u010b\u010f\u00050\u0000\u0000\u010c\u010e\u0005/\u0000\u0000\u010d\u010c"+
		"\u0001\u0000\u0000\u0000\u010e\u0111\u0001\u0000\u0000\u0000\u010f\u010d"+
		"\u0001\u0000\u0000\u0000\u010f\u0110\u0001\u0000\u0000\u0000\u0110\u001b"+
		"\u0001\u0000\u0000\u0000\u0111\u010f\u0001\u0000\u0000\u0000\u0112\u0116"+
		"\u0003\u001e\u000f\u0000\u0113\u0115\u0003\u001e\u000f\u0000\u0114\u0113"+
		"\u0001\u0000\u0000\u0000\u0115\u0118\u0001\u0000\u0000\u0000\u0116\u0114"+
		"\u0001\u0000\u0000\u0000\u0116\u0117\u0001\u0000\u0000\u0000\u0117\u001d"+
		"\u0001\u0000\u0000\u0000\u0118\u0116\u0001\u0000\u0000\u0000\u0119\u011a"+
		"\u0007\u0000\u0000\u0000\u011a\u001f\u0001\u0000\u0000\u0000\u011b\u011c"+
		"\u0005\u0019\u0000\u0000\u011c!\u0001\u0000\u0000\u0000*#+-25<AGKQX_g"+
		"lrw{\u0082\u008a\u008e\u0092\u0096\u00a7\u00ad\u00b3\u00b9\u00bf\u00c5"+
		"\u00cb\u00d1\u00d7\u00dd\u00e3\u00e9\u00ef\u00f5\u00fb\u0101\u0107\u0109"+
		"\u010f\u0116";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}