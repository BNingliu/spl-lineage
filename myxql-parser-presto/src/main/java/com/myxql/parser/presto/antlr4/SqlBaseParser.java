// Generated from com\myxql\parser\presto\antlr4\SqlBase.g4 by ANTLR 4.10.1
package com.myxql.parser.presto.antlr4;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SqlBaseParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		ADD=10, ADMIN=11, ALL=12, ALTER=13, ANALYZE=14, AND=15, ANY=16, ARRAY=17, 
		AS=18, ASC=19, AT=20, BERNOULLI=21, BETWEEN=22, BY=23, CALL=24, CALLED=25, 
		CASCADE=26, CASE=27, CAST=28, CATALOGS=29, COLUMN=30, COLUMNS=31, COMMENT=32, 
		COMMIT=33, COMMITTED=34, CONSTRAINT=35, CREATE=36, CROSS=37, CUBE=38, 
		CURRENT=39, CURRENT_DATE=40, CURRENT_ROLE=41, CURRENT_TIME=42, CURRENT_TIMESTAMP=43, 
		CURRENT_USER=44, DATA=45, DATE=46, DAY=47, DEALLOCATE=48, DEFINER=49, 
		DELETE=50, DESC=51, DESCRIBE=52, DETERMINISTIC=53, DISTINCT=54, DISTRIBUTED=55, 
		DROP=56, ELSE=57, END=58, ESCAPE=59, EXCEPT=60, EXCLUDING=61, EXECUTE=62, 
		EXISTS=63, EXPLAIN=64, EXTRACT=65, EXTERNAL=66, FALSE=67, FETCH=68, FILTER=69, 
		FIRST=70, FOLLOWING=71, FOR=72, FORMAT=73, FROM=74, FULL=75, FUNCTION=76, 
		FUNCTIONS=77, GRANT=78, GRANTED=79, GRANTS=80, GRAPHVIZ=81, GROUP=82, 
		GROUPING=83, GROUPS=84, HAVING=85, HOUR=86, IF=87, IGNORE=88, IN=89, INCLUDING=90, 
		INNER=91, INPUT=92, INSERT=93, INTERSECT=94, INTERVAL=95, INTO=96, INVOKER=97, 
		IO=98, IS=99, ISOLATION=100, JSON=101, JOIN=102, LANGUAGE=103, LAST=104, 
		LATERAL=105, LEFT=106, LEVEL=107, LIKE=108, LIMIT=109, LOCALTIME=110, 
		LOCALTIMESTAMP=111, LOGICAL=112, MAP=113, MATERIALIZED=114, MINUTE=115, 
		MONTH=116, NAME=117, NATURAL=118, NFC=119, NFD=120, NFKC=121, NFKD=122, 
		NO=123, NONE=124, NORMALIZE=125, NOT=126, NULL=127, NULLIF=128, NULLS=129, 
		OFFSET=130, ON=131, ONLY=132, OPTION=133, OR=134, ORDER=135, ORDINALITY=136, 
		OUTER=137, OUTPUT=138, OVER=139, PARTITION=140, PARTITIONS=141, POSITION=142, 
		PRECEDING=143, PREPARE=144, PRIVILEGES=145, PROPERTIES=146, RANGE=147, 
		READ=148, RECURSIVE=149, REFRESH=150, RENAME=151, REPEATABLE=152, REPLACE=153, 
		RESET=154, RESPECT=155, RESTRICT=156, RETURN=157, RETURNS=158, REVOKE=159, 
		RIGHT=160, ROLE=161, ROLES=162, ROLLBACK=163, ROLLUP=164, ROW=165, ROWS=166, 
		SCHEMA=167, SCHEMAS=168, SECOND=169, SECURITY=170, SELECT=171, SERIALIZABLE=172, 
		SESSION=173, SET=174, SETS=175, SHOW=176, SOME=177, SQL=178, START=179, 
		STATS=180, SUBSTRING=181, SYSTEM=182, TABLE=183, TABLES=184, TABLESAMPLE=185, 
		TEMPORARY=186, TEXT=187, THEN=188, TIME=189, TIMESTAMP=190, TO=191, TRANSACTION=192, 
		TRUE=193, TRUNCATE=194, TRY_CAST=195, TYPE=196, UESCAPE=197, UNBOUNDED=198, 
		UNCOMMITTED=199, UNION=200, UNNEST=201, USE=202, USER=203, USING=204, 
		VALIDATE=205, VALUES=206, VERBOSE=207, VIEW=208, WHEN=209, WHERE=210, 
		WITH=211, WORK=212, WRITE=213, YEAR=214, ZONE=215, EQ=216, NEQ=217, LT=218, 
		LTE=219, GT=220, GTE=221, PLUS=222, MINUS=223, ASTERISK=224, SLASH=225, 
		PERCENT=226, CONCAT=227, STRING=228, UNICODE_STRING=229, BINARY_LITERAL=230, 
		INTEGER_VALUE=231, DECIMAL_VALUE=232, DOUBLE_VALUE=233, IDENTIFIER=234, 
		DIGIT_IDENTIFIER=235, QUOTED_IDENTIFIER=236, BACKQUOTED_IDENTIFIER=237, 
		TIME_WITH_TIME_ZONE=238, TIMESTAMP_WITH_TIME_ZONE=239, DOUBLE_PRECISION=240, 
		SIMPLE_COMMENT=241, BRACKETED_COMMENT=242, WS=243, UNRECOGNIZED=244, DELIMITER=245;
	public static final int
		RULE_singleStatement = 0, RULE_standaloneExpression = 1, RULE_standaloneRoutineBody = 2, 
		RULE_statement = 3, RULE_query = 4, RULE_with = 5, RULE_tableElement = 6, 
		RULE_columnDefinition = 7, RULE_likeClause = 8, RULE_properties = 9, RULE_property = 10, 
		RULE_sqlParameterDeclaration = 11, RULE_routineCharacteristics = 12, RULE_routineCharacteristic = 13, 
		RULE_alterRoutineCharacteristics = 14, RULE_alterRoutineCharacteristic = 15, 
		RULE_routineBody = 16, RULE_returnStatement = 17, RULE_externalBodyReference = 18, 
		RULE_language = 19, RULE_determinism = 20, RULE_nullCallClause = 21, RULE_externalRoutineName = 22, 
		RULE_queryNoWith = 23, RULE_queryTerm = 24, RULE_queryPrimary = 25, RULE_sortItem = 26, 
		RULE_querySpecification = 27, RULE_selectClause = 28, RULE_fromClause = 29, 
		RULE_whereClause = 30, RULE_groupByClause = 31, RULE_havingClause = 32, 
		RULE_groupingElement = 33, RULE_groupingSet = 34, RULE_namedQuery = 35, 
		RULE_setQuantifier = 36, RULE_selectItem = 37, RULE_relation = 38, RULE_joinType = 39, 
		RULE_joinCriteria = 40, RULE_sampledRelation = 41, RULE_sampleType = 42, 
		RULE_aliasedRelation = 43, RULE_columnAliases = 44, RULE_relationPrimary = 45, 
		RULE_expression = 46, RULE_booleanExpression = 47, RULE_predicate = 48, 
		RULE_valueExpression = 49, RULE_primaryExpression = 50, RULE_string = 51, 
		RULE_nullTreatment = 52, RULE_timeZoneSpecifier = 53, RULE_comparisonOperator = 54, 
		RULE_comparisonQuantifier = 55, RULE_booleanValue = 56, RULE_interval = 57, 
		RULE_intervalField = 58, RULE_normalForm = 59, RULE_types = 60, RULE_type = 61, 
		RULE_typeParameter = 62, RULE_baseType = 63, RULE_whenClause = 64, RULE_filter = 65, 
		RULE_over = 66, RULE_windowFrame = 67, RULE_frameBound = 68, RULE_explainOption = 69, 
		RULE_transactionMode = 70, RULE_levelOfIsolation = 71, RULE_callArgument = 72, 
		RULE_privilege = 73, RULE_qualifiedName = 74, RULE_grantor = 75, RULE_principal = 76, 
		RULE_roles = 77, RULE_identifier = 78, RULE_number = 79, RULE_nonReserved = 80;
	private static String[] makeRuleNames() {
		return new String[] {
			"singleStatement", "standaloneExpression", "standaloneRoutineBody", "statement", 
			"query", "with", "tableElement", "columnDefinition", "likeClause", "properties", 
			"property", "sqlParameterDeclaration", "routineCharacteristics", "routineCharacteristic", 
			"alterRoutineCharacteristics", "alterRoutineCharacteristic", "routineBody", 
			"returnStatement", "externalBodyReference", "language", "determinism", 
			"nullCallClause", "externalRoutineName", "queryNoWith", "queryTerm", 
			"queryPrimary", "sortItem", "querySpecification", "selectClause", "fromClause", 
			"whereClause", "groupByClause", "havingClause", "groupingElement", "groupingSet", 
			"namedQuery", "setQuantifier", "selectItem", "relation", "joinType", 
			"joinCriteria", "sampledRelation", "sampleType", "aliasedRelation", "columnAliases", 
			"relationPrimary", "expression", "booleanExpression", "predicate", "valueExpression", 
			"primaryExpression", "string", "nullTreatment", "timeZoneSpecifier", 
			"comparisonOperator", "comparisonQuantifier", "booleanValue", "interval", 
			"intervalField", "normalForm", "types", "type", "typeParameter", "baseType", 
			"whenClause", "filter", "over", "windowFrame", "frameBound", "explainOption", 
			"transactionMode", "levelOfIsolation", "callArgument", "privilege", "qualifiedName", 
			"grantor", "principal", "roles", "identifier", "number", "nonReserved"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'('", "')'", "','", "'?'", "'->'", "'['", "']'", "'=>'", 
			"'ADD'", "'ADMIN'", "'ALL'", "'ALTER'", "'ANALYZE'", "'AND'", "'ANY'", 
			"'ARRAY'", "'AS'", "'ASC'", "'AT'", "'BERNOULLI'", "'BETWEEN'", "'BY'", 
			"'CALL'", "'CALLED'", "'CASCADE'", "'CASE'", "'CAST'", "'CATALOGS'", 
			"'COLUMN'", "'COLUMNS'", "'COMMENT'", "'COMMIT'", "'COMMITTED'", "'CONSTRAINT'", 
			"'CREATE'", "'CROSS'", "'CUBE'", "'CURRENT'", "'CURRENT_DATE'", "'CURRENT_ROLE'", 
			"'CURRENT_TIME'", "'CURRENT_TIMESTAMP'", "'CURRENT_USER'", "'DATA'", 
			"'DATE'", "'DAY'", "'DEALLOCATE'", "'DEFINER'", "'DELETE'", "'DESC'", 
			"'DESCRIBE'", "'DETERMINISTIC'", "'DISTINCT'", "'DISTRIBUTED'", "'DROP'", 
			"'ELSE'", "'END'", "'ESCAPE'", "'EXCEPT'", "'EXCLUDING'", "'EXECUTE'", 
			"'EXISTS'", "'EXPLAIN'", "'EXTRACT'", "'EXTERNAL'", "'FALSE'", "'FETCH'", 
			"'FILTER'", "'FIRST'", "'FOLLOWING'", "'FOR'", "'FORMAT'", "'FROM'", 
			"'FULL'", "'FUNCTION'", "'FUNCTIONS'", "'GRANT'", "'GRANTED'", "'GRANTS'", 
			"'GRAPHVIZ'", "'GROUP'", "'GROUPING'", "'GROUPS'", "'HAVING'", "'HOUR'", 
			"'IF'", "'IGNORE'", "'IN'", "'INCLUDING'", "'INNER'", "'INPUT'", "'INSERT'", 
			"'INTERSECT'", "'INTERVAL'", "'INTO'", "'INVOKER'", "'IO'", "'IS'", "'ISOLATION'", 
			"'JSON'", "'JOIN'", "'LANGUAGE'", "'LAST'", "'LATERAL'", "'LEFT'", "'LEVEL'", 
			"'LIKE'", "'LIMIT'", "'LOCALTIME'", "'LOCALTIMESTAMP'", "'LOGICAL'", 
			"'MAP'", "'MATERIALIZED'", "'MINUTE'", "'MONTH'", "'NAME'", "'NATURAL'", 
			"'NFC'", "'NFD'", "'NFKC'", "'NFKD'", "'NO'", "'NONE'", "'NORMALIZE'", 
			"'NOT'", "'NULL'", "'NULLIF'", "'NULLS'", "'OFFSET'", "'ON'", "'ONLY'", 
			"'OPTION'", "'OR'", "'ORDER'", "'ORDINALITY'", "'OUTER'", "'OUTPUT'", 
			"'OVER'", "'PARTITION'", "'PARTITIONS'", "'POSITION'", "'PRECEDING'", 
			"'PREPARE'", "'PRIVILEGES'", "'PROPERTIES'", "'RANGE'", "'READ'", "'RECURSIVE'", 
			"'REFRESH'", "'RENAME'", "'REPEATABLE'", "'REPLACE'", "'RESET'", "'RESPECT'", 
			"'RESTRICT'", "'RETURN'", "'RETURNS'", "'REVOKE'", "'RIGHT'", "'ROLE'", 
			"'ROLES'", "'ROLLBACK'", "'ROLLUP'", "'ROW'", "'ROWS'", "'SCHEMA'", "'SCHEMAS'", 
			"'SECOND'", "'SECURITY'", "'SELECT'", "'SERIALIZABLE'", "'SESSION'", 
			"'SET'", "'SETS'", "'SHOW'", "'SOME'", "'SQL'", "'START'", "'STATS'", 
			"'SUBSTRING'", "'SYSTEM'", "'TABLE'", "'TABLES'", "'TABLESAMPLE'", "'TEMPORARY'", 
			"'TEXT'", "'THEN'", "'TIME'", "'TIMESTAMP'", "'TO'", "'TRANSACTION'", 
			"'TRUE'", "'TRUNCATE'", "'TRY_CAST'", "'TYPE'", "'UESCAPE'", "'UNBOUNDED'", 
			"'UNCOMMITTED'", "'UNION'", "'UNNEST'", "'USE'", "'USER'", "'USING'", 
			"'VALIDATE'", "'VALUES'", "'VERBOSE'", "'VIEW'", "'WHEN'", "'WHERE'", 
			"'WITH'", "'WORK'", "'WRITE'", "'YEAR'", "'ZONE'", "'='", null, "'<'", 
			"'<='", "'>'", "'>='", "'+'", "'-'", "'*'", "'/'", "'%'", "'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "ADD", "ADMIN", 
			"ALL", "ALTER", "ANALYZE", "AND", "ANY", "ARRAY", "AS", "ASC", "AT", 
			"BERNOULLI", "BETWEEN", "BY", "CALL", "CALLED", "CASCADE", "CASE", "CAST", 
			"CATALOGS", "COLUMN", "COLUMNS", "COMMENT", "COMMIT", "COMMITTED", "CONSTRAINT", 
			"CREATE", "CROSS", "CUBE", "CURRENT", "CURRENT_DATE", "CURRENT_ROLE", 
			"CURRENT_TIME", "CURRENT_TIMESTAMP", "CURRENT_USER", "DATA", "DATE", 
			"DAY", "DEALLOCATE", "DEFINER", "DELETE", "DESC", "DESCRIBE", "DETERMINISTIC", 
			"DISTINCT", "DISTRIBUTED", "DROP", "ELSE", "END", "ESCAPE", "EXCEPT", 
			"EXCLUDING", "EXECUTE", "EXISTS", "EXPLAIN", "EXTRACT", "EXTERNAL", "FALSE", 
			"FETCH", "FILTER", "FIRST", "FOLLOWING", "FOR", "FORMAT", "FROM", "FULL", 
			"FUNCTION", "FUNCTIONS", "GRANT", "GRANTED", "GRANTS", "GRAPHVIZ", "GROUP", 
			"GROUPING", "GROUPS", "HAVING", "HOUR", "IF", "IGNORE", "IN", "INCLUDING", 
			"INNER", "INPUT", "INSERT", "INTERSECT", "INTERVAL", "INTO", "INVOKER", 
			"IO", "IS", "ISOLATION", "JSON", "JOIN", "LANGUAGE", "LAST", "LATERAL", 
			"LEFT", "LEVEL", "LIKE", "LIMIT", "LOCALTIME", "LOCALTIMESTAMP", "LOGICAL", 
			"MAP", "MATERIALIZED", "MINUTE", "MONTH", "NAME", "NATURAL", "NFC", "NFD", 
			"NFKC", "NFKD", "NO", "NONE", "NORMALIZE", "NOT", "NULL", "NULLIF", "NULLS", 
			"OFFSET", "ON", "ONLY", "OPTION", "OR", "ORDER", "ORDINALITY", "OUTER", 
			"OUTPUT", "OVER", "PARTITION", "PARTITIONS", "POSITION", "PRECEDING", 
			"PREPARE", "PRIVILEGES", "PROPERTIES", "RANGE", "READ", "RECURSIVE", 
			"REFRESH", "RENAME", "REPEATABLE", "REPLACE", "RESET", "RESPECT", "RESTRICT", 
			"RETURN", "RETURNS", "REVOKE", "RIGHT", "ROLE", "ROLES", "ROLLBACK", 
			"ROLLUP", "ROW", "ROWS", "SCHEMA", "SCHEMAS", "SECOND", "SECURITY", "SELECT", 
			"SERIALIZABLE", "SESSION", "SET", "SETS", "SHOW", "SOME", "SQL", "START", 
			"STATS", "SUBSTRING", "SYSTEM", "TABLE", "TABLES", "TABLESAMPLE", "TEMPORARY", 
			"TEXT", "THEN", "TIME", "TIMESTAMP", "TO", "TRANSACTION", "TRUE", "TRUNCATE", 
			"TRY_CAST", "TYPE", "UESCAPE", "UNBOUNDED", "UNCOMMITTED", "UNION", "UNNEST", 
			"USE", "USER", "USING", "VALIDATE", "VALUES", "VERBOSE", "VIEW", "WHEN", 
			"WHERE", "WITH", "WORK", "WRITE", "YEAR", "ZONE", "EQ", "NEQ", "LT", 
			"LTE", "GT", "GTE", "PLUS", "MINUS", "ASTERISK", "SLASH", "PERCENT", 
			"CONCAT", "STRING", "UNICODE_STRING", "BINARY_LITERAL", "INTEGER_VALUE", 
			"DECIMAL_VALUE", "DOUBLE_VALUE", "IDENTIFIER", "DIGIT_IDENTIFIER", "QUOTED_IDENTIFIER", 
			"BACKQUOTED_IDENTIFIER", "TIME_WITH_TIME_ZONE", "TIMESTAMP_WITH_TIME_ZONE", 
			"DOUBLE_PRECISION", "SIMPLE_COMMENT", "BRACKETED_COMMENT", "WS", "UNRECOGNIZED", 
			"DELIMITER"
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
	public String getGrammarFileName() { return "SqlBase.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SqlBaseParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SingleStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleStatementContext singleStatement() throws RecognitionException {
		SingleStatementContext _localctx = new SingleStatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_singleStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			statement();
			setState(163);
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

	public static class StandaloneExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public StandaloneExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_standaloneExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStandaloneExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStandaloneExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStandaloneExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StandaloneExpressionContext standaloneExpression() throws RecognitionException {
		StandaloneExpressionContext _localctx = new StandaloneExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_standaloneExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			expression();
			setState(166);
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

	public static class StandaloneRoutineBodyContext extends ParserRuleContext {
		public RoutineBodyContext routineBody() {
			return getRuleContext(RoutineBodyContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public StandaloneRoutineBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_standaloneRoutineBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStandaloneRoutineBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStandaloneRoutineBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStandaloneRoutineBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StandaloneRoutineBodyContext standaloneRoutineBody() throws RecognitionException {
		StandaloneRoutineBodyContext _localctx = new StandaloneRoutineBodyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_standaloneRoutineBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			routineBody();
			setState(169);
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExplainContext extends StatementContext {
		public TerminalNode EXPLAIN() { return getToken(SqlBaseParser.EXPLAIN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode ANALYZE() { return getToken(SqlBaseParser.ANALYZE, 0); }
		public TerminalNode VERBOSE() { return getToken(SqlBaseParser.VERBOSE, 0); }
		public List<ExplainOptionContext> explainOption() {
			return getRuleContexts(ExplainOptionContext.class);
		}
		public ExplainOptionContext explainOption(int i) {
			return getRuleContext(ExplainOptionContext.class,i);
		}
		public ExplainContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExplain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExplain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExplain(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrepareContext extends StatementContext {
		public TerminalNode PREPARE() { return getToken(SqlBaseParser.PREPARE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public PrepareContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPrepare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPrepare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPrepare(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropMaterializedViewContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode MATERIALIZED() { return getToken(SqlBaseParser.MATERIALIZED, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public DropMaterializedViewContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropMaterializedView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropMaterializedView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropMaterializedView(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UseContext extends StatementContext {
		public IdentifierContext schema;
		public IdentifierContext catalog;
		public TerminalNode USE() { return getToken(SqlBaseParser.USE, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public UseContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeallocateContext extends StatementContext {
		public TerminalNode DEALLOCATE() { return getToken(SqlBaseParser.DEALLOCATE, 0); }
		public TerminalNode PREPARE() { return getToken(SqlBaseParser.PREPARE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DeallocateContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDeallocate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDeallocate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDeallocate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RenameTableContext extends StatementContext {
		public QualifiedNameContext from;
		public QualifiedNameContext to;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public RenameTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRenameTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRenameTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRenameTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CommitContext extends StatementContext {
		public TerminalNode COMMIT() { return getToken(SqlBaseParser.COMMIT, 0); }
		public TerminalNode WORK() { return getToken(SqlBaseParser.WORK, 0); }
		public CommitContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCommit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCommit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCommit(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateRoleContext extends StatementContext {
		public IdentifierContext name;
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode ROLE() { return getToken(SqlBaseParser.ROLE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode ADMIN() { return getToken(SqlBaseParser.ADMIN, 0); }
		public GrantorContext grantor() {
			return getRuleContext(GrantorContext.class,0);
		}
		public CreateRoleContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateRole(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateRole(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateRole(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowCreateFunctionContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public ShowCreateFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowCreateFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowCreateFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowCreateFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropColumnContext extends StatementContext {
		public QualifiedNameContext tableName;
		public QualifiedNameContext column;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public List<TerminalNode> IF() { return getTokens(SqlBaseParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(SqlBaseParser.IF, i);
		}
		public List<TerminalNode> EXISTS() { return getTokens(SqlBaseParser.EXISTS); }
		public TerminalNode EXISTS(int i) {
			return getToken(SqlBaseParser.EXISTS, i);
		}
		public DropColumnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropViewContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public DropViewContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropView(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowTablesContext extends StatementContext {
		public StringContext pattern;
		public StringContext escape;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode TABLES() { return getToken(SqlBaseParser.TABLES, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public TerminalNode ESCAPE() { return getToken(SqlBaseParser.ESCAPE, 0); }
		public ShowTablesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowTables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowTables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowTables(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowCatalogsContext extends StatementContext {
		public StringContext pattern;
		public StringContext escape;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode CATALOGS() { return getToken(SqlBaseParser.CATALOGS, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public TerminalNode ESCAPE() { return getToken(SqlBaseParser.ESCAPE, 0); }
		public ShowCatalogsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowCatalogs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowCatalogs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowCatalogs(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowRolesContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode ROLES() { return getToken(SqlBaseParser.ROLES, 0); }
		public TerminalNode CURRENT() { return getToken(SqlBaseParser.CURRENT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public ShowRolesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowRoles(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowRoles(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowRoles(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RenameColumnContext extends StatementContext {
		public QualifiedNameContext tableName;
		public IdentifierContext from;
		public IdentifierContext to;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> IF() { return getTokens(SqlBaseParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(SqlBaseParser.IF, i);
		}
		public List<TerminalNode> EXISTS() { return getTokens(SqlBaseParser.EXISTS); }
		public TerminalNode EXISTS(int i) {
			return getToken(SqlBaseParser.EXISTS, i);
		}
		public RenameColumnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRenameColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRenameColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRenameColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RevokeRolesContext extends StatementContext {
		public TerminalNode REVOKE() { return getToken(SqlBaseParser.REVOKE, 0); }
		public RolesContext roles() {
			return getRuleContext(RolesContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public List<PrincipalContext> principal() {
			return getRuleContexts(PrincipalContext.class);
		}
		public PrincipalContext principal(int i) {
			return getRuleContext(PrincipalContext.class,i);
		}
		public TerminalNode ADMIN() { return getToken(SqlBaseParser.ADMIN, 0); }
		public TerminalNode OPTION() { return getToken(SqlBaseParser.OPTION, 0); }
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public TerminalNode GRANTED() { return getToken(SqlBaseParser.GRANTED, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public GrantorContext grantor() {
			return getRuleContext(GrantorContext.class,0);
		}
		public RevokeRolesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRevokeRoles(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRevokeRoles(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRevokeRoles(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowCreateTableContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ShowCreateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowCreateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowCreateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowCreateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowColumnsContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public ShowColumnsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowColumns(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowRoleGrantsContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode ROLE() { return getToken(SqlBaseParser.ROLE, 0); }
		public TerminalNode GRANTS() { return getToken(SqlBaseParser.GRANTS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public ShowRoleGrantsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowRoleGrants(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowRoleGrants(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowRoleGrants(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddColumnContext extends StatementContext {
		public QualifiedNameContext tableName;
		public ColumnDefinitionContext column;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ColumnDefinitionContext columnDefinition() {
			return getRuleContext(ColumnDefinitionContext.class,0);
		}
		public List<TerminalNode> IF() { return getTokens(SqlBaseParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(SqlBaseParser.IF, i);
		}
		public List<TerminalNode> EXISTS() { return getTokens(SqlBaseParser.EXISTS); }
		public TerminalNode EXISTS(int i) {
			return getToken(SqlBaseParser.EXISTS, i);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public AddColumnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAddColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAddColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAddColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ResetSessionContext extends StatementContext {
		public TerminalNode RESET() { return getToken(SqlBaseParser.RESET, 0); }
		public TerminalNode SESSION() { return getToken(SqlBaseParser.SESSION, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ResetSessionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterResetSession(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitResetSession(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitResetSession(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InsertIntoContext extends StatementContext {
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(SqlBaseParser.INTO, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public ColumnAliasesContext columnAliases() {
			return getRuleContext(ColumnAliasesContext.class,0);
		}
		public InsertIntoContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInsertInto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInsertInto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInsertInto(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowSessionContext extends StatementContext {
		public StringContext pattern;
		public StringContext escape;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode SESSION() { return getToken(SqlBaseParser.SESSION, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public TerminalNode ESCAPE() { return getToken(SqlBaseParser.ESCAPE, 0); }
		public ShowSessionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowSession(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowSession(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowSession(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateSchemaContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode SCHEMA() { return getToken(SqlBaseParser.SCHEMA, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public PropertiesContext properties() {
			return getRuleContext(PropertiesContext.class,0);
		}
		public CreateSchemaContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateSchema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateSchema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateSchema(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExecuteContext extends StatementContext {
		public TerminalNode EXECUTE() { return getToken(SqlBaseParser.EXECUTE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExecuteContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExecute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExecute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExecute(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RenameSchemaContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode SCHEMA() { return getToken(SqlBaseParser.SCHEMA, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public RenameSchemaContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRenameSchema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRenameSchema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRenameSchema(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropRoleContext extends StatementContext {
		public IdentifierContext name;
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode ROLE() { return getToken(SqlBaseParser.ROLE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DropRoleContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropRole(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropRole(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropRole(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AnalyzeContext extends StatementContext {
		public TerminalNode ANALYZE() { return getToken(SqlBaseParser.ANALYZE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public PropertiesContext properties() {
			return getRuleContext(PropertiesContext.class,0);
		}
		public AnalyzeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAnalyze(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAnalyze(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAnalyze(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetRoleContext extends StatementContext {
		public IdentifierContext role;
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode ROLE() { return getToken(SqlBaseParser.ROLE, 0); }
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public TerminalNode NONE() { return getToken(SqlBaseParser.NONE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SetRoleContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetRole(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetRole(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetRole(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateFunctionContext extends StatementContext {
		public QualifiedNameContext functionName;
		public TypeContext returnType;
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public TerminalNode RETURNS() { return getToken(SqlBaseParser.RETURNS, 0); }
		public RoutineCharacteristicsContext routineCharacteristics() {
			return getRuleContext(RoutineCharacteristicsContext.class,0);
		}
		public RoutineBodyContext routineBody() {
			return getRuleContext(RoutineBodyContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public List<SqlParameterDeclarationContext> sqlParameterDeclaration() {
			return getRuleContexts(SqlParameterDeclarationContext.class);
		}
		public SqlParameterDeclarationContext sqlParameterDeclaration(int i) {
			return getRuleContext(SqlParameterDeclarationContext.class,i);
		}
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public CreateFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowGrantsContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode GRANTS() { return getToken(SqlBaseParser.GRANTS, 0); }
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public ShowGrantsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowGrants(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowGrants(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowGrants(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropSchemaContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode SCHEMA() { return getToken(SqlBaseParser.SCHEMA, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode CASCADE() { return getToken(SqlBaseParser.CASCADE, 0); }
		public TerminalNode RESTRICT() { return getToken(SqlBaseParser.RESTRICT, 0); }
		public DropSchemaContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropSchema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropSchema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropSchema(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowCreateViewContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ShowCreateViewContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowCreateView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowCreateView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowCreateView(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateTableContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public List<TableElementContext> tableElement() {
			return getRuleContexts(TableElementContext.class);
		}
		public TableElementContext tableElement(int i) {
			return getRuleContext(TableElementContext.class,i);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public PropertiesContext properties() {
			return getRuleContext(PropertiesContext.class,0);
		}
		public CreateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StartTransactionContext extends StatementContext {
		public TerminalNode START() { return getToken(SqlBaseParser.START, 0); }
		public TerminalNode TRANSACTION() { return getToken(SqlBaseParser.TRANSACTION, 0); }
		public List<TransactionModeContext> transactionMode() {
			return getRuleContexts(TransactionModeContext.class);
		}
		public TransactionModeContext transactionMode(int i) {
			return getRuleContext(TransactionModeContext.class,i);
		}
		public StartTransactionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStartTransaction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStartTransaction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStartTransaction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateTableAsSelectContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public ColumnAliasesContext columnAliases() {
			return getRuleContext(ColumnAliasesContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public List<TerminalNode> WITH() { return getTokens(SqlBaseParser.WITH); }
		public TerminalNode WITH(int i) {
			return getToken(SqlBaseParser.WITH, i);
		}
		public PropertiesContext properties() {
			return getRuleContext(PropertiesContext.class,0);
		}
		public TerminalNode DATA() { return getToken(SqlBaseParser.DATA, 0); }
		public TerminalNode NO() { return getToken(SqlBaseParser.NO, 0); }
		public CreateTableAsSelectContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateTableAsSelect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateTableAsSelect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateTableAsSelect(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowStatsContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode STATS() { return getToken(SqlBaseParser.STATS, 0); }
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ShowStatsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowStats(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowStats(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowStats(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropFunctionContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public DropFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RevokeContext extends StatementContext {
		public PrincipalContext grantee;
		public TerminalNode REVOKE() { return getToken(SqlBaseParser.REVOKE, 0); }
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public PrincipalContext principal() {
			return getRuleContext(PrincipalContext.class,0);
		}
		public List<PrivilegeContext> privilege() {
			return getRuleContexts(PrivilegeContext.class);
		}
		public PrivilegeContext privilege(int i) {
			return getRuleContext(PrivilegeContext.class,i);
		}
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public TerminalNode PRIVILEGES() { return getToken(SqlBaseParser.PRIVILEGES, 0); }
		public TerminalNode GRANT() { return getToken(SqlBaseParser.GRANT, 0); }
		public TerminalNode OPTION() { return getToken(SqlBaseParser.OPTION, 0); }
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public RevokeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRevoke(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRevoke(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRevoke(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateTypeContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode TYPE() { return getToken(SqlBaseParser.TYPE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public List<SqlParameterDeclarationContext> sqlParameterDeclaration() {
			return getRuleContexts(SqlParameterDeclarationContext.class);
		}
		public SqlParameterDeclarationContext sqlParameterDeclaration(int i) {
			return getRuleContext(SqlParameterDeclarationContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public CreateTypeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeleteContext extends StatementContext {
		public TerminalNode DELETE() { return getToken(SqlBaseParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(SqlBaseParser.WHERE, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public DeleteContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDelete(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDelete(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDelete(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescribeInputContext extends StatementContext {
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode INPUT() { return getToken(SqlBaseParser.INPUT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DescribeInputContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDescribeInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDescribeInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDescribeInput(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowStatsForQueryContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode STATS() { return getToken(SqlBaseParser.STATS, 0); }
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public QuerySpecificationContext querySpecification() {
			return getRuleContext(QuerySpecificationContext.class,0);
		}
		public ShowStatsForQueryContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowStatsForQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowStatsForQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowStatsForQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementDefaultContext extends StatementContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public StatementDefaultContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStatementDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStatementDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStatementDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TruncateTableContext extends StatementContext {
		public TerminalNode TRUNCATE() { return getToken(SqlBaseParser.TRUNCATE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TruncateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTruncateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTruncateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTruncateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateMaterializedViewContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode MATERIALIZED() { return getToken(SqlBaseParser.MATERIALIZED, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public PropertiesContext properties() {
			return getRuleContext(PropertiesContext.class,0);
		}
		public CreateMaterializedViewContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateMaterializedView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateMaterializedView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateMaterializedView(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterFunctionContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public AlterRoutineCharacteristicsContext alterRoutineCharacteristics() {
			return getRuleContext(AlterRoutineCharacteristicsContext.class,0);
		}
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public AlterFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAlterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAlterFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAlterFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetSessionContext extends StatementContext {
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode SESSION() { return getToken(SqlBaseParser.SESSION, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SetSessionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetSession(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetSession(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetSession(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateViewContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode SECURITY() { return getToken(SqlBaseParser.SECURITY, 0); }
		public TerminalNode DEFINER() { return getToken(SqlBaseParser.DEFINER, 0); }
		public TerminalNode INVOKER() { return getToken(SqlBaseParser.INVOKER, 0); }
		public CreateViewContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateView(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowSchemasContext extends StatementContext {
		public StringContext pattern;
		public StringContext escape;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode SCHEMAS() { return getToken(SqlBaseParser.SCHEMAS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public TerminalNode ESCAPE() { return getToken(SqlBaseParser.ESCAPE, 0); }
		public ShowSchemasContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowSchemas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowSchemas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowSchemas(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropTableContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public DropTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RollbackContext extends StatementContext {
		public TerminalNode ROLLBACK() { return getToken(SqlBaseParser.ROLLBACK, 0); }
		public TerminalNode WORK() { return getToken(SqlBaseParser.WORK, 0); }
		public RollbackContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRollback(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRollback(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRollback(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GrantRolesContext extends StatementContext {
		public TerminalNode GRANT() { return getToken(SqlBaseParser.GRANT, 0); }
		public RolesContext roles() {
			return getRuleContext(RolesContext.class,0);
		}
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public List<PrincipalContext> principal() {
			return getRuleContexts(PrincipalContext.class);
		}
		public PrincipalContext principal(int i) {
			return getRuleContext(PrincipalContext.class,i);
		}
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode ADMIN() { return getToken(SqlBaseParser.ADMIN, 0); }
		public TerminalNode OPTION() { return getToken(SqlBaseParser.OPTION, 0); }
		public TerminalNode GRANTED() { return getToken(SqlBaseParser.GRANTED, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public GrantorContext grantor() {
			return getRuleContext(GrantorContext.class,0);
		}
		public GrantRolesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterGrantRoles(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitGrantRoles(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitGrantRoles(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CallContext extends StatementContext {
		public TerminalNode CALL() { return getToken(SqlBaseParser.CALL, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public List<CallArgumentContext> callArgument() {
			return getRuleContexts(CallArgumentContext.class);
		}
		public CallArgumentContext callArgument(int i) {
			return getRuleContext(CallArgumentContext.class,i);
		}
		public CallContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RefreshMaterializedViewContext extends StatementContext {
		public TerminalNode REFRESH() { return getToken(SqlBaseParser.REFRESH, 0); }
		public TerminalNode MATERIALIZED() { return getToken(SqlBaseParser.MATERIALIZED, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(SqlBaseParser.WHERE, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public RefreshMaterializedViewContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRefreshMaterializedView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRefreshMaterializedView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRefreshMaterializedView(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowCreateMaterializedViewContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode MATERIALIZED() { return getToken(SqlBaseParser.MATERIALIZED, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ShowCreateMaterializedViewContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowCreateMaterializedView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowCreateMaterializedView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowCreateMaterializedView(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowFunctionsContext extends StatementContext {
		public StringContext pattern;
		public StringContext escape;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode FUNCTIONS() { return getToken(SqlBaseParser.FUNCTIONS, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public TerminalNode ESCAPE() { return getToken(SqlBaseParser.ESCAPE, 0); }
		public ShowFunctionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowFunctions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowFunctions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowFunctions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescribeOutputContext extends StatementContext {
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode OUTPUT() { return getToken(SqlBaseParser.OUTPUT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DescribeOutputContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDescribeOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDescribeOutput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDescribeOutput(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GrantContext extends StatementContext {
		public PrincipalContext grantee;
		public List<TerminalNode> GRANT() { return getTokens(SqlBaseParser.GRANT); }
		public TerminalNode GRANT(int i) {
			return getToken(SqlBaseParser.GRANT, i);
		}
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public PrincipalContext principal() {
			return getRuleContext(PrincipalContext.class,0);
		}
		public List<PrivilegeContext> privilege() {
			return getRuleContexts(PrivilegeContext.class);
		}
		public PrivilegeContext privilege(int i) {
			return getRuleContext(PrivilegeContext.class,i);
		}
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public TerminalNode PRIVILEGES() { return getToken(SqlBaseParser.PRIVILEGES, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode OPTION() { return getToken(SqlBaseParser.OPTION, 0); }
		public GrantContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterGrant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitGrant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitGrant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		int _la;
		try {
			setState(814);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				_localctx = new StatementDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				query();
				}
				break;
			case 2:
				_localctx = new UseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				match(USE);
				setState(173);
				((UseContext)_localctx).schema = identifier();
				}
				break;
			case 3:
				_localctx = new UseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(174);
				match(USE);
				setState(175);
				((UseContext)_localctx).catalog = identifier();
				setState(176);
				match(T__0);
				setState(177);
				((UseContext)_localctx).schema = identifier();
				}
				break;
			case 4:
				_localctx = new CreateSchemaContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(179);
				match(CREATE);
				setState(180);
				match(SCHEMA);
				setState(184);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(181);
					match(IF);
					setState(182);
					match(NOT);
					setState(183);
					match(EXISTS);
					}
					break;
				}
				setState(186);
				qualifiedName();
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(187);
					match(WITH);
					setState(188);
					properties();
					}
				}

				}
				break;
			case 5:
				_localctx = new DropSchemaContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(191);
				match(DROP);
				setState(192);
				match(SCHEMA);
				setState(195);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(193);
					match(IF);
					setState(194);
					match(EXISTS);
					}
					break;
				}
				setState(197);
				qualifiedName();
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CASCADE || _la==RESTRICT) {
					{
					setState(198);
					_la = _input.LA(1);
					if ( !(_la==CASCADE || _la==RESTRICT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				break;
			case 6:
				_localctx = new RenameSchemaContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(201);
				match(ALTER);
				setState(202);
				match(SCHEMA);
				setState(203);
				qualifiedName();
				setState(204);
				match(RENAME);
				setState(205);
				match(TO);
				setState(206);
				identifier();
				}
				break;
			case 7:
				_localctx = new CreateTableAsSelectContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(208);
				match(CREATE);
				setState(209);
				match(TABLE);
				setState(213);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(210);
					match(IF);
					setState(211);
					match(NOT);
					setState(212);
					match(EXISTS);
					}
					break;
				}
				setState(215);
				qualifiedName();
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(216);
					columnAliases();
					}
				}

				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(219);
					match(COMMENT);
					setState(220);
					string();
					}
				}

				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(223);
					match(WITH);
					setState(224);
					properties();
					}
				}

				setState(227);
				match(AS);
				setState(233);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(228);
					query();
					}
					break;
				case 2:
					{
					setState(229);
					match(T__1);
					setState(230);
					query();
					setState(231);
					match(T__2);
					}
					break;
				}
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(235);
					match(WITH);
					setState(237);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NO) {
						{
						setState(236);
						match(NO);
						}
					}

					setState(239);
					match(DATA);
					}
				}

				}
				break;
			case 8:
				_localctx = new CreateTableContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(242);
				match(CREATE);
				setState(243);
				match(TABLE);
				setState(247);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(244);
					match(IF);
					setState(245);
					match(NOT);
					setState(246);
					match(EXISTS);
					}
					break;
				}
				setState(249);
				qualifiedName();
				setState(250);
				match(T__1);
				setState(251);
				tableElement();
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(252);
					match(T__3);
					setState(253);
					tableElement();
					}
					}
					setState(258);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(259);
				match(T__2);
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(260);
					match(COMMENT);
					setState(261);
					string();
					}
				}

				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(264);
					match(WITH);
					setState(265);
					properties();
					}
				}

				}
				break;
			case 9:
				_localctx = new DropTableContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(268);
				match(DROP);
				setState(269);
				match(TABLE);
				setState(272);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(270);
					match(IF);
					setState(271);
					match(EXISTS);
					}
					break;
				}
				setState(274);
				qualifiedName();
				}
				break;
			case 10:
				_localctx = new InsertIntoContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(275);
				match(INSERT);
				setState(276);
				match(INTO);
				setState(277);
				qualifiedName();
				setState(279);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(278);
					columnAliases();
					}
					break;
				}
				setState(281);
				query();
				}
				break;
			case 11:
				_localctx = new DeleteContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(283);
				match(DELETE);
				setState(284);
				match(FROM);
				setState(285);
				qualifiedName();
				setState(288);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(286);
					match(WHERE);
					setState(287);
					booleanExpression(0);
					}
				}

				}
				break;
			case 12:
				_localctx = new TruncateTableContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(290);
				match(TRUNCATE);
				setState(291);
				match(TABLE);
				setState(292);
				qualifiedName();
				}
				break;
			case 13:
				_localctx = new RenameTableContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(293);
				match(ALTER);
				setState(294);
				match(TABLE);
				setState(297);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(295);
					match(IF);
					setState(296);
					match(EXISTS);
					}
					break;
				}
				setState(299);
				((RenameTableContext)_localctx).from = qualifiedName();
				setState(300);
				match(RENAME);
				setState(301);
				match(TO);
				setState(302);
				((RenameTableContext)_localctx).to = qualifiedName();
				}
				break;
			case 14:
				_localctx = new RenameColumnContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(304);
				match(ALTER);
				setState(305);
				match(TABLE);
				setState(308);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(306);
					match(IF);
					setState(307);
					match(EXISTS);
					}
					break;
				}
				setState(310);
				((RenameColumnContext)_localctx).tableName = qualifiedName();
				setState(311);
				match(RENAME);
				setState(312);
				match(COLUMN);
				setState(315);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(313);
					match(IF);
					setState(314);
					match(EXISTS);
					}
					break;
				}
				setState(317);
				((RenameColumnContext)_localctx).from = identifier();
				setState(318);
				match(TO);
				setState(319);
				((RenameColumnContext)_localctx).to = identifier();
				}
				break;
			case 15:
				_localctx = new DropColumnContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(321);
				match(ALTER);
				setState(322);
				match(TABLE);
				setState(325);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(323);
					match(IF);
					setState(324);
					match(EXISTS);
					}
					break;
				}
				setState(327);
				((DropColumnContext)_localctx).tableName = qualifiedName();
				setState(328);
				match(DROP);
				setState(329);
				match(COLUMN);
				setState(332);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(330);
					match(IF);
					setState(331);
					match(EXISTS);
					}
					break;
				}
				setState(334);
				((DropColumnContext)_localctx).column = qualifiedName();
				}
				break;
			case 16:
				_localctx = new AddColumnContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(336);
				match(ALTER);
				setState(337);
				match(TABLE);
				setState(340);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(338);
					match(IF);
					setState(339);
					match(EXISTS);
					}
					break;
				}
				setState(342);
				((AddColumnContext)_localctx).tableName = qualifiedName();
				setState(343);
				match(ADD);
				setState(344);
				match(COLUMN);
				setState(348);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(345);
					match(IF);
					setState(346);
					match(NOT);
					setState(347);
					match(EXISTS);
					}
					break;
				}
				setState(350);
				((AddColumnContext)_localctx).column = columnDefinition();
				}
				break;
			case 17:
				_localctx = new AnalyzeContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(352);
				match(ANALYZE);
				setState(353);
				qualifiedName();
				setState(356);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(354);
					match(WITH);
					setState(355);
					properties();
					}
				}

				}
				break;
			case 18:
				_localctx = new CreateTypeContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(358);
				match(CREATE);
				setState(359);
				match(TYPE);
				setState(360);
				qualifiedName();
				setState(361);
				match(AS);
				setState(374);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__1:
					{
					setState(362);
					match(T__1);
					setState(363);
					sqlParameterDeclaration();
					setState(368);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(364);
						match(T__3);
						setState(365);
						sqlParameterDeclaration();
						}
						}
						setState(370);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(371);
					match(T__2);
					}
					break;
				case ADD:
				case ADMIN:
				case ALL:
				case ANALYZE:
				case ANY:
				case ARRAY:
				case ASC:
				case AT:
				case BERNOULLI:
				case CALL:
				case CALLED:
				case CASCADE:
				case CATALOGS:
				case COLUMN:
				case COLUMNS:
				case COMMENT:
				case COMMIT:
				case COMMITTED:
				case CURRENT:
				case CURRENT_ROLE:
				case DATA:
				case DATE:
				case DAY:
				case DEFINER:
				case DESC:
				case DETERMINISTIC:
				case DISTRIBUTED:
				case EXCLUDING:
				case EXPLAIN:
				case EXTERNAL:
				case FETCH:
				case FILTER:
				case FIRST:
				case FOLLOWING:
				case FORMAT:
				case FUNCTION:
				case FUNCTIONS:
				case GRANT:
				case GRANTED:
				case GRANTS:
				case GRAPHVIZ:
				case GROUPS:
				case HOUR:
				case IF:
				case IGNORE:
				case INCLUDING:
				case INPUT:
				case INTERVAL:
				case INVOKER:
				case IO:
				case ISOLATION:
				case JSON:
				case LANGUAGE:
				case LAST:
				case LATERAL:
				case LEVEL:
				case LIMIT:
				case LOGICAL:
				case MAP:
				case MATERIALIZED:
				case MINUTE:
				case MONTH:
				case NAME:
				case NFC:
				case NFD:
				case NFKC:
				case NFKD:
				case NO:
				case NONE:
				case NULLIF:
				case NULLS:
				case OFFSET:
				case ONLY:
				case OPTION:
				case ORDINALITY:
				case OUTPUT:
				case OVER:
				case PARTITION:
				case PARTITIONS:
				case POSITION:
				case PRECEDING:
				case PRIVILEGES:
				case PROPERTIES:
				case RANGE:
				case READ:
				case REFRESH:
				case RENAME:
				case REPEATABLE:
				case REPLACE:
				case RESET:
				case RESPECT:
				case RESTRICT:
				case RETURN:
				case RETURNS:
				case REVOKE:
				case ROLE:
				case ROLES:
				case ROLLBACK:
				case ROW:
				case ROWS:
				case SCHEMA:
				case SCHEMAS:
				case SECOND:
				case SECURITY:
				case SERIALIZABLE:
				case SESSION:
				case SET:
				case SETS:
				case SHOW:
				case SOME:
				case SQL:
				case START:
				case STATS:
				case SUBSTRING:
				case SYSTEM:
				case TABLES:
				case TABLESAMPLE:
				case TEMPORARY:
				case TEXT:
				case TIME:
				case TIMESTAMP:
				case TO:
				case TRANSACTION:
				case TRUNCATE:
				case TRY_CAST:
				case TYPE:
				case UNBOUNDED:
				case UNCOMMITTED:
				case USE:
				case USER:
				case VALIDATE:
				case VERBOSE:
				case VIEW:
				case WORK:
				case WRITE:
				case YEAR:
				case ZONE:
				case IDENTIFIER:
				case DIGIT_IDENTIFIER:
				case QUOTED_IDENTIFIER:
				case BACKQUOTED_IDENTIFIER:
				case TIME_WITH_TIME_ZONE:
				case TIMESTAMP_WITH_TIME_ZONE:
				case DOUBLE_PRECISION:
					{
					setState(373);
					type(0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 19:
				_localctx = new CreateViewContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(376);
				match(CREATE);
				setState(379);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(377);
					match(OR);
					setState(378);
					match(REPLACE);
					}
				}

				setState(381);
				match(VIEW);
				setState(382);
				qualifiedName();
				setState(385);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SECURITY) {
					{
					setState(383);
					match(SECURITY);
					setState(384);
					_la = _input.LA(1);
					if ( !(_la==DEFINER || _la==INVOKER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(387);
				match(AS);
				setState(388);
				query();
				}
				break;
			case 20:
				_localctx = new DropViewContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(390);
				match(DROP);
				setState(391);
				match(VIEW);
				setState(394);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(392);
					match(IF);
					setState(393);
					match(EXISTS);
					}
					break;
				}
				setState(396);
				qualifiedName();
				}
				break;
			case 21:
				_localctx = new CreateMaterializedViewContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(397);
				match(CREATE);
				setState(398);
				match(MATERIALIZED);
				setState(399);
				match(VIEW);
				setState(403);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(400);
					match(IF);
					setState(401);
					match(NOT);
					setState(402);
					match(EXISTS);
					}
					break;
				}
				setState(405);
				qualifiedName();
				setState(408);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(406);
					match(COMMENT);
					setState(407);
					string();
					}
				}

				setState(412);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(410);
					match(WITH);
					setState(411);
					properties();
					}
				}

				setState(414);
				match(AS);
				setState(420);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(415);
					query();
					}
					break;
				case 2:
					{
					setState(416);
					match(T__1);
					setState(417);
					query();
					setState(418);
					match(T__2);
					}
					break;
				}
				}
				break;
			case 22:
				_localctx = new DropMaterializedViewContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(422);
				match(DROP);
				setState(423);
				match(MATERIALIZED);
				setState(424);
				match(VIEW);
				setState(427);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(425);
					match(IF);
					setState(426);
					match(EXISTS);
					}
					break;
				}
				setState(429);
				qualifiedName();
				}
				break;
			case 23:
				_localctx = new RefreshMaterializedViewContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(430);
				match(REFRESH);
				setState(431);
				match(MATERIALIZED);
				setState(432);
				match(VIEW);
				setState(433);
				qualifiedName();
				setState(434);
				match(WHERE);
				setState(435);
				booleanExpression(0);
				}
				break;
			case 24:
				_localctx = new CreateFunctionContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(437);
				match(CREATE);
				setState(440);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(438);
					match(OR);
					setState(439);
					match(REPLACE);
					}
				}

				setState(443);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TEMPORARY) {
					{
					setState(442);
					match(TEMPORARY);
					}
				}

				setState(445);
				match(FUNCTION);
				setState(446);
				((CreateFunctionContext)_localctx).functionName = qualifiedName();
				setState(447);
				match(T__1);
				setState(456);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ADMIN) | (1L << ALL) | (1L << ANALYZE) | (1L << ANY) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << BERNOULLI) | (1L << CALL) | (1L << CALLED) | (1L << CASCADE) | (1L << CATALOGS) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << CURRENT_ROLE) | (1L << DATA) | (1L << DATE) | (1L << DAY) | (1L << DEFINER) | (1L << DESC) | (1L << DETERMINISTIC) | (1L << DISTRIBUTED) | (1L << EXCLUDING))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (EXPLAIN - 64)) | (1L << (EXTERNAL - 64)) | (1L << (FETCH - 64)) | (1L << (FILTER - 64)) | (1L << (FIRST - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FORMAT - 64)) | (1L << (FUNCTION - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GRANT - 64)) | (1L << (GRANTED - 64)) | (1L << (GRANTS - 64)) | (1L << (GRAPHVIZ - 64)) | (1L << (GROUPS - 64)) | (1L << (HOUR - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (INCLUDING - 64)) | (1L << (INPUT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INVOKER - 64)) | (1L << (IO - 64)) | (1L << (ISOLATION - 64)) | (1L << (JSON - 64)) | (1L << (LANGUAGE - 64)) | (1L << (LAST - 64)) | (1L << (LATERAL - 64)) | (1L << (LEVEL - 64)) | (1L << (LIMIT - 64)) | (1L << (LOGICAL - 64)) | (1L << (MAP - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MINUTE - 64)) | (1L << (MONTH - 64)) | (1L << (NAME - 64)) | (1L << (NFC - 64)) | (1L << (NFD - 64)) | (1L << (NFKC - 64)) | (1L << (NFKD - 64)) | (1L << (NO - 64)) | (1L << (NONE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (NULLIF - 128)) | (1L << (NULLS - 128)) | (1L << (OFFSET - 128)) | (1L << (ONLY - 128)) | (1L << (OPTION - 128)) | (1L << (ORDINALITY - 128)) | (1L << (OUTPUT - 128)) | (1L << (OVER - 128)) | (1L << (PARTITION - 128)) | (1L << (PARTITIONS - 128)) | (1L << (POSITION - 128)) | (1L << (PRECEDING - 128)) | (1L << (PRIVILEGES - 128)) | (1L << (PROPERTIES - 128)) | (1L << (RANGE - 128)) | (1L << (READ - 128)) | (1L << (REFRESH - 128)) | (1L << (RENAME - 128)) | (1L << (REPEATABLE - 128)) | (1L << (REPLACE - 128)) | (1L << (RESET - 128)) | (1L << (RESPECT - 128)) | (1L << (RESTRICT - 128)) | (1L << (RETURN - 128)) | (1L << (RETURNS - 128)) | (1L << (REVOKE - 128)) | (1L << (ROLE - 128)) | (1L << (ROLES - 128)) | (1L << (ROLLBACK - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (SCHEMA - 128)) | (1L << (SCHEMAS - 128)) | (1L << (SECOND - 128)) | (1L << (SECURITY - 128)) | (1L << (SERIALIZABLE - 128)) | (1L << (SESSION - 128)) | (1L << (SET - 128)) | (1L << (SETS - 128)) | (1L << (SHOW - 128)) | (1L << (SOME - 128)) | (1L << (SQL - 128)) | (1L << (START - 128)) | (1L << (STATS - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLES - 128)) | (1L << (TABLESAMPLE - 128)) | (1L << (TEMPORARY - 128)) | (1L << (TEXT - 128)) | (1L << (TIME - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (TRANSACTION - 192)) | (1L << (TRUNCATE - 192)) | (1L << (TRY_CAST - 192)) | (1L << (TYPE - 192)) | (1L << (UNBOUNDED - 192)) | (1L << (UNCOMMITTED - 192)) | (1L << (USE - 192)) | (1L << (USER - 192)) | (1L << (VALIDATE - 192)) | (1L << (VERBOSE - 192)) | (1L << (VIEW - 192)) | (1L << (WORK - 192)) | (1L << (WRITE - 192)) | (1L << (YEAR - 192)) | (1L << (ZONE - 192)) | (1L << (IDENTIFIER - 192)) | (1L << (DIGIT_IDENTIFIER - 192)) | (1L << (QUOTED_IDENTIFIER - 192)) | (1L << (BACKQUOTED_IDENTIFIER - 192)))) != 0)) {
					{
					setState(448);
					sqlParameterDeclaration();
					setState(453);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(449);
						match(T__3);
						setState(450);
						sqlParameterDeclaration();
						}
						}
						setState(455);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(458);
				match(T__2);
				setState(459);
				match(RETURNS);
				setState(460);
				((CreateFunctionContext)_localctx).returnType = type(0);
				setState(463);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(461);
					match(COMMENT);
					setState(462);
					string();
					}
				}

				setState(465);
				routineCharacteristics();
				setState(466);
				routineBody();
				}
				break;
			case 25:
				_localctx = new AlterFunctionContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(468);
				match(ALTER);
				setState(469);
				match(FUNCTION);
				setState(470);
				qualifiedName();
				setState(472);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(471);
					types();
					}
				}

				setState(474);
				alterRoutineCharacteristics();
				}
				break;
			case 26:
				_localctx = new DropFunctionContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(476);
				match(DROP);
				setState(478);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TEMPORARY) {
					{
					setState(477);
					match(TEMPORARY);
					}
				}

				setState(480);
				match(FUNCTION);
				setState(483);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(481);
					match(IF);
					setState(482);
					match(EXISTS);
					}
					break;
				}
				setState(485);
				qualifiedName();
				setState(487);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(486);
					types();
					}
				}

				}
				break;
			case 27:
				_localctx = new CallContext(_localctx);
				enterOuterAlt(_localctx, 27);
				{
				setState(489);
				match(CALL);
				setState(490);
				qualifiedName();
				setState(491);
				match(T__1);
				setState(500);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << ADD) | (1L << ADMIN) | (1L << ALL) | (1L << ANALYZE) | (1L << ANY) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << BERNOULLI) | (1L << CALL) | (1L << CALLED) | (1L << CASCADE) | (1L << CASE) | (1L << CAST) | (1L << CATALOGS) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << CURRENT_DATE) | (1L << CURRENT_ROLE) | (1L << CURRENT_TIME) | (1L << CURRENT_TIMESTAMP) | (1L << CURRENT_USER) | (1L << DATA) | (1L << DATE) | (1L << DAY) | (1L << DEFINER) | (1L << DESC) | (1L << DETERMINISTIC) | (1L << DISTRIBUTED) | (1L << EXCLUDING) | (1L << EXISTS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (EXPLAIN - 64)) | (1L << (EXTRACT - 64)) | (1L << (EXTERNAL - 64)) | (1L << (FALSE - 64)) | (1L << (FETCH - 64)) | (1L << (FILTER - 64)) | (1L << (FIRST - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FORMAT - 64)) | (1L << (FUNCTION - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GRANT - 64)) | (1L << (GRANTED - 64)) | (1L << (GRANTS - 64)) | (1L << (GRAPHVIZ - 64)) | (1L << (GROUPING - 64)) | (1L << (GROUPS - 64)) | (1L << (HOUR - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (INCLUDING - 64)) | (1L << (INPUT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INVOKER - 64)) | (1L << (IO - 64)) | (1L << (ISOLATION - 64)) | (1L << (JSON - 64)) | (1L << (LANGUAGE - 64)) | (1L << (LAST - 64)) | (1L << (LATERAL - 64)) | (1L << (LEVEL - 64)) | (1L << (LIMIT - 64)) | (1L << (LOCALTIME - 64)) | (1L << (LOCALTIMESTAMP - 64)) | (1L << (LOGICAL - 64)) | (1L << (MAP - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MINUTE - 64)) | (1L << (MONTH - 64)) | (1L << (NAME - 64)) | (1L << (NFC - 64)) | (1L << (NFD - 64)) | (1L << (NFKC - 64)) | (1L << (NFKD - 64)) | (1L << (NO - 64)) | (1L << (NONE - 64)) | (1L << (NORMALIZE - 64)) | (1L << (NOT - 64)) | (1L << (NULL - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (NULLIF - 128)) | (1L << (NULLS - 128)) | (1L << (OFFSET - 128)) | (1L << (ONLY - 128)) | (1L << (OPTION - 128)) | (1L << (ORDINALITY - 128)) | (1L << (OUTPUT - 128)) | (1L << (OVER - 128)) | (1L << (PARTITION - 128)) | (1L << (PARTITIONS - 128)) | (1L << (POSITION - 128)) | (1L << (PRECEDING - 128)) | (1L << (PRIVILEGES - 128)) | (1L << (PROPERTIES - 128)) | (1L << (RANGE - 128)) | (1L << (READ - 128)) | (1L << (REFRESH - 128)) | (1L << (RENAME - 128)) | (1L << (REPEATABLE - 128)) | (1L << (REPLACE - 128)) | (1L << (RESET - 128)) | (1L << (RESPECT - 128)) | (1L << (RESTRICT - 128)) | (1L << (RETURN - 128)) | (1L << (RETURNS - 128)) | (1L << (REVOKE - 128)) | (1L << (ROLE - 128)) | (1L << (ROLES - 128)) | (1L << (ROLLBACK - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (SCHEMA - 128)) | (1L << (SCHEMAS - 128)) | (1L << (SECOND - 128)) | (1L << (SECURITY - 128)) | (1L << (SERIALIZABLE - 128)) | (1L << (SESSION - 128)) | (1L << (SET - 128)) | (1L << (SETS - 128)) | (1L << (SHOW - 128)) | (1L << (SOME - 128)) | (1L << (SQL - 128)) | (1L << (START - 128)) | (1L << (STATS - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLES - 128)) | (1L << (TABLESAMPLE - 128)) | (1L << (TEMPORARY - 128)) | (1L << (TEXT - 128)) | (1L << (TIME - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (TRANSACTION - 192)) | (1L << (TRUE - 192)) | (1L << (TRUNCATE - 192)) | (1L << (TRY_CAST - 192)) | (1L << (TYPE - 192)) | (1L << (UNBOUNDED - 192)) | (1L << (UNCOMMITTED - 192)) | (1L << (USE - 192)) | (1L << (USER - 192)) | (1L << (VALIDATE - 192)) | (1L << (VERBOSE - 192)) | (1L << (VIEW - 192)) | (1L << (WORK - 192)) | (1L << (WRITE - 192)) | (1L << (YEAR - 192)) | (1L << (ZONE - 192)) | (1L << (PLUS - 192)) | (1L << (MINUS - 192)) | (1L << (STRING - 192)) | (1L << (UNICODE_STRING - 192)) | (1L << (BINARY_LITERAL - 192)) | (1L << (INTEGER_VALUE - 192)) | (1L << (DECIMAL_VALUE - 192)) | (1L << (DOUBLE_VALUE - 192)) | (1L << (IDENTIFIER - 192)) | (1L << (DIGIT_IDENTIFIER - 192)) | (1L << (QUOTED_IDENTIFIER - 192)) | (1L << (BACKQUOTED_IDENTIFIER - 192)) | (1L << (DOUBLE_PRECISION - 192)))) != 0)) {
					{
					setState(492);
					callArgument();
					setState(497);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(493);
						match(T__3);
						setState(494);
						callArgument();
						}
						}
						setState(499);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(502);
				match(T__2);
				}
				break;
			case 28:
				_localctx = new CreateRoleContext(_localctx);
				enterOuterAlt(_localctx, 28);
				{
				setState(504);
				match(CREATE);
				setState(505);
				match(ROLE);
				setState(506);
				((CreateRoleContext)_localctx).name = identifier();
				setState(510);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(507);
					match(WITH);
					setState(508);
					match(ADMIN);
					setState(509);
					grantor();
					}
				}

				}
				break;
			case 29:
				_localctx = new DropRoleContext(_localctx);
				enterOuterAlt(_localctx, 29);
				{
				setState(512);
				match(DROP);
				setState(513);
				match(ROLE);
				setState(514);
				((DropRoleContext)_localctx).name = identifier();
				}
				break;
			case 30:
				_localctx = new GrantRolesContext(_localctx);
				enterOuterAlt(_localctx, 30);
				{
				setState(515);
				match(GRANT);
				setState(516);
				roles();
				setState(517);
				match(TO);
				setState(518);
				principal();
				setState(523);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(519);
					match(T__3);
					setState(520);
					principal();
					}
					}
					setState(525);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(529);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(526);
					match(WITH);
					setState(527);
					match(ADMIN);
					setState(528);
					match(OPTION);
					}
				}

				setState(534);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GRANTED) {
					{
					setState(531);
					match(GRANTED);
					setState(532);
					match(BY);
					setState(533);
					grantor();
					}
				}

				}
				break;
			case 31:
				_localctx = new RevokeRolesContext(_localctx);
				enterOuterAlt(_localctx, 31);
				{
				setState(536);
				match(REVOKE);
				setState(540);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(537);
					match(ADMIN);
					setState(538);
					match(OPTION);
					setState(539);
					match(FOR);
					}
					break;
				}
				setState(542);
				roles();
				setState(543);
				match(FROM);
				setState(544);
				principal();
				setState(549);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(545);
					match(T__3);
					setState(546);
					principal();
					}
					}
					setState(551);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(555);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GRANTED) {
					{
					setState(552);
					match(GRANTED);
					setState(553);
					match(BY);
					setState(554);
					grantor();
					}
				}

				}
				break;
			case 32:
				_localctx = new SetRoleContext(_localctx);
				enterOuterAlt(_localctx, 32);
				{
				setState(557);
				match(SET);
				setState(558);
				match(ROLE);
				setState(562);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
				case 1:
					{
					setState(559);
					match(ALL);
					}
					break;
				case 2:
					{
					setState(560);
					match(NONE);
					}
					break;
				case 3:
					{
					setState(561);
					((SetRoleContext)_localctx).role = identifier();
					}
					break;
				}
				}
				break;
			case 33:
				_localctx = new GrantContext(_localctx);
				enterOuterAlt(_localctx, 33);
				{
				setState(564);
				match(GRANT);
				setState(575);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
				case 1:
					{
					setState(565);
					privilege();
					setState(570);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(566);
						match(T__3);
						setState(567);
						privilege();
						}
						}
						setState(572);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(573);
					match(ALL);
					setState(574);
					match(PRIVILEGES);
					}
					break;
				}
				setState(577);
				match(ON);
				setState(579);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TABLE) {
					{
					setState(578);
					match(TABLE);
					}
				}

				setState(581);
				qualifiedName();
				setState(582);
				match(TO);
				setState(583);
				((GrantContext)_localctx).grantee = principal();
				setState(587);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(584);
					match(WITH);
					setState(585);
					match(GRANT);
					setState(586);
					match(OPTION);
					}
				}

				}
				break;
			case 34:
				_localctx = new RevokeContext(_localctx);
				enterOuterAlt(_localctx, 34);
				{
				setState(589);
				match(REVOKE);
				setState(593);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
				case 1:
					{
					setState(590);
					match(GRANT);
					setState(591);
					match(OPTION);
					setState(592);
					match(FOR);
					}
					break;
				}
				setState(605);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
				case 1:
					{
					setState(595);
					privilege();
					setState(600);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(596);
						match(T__3);
						setState(597);
						privilege();
						}
						}
						setState(602);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(603);
					match(ALL);
					setState(604);
					match(PRIVILEGES);
					}
					break;
				}
				setState(607);
				match(ON);
				setState(609);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TABLE) {
					{
					setState(608);
					match(TABLE);
					}
				}

				setState(611);
				qualifiedName();
				setState(612);
				match(FROM);
				setState(613);
				((RevokeContext)_localctx).grantee = principal();
				}
				break;
			case 35:
				_localctx = new ShowGrantsContext(_localctx);
				enterOuterAlt(_localctx, 35);
				{
				setState(615);
				match(SHOW);
				setState(616);
				match(GRANTS);
				setState(622);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(617);
					match(ON);
					setState(619);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==TABLE) {
						{
						setState(618);
						match(TABLE);
						}
					}

					setState(621);
					qualifiedName();
					}
				}

				}
				break;
			case 36:
				_localctx = new ExplainContext(_localctx);
				enterOuterAlt(_localctx, 36);
				{
				setState(624);
				match(EXPLAIN);
				setState(626);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
				case 1:
					{
					setState(625);
					match(ANALYZE);
					}
					break;
				}
				setState(629);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VERBOSE) {
					{
					setState(628);
					match(VERBOSE);
					}
				}

				setState(642);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
				case 1:
					{
					setState(631);
					match(T__1);
					setState(632);
					explainOption();
					setState(637);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(633);
						match(T__3);
						setState(634);
						explainOption();
						}
						}
						setState(639);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(640);
					match(T__2);
					}
					break;
				}
				setState(644);
				statement();
				}
				break;
			case 37:
				_localctx = new ShowCreateTableContext(_localctx);
				enterOuterAlt(_localctx, 37);
				{
				setState(645);
				match(SHOW);
				setState(646);
				match(CREATE);
				setState(647);
				match(TABLE);
				setState(648);
				qualifiedName();
				}
				break;
			case 38:
				_localctx = new ShowCreateViewContext(_localctx);
				enterOuterAlt(_localctx, 38);
				{
				setState(649);
				match(SHOW);
				setState(650);
				match(CREATE);
				setState(651);
				match(VIEW);
				setState(652);
				qualifiedName();
				}
				break;
			case 39:
				_localctx = new ShowCreateMaterializedViewContext(_localctx);
				enterOuterAlt(_localctx, 39);
				{
				setState(653);
				match(SHOW);
				setState(654);
				match(CREATE);
				setState(655);
				match(MATERIALIZED);
				setState(656);
				match(VIEW);
				setState(657);
				qualifiedName();
				}
				break;
			case 40:
				_localctx = new ShowCreateFunctionContext(_localctx);
				enterOuterAlt(_localctx, 40);
				{
				setState(658);
				match(SHOW);
				setState(659);
				match(CREATE);
				setState(660);
				match(FUNCTION);
				setState(661);
				qualifiedName();
				setState(663);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(662);
					types();
					}
				}

				}
				break;
			case 41:
				_localctx = new ShowTablesContext(_localctx);
				enterOuterAlt(_localctx, 41);
				{
				setState(665);
				match(SHOW);
				setState(666);
				match(TABLES);
				setState(669);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(667);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(668);
					qualifiedName();
					}
				}

				setState(677);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE) {
					{
					setState(671);
					match(LIKE);
					setState(672);
					((ShowTablesContext)_localctx).pattern = string();
					setState(675);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ESCAPE) {
						{
						setState(673);
						match(ESCAPE);
						setState(674);
						((ShowTablesContext)_localctx).escape = string();
						}
					}

					}
				}

				}
				break;
			case 42:
				_localctx = new ShowSchemasContext(_localctx);
				enterOuterAlt(_localctx, 42);
				{
				setState(679);
				match(SHOW);
				setState(680);
				match(SCHEMAS);
				setState(683);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(681);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(682);
					identifier();
					}
				}

				setState(691);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE) {
					{
					setState(685);
					match(LIKE);
					setState(686);
					((ShowSchemasContext)_localctx).pattern = string();
					setState(689);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ESCAPE) {
						{
						setState(687);
						match(ESCAPE);
						setState(688);
						((ShowSchemasContext)_localctx).escape = string();
						}
					}

					}
				}

				}
				break;
			case 43:
				_localctx = new ShowCatalogsContext(_localctx);
				enterOuterAlt(_localctx, 43);
				{
				setState(693);
				match(SHOW);
				setState(694);
				match(CATALOGS);
				setState(701);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE) {
					{
					setState(695);
					match(LIKE);
					setState(696);
					((ShowCatalogsContext)_localctx).pattern = string();
					setState(699);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ESCAPE) {
						{
						setState(697);
						match(ESCAPE);
						setState(698);
						((ShowCatalogsContext)_localctx).escape = string();
						}
					}

					}
				}

				}
				break;
			case 44:
				_localctx = new ShowColumnsContext(_localctx);
				enterOuterAlt(_localctx, 44);
				{
				setState(703);
				match(SHOW);
				setState(704);
				match(COLUMNS);
				setState(705);
				_la = _input.LA(1);
				if ( !(_la==FROM || _la==IN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(706);
				qualifiedName();
				}
				break;
			case 45:
				_localctx = new ShowStatsContext(_localctx);
				enterOuterAlt(_localctx, 45);
				{
				setState(707);
				match(SHOW);
				setState(708);
				match(STATS);
				setState(709);
				match(FOR);
				setState(710);
				qualifiedName();
				}
				break;
			case 46:
				_localctx = new ShowStatsForQueryContext(_localctx);
				enterOuterAlt(_localctx, 46);
				{
				setState(711);
				match(SHOW);
				setState(712);
				match(STATS);
				setState(713);
				match(FOR);
				setState(714);
				match(T__1);
				setState(715);
				querySpecification();
				setState(716);
				match(T__2);
				}
				break;
			case 47:
				_localctx = new ShowRolesContext(_localctx);
				enterOuterAlt(_localctx, 47);
				{
				setState(718);
				match(SHOW);
				setState(720);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CURRENT) {
					{
					setState(719);
					match(CURRENT);
					}
				}

				setState(722);
				match(ROLES);
				setState(725);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(723);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(724);
					identifier();
					}
				}

				}
				break;
			case 48:
				_localctx = new ShowRoleGrantsContext(_localctx);
				enterOuterAlt(_localctx, 48);
				{
				setState(727);
				match(SHOW);
				setState(728);
				match(ROLE);
				setState(729);
				match(GRANTS);
				setState(732);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(730);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(731);
					identifier();
					}
				}

				}
				break;
			case 49:
				_localctx = new ShowColumnsContext(_localctx);
				enterOuterAlt(_localctx, 49);
				{
				setState(734);
				match(DESCRIBE);
				setState(735);
				qualifiedName();
				}
				break;
			case 50:
				_localctx = new ShowColumnsContext(_localctx);
				enterOuterAlt(_localctx, 50);
				{
				setState(736);
				match(DESC);
				setState(737);
				qualifiedName();
				}
				break;
			case 51:
				_localctx = new ShowFunctionsContext(_localctx);
				enterOuterAlt(_localctx, 51);
				{
				setState(738);
				match(SHOW);
				setState(739);
				match(FUNCTIONS);
				setState(746);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE) {
					{
					setState(740);
					match(LIKE);
					setState(741);
					((ShowFunctionsContext)_localctx).pattern = string();
					setState(744);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ESCAPE) {
						{
						setState(742);
						match(ESCAPE);
						setState(743);
						((ShowFunctionsContext)_localctx).escape = string();
						}
					}

					}
				}

				}
				break;
			case 52:
				_localctx = new ShowSessionContext(_localctx);
				enterOuterAlt(_localctx, 52);
				{
				setState(748);
				match(SHOW);
				setState(749);
				match(SESSION);
				setState(756);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE) {
					{
					setState(750);
					match(LIKE);
					setState(751);
					((ShowSessionContext)_localctx).pattern = string();
					setState(754);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ESCAPE) {
						{
						setState(752);
						match(ESCAPE);
						setState(753);
						((ShowSessionContext)_localctx).escape = string();
						}
					}

					}
				}

				}
				break;
			case 53:
				_localctx = new SetSessionContext(_localctx);
				enterOuterAlt(_localctx, 53);
				{
				setState(758);
				match(SET);
				setState(759);
				match(SESSION);
				setState(760);
				qualifiedName();
				setState(761);
				match(EQ);
				setState(762);
				expression();
				}
				break;
			case 54:
				_localctx = new ResetSessionContext(_localctx);
				enterOuterAlt(_localctx, 54);
				{
				setState(764);
				match(RESET);
				setState(765);
				match(SESSION);
				setState(766);
				qualifiedName();
				}
				break;
			case 55:
				_localctx = new StartTransactionContext(_localctx);
				enterOuterAlt(_localctx, 55);
				{
				setState(767);
				match(START);
				setState(768);
				match(TRANSACTION);
				setState(777);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ISOLATION || _la==READ) {
					{
					setState(769);
					transactionMode();
					setState(774);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(770);
						match(T__3);
						setState(771);
						transactionMode();
						}
						}
						setState(776);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				break;
			case 56:
				_localctx = new CommitContext(_localctx);
				enterOuterAlt(_localctx, 56);
				{
				setState(779);
				match(COMMIT);
				setState(781);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WORK) {
					{
					setState(780);
					match(WORK);
					}
				}

				}
				break;
			case 57:
				_localctx = new RollbackContext(_localctx);
				enterOuterAlt(_localctx, 57);
				{
				setState(783);
				match(ROLLBACK);
				setState(785);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WORK) {
					{
					setState(784);
					match(WORK);
					}
				}

				}
				break;
			case 58:
				_localctx = new PrepareContext(_localctx);
				enterOuterAlt(_localctx, 58);
				{
				setState(787);
				match(PREPARE);
				setState(788);
				identifier();
				setState(789);
				match(FROM);
				setState(790);
				statement();
				}
				break;
			case 59:
				_localctx = new DeallocateContext(_localctx);
				enterOuterAlt(_localctx, 59);
				{
				setState(792);
				match(DEALLOCATE);
				setState(793);
				match(PREPARE);
				setState(794);
				identifier();
				}
				break;
			case 60:
				_localctx = new ExecuteContext(_localctx);
				enterOuterAlt(_localctx, 60);
				{
				setState(795);
				match(EXECUTE);
				setState(796);
				identifier();
				setState(806);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(797);
					match(USING);
					setState(798);
					expression();
					setState(803);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(799);
						match(T__3);
						setState(800);
						expression();
						}
						}
						setState(805);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				break;
			case 61:
				_localctx = new DescribeInputContext(_localctx);
				enterOuterAlt(_localctx, 61);
				{
				setState(808);
				match(DESCRIBE);
				setState(809);
				match(INPUT);
				setState(810);
				identifier();
				}
				break;
			case 62:
				_localctx = new DescribeOutputContext(_localctx);
				enterOuterAlt(_localctx, 62);
				{
				setState(811);
				match(DESCRIBE);
				setState(812);
				match(OUTPUT);
				setState(813);
				identifier();
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

	public static class QueryContext extends ParserRuleContext {
		public QueryNoWithContext queryNoWith() {
			return getRuleContext(QueryNoWithContext.class,0);
		}
		public WithContext with() {
			return getRuleContext(WithContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(817);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(816);
				with();
				}
			}

			setState(819);
			queryNoWith();
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

	public static class WithContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public List<NamedQueryContext> namedQuery() {
			return getRuleContexts(NamedQueryContext.class);
		}
		public NamedQueryContext namedQuery(int i) {
			return getRuleContext(NamedQueryContext.class,i);
		}
		public TerminalNode RECURSIVE() { return getToken(SqlBaseParser.RECURSIVE, 0); }
		public WithContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterWith(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitWith(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitWith(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WithContext with() throws RecognitionException {
		WithContext _localctx = new WithContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_with);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(821);
			match(WITH);
			setState(823);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RECURSIVE) {
				{
				setState(822);
				match(RECURSIVE);
				}
			}

			setState(825);
			namedQuery();
			setState(830);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(826);
				match(T__3);
				setState(827);
				namedQuery();
				}
				}
				setState(832);
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

	public static class TableElementContext extends ParserRuleContext {
		public ColumnDefinitionContext columnDefinition() {
			return getRuleContext(ColumnDefinitionContext.class,0);
		}
		public LikeClauseContext likeClause() {
			return getRuleContext(LikeClauseContext.class,0);
		}
		public TableElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableElementContext tableElement() throws RecognitionException {
		TableElementContext _localctx = new TableElementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tableElement);
		try {
			setState(835);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case ADMIN:
			case ALL:
			case ANALYZE:
			case ANY:
			case ARRAY:
			case ASC:
			case AT:
			case BERNOULLI:
			case CALL:
			case CALLED:
			case CASCADE:
			case CATALOGS:
			case COLUMN:
			case COLUMNS:
			case COMMENT:
			case COMMIT:
			case COMMITTED:
			case CURRENT:
			case CURRENT_ROLE:
			case DATA:
			case DATE:
			case DAY:
			case DEFINER:
			case DESC:
			case DETERMINISTIC:
			case DISTRIBUTED:
			case EXCLUDING:
			case EXPLAIN:
			case EXTERNAL:
			case FETCH:
			case FILTER:
			case FIRST:
			case FOLLOWING:
			case FORMAT:
			case FUNCTION:
			case FUNCTIONS:
			case GRANT:
			case GRANTED:
			case GRANTS:
			case GRAPHVIZ:
			case GROUPS:
			case HOUR:
			case IF:
			case IGNORE:
			case INCLUDING:
			case INPUT:
			case INTERVAL:
			case INVOKER:
			case IO:
			case ISOLATION:
			case JSON:
			case LANGUAGE:
			case LAST:
			case LATERAL:
			case LEVEL:
			case LIMIT:
			case LOGICAL:
			case MAP:
			case MATERIALIZED:
			case MINUTE:
			case MONTH:
			case NAME:
			case NFC:
			case NFD:
			case NFKC:
			case NFKD:
			case NO:
			case NONE:
			case NULLIF:
			case NULLS:
			case OFFSET:
			case ONLY:
			case OPTION:
			case ORDINALITY:
			case OUTPUT:
			case OVER:
			case PARTITION:
			case PARTITIONS:
			case POSITION:
			case PRECEDING:
			case PRIVILEGES:
			case PROPERTIES:
			case RANGE:
			case READ:
			case REFRESH:
			case RENAME:
			case REPEATABLE:
			case REPLACE:
			case RESET:
			case RESPECT:
			case RESTRICT:
			case RETURN:
			case RETURNS:
			case REVOKE:
			case ROLE:
			case ROLES:
			case ROLLBACK:
			case ROW:
			case ROWS:
			case SCHEMA:
			case SCHEMAS:
			case SECOND:
			case SECURITY:
			case SERIALIZABLE:
			case SESSION:
			case SET:
			case SETS:
			case SHOW:
			case SOME:
			case SQL:
			case START:
			case STATS:
			case SUBSTRING:
			case SYSTEM:
			case TABLES:
			case TABLESAMPLE:
			case TEMPORARY:
			case TEXT:
			case TIME:
			case TIMESTAMP:
			case TO:
			case TRANSACTION:
			case TRUNCATE:
			case TRY_CAST:
			case TYPE:
			case UNBOUNDED:
			case UNCOMMITTED:
			case USE:
			case USER:
			case VALIDATE:
			case VERBOSE:
			case VIEW:
			case WORK:
			case WRITE:
			case YEAR:
			case ZONE:
			case IDENTIFIER:
			case DIGIT_IDENTIFIER:
			case QUOTED_IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(833);
				columnDefinition();
				}
				break;
			case LIKE:
				enterOuterAlt(_localctx, 2);
				{
				setState(834);
				likeClause();
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

	public static class ColumnDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public PropertiesContext properties() {
			return getRuleContext(PropertiesContext.class,0);
		}
		public ColumnDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterColumnDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitColumnDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitColumnDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnDefinitionContext columnDefinition() throws RecognitionException {
		ColumnDefinitionContext _localctx = new ColumnDefinitionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_columnDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(837);
			identifier();
			setState(838);
			type(0);
			setState(841);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(839);
				match(NOT);
				setState(840);
				match(NULL);
				}
			}

			setState(845);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(843);
				match(COMMENT);
				setState(844);
				string();
				}
			}

			setState(849);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(847);
				match(WITH);
				setState(848);
				properties();
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

	public static class LikeClauseContext extends ParserRuleContext {
		public Token optionType;
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode PROPERTIES() { return getToken(SqlBaseParser.PROPERTIES, 0); }
		public TerminalNode INCLUDING() { return getToken(SqlBaseParser.INCLUDING, 0); }
		public TerminalNode EXCLUDING() { return getToken(SqlBaseParser.EXCLUDING, 0); }
		public LikeClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_likeClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLikeClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLikeClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLikeClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LikeClauseContext likeClause() throws RecognitionException {
		LikeClauseContext _localctx = new LikeClauseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_likeClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(851);
			match(LIKE);
			setState(852);
			qualifiedName();
			setState(855);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXCLUDING || _la==INCLUDING) {
				{
				setState(853);
				((LikeClauseContext)_localctx).optionType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==EXCLUDING || _la==INCLUDING) ) {
					((LikeClauseContext)_localctx).optionType = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(854);
				match(PROPERTIES);
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

	public static class PropertiesContext extends ParserRuleContext {
		public List<PropertyContext> property() {
			return getRuleContexts(PropertyContext.class);
		}
		public PropertyContext property(int i) {
			return getRuleContext(PropertyContext.class,i);
		}
		public PropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_properties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertiesContext properties() throws RecognitionException {
		PropertiesContext _localctx = new PropertiesContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_properties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(857);
			match(T__1);
			setState(858);
			property();
			setState(863);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(859);
				match(T__3);
				setState(860);
				property();
				}
				}
				setState(865);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(866);
			match(T__2);
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

	public static class PropertyContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_property);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(868);
			identifier();
			setState(869);
			match(EQ);
			setState(870);
			expression();
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

	public static class SqlParameterDeclarationContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public SqlParameterDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlParameterDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSqlParameterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSqlParameterDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSqlParameterDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlParameterDeclarationContext sqlParameterDeclaration() throws RecognitionException {
		SqlParameterDeclarationContext _localctx = new SqlParameterDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_sqlParameterDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(872);
			identifier();
			setState(873);
			type(0);
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

	public static class RoutineCharacteristicsContext extends ParserRuleContext {
		public List<RoutineCharacteristicContext> routineCharacteristic() {
			return getRuleContexts(RoutineCharacteristicContext.class);
		}
		public RoutineCharacteristicContext routineCharacteristic(int i) {
			return getRuleContext(RoutineCharacteristicContext.class,i);
		}
		public RoutineCharacteristicsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routineCharacteristics; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRoutineCharacteristics(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRoutineCharacteristics(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRoutineCharacteristics(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RoutineCharacteristicsContext routineCharacteristics() throws RecognitionException {
		RoutineCharacteristicsContext _localctx = new RoutineCharacteristicsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_routineCharacteristics);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(878);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CALLED || _la==DETERMINISTIC || ((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (LANGUAGE - 103)) | (1L << (NOT - 103)) | (1L << (RETURNS - 103)))) != 0)) {
				{
				{
				setState(875);
				routineCharacteristic();
				}
				}
				setState(880);
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

	public static class RoutineCharacteristicContext extends ParserRuleContext {
		public TerminalNode LANGUAGE() { return getToken(SqlBaseParser.LANGUAGE, 0); }
		public LanguageContext language() {
			return getRuleContext(LanguageContext.class,0);
		}
		public DeterminismContext determinism() {
			return getRuleContext(DeterminismContext.class,0);
		}
		public NullCallClauseContext nullCallClause() {
			return getRuleContext(NullCallClauseContext.class,0);
		}
		public RoutineCharacteristicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routineCharacteristic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRoutineCharacteristic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRoutineCharacteristic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRoutineCharacteristic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RoutineCharacteristicContext routineCharacteristic() throws RecognitionException {
		RoutineCharacteristicContext _localctx = new RoutineCharacteristicContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_routineCharacteristic);
		try {
			setState(885);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LANGUAGE:
				enterOuterAlt(_localctx, 1);
				{
				setState(881);
				match(LANGUAGE);
				setState(882);
				language();
				}
				break;
			case DETERMINISTIC:
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(883);
				determinism();
				}
				break;
			case CALLED:
			case RETURNS:
				enterOuterAlt(_localctx, 3);
				{
				setState(884);
				nullCallClause();
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

	public static class AlterRoutineCharacteristicsContext extends ParserRuleContext {
		public List<AlterRoutineCharacteristicContext> alterRoutineCharacteristic() {
			return getRuleContexts(AlterRoutineCharacteristicContext.class);
		}
		public AlterRoutineCharacteristicContext alterRoutineCharacteristic(int i) {
			return getRuleContext(AlterRoutineCharacteristicContext.class,i);
		}
		public AlterRoutineCharacteristicsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterRoutineCharacteristics; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAlterRoutineCharacteristics(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAlterRoutineCharacteristics(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAlterRoutineCharacteristics(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterRoutineCharacteristicsContext alterRoutineCharacteristics() throws RecognitionException {
		AlterRoutineCharacteristicsContext _localctx = new AlterRoutineCharacteristicsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_alterRoutineCharacteristics);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(890);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CALLED || _la==RETURNS) {
				{
				{
				setState(887);
				alterRoutineCharacteristic();
				}
				}
				setState(892);
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

	public static class AlterRoutineCharacteristicContext extends ParserRuleContext {
		public NullCallClauseContext nullCallClause() {
			return getRuleContext(NullCallClauseContext.class,0);
		}
		public AlterRoutineCharacteristicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterRoutineCharacteristic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAlterRoutineCharacteristic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAlterRoutineCharacteristic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAlterRoutineCharacteristic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterRoutineCharacteristicContext alterRoutineCharacteristic() throws RecognitionException {
		AlterRoutineCharacteristicContext _localctx = new AlterRoutineCharacteristicContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_alterRoutineCharacteristic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(893);
			nullCallClause();
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

	public static class RoutineBodyContext extends ParserRuleContext {
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public ExternalBodyReferenceContext externalBodyReference() {
			return getRuleContext(ExternalBodyReferenceContext.class,0);
		}
		public RoutineBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routineBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRoutineBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRoutineBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRoutineBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RoutineBodyContext routineBody() throws RecognitionException {
		RoutineBodyContext _localctx = new RoutineBodyContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_routineBody);
		try {
			setState(897);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURN:
				enterOuterAlt(_localctx, 1);
				{
				setState(895);
				returnStatement();
				}
				break;
			case EXTERNAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(896);
				externalBodyReference();
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(SqlBaseParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(899);
			match(RETURN);
			setState(900);
			expression();
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

	public static class ExternalBodyReferenceContext extends ParserRuleContext {
		public TerminalNode EXTERNAL() { return getToken(SqlBaseParser.EXTERNAL, 0); }
		public TerminalNode NAME() { return getToken(SqlBaseParser.NAME, 0); }
		public ExternalRoutineNameContext externalRoutineName() {
			return getRuleContext(ExternalRoutineNameContext.class,0);
		}
		public ExternalBodyReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externalBodyReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExternalBodyReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExternalBodyReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExternalBodyReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExternalBodyReferenceContext externalBodyReference() throws RecognitionException {
		ExternalBodyReferenceContext _localctx = new ExternalBodyReferenceContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_externalBodyReference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(902);
			match(EXTERNAL);
			setState(905);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(903);
				match(NAME);
				setState(904);
				externalRoutineName();
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

	public static class LanguageContext extends ParserRuleContext {
		public TerminalNode SQL() { return getToken(SqlBaseParser.SQL, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public LanguageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_language; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLanguage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLanguage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLanguage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LanguageContext language() throws RecognitionException {
		LanguageContext _localctx = new LanguageContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_language);
		try {
			setState(909);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(907);
				match(SQL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(908);
				identifier();
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

	public static class DeterminismContext extends ParserRuleContext {
		public TerminalNode DETERMINISTIC() { return getToken(SqlBaseParser.DETERMINISTIC, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public DeterminismContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_determinism; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDeterminism(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDeterminism(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDeterminism(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeterminismContext determinism() throws RecognitionException {
		DeterminismContext _localctx = new DeterminismContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_determinism);
		try {
			setState(914);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DETERMINISTIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(911);
				match(DETERMINISTIC);
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(912);
				match(NOT);
				setState(913);
				match(DETERMINISTIC);
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

	public static class NullCallClauseContext extends ParserRuleContext {
		public TerminalNode RETURNS() { return getToken(SqlBaseParser.RETURNS, 0); }
		public List<TerminalNode> NULL() { return getTokens(SqlBaseParser.NULL); }
		public TerminalNode NULL(int i) {
			return getToken(SqlBaseParser.NULL, i);
		}
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public TerminalNode INPUT() { return getToken(SqlBaseParser.INPUT, 0); }
		public TerminalNode CALLED() { return getToken(SqlBaseParser.CALLED, 0); }
		public NullCallClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullCallClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNullCallClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNullCallClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNullCallClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NullCallClauseContext nullCallClause() throws RecognitionException {
		NullCallClauseContext _localctx = new NullCallClauseContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_nullCallClause);
		try {
			setState(925);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURNS:
				enterOuterAlt(_localctx, 1);
				{
				setState(916);
				match(RETURNS);
				setState(917);
				match(NULL);
				setState(918);
				match(ON);
				setState(919);
				match(NULL);
				setState(920);
				match(INPUT);
				}
				break;
			case CALLED:
				enterOuterAlt(_localctx, 2);
				{
				setState(921);
				match(CALLED);
				setState(922);
				match(ON);
				setState(923);
				match(NULL);
				setState(924);
				match(INPUT);
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

	public static class ExternalRoutineNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExternalRoutineNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externalRoutineName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExternalRoutineName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExternalRoutineName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExternalRoutineName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExternalRoutineNameContext externalRoutineName() throws RecognitionException {
		ExternalRoutineNameContext _localctx = new ExternalRoutineNameContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_externalRoutineName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(927);
			identifier();
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

	public static class QueryNoWithContext extends ParserRuleContext {
		public Token offset;
		public Token limit;
		public Token fetchFirstNRows;
		public QueryTermContext queryTerm() {
			return getRuleContext(QueryTermContext.class,0);
		}
		public TerminalNode ORDER() { return getToken(SqlBaseParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public TerminalNode OFFSET() { return getToken(SqlBaseParser.OFFSET, 0); }
		public List<TerminalNode> INTEGER_VALUE() { return getTokens(SqlBaseParser.INTEGER_VALUE); }
		public TerminalNode INTEGER_VALUE(int i) {
			return getToken(SqlBaseParser.INTEGER_VALUE, i);
		}
		public TerminalNode LIMIT() { return getToken(SqlBaseParser.LIMIT, 0); }
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public List<TerminalNode> ROWS() { return getTokens(SqlBaseParser.ROWS); }
		public TerminalNode ROWS(int i) {
			return getToken(SqlBaseParser.ROWS, i);
		}
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public TerminalNode FETCH() { return getToken(SqlBaseParser.FETCH, 0); }
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public TerminalNode ONLY() { return getToken(SqlBaseParser.ONLY, 0); }
		public QueryNoWithContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryNoWith; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQueryNoWith(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQueryNoWith(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQueryNoWith(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryNoWithContext queryNoWith() throws RecognitionException {
		QueryNoWithContext _localctx = new QueryNoWithContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_queryNoWith);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(929);
			queryTerm(0);
			setState(940);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(930);
				match(ORDER);
				setState(931);
				match(BY);
				setState(932);
				sortItem();
				setState(937);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(933);
					match(T__3);
					setState(934);
					sortItem();
					}
					}
					setState(939);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(947);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OFFSET) {
				{
				setState(942);
				match(OFFSET);
				setState(943);
				((QueryNoWithContext)_localctx).offset = match(INTEGER_VALUE);
				setState(945);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ROW || _la==ROWS) {
					{
					setState(944);
					_la = _input.LA(1);
					if ( !(_la==ROW || _la==ROWS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
			}

			setState(958);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				{
				setState(956);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LIMIT:
					{
					setState(949);
					match(LIMIT);
					setState(950);
					((QueryNoWithContext)_localctx).limit = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==ALL || _la==INTEGER_VALUE) ) {
						((QueryNoWithContext)_localctx).limit = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				case FETCH:
					{
					{
					setState(951);
					match(FETCH);
					setState(952);
					match(FIRST);
					setState(953);
					((QueryNoWithContext)_localctx).fetchFirstNRows = match(INTEGER_VALUE);
					setState(954);
					match(ROWS);
					setState(955);
					match(ONLY);
					}
					}
					break;
				case EOF:
				case T__2:
				case WITH:
					break;
				default:
					break;
				}
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

	public static class QueryTermContext extends ParserRuleContext {
		public QueryTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryTerm; }
	 
		public QueryTermContext() { }
		public void copyFrom(QueryTermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class QueryTermDefaultContext extends QueryTermContext {
		public QueryPrimaryContext queryPrimary() {
			return getRuleContext(QueryPrimaryContext.class,0);
		}
		public QueryTermDefaultContext(QueryTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQueryTermDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQueryTermDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQueryTermDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetOperationContext extends QueryTermContext {
		public QueryTermContext left;
		public Token operator;
		public QueryTermContext right;
		public List<QueryTermContext> queryTerm() {
			return getRuleContexts(QueryTermContext.class);
		}
		public QueryTermContext queryTerm(int i) {
			return getRuleContext(QueryTermContext.class,i);
		}
		public TerminalNode INTERSECT() { return getToken(SqlBaseParser.INTERSECT, 0); }
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public TerminalNode UNION() { return getToken(SqlBaseParser.UNION, 0); }
		public TerminalNode EXCEPT() { return getToken(SqlBaseParser.EXCEPT, 0); }
		public SetOperationContext(QueryTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryTermContext queryTerm() throws RecognitionException {
		return queryTerm(0);
	}

	private QueryTermContext queryTerm(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		QueryTermContext _localctx = new QueryTermContext(_ctx, _parentState);
		QueryTermContext _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_queryTerm, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new QueryTermDefaultContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(961);
			queryPrimary();
			}
			_ctx.stop = _input.LT(-1);
			setState(977);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(975);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
					case 1:
						{
						_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
						((SetOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
						setState(963);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(964);
						((SetOperationContext)_localctx).operator = match(INTERSECT);
						setState(966);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ALL || _la==DISTINCT) {
							{
							setState(965);
							setQuantifier();
							}
						}

						setState(968);
						((SetOperationContext)_localctx).right = queryTerm(3);
						}
						break;
					case 2:
						{
						_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
						((SetOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
						setState(969);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(970);
						((SetOperationContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EXCEPT || _la==UNION) ) {
							((SetOperationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(972);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ALL || _la==DISTINCT) {
							{
							setState(971);
							setQuantifier();
							}
						}

						setState(974);
						((SetOperationContext)_localctx).right = queryTerm(2);
						}
						break;
					}
					} 
				}
				setState(979);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class QueryPrimaryContext extends ParserRuleContext {
		public QueryPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryPrimary; }
	 
		public QueryPrimaryContext() { }
		public void copyFrom(QueryPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SubqueryContext extends QueryPrimaryContext {
		public QueryNoWithContext queryNoWith() {
			return getRuleContext(QueryNoWithContext.class,0);
		}
		public SubqueryContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSubquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSubquery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class QueryPrimaryDefaultContext extends QueryPrimaryContext {
		public QuerySpecificationContext querySpecification() {
			return getRuleContext(QuerySpecificationContext.class,0);
		}
		public QueryPrimaryDefaultContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQueryPrimaryDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQueryPrimaryDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQueryPrimaryDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableContext extends QueryPrimaryContext {
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TableContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InlineTableContext extends QueryPrimaryContext {
		public TerminalNode VALUES() { return getToken(SqlBaseParser.VALUES, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public InlineTableContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInlineTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInlineTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInlineTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryPrimaryContext queryPrimary() throws RecognitionException {
		QueryPrimaryContext _localctx = new QueryPrimaryContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_queryPrimary);
		try {
			int _alt;
			setState(996);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				_localctx = new QueryPrimaryDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(980);
				querySpecification();
				}
				break;
			case TABLE:
				_localctx = new TableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(981);
				match(TABLE);
				setState(982);
				qualifiedName();
				}
				break;
			case VALUES:
				_localctx = new InlineTableContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(983);
				match(VALUES);
				setState(984);
				expression();
				setState(989);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(985);
						match(T__3);
						setState(986);
						expression();
						}
						} 
					}
					setState(991);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
				}
				}
				break;
			case T__1:
				_localctx = new SubqueryContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(992);
				match(T__1);
				setState(993);
				queryNoWith();
				setState(994);
				match(T__2);
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

	public static class SortItemContext extends ParserRuleContext {
		public Token ordering;
		public Token nullOrdering;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public TerminalNode ASC() { return getToken(SqlBaseParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public TerminalNode LAST() { return getToken(SqlBaseParser.LAST, 0); }
		public SortItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSortItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSortItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSortItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SortItemContext sortItem() throws RecognitionException {
		SortItemContext _localctx = new SortItemContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_sortItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(998);
			expression();
			setState(1000);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(999);
				((SortItemContext)_localctx).ordering = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((SortItemContext)_localctx).ordering = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1004);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NULLS) {
				{
				setState(1002);
				match(NULLS);
				setState(1003);
				((SortItemContext)_localctx).nullOrdering = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FIRST || _la==LAST) ) {
					((SortItemContext)_localctx).nullOrdering = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static class QuerySpecificationContext extends ParserRuleContext {
		public SelectClauseContext selectClause() {
			return getRuleContext(SelectClauseContext.class,0);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public GroupByClauseContext groupByClause() {
			return getRuleContext(GroupByClauseContext.class,0);
		}
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public QuerySpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_querySpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQuerySpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQuerySpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQuerySpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuerySpecificationContext querySpecification() throws RecognitionException {
		QuerySpecificationContext _localctx = new QuerySpecificationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_querySpecification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1006);
			selectClause();
			setState(1008);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				{
				setState(1007);
				fromClause();
				}
				break;
			}
			setState(1011);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				{
				setState(1010);
				whereClause();
				}
				break;
			}
			setState(1014);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				{
				setState(1013);
				groupByClause();
				}
				break;
			}
			setState(1017);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				{
				setState(1016);
				havingClause();
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

	public static class SelectClauseContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(SqlBaseParser.SELECT, 0); }
		public List<SelectItemContext> selectItem() {
			return getRuleContexts(SelectItemContext.class);
		}
		public SelectItemContext selectItem(int i) {
			return getRuleContext(SelectItemContext.class,i);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public SelectClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSelectClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSelectClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSelectClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectClauseContext selectClause() throws RecognitionException {
		SelectClauseContext _localctx = new SelectClauseContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_selectClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1019);
			match(SELECT);
			setState(1021);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				{
				setState(1020);
				setQuantifier();
				}
				break;
			}
			setState(1023);
			selectItem();
			setState(1028);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,128,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1024);
					match(T__3);
					setState(1025);
					selectItem();
					}
					} 
				}
				setState(1030);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,128,_ctx);
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

	public static class FromClauseContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}
		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class,i);
		}
		public FromClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFromClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFromClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFromClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_fromClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1031);
			match(FROM);
			setState(1032);
			relation(0);
			setState(1037);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1033);
					match(T__3);
					setState(1034);
					relation(0);
					}
					} 
				}
				setState(1039);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
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

	public static class WhereClauseContext extends ParserRuleContext {
		public BooleanExpressionContext where;
		public TerminalNode WHERE() { return getToken(SqlBaseParser.WHERE, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitWhereClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1040);
			match(WHERE);
			setState(1041);
			((WhereClauseContext)_localctx).where = booleanExpression(0);
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

	public static class GroupByClauseContext extends ParserRuleContext {
		public TerminalNode GROUP() { return getToken(SqlBaseParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public List<GroupingElementContext> groupingElement() {
			return getRuleContexts(GroupingElementContext.class);
		}
		public GroupingElementContext groupingElement(int i) {
			return getRuleContext(GroupingElementContext.class,i);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public GroupByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterGroupByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitGroupByClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitGroupByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupByClauseContext groupByClause() throws RecognitionException {
		GroupByClauseContext _localctx = new GroupByClauseContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_groupByClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1043);
			match(GROUP);
			setState(1044);
			match(BY);
			setState(1046);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
			case 1:
				{
				setState(1045);
				setQuantifier();
				}
				break;
			}
			setState(1048);
			groupingElement();
			setState(1053);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1049);
					match(T__3);
					setState(1050);
					groupingElement();
					}
					} 
				}
				setState(1055);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
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

	public static class HavingClauseContext extends ParserRuleContext {
		public BooleanExpressionContext having;
		public TerminalNode HAVING() { return getToken(SqlBaseParser.HAVING, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public HavingClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_havingClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterHavingClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitHavingClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitHavingClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HavingClauseContext havingClause() throws RecognitionException {
		HavingClauseContext _localctx = new HavingClauseContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_havingClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1056);
			match(HAVING);
			setState(1057);
			((HavingClauseContext)_localctx).having = booleanExpression(0);
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

	public static class GroupingElementContext extends ParserRuleContext {
		public GroupingElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupingElement; }
	 
		public GroupingElementContext() { }
		public void copyFrom(GroupingElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultipleGroupingSetsContext extends GroupingElementContext {
		public TerminalNode GROUPING() { return getToken(SqlBaseParser.GROUPING, 0); }
		public TerminalNode SETS() { return getToken(SqlBaseParser.SETS, 0); }
		public List<GroupingSetContext> groupingSet() {
			return getRuleContexts(GroupingSetContext.class);
		}
		public GroupingSetContext groupingSet(int i) {
			return getRuleContext(GroupingSetContext.class,i);
		}
		public MultipleGroupingSetsContext(GroupingElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterMultipleGroupingSets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitMultipleGroupingSets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitMultipleGroupingSets(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SingleGroupingSetContext extends GroupingElementContext {
		public GroupingSetContext groupingSet() {
			return getRuleContext(GroupingSetContext.class,0);
		}
		public SingleGroupingSetContext(GroupingElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleGroupingSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleGroupingSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleGroupingSet(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CubeContext extends GroupingElementContext {
		public TerminalNode CUBE() { return getToken(SqlBaseParser.CUBE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public CubeContext(GroupingElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCube(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCube(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCube(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RollupContext extends GroupingElementContext {
		public TerminalNode ROLLUP() { return getToken(SqlBaseParser.ROLLUP, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public RollupContext(GroupingElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRollup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRollup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRollup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupingElementContext groupingElement() throws RecognitionException {
		GroupingElementContext _localctx = new GroupingElementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_groupingElement);
		int _la;
		try {
			setState(1099);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				_localctx = new SingleGroupingSetContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1059);
				groupingSet();
				}
				break;
			case 2:
				_localctx = new RollupContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1060);
				match(ROLLUP);
				setState(1061);
				match(T__1);
				setState(1070);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << ADD) | (1L << ADMIN) | (1L << ALL) | (1L << ANALYZE) | (1L << ANY) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << BERNOULLI) | (1L << CALL) | (1L << CALLED) | (1L << CASCADE) | (1L << CASE) | (1L << CAST) | (1L << CATALOGS) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << CURRENT_DATE) | (1L << CURRENT_ROLE) | (1L << CURRENT_TIME) | (1L << CURRENT_TIMESTAMP) | (1L << CURRENT_USER) | (1L << DATA) | (1L << DATE) | (1L << DAY) | (1L << DEFINER) | (1L << DESC) | (1L << DETERMINISTIC) | (1L << DISTRIBUTED) | (1L << EXCLUDING) | (1L << EXISTS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (EXPLAIN - 64)) | (1L << (EXTRACT - 64)) | (1L << (EXTERNAL - 64)) | (1L << (FALSE - 64)) | (1L << (FETCH - 64)) | (1L << (FILTER - 64)) | (1L << (FIRST - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FORMAT - 64)) | (1L << (FUNCTION - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GRANT - 64)) | (1L << (GRANTED - 64)) | (1L << (GRANTS - 64)) | (1L << (GRAPHVIZ - 64)) | (1L << (GROUPING - 64)) | (1L << (GROUPS - 64)) | (1L << (HOUR - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (INCLUDING - 64)) | (1L << (INPUT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INVOKER - 64)) | (1L << (IO - 64)) | (1L << (ISOLATION - 64)) | (1L << (JSON - 64)) | (1L << (LANGUAGE - 64)) | (1L << (LAST - 64)) | (1L << (LATERAL - 64)) | (1L << (LEVEL - 64)) | (1L << (LIMIT - 64)) | (1L << (LOCALTIME - 64)) | (1L << (LOCALTIMESTAMP - 64)) | (1L << (LOGICAL - 64)) | (1L << (MAP - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MINUTE - 64)) | (1L << (MONTH - 64)) | (1L << (NAME - 64)) | (1L << (NFC - 64)) | (1L << (NFD - 64)) | (1L << (NFKC - 64)) | (1L << (NFKD - 64)) | (1L << (NO - 64)) | (1L << (NONE - 64)) | (1L << (NORMALIZE - 64)) | (1L << (NOT - 64)) | (1L << (NULL - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (NULLIF - 128)) | (1L << (NULLS - 128)) | (1L << (OFFSET - 128)) | (1L << (ONLY - 128)) | (1L << (OPTION - 128)) | (1L << (ORDINALITY - 128)) | (1L << (OUTPUT - 128)) | (1L << (OVER - 128)) | (1L << (PARTITION - 128)) | (1L << (PARTITIONS - 128)) | (1L << (POSITION - 128)) | (1L << (PRECEDING - 128)) | (1L << (PRIVILEGES - 128)) | (1L << (PROPERTIES - 128)) | (1L << (RANGE - 128)) | (1L << (READ - 128)) | (1L << (REFRESH - 128)) | (1L << (RENAME - 128)) | (1L << (REPEATABLE - 128)) | (1L << (REPLACE - 128)) | (1L << (RESET - 128)) | (1L << (RESPECT - 128)) | (1L << (RESTRICT - 128)) | (1L << (RETURN - 128)) | (1L << (RETURNS - 128)) | (1L << (REVOKE - 128)) | (1L << (ROLE - 128)) | (1L << (ROLES - 128)) | (1L << (ROLLBACK - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (SCHEMA - 128)) | (1L << (SCHEMAS - 128)) | (1L << (SECOND - 128)) | (1L << (SECURITY - 128)) | (1L << (SERIALIZABLE - 128)) | (1L << (SESSION - 128)) | (1L << (SET - 128)) | (1L << (SETS - 128)) | (1L << (SHOW - 128)) | (1L << (SOME - 128)) | (1L << (SQL - 128)) | (1L << (START - 128)) | (1L << (STATS - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLES - 128)) | (1L << (TABLESAMPLE - 128)) | (1L << (TEMPORARY - 128)) | (1L << (TEXT - 128)) | (1L << (TIME - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (TRANSACTION - 192)) | (1L << (TRUE - 192)) | (1L << (TRUNCATE - 192)) | (1L << (TRY_CAST - 192)) | (1L << (TYPE - 192)) | (1L << (UNBOUNDED - 192)) | (1L << (UNCOMMITTED - 192)) | (1L << (USE - 192)) | (1L << (USER - 192)) | (1L << (VALIDATE - 192)) | (1L << (VERBOSE - 192)) | (1L << (VIEW - 192)) | (1L << (WORK - 192)) | (1L << (WRITE - 192)) | (1L << (YEAR - 192)) | (1L << (ZONE - 192)) | (1L << (PLUS - 192)) | (1L << (MINUS - 192)) | (1L << (STRING - 192)) | (1L << (UNICODE_STRING - 192)) | (1L << (BINARY_LITERAL - 192)) | (1L << (INTEGER_VALUE - 192)) | (1L << (DECIMAL_VALUE - 192)) | (1L << (DOUBLE_VALUE - 192)) | (1L << (IDENTIFIER - 192)) | (1L << (DIGIT_IDENTIFIER - 192)) | (1L << (QUOTED_IDENTIFIER - 192)) | (1L << (BACKQUOTED_IDENTIFIER - 192)) | (1L << (DOUBLE_PRECISION - 192)))) != 0)) {
					{
					setState(1062);
					expression();
					setState(1067);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1063);
						match(T__3);
						setState(1064);
						expression();
						}
						}
						setState(1069);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1072);
				match(T__2);
				}
				break;
			case 3:
				_localctx = new CubeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1073);
				match(CUBE);
				setState(1074);
				match(T__1);
				setState(1083);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << ADD) | (1L << ADMIN) | (1L << ALL) | (1L << ANALYZE) | (1L << ANY) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << BERNOULLI) | (1L << CALL) | (1L << CALLED) | (1L << CASCADE) | (1L << CASE) | (1L << CAST) | (1L << CATALOGS) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << CURRENT_DATE) | (1L << CURRENT_ROLE) | (1L << CURRENT_TIME) | (1L << CURRENT_TIMESTAMP) | (1L << CURRENT_USER) | (1L << DATA) | (1L << DATE) | (1L << DAY) | (1L << DEFINER) | (1L << DESC) | (1L << DETERMINISTIC) | (1L << DISTRIBUTED) | (1L << EXCLUDING) | (1L << EXISTS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (EXPLAIN - 64)) | (1L << (EXTRACT - 64)) | (1L << (EXTERNAL - 64)) | (1L << (FALSE - 64)) | (1L << (FETCH - 64)) | (1L << (FILTER - 64)) | (1L << (FIRST - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FORMAT - 64)) | (1L << (FUNCTION - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GRANT - 64)) | (1L << (GRANTED - 64)) | (1L << (GRANTS - 64)) | (1L << (GRAPHVIZ - 64)) | (1L << (GROUPING - 64)) | (1L << (GROUPS - 64)) | (1L << (HOUR - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (INCLUDING - 64)) | (1L << (INPUT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INVOKER - 64)) | (1L << (IO - 64)) | (1L << (ISOLATION - 64)) | (1L << (JSON - 64)) | (1L << (LANGUAGE - 64)) | (1L << (LAST - 64)) | (1L << (LATERAL - 64)) | (1L << (LEVEL - 64)) | (1L << (LIMIT - 64)) | (1L << (LOCALTIME - 64)) | (1L << (LOCALTIMESTAMP - 64)) | (1L << (LOGICAL - 64)) | (1L << (MAP - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MINUTE - 64)) | (1L << (MONTH - 64)) | (1L << (NAME - 64)) | (1L << (NFC - 64)) | (1L << (NFD - 64)) | (1L << (NFKC - 64)) | (1L << (NFKD - 64)) | (1L << (NO - 64)) | (1L << (NONE - 64)) | (1L << (NORMALIZE - 64)) | (1L << (NOT - 64)) | (1L << (NULL - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (NULLIF - 128)) | (1L << (NULLS - 128)) | (1L << (OFFSET - 128)) | (1L << (ONLY - 128)) | (1L << (OPTION - 128)) | (1L << (ORDINALITY - 128)) | (1L << (OUTPUT - 128)) | (1L << (OVER - 128)) | (1L << (PARTITION - 128)) | (1L << (PARTITIONS - 128)) | (1L << (POSITION - 128)) | (1L << (PRECEDING - 128)) | (1L << (PRIVILEGES - 128)) | (1L << (PROPERTIES - 128)) | (1L << (RANGE - 128)) | (1L << (READ - 128)) | (1L << (REFRESH - 128)) | (1L << (RENAME - 128)) | (1L << (REPEATABLE - 128)) | (1L << (REPLACE - 128)) | (1L << (RESET - 128)) | (1L << (RESPECT - 128)) | (1L << (RESTRICT - 128)) | (1L << (RETURN - 128)) | (1L << (RETURNS - 128)) | (1L << (REVOKE - 128)) | (1L << (ROLE - 128)) | (1L << (ROLES - 128)) | (1L << (ROLLBACK - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (SCHEMA - 128)) | (1L << (SCHEMAS - 128)) | (1L << (SECOND - 128)) | (1L << (SECURITY - 128)) | (1L << (SERIALIZABLE - 128)) | (1L << (SESSION - 128)) | (1L << (SET - 128)) | (1L << (SETS - 128)) | (1L << (SHOW - 128)) | (1L << (SOME - 128)) | (1L << (SQL - 128)) | (1L << (START - 128)) | (1L << (STATS - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLES - 128)) | (1L << (TABLESAMPLE - 128)) | (1L << (TEMPORARY - 128)) | (1L << (TEXT - 128)) | (1L << (TIME - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (TRANSACTION - 192)) | (1L << (TRUE - 192)) | (1L << (TRUNCATE - 192)) | (1L << (TRY_CAST - 192)) | (1L << (TYPE - 192)) | (1L << (UNBOUNDED - 192)) | (1L << (UNCOMMITTED - 192)) | (1L << (USE - 192)) | (1L << (USER - 192)) | (1L << (VALIDATE - 192)) | (1L << (VERBOSE - 192)) | (1L << (VIEW - 192)) | (1L << (WORK - 192)) | (1L << (WRITE - 192)) | (1L << (YEAR - 192)) | (1L << (ZONE - 192)) | (1L << (PLUS - 192)) | (1L << (MINUS - 192)) | (1L << (STRING - 192)) | (1L << (UNICODE_STRING - 192)) | (1L << (BINARY_LITERAL - 192)) | (1L << (INTEGER_VALUE - 192)) | (1L << (DECIMAL_VALUE - 192)) | (1L << (DOUBLE_VALUE - 192)) | (1L << (IDENTIFIER - 192)) | (1L << (DIGIT_IDENTIFIER - 192)) | (1L << (QUOTED_IDENTIFIER - 192)) | (1L << (BACKQUOTED_IDENTIFIER - 192)) | (1L << (DOUBLE_PRECISION - 192)))) != 0)) {
					{
					setState(1075);
					expression();
					setState(1080);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1076);
						match(T__3);
						setState(1077);
						expression();
						}
						}
						setState(1082);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1085);
				match(T__2);
				}
				break;
			case 4:
				_localctx = new MultipleGroupingSetsContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1086);
				match(GROUPING);
				setState(1087);
				match(SETS);
				setState(1088);
				match(T__1);
				setState(1089);
				groupingSet();
				setState(1094);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1090);
					match(T__3);
					setState(1091);
					groupingSet();
					}
					}
					setState(1096);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1097);
				match(T__2);
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

	public static class GroupingSetContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public GroupingSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupingSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterGroupingSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitGroupingSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitGroupingSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupingSetContext groupingSet() throws RecognitionException {
		GroupingSetContext _localctx = new GroupingSetContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_groupingSet);
		int _la;
		try {
			setState(1114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1101);
				match(T__1);
				setState(1110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << ADD) | (1L << ADMIN) | (1L << ALL) | (1L << ANALYZE) | (1L << ANY) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << BERNOULLI) | (1L << CALL) | (1L << CALLED) | (1L << CASCADE) | (1L << CASE) | (1L << CAST) | (1L << CATALOGS) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << CURRENT_DATE) | (1L << CURRENT_ROLE) | (1L << CURRENT_TIME) | (1L << CURRENT_TIMESTAMP) | (1L << CURRENT_USER) | (1L << DATA) | (1L << DATE) | (1L << DAY) | (1L << DEFINER) | (1L << DESC) | (1L << DETERMINISTIC) | (1L << DISTRIBUTED) | (1L << EXCLUDING) | (1L << EXISTS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (EXPLAIN - 64)) | (1L << (EXTRACT - 64)) | (1L << (EXTERNAL - 64)) | (1L << (FALSE - 64)) | (1L << (FETCH - 64)) | (1L << (FILTER - 64)) | (1L << (FIRST - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FORMAT - 64)) | (1L << (FUNCTION - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GRANT - 64)) | (1L << (GRANTED - 64)) | (1L << (GRANTS - 64)) | (1L << (GRAPHVIZ - 64)) | (1L << (GROUPING - 64)) | (1L << (GROUPS - 64)) | (1L << (HOUR - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (INCLUDING - 64)) | (1L << (INPUT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INVOKER - 64)) | (1L << (IO - 64)) | (1L << (ISOLATION - 64)) | (1L << (JSON - 64)) | (1L << (LANGUAGE - 64)) | (1L << (LAST - 64)) | (1L << (LATERAL - 64)) | (1L << (LEVEL - 64)) | (1L << (LIMIT - 64)) | (1L << (LOCALTIME - 64)) | (1L << (LOCALTIMESTAMP - 64)) | (1L << (LOGICAL - 64)) | (1L << (MAP - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MINUTE - 64)) | (1L << (MONTH - 64)) | (1L << (NAME - 64)) | (1L << (NFC - 64)) | (1L << (NFD - 64)) | (1L << (NFKC - 64)) | (1L << (NFKD - 64)) | (1L << (NO - 64)) | (1L << (NONE - 64)) | (1L << (NORMALIZE - 64)) | (1L << (NOT - 64)) | (1L << (NULL - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (NULLIF - 128)) | (1L << (NULLS - 128)) | (1L << (OFFSET - 128)) | (1L << (ONLY - 128)) | (1L << (OPTION - 128)) | (1L << (ORDINALITY - 128)) | (1L << (OUTPUT - 128)) | (1L << (OVER - 128)) | (1L << (PARTITION - 128)) | (1L << (PARTITIONS - 128)) | (1L << (POSITION - 128)) | (1L << (PRECEDING - 128)) | (1L << (PRIVILEGES - 128)) | (1L << (PROPERTIES - 128)) | (1L << (RANGE - 128)) | (1L << (READ - 128)) | (1L << (REFRESH - 128)) | (1L << (RENAME - 128)) | (1L << (REPEATABLE - 128)) | (1L << (REPLACE - 128)) | (1L << (RESET - 128)) | (1L << (RESPECT - 128)) | (1L << (RESTRICT - 128)) | (1L << (RETURN - 128)) | (1L << (RETURNS - 128)) | (1L << (REVOKE - 128)) | (1L << (ROLE - 128)) | (1L << (ROLES - 128)) | (1L << (ROLLBACK - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (SCHEMA - 128)) | (1L << (SCHEMAS - 128)) | (1L << (SECOND - 128)) | (1L << (SECURITY - 128)) | (1L << (SERIALIZABLE - 128)) | (1L << (SESSION - 128)) | (1L << (SET - 128)) | (1L << (SETS - 128)) | (1L << (SHOW - 128)) | (1L << (SOME - 128)) | (1L << (SQL - 128)) | (1L << (START - 128)) | (1L << (STATS - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLES - 128)) | (1L << (TABLESAMPLE - 128)) | (1L << (TEMPORARY - 128)) | (1L << (TEXT - 128)) | (1L << (TIME - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (TRANSACTION - 192)) | (1L << (TRUE - 192)) | (1L << (TRUNCATE - 192)) | (1L << (TRY_CAST - 192)) | (1L << (TYPE - 192)) | (1L << (UNBOUNDED - 192)) | (1L << (UNCOMMITTED - 192)) | (1L << (USE - 192)) | (1L << (USER - 192)) | (1L << (VALIDATE - 192)) | (1L << (VERBOSE - 192)) | (1L << (VIEW - 192)) | (1L << (WORK - 192)) | (1L << (WRITE - 192)) | (1L << (YEAR - 192)) | (1L << (ZONE - 192)) | (1L << (PLUS - 192)) | (1L << (MINUS - 192)) | (1L << (STRING - 192)) | (1L << (UNICODE_STRING - 192)) | (1L << (BINARY_LITERAL - 192)) | (1L << (INTEGER_VALUE - 192)) | (1L << (DECIMAL_VALUE - 192)) | (1L << (DOUBLE_VALUE - 192)) | (1L << (IDENTIFIER - 192)) | (1L << (DIGIT_IDENTIFIER - 192)) | (1L << (QUOTED_IDENTIFIER - 192)) | (1L << (BACKQUOTED_IDENTIFIER - 192)) | (1L << (DOUBLE_PRECISION - 192)))) != 0)) {
					{
					setState(1102);
					expression();
					setState(1107);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1103);
						match(T__3);
						setState(1104);
						expression();
						}
						}
						setState(1109);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1112);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1113);
				expression();
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

	public static class NamedQueryContext extends ParserRuleContext {
		public IdentifierContext name;
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColumnAliasesContext columnAliases() {
			return getRuleContext(ColumnAliasesContext.class,0);
		}
		public NamedQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNamedQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNamedQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNamedQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedQueryContext namedQuery() throws RecognitionException {
		NamedQueryContext _localctx = new NamedQueryContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_namedQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1116);
			((NamedQueryContext)_localctx).name = identifier();
			setState(1118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(1117);
				columnAliases();
				}
			}

			setState(1120);
			match(AS);
			setState(1121);
			match(T__1);
			setState(1122);
			query();
			setState(1123);
			match(T__2);
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

	public static class SetQuantifierContext extends ParserRuleContext {
		public TerminalNode DISTINCT() { return getToken(SqlBaseParser.DISTINCT, 0); }
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public SetQuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setQuantifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetQuantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetQuantifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetQuantifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetQuantifierContext setQuantifier() throws RecognitionException {
		SetQuantifierContext _localctx = new SetQuantifierContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_setQuantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1125);
			_la = _input.LA(1);
			if ( !(_la==ALL || _la==DISTINCT) ) {
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

	public static class SelectItemContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public SelectItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSelectItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSelectItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSelectItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectItemContext selectItem() throws RecognitionException {
		SelectItemContext _localctx = new SelectItemContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_selectItem);
		int _la;
		try {
			setState(1139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1127);
				expression();
				setState(1132);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
				case 1:
					{
					setState(1129);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(1128);
						match(AS);
						}
					}

					setState(1131);
					identifier();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1134);
				qualifiedName();
				setState(1135);
				match(T__0);
				setState(1136);
				match(ASTERISK);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1138);
				match(ASTERISK);
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

	public static class RelationContext extends ParserRuleContext {
		public RelationContext left;
		public SampledRelationContext right;
		public RelationContext rightRelation;
		public SampledRelationContext sampledRelation() {
			return getRuleContext(SampledRelationContext.class,0);
		}
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}
		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class,i);
		}
		public TerminalNode CROSS() { return getToken(SqlBaseParser.CROSS, 0); }
		public TerminalNode JOIN() { return getToken(SqlBaseParser.JOIN, 0); }
		public JoinTypeContext joinType() {
			return getRuleContext(JoinTypeContext.class,0);
		}
		public JoinCriteriaContext joinCriteria() {
			return getRuleContext(JoinCriteriaContext.class,0);
		}
		public TerminalNode NATURAL() { return getToken(SqlBaseParser.NATURAL, 0); }
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationContext relation() throws RecognitionException {
		return relation(0);
	}

	private RelationContext relation(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationContext _localctx = new RelationContext(_ctx, _parentState);
		RelationContext _prevctx = _localctx;
		int _startState = 76;
		enterRecursionRule(_localctx, 76, RULE_relation, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1142);
			sampledRelation();
			}
			_ctx.stop = _input.LT(-1);
			setState(1162);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new RelationContext(_parentctx, _parentState);
					_localctx.left = _prevctx;
					_localctx.left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_relation);
					setState(1144);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(1158);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case CROSS:
						{
						setState(1145);
						match(CROSS);
						setState(1146);
						match(JOIN);
						setState(1147);
						((RelationContext)_localctx).right = sampledRelation();
						}
						break;
					case FULL:
					case INNER:
					case JOIN:
					case LEFT:
					case RIGHT:
						{
						setState(1148);
						joinType();
						setState(1149);
						match(JOIN);
						setState(1150);
						((RelationContext)_localctx).rightRelation = relation(0);
						setState(1151);
						joinCriteria();
						}
						break;
					case NATURAL:
						{
						setState(1153);
						match(NATURAL);
						setState(1154);
						joinType();
						setState(1155);
						match(JOIN);
						setState(1156);
						((RelationContext)_localctx).right = sampledRelation();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(1164);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class JoinTypeContext extends ParserRuleContext {
		public TerminalNode INNER() { return getToken(SqlBaseParser.INNER, 0); }
		public TerminalNode LEFT() { return getToken(SqlBaseParser.LEFT, 0); }
		public TerminalNode OUTER() { return getToken(SqlBaseParser.OUTER, 0); }
		public TerminalNode RIGHT() { return getToken(SqlBaseParser.RIGHT, 0); }
		public TerminalNode FULL() { return getToken(SqlBaseParser.FULL, 0); }
		public JoinTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterJoinType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitJoinType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitJoinType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinTypeContext joinType() throws RecognitionException {
		JoinTypeContext _localctx = new JoinTypeContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_joinType);
		int _la;
		try {
			setState(1180);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INNER:
			case JOIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INNER) {
					{
					setState(1165);
					match(INNER);
					}
				}

				}
				break;
			case LEFT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1168);
				match(LEFT);
				setState(1170);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(1169);
					match(OUTER);
					}
				}

				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1172);
				match(RIGHT);
				setState(1174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(1173);
					match(OUTER);
					}
				}

				}
				break;
			case FULL:
				enterOuterAlt(_localctx, 4);
				{
				setState(1176);
				match(FULL);
				setState(1178);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(1177);
					match(OUTER);
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

	public static class JoinCriteriaContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public JoinCriteriaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinCriteria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterJoinCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitJoinCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitJoinCriteria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinCriteriaContext joinCriteria() throws RecognitionException {
		JoinCriteriaContext _localctx = new JoinCriteriaContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_joinCriteria);
		int _la;
		try {
			setState(1196);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(1182);
				match(ON);
				setState(1183);
				booleanExpression(0);
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1184);
				match(USING);
				setState(1185);
				match(T__1);
				setState(1186);
				identifier();
				setState(1191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1187);
					match(T__3);
					setState(1188);
					identifier();
					}
					}
					setState(1193);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1194);
				match(T__2);
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

	public static class SampledRelationContext extends ParserRuleContext {
		public ExpressionContext percentage;
		public AliasedRelationContext aliasedRelation() {
			return getRuleContext(AliasedRelationContext.class,0);
		}
		public TerminalNode TABLESAMPLE() { return getToken(SqlBaseParser.TABLESAMPLE, 0); }
		public SampleTypeContext sampleType() {
			return getRuleContext(SampleTypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SampledRelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sampledRelation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSampledRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSampledRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSampledRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SampledRelationContext sampledRelation() throws RecognitionException {
		SampledRelationContext _localctx = new SampledRelationContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_sampledRelation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1198);
			aliasedRelation();
			setState(1205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
			case 1:
				{
				setState(1199);
				match(TABLESAMPLE);
				setState(1200);
				sampleType();
				setState(1201);
				match(T__1);
				setState(1202);
				((SampledRelationContext)_localctx).percentage = expression();
				setState(1203);
				match(T__2);
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

	public static class SampleTypeContext extends ParserRuleContext {
		public TerminalNode BERNOULLI() { return getToken(SqlBaseParser.BERNOULLI, 0); }
		public TerminalNode SYSTEM() { return getToken(SqlBaseParser.SYSTEM, 0); }
		public SampleTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sampleType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSampleType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSampleType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSampleType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SampleTypeContext sampleType() throws RecognitionException {
		SampleTypeContext _localctx = new SampleTypeContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_sampleType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1207);
			_la = _input.LA(1);
			if ( !(_la==BERNOULLI || _la==SYSTEM) ) {
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

	public static class AliasedRelationContext extends ParserRuleContext {
		public RelationPrimaryContext relationPrimary() {
			return getRuleContext(RelationPrimaryContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public ColumnAliasesContext columnAliases() {
			return getRuleContext(ColumnAliasesContext.class,0);
		}
		public AliasedRelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aliasedRelation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAliasedRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAliasedRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAliasedRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AliasedRelationContext aliasedRelation() throws RecognitionException {
		AliasedRelationContext _localctx = new AliasedRelationContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_aliasedRelation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1209);
			relationPrimary();
			setState(1217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				{
				setState(1211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(1210);
					match(AS);
					}
				}

				setState(1213);
				identifier();
				setState(1215);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
				case 1:
					{
					setState(1214);
					columnAliases();
					}
					break;
				}
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

	public static class ColumnAliasesContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public ColumnAliasesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnAliases; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterColumnAliases(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitColumnAliases(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitColumnAliases(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnAliasesContext columnAliases() throws RecognitionException {
		ColumnAliasesContext _localctx = new ColumnAliasesContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_columnAliases);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1219);
			match(T__1);
			setState(1220);
			identifier();
			setState(1225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1221);
				match(T__3);
				setState(1222);
				identifier();
				}
				}
				setState(1227);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1228);
			match(T__2);
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

	public static class RelationPrimaryContext extends ParserRuleContext {
		public RelationPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationPrimary; }
	 
		public RelationPrimaryContext() { }
		public void copyFrom(RelationPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SubqueryRelationContext extends RelationPrimaryContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public SubqueryRelationContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSubqueryRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSubqueryRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSubqueryRelation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesizedRelationContext extends RelationPrimaryContext {
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public ParenthesizedRelationContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterParenthesizedRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitParenthesizedRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitParenthesizedRelation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnnestContext extends RelationPrimaryContext {
		public TerminalNode UNNEST() { return getToken(SqlBaseParser.UNNEST, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode ORDINALITY() { return getToken(SqlBaseParser.ORDINALITY, 0); }
		public UnnestContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUnnest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUnnest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUnnest(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LateralContext extends RelationPrimaryContext {
		public TerminalNode LATERAL() { return getToken(SqlBaseParser.LATERAL, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public LateralContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLateral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLateral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLateral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableNameContext extends RelationPrimaryContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TableNameContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationPrimaryContext relationPrimary() throws RecognitionException {
		RelationPrimaryContext _localctx = new RelationPrimaryContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_relationPrimary);
		int _la;
		try {
			setState(1259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				_localctx = new TableNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1230);
				qualifiedName();
				}
				break;
			case 2:
				_localctx = new SubqueryRelationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1231);
				match(T__1);
				setState(1232);
				query();
				setState(1233);
				match(T__2);
				}
				break;
			case 3:
				_localctx = new UnnestContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1235);
				match(UNNEST);
				setState(1236);
				match(T__1);
				setState(1237);
				expression();
				setState(1242);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1238);
					match(T__3);
					setState(1239);
					expression();
					}
					}
					setState(1244);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1245);
				match(T__2);
				setState(1248);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
				case 1:
					{
					setState(1246);
					match(WITH);
					setState(1247);
					match(ORDINALITY);
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new LateralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1250);
				match(LATERAL);
				setState(1251);
				match(T__1);
				setState(1252);
				query();
				setState(1253);
				match(T__2);
				}
				break;
			case 5:
				_localctx = new ParenthesizedRelationContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1255);
				match(T__1);
				setState(1256);
				relation(0);
				setState(1257);
				match(T__2);
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

	public static class ExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1261);
			booleanExpression(0);
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

	public static class BooleanExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpression; }
	 
		public BooleanExpressionContext() { }
		public void copyFrom(BooleanExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LogicalNotContext extends BooleanExpressionContext {
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public LogicalNotContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLogicalNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLogicalNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLogicalNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PredicatedContext extends BooleanExpressionContext {
		public ValueExpressionContext valueExpression;
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public PredicatedContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPredicated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPredicated(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPredicated(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalBinaryContext extends BooleanExpressionContext {
		public BooleanExpressionContext left;
		public Token operator;
		public BooleanExpressionContext right;
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public LogicalBinaryContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLogicalBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLogicalBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLogicalBinary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		return booleanExpression(0);
	}

	private BooleanExpressionContext booleanExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, _parentState);
		BooleanExpressionContext _prevctx = _localctx;
		int _startState = 94;
		enterRecursionRule(_localctx, 94, RULE_booleanExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1270);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__4:
			case ADD:
			case ADMIN:
			case ALL:
			case ANALYZE:
			case ANY:
			case ARRAY:
			case ASC:
			case AT:
			case BERNOULLI:
			case CALL:
			case CALLED:
			case CASCADE:
			case CASE:
			case CAST:
			case CATALOGS:
			case COLUMN:
			case COLUMNS:
			case COMMENT:
			case COMMIT:
			case COMMITTED:
			case CURRENT:
			case CURRENT_DATE:
			case CURRENT_ROLE:
			case CURRENT_TIME:
			case CURRENT_TIMESTAMP:
			case CURRENT_USER:
			case DATA:
			case DATE:
			case DAY:
			case DEFINER:
			case DESC:
			case DETERMINISTIC:
			case DISTRIBUTED:
			case EXCLUDING:
			case EXISTS:
			case EXPLAIN:
			case EXTRACT:
			case EXTERNAL:
			case FALSE:
			case FETCH:
			case FILTER:
			case FIRST:
			case FOLLOWING:
			case FORMAT:
			case FUNCTION:
			case FUNCTIONS:
			case GRANT:
			case GRANTED:
			case GRANTS:
			case GRAPHVIZ:
			case GROUPING:
			case GROUPS:
			case HOUR:
			case IF:
			case IGNORE:
			case INCLUDING:
			case INPUT:
			case INTERVAL:
			case INVOKER:
			case IO:
			case ISOLATION:
			case JSON:
			case LANGUAGE:
			case LAST:
			case LATERAL:
			case LEVEL:
			case LIMIT:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case LOGICAL:
			case MAP:
			case MATERIALIZED:
			case MINUTE:
			case MONTH:
			case NAME:
			case NFC:
			case NFD:
			case NFKC:
			case NFKD:
			case NO:
			case NONE:
			case NORMALIZE:
			case NULL:
			case NULLIF:
			case NULLS:
			case OFFSET:
			case ONLY:
			case OPTION:
			case ORDINALITY:
			case OUTPUT:
			case OVER:
			case PARTITION:
			case PARTITIONS:
			case POSITION:
			case PRECEDING:
			case PRIVILEGES:
			case PROPERTIES:
			case RANGE:
			case READ:
			case REFRESH:
			case RENAME:
			case REPEATABLE:
			case REPLACE:
			case RESET:
			case RESPECT:
			case RESTRICT:
			case RETURN:
			case RETURNS:
			case REVOKE:
			case ROLE:
			case ROLES:
			case ROLLBACK:
			case ROW:
			case ROWS:
			case SCHEMA:
			case SCHEMAS:
			case SECOND:
			case SECURITY:
			case SERIALIZABLE:
			case SESSION:
			case SET:
			case SETS:
			case SHOW:
			case SOME:
			case SQL:
			case START:
			case STATS:
			case SUBSTRING:
			case SYSTEM:
			case TABLES:
			case TABLESAMPLE:
			case TEMPORARY:
			case TEXT:
			case TIME:
			case TIMESTAMP:
			case TO:
			case TRANSACTION:
			case TRUE:
			case TRUNCATE:
			case TRY_CAST:
			case TYPE:
			case UNBOUNDED:
			case UNCOMMITTED:
			case USE:
			case USER:
			case VALIDATE:
			case VERBOSE:
			case VIEW:
			case WORK:
			case WRITE:
			case YEAR:
			case ZONE:
			case PLUS:
			case MINUS:
			case STRING:
			case UNICODE_STRING:
			case BINARY_LITERAL:
			case INTEGER_VALUE:
			case DECIMAL_VALUE:
			case DOUBLE_VALUE:
			case IDENTIFIER:
			case DIGIT_IDENTIFIER:
			case QUOTED_IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
			case DOUBLE_PRECISION:
				{
				_localctx = new PredicatedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1264);
				((PredicatedContext)_localctx).valueExpression = valueExpression(0);
				setState(1266);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
				case 1:
					{
					setState(1265);
					predicate(((PredicatedContext)_localctx).valueExpression);
					}
					break;
				}
				}
				break;
			case NOT:
				{
				_localctx = new LogicalNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1268);
				match(NOT);
				setState(1269);
				booleanExpression(3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1280);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1278);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(1272);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1273);
						((LogicalBinaryContext)_localctx).operator = match(AND);
						setState(1274);
						((LogicalBinaryContext)_localctx).right = booleanExpression(3);
						}
						break;
					case 2:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(1275);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1276);
						((LogicalBinaryContext)_localctx).operator = match(OR);
						setState(1277);
						((LogicalBinaryContext)_localctx).right = booleanExpression(2);
						}
						break;
					}
					} 
				}
				setState(1282);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,165,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PredicateContext extends ParserRuleContext {
		public ParserRuleContext value;
		public PredicateContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PredicateContext(ParserRuleContext parent, int invokingState, ParserRuleContext value) {
			super(parent, invokingState);
			this.value = value;
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
	 
		public PredicateContext() { }
		public void copyFrom(PredicateContext ctx) {
			super.copyFrom(ctx);
			this.value = ctx.value;
		}
	}
	public static class ComparisonContext extends PredicateContext {
		public ValueExpressionContext right;
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public ComparisonContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LikeContext extends PredicateContext {
		public ValueExpressionContext pattern;
		public ValueExpressionContext escape;
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode ESCAPE() { return getToken(SqlBaseParser.ESCAPE, 0); }
		public LikeContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLike(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLike(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLike(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InSubqueryContext extends PredicateContext {
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public InSubqueryContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInSubquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInSubquery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DistinctFromContext extends PredicateContext {
		public ValueExpressionContext right;
		public TerminalNode IS() { return getToken(SqlBaseParser.IS, 0); }
		public TerminalNode DISTINCT() { return getToken(SqlBaseParser.DISTINCT, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public DistinctFromContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDistinctFrom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDistinctFrom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDistinctFrom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InListContext extends PredicateContext {
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public InListContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInList(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NullPredicateContext extends PredicateContext {
		public TerminalNode IS() { return getToken(SqlBaseParser.IS, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public NullPredicateContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNullPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNullPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNullPredicate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BetweenContext extends PredicateContext {
		public ValueExpressionContext lower;
		public ValueExpressionContext upper;
		public TerminalNode BETWEEN() { return getToken(SqlBaseParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public BetweenContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBetween(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBetween(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBetween(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class QuantifiedComparisonContext extends PredicateContext {
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public ComparisonQuantifierContext comparisonQuantifier() {
			return getRuleContext(ComparisonQuantifierContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public QuantifiedComparisonContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQuantifiedComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQuantifiedComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQuantifiedComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate(ParserRuleContext value) throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState(), value);
		enterRule(_localctx, 96, RULE_predicate);
		int _la;
		try {
			setState(1344);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
			case 1:
				_localctx = new ComparisonContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1283);
				comparisonOperator();
				setState(1284);
				((ComparisonContext)_localctx).right = valueExpression(0);
				}
				break;
			case 2:
				_localctx = new QuantifiedComparisonContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1286);
				comparisonOperator();
				setState(1287);
				comparisonQuantifier();
				setState(1288);
				match(T__1);
				setState(1289);
				query();
				setState(1290);
				match(T__2);
				}
				break;
			case 3:
				_localctx = new BetweenContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1293);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1292);
					match(NOT);
					}
				}

				setState(1295);
				match(BETWEEN);
				setState(1296);
				((BetweenContext)_localctx).lower = valueExpression(0);
				setState(1297);
				match(AND);
				setState(1298);
				((BetweenContext)_localctx).upper = valueExpression(0);
				}
				break;
			case 4:
				_localctx = new InListContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1301);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1300);
					match(NOT);
					}
				}

				setState(1303);
				match(IN);
				setState(1304);
				match(T__1);
				setState(1305);
				expression();
				setState(1310);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1306);
					match(T__3);
					setState(1307);
					expression();
					}
					}
					setState(1312);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1313);
				match(T__2);
				}
				break;
			case 5:
				_localctx = new InSubqueryContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1316);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1315);
					match(NOT);
					}
				}

				setState(1318);
				match(IN);
				setState(1319);
				match(T__1);
				setState(1320);
				query();
				setState(1321);
				match(T__2);
				}
				break;
			case 6:
				_localctx = new LikeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1324);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1323);
					match(NOT);
					}
				}

				setState(1326);
				match(LIKE);
				setState(1327);
				((LikeContext)_localctx).pattern = valueExpression(0);
				setState(1330);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
				case 1:
					{
					setState(1328);
					match(ESCAPE);
					setState(1329);
					((LikeContext)_localctx).escape = valueExpression(0);
					}
					break;
				}
				}
				break;
			case 7:
				_localctx = new NullPredicateContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1332);
				match(IS);
				setState(1334);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1333);
					match(NOT);
					}
				}

				setState(1336);
				match(NULL);
				}
				break;
			case 8:
				_localctx = new DistinctFromContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1337);
				match(IS);
				setState(1339);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1338);
					match(NOT);
					}
				}

				setState(1341);
				match(DISTINCT);
				setState(1342);
				match(FROM);
				setState(1343);
				((DistinctFromContext)_localctx).right = valueExpression(0);
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

	public static class ValueExpressionContext extends ParserRuleContext {
		public ValueExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueExpression; }
	 
		public ValueExpressionContext() { }
		public void copyFrom(ValueExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValueExpressionDefaultContext extends ValueExpressionContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionDefaultContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterValueExpressionDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitValueExpressionDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitValueExpressionDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConcatenationContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public ValueExpressionContext right;
		public TerminalNode CONCAT() { return getToken(SqlBaseParser.CONCAT, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public ConcatenationContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterConcatenation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitConcatenation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitConcatenation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticBinaryContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public Token operator;
		public ValueExpressionContext right;
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(SqlBaseParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(SqlBaseParser.PERCENT, 0); }
		public TerminalNode PLUS() { return getToken(SqlBaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public ArithmeticBinaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterArithmeticBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitArithmeticBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitArithmeticBinary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticUnaryContext extends ValueExpressionContext {
		public Token operator;
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(SqlBaseParser.PLUS, 0); }
		public ArithmeticUnaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterArithmeticUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitArithmeticUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitArithmeticUnary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtTimeZoneContext extends ValueExpressionContext {
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode AT() { return getToken(SqlBaseParser.AT, 0); }
		public TimeZoneSpecifierContext timeZoneSpecifier() {
			return getRuleContext(TimeZoneSpecifierContext.class,0);
		}
		public AtTimeZoneContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAtTimeZone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAtTimeZone(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAtTimeZone(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueExpressionContext valueExpression() throws RecognitionException {
		return valueExpression(0);
	}

	private ValueExpressionContext valueExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ValueExpressionContext _localctx = new ValueExpressionContext(_ctx, _parentState);
		ValueExpressionContext _prevctx = _localctx;
		int _startState = 98;
		enterRecursionRule(_localctx, 98, RULE_valueExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1350);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__4:
			case ADD:
			case ADMIN:
			case ALL:
			case ANALYZE:
			case ANY:
			case ARRAY:
			case ASC:
			case AT:
			case BERNOULLI:
			case CALL:
			case CALLED:
			case CASCADE:
			case CASE:
			case CAST:
			case CATALOGS:
			case COLUMN:
			case COLUMNS:
			case COMMENT:
			case COMMIT:
			case COMMITTED:
			case CURRENT:
			case CURRENT_DATE:
			case CURRENT_ROLE:
			case CURRENT_TIME:
			case CURRENT_TIMESTAMP:
			case CURRENT_USER:
			case DATA:
			case DATE:
			case DAY:
			case DEFINER:
			case DESC:
			case DETERMINISTIC:
			case DISTRIBUTED:
			case EXCLUDING:
			case EXISTS:
			case EXPLAIN:
			case EXTRACT:
			case EXTERNAL:
			case FALSE:
			case FETCH:
			case FILTER:
			case FIRST:
			case FOLLOWING:
			case FORMAT:
			case FUNCTION:
			case FUNCTIONS:
			case GRANT:
			case GRANTED:
			case GRANTS:
			case GRAPHVIZ:
			case GROUPING:
			case GROUPS:
			case HOUR:
			case IF:
			case IGNORE:
			case INCLUDING:
			case INPUT:
			case INTERVAL:
			case INVOKER:
			case IO:
			case ISOLATION:
			case JSON:
			case LANGUAGE:
			case LAST:
			case LATERAL:
			case LEVEL:
			case LIMIT:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case LOGICAL:
			case MAP:
			case MATERIALIZED:
			case MINUTE:
			case MONTH:
			case NAME:
			case NFC:
			case NFD:
			case NFKC:
			case NFKD:
			case NO:
			case NONE:
			case NORMALIZE:
			case NULL:
			case NULLIF:
			case NULLS:
			case OFFSET:
			case ONLY:
			case OPTION:
			case ORDINALITY:
			case OUTPUT:
			case OVER:
			case PARTITION:
			case PARTITIONS:
			case POSITION:
			case PRECEDING:
			case PRIVILEGES:
			case PROPERTIES:
			case RANGE:
			case READ:
			case REFRESH:
			case RENAME:
			case REPEATABLE:
			case REPLACE:
			case RESET:
			case RESPECT:
			case RESTRICT:
			case RETURN:
			case RETURNS:
			case REVOKE:
			case ROLE:
			case ROLES:
			case ROLLBACK:
			case ROW:
			case ROWS:
			case SCHEMA:
			case SCHEMAS:
			case SECOND:
			case SECURITY:
			case SERIALIZABLE:
			case SESSION:
			case SET:
			case SETS:
			case SHOW:
			case SOME:
			case SQL:
			case START:
			case STATS:
			case SUBSTRING:
			case SYSTEM:
			case TABLES:
			case TABLESAMPLE:
			case TEMPORARY:
			case TEXT:
			case TIME:
			case TIMESTAMP:
			case TO:
			case TRANSACTION:
			case TRUE:
			case TRUNCATE:
			case TRY_CAST:
			case TYPE:
			case UNBOUNDED:
			case UNCOMMITTED:
			case USE:
			case USER:
			case VALIDATE:
			case VERBOSE:
			case VIEW:
			case WORK:
			case WRITE:
			case YEAR:
			case ZONE:
			case STRING:
			case UNICODE_STRING:
			case BINARY_LITERAL:
			case INTEGER_VALUE:
			case DECIMAL_VALUE:
			case DOUBLE_VALUE:
			case IDENTIFIER:
			case DIGIT_IDENTIFIER:
			case QUOTED_IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
			case DOUBLE_PRECISION:
				{
				_localctx = new ValueExpressionDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1347);
				primaryExpression(0);
				}
				break;
			case PLUS:
			case MINUS:
				{
				_localctx = new ArithmeticUnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1348);
				((ArithmeticUnaryContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((ArithmeticUnaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1349);
				valueExpression(4);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1366);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,177,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1364);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1352);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1353);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 224)) & ~0x3f) == 0 && ((1L << (_la - 224)) & ((1L << (ASTERISK - 224)) | (1L << (SLASH - 224)) | (1L << (PERCENT - 224)))) != 0)) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1354);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(4);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1355);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1356);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1357);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(3);
						}
						break;
					case 3:
						{
						_localctx = new ConcatenationContext(new ValueExpressionContext(_parentctx, _parentState));
						((ConcatenationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1358);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1359);
						match(CONCAT);
						setState(1360);
						((ConcatenationContext)_localctx).right = valueExpression(2);
						}
						break;
					case 4:
						{
						_localctx = new AtTimeZoneContext(new ValueExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1361);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1362);
						match(AT);
						setState(1363);
						timeZoneSpecifier();
						}
						break;
					}
					} 
				}
				setState(1368);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,177,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	 
		public PrimaryExpressionContext() { }
		public void copyFrom(PrimaryExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DereferenceContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext base;
		public IdentifierContext fieldName;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DereferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDereference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDereference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDereference(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeConstructorContext extends PrimaryExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode DOUBLE_PRECISION() { return getToken(SqlBaseParser.DOUBLE_PRECISION, 0); }
		public TypeConstructorContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTypeConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTypeConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTypeConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SpecialDateTimeFunctionContext extends PrimaryExpressionContext {
		public Token name;
		public Token precision;
		public TerminalNode CURRENT_DATE() { return getToken(SqlBaseParser.CURRENT_DATE, 0); }
		public TerminalNode CURRENT_TIME() { return getToken(SqlBaseParser.CURRENT_TIME, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(SqlBaseParser.CURRENT_TIMESTAMP, 0); }
		public TerminalNode LOCALTIME() { return getToken(SqlBaseParser.LOCALTIME, 0); }
		public TerminalNode LOCALTIMESTAMP() { return getToken(SqlBaseParser.LOCALTIMESTAMP, 0); }
		public SpecialDateTimeFunctionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSpecialDateTimeFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSpecialDateTimeFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSpecialDateTimeFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubstringContext extends PrimaryExpressionContext {
		public TerminalNode SUBSTRING() { return getToken(SqlBaseParser.SUBSTRING, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public SubstringContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSubstring(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSubstring(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSubstring(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CastContext extends PrimaryExpressionContext {
		public TerminalNode CAST() { return getToken(SqlBaseParser.CAST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode TRY_CAST() { return getToken(SqlBaseParser.TRY_CAST, 0); }
		public CastContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCast(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LambdaContext extends PrimaryExpressionContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LambdaContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLambda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLambda(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLambda(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesizedExpressionContext extends PrimaryExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenthesizedExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterParenthesizedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitParenthesizedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitParenthesizedExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParameterContext extends PrimaryExpressionContext {
		public ParameterContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NormalizeContext extends PrimaryExpressionContext {
		public TerminalNode NORMALIZE() { return getToken(SqlBaseParser.NORMALIZE, 0); }
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public NormalFormContext normalForm() {
			return getRuleContext(NormalFormContext.class,0);
		}
		public NormalizeContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNormalize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNormalize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNormalize(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntervalLiteralContext extends PrimaryExpressionContext {
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public IntervalLiteralContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIntervalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIntervalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIntervalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumericLiteralContext extends PrimaryExpressionContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NumericLiteralContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNumericLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNumericLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNumericLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanLiteralContext extends PrimaryExpressionContext {
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public BooleanLiteralContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBooleanLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SimpleCaseContext extends PrimaryExpressionContext {
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(SqlBaseParser.CASE, 0); }
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode END() { return getToken(SqlBaseParser.END, 0); }
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SqlBaseParser.ELSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SimpleCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSimpleCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSimpleCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSimpleCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnReferenceContext extends PrimaryExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColumnReferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterColumnReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitColumnReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitColumnReference(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NullLiteralContext extends PrimaryExpressionContext {
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public NullLiteralContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNullLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNullLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNullLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RowConstructorContext extends PrimaryExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public RowConstructorContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRowConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRowConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRowConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubscriptContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext value;
		public ValueExpressionContext index;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public SubscriptContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSubscript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSubscript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSubscript(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubqueryExpressionContext extends PrimaryExpressionContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public SubqueryExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSubqueryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSubqueryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSubqueryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinaryLiteralContext extends PrimaryExpressionContext {
		public TerminalNode BINARY_LITERAL() { return getToken(SqlBaseParser.BINARY_LITERAL, 0); }
		public BinaryLiteralContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBinaryLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBinaryLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBinaryLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CurrentUserContext extends PrimaryExpressionContext {
		public Token name;
		public TerminalNode CURRENT_USER() { return getToken(SqlBaseParser.CURRENT_USER, 0); }
		public CurrentUserContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCurrentUser(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCurrentUser(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCurrentUser(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExtractContext extends PrimaryExpressionContext {
		public TerminalNode EXTRACT() { return getToken(SqlBaseParser.EXTRACT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public ExtractContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExtract(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExtract(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExtract(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringLiteralContext extends PrimaryExpressionContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public StringLiteralContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayConstructorContext extends PrimaryExpressionContext {
		public TerminalNode ARRAY() { return getToken(SqlBaseParser.ARRAY, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayConstructorContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterArrayConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitArrayConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitArrayConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallContext extends PrimaryExpressionContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public FilterContext filter() {
			return getRuleContext(FilterContext.class,0);
		}
		public OverContext over() {
			return getRuleContext(OverContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ORDER() { return getToken(SqlBaseParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public NullTreatmentContext nullTreatment() {
			return getRuleContext(NullTreatmentContext.class,0);
		}
		public FunctionCallContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExistsContext extends PrimaryExpressionContext {
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public ExistsContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExists(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExists(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExists(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PositionContext extends PrimaryExpressionContext {
		public TerminalNode POSITION() { return getToken(SqlBaseParser.POSITION, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public PositionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPosition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPosition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SearchedCaseContext extends PrimaryExpressionContext {
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(SqlBaseParser.CASE, 0); }
		public TerminalNode END() { return getToken(SqlBaseParser.END, 0); }
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SqlBaseParser.ELSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SearchedCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSearchedCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSearchedCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSearchedCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GroupingOperationContext extends PrimaryExpressionContext {
		public TerminalNode GROUPING() { return getToken(SqlBaseParser.GROUPING, 0); }
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public GroupingOperationContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterGroupingOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitGroupingOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitGroupingOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		return primaryExpression(0);
	}

	private PrimaryExpressionContext primaryExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, _parentState);
		PrimaryExpressionContext _prevctx = _localctx;
		int _startState = 100;
		enterRecursionRule(_localctx, 100, RULE_primaryExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1608);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
			case 1:
				{
				_localctx = new NullLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1370);
				match(NULL);
				}
				break;
			case 2:
				{
				_localctx = new IntervalLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1371);
				interval();
				}
				break;
			case 3:
				{
				_localctx = new TypeConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1372);
				identifier();
				setState(1373);
				string();
				}
				break;
			case 4:
				{
				_localctx = new TypeConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1375);
				match(DOUBLE_PRECISION);
				setState(1376);
				string();
				}
				break;
			case 5:
				{
				_localctx = new NumericLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1377);
				number();
				}
				break;
			case 6:
				{
				_localctx = new BooleanLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1378);
				booleanValue();
				}
				break;
			case 7:
				{
				_localctx = new StringLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1379);
				string();
				}
				break;
			case 8:
				{
				_localctx = new BinaryLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1380);
				match(BINARY_LITERAL);
				}
				break;
			case 9:
				{
				_localctx = new ParameterContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1381);
				match(T__4);
				}
				break;
			case 10:
				{
				_localctx = new PositionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1382);
				match(POSITION);
				setState(1383);
				match(T__1);
				setState(1384);
				valueExpression(0);
				setState(1385);
				match(IN);
				setState(1386);
				valueExpression(0);
				setState(1387);
				match(T__2);
				}
				break;
			case 11:
				{
				_localctx = new RowConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1389);
				match(T__1);
				setState(1390);
				expression();
				setState(1393); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1391);
					match(T__3);
					setState(1392);
					expression();
					}
					}
					setState(1395); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__3 );
				setState(1397);
				match(T__2);
				}
				break;
			case 12:
				{
				_localctx = new RowConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1399);
				match(ROW);
				setState(1400);
				match(T__1);
				setState(1401);
				expression();
				setState(1406);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1402);
					match(T__3);
					setState(1403);
					expression();
					}
					}
					setState(1408);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1409);
				match(T__2);
				}
				break;
			case 13:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1411);
				qualifiedName();
				setState(1412);
				match(T__1);
				setState(1413);
				match(ASTERISK);
				setState(1414);
				match(T__2);
				setState(1416);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
				case 1:
					{
					setState(1415);
					filter();
					}
					break;
				}
				setState(1419);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
				case 1:
					{
					setState(1418);
					over();
					}
					break;
				}
				}
				break;
			case 14:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1421);
				qualifiedName();
				setState(1422);
				match(T__1);
				setState(1434);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << ADD) | (1L << ADMIN) | (1L << ALL) | (1L << ANALYZE) | (1L << ANY) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << BERNOULLI) | (1L << CALL) | (1L << CALLED) | (1L << CASCADE) | (1L << CASE) | (1L << CAST) | (1L << CATALOGS) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << CURRENT_DATE) | (1L << CURRENT_ROLE) | (1L << CURRENT_TIME) | (1L << CURRENT_TIMESTAMP) | (1L << CURRENT_USER) | (1L << DATA) | (1L << DATE) | (1L << DAY) | (1L << DEFINER) | (1L << DESC) | (1L << DETERMINISTIC) | (1L << DISTINCT) | (1L << DISTRIBUTED) | (1L << EXCLUDING) | (1L << EXISTS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (EXPLAIN - 64)) | (1L << (EXTRACT - 64)) | (1L << (EXTERNAL - 64)) | (1L << (FALSE - 64)) | (1L << (FETCH - 64)) | (1L << (FILTER - 64)) | (1L << (FIRST - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FORMAT - 64)) | (1L << (FUNCTION - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GRANT - 64)) | (1L << (GRANTED - 64)) | (1L << (GRANTS - 64)) | (1L << (GRAPHVIZ - 64)) | (1L << (GROUPING - 64)) | (1L << (GROUPS - 64)) | (1L << (HOUR - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (INCLUDING - 64)) | (1L << (INPUT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INVOKER - 64)) | (1L << (IO - 64)) | (1L << (ISOLATION - 64)) | (1L << (JSON - 64)) | (1L << (LANGUAGE - 64)) | (1L << (LAST - 64)) | (1L << (LATERAL - 64)) | (1L << (LEVEL - 64)) | (1L << (LIMIT - 64)) | (1L << (LOCALTIME - 64)) | (1L << (LOCALTIMESTAMP - 64)) | (1L << (LOGICAL - 64)) | (1L << (MAP - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MINUTE - 64)) | (1L << (MONTH - 64)) | (1L << (NAME - 64)) | (1L << (NFC - 64)) | (1L << (NFD - 64)) | (1L << (NFKC - 64)) | (1L << (NFKD - 64)) | (1L << (NO - 64)) | (1L << (NONE - 64)) | (1L << (NORMALIZE - 64)) | (1L << (NOT - 64)) | (1L << (NULL - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (NULLIF - 128)) | (1L << (NULLS - 128)) | (1L << (OFFSET - 128)) | (1L << (ONLY - 128)) | (1L << (OPTION - 128)) | (1L << (ORDINALITY - 128)) | (1L << (OUTPUT - 128)) | (1L << (OVER - 128)) | (1L << (PARTITION - 128)) | (1L << (PARTITIONS - 128)) | (1L << (POSITION - 128)) | (1L << (PRECEDING - 128)) | (1L << (PRIVILEGES - 128)) | (1L << (PROPERTIES - 128)) | (1L << (RANGE - 128)) | (1L << (READ - 128)) | (1L << (REFRESH - 128)) | (1L << (RENAME - 128)) | (1L << (REPEATABLE - 128)) | (1L << (REPLACE - 128)) | (1L << (RESET - 128)) | (1L << (RESPECT - 128)) | (1L << (RESTRICT - 128)) | (1L << (RETURN - 128)) | (1L << (RETURNS - 128)) | (1L << (REVOKE - 128)) | (1L << (ROLE - 128)) | (1L << (ROLES - 128)) | (1L << (ROLLBACK - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (SCHEMA - 128)) | (1L << (SCHEMAS - 128)) | (1L << (SECOND - 128)) | (1L << (SECURITY - 128)) | (1L << (SERIALIZABLE - 128)) | (1L << (SESSION - 128)) | (1L << (SET - 128)) | (1L << (SETS - 128)) | (1L << (SHOW - 128)) | (1L << (SOME - 128)) | (1L << (SQL - 128)) | (1L << (START - 128)) | (1L << (STATS - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLES - 128)) | (1L << (TABLESAMPLE - 128)) | (1L << (TEMPORARY - 128)) | (1L << (TEXT - 128)) | (1L << (TIME - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (TRANSACTION - 192)) | (1L << (TRUE - 192)) | (1L << (TRUNCATE - 192)) | (1L << (TRY_CAST - 192)) | (1L << (TYPE - 192)) | (1L << (UNBOUNDED - 192)) | (1L << (UNCOMMITTED - 192)) | (1L << (USE - 192)) | (1L << (USER - 192)) | (1L << (VALIDATE - 192)) | (1L << (VERBOSE - 192)) | (1L << (VIEW - 192)) | (1L << (WORK - 192)) | (1L << (WRITE - 192)) | (1L << (YEAR - 192)) | (1L << (ZONE - 192)) | (1L << (PLUS - 192)) | (1L << (MINUS - 192)) | (1L << (STRING - 192)) | (1L << (UNICODE_STRING - 192)) | (1L << (BINARY_LITERAL - 192)) | (1L << (INTEGER_VALUE - 192)) | (1L << (DECIMAL_VALUE - 192)) | (1L << (DOUBLE_VALUE - 192)) | (1L << (IDENTIFIER - 192)) | (1L << (DIGIT_IDENTIFIER - 192)) | (1L << (QUOTED_IDENTIFIER - 192)) | (1L << (BACKQUOTED_IDENTIFIER - 192)) | (1L << (DOUBLE_PRECISION - 192)))) != 0)) {
					{
					setState(1424);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
					case 1:
						{
						setState(1423);
						setQuantifier();
						}
						break;
					}
					setState(1426);
					expression();
					setState(1431);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1427);
						match(T__3);
						setState(1428);
						expression();
						}
						}
						setState(1433);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1446);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ORDER) {
					{
					setState(1436);
					match(ORDER);
					setState(1437);
					match(BY);
					setState(1438);
					sortItem();
					setState(1443);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1439);
						match(T__3);
						setState(1440);
						sortItem();
						}
						}
						setState(1445);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1448);
				match(T__2);
				setState(1450);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
				case 1:
					{
					setState(1449);
					filter();
					}
					break;
				}
				setState(1456);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
				case 1:
					{
					setState(1453);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IGNORE || _la==RESPECT) {
						{
						setState(1452);
						nullTreatment();
						}
					}

					setState(1455);
					over();
					}
					break;
				}
				}
				break;
			case 15:
				{
				_localctx = new LambdaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1458);
				identifier();
				setState(1459);
				match(T__5);
				setState(1460);
				expression();
				}
				break;
			case 16:
				{
				_localctx = new LambdaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1462);
				match(T__1);
				setState(1471);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ADMIN) | (1L << ALL) | (1L << ANALYZE) | (1L << ANY) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << BERNOULLI) | (1L << CALL) | (1L << CALLED) | (1L << CASCADE) | (1L << CATALOGS) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << CURRENT_ROLE) | (1L << DATA) | (1L << DATE) | (1L << DAY) | (1L << DEFINER) | (1L << DESC) | (1L << DETERMINISTIC) | (1L << DISTRIBUTED) | (1L << EXCLUDING))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (EXPLAIN - 64)) | (1L << (EXTERNAL - 64)) | (1L << (FETCH - 64)) | (1L << (FILTER - 64)) | (1L << (FIRST - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FORMAT - 64)) | (1L << (FUNCTION - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GRANT - 64)) | (1L << (GRANTED - 64)) | (1L << (GRANTS - 64)) | (1L << (GRAPHVIZ - 64)) | (1L << (GROUPS - 64)) | (1L << (HOUR - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (INCLUDING - 64)) | (1L << (INPUT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INVOKER - 64)) | (1L << (IO - 64)) | (1L << (ISOLATION - 64)) | (1L << (JSON - 64)) | (1L << (LANGUAGE - 64)) | (1L << (LAST - 64)) | (1L << (LATERAL - 64)) | (1L << (LEVEL - 64)) | (1L << (LIMIT - 64)) | (1L << (LOGICAL - 64)) | (1L << (MAP - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MINUTE - 64)) | (1L << (MONTH - 64)) | (1L << (NAME - 64)) | (1L << (NFC - 64)) | (1L << (NFD - 64)) | (1L << (NFKC - 64)) | (1L << (NFKD - 64)) | (1L << (NO - 64)) | (1L << (NONE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (NULLIF - 128)) | (1L << (NULLS - 128)) | (1L << (OFFSET - 128)) | (1L << (ONLY - 128)) | (1L << (OPTION - 128)) | (1L << (ORDINALITY - 128)) | (1L << (OUTPUT - 128)) | (1L << (OVER - 128)) | (1L << (PARTITION - 128)) | (1L << (PARTITIONS - 128)) | (1L << (POSITION - 128)) | (1L << (PRECEDING - 128)) | (1L << (PRIVILEGES - 128)) | (1L << (PROPERTIES - 128)) | (1L << (RANGE - 128)) | (1L << (READ - 128)) | (1L << (REFRESH - 128)) | (1L << (RENAME - 128)) | (1L << (REPEATABLE - 128)) | (1L << (REPLACE - 128)) | (1L << (RESET - 128)) | (1L << (RESPECT - 128)) | (1L << (RESTRICT - 128)) | (1L << (RETURN - 128)) | (1L << (RETURNS - 128)) | (1L << (REVOKE - 128)) | (1L << (ROLE - 128)) | (1L << (ROLES - 128)) | (1L << (ROLLBACK - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (SCHEMA - 128)) | (1L << (SCHEMAS - 128)) | (1L << (SECOND - 128)) | (1L << (SECURITY - 128)) | (1L << (SERIALIZABLE - 128)) | (1L << (SESSION - 128)) | (1L << (SET - 128)) | (1L << (SETS - 128)) | (1L << (SHOW - 128)) | (1L << (SOME - 128)) | (1L << (SQL - 128)) | (1L << (START - 128)) | (1L << (STATS - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLES - 128)) | (1L << (TABLESAMPLE - 128)) | (1L << (TEMPORARY - 128)) | (1L << (TEXT - 128)) | (1L << (TIME - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (TRANSACTION - 192)) | (1L << (TRUNCATE - 192)) | (1L << (TRY_CAST - 192)) | (1L << (TYPE - 192)) | (1L << (UNBOUNDED - 192)) | (1L << (UNCOMMITTED - 192)) | (1L << (USE - 192)) | (1L << (USER - 192)) | (1L << (VALIDATE - 192)) | (1L << (VERBOSE - 192)) | (1L << (VIEW - 192)) | (1L << (WORK - 192)) | (1L << (WRITE - 192)) | (1L << (YEAR - 192)) | (1L << (ZONE - 192)) | (1L << (IDENTIFIER - 192)) | (1L << (DIGIT_IDENTIFIER - 192)) | (1L << (QUOTED_IDENTIFIER - 192)) | (1L << (BACKQUOTED_IDENTIFIER - 192)))) != 0)) {
					{
					setState(1463);
					identifier();
					setState(1468);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1464);
						match(T__3);
						setState(1465);
						identifier();
						}
						}
						setState(1470);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1473);
				match(T__2);
				setState(1474);
				match(T__5);
				setState(1475);
				expression();
				}
				break;
			case 17:
				{
				_localctx = new SubqueryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1476);
				match(T__1);
				setState(1477);
				query();
				setState(1478);
				match(T__2);
				}
				break;
			case 18:
				{
				_localctx = new ExistsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1480);
				match(EXISTS);
				setState(1481);
				match(T__1);
				setState(1482);
				query();
				setState(1483);
				match(T__2);
				}
				break;
			case 19:
				{
				_localctx = new SimpleCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1485);
				match(CASE);
				setState(1486);
				valueExpression(0);
				setState(1488); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1487);
					whenClause();
					}
					}
					setState(1490); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(1494);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(1492);
					match(ELSE);
					setState(1493);
					((SimpleCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(1496);
				match(END);
				}
				break;
			case 20:
				{
				_localctx = new SearchedCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1498);
				match(CASE);
				setState(1500); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1499);
					whenClause();
					}
					}
					setState(1502); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(1506);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(1504);
					match(ELSE);
					setState(1505);
					((SearchedCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(1508);
				match(END);
				}
				break;
			case 21:
				{
				_localctx = new CastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1510);
				match(CAST);
				setState(1511);
				match(T__1);
				setState(1512);
				expression();
				setState(1513);
				match(AS);
				setState(1514);
				type(0);
				setState(1515);
				match(T__2);
				}
				break;
			case 22:
				{
				_localctx = new CastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1517);
				match(TRY_CAST);
				setState(1518);
				match(T__1);
				setState(1519);
				expression();
				setState(1520);
				match(AS);
				setState(1521);
				type(0);
				setState(1522);
				match(T__2);
				}
				break;
			case 23:
				{
				_localctx = new ArrayConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1524);
				match(ARRAY);
				setState(1525);
				match(T__6);
				setState(1534);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << ADD) | (1L << ADMIN) | (1L << ALL) | (1L << ANALYZE) | (1L << ANY) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << BERNOULLI) | (1L << CALL) | (1L << CALLED) | (1L << CASCADE) | (1L << CASE) | (1L << CAST) | (1L << CATALOGS) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << CURRENT_DATE) | (1L << CURRENT_ROLE) | (1L << CURRENT_TIME) | (1L << CURRENT_TIMESTAMP) | (1L << CURRENT_USER) | (1L << DATA) | (1L << DATE) | (1L << DAY) | (1L << DEFINER) | (1L << DESC) | (1L << DETERMINISTIC) | (1L << DISTRIBUTED) | (1L << EXCLUDING) | (1L << EXISTS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (EXPLAIN - 64)) | (1L << (EXTRACT - 64)) | (1L << (EXTERNAL - 64)) | (1L << (FALSE - 64)) | (1L << (FETCH - 64)) | (1L << (FILTER - 64)) | (1L << (FIRST - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FORMAT - 64)) | (1L << (FUNCTION - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GRANT - 64)) | (1L << (GRANTED - 64)) | (1L << (GRANTS - 64)) | (1L << (GRAPHVIZ - 64)) | (1L << (GROUPING - 64)) | (1L << (GROUPS - 64)) | (1L << (HOUR - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (INCLUDING - 64)) | (1L << (INPUT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INVOKER - 64)) | (1L << (IO - 64)) | (1L << (ISOLATION - 64)) | (1L << (JSON - 64)) | (1L << (LANGUAGE - 64)) | (1L << (LAST - 64)) | (1L << (LATERAL - 64)) | (1L << (LEVEL - 64)) | (1L << (LIMIT - 64)) | (1L << (LOCALTIME - 64)) | (1L << (LOCALTIMESTAMP - 64)) | (1L << (LOGICAL - 64)) | (1L << (MAP - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MINUTE - 64)) | (1L << (MONTH - 64)) | (1L << (NAME - 64)) | (1L << (NFC - 64)) | (1L << (NFD - 64)) | (1L << (NFKC - 64)) | (1L << (NFKD - 64)) | (1L << (NO - 64)) | (1L << (NONE - 64)) | (1L << (NORMALIZE - 64)) | (1L << (NOT - 64)) | (1L << (NULL - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (NULLIF - 128)) | (1L << (NULLS - 128)) | (1L << (OFFSET - 128)) | (1L << (ONLY - 128)) | (1L << (OPTION - 128)) | (1L << (ORDINALITY - 128)) | (1L << (OUTPUT - 128)) | (1L << (OVER - 128)) | (1L << (PARTITION - 128)) | (1L << (PARTITIONS - 128)) | (1L << (POSITION - 128)) | (1L << (PRECEDING - 128)) | (1L << (PRIVILEGES - 128)) | (1L << (PROPERTIES - 128)) | (1L << (RANGE - 128)) | (1L << (READ - 128)) | (1L << (REFRESH - 128)) | (1L << (RENAME - 128)) | (1L << (REPEATABLE - 128)) | (1L << (REPLACE - 128)) | (1L << (RESET - 128)) | (1L << (RESPECT - 128)) | (1L << (RESTRICT - 128)) | (1L << (RETURN - 128)) | (1L << (RETURNS - 128)) | (1L << (REVOKE - 128)) | (1L << (ROLE - 128)) | (1L << (ROLES - 128)) | (1L << (ROLLBACK - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (SCHEMA - 128)) | (1L << (SCHEMAS - 128)) | (1L << (SECOND - 128)) | (1L << (SECURITY - 128)) | (1L << (SERIALIZABLE - 128)) | (1L << (SESSION - 128)) | (1L << (SET - 128)) | (1L << (SETS - 128)) | (1L << (SHOW - 128)) | (1L << (SOME - 128)) | (1L << (SQL - 128)) | (1L << (START - 128)) | (1L << (STATS - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLES - 128)) | (1L << (TABLESAMPLE - 128)) | (1L << (TEMPORARY - 128)) | (1L << (TEXT - 128)) | (1L << (TIME - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (TRANSACTION - 192)) | (1L << (TRUE - 192)) | (1L << (TRUNCATE - 192)) | (1L << (TRY_CAST - 192)) | (1L << (TYPE - 192)) | (1L << (UNBOUNDED - 192)) | (1L << (UNCOMMITTED - 192)) | (1L << (USE - 192)) | (1L << (USER - 192)) | (1L << (VALIDATE - 192)) | (1L << (VERBOSE - 192)) | (1L << (VIEW - 192)) | (1L << (WORK - 192)) | (1L << (WRITE - 192)) | (1L << (YEAR - 192)) | (1L << (ZONE - 192)) | (1L << (PLUS - 192)) | (1L << (MINUS - 192)) | (1L << (STRING - 192)) | (1L << (UNICODE_STRING - 192)) | (1L << (BINARY_LITERAL - 192)) | (1L << (INTEGER_VALUE - 192)) | (1L << (DECIMAL_VALUE - 192)) | (1L << (DOUBLE_VALUE - 192)) | (1L << (IDENTIFIER - 192)) | (1L << (DIGIT_IDENTIFIER - 192)) | (1L << (QUOTED_IDENTIFIER - 192)) | (1L << (BACKQUOTED_IDENTIFIER - 192)) | (1L << (DOUBLE_PRECISION - 192)))) != 0)) {
					{
					setState(1526);
					expression();
					setState(1531);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1527);
						match(T__3);
						setState(1528);
						expression();
						}
						}
						setState(1533);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1536);
				match(T__7);
				}
				break;
			case 24:
				{
				_localctx = new ColumnReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1537);
				identifier();
				}
				break;
			case 25:
				{
				_localctx = new SpecialDateTimeFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1538);
				((SpecialDateTimeFunctionContext)_localctx).name = match(CURRENT_DATE);
				}
				break;
			case 26:
				{
				_localctx = new SpecialDateTimeFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1539);
				((SpecialDateTimeFunctionContext)_localctx).name = match(CURRENT_TIME);
				setState(1543);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
				case 1:
					{
					setState(1540);
					match(T__1);
					setState(1541);
					((SpecialDateTimeFunctionContext)_localctx).precision = match(INTEGER_VALUE);
					setState(1542);
					match(T__2);
					}
					break;
				}
				}
				break;
			case 27:
				{
				_localctx = new SpecialDateTimeFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1545);
				((SpecialDateTimeFunctionContext)_localctx).name = match(CURRENT_TIMESTAMP);
				setState(1549);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
				case 1:
					{
					setState(1546);
					match(T__1);
					setState(1547);
					((SpecialDateTimeFunctionContext)_localctx).precision = match(INTEGER_VALUE);
					setState(1548);
					match(T__2);
					}
					break;
				}
				}
				break;
			case 28:
				{
				_localctx = new SpecialDateTimeFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1551);
				((SpecialDateTimeFunctionContext)_localctx).name = match(LOCALTIME);
				setState(1555);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
				case 1:
					{
					setState(1552);
					match(T__1);
					setState(1553);
					((SpecialDateTimeFunctionContext)_localctx).precision = match(INTEGER_VALUE);
					setState(1554);
					match(T__2);
					}
					break;
				}
				}
				break;
			case 29:
				{
				_localctx = new SpecialDateTimeFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1557);
				((SpecialDateTimeFunctionContext)_localctx).name = match(LOCALTIMESTAMP);
				setState(1561);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
				case 1:
					{
					setState(1558);
					match(T__1);
					setState(1559);
					((SpecialDateTimeFunctionContext)_localctx).precision = match(INTEGER_VALUE);
					setState(1560);
					match(T__2);
					}
					break;
				}
				}
				break;
			case 30:
				{
				_localctx = new CurrentUserContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1563);
				((CurrentUserContext)_localctx).name = match(CURRENT_USER);
				}
				break;
			case 31:
				{
				_localctx = new SubstringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1564);
				match(SUBSTRING);
				setState(1565);
				match(T__1);
				setState(1566);
				valueExpression(0);
				setState(1567);
				match(FROM);
				setState(1568);
				valueExpression(0);
				setState(1571);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FOR) {
					{
					setState(1569);
					match(FOR);
					setState(1570);
					valueExpression(0);
					}
				}

				setState(1573);
				match(T__2);
				}
				break;
			case 32:
				{
				_localctx = new NormalizeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1575);
				match(NORMALIZE);
				setState(1576);
				match(T__1);
				setState(1577);
				valueExpression(0);
				setState(1580);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(1578);
					match(T__3);
					setState(1579);
					normalForm();
					}
				}

				setState(1582);
				match(T__2);
				}
				break;
			case 33:
				{
				_localctx = new ExtractContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1584);
				match(EXTRACT);
				setState(1585);
				match(T__1);
				setState(1586);
				identifier();
				setState(1587);
				match(FROM);
				setState(1588);
				valueExpression(0);
				setState(1589);
				match(T__2);
				}
				break;
			case 34:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1591);
				match(T__1);
				setState(1592);
				expression();
				setState(1593);
				match(T__2);
				}
				break;
			case 35:
				{
				_localctx = new GroupingOperationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1595);
				match(GROUPING);
				setState(1596);
				match(T__1);
				setState(1605);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ADMIN) | (1L << ALL) | (1L << ANALYZE) | (1L << ANY) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << BERNOULLI) | (1L << CALL) | (1L << CALLED) | (1L << CASCADE) | (1L << CATALOGS) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << CURRENT_ROLE) | (1L << DATA) | (1L << DATE) | (1L << DAY) | (1L << DEFINER) | (1L << DESC) | (1L << DETERMINISTIC) | (1L << DISTRIBUTED) | (1L << EXCLUDING))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (EXPLAIN - 64)) | (1L << (EXTERNAL - 64)) | (1L << (FETCH - 64)) | (1L << (FILTER - 64)) | (1L << (FIRST - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FORMAT - 64)) | (1L << (FUNCTION - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GRANT - 64)) | (1L << (GRANTED - 64)) | (1L << (GRANTS - 64)) | (1L << (GRAPHVIZ - 64)) | (1L << (GROUPS - 64)) | (1L << (HOUR - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (INCLUDING - 64)) | (1L << (INPUT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INVOKER - 64)) | (1L << (IO - 64)) | (1L << (ISOLATION - 64)) | (1L << (JSON - 64)) | (1L << (LANGUAGE - 64)) | (1L << (LAST - 64)) | (1L << (LATERAL - 64)) | (1L << (LEVEL - 64)) | (1L << (LIMIT - 64)) | (1L << (LOGICAL - 64)) | (1L << (MAP - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MINUTE - 64)) | (1L << (MONTH - 64)) | (1L << (NAME - 64)) | (1L << (NFC - 64)) | (1L << (NFD - 64)) | (1L << (NFKC - 64)) | (1L << (NFKD - 64)) | (1L << (NO - 64)) | (1L << (NONE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (NULLIF - 128)) | (1L << (NULLS - 128)) | (1L << (OFFSET - 128)) | (1L << (ONLY - 128)) | (1L << (OPTION - 128)) | (1L << (ORDINALITY - 128)) | (1L << (OUTPUT - 128)) | (1L << (OVER - 128)) | (1L << (PARTITION - 128)) | (1L << (PARTITIONS - 128)) | (1L << (POSITION - 128)) | (1L << (PRECEDING - 128)) | (1L << (PRIVILEGES - 128)) | (1L << (PROPERTIES - 128)) | (1L << (RANGE - 128)) | (1L << (READ - 128)) | (1L << (REFRESH - 128)) | (1L << (RENAME - 128)) | (1L << (REPEATABLE - 128)) | (1L << (REPLACE - 128)) | (1L << (RESET - 128)) | (1L << (RESPECT - 128)) | (1L << (RESTRICT - 128)) | (1L << (RETURN - 128)) | (1L << (RETURNS - 128)) | (1L << (REVOKE - 128)) | (1L << (ROLE - 128)) | (1L << (ROLES - 128)) | (1L << (ROLLBACK - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (SCHEMA - 128)) | (1L << (SCHEMAS - 128)) | (1L << (SECOND - 128)) | (1L << (SECURITY - 128)) | (1L << (SERIALIZABLE - 128)) | (1L << (SESSION - 128)) | (1L << (SET - 128)) | (1L << (SETS - 128)) | (1L << (SHOW - 128)) | (1L << (SOME - 128)) | (1L << (SQL - 128)) | (1L << (START - 128)) | (1L << (STATS - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLES - 128)) | (1L << (TABLESAMPLE - 128)) | (1L << (TEMPORARY - 128)) | (1L << (TEXT - 128)) | (1L << (TIME - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (TRANSACTION - 192)) | (1L << (TRUNCATE - 192)) | (1L << (TRY_CAST - 192)) | (1L << (TYPE - 192)) | (1L << (UNBOUNDED - 192)) | (1L << (UNCOMMITTED - 192)) | (1L << (USE - 192)) | (1L << (USER - 192)) | (1L << (VALIDATE - 192)) | (1L << (VERBOSE - 192)) | (1L << (VIEW - 192)) | (1L << (WORK - 192)) | (1L << (WRITE - 192)) | (1L << (YEAR - 192)) | (1L << (ZONE - 192)) | (1L << (IDENTIFIER - 192)) | (1L << (DIGIT_IDENTIFIER - 192)) | (1L << (QUOTED_IDENTIFIER - 192)) | (1L << (BACKQUOTED_IDENTIFIER - 192)))) != 0)) {
					{
					setState(1597);
					qualifiedName();
					setState(1602);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1598);
						match(T__3);
						setState(1599);
						qualifiedName();
						}
						}
						setState(1604);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1607);
				match(T__2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1620);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,208,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1618);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
					case 1:
						{
						_localctx = new SubscriptContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((SubscriptContext)_localctx).value = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(1610);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1611);
						match(T__6);
						setState(1612);
						((SubscriptContext)_localctx).index = valueExpression(0);
						setState(1613);
						match(T__7);
						}
						break;
					case 2:
						{
						_localctx = new DereferenceContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((DereferenceContext)_localctx).base = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(1615);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1616);
						match(T__0);
						setState(1617);
						((DereferenceContext)_localctx).fieldName = identifier();
						}
						break;
					}
					} 
				}
				setState(1622);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,208,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class StringContext extends ParserRuleContext {
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
	 
		public StringContext() { }
		public void copyFrom(StringContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UnicodeStringLiteralContext extends StringContext {
		public TerminalNode UNICODE_STRING() { return getToken(SqlBaseParser.UNICODE_STRING, 0); }
		public TerminalNode UESCAPE() { return getToken(SqlBaseParser.UESCAPE, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public UnicodeStringLiteralContext(StringContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUnicodeStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUnicodeStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUnicodeStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BasicStringLiteralContext extends StringContext {
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public BasicStringLiteralContext(StringContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBasicStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBasicStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBasicStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_string);
		try {
			setState(1629);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				_localctx = new BasicStringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1623);
				match(STRING);
				}
				break;
			case UNICODE_STRING:
				_localctx = new UnicodeStringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1624);
				match(UNICODE_STRING);
				setState(1627);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
				case 1:
					{
					setState(1625);
					match(UESCAPE);
					setState(1626);
					match(STRING);
					}
					break;
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

	public static class NullTreatmentContext extends ParserRuleContext {
		public TerminalNode IGNORE() { return getToken(SqlBaseParser.IGNORE, 0); }
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public TerminalNode RESPECT() { return getToken(SqlBaseParser.RESPECT, 0); }
		public NullTreatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullTreatment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNullTreatment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNullTreatment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNullTreatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NullTreatmentContext nullTreatment() throws RecognitionException {
		NullTreatmentContext _localctx = new NullTreatmentContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_nullTreatment);
		try {
			setState(1635);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IGNORE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1631);
				match(IGNORE);
				setState(1632);
				match(NULLS);
				}
				break;
			case RESPECT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1633);
				match(RESPECT);
				setState(1634);
				match(NULLS);
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

	public static class TimeZoneSpecifierContext extends ParserRuleContext {
		public TimeZoneSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeZoneSpecifier; }
	 
		public TimeZoneSpecifierContext() { }
		public void copyFrom(TimeZoneSpecifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TimeZoneIntervalContext extends TimeZoneSpecifierContext {
		public TerminalNode TIME() { return getToken(SqlBaseParser.TIME, 0); }
		public TerminalNode ZONE() { return getToken(SqlBaseParser.ZONE, 0); }
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public TimeZoneIntervalContext(TimeZoneSpecifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTimeZoneInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTimeZoneInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTimeZoneInterval(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TimeZoneStringContext extends TimeZoneSpecifierContext {
		public TerminalNode TIME() { return getToken(SqlBaseParser.TIME, 0); }
		public TerminalNode ZONE() { return getToken(SqlBaseParser.ZONE, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TimeZoneStringContext(TimeZoneSpecifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTimeZoneString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTimeZoneString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTimeZoneString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeZoneSpecifierContext timeZoneSpecifier() throws RecognitionException {
		TimeZoneSpecifierContext _localctx = new TimeZoneSpecifierContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_timeZoneSpecifier);
		try {
			setState(1643);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
			case 1:
				_localctx = new TimeZoneIntervalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1637);
				match(TIME);
				setState(1638);
				match(ZONE);
				setState(1639);
				interval();
				}
				break;
			case 2:
				_localctx = new TimeZoneStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1640);
				match(TIME);
				setState(1641);
				match(ZONE);
				setState(1642);
				string();
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

	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(SqlBaseParser.NEQ, 0); }
		public TerminalNode LT() { return getToken(SqlBaseParser.LT, 0); }
		public TerminalNode LTE() { return getToken(SqlBaseParser.LTE, 0); }
		public TerminalNode GT() { return getToken(SqlBaseParser.GT, 0); }
		public TerminalNode GTE() { return getToken(SqlBaseParser.GTE, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitComparisonOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1645);
			_la = _input.LA(1);
			if ( !(((((_la - 216)) & ~0x3f) == 0 && ((1L << (_la - 216)) & ((1L << (EQ - 216)) | (1L << (NEQ - 216)) | (1L << (LT - 216)) | (1L << (LTE - 216)) | (1L << (GT - 216)) | (1L << (GTE - 216)))) != 0)) ) {
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

	public static class ComparisonQuantifierContext extends ParserRuleContext {
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public TerminalNode SOME() { return getToken(SqlBaseParser.SOME, 0); }
		public TerminalNode ANY() { return getToken(SqlBaseParser.ANY, 0); }
		public ComparisonQuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonQuantifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterComparisonQuantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitComparisonQuantifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitComparisonQuantifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonQuantifierContext comparisonQuantifier() throws RecognitionException {
		ComparisonQuantifierContext _localctx = new ComparisonQuantifierContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_comparisonQuantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1647);
			_la = _input.LA(1);
			if ( !(_la==ALL || _la==ANY || _la==SOME) ) {
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

	public static class BooleanValueContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(SqlBaseParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SqlBaseParser.FALSE, 0); }
		public BooleanValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBooleanValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBooleanValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBooleanValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanValueContext booleanValue() throws RecognitionException {
		BooleanValueContext _localctx = new BooleanValueContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_booleanValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1649);
			_la = _input.LA(1);
			if ( !(_la==FALSE || _la==TRUE) ) {
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

	public static class IntervalContext extends ParserRuleContext {
		public Token sign;
		public IntervalFieldContext from;
		public IntervalFieldContext to;
		public TerminalNode INTERVAL() { return getToken(SqlBaseParser.INTERVAL, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public List<IntervalFieldContext> intervalField() {
			return getRuleContexts(IntervalFieldContext.class);
		}
		public IntervalFieldContext intervalField(int i) {
			return getRuleContext(IntervalFieldContext.class,i);
		}
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public TerminalNode PLUS() { return getToken(SqlBaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public IntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalContext interval() throws RecognitionException {
		IntervalContext _localctx = new IntervalContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_interval);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1651);
			match(INTERVAL);
			setState(1653);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(1652);
				((IntervalContext)_localctx).sign = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((IntervalContext)_localctx).sign = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1655);
			string();
			setState(1656);
			((IntervalContext)_localctx).from = intervalField();
			setState(1659);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
			case 1:
				{
				setState(1657);
				match(TO);
				setState(1658);
				((IntervalContext)_localctx).to = intervalField();
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

	public static class IntervalFieldContext extends ParserRuleContext {
		public TerminalNode YEAR() { return getToken(SqlBaseParser.YEAR, 0); }
		public TerminalNode MONTH() { return getToken(SqlBaseParser.MONTH, 0); }
		public TerminalNode DAY() { return getToken(SqlBaseParser.DAY, 0); }
		public TerminalNode HOUR() { return getToken(SqlBaseParser.HOUR, 0); }
		public TerminalNode MINUTE() { return getToken(SqlBaseParser.MINUTE, 0); }
		public TerminalNode SECOND() { return getToken(SqlBaseParser.SECOND, 0); }
		public IntervalFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIntervalField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIntervalField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIntervalField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalFieldContext intervalField() throws RecognitionException {
		IntervalFieldContext _localctx = new IntervalFieldContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_intervalField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1661);
			_la = _input.LA(1);
			if ( !(_la==DAY || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (HOUR - 86)) | (1L << (MINUTE - 86)) | (1L << (MONTH - 86)))) != 0) || _la==SECOND || _la==YEAR) ) {
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

	public static class NormalFormContext extends ParserRuleContext {
		public TerminalNode NFD() { return getToken(SqlBaseParser.NFD, 0); }
		public TerminalNode NFC() { return getToken(SqlBaseParser.NFC, 0); }
		public TerminalNode NFKD() { return getToken(SqlBaseParser.NFKD, 0); }
		public TerminalNode NFKC() { return getToken(SqlBaseParser.NFKC, 0); }
		public NormalFormContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalForm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNormalForm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNormalForm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNormalForm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalFormContext normalForm() throws RecognitionException {
		NormalFormContext _localctx = new NormalFormContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_normalForm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1663);
			_la = _input.LA(1);
			if ( !(((((_la - 119)) & ~0x3f) == 0 && ((1L << (_la - 119)) & ((1L << (NFC - 119)) | (1L << (NFD - 119)) | (1L << (NFKC - 119)) | (1L << (NFKD - 119)))) != 0)) ) {
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

	public static class TypesContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_types; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTypes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypesContext types() throws RecognitionException {
		TypesContext _localctx = new TypesContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_types);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1665);
			match(T__1);
			setState(1674);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ADMIN) | (1L << ALL) | (1L << ANALYZE) | (1L << ANY) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << BERNOULLI) | (1L << CALL) | (1L << CALLED) | (1L << CASCADE) | (1L << CATALOGS) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << CURRENT_ROLE) | (1L << DATA) | (1L << DATE) | (1L << DAY) | (1L << DEFINER) | (1L << DESC) | (1L << DETERMINISTIC) | (1L << DISTRIBUTED) | (1L << EXCLUDING))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (EXPLAIN - 64)) | (1L << (EXTERNAL - 64)) | (1L << (FETCH - 64)) | (1L << (FILTER - 64)) | (1L << (FIRST - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FORMAT - 64)) | (1L << (FUNCTION - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GRANT - 64)) | (1L << (GRANTED - 64)) | (1L << (GRANTS - 64)) | (1L << (GRAPHVIZ - 64)) | (1L << (GROUPS - 64)) | (1L << (HOUR - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (INCLUDING - 64)) | (1L << (INPUT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INVOKER - 64)) | (1L << (IO - 64)) | (1L << (ISOLATION - 64)) | (1L << (JSON - 64)) | (1L << (LANGUAGE - 64)) | (1L << (LAST - 64)) | (1L << (LATERAL - 64)) | (1L << (LEVEL - 64)) | (1L << (LIMIT - 64)) | (1L << (LOGICAL - 64)) | (1L << (MAP - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MINUTE - 64)) | (1L << (MONTH - 64)) | (1L << (NAME - 64)) | (1L << (NFC - 64)) | (1L << (NFD - 64)) | (1L << (NFKC - 64)) | (1L << (NFKD - 64)) | (1L << (NO - 64)) | (1L << (NONE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (NULLIF - 128)) | (1L << (NULLS - 128)) | (1L << (OFFSET - 128)) | (1L << (ONLY - 128)) | (1L << (OPTION - 128)) | (1L << (ORDINALITY - 128)) | (1L << (OUTPUT - 128)) | (1L << (OVER - 128)) | (1L << (PARTITION - 128)) | (1L << (PARTITIONS - 128)) | (1L << (POSITION - 128)) | (1L << (PRECEDING - 128)) | (1L << (PRIVILEGES - 128)) | (1L << (PROPERTIES - 128)) | (1L << (RANGE - 128)) | (1L << (READ - 128)) | (1L << (REFRESH - 128)) | (1L << (RENAME - 128)) | (1L << (REPEATABLE - 128)) | (1L << (REPLACE - 128)) | (1L << (RESET - 128)) | (1L << (RESPECT - 128)) | (1L << (RESTRICT - 128)) | (1L << (RETURN - 128)) | (1L << (RETURNS - 128)) | (1L << (REVOKE - 128)) | (1L << (ROLE - 128)) | (1L << (ROLES - 128)) | (1L << (ROLLBACK - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (SCHEMA - 128)) | (1L << (SCHEMAS - 128)) | (1L << (SECOND - 128)) | (1L << (SECURITY - 128)) | (1L << (SERIALIZABLE - 128)) | (1L << (SESSION - 128)) | (1L << (SET - 128)) | (1L << (SETS - 128)) | (1L << (SHOW - 128)) | (1L << (SOME - 128)) | (1L << (SQL - 128)) | (1L << (START - 128)) | (1L << (STATS - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLES - 128)) | (1L << (TABLESAMPLE - 128)) | (1L << (TEMPORARY - 128)) | (1L << (TEXT - 128)) | (1L << (TIME - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (TRANSACTION - 192)) | (1L << (TRUNCATE - 192)) | (1L << (TRY_CAST - 192)) | (1L << (TYPE - 192)) | (1L << (UNBOUNDED - 192)) | (1L << (UNCOMMITTED - 192)) | (1L << (USE - 192)) | (1L << (USER - 192)) | (1L << (VALIDATE - 192)) | (1L << (VERBOSE - 192)) | (1L << (VIEW - 192)) | (1L << (WORK - 192)) | (1L << (WRITE - 192)) | (1L << (YEAR - 192)) | (1L << (ZONE - 192)) | (1L << (IDENTIFIER - 192)) | (1L << (DIGIT_IDENTIFIER - 192)) | (1L << (QUOTED_IDENTIFIER - 192)) | (1L << (BACKQUOTED_IDENTIFIER - 192)) | (1L << (TIME_WITH_TIME_ZONE - 192)) | (1L << (TIMESTAMP_WITH_TIME_ZONE - 192)) | (1L << (DOUBLE_PRECISION - 192)))) != 0)) {
				{
				setState(1666);
				type(0);
				setState(1671);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1667);
					match(T__3);
					setState(1668);
					type(0);
					}
					}
					setState(1673);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1676);
			match(T__2);
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

	public static class TypeContext extends ParserRuleContext {
		public IntervalFieldContext from;
		public IntervalFieldContext to;
		public TerminalNode ARRAY() { return getToken(SqlBaseParser.ARRAY, 0); }
		public TerminalNode LT() { return getToken(SqlBaseParser.LT, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode GT() { return getToken(SqlBaseParser.GT, 0); }
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public BaseTypeContext baseType() {
			return getRuleContext(BaseTypeContext.class,0);
		}
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public TerminalNode INTERVAL() { return getToken(SqlBaseParser.INTERVAL, 0); }
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public List<IntervalFieldContext> intervalField() {
			return getRuleContexts(IntervalFieldContext.class);
		}
		public IntervalFieldContext intervalField(int i) {
			return getRuleContext(IntervalFieldContext.class,i);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		return type(0);
	}

	private TypeContext type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeContext _localctx = new TypeContext(_ctx, _parentState);
		TypeContext _prevctx = _localctx;
		int _startState = 122;
		enterRecursionRule(_localctx, 122, RULE_type, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1725);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
			case 1:
				{
				setState(1679);
				match(ARRAY);
				setState(1680);
				match(LT);
				setState(1681);
				type(0);
				setState(1682);
				match(GT);
				}
				break;
			case 2:
				{
				setState(1684);
				match(MAP);
				setState(1685);
				match(LT);
				setState(1686);
				type(0);
				setState(1687);
				match(T__3);
				setState(1688);
				type(0);
				setState(1689);
				match(GT);
				}
				break;
			case 3:
				{
				setState(1691);
				match(ROW);
				setState(1692);
				match(T__1);
				setState(1693);
				identifier();
				setState(1694);
				type(0);
				setState(1701);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1695);
					match(T__3);
					setState(1696);
					identifier();
					setState(1697);
					type(0);
					}
					}
					setState(1703);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1704);
				match(T__2);
				}
				break;
			case 4:
				{
				setState(1706);
				baseType();
				setState(1718);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
				case 1:
					{
					setState(1707);
					match(T__1);
					setState(1708);
					typeParameter();
					setState(1713);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1709);
						match(T__3);
						setState(1710);
						typeParameter();
						}
						}
						setState(1715);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1716);
					match(T__2);
					}
					break;
				}
				}
				break;
			case 5:
				{
				setState(1720);
				match(INTERVAL);
				setState(1721);
				((TypeContext)_localctx).from = intervalField();
				setState(1722);
				match(TO);
				setState(1723);
				((TypeContext)_localctx).to = intervalField();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1731);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,221,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_type);
					setState(1727);
					if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
					setState(1728);
					match(ARRAY);
					}
					} 
				}
				setState(1733);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,221,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TypeParameterContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTypeParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTypeParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_typeParameter);
		try {
			setState(1736);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1734);
				match(INTEGER_VALUE);
				}
				break;
			case ADD:
			case ADMIN:
			case ALL:
			case ANALYZE:
			case ANY:
			case ARRAY:
			case ASC:
			case AT:
			case BERNOULLI:
			case CALL:
			case CALLED:
			case CASCADE:
			case CATALOGS:
			case COLUMN:
			case COLUMNS:
			case COMMENT:
			case COMMIT:
			case COMMITTED:
			case CURRENT:
			case CURRENT_ROLE:
			case DATA:
			case DATE:
			case DAY:
			case DEFINER:
			case DESC:
			case DETERMINISTIC:
			case DISTRIBUTED:
			case EXCLUDING:
			case EXPLAIN:
			case EXTERNAL:
			case FETCH:
			case FILTER:
			case FIRST:
			case FOLLOWING:
			case FORMAT:
			case FUNCTION:
			case FUNCTIONS:
			case GRANT:
			case GRANTED:
			case GRANTS:
			case GRAPHVIZ:
			case GROUPS:
			case HOUR:
			case IF:
			case IGNORE:
			case INCLUDING:
			case INPUT:
			case INTERVAL:
			case INVOKER:
			case IO:
			case ISOLATION:
			case JSON:
			case LANGUAGE:
			case LAST:
			case LATERAL:
			case LEVEL:
			case LIMIT:
			case LOGICAL:
			case MAP:
			case MATERIALIZED:
			case MINUTE:
			case MONTH:
			case NAME:
			case NFC:
			case NFD:
			case NFKC:
			case NFKD:
			case NO:
			case NONE:
			case NULLIF:
			case NULLS:
			case OFFSET:
			case ONLY:
			case OPTION:
			case ORDINALITY:
			case OUTPUT:
			case OVER:
			case PARTITION:
			case PARTITIONS:
			case POSITION:
			case PRECEDING:
			case PRIVILEGES:
			case PROPERTIES:
			case RANGE:
			case READ:
			case REFRESH:
			case RENAME:
			case REPEATABLE:
			case REPLACE:
			case RESET:
			case RESPECT:
			case RESTRICT:
			case RETURN:
			case RETURNS:
			case REVOKE:
			case ROLE:
			case ROLES:
			case ROLLBACK:
			case ROW:
			case ROWS:
			case SCHEMA:
			case SCHEMAS:
			case SECOND:
			case SECURITY:
			case SERIALIZABLE:
			case SESSION:
			case SET:
			case SETS:
			case SHOW:
			case SOME:
			case SQL:
			case START:
			case STATS:
			case SUBSTRING:
			case SYSTEM:
			case TABLES:
			case TABLESAMPLE:
			case TEMPORARY:
			case TEXT:
			case TIME:
			case TIMESTAMP:
			case TO:
			case TRANSACTION:
			case TRUNCATE:
			case TRY_CAST:
			case TYPE:
			case UNBOUNDED:
			case UNCOMMITTED:
			case USE:
			case USER:
			case VALIDATE:
			case VERBOSE:
			case VIEW:
			case WORK:
			case WRITE:
			case YEAR:
			case ZONE:
			case IDENTIFIER:
			case DIGIT_IDENTIFIER:
			case QUOTED_IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
			case TIME_WITH_TIME_ZONE:
			case TIMESTAMP_WITH_TIME_ZONE:
			case DOUBLE_PRECISION:
				enterOuterAlt(_localctx, 2);
				{
				setState(1735);
				type(0);
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

	public static class BaseTypeContext extends ParserRuleContext {
		public TerminalNode TIME_WITH_TIME_ZONE() { return getToken(SqlBaseParser.TIME_WITH_TIME_ZONE, 0); }
		public TerminalNode TIMESTAMP_WITH_TIME_ZONE() { return getToken(SqlBaseParser.TIMESTAMP_WITH_TIME_ZONE, 0); }
		public TerminalNode DOUBLE_PRECISION() { return getToken(SqlBaseParser.DOUBLE_PRECISION, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public BaseTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBaseType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBaseType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBaseType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseTypeContext baseType() throws RecognitionException {
		BaseTypeContext _localctx = new BaseTypeContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_baseType);
		try {
			setState(1742);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TIME_WITH_TIME_ZONE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1738);
				match(TIME_WITH_TIME_ZONE);
				}
				break;
			case TIMESTAMP_WITH_TIME_ZONE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1739);
				match(TIMESTAMP_WITH_TIME_ZONE);
				}
				break;
			case DOUBLE_PRECISION:
				enterOuterAlt(_localctx, 3);
				{
				setState(1740);
				match(DOUBLE_PRECISION);
				}
				break;
			case ADD:
			case ADMIN:
			case ALL:
			case ANALYZE:
			case ANY:
			case ARRAY:
			case ASC:
			case AT:
			case BERNOULLI:
			case CALL:
			case CALLED:
			case CASCADE:
			case CATALOGS:
			case COLUMN:
			case COLUMNS:
			case COMMENT:
			case COMMIT:
			case COMMITTED:
			case CURRENT:
			case CURRENT_ROLE:
			case DATA:
			case DATE:
			case DAY:
			case DEFINER:
			case DESC:
			case DETERMINISTIC:
			case DISTRIBUTED:
			case EXCLUDING:
			case EXPLAIN:
			case EXTERNAL:
			case FETCH:
			case FILTER:
			case FIRST:
			case FOLLOWING:
			case FORMAT:
			case FUNCTION:
			case FUNCTIONS:
			case GRANT:
			case GRANTED:
			case GRANTS:
			case GRAPHVIZ:
			case GROUPS:
			case HOUR:
			case IF:
			case IGNORE:
			case INCLUDING:
			case INPUT:
			case INTERVAL:
			case INVOKER:
			case IO:
			case ISOLATION:
			case JSON:
			case LANGUAGE:
			case LAST:
			case LATERAL:
			case LEVEL:
			case LIMIT:
			case LOGICAL:
			case MAP:
			case MATERIALIZED:
			case MINUTE:
			case MONTH:
			case NAME:
			case NFC:
			case NFD:
			case NFKC:
			case NFKD:
			case NO:
			case NONE:
			case NULLIF:
			case NULLS:
			case OFFSET:
			case ONLY:
			case OPTION:
			case ORDINALITY:
			case OUTPUT:
			case OVER:
			case PARTITION:
			case PARTITIONS:
			case POSITION:
			case PRECEDING:
			case PRIVILEGES:
			case PROPERTIES:
			case RANGE:
			case READ:
			case REFRESH:
			case RENAME:
			case REPEATABLE:
			case REPLACE:
			case RESET:
			case RESPECT:
			case RESTRICT:
			case RETURN:
			case RETURNS:
			case REVOKE:
			case ROLE:
			case ROLES:
			case ROLLBACK:
			case ROW:
			case ROWS:
			case SCHEMA:
			case SCHEMAS:
			case SECOND:
			case SECURITY:
			case SERIALIZABLE:
			case SESSION:
			case SET:
			case SETS:
			case SHOW:
			case SOME:
			case SQL:
			case START:
			case STATS:
			case SUBSTRING:
			case SYSTEM:
			case TABLES:
			case TABLESAMPLE:
			case TEMPORARY:
			case TEXT:
			case TIME:
			case TIMESTAMP:
			case TO:
			case TRANSACTION:
			case TRUNCATE:
			case TRY_CAST:
			case TYPE:
			case UNBOUNDED:
			case UNCOMMITTED:
			case USE:
			case USER:
			case VALIDATE:
			case VERBOSE:
			case VIEW:
			case WORK:
			case WRITE:
			case YEAR:
			case ZONE:
			case IDENTIFIER:
			case DIGIT_IDENTIFIER:
			case QUOTED_IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(1741);
				qualifiedName();
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

	public static class WhenClauseContext extends ParserRuleContext {
		public ExpressionContext condition;
		public ExpressionContext result;
		public TerminalNode WHEN() { return getToken(SqlBaseParser.WHEN, 0); }
		public TerminalNode THEN() { return getToken(SqlBaseParser.THEN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public WhenClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterWhenClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitWhenClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitWhenClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenClauseContext whenClause() throws RecognitionException {
		WhenClauseContext _localctx = new WhenClauseContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_whenClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1744);
			match(WHEN);
			setState(1745);
			((WhenClauseContext)_localctx).condition = expression();
			setState(1746);
			match(THEN);
			setState(1747);
			((WhenClauseContext)_localctx).result = expression();
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

	public static class FilterContext extends ParserRuleContext {
		public TerminalNode FILTER() { return getToken(SqlBaseParser.FILTER, 0); }
		public TerminalNode WHERE() { return getToken(SqlBaseParser.WHERE, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public FilterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFilter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFilter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterContext filter() throws RecognitionException {
		FilterContext _localctx = new FilterContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_filter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1749);
			match(FILTER);
			setState(1750);
			match(T__1);
			setState(1751);
			match(WHERE);
			setState(1752);
			booleanExpression(0);
			setState(1753);
			match(T__2);
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

	public static class OverContext extends ParserRuleContext {
		public ExpressionContext expression;
		public List<ExpressionContext> partition = new ArrayList<ExpressionContext>();
		public TerminalNode OVER() { return getToken(SqlBaseParser.OVER, 0); }
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public TerminalNode ORDER() { return getToken(SqlBaseParser.ORDER, 0); }
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public WindowFrameContext windowFrame() {
			return getRuleContext(WindowFrameContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public OverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_over; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterOver(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitOver(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitOver(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OverContext over() throws RecognitionException {
		OverContext _localctx = new OverContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_over);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1755);
			match(OVER);
			setState(1756);
			match(T__1);
			setState(1767);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(1757);
				match(PARTITION);
				setState(1758);
				match(BY);
				setState(1759);
				((OverContext)_localctx).expression = expression();
				((OverContext)_localctx).partition.add(((OverContext)_localctx).expression);
				setState(1764);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1760);
					match(T__3);
					setState(1761);
					((OverContext)_localctx).expression = expression();
					((OverContext)_localctx).partition.add(((OverContext)_localctx).expression);
					}
					}
					setState(1766);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1779);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(1769);
				match(ORDER);
				setState(1770);
				match(BY);
				setState(1771);
				sortItem();
				setState(1776);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1772);
					match(T__3);
					setState(1773);
					sortItem();
					}
					}
					setState(1778);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1782);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUPS || _la==RANGE || _la==ROWS) {
				{
				setState(1781);
				windowFrame();
				}
			}

			setState(1784);
			match(T__2);
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

	public static class WindowFrameContext extends ParserRuleContext {
		public Token frameType;
		public FrameBoundContext start;
		public FrameBoundContext end;
		public TerminalNode RANGE() { return getToken(SqlBaseParser.RANGE, 0); }
		public List<FrameBoundContext> frameBound() {
			return getRuleContexts(FrameBoundContext.class);
		}
		public FrameBoundContext frameBound(int i) {
			return getRuleContext(FrameBoundContext.class,i);
		}
		public TerminalNode ROWS() { return getToken(SqlBaseParser.ROWS, 0); }
		public TerminalNode GROUPS() { return getToken(SqlBaseParser.GROUPS, 0); }
		public TerminalNode BETWEEN() { return getToken(SqlBaseParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public WindowFrameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFrame; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterWindowFrame(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitWindowFrame(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitWindowFrame(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowFrameContext windowFrame() throws RecognitionException {
		WindowFrameContext _localctx = new WindowFrameContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_windowFrame);
		try {
			setState(1810);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,229,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1786);
				((WindowFrameContext)_localctx).frameType = match(RANGE);
				setState(1787);
				((WindowFrameContext)_localctx).start = frameBound();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1788);
				((WindowFrameContext)_localctx).frameType = match(ROWS);
				setState(1789);
				((WindowFrameContext)_localctx).start = frameBound();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1790);
				((WindowFrameContext)_localctx).frameType = match(GROUPS);
				setState(1791);
				((WindowFrameContext)_localctx).start = frameBound();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1792);
				((WindowFrameContext)_localctx).frameType = match(RANGE);
				setState(1793);
				match(BETWEEN);
				setState(1794);
				((WindowFrameContext)_localctx).start = frameBound();
				setState(1795);
				match(AND);
				setState(1796);
				((WindowFrameContext)_localctx).end = frameBound();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1798);
				((WindowFrameContext)_localctx).frameType = match(ROWS);
				setState(1799);
				match(BETWEEN);
				setState(1800);
				((WindowFrameContext)_localctx).start = frameBound();
				setState(1801);
				match(AND);
				setState(1802);
				((WindowFrameContext)_localctx).end = frameBound();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1804);
				((WindowFrameContext)_localctx).frameType = match(GROUPS);
				setState(1805);
				match(BETWEEN);
				setState(1806);
				((WindowFrameContext)_localctx).start = frameBound();
				setState(1807);
				match(AND);
				setState(1808);
				((WindowFrameContext)_localctx).end = frameBound();
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

	public static class FrameBoundContext extends ParserRuleContext {
		public FrameBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameBound; }
	 
		public FrameBoundContext() { }
		public void copyFrom(FrameBoundContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BoundedFrameContext extends FrameBoundContext {
		public Token boundType;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PRECEDING() { return getToken(SqlBaseParser.PRECEDING, 0); }
		public TerminalNode FOLLOWING() { return getToken(SqlBaseParser.FOLLOWING, 0); }
		public BoundedFrameContext(FrameBoundContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBoundedFrame(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBoundedFrame(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBoundedFrame(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnboundedFrameContext extends FrameBoundContext {
		public Token boundType;
		public TerminalNode UNBOUNDED() { return getToken(SqlBaseParser.UNBOUNDED, 0); }
		public TerminalNode PRECEDING() { return getToken(SqlBaseParser.PRECEDING, 0); }
		public TerminalNode FOLLOWING() { return getToken(SqlBaseParser.FOLLOWING, 0); }
		public UnboundedFrameContext(FrameBoundContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUnboundedFrame(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUnboundedFrame(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUnboundedFrame(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CurrentRowBoundContext extends FrameBoundContext {
		public TerminalNode CURRENT() { return getToken(SqlBaseParser.CURRENT, 0); }
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public CurrentRowBoundContext(FrameBoundContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCurrentRowBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCurrentRowBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCurrentRowBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FrameBoundContext frameBound() throws RecognitionException {
		FrameBoundContext _localctx = new FrameBoundContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_frameBound);
		int _la;
		try {
			setState(1821);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
			case 1:
				_localctx = new UnboundedFrameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1812);
				match(UNBOUNDED);
				setState(1813);
				((UnboundedFrameContext)_localctx).boundType = match(PRECEDING);
				}
				break;
			case 2:
				_localctx = new UnboundedFrameContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1814);
				match(UNBOUNDED);
				setState(1815);
				((UnboundedFrameContext)_localctx).boundType = match(FOLLOWING);
				}
				break;
			case 3:
				_localctx = new CurrentRowBoundContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1816);
				match(CURRENT);
				setState(1817);
				match(ROW);
				}
				break;
			case 4:
				_localctx = new BoundedFrameContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1818);
				expression();
				setState(1819);
				((BoundedFrameContext)_localctx).boundType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FOLLOWING || _la==PRECEDING) ) {
					((BoundedFrameContext)_localctx).boundType = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static class ExplainOptionContext extends ParserRuleContext {
		public ExplainOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explainOption; }
	 
		public ExplainOptionContext() { }
		public void copyFrom(ExplainOptionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExplainFormatContext extends ExplainOptionContext {
		public Token value;
		public TerminalNode FORMAT() { return getToken(SqlBaseParser.FORMAT, 0); }
		public TerminalNode TEXT() { return getToken(SqlBaseParser.TEXT, 0); }
		public TerminalNode GRAPHVIZ() { return getToken(SqlBaseParser.GRAPHVIZ, 0); }
		public TerminalNode JSON() { return getToken(SqlBaseParser.JSON, 0); }
		public ExplainFormatContext(ExplainOptionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExplainFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExplainFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExplainFormat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExplainTypeContext extends ExplainOptionContext {
		public Token value;
		public TerminalNode TYPE() { return getToken(SqlBaseParser.TYPE, 0); }
		public TerminalNode LOGICAL() { return getToken(SqlBaseParser.LOGICAL, 0); }
		public TerminalNode DISTRIBUTED() { return getToken(SqlBaseParser.DISTRIBUTED, 0); }
		public TerminalNode VALIDATE() { return getToken(SqlBaseParser.VALIDATE, 0); }
		public TerminalNode IO() { return getToken(SqlBaseParser.IO, 0); }
		public ExplainTypeContext(ExplainOptionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExplainType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExplainType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExplainType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplainOptionContext explainOption() throws RecognitionException {
		ExplainOptionContext _localctx = new ExplainOptionContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_explainOption);
		int _la;
		try {
			setState(1827);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FORMAT:
				_localctx = new ExplainFormatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1823);
				match(FORMAT);
				setState(1824);
				((ExplainFormatContext)_localctx).value = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==GRAPHVIZ || _la==JSON || _la==TEXT) ) {
					((ExplainFormatContext)_localctx).value = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case TYPE:
				_localctx = new ExplainTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1825);
				match(TYPE);
				setState(1826);
				((ExplainTypeContext)_localctx).value = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 55)) & ~0x3f) == 0 && ((1L << (_la - 55)) & ((1L << (DISTRIBUTED - 55)) | (1L << (IO - 55)) | (1L << (LOGICAL - 55)))) != 0) || _la==VALIDATE) ) {
					((ExplainTypeContext)_localctx).value = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
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

	public static class TransactionModeContext extends ParserRuleContext {
		public TransactionModeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transactionMode; }
	 
		public TransactionModeContext() { }
		public void copyFrom(TransactionModeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TransactionAccessModeContext extends TransactionModeContext {
		public Token accessMode;
		public TerminalNode READ() { return getToken(SqlBaseParser.READ, 0); }
		public TerminalNode ONLY() { return getToken(SqlBaseParser.ONLY, 0); }
		public TerminalNode WRITE() { return getToken(SqlBaseParser.WRITE, 0); }
		public TransactionAccessModeContext(TransactionModeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTransactionAccessMode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTransactionAccessMode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTransactionAccessMode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IsolationLevelContext extends TransactionModeContext {
		public TerminalNode ISOLATION() { return getToken(SqlBaseParser.ISOLATION, 0); }
		public TerminalNode LEVEL() { return getToken(SqlBaseParser.LEVEL, 0); }
		public LevelOfIsolationContext levelOfIsolation() {
			return getRuleContext(LevelOfIsolationContext.class,0);
		}
		public IsolationLevelContext(TransactionModeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIsolationLevel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIsolationLevel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIsolationLevel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransactionModeContext transactionMode() throws RecognitionException {
		TransactionModeContext _localctx = new TransactionModeContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_transactionMode);
		int _la;
		try {
			setState(1834);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ISOLATION:
				_localctx = new IsolationLevelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1829);
				match(ISOLATION);
				setState(1830);
				match(LEVEL);
				setState(1831);
				levelOfIsolation();
				}
				break;
			case READ:
				_localctx = new TransactionAccessModeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1832);
				match(READ);
				setState(1833);
				((TransactionAccessModeContext)_localctx).accessMode = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ONLY || _la==WRITE) ) {
					((TransactionAccessModeContext)_localctx).accessMode = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
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

	public static class LevelOfIsolationContext extends ParserRuleContext {
		public LevelOfIsolationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_levelOfIsolation; }
	 
		public LevelOfIsolationContext() { }
		public void copyFrom(LevelOfIsolationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReadUncommittedContext extends LevelOfIsolationContext {
		public TerminalNode READ() { return getToken(SqlBaseParser.READ, 0); }
		public TerminalNode UNCOMMITTED() { return getToken(SqlBaseParser.UNCOMMITTED, 0); }
		public ReadUncommittedContext(LevelOfIsolationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterReadUncommitted(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitReadUncommitted(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitReadUncommitted(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SerializableContext extends LevelOfIsolationContext {
		public TerminalNode SERIALIZABLE() { return getToken(SqlBaseParser.SERIALIZABLE, 0); }
		public SerializableContext(LevelOfIsolationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSerializable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSerializable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSerializable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReadCommittedContext extends LevelOfIsolationContext {
		public TerminalNode READ() { return getToken(SqlBaseParser.READ, 0); }
		public TerminalNode COMMITTED() { return getToken(SqlBaseParser.COMMITTED, 0); }
		public ReadCommittedContext(LevelOfIsolationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterReadCommitted(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitReadCommitted(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitReadCommitted(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RepeatableReadContext extends LevelOfIsolationContext {
		public TerminalNode REPEATABLE() { return getToken(SqlBaseParser.REPEATABLE, 0); }
		public TerminalNode READ() { return getToken(SqlBaseParser.READ, 0); }
		public RepeatableReadContext(LevelOfIsolationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRepeatableRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRepeatableRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRepeatableRead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LevelOfIsolationContext levelOfIsolation() throws RecognitionException {
		LevelOfIsolationContext _localctx = new LevelOfIsolationContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_levelOfIsolation);
		try {
			setState(1843);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
			case 1:
				_localctx = new ReadUncommittedContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1836);
				match(READ);
				setState(1837);
				match(UNCOMMITTED);
				}
				break;
			case 2:
				_localctx = new ReadCommittedContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1838);
				match(READ);
				setState(1839);
				match(COMMITTED);
				}
				break;
			case 3:
				_localctx = new RepeatableReadContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1840);
				match(REPEATABLE);
				setState(1841);
				match(READ);
				}
				break;
			case 4:
				_localctx = new SerializableContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1842);
				match(SERIALIZABLE);
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

	public static class CallArgumentContext extends ParserRuleContext {
		public CallArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callArgument; }
	 
		public CallArgumentContext() { }
		public void copyFrom(CallArgumentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PositionalArgumentContext extends CallArgumentContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PositionalArgumentContext(CallArgumentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPositionalArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPositionalArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPositionalArgument(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NamedArgumentContext extends CallArgumentContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NamedArgumentContext(CallArgumentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNamedArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNamedArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNamedArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallArgumentContext callArgument() throws RecognitionException {
		CallArgumentContext _localctx = new CallArgumentContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_callArgument);
		try {
			setState(1850);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
			case 1:
				_localctx = new PositionalArgumentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1845);
				expression();
				}
				break;
			case 2:
				_localctx = new NamedArgumentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1846);
				identifier();
				setState(1847);
				match(T__8);
				setState(1848);
				expression();
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

	public static class PrivilegeContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(SqlBaseParser.SELECT, 0); }
		public TerminalNode DELETE() { return getToken(SqlBaseParser.DELETE, 0); }
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public PrivilegeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privilege; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPrivilege(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPrivilege(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPrivilege(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrivilegeContext privilege() throws RecognitionException {
		PrivilegeContext _localctx = new PrivilegeContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_privilege);
		try {
			setState(1856);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1852);
				match(SELECT);
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1853);
				match(DELETE);
				}
				break;
			case INSERT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1854);
				match(INSERT);
				}
				break;
			case ADD:
			case ADMIN:
			case ALL:
			case ANALYZE:
			case ANY:
			case ARRAY:
			case ASC:
			case AT:
			case BERNOULLI:
			case CALL:
			case CALLED:
			case CASCADE:
			case CATALOGS:
			case COLUMN:
			case COLUMNS:
			case COMMENT:
			case COMMIT:
			case COMMITTED:
			case CURRENT:
			case CURRENT_ROLE:
			case DATA:
			case DATE:
			case DAY:
			case DEFINER:
			case DESC:
			case DETERMINISTIC:
			case DISTRIBUTED:
			case EXCLUDING:
			case EXPLAIN:
			case EXTERNAL:
			case FETCH:
			case FILTER:
			case FIRST:
			case FOLLOWING:
			case FORMAT:
			case FUNCTION:
			case FUNCTIONS:
			case GRANT:
			case GRANTED:
			case GRANTS:
			case GRAPHVIZ:
			case GROUPS:
			case HOUR:
			case IF:
			case IGNORE:
			case INCLUDING:
			case INPUT:
			case INTERVAL:
			case INVOKER:
			case IO:
			case ISOLATION:
			case JSON:
			case LANGUAGE:
			case LAST:
			case LATERAL:
			case LEVEL:
			case LIMIT:
			case LOGICAL:
			case MAP:
			case MATERIALIZED:
			case MINUTE:
			case MONTH:
			case NAME:
			case NFC:
			case NFD:
			case NFKC:
			case NFKD:
			case NO:
			case NONE:
			case NULLIF:
			case NULLS:
			case OFFSET:
			case ONLY:
			case OPTION:
			case ORDINALITY:
			case OUTPUT:
			case OVER:
			case PARTITION:
			case PARTITIONS:
			case POSITION:
			case PRECEDING:
			case PRIVILEGES:
			case PROPERTIES:
			case RANGE:
			case READ:
			case REFRESH:
			case RENAME:
			case REPEATABLE:
			case REPLACE:
			case RESET:
			case RESPECT:
			case RESTRICT:
			case RETURN:
			case RETURNS:
			case REVOKE:
			case ROLE:
			case ROLES:
			case ROLLBACK:
			case ROW:
			case ROWS:
			case SCHEMA:
			case SCHEMAS:
			case SECOND:
			case SECURITY:
			case SERIALIZABLE:
			case SESSION:
			case SET:
			case SETS:
			case SHOW:
			case SOME:
			case SQL:
			case START:
			case STATS:
			case SUBSTRING:
			case SYSTEM:
			case TABLES:
			case TABLESAMPLE:
			case TEMPORARY:
			case TEXT:
			case TIME:
			case TIMESTAMP:
			case TO:
			case TRANSACTION:
			case TRUNCATE:
			case TRY_CAST:
			case TYPE:
			case UNBOUNDED:
			case UNCOMMITTED:
			case USE:
			case USER:
			case VALIDATE:
			case VERBOSE:
			case VIEW:
			case WORK:
			case WRITE:
			case YEAR:
			case ZONE:
			case IDENTIFIER:
			case DIGIT_IDENTIFIER:
			case QUOTED_IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(1855);
				identifier();
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

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1858);
			identifier();
			setState(1863);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,236,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1859);
					match(T__0);
					setState(1860);
					identifier();
					}
					} 
				}
				setState(1865);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,236,_ctx);
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

	public static class GrantorContext extends ParserRuleContext {
		public GrantorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grantor; }
	 
		public GrantorContext() { }
		public void copyFrom(GrantorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CurrentUserGrantorContext extends GrantorContext {
		public TerminalNode CURRENT_USER() { return getToken(SqlBaseParser.CURRENT_USER, 0); }
		public CurrentUserGrantorContext(GrantorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCurrentUserGrantor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCurrentUserGrantor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCurrentUserGrantor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SpecifiedPrincipalContext extends GrantorContext {
		public PrincipalContext principal() {
			return getRuleContext(PrincipalContext.class,0);
		}
		public SpecifiedPrincipalContext(GrantorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSpecifiedPrincipal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSpecifiedPrincipal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSpecifiedPrincipal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CurrentRoleGrantorContext extends GrantorContext {
		public TerminalNode CURRENT_ROLE() { return getToken(SqlBaseParser.CURRENT_ROLE, 0); }
		public CurrentRoleGrantorContext(GrantorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCurrentRoleGrantor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCurrentRoleGrantor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCurrentRoleGrantor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GrantorContext grantor() throws RecognitionException {
		GrantorContext _localctx = new GrantorContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_grantor);
		try {
			setState(1869);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
			case 1:
				_localctx = new CurrentUserGrantorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1866);
				match(CURRENT_USER);
				}
				break;
			case 2:
				_localctx = new CurrentRoleGrantorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1867);
				match(CURRENT_ROLE);
				}
				break;
			case 3:
				_localctx = new SpecifiedPrincipalContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1868);
				principal();
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

	public static class PrincipalContext extends ParserRuleContext {
		public PrincipalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_principal; }
	 
		public PrincipalContext() { }
		public void copyFrom(PrincipalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UnspecifiedPrincipalContext extends PrincipalContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public UnspecifiedPrincipalContext(PrincipalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUnspecifiedPrincipal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUnspecifiedPrincipal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUnspecifiedPrincipal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UserPrincipalContext extends PrincipalContext {
		public TerminalNode USER() { return getToken(SqlBaseParser.USER, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public UserPrincipalContext(PrincipalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUserPrincipal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUserPrincipal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUserPrincipal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RolePrincipalContext extends PrincipalContext {
		public TerminalNode ROLE() { return getToken(SqlBaseParser.ROLE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public RolePrincipalContext(PrincipalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRolePrincipal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRolePrincipal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRolePrincipal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrincipalContext principal() throws RecognitionException {
		PrincipalContext _localctx = new PrincipalContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_principal);
		try {
			setState(1876);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,238,_ctx) ) {
			case 1:
				_localctx = new UserPrincipalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1871);
				match(USER);
				setState(1872);
				identifier();
				}
				break;
			case 2:
				_localctx = new RolePrincipalContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1873);
				match(ROLE);
				setState(1874);
				identifier();
				}
				break;
			case 3:
				_localctx = new UnspecifiedPrincipalContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1875);
				identifier();
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

	public static class RolesContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public RolesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_roles; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRoles(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRoles(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRoles(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RolesContext roles() throws RecognitionException {
		RolesContext _localctx = new RolesContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_roles);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1878);
			identifier();
			setState(1883);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1879);
				match(T__3);
				setState(1880);
				identifier();
				}
				}
				setState(1885);
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

	public static class IdentifierContext extends ParserRuleContext {
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	 
		public IdentifierContext() { }
		public void copyFrom(IdentifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BackQuotedIdentifierContext extends IdentifierContext {
		public TerminalNode BACKQUOTED_IDENTIFIER() { return getToken(SqlBaseParser.BACKQUOTED_IDENTIFIER, 0); }
		public BackQuotedIdentifierContext(IdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBackQuotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBackQuotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBackQuotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class QuotedIdentifierContext extends IdentifierContext {
		public TerminalNode QUOTED_IDENTIFIER() { return getToken(SqlBaseParser.QUOTED_IDENTIFIER, 0); }
		public QuotedIdentifierContext(IdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQuotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQuotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQuotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DigitIdentifierContext extends IdentifierContext {
		public TerminalNode DIGIT_IDENTIFIER() { return getToken(SqlBaseParser.DIGIT_IDENTIFIER, 0); }
		public DigitIdentifierContext(IdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDigitIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDigitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDigitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnquotedIdentifierContext extends IdentifierContext {
		public TerminalNode IDENTIFIER() { return getToken(SqlBaseParser.IDENTIFIER, 0); }
		public NonReservedContext nonReserved() {
			return getRuleContext(NonReservedContext.class,0);
		}
		public UnquotedIdentifierContext(IdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUnquotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUnquotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUnquotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_identifier);
		try {
			setState(1891);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1886);
				match(IDENTIFIER);
				}
				break;
			case QUOTED_IDENTIFIER:
				_localctx = new QuotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1887);
				match(QUOTED_IDENTIFIER);
				}
				break;
			case ADD:
			case ADMIN:
			case ALL:
			case ANALYZE:
			case ANY:
			case ARRAY:
			case ASC:
			case AT:
			case BERNOULLI:
			case CALL:
			case CALLED:
			case CASCADE:
			case CATALOGS:
			case COLUMN:
			case COLUMNS:
			case COMMENT:
			case COMMIT:
			case COMMITTED:
			case CURRENT:
			case CURRENT_ROLE:
			case DATA:
			case DATE:
			case DAY:
			case DEFINER:
			case DESC:
			case DETERMINISTIC:
			case DISTRIBUTED:
			case EXCLUDING:
			case EXPLAIN:
			case EXTERNAL:
			case FETCH:
			case FILTER:
			case FIRST:
			case FOLLOWING:
			case FORMAT:
			case FUNCTION:
			case FUNCTIONS:
			case GRANT:
			case GRANTED:
			case GRANTS:
			case GRAPHVIZ:
			case GROUPS:
			case HOUR:
			case IF:
			case IGNORE:
			case INCLUDING:
			case INPUT:
			case INTERVAL:
			case INVOKER:
			case IO:
			case ISOLATION:
			case JSON:
			case LANGUAGE:
			case LAST:
			case LATERAL:
			case LEVEL:
			case LIMIT:
			case LOGICAL:
			case MAP:
			case MATERIALIZED:
			case MINUTE:
			case MONTH:
			case NAME:
			case NFC:
			case NFD:
			case NFKC:
			case NFKD:
			case NO:
			case NONE:
			case NULLIF:
			case NULLS:
			case OFFSET:
			case ONLY:
			case OPTION:
			case ORDINALITY:
			case OUTPUT:
			case OVER:
			case PARTITION:
			case PARTITIONS:
			case POSITION:
			case PRECEDING:
			case PRIVILEGES:
			case PROPERTIES:
			case RANGE:
			case READ:
			case REFRESH:
			case RENAME:
			case REPEATABLE:
			case REPLACE:
			case RESET:
			case RESPECT:
			case RESTRICT:
			case RETURN:
			case RETURNS:
			case REVOKE:
			case ROLE:
			case ROLES:
			case ROLLBACK:
			case ROW:
			case ROWS:
			case SCHEMA:
			case SCHEMAS:
			case SECOND:
			case SECURITY:
			case SERIALIZABLE:
			case SESSION:
			case SET:
			case SETS:
			case SHOW:
			case SOME:
			case SQL:
			case START:
			case STATS:
			case SUBSTRING:
			case SYSTEM:
			case TABLES:
			case TABLESAMPLE:
			case TEMPORARY:
			case TEXT:
			case TIME:
			case TIMESTAMP:
			case TO:
			case TRANSACTION:
			case TRUNCATE:
			case TRY_CAST:
			case TYPE:
			case UNBOUNDED:
			case UNCOMMITTED:
			case USE:
			case USER:
			case VALIDATE:
			case VERBOSE:
			case VIEW:
			case WORK:
			case WRITE:
			case YEAR:
			case ZONE:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1888);
				nonReserved();
				}
				break;
			case BACKQUOTED_IDENTIFIER:
				_localctx = new BackQuotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1889);
				match(BACKQUOTED_IDENTIFIER);
				}
				break;
			case DIGIT_IDENTIFIER:
				_localctx = new DigitIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1890);
				match(DIGIT_IDENTIFIER);
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

	public static class NumberContext extends ParserRuleContext {
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	 
		public NumberContext() { }
		public void copyFrom(NumberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DecimalLiteralContext extends NumberContext {
		public TerminalNode DECIMAL_VALUE() { return getToken(SqlBaseParser.DECIMAL_VALUE, 0); }
		public DecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleLiteralContext extends NumberContext {
		public TerminalNode DOUBLE_VALUE() { return getToken(SqlBaseParser.DOUBLE_VALUE, 0); }
		public DoubleLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDoubleLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDoubleLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDoubleLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerLiteralContext extends NumberContext {
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public IntegerLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_number);
		try {
			setState(1896);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_VALUE:
				_localctx = new DecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1893);
				match(DECIMAL_VALUE);
				}
				break;
			case DOUBLE_VALUE:
				_localctx = new DoubleLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1894);
				match(DOUBLE_VALUE);
				}
				break;
			case INTEGER_VALUE:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1895);
				match(INTEGER_VALUE);
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

	public static class NonReservedContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode ADMIN() { return getToken(SqlBaseParser.ADMIN, 0); }
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public TerminalNode ANALYZE() { return getToken(SqlBaseParser.ANALYZE, 0); }
		public TerminalNode ANY() { return getToken(SqlBaseParser.ANY, 0); }
		public TerminalNode ARRAY() { return getToken(SqlBaseParser.ARRAY, 0); }
		public TerminalNode ASC() { return getToken(SqlBaseParser.ASC, 0); }
		public TerminalNode AT() { return getToken(SqlBaseParser.AT, 0); }
		public TerminalNode BERNOULLI() { return getToken(SqlBaseParser.BERNOULLI, 0); }
		public TerminalNode CALL() { return getToken(SqlBaseParser.CALL, 0); }
		public TerminalNode CALLED() { return getToken(SqlBaseParser.CALLED, 0); }
		public TerminalNode CASCADE() { return getToken(SqlBaseParser.CASCADE, 0); }
		public TerminalNode CATALOGS() { return getToken(SqlBaseParser.CATALOGS, 0); }
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode COMMIT() { return getToken(SqlBaseParser.COMMIT, 0); }
		public TerminalNode COMMITTED() { return getToken(SqlBaseParser.COMMITTED, 0); }
		public TerminalNode CURRENT() { return getToken(SqlBaseParser.CURRENT, 0); }
		public TerminalNode CURRENT_ROLE() { return getToken(SqlBaseParser.CURRENT_ROLE, 0); }
		public TerminalNode DATA() { return getToken(SqlBaseParser.DATA, 0); }
		public TerminalNode DATE() { return getToken(SqlBaseParser.DATE, 0); }
		public TerminalNode DAY() { return getToken(SqlBaseParser.DAY, 0); }
		public TerminalNode DEFINER() { return getToken(SqlBaseParser.DEFINER, 0); }
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode DETERMINISTIC() { return getToken(SqlBaseParser.DETERMINISTIC, 0); }
		public TerminalNode DISTRIBUTED() { return getToken(SqlBaseParser.DISTRIBUTED, 0); }
		public TerminalNode EXCLUDING() { return getToken(SqlBaseParser.EXCLUDING, 0); }
		public TerminalNode EXPLAIN() { return getToken(SqlBaseParser.EXPLAIN, 0); }
		public TerminalNode EXTERNAL() { return getToken(SqlBaseParser.EXTERNAL, 0); }
		public TerminalNode FETCH() { return getToken(SqlBaseParser.FETCH, 0); }
		public TerminalNode FILTER() { return getToken(SqlBaseParser.FILTER, 0); }
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public TerminalNode FOLLOWING() { return getToken(SqlBaseParser.FOLLOWING, 0); }
		public TerminalNode FORMAT() { return getToken(SqlBaseParser.FORMAT, 0); }
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public TerminalNode FUNCTIONS() { return getToken(SqlBaseParser.FUNCTIONS, 0); }
		public TerminalNode GRANT() { return getToken(SqlBaseParser.GRANT, 0); }
		public TerminalNode GRANTED() { return getToken(SqlBaseParser.GRANTED, 0); }
		public TerminalNode GRANTS() { return getToken(SqlBaseParser.GRANTS, 0); }
		public TerminalNode GRAPHVIZ() { return getToken(SqlBaseParser.GRAPHVIZ, 0); }
		public TerminalNode GROUPS() { return getToken(SqlBaseParser.GROUPS, 0); }
		public TerminalNode HOUR() { return getToken(SqlBaseParser.HOUR, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode IGNORE() { return getToken(SqlBaseParser.IGNORE, 0); }
		public TerminalNode INCLUDING() { return getToken(SqlBaseParser.INCLUDING, 0); }
		public TerminalNode INPUT() { return getToken(SqlBaseParser.INPUT, 0); }
		public TerminalNode INTERVAL() { return getToken(SqlBaseParser.INTERVAL, 0); }
		public TerminalNode INVOKER() { return getToken(SqlBaseParser.INVOKER, 0); }
		public TerminalNode IO() { return getToken(SqlBaseParser.IO, 0); }
		public TerminalNode ISOLATION() { return getToken(SqlBaseParser.ISOLATION, 0); }
		public TerminalNode JSON() { return getToken(SqlBaseParser.JSON, 0); }
		public TerminalNode LANGUAGE() { return getToken(SqlBaseParser.LANGUAGE, 0); }
		public TerminalNode LAST() { return getToken(SqlBaseParser.LAST, 0); }
		public TerminalNode LATERAL() { return getToken(SqlBaseParser.LATERAL, 0); }
		public TerminalNode LEVEL() { return getToken(SqlBaseParser.LEVEL, 0); }
		public TerminalNode LIMIT() { return getToken(SqlBaseParser.LIMIT, 0); }
		public TerminalNode LOGICAL() { return getToken(SqlBaseParser.LOGICAL, 0); }
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode MATERIALIZED() { return getToken(SqlBaseParser.MATERIALIZED, 0); }
		public TerminalNode MINUTE() { return getToken(SqlBaseParser.MINUTE, 0); }
		public TerminalNode MONTH() { return getToken(SqlBaseParser.MONTH, 0); }
		public TerminalNode NAME() { return getToken(SqlBaseParser.NAME, 0); }
		public TerminalNode NFC() { return getToken(SqlBaseParser.NFC, 0); }
		public TerminalNode NFD() { return getToken(SqlBaseParser.NFD, 0); }
		public TerminalNode NFKC() { return getToken(SqlBaseParser.NFKC, 0); }
		public TerminalNode NFKD() { return getToken(SqlBaseParser.NFKD, 0); }
		public TerminalNode NO() { return getToken(SqlBaseParser.NO, 0); }
		public TerminalNode NONE() { return getToken(SqlBaseParser.NONE, 0); }
		public TerminalNode NULLIF() { return getToken(SqlBaseParser.NULLIF, 0); }
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public TerminalNode OFFSET() { return getToken(SqlBaseParser.OFFSET, 0); }
		public TerminalNode ONLY() { return getToken(SqlBaseParser.ONLY, 0); }
		public TerminalNode OPTION() { return getToken(SqlBaseParser.OPTION, 0); }
		public TerminalNode ORDINALITY() { return getToken(SqlBaseParser.ORDINALITY, 0); }
		public TerminalNode OUTPUT() { return getToken(SqlBaseParser.OUTPUT, 0); }
		public TerminalNode OVER() { return getToken(SqlBaseParser.OVER, 0); }
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public TerminalNode PARTITIONS() { return getToken(SqlBaseParser.PARTITIONS, 0); }
		public TerminalNode POSITION() { return getToken(SqlBaseParser.POSITION, 0); }
		public TerminalNode PRECEDING() { return getToken(SqlBaseParser.PRECEDING, 0); }
		public TerminalNode PRIVILEGES() { return getToken(SqlBaseParser.PRIVILEGES, 0); }
		public TerminalNode PROPERTIES() { return getToken(SqlBaseParser.PROPERTIES, 0); }
		public TerminalNode RANGE() { return getToken(SqlBaseParser.RANGE, 0); }
		public TerminalNode READ() { return getToken(SqlBaseParser.READ, 0); }
		public TerminalNode REFRESH() { return getToken(SqlBaseParser.REFRESH, 0); }
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode REPEATABLE() { return getToken(SqlBaseParser.REPEATABLE, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode RESET() { return getToken(SqlBaseParser.RESET, 0); }
		public TerminalNode RESPECT() { return getToken(SqlBaseParser.RESPECT, 0); }
		public TerminalNode RESTRICT() { return getToken(SqlBaseParser.RESTRICT, 0); }
		public TerminalNode RETURN() { return getToken(SqlBaseParser.RETURN, 0); }
		public TerminalNode RETURNS() { return getToken(SqlBaseParser.RETURNS, 0); }
		public TerminalNode REVOKE() { return getToken(SqlBaseParser.REVOKE, 0); }
		public TerminalNode ROLE() { return getToken(SqlBaseParser.ROLE, 0); }
		public TerminalNode ROLES() { return getToken(SqlBaseParser.ROLES, 0); }
		public TerminalNode ROLLBACK() { return getToken(SqlBaseParser.ROLLBACK, 0); }
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public TerminalNode ROWS() { return getToken(SqlBaseParser.ROWS, 0); }
		public TerminalNode SCHEMA() { return getToken(SqlBaseParser.SCHEMA, 0); }
		public TerminalNode SCHEMAS() { return getToken(SqlBaseParser.SCHEMAS, 0); }
		public TerminalNode SECOND() { return getToken(SqlBaseParser.SECOND, 0); }
		public TerminalNode SECURITY() { return getToken(SqlBaseParser.SECURITY, 0); }
		public TerminalNode SERIALIZABLE() { return getToken(SqlBaseParser.SERIALIZABLE, 0); }
		public TerminalNode SESSION() { return getToken(SqlBaseParser.SESSION, 0); }
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode SETS() { return getToken(SqlBaseParser.SETS, 0); }
		public TerminalNode SQL() { return getToken(SqlBaseParser.SQL, 0); }
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode SOME() { return getToken(SqlBaseParser.SOME, 0); }
		public TerminalNode START() { return getToken(SqlBaseParser.START, 0); }
		public TerminalNode STATS() { return getToken(SqlBaseParser.STATS, 0); }
		public TerminalNode SUBSTRING() { return getToken(SqlBaseParser.SUBSTRING, 0); }
		public TerminalNode SYSTEM() { return getToken(SqlBaseParser.SYSTEM, 0); }
		public TerminalNode TABLES() { return getToken(SqlBaseParser.TABLES, 0); }
		public TerminalNode TABLESAMPLE() { return getToken(SqlBaseParser.TABLESAMPLE, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode TEXT() { return getToken(SqlBaseParser.TEXT, 0); }
		public TerminalNode TIME() { return getToken(SqlBaseParser.TIME, 0); }
		public TerminalNode TIMESTAMP() { return getToken(SqlBaseParser.TIMESTAMP, 0); }
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public TerminalNode TRANSACTION() { return getToken(SqlBaseParser.TRANSACTION, 0); }
		public TerminalNode TRUNCATE() { return getToken(SqlBaseParser.TRUNCATE, 0); }
		public TerminalNode TRY_CAST() { return getToken(SqlBaseParser.TRY_CAST, 0); }
		public TerminalNode TYPE() { return getToken(SqlBaseParser.TYPE, 0); }
		public TerminalNode UNBOUNDED() { return getToken(SqlBaseParser.UNBOUNDED, 0); }
		public TerminalNode UNCOMMITTED() { return getToken(SqlBaseParser.UNCOMMITTED, 0); }
		public TerminalNode USE() { return getToken(SqlBaseParser.USE, 0); }
		public TerminalNode USER() { return getToken(SqlBaseParser.USER, 0); }
		public TerminalNode VALIDATE() { return getToken(SqlBaseParser.VALIDATE, 0); }
		public TerminalNode VERBOSE() { return getToken(SqlBaseParser.VERBOSE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TerminalNode WORK() { return getToken(SqlBaseParser.WORK, 0); }
		public TerminalNode WRITE() { return getToken(SqlBaseParser.WRITE, 0); }
		public TerminalNode YEAR() { return getToken(SqlBaseParser.YEAR, 0); }
		public TerminalNode ZONE() { return getToken(SqlBaseParser.ZONE, 0); }
		public NonReservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonReserved; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNonReserved(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNonReserved(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNonReserved(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonReservedContext nonReserved() throws RecognitionException {
		NonReservedContext _localctx = new NonReservedContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_nonReserved);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1898);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ADMIN) | (1L << ALL) | (1L << ANALYZE) | (1L << ANY) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << BERNOULLI) | (1L << CALL) | (1L << CALLED) | (1L << CASCADE) | (1L << CATALOGS) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << CURRENT_ROLE) | (1L << DATA) | (1L << DATE) | (1L << DAY) | (1L << DEFINER) | (1L << DESC) | (1L << DETERMINISTIC) | (1L << DISTRIBUTED) | (1L << EXCLUDING))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (EXPLAIN - 64)) | (1L << (EXTERNAL - 64)) | (1L << (FETCH - 64)) | (1L << (FILTER - 64)) | (1L << (FIRST - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FORMAT - 64)) | (1L << (FUNCTION - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GRANT - 64)) | (1L << (GRANTED - 64)) | (1L << (GRANTS - 64)) | (1L << (GRAPHVIZ - 64)) | (1L << (GROUPS - 64)) | (1L << (HOUR - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (INCLUDING - 64)) | (1L << (INPUT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INVOKER - 64)) | (1L << (IO - 64)) | (1L << (ISOLATION - 64)) | (1L << (JSON - 64)) | (1L << (LANGUAGE - 64)) | (1L << (LAST - 64)) | (1L << (LATERAL - 64)) | (1L << (LEVEL - 64)) | (1L << (LIMIT - 64)) | (1L << (LOGICAL - 64)) | (1L << (MAP - 64)) | (1L << (MATERIALIZED - 64)) | (1L << (MINUTE - 64)) | (1L << (MONTH - 64)) | (1L << (NAME - 64)) | (1L << (NFC - 64)) | (1L << (NFD - 64)) | (1L << (NFKC - 64)) | (1L << (NFKD - 64)) | (1L << (NO - 64)) | (1L << (NONE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (NULLIF - 128)) | (1L << (NULLS - 128)) | (1L << (OFFSET - 128)) | (1L << (ONLY - 128)) | (1L << (OPTION - 128)) | (1L << (ORDINALITY - 128)) | (1L << (OUTPUT - 128)) | (1L << (OVER - 128)) | (1L << (PARTITION - 128)) | (1L << (PARTITIONS - 128)) | (1L << (POSITION - 128)) | (1L << (PRECEDING - 128)) | (1L << (PRIVILEGES - 128)) | (1L << (PROPERTIES - 128)) | (1L << (RANGE - 128)) | (1L << (READ - 128)) | (1L << (REFRESH - 128)) | (1L << (RENAME - 128)) | (1L << (REPEATABLE - 128)) | (1L << (REPLACE - 128)) | (1L << (RESET - 128)) | (1L << (RESPECT - 128)) | (1L << (RESTRICT - 128)) | (1L << (RETURN - 128)) | (1L << (RETURNS - 128)) | (1L << (REVOKE - 128)) | (1L << (ROLE - 128)) | (1L << (ROLES - 128)) | (1L << (ROLLBACK - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (SCHEMA - 128)) | (1L << (SCHEMAS - 128)) | (1L << (SECOND - 128)) | (1L << (SECURITY - 128)) | (1L << (SERIALIZABLE - 128)) | (1L << (SESSION - 128)) | (1L << (SET - 128)) | (1L << (SETS - 128)) | (1L << (SHOW - 128)) | (1L << (SOME - 128)) | (1L << (SQL - 128)) | (1L << (START - 128)) | (1L << (STATS - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLES - 128)) | (1L << (TABLESAMPLE - 128)) | (1L << (TEMPORARY - 128)) | (1L << (TEXT - 128)) | (1L << (TIME - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (TRANSACTION - 192)) | (1L << (TRUNCATE - 192)) | (1L << (TRY_CAST - 192)) | (1L << (TYPE - 192)) | (1L << (UNBOUNDED - 192)) | (1L << (UNCOMMITTED - 192)) | (1L << (USE - 192)) | (1L << (USER - 192)) | (1L << (VALIDATE - 192)) | (1L << (VERBOSE - 192)) | (1L << (VIEW - 192)) | (1L << (WORK - 192)) | (1L << (WRITE - 192)) | (1L << (YEAR - 192)) | (1L << (ZONE - 192)))) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 24:
			return queryTerm_sempred((QueryTermContext)_localctx, predIndex);
		case 38:
			return relation_sempred((RelationContext)_localctx, predIndex);
		case 47:
			return booleanExpression_sempred((BooleanExpressionContext)_localctx, predIndex);
		case 49:
			return valueExpression_sempred((ValueExpressionContext)_localctx, predIndex);
		case 50:
			return primaryExpression_sempred((PrimaryExpressionContext)_localctx, predIndex);
		case 61:
			return type_sempred((TypeContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean queryTerm_sempred(QueryTermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relation_sempred(RelationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean booleanExpression_sempred(BooleanExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean valueExpression_sempred(ValueExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		case 7:
			return precpred(_ctx, 1);
		case 8:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean primaryExpression_sempred(PrimaryExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 14);
		case 10:
			return precpred(_ctx, 12);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u00f5\u076d\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007"+
		"E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007"+
		"J\u0002K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007"+
		"O\u0002P\u0007P\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003\u00b9\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u00be"+
		"\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u00c4"+
		"\b\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u00c8\b\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"\u00d6\b\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u00da\b\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003\u00de\b\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003\u00e2\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003\u00ea\b\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003\u00ee\b\u0003\u0001\u0003\u0003\u0003\u00f1\b\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u00f8\b\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003"+
		"\u00ff\b\u0003\n\u0003\f\u0003\u0102\t\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003\u0107\b\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u010b"+
		"\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u0111"+
		"\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003\u0118\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u0121\b\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003\u012a\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u0135"+
		"\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003\u013c\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u0146\b\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u014d"+
		"\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003\u0155\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u015d\b\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u0165"+
		"\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u016f\b\u0003\n\u0003\f\u0003"+
		"\u0172\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u0177\b"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u017c\b\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u0182\b\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003\u018b\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u0194\b\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u0199\b\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003\u019d\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u01a5\b\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u01ac\b\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u01b9"+
		"\b\u0003\u0001\u0003\u0003\u0003\u01bc\b\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u01c4\b\u0003"+
		"\n\u0003\f\u0003\u01c7\t\u0003\u0003\u0003\u01c9\b\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u01d0\b\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003\u01d9\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003\u01df\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003\u01e4\b\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u01e8\b\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0005\u0003\u01f0\b\u0003\n\u0003\f\u0003\u01f3\t\u0003\u0003\u0003\u01f5"+
		"\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u01ff\b\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0005\u0003\u020a\b\u0003\n\u0003\f\u0003\u020d\t\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u0212\b\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003\u0217\b\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003\u021d\b\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u0224\b\u0003\n\u0003"+
		"\f\u0003\u0227\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"\u022c\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003\u0233\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0005\u0003\u0239\b\u0003\n\u0003\f\u0003\u023c\t\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003\u0240\b\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u0244"+
		"\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003\u024c\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003\u0252\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005"+
		"\u0003\u0257\b\u0003\n\u0003\f\u0003\u025a\t\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003\u025e\b\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u0262\b"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u026c\b\u0003\u0001\u0003\u0003"+
		"\u0003\u026f\b\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u0273\b\u0003"+
		"\u0001\u0003\u0003\u0003\u0276\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0005\u0003\u027c\b\u0003\n\u0003\f\u0003\u027f\t\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003\u0283\b\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u0298"+
		"\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u029e"+
		"\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u02a4"+
		"\b\u0003\u0003\u0003\u02a6\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003\u02ac\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003\u02b2\b\u0003\u0003\u0003\u02b4\b\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003\u02bc\b\u0003\u0003\u0003\u02be\b\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u02d1\b\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003\u02d6\b\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u02dd\b\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u02e9\b\u0003\u0003\u0003"+
		"\u02eb\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003\u02f3\b\u0003\u0003\u0003\u02f5\b\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0005\u0003\u0305\b\u0003\n\u0003\f\u0003\u0308\t\u0003"+
		"\u0003\u0003\u030a\b\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u030e\b"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u0312\b\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0005\u0003\u0322\b\u0003\n\u0003\f\u0003\u0325\t\u0003\u0003\u0003"+
		"\u0327\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003\u032f\b\u0003\u0001\u0004\u0003\u0004\u0332\b"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0003\u0005\u0338"+
		"\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u033d\b\u0005"+
		"\n\u0005\f\u0005\u0340\t\u0005\u0001\u0006\u0001\u0006\u0003\u0006\u0344"+
		"\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u034a"+
		"\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u034e\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u0352\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0003\b\u0358\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u035e\b\t\n"+
		"\t\f\t\u0361\t\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0005\f\u036d\b\f\n\f\f\f\u0370"+
		"\t\f\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u0376\b\r\u0001\u000e\u0005"+
		"\u000e\u0379\b\u000e\n\u000e\f\u000e\u037c\t\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0003\u0010\u0382\b\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u038a\b\u0012"+
		"\u0001\u0013\u0001\u0013\u0003\u0013\u038e\b\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0003\u0014\u0393\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0003\u0015\u039e\b\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u03a8\b\u0017"+
		"\n\u0017\f\u0017\u03ab\t\u0017\u0003\u0017\u03ad\b\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0003\u0017\u03b2\b\u0017\u0003\u0017\u03b4\b\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0003\u0017\u03bd\b\u0017\u0003\u0017\u03bf\b\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003"+
		"\u0018\u03c7\b\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003"+
		"\u0018\u03cd\b\u0018\u0001\u0018\u0005\u0018\u03d0\b\u0018\n\u0018\f\u0018"+
		"\u03d3\t\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0005\u0019\u03dc\b\u0019\n\u0019\f\u0019\u03df"+
		"\t\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u03e5"+
		"\b\u0019\u0001\u001a\u0001\u001a\u0003\u001a\u03e9\b\u001a\u0001\u001a"+
		"\u0001\u001a\u0003\u001a\u03ed\b\u001a\u0001\u001b\u0001\u001b\u0003\u001b"+
		"\u03f1\b\u001b\u0001\u001b\u0003\u001b\u03f4\b\u001b\u0001\u001b\u0003"+
		"\u001b\u03f7\b\u001b\u0001\u001b\u0003\u001b\u03fa\b\u001b\u0001\u001c"+
		"\u0001\u001c\u0003\u001c\u03fe\b\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0005\u001c\u0403\b\u001c\n\u001c\f\u001c\u0406\t\u001c\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u040c\b\u001d\n\u001d\f\u001d"+
		"\u040f\t\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0003\u001f\u0417\b\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0005\u001f\u041c\b\u001f\n\u001f\f\u001f\u041f\t\u001f\u0001 \u0001"+
		" \u0001 \u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0005!\u042a\b!\n!"+
		"\f!\u042d\t!\u0003!\u042f\b!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0005!\u0437\b!\n!\f!\u043a\t!\u0003!\u043c\b!\u0001!\u0001!\u0001!"+
		"\u0001!\u0001!\u0001!\u0001!\u0005!\u0445\b!\n!\f!\u0448\t!\u0001!\u0001"+
		"!\u0003!\u044c\b!\u0001\"\u0001\"\u0001\"\u0001\"\u0005\"\u0452\b\"\n"+
		"\"\f\"\u0455\t\"\u0003\"\u0457\b\"\u0001\"\u0001\"\u0003\"\u045b\b\"\u0001"+
		"#\u0001#\u0003#\u045f\b#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001$\u0001"+
		"$\u0001%\u0001%\u0003%\u046a\b%\u0001%\u0003%\u046d\b%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0003%\u0474\b%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0003&\u0487\b&\u0005&\u0489\b&\n&\f&\u048c\t&\u0001\'\u0003"+
		"\'\u048f\b\'\u0001\'\u0001\'\u0003\'\u0493\b\'\u0001\'\u0001\'\u0003\'"+
		"\u0497\b\'\u0001\'\u0001\'\u0003\'\u049b\b\'\u0003\'\u049d\b\'\u0001("+
		"\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0005(\u04a6\b(\n(\f(\u04a9"+
		"\t(\u0001(\u0001(\u0003(\u04ad\b(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0003)\u04b6\b)\u0001*\u0001*\u0001+\u0001+\u0003+\u04bc\b+\u0001"+
		"+\u0001+\u0003+\u04c0\b+\u0003+\u04c2\b+\u0001,\u0001,\u0001,\u0001,\u0005"+
		",\u04c8\b,\n,\f,\u04cb\t,\u0001,\u0001,\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0001-\u0001-\u0001-\u0001-\u0005-\u04d9\b-\n-\f-\u04dc\t-\u0001"+
		"-\u0001-\u0001-\u0003-\u04e1\b-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0001-\u0001-\u0003-\u04ec\b-\u0001.\u0001.\u0001/\u0001/\u0001"+
		"/\u0003/\u04f3\b/\u0001/\u0001/\u0003/\u04f7\b/\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0005/\u04ff\b/\n/\f/\u0502\t/\u00010\u00010\u00010\u0001"+
		"0\u00010\u00010\u00010\u00010\u00010\u00010\u00030\u050e\b0\u00010\u0001"+
		"0\u00010\u00010\u00010\u00010\u00030\u0516\b0\u00010\u00010\u00010\u0001"+
		"0\u00010\u00050\u051d\b0\n0\f0\u0520\t0\u00010\u00010\u00010\u00030\u0525"+
		"\b0\u00010\u00010\u00010\u00010\u00010\u00010\u00030\u052d\b0\u00010\u0001"+
		"0\u00010\u00010\u00030\u0533\b0\u00010\u00010\u00030\u0537\b0\u00010\u0001"+
		"0\u00010\u00030\u053c\b0\u00010\u00010\u00010\u00030\u0541\b0\u00011\u0001"+
		"1\u00011\u00011\u00031\u0547\b1\u00011\u00011\u00011\u00011\u00011\u0001"+
		"1\u00011\u00011\u00011\u00011\u00011\u00011\u00051\u0555\b1\n1\f1\u0558"+
		"\t1\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u0001"+
		"2\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u0001"+
		"2\u00012\u00012\u00012\u00012\u00042\u0572\b2\u000b2\f2\u0573\u00012\u0001"+
		"2\u00012\u00012\u00012\u00012\u00012\u00052\u057d\b2\n2\f2\u0580\t2\u0001"+
		"2\u00012\u00012\u00012\u00012\u00012\u00012\u00032\u0589\b2\u00012\u0003"+
		"2\u058c\b2\u00012\u00012\u00012\u00032\u0591\b2\u00012\u00012\u00012\u0005"+
		"2\u0596\b2\n2\f2\u0599\t2\u00032\u059b\b2\u00012\u00012\u00012\u00012"+
		"\u00012\u00052\u05a2\b2\n2\f2\u05a5\t2\u00032\u05a7\b2\u00012\u00012\u0003"+
		"2\u05ab\b2\u00012\u00032\u05ae\b2\u00012\u00032\u05b1\b2\u00012\u0001"+
		"2\u00012\u00012\u00012\u00012\u00012\u00012\u00052\u05bb\b2\n2\f2\u05be"+
		"\t2\u00032\u05c0\b2\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u0001"+
		"2\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00042\u05d1\b2\u000b"+
		"2\f2\u05d2\u00012\u00012\u00032\u05d7\b2\u00012\u00012\u00012\u00012\u0004"+
		"2\u05dd\b2\u000b2\f2\u05de\u00012\u00012\u00032\u05e3\b2\u00012\u0001"+
		"2\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u0001"+
		"2\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u0005"+
		"2\u05fa\b2\n2\f2\u05fd\t2\u00032\u05ff\b2\u00012\u00012\u00012\u00012"+
		"\u00012\u00012\u00012\u00032\u0608\b2\u00012\u00012\u00012\u00012\u0003"+
		"2\u060e\b2\u00012\u00012\u00012\u00012\u00032\u0614\b2\u00012\u00012\u0001"+
		"2\u00012\u00032\u061a\b2\u00012\u00012\u00012\u00012\u00012\u00012\u0001"+
		"2\u00012\u00032\u0624\b2\u00012\u00012\u00012\u00012\u00012\u00012\u0001"+
		"2\u00032\u062d\b2\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u0001"+
		"2\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u0001"+
		"2\u00052\u0641\b2\n2\f2\u0644\t2\u00032\u0646\b2\u00012\u00032\u0649\b"+
		"2\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00052\u0653"+
		"\b2\n2\f2\u0656\t2\u00013\u00013\u00013\u00013\u00033\u065c\b3\u00033"+
		"\u065e\b3\u00014\u00014\u00014\u00014\u00034\u0664\b4\u00015\u00015\u0001"+
		"5\u00015\u00015\u00015\u00035\u066c\b5\u00016\u00016\u00017\u00017\u0001"+
		"8\u00018\u00019\u00019\u00039\u0676\b9\u00019\u00019\u00019\u00019\u0003"+
		"9\u067c\b9\u0001:\u0001:\u0001;\u0001;\u0001<\u0001<\u0001<\u0001<\u0005"+
		"<\u0686\b<\n<\f<\u0689\t<\u0003<\u068b\b<\u0001<\u0001<\u0001=\u0001="+
		"\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001"+
		"=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0005"+
		"=\u06a4\b=\n=\f=\u06a7\t=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001"+
		"=\u0005=\u06b0\b=\n=\f=\u06b3\t=\u0001=\u0001=\u0003=\u06b7\b=\u0001="+
		"\u0001=\u0001=\u0001=\u0001=\u0003=\u06be\b=\u0001=\u0001=\u0005=\u06c2"+
		"\b=\n=\f=\u06c5\t=\u0001>\u0001>\u0003>\u06c9\b>\u0001?\u0001?\u0001?"+
		"\u0001?\u0003?\u06cf\b?\u0001@\u0001@\u0001@\u0001@\u0001@\u0001A\u0001"+
		"A\u0001A\u0001A\u0001A\u0001A\u0001B\u0001B\u0001B\u0001B\u0001B\u0001"+
		"B\u0001B\u0005B\u06e3\bB\nB\fB\u06e6\tB\u0003B\u06e8\bB\u0001B\u0001B"+
		"\u0001B\u0001B\u0001B\u0005B\u06ef\bB\nB\fB\u06f2\tB\u0003B\u06f4\bB\u0001"+
		"B\u0003B\u06f7\bB\u0001B\u0001B\u0001C\u0001C\u0001C\u0001C\u0001C\u0001"+
		"C\u0001C\u0001C\u0001C\u0001C\u0001C\u0001C\u0001C\u0001C\u0001C\u0001"+
		"C\u0001C\u0001C\u0001C\u0001C\u0001C\u0001C\u0001C\u0001C\u0003C\u0713"+
		"\bC\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0003"+
		"D\u071e\bD\u0001E\u0001E\u0001E\u0001E\u0003E\u0724\bE\u0001F\u0001F\u0001"+
		"F\u0001F\u0001F\u0003F\u072b\bF\u0001G\u0001G\u0001G\u0001G\u0001G\u0001"+
		"G\u0001G\u0003G\u0734\bG\u0001H\u0001H\u0001H\u0001H\u0001H\u0003H\u073b"+
		"\bH\u0001I\u0001I\u0001I\u0001I\u0003I\u0741\bI\u0001J\u0001J\u0001J\u0005"+
		"J\u0746\bJ\nJ\fJ\u0749\tJ\u0001K\u0001K\u0001K\u0003K\u074e\bK\u0001L"+
		"\u0001L\u0001L\u0001L\u0001L\u0003L\u0755\bL\u0001M\u0001M\u0001M\u0005"+
		"M\u075a\bM\nM\fM\u075d\tM\u0001N\u0001N\u0001N\u0001N\u0001N\u0003N\u0764"+
		"\bN\u0001O\u0001O\u0001O\u0003O\u0769\bO\u0001P\u0001P\u0001P\u0000\u0006"+
		"0L^bdzQ\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098"+
		"\u009a\u009c\u009e\u00a0\u0000\u0017\u0002\u0000\u001a\u001a\u009c\u009c"+
		"\u0002\u000011aa\u0002\u0000JJYY\u0002\u0000==ZZ\u0001\u0000\u00a5\u00a6"+
		"\u0002\u0000\f\f\u00e7\u00e7\u0002\u0000<<\u00c8\u00c8\u0002\u0000\u0013"+
		"\u001333\u0002\u0000FFhh\u0002\u0000\f\f66\u0002\u0000\u0015\u0015\u00b6"+
		"\u00b6\u0001\u0000\u00de\u00df\u0001\u0000\u00e0\u00e2\u0001\u0000\u00d8"+
		"\u00dd\u0003\u0000\f\f\u0010\u0010\u00b1\u00b1\u0002\u0000CC\u00c1\u00c1"+
		"\u0005\u0000//VVst\u00a9\u00a9\u00d6\u00d6\u0001\u0000wz\u0002\u0000G"+
		"G\u008f\u008f\u0003\u0000QQee\u00bb\u00bb\u0004\u000077bbpp\u00cd\u00cd"+
		"\u0002\u0000\u0084\u0084\u00d5\u00d50\u0000\n\f\u000e\u000e\u0010\u0011"+
		"\u0013\u0015\u0018\u001a\u001d\"\'\'))-/11335577==@@BBDGIILQTTVXZZ\\\\"+
		"__abdegikkmmpuw|\u0080\u0082\u0084\u0085\u0088\u0088\u008a\u008f\u0091"+
		"\u0094\u0096\u009f\u00a1\u00a3\u00a5\u00aa\u00ac\u00b6\u00b8\u00bb\u00bd"+
		"\u00c0\u00c2\u00c4\u00c6\u00c7\u00ca\u00cb\u00cd\u00cd\u00cf\u00d0\u00d4"+
		"\u00d7\u0895\u0000\u00a2\u0001\u0000\u0000\u0000\u0002\u00a5\u0001\u0000"+
		"\u0000\u0000\u0004\u00a8\u0001\u0000\u0000\u0000\u0006\u032e\u0001\u0000"+
		"\u0000\u0000\b\u0331\u0001\u0000\u0000\u0000\n\u0335\u0001\u0000\u0000"+
		"\u0000\f\u0343\u0001\u0000\u0000\u0000\u000e\u0345\u0001\u0000\u0000\u0000"+
		"\u0010\u0353\u0001\u0000\u0000\u0000\u0012\u0359\u0001\u0000\u0000\u0000"+
		"\u0014\u0364\u0001\u0000\u0000\u0000\u0016\u0368\u0001\u0000\u0000\u0000"+
		"\u0018\u036e\u0001\u0000\u0000\u0000\u001a\u0375\u0001\u0000\u0000\u0000"+
		"\u001c\u037a\u0001\u0000\u0000\u0000\u001e\u037d\u0001\u0000\u0000\u0000"+
		" \u0381\u0001\u0000\u0000\u0000\"\u0383\u0001\u0000\u0000\u0000$\u0386"+
		"\u0001\u0000\u0000\u0000&\u038d\u0001\u0000\u0000\u0000(\u0392\u0001\u0000"+
		"\u0000\u0000*\u039d\u0001\u0000\u0000\u0000,\u039f\u0001\u0000\u0000\u0000"+
		".\u03a1\u0001\u0000\u0000\u00000\u03c0\u0001\u0000\u0000\u00002\u03e4"+
		"\u0001\u0000\u0000\u00004\u03e6\u0001\u0000\u0000\u00006\u03ee\u0001\u0000"+
		"\u0000\u00008\u03fb\u0001\u0000\u0000\u0000:\u0407\u0001\u0000\u0000\u0000"+
		"<\u0410\u0001\u0000\u0000\u0000>\u0413\u0001\u0000\u0000\u0000@\u0420"+
		"\u0001\u0000\u0000\u0000B\u044b\u0001\u0000\u0000\u0000D\u045a\u0001\u0000"+
		"\u0000\u0000F\u045c\u0001\u0000\u0000\u0000H\u0465\u0001\u0000\u0000\u0000"+
		"J\u0473\u0001\u0000\u0000\u0000L\u0475\u0001\u0000\u0000\u0000N\u049c"+
		"\u0001\u0000\u0000\u0000P\u04ac\u0001\u0000\u0000\u0000R\u04ae\u0001\u0000"+
		"\u0000\u0000T\u04b7\u0001\u0000\u0000\u0000V\u04b9\u0001\u0000\u0000\u0000"+
		"X\u04c3\u0001\u0000\u0000\u0000Z\u04eb\u0001\u0000\u0000\u0000\\\u04ed"+
		"\u0001\u0000\u0000\u0000^\u04f6\u0001\u0000\u0000\u0000`\u0540\u0001\u0000"+
		"\u0000\u0000b\u0546\u0001\u0000\u0000\u0000d\u0648\u0001\u0000\u0000\u0000"+
		"f\u065d\u0001\u0000\u0000\u0000h\u0663\u0001\u0000\u0000\u0000j\u066b"+
		"\u0001\u0000\u0000\u0000l\u066d\u0001\u0000\u0000\u0000n\u066f\u0001\u0000"+
		"\u0000\u0000p\u0671\u0001\u0000\u0000\u0000r\u0673\u0001\u0000\u0000\u0000"+
		"t\u067d\u0001\u0000\u0000\u0000v\u067f\u0001\u0000\u0000\u0000x\u0681"+
		"\u0001\u0000\u0000\u0000z\u06bd\u0001\u0000\u0000\u0000|\u06c8\u0001\u0000"+
		"\u0000\u0000~\u06ce\u0001\u0000\u0000\u0000\u0080\u06d0\u0001\u0000\u0000"+
		"\u0000\u0082\u06d5\u0001\u0000\u0000\u0000\u0084\u06db\u0001\u0000\u0000"+
		"\u0000\u0086\u0712\u0001\u0000\u0000\u0000\u0088\u071d\u0001\u0000\u0000"+
		"\u0000\u008a\u0723\u0001\u0000\u0000\u0000\u008c\u072a\u0001\u0000\u0000"+
		"\u0000\u008e\u0733\u0001\u0000\u0000\u0000\u0090\u073a\u0001\u0000\u0000"+
		"\u0000\u0092\u0740\u0001\u0000\u0000\u0000\u0094\u0742\u0001\u0000\u0000"+
		"\u0000\u0096\u074d\u0001\u0000\u0000\u0000\u0098\u0754\u0001\u0000\u0000"+
		"\u0000\u009a\u0756\u0001\u0000\u0000\u0000\u009c\u0763\u0001\u0000\u0000"+
		"\u0000\u009e\u0768\u0001\u0000\u0000\u0000\u00a0\u076a\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a3\u0003\u0006\u0003\u0000\u00a3\u00a4\u0005\u0000\u0000"+
		"\u0001\u00a4\u0001\u0001\u0000\u0000\u0000\u00a5\u00a6\u0003\\.\u0000"+
		"\u00a6\u00a7\u0005\u0000\u0000\u0001\u00a7\u0003\u0001\u0000\u0000\u0000"+
		"\u00a8\u00a9\u0003 \u0010\u0000\u00a9\u00aa\u0005\u0000\u0000\u0001\u00aa"+
		"\u0005\u0001\u0000\u0000\u0000\u00ab\u032f\u0003\b\u0004\u0000\u00ac\u00ad"+
		"\u0005\u00ca\u0000\u0000\u00ad\u032f\u0003\u009cN\u0000\u00ae\u00af\u0005"+
		"\u00ca\u0000\u0000\u00af\u00b0\u0003\u009cN\u0000\u00b0\u00b1\u0005\u0001"+
		"\u0000\u0000\u00b1\u00b2\u0003\u009cN\u0000\u00b2\u032f\u0001\u0000\u0000"+
		"\u0000\u00b3\u00b4\u0005$\u0000\u0000\u00b4\u00b8\u0005\u00a7\u0000\u0000"+
		"\u00b5\u00b6\u0005W\u0000\u0000\u00b6\u00b7\u0005~\u0000\u0000\u00b7\u00b9"+
		"\u0005?\u0000\u0000\u00b8\u00b5\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001"+
		"\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba\u00bd\u0003"+
		"\u0094J\u0000\u00bb\u00bc\u0005\u00d3\u0000\u0000\u00bc\u00be\u0003\u0012"+
		"\t\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00bd\u00be\u0001\u0000\u0000"+
		"\u0000\u00be\u032f\u0001\u0000\u0000\u0000\u00bf\u00c0\u00058\u0000\u0000"+
		"\u00c0\u00c3\u0005\u00a7\u0000\u0000\u00c1\u00c2\u0005W\u0000\u0000\u00c2"+
		"\u00c4\u0005?\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c3\u00c4"+
		"\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\u00c7"+
		"\u0003\u0094J\u0000\u00c6\u00c8\u0007\u0000\u0000\u0000\u00c7\u00c6\u0001"+
		"\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\u032f\u0001"+
		"\u0000\u0000\u0000\u00c9\u00ca\u0005\r\u0000\u0000\u00ca\u00cb\u0005\u00a7"+
		"\u0000\u0000\u00cb\u00cc\u0003\u0094J\u0000\u00cc\u00cd\u0005\u0097\u0000"+
		"\u0000\u00cd\u00ce\u0005\u00bf\u0000\u0000\u00ce\u00cf\u0003\u009cN\u0000"+
		"\u00cf\u032f\u0001\u0000\u0000\u0000\u00d0\u00d1\u0005$\u0000\u0000\u00d1"+
		"\u00d5\u0005\u00b7\u0000\u0000\u00d2\u00d3\u0005W\u0000\u0000\u00d3\u00d4"+
		"\u0005~\u0000\u0000\u00d4\u00d6\u0005?\u0000\u0000\u00d5\u00d2\u0001\u0000"+
		"\u0000\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000"+
		"\u0000\u0000\u00d7\u00d9\u0003\u0094J\u0000\u00d8\u00da\u0003X,\u0000"+
		"\u00d9\u00d8\u0001\u0000\u0000\u0000\u00d9\u00da\u0001\u0000\u0000\u0000"+
		"\u00da\u00dd\u0001\u0000\u0000\u0000\u00db\u00dc\u0005 \u0000\u0000\u00dc"+
		"\u00de\u0003f3\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u00dd\u00de\u0001"+
		"\u0000\u0000\u0000\u00de\u00e1\u0001\u0000\u0000\u0000\u00df\u00e0\u0005"+
		"\u00d3\u0000\u0000\u00e0\u00e2\u0003\u0012\t\u0000\u00e1\u00df\u0001\u0000"+
		"\u0000\u0000\u00e1\u00e2\u0001\u0000\u0000\u0000\u00e2\u00e3\u0001\u0000"+
		"\u0000\u0000\u00e3\u00e9\u0005\u0012\u0000\u0000\u00e4\u00ea\u0003\b\u0004"+
		"\u0000\u00e5\u00e6\u0005\u0002\u0000\u0000\u00e6\u00e7\u0003\b\u0004\u0000"+
		"\u00e7\u00e8\u0005\u0003\u0000\u0000\u00e8\u00ea\u0001\u0000\u0000\u0000"+
		"\u00e9\u00e4\u0001\u0000\u0000\u0000\u00e9\u00e5\u0001\u0000\u0000\u0000"+
		"\u00ea\u00f0\u0001\u0000\u0000\u0000\u00eb\u00ed\u0005\u00d3\u0000\u0000"+
		"\u00ec\u00ee\u0005{\u0000\u0000\u00ed\u00ec\u0001\u0000\u0000\u0000\u00ed"+
		"\u00ee\u0001\u0000\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000\u0000\u00ef"+
		"\u00f1\u0005-\u0000\u0000\u00f0\u00eb\u0001\u0000\u0000\u0000\u00f0\u00f1"+
		"\u0001\u0000\u0000\u0000\u00f1\u032f\u0001\u0000\u0000\u0000\u00f2\u00f3"+
		"\u0005$\u0000\u0000\u00f3\u00f7\u0005\u00b7\u0000\u0000\u00f4\u00f5\u0005"+
		"W\u0000\u0000\u00f5\u00f6\u0005~\u0000\u0000\u00f6\u00f8\u0005?\u0000"+
		"\u0000\u00f7\u00f4\u0001\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000"+
		"\u0000\u00f8\u00f9\u0001\u0000\u0000\u0000\u00f9\u00fa\u0003\u0094J\u0000"+
		"\u00fa\u00fb\u0005\u0002\u0000\u0000\u00fb\u0100\u0003\f\u0006\u0000\u00fc"+
		"\u00fd\u0005\u0004\u0000\u0000\u00fd\u00ff\u0003\f\u0006\u0000\u00fe\u00fc"+
		"\u0001\u0000\u0000\u0000\u00ff\u0102\u0001\u0000\u0000\u0000\u0100\u00fe"+
		"\u0001\u0000\u0000\u0000\u0100\u0101\u0001\u0000\u0000\u0000\u0101\u0103"+
		"\u0001\u0000\u0000\u0000\u0102\u0100\u0001\u0000\u0000\u0000\u0103\u0106"+
		"\u0005\u0003\u0000\u0000\u0104\u0105\u0005 \u0000\u0000\u0105\u0107\u0003"+
		"f3\u0000\u0106\u0104\u0001\u0000\u0000\u0000\u0106\u0107\u0001\u0000\u0000"+
		"\u0000\u0107\u010a\u0001\u0000\u0000\u0000\u0108\u0109\u0005\u00d3\u0000"+
		"\u0000\u0109\u010b\u0003\u0012\t\u0000\u010a\u0108\u0001\u0000\u0000\u0000"+
		"\u010a\u010b\u0001\u0000\u0000\u0000\u010b\u032f\u0001\u0000\u0000\u0000"+
		"\u010c\u010d\u00058\u0000\u0000\u010d\u0110\u0005\u00b7\u0000\u0000\u010e"+
		"\u010f\u0005W\u0000\u0000\u010f\u0111\u0005?\u0000\u0000\u0110\u010e\u0001"+
		"\u0000\u0000\u0000\u0110\u0111\u0001\u0000\u0000\u0000\u0111\u0112\u0001"+
		"\u0000\u0000\u0000\u0112\u032f\u0003\u0094J\u0000\u0113\u0114\u0005]\u0000"+
		"\u0000\u0114\u0115\u0005`\u0000\u0000\u0115\u0117\u0003\u0094J\u0000\u0116"+
		"\u0118\u0003X,\u0000\u0117\u0116\u0001\u0000\u0000\u0000\u0117\u0118\u0001"+
		"\u0000\u0000\u0000\u0118\u0119\u0001\u0000\u0000\u0000\u0119\u011a\u0003"+
		"\b\u0004\u0000\u011a\u032f\u0001\u0000\u0000\u0000\u011b\u011c\u00052"+
		"\u0000\u0000\u011c\u011d\u0005J\u0000\u0000\u011d\u0120\u0003\u0094J\u0000"+
		"\u011e\u011f\u0005\u00d2\u0000\u0000\u011f\u0121\u0003^/\u0000\u0120\u011e"+
		"\u0001\u0000\u0000\u0000\u0120\u0121\u0001\u0000\u0000\u0000\u0121\u032f"+
		"\u0001\u0000\u0000\u0000\u0122\u0123\u0005\u00c2\u0000\u0000\u0123\u0124"+
		"\u0005\u00b7\u0000\u0000\u0124\u032f\u0003\u0094J\u0000\u0125\u0126\u0005"+
		"\r\u0000\u0000\u0126\u0129\u0005\u00b7\u0000\u0000\u0127\u0128\u0005W"+
		"\u0000\u0000\u0128\u012a\u0005?\u0000\u0000\u0129\u0127\u0001\u0000\u0000"+
		"\u0000\u0129\u012a\u0001\u0000\u0000\u0000\u012a\u012b\u0001\u0000\u0000"+
		"\u0000\u012b\u012c\u0003\u0094J\u0000\u012c\u012d\u0005\u0097\u0000\u0000"+
		"\u012d\u012e\u0005\u00bf\u0000\u0000\u012e\u012f\u0003\u0094J\u0000\u012f"+
		"\u032f\u0001\u0000\u0000\u0000\u0130\u0131\u0005\r\u0000\u0000\u0131\u0134"+
		"\u0005\u00b7\u0000\u0000\u0132\u0133\u0005W\u0000\u0000\u0133\u0135\u0005"+
		"?\u0000\u0000\u0134\u0132\u0001\u0000\u0000\u0000\u0134\u0135\u0001\u0000"+
		"\u0000\u0000\u0135\u0136\u0001\u0000\u0000\u0000\u0136\u0137\u0003\u0094"+
		"J\u0000\u0137\u0138\u0005\u0097\u0000\u0000\u0138\u013b\u0005\u001e\u0000"+
		"\u0000\u0139\u013a\u0005W\u0000\u0000\u013a\u013c\u0005?\u0000\u0000\u013b"+
		"\u0139\u0001\u0000\u0000\u0000\u013b\u013c\u0001\u0000\u0000\u0000\u013c"+
		"\u013d\u0001\u0000\u0000\u0000\u013d\u013e\u0003\u009cN\u0000\u013e\u013f"+
		"\u0005\u00bf\u0000\u0000\u013f\u0140\u0003\u009cN\u0000\u0140\u032f\u0001"+
		"\u0000\u0000\u0000\u0141\u0142\u0005\r\u0000\u0000\u0142\u0145\u0005\u00b7"+
		"\u0000\u0000\u0143\u0144\u0005W\u0000\u0000\u0144\u0146\u0005?\u0000\u0000"+
		"\u0145\u0143\u0001\u0000\u0000\u0000\u0145\u0146\u0001\u0000\u0000\u0000"+
		"\u0146\u0147\u0001\u0000\u0000\u0000\u0147\u0148\u0003\u0094J\u0000\u0148"+
		"\u0149\u00058\u0000\u0000\u0149\u014c\u0005\u001e\u0000\u0000\u014a\u014b"+
		"\u0005W\u0000\u0000\u014b\u014d\u0005?\u0000\u0000\u014c\u014a\u0001\u0000"+
		"\u0000\u0000\u014c\u014d\u0001\u0000\u0000\u0000\u014d\u014e\u0001\u0000"+
		"\u0000\u0000\u014e\u014f\u0003\u0094J\u0000\u014f\u032f\u0001\u0000\u0000"+
		"\u0000\u0150\u0151\u0005\r\u0000\u0000\u0151\u0154\u0005\u00b7\u0000\u0000"+
		"\u0152\u0153\u0005W\u0000\u0000\u0153\u0155\u0005?\u0000\u0000\u0154\u0152"+
		"\u0001\u0000\u0000\u0000\u0154\u0155\u0001\u0000\u0000\u0000\u0155\u0156"+
		"\u0001\u0000\u0000\u0000\u0156\u0157\u0003\u0094J\u0000\u0157\u0158\u0005"+
		"\n\u0000\u0000\u0158\u015c\u0005\u001e\u0000\u0000\u0159\u015a\u0005W"+
		"\u0000\u0000\u015a\u015b\u0005~\u0000\u0000\u015b\u015d\u0005?\u0000\u0000"+
		"\u015c\u0159\u0001\u0000\u0000\u0000\u015c\u015d\u0001\u0000\u0000\u0000"+
		"\u015d\u015e\u0001\u0000\u0000\u0000\u015e\u015f\u0003\u000e\u0007\u0000"+
		"\u015f\u032f\u0001\u0000\u0000\u0000\u0160\u0161\u0005\u000e\u0000\u0000"+
		"\u0161\u0164\u0003\u0094J\u0000\u0162\u0163\u0005\u00d3\u0000\u0000\u0163"+
		"\u0165\u0003\u0012\t\u0000\u0164\u0162\u0001\u0000\u0000\u0000\u0164\u0165"+
		"\u0001\u0000\u0000\u0000\u0165\u032f\u0001\u0000\u0000\u0000\u0166\u0167"+
		"\u0005$\u0000\u0000\u0167\u0168\u0005\u00c4\u0000\u0000\u0168\u0169\u0003"+
		"\u0094J\u0000\u0169\u0176\u0005\u0012\u0000\u0000\u016a\u016b\u0005\u0002"+
		"\u0000\u0000\u016b\u0170\u0003\u0016\u000b\u0000\u016c\u016d\u0005\u0004"+
		"\u0000\u0000\u016d\u016f\u0003\u0016\u000b\u0000\u016e\u016c\u0001\u0000"+
		"\u0000\u0000\u016f\u0172\u0001\u0000\u0000\u0000\u0170\u016e\u0001\u0000"+
		"\u0000\u0000\u0170\u0171\u0001\u0000\u0000\u0000\u0171\u0173\u0001\u0000"+
		"\u0000\u0000\u0172\u0170\u0001\u0000\u0000\u0000\u0173\u0174\u0005\u0003"+
		"\u0000\u0000\u0174\u0177\u0001\u0000\u0000\u0000\u0175\u0177\u0003z=\u0000"+
		"\u0176\u016a\u0001\u0000\u0000\u0000\u0176\u0175\u0001\u0000\u0000\u0000"+
		"\u0177\u032f\u0001\u0000\u0000\u0000\u0178\u017b\u0005$\u0000\u0000\u0179"+
		"\u017a\u0005\u0086\u0000\u0000\u017a\u017c\u0005\u0099\u0000\u0000\u017b"+
		"\u0179\u0001\u0000\u0000\u0000\u017b\u017c\u0001\u0000\u0000\u0000\u017c"+
		"\u017d\u0001\u0000\u0000\u0000\u017d\u017e\u0005\u00d0\u0000\u0000\u017e"+
		"\u0181\u0003\u0094J\u0000\u017f\u0180\u0005\u00aa\u0000\u0000\u0180\u0182"+
		"\u0007\u0001\u0000\u0000\u0181\u017f\u0001\u0000\u0000\u0000\u0181\u0182"+
		"\u0001\u0000\u0000\u0000\u0182\u0183\u0001\u0000\u0000\u0000\u0183\u0184"+
		"\u0005\u0012\u0000\u0000\u0184\u0185\u0003\b\u0004\u0000\u0185\u032f\u0001"+
		"\u0000\u0000\u0000\u0186\u0187\u00058\u0000\u0000\u0187\u018a\u0005\u00d0"+
		"\u0000\u0000\u0188\u0189\u0005W\u0000\u0000\u0189\u018b\u0005?\u0000\u0000"+
		"\u018a\u0188\u0001\u0000\u0000\u0000\u018a\u018b\u0001\u0000\u0000\u0000"+
		"\u018b\u018c\u0001\u0000\u0000\u0000\u018c\u032f\u0003\u0094J\u0000\u018d"+
		"\u018e\u0005$\u0000\u0000\u018e\u018f\u0005r\u0000\u0000\u018f\u0193\u0005"+
		"\u00d0\u0000\u0000\u0190\u0191\u0005W\u0000\u0000\u0191\u0192\u0005~\u0000"+
		"\u0000\u0192\u0194\u0005?\u0000\u0000\u0193\u0190\u0001\u0000\u0000\u0000"+
		"\u0193\u0194\u0001\u0000\u0000\u0000\u0194\u0195\u0001\u0000\u0000\u0000"+
		"\u0195\u0198\u0003\u0094J\u0000\u0196\u0197\u0005 \u0000\u0000\u0197\u0199"+
		"\u0003f3\u0000\u0198\u0196\u0001\u0000\u0000\u0000\u0198\u0199\u0001\u0000"+
		"\u0000\u0000\u0199\u019c\u0001\u0000\u0000\u0000\u019a\u019b\u0005\u00d3"+
		"\u0000\u0000\u019b\u019d\u0003\u0012\t\u0000\u019c\u019a\u0001\u0000\u0000"+
		"\u0000\u019c\u019d\u0001\u0000\u0000\u0000\u019d\u019e\u0001\u0000\u0000"+
		"\u0000\u019e\u01a4\u0005\u0012\u0000\u0000\u019f\u01a5\u0003\b\u0004\u0000"+
		"\u01a0\u01a1\u0005\u0002\u0000\u0000\u01a1\u01a2\u0003\b\u0004\u0000\u01a2"+
		"\u01a3\u0005\u0003\u0000\u0000\u01a3\u01a5\u0001\u0000\u0000\u0000\u01a4"+
		"\u019f\u0001\u0000\u0000\u0000\u01a4\u01a0\u0001\u0000\u0000\u0000\u01a5"+
		"\u032f\u0001\u0000\u0000\u0000\u01a6\u01a7\u00058\u0000\u0000\u01a7\u01a8"+
		"\u0005r\u0000\u0000\u01a8\u01ab\u0005\u00d0\u0000\u0000\u01a9\u01aa\u0005"+
		"W\u0000\u0000\u01aa\u01ac\u0005?\u0000\u0000\u01ab\u01a9\u0001\u0000\u0000"+
		"\u0000\u01ab\u01ac\u0001\u0000\u0000\u0000\u01ac\u01ad\u0001\u0000\u0000"+
		"\u0000\u01ad\u032f\u0003\u0094J\u0000\u01ae\u01af\u0005\u0096\u0000\u0000"+
		"\u01af\u01b0\u0005r\u0000\u0000\u01b0\u01b1\u0005\u00d0\u0000\u0000\u01b1"+
		"\u01b2\u0003\u0094J\u0000\u01b2\u01b3\u0005\u00d2\u0000\u0000\u01b3\u01b4"+
		"\u0003^/\u0000\u01b4\u032f\u0001\u0000\u0000\u0000\u01b5\u01b8\u0005$"+
		"\u0000\u0000\u01b6\u01b7\u0005\u0086\u0000\u0000\u01b7\u01b9\u0005\u0099"+
		"\u0000\u0000\u01b8\u01b6\u0001\u0000\u0000\u0000\u01b8\u01b9\u0001\u0000"+
		"\u0000\u0000\u01b9\u01bb\u0001\u0000\u0000\u0000\u01ba\u01bc\u0005\u00ba"+
		"\u0000\u0000\u01bb\u01ba\u0001\u0000\u0000\u0000\u01bb\u01bc\u0001\u0000"+
		"\u0000\u0000\u01bc\u01bd\u0001\u0000\u0000\u0000\u01bd\u01be\u0005L\u0000"+
		"\u0000\u01be\u01bf\u0003\u0094J\u0000\u01bf\u01c8\u0005\u0002\u0000\u0000"+
		"\u01c0\u01c5\u0003\u0016\u000b\u0000\u01c1\u01c2\u0005\u0004\u0000\u0000"+
		"\u01c2\u01c4\u0003\u0016\u000b\u0000\u01c3\u01c1\u0001\u0000\u0000\u0000"+
		"\u01c4\u01c7\u0001\u0000\u0000\u0000\u01c5\u01c3\u0001\u0000\u0000\u0000"+
		"\u01c5\u01c6\u0001\u0000\u0000\u0000\u01c6\u01c9\u0001\u0000\u0000\u0000"+
		"\u01c7\u01c5\u0001\u0000\u0000\u0000\u01c8\u01c0\u0001\u0000\u0000\u0000"+
		"\u01c8\u01c9\u0001\u0000\u0000\u0000\u01c9\u01ca\u0001\u0000\u0000\u0000"+
		"\u01ca\u01cb\u0005\u0003\u0000\u0000\u01cb\u01cc\u0005\u009e\u0000\u0000"+
		"\u01cc\u01cf\u0003z=\u0000\u01cd\u01ce\u0005 \u0000\u0000\u01ce\u01d0"+
		"\u0003f3\u0000\u01cf\u01cd\u0001\u0000\u0000\u0000\u01cf\u01d0\u0001\u0000"+
		"\u0000\u0000\u01d0\u01d1\u0001\u0000\u0000\u0000\u01d1\u01d2\u0003\u0018"+
		"\f\u0000\u01d2\u01d3\u0003 \u0010\u0000\u01d3\u032f\u0001\u0000\u0000"+
		"\u0000\u01d4\u01d5\u0005\r\u0000\u0000\u01d5\u01d6\u0005L\u0000\u0000"+
		"\u01d6\u01d8\u0003\u0094J\u0000\u01d7\u01d9\u0003x<\u0000\u01d8\u01d7"+
		"\u0001\u0000\u0000\u0000\u01d8\u01d9\u0001\u0000\u0000\u0000\u01d9\u01da"+
		"\u0001\u0000\u0000\u0000\u01da\u01db\u0003\u001c\u000e\u0000\u01db\u032f"+
		"\u0001\u0000\u0000\u0000\u01dc\u01de\u00058\u0000\u0000\u01dd\u01df\u0005"+
		"\u00ba\u0000\u0000\u01de\u01dd\u0001\u0000\u0000\u0000\u01de\u01df\u0001"+
		"\u0000\u0000\u0000\u01df\u01e0\u0001\u0000\u0000\u0000\u01e0\u01e3\u0005"+
		"L\u0000\u0000\u01e1\u01e2\u0005W\u0000\u0000\u01e2\u01e4\u0005?\u0000"+
		"\u0000\u01e3\u01e1\u0001\u0000\u0000\u0000\u01e3\u01e4\u0001\u0000\u0000"+
		"\u0000\u01e4\u01e5\u0001\u0000\u0000\u0000\u01e5\u01e7\u0003\u0094J\u0000"+
		"\u01e6\u01e8\u0003x<\u0000\u01e7\u01e6\u0001\u0000\u0000\u0000\u01e7\u01e8"+
		"\u0001\u0000\u0000\u0000\u01e8\u032f\u0001\u0000\u0000\u0000\u01e9\u01ea"+
		"\u0005\u0018\u0000\u0000\u01ea\u01eb\u0003\u0094J\u0000\u01eb\u01f4\u0005"+
		"\u0002\u0000\u0000\u01ec\u01f1\u0003\u0090H\u0000\u01ed\u01ee\u0005\u0004"+
		"\u0000\u0000\u01ee\u01f0\u0003\u0090H\u0000\u01ef\u01ed\u0001\u0000\u0000"+
		"\u0000\u01f0\u01f3\u0001\u0000\u0000\u0000\u01f1\u01ef\u0001\u0000\u0000"+
		"\u0000\u01f1\u01f2\u0001\u0000\u0000\u0000\u01f2\u01f5\u0001\u0000\u0000"+
		"\u0000\u01f3\u01f1\u0001\u0000\u0000\u0000\u01f4\u01ec\u0001\u0000\u0000"+
		"\u0000\u01f4\u01f5\u0001\u0000\u0000\u0000\u01f5\u01f6\u0001\u0000\u0000"+
		"\u0000\u01f6\u01f7\u0005\u0003\u0000\u0000\u01f7\u032f\u0001\u0000\u0000"+
		"\u0000\u01f8\u01f9\u0005$\u0000\u0000\u01f9\u01fa\u0005\u00a1\u0000\u0000"+
		"\u01fa\u01fe\u0003\u009cN\u0000\u01fb\u01fc\u0005\u00d3\u0000\u0000\u01fc"+
		"\u01fd\u0005\u000b\u0000\u0000\u01fd\u01ff\u0003\u0096K\u0000\u01fe\u01fb"+
		"\u0001\u0000\u0000\u0000\u01fe\u01ff\u0001\u0000\u0000\u0000\u01ff\u032f"+
		"\u0001\u0000\u0000\u0000\u0200\u0201\u00058\u0000\u0000\u0201\u0202\u0005"+
		"\u00a1\u0000\u0000\u0202\u032f\u0003\u009cN\u0000\u0203\u0204\u0005N\u0000"+
		"\u0000\u0204\u0205\u0003\u009aM\u0000\u0205\u0206\u0005\u00bf\u0000\u0000"+
		"\u0206\u020b\u0003\u0098L\u0000\u0207\u0208\u0005\u0004\u0000\u0000\u0208"+
		"\u020a\u0003\u0098L\u0000\u0209\u0207\u0001\u0000\u0000\u0000\u020a\u020d"+
		"\u0001\u0000\u0000\u0000\u020b\u0209\u0001\u0000\u0000\u0000\u020b\u020c"+
		"\u0001\u0000\u0000\u0000\u020c\u0211\u0001\u0000\u0000\u0000\u020d\u020b"+
		"\u0001\u0000\u0000\u0000\u020e\u020f\u0005\u00d3\u0000\u0000\u020f\u0210"+
		"\u0005\u000b\u0000\u0000\u0210\u0212\u0005\u0085\u0000\u0000\u0211\u020e"+
		"\u0001\u0000\u0000\u0000\u0211\u0212\u0001\u0000\u0000\u0000\u0212\u0216"+
		"\u0001\u0000\u0000\u0000\u0213\u0214\u0005O\u0000\u0000\u0214\u0215\u0005"+
		"\u0017\u0000\u0000\u0215\u0217\u0003\u0096K\u0000\u0216\u0213\u0001\u0000"+
		"\u0000\u0000\u0216\u0217\u0001\u0000\u0000\u0000\u0217\u032f\u0001\u0000"+
		"\u0000\u0000\u0218\u021c\u0005\u009f\u0000\u0000\u0219\u021a\u0005\u000b"+
		"\u0000\u0000\u021a\u021b\u0005\u0085\u0000\u0000\u021b\u021d\u0005H\u0000"+
		"\u0000\u021c\u0219\u0001\u0000\u0000\u0000\u021c\u021d\u0001\u0000\u0000"+
		"\u0000\u021d\u021e\u0001\u0000\u0000\u0000\u021e\u021f\u0003\u009aM\u0000"+
		"\u021f\u0220\u0005J\u0000\u0000\u0220\u0225\u0003\u0098L\u0000\u0221\u0222"+
		"\u0005\u0004\u0000\u0000\u0222\u0224\u0003\u0098L\u0000\u0223\u0221\u0001"+
		"\u0000\u0000\u0000\u0224\u0227\u0001\u0000\u0000\u0000\u0225\u0223\u0001"+
		"\u0000\u0000\u0000\u0225\u0226\u0001\u0000\u0000\u0000\u0226\u022b\u0001"+
		"\u0000\u0000\u0000\u0227\u0225\u0001\u0000\u0000\u0000\u0228\u0229\u0005"+
		"O\u0000\u0000\u0229\u022a\u0005\u0017\u0000\u0000\u022a\u022c\u0003\u0096"+
		"K\u0000\u022b\u0228\u0001\u0000\u0000\u0000\u022b\u022c\u0001\u0000\u0000"+
		"\u0000\u022c\u032f\u0001\u0000\u0000\u0000\u022d\u022e\u0005\u00ae\u0000"+
		"\u0000\u022e\u0232\u0005\u00a1\u0000\u0000\u022f\u0233\u0005\f\u0000\u0000"+
		"\u0230\u0233\u0005|\u0000\u0000\u0231\u0233\u0003\u009cN\u0000\u0232\u022f"+
		"\u0001\u0000\u0000\u0000\u0232\u0230\u0001\u0000\u0000\u0000\u0232\u0231"+
		"\u0001\u0000\u0000\u0000\u0233\u032f\u0001\u0000\u0000\u0000\u0234\u023f"+
		"\u0005N\u0000\u0000\u0235\u023a\u0003\u0092I\u0000\u0236\u0237\u0005\u0004"+
		"\u0000\u0000\u0237\u0239\u0003\u0092I\u0000\u0238\u0236\u0001\u0000\u0000"+
		"\u0000\u0239\u023c\u0001\u0000\u0000\u0000\u023a\u0238\u0001\u0000\u0000"+
		"\u0000\u023a\u023b\u0001\u0000\u0000\u0000\u023b\u0240\u0001\u0000\u0000"+
		"\u0000\u023c\u023a\u0001\u0000\u0000\u0000\u023d\u023e\u0005\f\u0000\u0000"+
		"\u023e\u0240\u0005\u0091\u0000\u0000\u023f\u0235\u0001\u0000\u0000\u0000"+
		"\u023f\u023d\u0001\u0000\u0000\u0000\u0240\u0241\u0001\u0000\u0000\u0000"+
		"\u0241\u0243\u0005\u0083\u0000\u0000\u0242\u0244\u0005\u00b7\u0000\u0000"+
		"\u0243\u0242\u0001\u0000\u0000\u0000\u0243\u0244\u0001\u0000\u0000\u0000"+
		"\u0244\u0245\u0001\u0000\u0000\u0000\u0245\u0246\u0003\u0094J\u0000\u0246"+
		"\u0247\u0005\u00bf\u0000\u0000\u0247\u024b\u0003\u0098L\u0000\u0248\u0249"+
		"\u0005\u00d3\u0000\u0000\u0249\u024a\u0005N\u0000\u0000\u024a\u024c\u0005"+
		"\u0085\u0000\u0000\u024b\u0248\u0001\u0000\u0000\u0000\u024b\u024c\u0001"+
		"\u0000\u0000\u0000\u024c\u032f\u0001\u0000\u0000\u0000\u024d\u0251\u0005"+
		"\u009f\u0000\u0000\u024e\u024f\u0005N\u0000\u0000\u024f\u0250\u0005\u0085"+
		"\u0000\u0000\u0250\u0252\u0005H\u0000\u0000\u0251\u024e\u0001\u0000\u0000"+
		"\u0000\u0251\u0252\u0001\u0000\u0000\u0000\u0252\u025d\u0001\u0000\u0000"+
		"\u0000\u0253\u0258\u0003\u0092I\u0000\u0254\u0255\u0005\u0004\u0000\u0000"+
		"\u0255\u0257\u0003\u0092I\u0000\u0256\u0254\u0001\u0000\u0000\u0000\u0257"+
		"\u025a\u0001\u0000\u0000\u0000\u0258\u0256\u0001\u0000\u0000\u0000\u0258"+
		"\u0259\u0001\u0000\u0000\u0000\u0259\u025e\u0001\u0000\u0000\u0000\u025a"+
		"\u0258\u0001\u0000\u0000\u0000\u025b\u025c\u0005\f\u0000\u0000\u025c\u025e"+
		"\u0005\u0091\u0000\u0000\u025d\u0253\u0001\u0000\u0000\u0000\u025d\u025b"+
		"\u0001\u0000\u0000\u0000\u025e\u025f\u0001\u0000\u0000\u0000\u025f\u0261"+
		"\u0005\u0083\u0000\u0000\u0260\u0262\u0005\u00b7\u0000\u0000\u0261\u0260"+
		"\u0001\u0000\u0000\u0000\u0261\u0262\u0001\u0000\u0000\u0000\u0262\u0263"+
		"\u0001\u0000\u0000\u0000\u0263\u0264\u0003\u0094J\u0000\u0264\u0265\u0005"+
		"J\u0000\u0000\u0265\u0266\u0003\u0098L\u0000\u0266\u032f\u0001\u0000\u0000"+
		"\u0000\u0267\u0268\u0005\u00b0\u0000\u0000\u0268\u026e\u0005P\u0000\u0000"+
		"\u0269\u026b\u0005\u0083\u0000\u0000\u026a\u026c\u0005\u00b7\u0000\u0000"+
		"\u026b\u026a\u0001\u0000\u0000\u0000\u026b\u026c\u0001\u0000\u0000\u0000"+
		"\u026c\u026d\u0001\u0000\u0000\u0000\u026d\u026f\u0003\u0094J\u0000\u026e"+
		"\u0269\u0001\u0000\u0000\u0000\u026e\u026f\u0001\u0000\u0000\u0000\u026f"+
		"\u032f\u0001\u0000\u0000\u0000\u0270\u0272\u0005@\u0000\u0000\u0271\u0273"+
		"\u0005\u000e\u0000\u0000\u0272\u0271\u0001\u0000\u0000\u0000\u0272\u0273"+
		"\u0001\u0000\u0000\u0000\u0273\u0275\u0001\u0000\u0000\u0000\u0274\u0276"+
		"\u0005\u00cf\u0000\u0000\u0275\u0274\u0001\u0000\u0000\u0000\u0275\u0276"+
		"\u0001\u0000\u0000\u0000\u0276\u0282\u0001\u0000\u0000\u0000\u0277\u0278"+
		"\u0005\u0002\u0000\u0000\u0278\u027d\u0003\u008aE\u0000\u0279\u027a\u0005"+
		"\u0004\u0000\u0000\u027a\u027c\u0003\u008aE\u0000\u027b\u0279\u0001\u0000"+
		"\u0000\u0000\u027c\u027f\u0001\u0000\u0000\u0000\u027d\u027b\u0001\u0000"+
		"\u0000\u0000\u027d\u027e\u0001\u0000\u0000\u0000\u027e\u0280\u0001\u0000"+
		"\u0000\u0000\u027f\u027d\u0001\u0000\u0000\u0000\u0280\u0281\u0005\u0003"+
		"\u0000\u0000\u0281\u0283\u0001\u0000\u0000\u0000\u0282\u0277\u0001\u0000"+
		"\u0000\u0000\u0282\u0283\u0001\u0000\u0000\u0000\u0283\u0284\u0001\u0000"+
		"\u0000\u0000\u0284\u032f\u0003\u0006\u0003\u0000\u0285\u0286\u0005\u00b0"+
		"\u0000\u0000\u0286\u0287\u0005$\u0000\u0000\u0287\u0288\u0005\u00b7\u0000"+
		"\u0000\u0288\u032f\u0003\u0094J\u0000\u0289\u028a\u0005\u00b0\u0000\u0000"+
		"\u028a\u028b\u0005$\u0000\u0000\u028b\u028c\u0005\u00d0\u0000\u0000\u028c"+
		"\u032f\u0003\u0094J\u0000\u028d\u028e\u0005\u00b0\u0000\u0000\u028e\u028f"+
		"\u0005$\u0000\u0000\u028f\u0290\u0005r\u0000\u0000\u0290\u0291\u0005\u00d0"+
		"\u0000\u0000\u0291\u032f\u0003\u0094J\u0000\u0292\u0293\u0005\u00b0\u0000"+
		"\u0000\u0293\u0294\u0005$\u0000\u0000\u0294\u0295\u0005L\u0000\u0000\u0295"+
		"\u0297\u0003\u0094J\u0000\u0296\u0298\u0003x<\u0000\u0297\u0296\u0001"+
		"\u0000\u0000\u0000\u0297\u0298\u0001\u0000\u0000\u0000\u0298\u032f\u0001"+
		"\u0000\u0000\u0000\u0299\u029a\u0005\u00b0\u0000\u0000\u029a\u029d\u0005"+
		"\u00b8\u0000\u0000\u029b\u029c\u0007\u0002\u0000\u0000\u029c\u029e\u0003"+
		"\u0094J\u0000\u029d\u029b\u0001\u0000\u0000\u0000\u029d\u029e\u0001\u0000"+
		"\u0000\u0000\u029e\u02a5\u0001\u0000\u0000\u0000\u029f\u02a0\u0005l\u0000"+
		"\u0000\u02a0\u02a3\u0003f3\u0000\u02a1\u02a2\u0005;\u0000\u0000\u02a2"+
		"\u02a4\u0003f3\u0000\u02a3\u02a1\u0001\u0000\u0000\u0000\u02a3\u02a4\u0001"+
		"\u0000\u0000\u0000\u02a4\u02a6\u0001\u0000\u0000\u0000\u02a5\u029f\u0001"+
		"\u0000\u0000\u0000\u02a5\u02a6\u0001\u0000\u0000\u0000\u02a6\u032f\u0001"+
		"\u0000\u0000\u0000\u02a7\u02a8\u0005\u00b0\u0000\u0000\u02a8\u02ab\u0005"+
		"\u00a8\u0000\u0000\u02a9\u02aa\u0007\u0002\u0000\u0000\u02aa\u02ac\u0003"+
		"\u009cN\u0000\u02ab\u02a9\u0001\u0000\u0000\u0000\u02ab\u02ac\u0001\u0000"+
		"\u0000\u0000\u02ac\u02b3\u0001\u0000\u0000\u0000\u02ad\u02ae\u0005l\u0000"+
		"\u0000\u02ae\u02b1\u0003f3\u0000\u02af\u02b0\u0005;\u0000\u0000\u02b0"+
		"\u02b2\u0003f3\u0000\u02b1\u02af\u0001\u0000\u0000\u0000\u02b1\u02b2\u0001"+
		"\u0000\u0000\u0000\u02b2\u02b4\u0001\u0000\u0000\u0000\u02b3\u02ad\u0001"+
		"\u0000\u0000\u0000\u02b3\u02b4\u0001\u0000\u0000\u0000\u02b4\u032f\u0001"+
		"\u0000\u0000\u0000\u02b5\u02b6\u0005\u00b0\u0000\u0000\u02b6\u02bd\u0005"+
		"\u001d\u0000\u0000\u02b7\u02b8\u0005l\u0000\u0000\u02b8\u02bb\u0003f3"+
		"\u0000\u02b9\u02ba\u0005;\u0000\u0000\u02ba\u02bc\u0003f3\u0000\u02bb"+
		"\u02b9\u0001\u0000\u0000\u0000\u02bb\u02bc\u0001\u0000\u0000\u0000\u02bc"+
		"\u02be\u0001\u0000\u0000\u0000\u02bd\u02b7\u0001\u0000\u0000\u0000\u02bd"+
		"\u02be\u0001\u0000\u0000\u0000\u02be\u032f\u0001\u0000\u0000\u0000\u02bf"+
		"\u02c0\u0005\u00b0\u0000\u0000\u02c0\u02c1\u0005\u001f\u0000\u0000\u02c1"+
		"\u02c2\u0007\u0002\u0000\u0000\u02c2\u032f\u0003\u0094J\u0000\u02c3\u02c4"+
		"\u0005\u00b0\u0000\u0000\u02c4\u02c5\u0005\u00b4\u0000\u0000\u02c5\u02c6"+
		"\u0005H\u0000\u0000\u02c6\u032f\u0003\u0094J\u0000\u02c7\u02c8\u0005\u00b0"+
		"\u0000\u0000\u02c8\u02c9\u0005\u00b4\u0000\u0000\u02c9\u02ca\u0005H\u0000"+
		"\u0000\u02ca\u02cb\u0005\u0002\u0000\u0000\u02cb\u02cc\u00036\u001b\u0000"+
		"\u02cc\u02cd\u0005\u0003\u0000\u0000\u02cd\u032f\u0001\u0000\u0000\u0000"+
		"\u02ce\u02d0\u0005\u00b0\u0000\u0000\u02cf\u02d1\u0005\'\u0000\u0000\u02d0"+
		"\u02cf\u0001\u0000\u0000\u0000\u02d0\u02d1\u0001\u0000\u0000\u0000\u02d1"+
		"\u02d2\u0001\u0000\u0000\u0000\u02d2\u02d5\u0005\u00a2\u0000\u0000\u02d3"+
		"\u02d4\u0007\u0002\u0000\u0000\u02d4\u02d6\u0003\u009cN\u0000\u02d5\u02d3"+
		"\u0001\u0000\u0000\u0000\u02d5\u02d6\u0001\u0000\u0000\u0000\u02d6\u032f"+
		"\u0001\u0000\u0000\u0000\u02d7\u02d8\u0005\u00b0\u0000\u0000\u02d8\u02d9"+
		"\u0005\u00a1\u0000\u0000\u02d9\u02dc\u0005P\u0000\u0000\u02da\u02db\u0007"+
		"\u0002\u0000\u0000\u02db\u02dd\u0003\u009cN\u0000\u02dc\u02da\u0001\u0000"+
		"\u0000\u0000\u02dc\u02dd\u0001\u0000\u0000\u0000\u02dd\u032f\u0001\u0000"+
		"\u0000\u0000\u02de\u02df\u00054\u0000\u0000\u02df\u032f\u0003\u0094J\u0000"+
		"\u02e0\u02e1\u00053\u0000\u0000\u02e1\u032f\u0003\u0094J\u0000\u02e2\u02e3"+
		"\u0005\u00b0\u0000\u0000\u02e3\u02ea\u0005M\u0000\u0000\u02e4\u02e5\u0005"+
		"l\u0000\u0000\u02e5\u02e8\u0003f3\u0000\u02e6\u02e7\u0005;\u0000\u0000"+
		"\u02e7\u02e9\u0003f3\u0000\u02e8\u02e6\u0001\u0000\u0000\u0000\u02e8\u02e9"+
		"\u0001\u0000\u0000\u0000\u02e9\u02eb\u0001\u0000\u0000\u0000\u02ea\u02e4"+
		"\u0001\u0000\u0000\u0000\u02ea\u02eb\u0001\u0000\u0000\u0000\u02eb\u032f"+
		"\u0001\u0000\u0000\u0000\u02ec\u02ed\u0005\u00b0\u0000\u0000\u02ed\u02f4"+
		"\u0005\u00ad\u0000\u0000\u02ee\u02ef\u0005l\u0000\u0000\u02ef\u02f2\u0003"+
		"f3\u0000\u02f0\u02f1\u0005;\u0000\u0000\u02f1\u02f3\u0003f3\u0000\u02f2"+
		"\u02f0\u0001\u0000\u0000\u0000\u02f2\u02f3\u0001\u0000\u0000\u0000\u02f3"+
		"\u02f5\u0001\u0000\u0000\u0000\u02f4\u02ee\u0001\u0000\u0000\u0000\u02f4"+
		"\u02f5\u0001\u0000\u0000\u0000\u02f5\u032f\u0001\u0000\u0000\u0000\u02f6"+
		"\u02f7\u0005\u00ae\u0000\u0000\u02f7\u02f8\u0005\u00ad\u0000\u0000\u02f8"+
		"\u02f9\u0003\u0094J\u0000\u02f9\u02fa\u0005\u00d8\u0000\u0000\u02fa\u02fb"+
		"\u0003\\.\u0000\u02fb\u032f\u0001\u0000\u0000\u0000\u02fc\u02fd\u0005"+
		"\u009a\u0000\u0000\u02fd\u02fe\u0005\u00ad\u0000\u0000\u02fe\u032f\u0003"+
		"\u0094J\u0000\u02ff\u0300\u0005\u00b3\u0000\u0000\u0300\u0309\u0005\u00c0"+
		"\u0000\u0000\u0301\u0306\u0003\u008cF\u0000\u0302\u0303\u0005\u0004\u0000"+
		"\u0000\u0303\u0305\u0003\u008cF\u0000\u0304\u0302\u0001\u0000\u0000\u0000"+
		"\u0305\u0308\u0001\u0000\u0000\u0000\u0306\u0304\u0001\u0000\u0000\u0000"+
		"\u0306\u0307\u0001\u0000\u0000\u0000\u0307\u030a\u0001\u0000\u0000\u0000"+
		"\u0308\u0306\u0001\u0000\u0000\u0000\u0309\u0301\u0001\u0000\u0000\u0000"+
		"\u0309\u030a\u0001\u0000\u0000\u0000\u030a\u032f\u0001\u0000\u0000\u0000"+
		"\u030b\u030d\u0005!\u0000\u0000\u030c\u030e\u0005\u00d4\u0000\u0000\u030d"+
		"\u030c\u0001\u0000\u0000\u0000\u030d\u030e\u0001\u0000\u0000\u0000\u030e"+
		"\u032f\u0001\u0000\u0000\u0000\u030f\u0311\u0005\u00a3\u0000\u0000\u0310"+
		"\u0312\u0005\u00d4\u0000\u0000\u0311\u0310\u0001\u0000\u0000\u0000\u0311"+
		"\u0312\u0001\u0000\u0000\u0000\u0312\u032f\u0001\u0000\u0000\u0000\u0313"+
		"\u0314\u0005\u0090\u0000\u0000\u0314\u0315\u0003\u009cN\u0000\u0315\u0316"+
		"\u0005J\u0000\u0000\u0316\u0317\u0003\u0006\u0003\u0000\u0317\u032f\u0001"+
		"\u0000\u0000\u0000\u0318\u0319\u00050\u0000\u0000\u0319\u031a\u0005\u0090"+
		"\u0000\u0000\u031a\u032f\u0003\u009cN\u0000\u031b\u031c\u0005>\u0000\u0000"+
		"\u031c\u0326\u0003\u009cN\u0000\u031d\u031e\u0005\u00cc\u0000\u0000\u031e"+
		"\u0323\u0003\\.\u0000\u031f\u0320\u0005\u0004\u0000\u0000\u0320\u0322"+
		"\u0003\\.\u0000\u0321\u031f\u0001\u0000\u0000\u0000\u0322\u0325\u0001"+
		"\u0000\u0000\u0000\u0323\u0321\u0001\u0000\u0000\u0000\u0323\u0324\u0001"+
		"\u0000\u0000\u0000\u0324\u0327\u0001\u0000\u0000\u0000\u0325\u0323\u0001"+
		"\u0000\u0000\u0000\u0326\u031d\u0001\u0000\u0000\u0000\u0326\u0327\u0001"+
		"\u0000\u0000\u0000\u0327\u032f\u0001\u0000\u0000\u0000\u0328\u0329\u0005"+
		"4\u0000\u0000\u0329\u032a\u0005\\\u0000\u0000\u032a\u032f\u0003\u009c"+
		"N\u0000\u032b\u032c\u00054\u0000\u0000\u032c\u032d\u0005\u008a\u0000\u0000"+
		"\u032d\u032f\u0003\u009cN\u0000\u032e\u00ab\u0001\u0000\u0000\u0000\u032e"+
		"\u00ac\u0001\u0000\u0000\u0000\u032e\u00ae\u0001\u0000\u0000\u0000\u032e"+
		"\u00b3\u0001\u0000\u0000\u0000\u032e\u00bf\u0001\u0000\u0000\u0000\u032e"+
		"\u00c9\u0001\u0000\u0000\u0000\u032e\u00d0\u0001\u0000\u0000\u0000\u032e"+
		"\u00f2\u0001\u0000\u0000\u0000\u032e\u010c\u0001\u0000\u0000\u0000\u032e"+
		"\u0113\u0001\u0000\u0000\u0000\u032e\u011b\u0001\u0000\u0000\u0000\u032e"+
		"\u0122\u0001\u0000\u0000\u0000\u032e\u0125\u0001\u0000\u0000\u0000\u032e"+
		"\u0130\u0001\u0000\u0000\u0000\u032e\u0141\u0001\u0000\u0000\u0000\u032e"+
		"\u0150\u0001\u0000\u0000\u0000\u032e\u0160\u0001\u0000\u0000\u0000\u032e"+
		"\u0166\u0001\u0000\u0000\u0000\u032e\u0178\u0001\u0000\u0000\u0000\u032e"+
		"\u0186\u0001\u0000\u0000\u0000\u032e\u018d\u0001\u0000\u0000\u0000\u032e"+
		"\u01a6\u0001\u0000\u0000\u0000\u032e\u01ae\u0001\u0000\u0000\u0000\u032e"+
		"\u01b5\u0001\u0000\u0000\u0000\u032e\u01d4\u0001\u0000\u0000\u0000\u032e"+
		"\u01dc\u0001\u0000\u0000\u0000\u032e\u01e9\u0001\u0000\u0000\u0000\u032e"+
		"\u01f8\u0001\u0000\u0000\u0000\u032e\u0200\u0001\u0000\u0000\u0000\u032e"+
		"\u0203\u0001\u0000\u0000\u0000\u032e\u0218\u0001\u0000\u0000\u0000\u032e"+
		"\u022d\u0001\u0000\u0000\u0000\u032e\u0234\u0001\u0000\u0000\u0000\u032e"+
		"\u024d\u0001\u0000\u0000\u0000\u032e\u0267\u0001\u0000\u0000\u0000\u032e"+
		"\u0270\u0001\u0000\u0000\u0000\u032e\u0285\u0001\u0000\u0000\u0000\u032e"+
		"\u0289\u0001\u0000\u0000\u0000\u032e\u028d\u0001\u0000\u0000\u0000\u032e"+
		"\u0292\u0001\u0000\u0000\u0000\u032e\u0299\u0001\u0000\u0000\u0000\u032e"+
		"\u02a7\u0001\u0000\u0000\u0000\u032e\u02b5\u0001\u0000\u0000\u0000\u032e"+
		"\u02bf\u0001\u0000\u0000\u0000\u032e\u02c3\u0001\u0000\u0000\u0000\u032e"+
		"\u02c7\u0001\u0000\u0000\u0000\u032e\u02ce\u0001\u0000\u0000\u0000\u032e"+
		"\u02d7\u0001\u0000\u0000\u0000\u032e\u02de\u0001\u0000\u0000\u0000\u032e"+
		"\u02e0\u0001\u0000\u0000\u0000\u032e\u02e2\u0001\u0000\u0000\u0000\u032e"+
		"\u02ec\u0001\u0000\u0000\u0000\u032e\u02f6\u0001\u0000\u0000\u0000\u032e"+
		"\u02fc\u0001\u0000\u0000\u0000\u032e\u02ff\u0001\u0000\u0000\u0000\u032e"+
		"\u030b\u0001\u0000\u0000\u0000\u032e\u030f\u0001\u0000\u0000\u0000\u032e"+
		"\u0313\u0001\u0000\u0000\u0000\u032e\u0318\u0001\u0000\u0000\u0000\u032e"+
		"\u031b\u0001\u0000\u0000\u0000\u032e\u0328\u0001\u0000\u0000\u0000\u032e"+
		"\u032b\u0001\u0000\u0000\u0000\u032f\u0007\u0001\u0000\u0000\u0000\u0330"+
		"\u0332\u0003\n\u0005\u0000\u0331\u0330\u0001\u0000\u0000\u0000\u0331\u0332"+
		"\u0001\u0000\u0000\u0000\u0332\u0333\u0001\u0000\u0000\u0000\u0333\u0334"+
		"\u0003.\u0017\u0000\u0334\t\u0001\u0000\u0000\u0000\u0335\u0337\u0005"+
		"\u00d3\u0000\u0000\u0336\u0338\u0005\u0095\u0000\u0000\u0337\u0336\u0001"+
		"\u0000\u0000\u0000\u0337\u0338\u0001\u0000\u0000\u0000\u0338\u0339\u0001"+
		"\u0000\u0000\u0000\u0339\u033e\u0003F#\u0000\u033a\u033b\u0005\u0004\u0000"+
		"\u0000\u033b\u033d\u0003F#\u0000\u033c\u033a\u0001\u0000\u0000\u0000\u033d"+
		"\u0340\u0001\u0000\u0000\u0000\u033e\u033c\u0001\u0000\u0000\u0000\u033e"+
		"\u033f\u0001\u0000\u0000\u0000\u033f\u000b\u0001\u0000\u0000\u0000\u0340"+
		"\u033e\u0001\u0000\u0000\u0000\u0341\u0344\u0003\u000e\u0007\u0000\u0342"+
		"\u0344\u0003\u0010\b\u0000\u0343\u0341\u0001\u0000\u0000\u0000\u0343\u0342"+
		"\u0001\u0000\u0000\u0000\u0344\r\u0001\u0000\u0000\u0000\u0345\u0346\u0003"+
		"\u009cN\u0000\u0346\u0349\u0003z=\u0000\u0347\u0348\u0005~\u0000\u0000"+
		"\u0348\u034a\u0005\u007f\u0000\u0000\u0349\u0347\u0001\u0000\u0000\u0000"+
		"\u0349\u034a\u0001\u0000\u0000\u0000\u034a\u034d\u0001\u0000\u0000\u0000"+
		"\u034b\u034c\u0005 \u0000\u0000\u034c\u034e\u0003f3\u0000\u034d\u034b"+
		"\u0001\u0000\u0000\u0000\u034d\u034e\u0001\u0000\u0000\u0000\u034e\u0351"+
		"\u0001\u0000\u0000\u0000\u034f\u0350\u0005\u00d3\u0000\u0000\u0350\u0352"+
		"\u0003\u0012\t\u0000\u0351\u034f\u0001\u0000\u0000\u0000\u0351\u0352\u0001"+
		"\u0000\u0000\u0000\u0352\u000f\u0001\u0000\u0000\u0000\u0353\u0354\u0005"+
		"l\u0000\u0000\u0354\u0357\u0003\u0094J\u0000\u0355\u0356\u0007\u0003\u0000"+
		"\u0000\u0356\u0358\u0005\u0092\u0000\u0000\u0357\u0355\u0001\u0000\u0000"+
		"\u0000\u0357\u0358\u0001\u0000\u0000\u0000\u0358\u0011\u0001\u0000\u0000"+
		"\u0000\u0359\u035a\u0005\u0002\u0000\u0000\u035a\u035f\u0003\u0014\n\u0000"+
		"\u035b\u035c\u0005\u0004\u0000\u0000\u035c\u035e\u0003\u0014\n\u0000\u035d"+
		"\u035b\u0001\u0000\u0000\u0000\u035e\u0361\u0001\u0000\u0000\u0000\u035f"+
		"\u035d\u0001\u0000\u0000\u0000\u035f\u0360\u0001\u0000\u0000\u0000\u0360"+
		"\u0362\u0001\u0000\u0000\u0000\u0361\u035f\u0001\u0000\u0000\u0000\u0362"+
		"\u0363\u0005\u0003\u0000\u0000\u0363\u0013\u0001\u0000\u0000\u0000\u0364"+
		"\u0365\u0003\u009cN\u0000\u0365\u0366\u0005\u00d8\u0000\u0000\u0366\u0367"+
		"\u0003\\.\u0000\u0367\u0015\u0001\u0000\u0000\u0000\u0368\u0369\u0003"+
		"\u009cN\u0000\u0369\u036a\u0003z=\u0000\u036a\u0017\u0001\u0000\u0000"+
		"\u0000\u036b\u036d\u0003\u001a\r\u0000\u036c\u036b\u0001\u0000\u0000\u0000"+
		"\u036d\u0370\u0001\u0000\u0000\u0000\u036e\u036c\u0001\u0000\u0000\u0000"+
		"\u036e\u036f\u0001\u0000\u0000\u0000\u036f\u0019\u0001\u0000\u0000\u0000"+
		"\u0370\u036e\u0001\u0000\u0000\u0000\u0371\u0372\u0005g\u0000\u0000\u0372"+
		"\u0376\u0003&\u0013\u0000\u0373\u0376\u0003(\u0014\u0000\u0374\u0376\u0003"+
		"*\u0015\u0000\u0375\u0371\u0001\u0000\u0000\u0000\u0375\u0373\u0001\u0000"+
		"\u0000\u0000\u0375\u0374\u0001\u0000\u0000\u0000\u0376\u001b\u0001\u0000"+
		"\u0000\u0000\u0377\u0379\u0003\u001e\u000f\u0000\u0378\u0377\u0001\u0000"+
		"\u0000\u0000\u0379\u037c\u0001\u0000\u0000\u0000\u037a\u0378\u0001\u0000"+
		"\u0000\u0000\u037a\u037b\u0001\u0000\u0000\u0000\u037b\u001d\u0001\u0000"+
		"\u0000\u0000\u037c\u037a\u0001\u0000\u0000\u0000\u037d\u037e\u0003*\u0015"+
		"\u0000\u037e\u001f\u0001\u0000\u0000\u0000\u037f\u0382\u0003\"\u0011\u0000"+
		"\u0380\u0382\u0003$\u0012\u0000\u0381\u037f\u0001\u0000\u0000\u0000\u0381"+
		"\u0380\u0001\u0000\u0000\u0000\u0382!\u0001\u0000\u0000\u0000\u0383\u0384"+
		"\u0005\u009d\u0000\u0000\u0384\u0385\u0003\\.\u0000\u0385#\u0001\u0000"+
		"\u0000\u0000\u0386\u0389\u0005B\u0000\u0000\u0387\u0388\u0005u\u0000\u0000"+
		"\u0388\u038a\u0003,\u0016\u0000\u0389\u0387\u0001\u0000\u0000\u0000\u0389"+
		"\u038a\u0001\u0000\u0000\u0000\u038a%\u0001\u0000\u0000\u0000\u038b\u038e"+
		"\u0005\u00b2\u0000\u0000\u038c\u038e\u0003\u009cN\u0000\u038d\u038b\u0001"+
		"\u0000\u0000\u0000\u038d\u038c\u0001\u0000\u0000\u0000\u038e\'\u0001\u0000"+
		"\u0000\u0000\u038f\u0393\u00055\u0000\u0000\u0390\u0391\u0005~\u0000\u0000"+
		"\u0391\u0393\u00055\u0000\u0000\u0392\u038f\u0001\u0000\u0000\u0000\u0392"+
		"\u0390\u0001\u0000\u0000\u0000\u0393)\u0001\u0000\u0000\u0000\u0394\u0395"+
		"\u0005\u009e\u0000\u0000\u0395\u0396\u0005\u007f\u0000\u0000\u0396\u0397"+
		"\u0005\u0083\u0000\u0000\u0397\u0398\u0005\u007f\u0000\u0000\u0398\u039e"+
		"\u0005\\\u0000\u0000\u0399\u039a\u0005\u0019\u0000\u0000\u039a\u039b\u0005"+
		"\u0083\u0000\u0000\u039b\u039c\u0005\u007f\u0000\u0000\u039c\u039e\u0005"+
		"\\\u0000\u0000\u039d\u0394\u0001\u0000\u0000\u0000\u039d\u0399\u0001\u0000"+
		"\u0000\u0000\u039e+\u0001\u0000\u0000\u0000\u039f\u03a0\u0003\u009cN\u0000"+
		"\u03a0-\u0001\u0000\u0000\u0000\u03a1\u03ac\u00030\u0018\u0000\u03a2\u03a3"+
		"\u0005\u0087\u0000\u0000\u03a3\u03a4\u0005\u0017\u0000\u0000\u03a4\u03a9"+
		"\u00034\u001a\u0000\u03a5\u03a6\u0005\u0004\u0000\u0000\u03a6\u03a8\u0003"+
		"4\u001a\u0000\u03a7\u03a5\u0001\u0000\u0000\u0000\u03a8\u03ab\u0001\u0000"+
		"\u0000\u0000\u03a9\u03a7\u0001\u0000\u0000\u0000\u03a9\u03aa\u0001\u0000"+
		"\u0000\u0000\u03aa\u03ad\u0001\u0000\u0000\u0000\u03ab\u03a9\u0001\u0000"+
		"\u0000\u0000\u03ac\u03a2\u0001\u0000\u0000\u0000\u03ac\u03ad\u0001\u0000"+
		"\u0000\u0000\u03ad\u03b3\u0001\u0000\u0000\u0000\u03ae\u03af\u0005\u0082"+
		"\u0000\u0000\u03af\u03b1\u0005\u00e7\u0000\u0000\u03b0\u03b2\u0007\u0004"+
		"\u0000\u0000\u03b1\u03b0\u0001\u0000\u0000\u0000\u03b1\u03b2\u0001\u0000"+
		"\u0000\u0000\u03b2\u03b4\u0001\u0000\u0000\u0000\u03b3\u03ae\u0001\u0000"+
		"\u0000\u0000\u03b3\u03b4\u0001\u0000\u0000\u0000\u03b4\u03be\u0001\u0000"+
		"\u0000\u0000\u03b5\u03b6\u0005m\u0000\u0000\u03b6\u03bd\u0007\u0005\u0000"+
		"\u0000\u03b7\u03b8\u0005D\u0000\u0000\u03b8\u03b9\u0005F\u0000\u0000\u03b9"+
		"\u03ba\u0005\u00e7\u0000\u0000\u03ba\u03bb\u0005\u00a6\u0000\u0000\u03bb"+
		"\u03bd\u0005\u0084\u0000\u0000\u03bc\u03b5\u0001\u0000\u0000\u0000\u03bc"+
		"\u03b7\u0001\u0000\u0000\u0000\u03bc\u03bd\u0001\u0000\u0000\u0000\u03bd"+
		"\u03bf\u0001\u0000\u0000\u0000\u03be\u03bc\u0001\u0000\u0000\u0000\u03be"+
		"\u03bf\u0001\u0000\u0000\u0000\u03bf/\u0001\u0000\u0000\u0000\u03c0\u03c1"+
		"\u0006\u0018\uffff\uffff\u0000\u03c1\u03c2\u00032\u0019\u0000\u03c2\u03d1"+
		"\u0001\u0000\u0000\u0000\u03c3\u03c4\n\u0002\u0000\u0000\u03c4\u03c6\u0005"+
		"^\u0000\u0000\u03c5\u03c7\u0003H$\u0000\u03c6\u03c5\u0001\u0000\u0000"+
		"\u0000\u03c6\u03c7\u0001\u0000\u0000\u0000\u03c7\u03c8\u0001\u0000\u0000"+
		"\u0000\u03c8\u03d0\u00030\u0018\u0003\u03c9\u03ca\n\u0001\u0000\u0000"+
		"\u03ca\u03cc\u0007\u0006\u0000\u0000\u03cb\u03cd\u0003H$\u0000\u03cc\u03cb"+
		"\u0001\u0000\u0000\u0000\u03cc\u03cd\u0001\u0000\u0000\u0000\u03cd\u03ce"+
		"\u0001\u0000\u0000\u0000\u03ce\u03d0\u00030\u0018\u0002\u03cf\u03c3\u0001"+
		"\u0000\u0000\u0000\u03cf\u03c9\u0001\u0000\u0000\u0000\u03d0\u03d3\u0001"+
		"\u0000\u0000\u0000\u03d1\u03cf\u0001\u0000\u0000\u0000\u03d1\u03d2\u0001"+
		"\u0000\u0000\u0000\u03d21\u0001\u0000\u0000\u0000\u03d3\u03d1\u0001\u0000"+
		"\u0000\u0000\u03d4\u03e5\u00036\u001b\u0000\u03d5\u03d6\u0005\u00b7\u0000"+
		"\u0000\u03d6\u03e5\u0003\u0094J\u0000\u03d7\u03d8\u0005\u00ce\u0000\u0000"+
		"\u03d8\u03dd\u0003\\.\u0000\u03d9\u03da\u0005\u0004\u0000\u0000\u03da"+
		"\u03dc\u0003\\.\u0000\u03db\u03d9\u0001\u0000\u0000\u0000\u03dc\u03df"+
		"\u0001\u0000\u0000\u0000\u03dd\u03db\u0001\u0000\u0000\u0000\u03dd\u03de"+
		"\u0001\u0000\u0000\u0000\u03de\u03e5\u0001\u0000\u0000\u0000\u03df\u03dd"+
		"\u0001\u0000\u0000\u0000\u03e0\u03e1\u0005\u0002\u0000\u0000\u03e1\u03e2"+
		"\u0003.\u0017\u0000\u03e2\u03e3\u0005\u0003\u0000\u0000\u03e3\u03e5\u0001"+
		"\u0000\u0000\u0000\u03e4\u03d4\u0001\u0000\u0000\u0000\u03e4\u03d5\u0001"+
		"\u0000\u0000\u0000\u03e4\u03d7\u0001\u0000\u0000\u0000\u03e4\u03e0\u0001"+
		"\u0000\u0000\u0000\u03e53\u0001\u0000\u0000\u0000\u03e6\u03e8\u0003\\"+
		".\u0000\u03e7\u03e9\u0007\u0007\u0000\u0000\u03e8\u03e7\u0001\u0000\u0000"+
		"\u0000\u03e8\u03e9\u0001\u0000\u0000\u0000\u03e9\u03ec\u0001\u0000\u0000"+
		"\u0000\u03ea\u03eb\u0005\u0081\u0000\u0000\u03eb\u03ed\u0007\b\u0000\u0000"+
		"\u03ec\u03ea\u0001\u0000\u0000\u0000\u03ec\u03ed\u0001\u0000\u0000\u0000"+
		"\u03ed5\u0001\u0000\u0000\u0000\u03ee\u03f0\u00038\u001c\u0000\u03ef\u03f1"+
		"\u0003:\u001d\u0000\u03f0\u03ef\u0001\u0000\u0000\u0000\u03f0\u03f1\u0001"+
		"\u0000\u0000\u0000\u03f1\u03f3\u0001\u0000\u0000\u0000\u03f2\u03f4\u0003"+
		"<\u001e\u0000\u03f3\u03f2\u0001\u0000\u0000\u0000\u03f3\u03f4\u0001\u0000"+
		"\u0000\u0000\u03f4\u03f6\u0001\u0000\u0000\u0000\u03f5\u03f7\u0003>\u001f"+
		"\u0000\u03f6\u03f5\u0001\u0000\u0000\u0000\u03f6\u03f7\u0001\u0000\u0000"+
		"\u0000\u03f7\u03f9\u0001\u0000\u0000\u0000\u03f8\u03fa\u0003@ \u0000\u03f9"+
		"\u03f8\u0001\u0000\u0000\u0000\u03f9\u03fa\u0001\u0000\u0000\u0000\u03fa"+
		"7\u0001\u0000\u0000\u0000\u03fb\u03fd\u0005\u00ab\u0000\u0000\u03fc\u03fe"+
		"\u0003H$\u0000\u03fd\u03fc\u0001\u0000\u0000\u0000\u03fd\u03fe\u0001\u0000"+
		"\u0000\u0000\u03fe\u03ff\u0001\u0000\u0000\u0000\u03ff\u0404\u0003J%\u0000"+
		"\u0400\u0401\u0005\u0004\u0000\u0000\u0401\u0403\u0003J%\u0000\u0402\u0400"+
		"\u0001\u0000\u0000\u0000\u0403\u0406\u0001\u0000\u0000\u0000\u0404\u0402"+
		"\u0001\u0000\u0000\u0000\u0404\u0405\u0001\u0000\u0000\u0000\u04059\u0001"+
		"\u0000\u0000\u0000\u0406\u0404\u0001\u0000\u0000\u0000\u0407\u0408\u0005"+
		"J\u0000\u0000\u0408\u040d\u0003L&\u0000\u0409\u040a\u0005\u0004\u0000"+
		"\u0000\u040a\u040c\u0003L&\u0000\u040b\u0409\u0001\u0000\u0000\u0000\u040c"+
		"\u040f\u0001\u0000\u0000\u0000\u040d\u040b\u0001\u0000\u0000\u0000\u040d"+
		"\u040e\u0001\u0000\u0000\u0000\u040e;\u0001\u0000\u0000\u0000\u040f\u040d"+
		"\u0001\u0000\u0000\u0000\u0410\u0411\u0005\u00d2\u0000\u0000\u0411\u0412"+
		"\u0003^/\u0000\u0412=\u0001\u0000\u0000\u0000\u0413\u0414\u0005R\u0000"+
		"\u0000\u0414\u0416\u0005\u0017\u0000\u0000\u0415\u0417\u0003H$\u0000\u0416"+
		"\u0415\u0001\u0000\u0000\u0000\u0416\u0417\u0001\u0000\u0000\u0000\u0417"+
		"\u0418\u0001\u0000\u0000\u0000\u0418\u041d\u0003B!\u0000\u0419\u041a\u0005"+
		"\u0004\u0000\u0000\u041a\u041c\u0003B!\u0000\u041b\u0419\u0001\u0000\u0000"+
		"\u0000\u041c\u041f\u0001\u0000\u0000\u0000\u041d\u041b\u0001\u0000\u0000"+
		"\u0000\u041d\u041e\u0001\u0000\u0000\u0000\u041e?\u0001\u0000\u0000\u0000"+
		"\u041f\u041d\u0001\u0000\u0000\u0000\u0420\u0421\u0005U\u0000\u0000\u0421"+
		"\u0422\u0003^/\u0000\u0422A\u0001\u0000\u0000\u0000\u0423\u044c\u0003"+
		"D\"\u0000\u0424\u0425\u0005\u00a4\u0000\u0000\u0425\u042e\u0005\u0002"+
		"\u0000\u0000\u0426\u042b\u0003\\.\u0000\u0427\u0428\u0005\u0004\u0000"+
		"\u0000\u0428\u042a\u0003\\.\u0000\u0429\u0427\u0001\u0000\u0000\u0000"+
		"\u042a\u042d\u0001\u0000\u0000\u0000\u042b\u0429\u0001\u0000\u0000\u0000"+
		"\u042b\u042c\u0001\u0000\u0000\u0000\u042c\u042f\u0001\u0000\u0000\u0000"+
		"\u042d\u042b\u0001\u0000\u0000\u0000\u042e\u0426\u0001\u0000\u0000\u0000"+
		"\u042e\u042f\u0001\u0000\u0000\u0000\u042f\u0430\u0001\u0000\u0000\u0000"+
		"\u0430\u044c\u0005\u0003\u0000\u0000\u0431\u0432\u0005&\u0000\u0000\u0432"+
		"\u043b\u0005\u0002\u0000\u0000\u0433\u0438\u0003\\.\u0000\u0434\u0435"+
		"\u0005\u0004\u0000\u0000\u0435\u0437\u0003\\.\u0000\u0436\u0434\u0001"+
		"\u0000\u0000\u0000\u0437\u043a\u0001\u0000\u0000\u0000\u0438\u0436\u0001"+
		"\u0000\u0000\u0000\u0438\u0439\u0001\u0000\u0000\u0000\u0439\u043c\u0001"+
		"\u0000\u0000\u0000\u043a\u0438\u0001\u0000\u0000\u0000\u043b\u0433\u0001"+
		"\u0000\u0000\u0000\u043b\u043c\u0001\u0000\u0000\u0000\u043c\u043d\u0001"+
		"\u0000\u0000\u0000\u043d\u044c\u0005\u0003\u0000\u0000\u043e\u043f\u0005"+
		"S\u0000\u0000\u043f\u0440\u0005\u00af\u0000\u0000\u0440\u0441\u0005\u0002"+
		"\u0000\u0000\u0441\u0446\u0003D\"\u0000\u0442\u0443\u0005\u0004\u0000"+
		"\u0000\u0443\u0445\u0003D\"\u0000\u0444\u0442\u0001\u0000\u0000\u0000"+
		"\u0445\u0448\u0001\u0000\u0000\u0000\u0446\u0444\u0001\u0000\u0000\u0000"+
		"\u0446\u0447\u0001\u0000\u0000\u0000\u0447\u0449\u0001\u0000\u0000\u0000"+
		"\u0448\u0446\u0001\u0000\u0000\u0000\u0449\u044a\u0005\u0003\u0000\u0000"+
		"\u044a\u044c\u0001\u0000\u0000\u0000\u044b\u0423\u0001\u0000\u0000\u0000"+
		"\u044b\u0424\u0001\u0000\u0000\u0000\u044b\u0431\u0001\u0000\u0000\u0000"+
		"\u044b\u043e\u0001\u0000\u0000\u0000\u044cC\u0001\u0000\u0000\u0000\u044d"+
		"\u0456\u0005\u0002\u0000\u0000\u044e\u0453\u0003\\.\u0000\u044f\u0450"+
		"\u0005\u0004\u0000\u0000\u0450\u0452\u0003\\.\u0000\u0451\u044f\u0001"+
		"\u0000\u0000\u0000\u0452\u0455\u0001\u0000\u0000\u0000\u0453\u0451\u0001"+
		"\u0000\u0000\u0000\u0453\u0454\u0001\u0000\u0000\u0000\u0454\u0457\u0001"+
		"\u0000\u0000\u0000\u0455\u0453\u0001\u0000\u0000\u0000\u0456\u044e\u0001"+
		"\u0000\u0000\u0000\u0456\u0457\u0001\u0000\u0000\u0000\u0457\u0458\u0001"+
		"\u0000\u0000\u0000\u0458\u045b\u0005\u0003\u0000\u0000\u0459\u045b\u0003"+
		"\\.\u0000\u045a\u044d\u0001\u0000\u0000\u0000\u045a\u0459\u0001\u0000"+
		"\u0000\u0000\u045bE\u0001\u0000\u0000\u0000\u045c\u045e\u0003\u009cN\u0000"+
		"\u045d\u045f\u0003X,\u0000\u045e\u045d\u0001\u0000\u0000\u0000\u045e\u045f"+
		"\u0001\u0000\u0000\u0000\u045f\u0460\u0001\u0000\u0000\u0000\u0460\u0461"+
		"\u0005\u0012\u0000\u0000\u0461\u0462\u0005\u0002\u0000\u0000\u0462\u0463"+
		"\u0003\b\u0004\u0000\u0463\u0464\u0005\u0003\u0000\u0000\u0464G\u0001"+
		"\u0000\u0000\u0000\u0465\u0466\u0007\t\u0000\u0000\u0466I\u0001\u0000"+
		"\u0000\u0000\u0467\u046c\u0003\\.\u0000\u0468\u046a\u0005\u0012\u0000"+
		"\u0000\u0469\u0468\u0001\u0000\u0000\u0000\u0469\u046a\u0001\u0000\u0000"+
		"\u0000\u046a\u046b\u0001\u0000\u0000\u0000\u046b\u046d\u0003\u009cN\u0000"+
		"\u046c\u0469\u0001\u0000\u0000\u0000\u046c\u046d\u0001\u0000\u0000\u0000"+
		"\u046d\u0474\u0001\u0000\u0000\u0000\u046e\u046f\u0003\u0094J\u0000\u046f"+
		"\u0470\u0005\u0001\u0000\u0000\u0470\u0471\u0005\u00e0\u0000\u0000\u0471"+
		"\u0474\u0001\u0000\u0000\u0000\u0472\u0474\u0005\u00e0\u0000\u0000\u0473"+
		"\u0467\u0001\u0000\u0000\u0000\u0473\u046e\u0001\u0000\u0000\u0000\u0473"+
		"\u0472\u0001\u0000\u0000\u0000\u0474K\u0001\u0000\u0000\u0000\u0475\u0476"+
		"\u0006&\uffff\uffff\u0000\u0476\u0477\u0003R)\u0000\u0477\u048a\u0001"+
		"\u0000\u0000\u0000\u0478\u0486\n\u0002\u0000\u0000\u0479\u047a\u0005%"+
		"\u0000\u0000\u047a\u047b\u0005f\u0000\u0000\u047b\u0487\u0003R)\u0000"+
		"\u047c\u047d\u0003N\'\u0000\u047d\u047e\u0005f\u0000\u0000\u047e\u047f"+
		"\u0003L&\u0000\u047f\u0480\u0003P(\u0000\u0480\u0487\u0001\u0000\u0000"+
		"\u0000\u0481\u0482\u0005v\u0000\u0000\u0482\u0483\u0003N\'\u0000\u0483"+
		"\u0484\u0005f\u0000\u0000\u0484\u0485\u0003R)\u0000\u0485\u0487\u0001"+
		"\u0000\u0000\u0000\u0486\u0479\u0001\u0000\u0000\u0000\u0486\u047c\u0001"+
		"\u0000\u0000\u0000\u0486\u0481\u0001\u0000\u0000\u0000\u0487\u0489\u0001"+
		"\u0000\u0000\u0000\u0488\u0478\u0001\u0000\u0000\u0000\u0489\u048c\u0001"+
		"\u0000\u0000\u0000\u048a\u0488\u0001\u0000\u0000\u0000\u048a\u048b\u0001"+
		"\u0000\u0000\u0000\u048bM\u0001\u0000\u0000\u0000\u048c\u048a\u0001\u0000"+
		"\u0000\u0000\u048d\u048f\u0005[\u0000\u0000\u048e\u048d\u0001\u0000\u0000"+
		"\u0000\u048e\u048f\u0001\u0000\u0000\u0000\u048f\u049d\u0001\u0000\u0000"+
		"\u0000\u0490\u0492\u0005j\u0000\u0000\u0491\u0493\u0005\u0089\u0000\u0000"+
		"\u0492\u0491\u0001\u0000\u0000\u0000\u0492\u0493\u0001\u0000\u0000\u0000"+
		"\u0493\u049d\u0001\u0000\u0000\u0000\u0494\u0496\u0005\u00a0\u0000\u0000"+
		"\u0495\u0497\u0005\u0089\u0000\u0000\u0496\u0495\u0001\u0000\u0000\u0000"+
		"\u0496\u0497\u0001\u0000\u0000\u0000\u0497\u049d\u0001\u0000\u0000\u0000"+
		"\u0498\u049a\u0005K\u0000\u0000\u0499\u049b\u0005\u0089\u0000\u0000\u049a"+
		"\u0499\u0001\u0000\u0000\u0000\u049a\u049b\u0001\u0000\u0000\u0000\u049b"+
		"\u049d\u0001\u0000\u0000\u0000\u049c\u048e\u0001\u0000\u0000\u0000\u049c"+
		"\u0490\u0001\u0000\u0000\u0000\u049c\u0494\u0001\u0000\u0000\u0000\u049c"+
		"\u0498\u0001\u0000\u0000\u0000\u049dO\u0001\u0000\u0000\u0000\u049e\u049f"+
		"\u0005\u0083\u0000\u0000\u049f\u04ad\u0003^/\u0000\u04a0\u04a1\u0005\u00cc"+
		"\u0000\u0000\u04a1\u04a2\u0005\u0002\u0000\u0000\u04a2\u04a7\u0003\u009c"+
		"N\u0000\u04a3\u04a4\u0005\u0004\u0000\u0000\u04a4\u04a6\u0003\u009cN\u0000"+
		"\u04a5\u04a3\u0001\u0000\u0000\u0000\u04a6\u04a9\u0001\u0000\u0000\u0000"+
		"\u04a7\u04a5\u0001\u0000\u0000\u0000\u04a7\u04a8\u0001\u0000\u0000\u0000"+
		"\u04a8\u04aa\u0001\u0000\u0000\u0000\u04a9\u04a7\u0001\u0000\u0000\u0000"+
		"\u04aa\u04ab\u0005\u0003\u0000\u0000\u04ab\u04ad\u0001\u0000\u0000\u0000"+
		"\u04ac\u049e\u0001\u0000\u0000\u0000\u04ac\u04a0\u0001\u0000\u0000\u0000"+
		"\u04adQ\u0001\u0000\u0000\u0000\u04ae\u04b5\u0003V+\u0000\u04af\u04b0"+
		"\u0005\u00b9\u0000\u0000\u04b0\u04b1\u0003T*\u0000\u04b1\u04b2\u0005\u0002"+
		"\u0000\u0000\u04b2\u04b3\u0003\\.\u0000\u04b3\u04b4\u0005\u0003\u0000"+
		"\u0000\u04b4\u04b6\u0001\u0000\u0000\u0000\u04b5\u04af\u0001\u0000\u0000"+
		"\u0000\u04b5\u04b6\u0001\u0000\u0000\u0000\u04b6S\u0001\u0000\u0000\u0000"+
		"\u04b7\u04b8\u0007\n\u0000\u0000\u04b8U\u0001\u0000\u0000\u0000\u04b9"+
		"\u04c1\u0003Z-\u0000\u04ba\u04bc\u0005\u0012\u0000\u0000\u04bb\u04ba\u0001"+
		"\u0000\u0000\u0000\u04bb\u04bc\u0001\u0000\u0000\u0000\u04bc\u04bd\u0001"+
		"\u0000\u0000\u0000\u04bd\u04bf\u0003\u009cN\u0000\u04be\u04c0\u0003X,"+
		"\u0000\u04bf\u04be\u0001\u0000\u0000\u0000\u04bf\u04c0\u0001\u0000\u0000"+
		"\u0000\u04c0\u04c2\u0001\u0000\u0000\u0000\u04c1\u04bb\u0001\u0000\u0000"+
		"\u0000\u04c1\u04c2\u0001\u0000\u0000\u0000\u04c2W\u0001\u0000\u0000\u0000"+
		"\u04c3\u04c4\u0005\u0002\u0000\u0000\u04c4\u04c9\u0003\u009cN\u0000\u04c5"+
		"\u04c6\u0005\u0004\u0000\u0000\u04c6\u04c8\u0003\u009cN\u0000\u04c7\u04c5"+
		"\u0001\u0000\u0000\u0000\u04c8\u04cb\u0001\u0000\u0000\u0000\u04c9\u04c7"+
		"\u0001\u0000\u0000\u0000\u04c9\u04ca\u0001\u0000\u0000\u0000\u04ca\u04cc"+
		"\u0001\u0000\u0000\u0000\u04cb\u04c9\u0001\u0000\u0000\u0000\u04cc\u04cd"+
		"\u0005\u0003\u0000\u0000\u04cdY\u0001\u0000\u0000\u0000\u04ce\u04ec\u0003"+
		"\u0094J\u0000\u04cf\u04d0\u0005\u0002\u0000\u0000\u04d0\u04d1\u0003\b"+
		"\u0004\u0000\u04d1\u04d2\u0005\u0003\u0000\u0000\u04d2\u04ec\u0001\u0000"+
		"\u0000\u0000\u04d3\u04d4\u0005\u00c9\u0000\u0000\u04d4\u04d5\u0005\u0002"+
		"\u0000\u0000\u04d5\u04da\u0003\\.\u0000\u04d6\u04d7\u0005\u0004\u0000"+
		"\u0000\u04d7\u04d9\u0003\\.\u0000\u04d8\u04d6\u0001\u0000\u0000\u0000"+
		"\u04d9\u04dc\u0001\u0000\u0000\u0000\u04da\u04d8\u0001\u0000\u0000\u0000"+
		"\u04da\u04db\u0001\u0000\u0000\u0000\u04db\u04dd\u0001\u0000\u0000\u0000"+
		"\u04dc\u04da\u0001\u0000\u0000\u0000\u04dd\u04e0\u0005\u0003\u0000\u0000"+
		"\u04de\u04df\u0005\u00d3\u0000\u0000\u04df\u04e1\u0005\u0088\u0000\u0000"+
		"\u04e0\u04de\u0001\u0000\u0000\u0000\u04e0\u04e1\u0001\u0000\u0000\u0000"+
		"\u04e1\u04ec\u0001\u0000\u0000\u0000\u04e2\u04e3\u0005i\u0000\u0000\u04e3"+
		"\u04e4\u0005\u0002\u0000\u0000\u04e4\u04e5\u0003\b\u0004\u0000\u04e5\u04e6"+
		"\u0005\u0003\u0000\u0000\u04e6\u04ec\u0001\u0000\u0000\u0000\u04e7\u04e8"+
		"\u0005\u0002\u0000\u0000\u04e8\u04e9\u0003L&\u0000\u04e9\u04ea\u0005\u0003"+
		"\u0000\u0000\u04ea\u04ec\u0001\u0000\u0000\u0000\u04eb\u04ce\u0001\u0000"+
		"\u0000\u0000\u04eb\u04cf\u0001\u0000\u0000\u0000\u04eb\u04d3\u0001\u0000"+
		"\u0000\u0000\u04eb\u04e2\u0001\u0000\u0000\u0000\u04eb\u04e7\u0001\u0000"+
		"\u0000\u0000\u04ec[\u0001\u0000\u0000\u0000\u04ed\u04ee\u0003^/\u0000"+
		"\u04ee]\u0001\u0000\u0000\u0000\u04ef\u04f0\u0006/\uffff\uffff\u0000\u04f0"+
		"\u04f2\u0003b1\u0000\u04f1\u04f3\u0003`0\u0000\u04f2\u04f1\u0001\u0000"+
		"\u0000\u0000\u04f2\u04f3\u0001\u0000\u0000\u0000\u04f3\u04f7\u0001\u0000"+
		"\u0000\u0000\u04f4\u04f5\u0005~\u0000\u0000\u04f5\u04f7\u0003^/\u0003"+
		"\u04f6\u04ef\u0001\u0000\u0000\u0000\u04f6\u04f4\u0001\u0000\u0000\u0000"+
		"\u04f7\u0500\u0001\u0000\u0000\u0000\u04f8\u04f9\n\u0002\u0000\u0000\u04f9"+
		"\u04fa\u0005\u000f\u0000\u0000\u04fa\u04ff\u0003^/\u0003\u04fb\u04fc\n"+
		"\u0001\u0000\u0000\u04fc\u04fd\u0005\u0086\u0000\u0000\u04fd\u04ff\u0003"+
		"^/\u0002\u04fe\u04f8\u0001\u0000\u0000\u0000\u04fe\u04fb\u0001\u0000\u0000"+
		"\u0000\u04ff\u0502\u0001\u0000\u0000\u0000\u0500\u04fe\u0001\u0000\u0000"+
		"\u0000\u0500\u0501\u0001\u0000\u0000\u0000\u0501_\u0001\u0000\u0000\u0000"+
		"\u0502\u0500\u0001\u0000\u0000\u0000\u0503\u0504\u0003l6\u0000\u0504\u0505"+
		"\u0003b1\u0000\u0505\u0541\u0001\u0000\u0000\u0000\u0506\u0507\u0003l"+
		"6\u0000\u0507\u0508\u0003n7\u0000\u0508\u0509\u0005\u0002\u0000\u0000"+
		"\u0509\u050a\u0003\b\u0004\u0000\u050a\u050b\u0005\u0003\u0000\u0000\u050b"+
		"\u0541\u0001\u0000\u0000\u0000\u050c\u050e\u0005~\u0000\u0000\u050d\u050c"+
		"\u0001\u0000\u0000\u0000\u050d\u050e\u0001\u0000\u0000\u0000\u050e\u050f"+
		"\u0001\u0000\u0000\u0000\u050f\u0510\u0005\u0016\u0000\u0000\u0510\u0511"+
		"\u0003b1\u0000\u0511\u0512\u0005\u000f\u0000\u0000\u0512\u0513\u0003b"+
		"1\u0000\u0513\u0541\u0001\u0000\u0000\u0000\u0514\u0516\u0005~\u0000\u0000"+
		"\u0515\u0514\u0001\u0000\u0000\u0000\u0515\u0516\u0001\u0000\u0000\u0000"+
		"\u0516\u0517\u0001\u0000\u0000\u0000\u0517\u0518\u0005Y\u0000\u0000\u0518"+
		"\u0519\u0005\u0002\u0000\u0000\u0519\u051e\u0003\\.\u0000\u051a\u051b"+
		"\u0005\u0004\u0000\u0000\u051b\u051d\u0003\\.\u0000\u051c\u051a\u0001"+
		"\u0000\u0000\u0000\u051d\u0520\u0001\u0000\u0000\u0000\u051e\u051c\u0001"+
		"\u0000\u0000\u0000\u051e\u051f\u0001\u0000\u0000\u0000\u051f\u0521\u0001"+
		"\u0000\u0000\u0000\u0520\u051e\u0001\u0000\u0000\u0000\u0521\u0522\u0005"+
		"\u0003\u0000\u0000\u0522\u0541\u0001\u0000\u0000\u0000\u0523\u0525\u0005"+
		"~\u0000\u0000\u0524\u0523\u0001\u0000\u0000\u0000\u0524\u0525\u0001\u0000"+
		"\u0000\u0000\u0525\u0526\u0001\u0000\u0000\u0000\u0526\u0527\u0005Y\u0000"+
		"\u0000\u0527\u0528\u0005\u0002\u0000\u0000\u0528\u0529\u0003\b\u0004\u0000"+
		"\u0529\u052a\u0005\u0003\u0000\u0000\u052a\u0541\u0001\u0000\u0000\u0000"+
		"\u052b\u052d\u0005~\u0000\u0000\u052c\u052b\u0001\u0000\u0000\u0000\u052c"+
		"\u052d\u0001\u0000\u0000\u0000\u052d\u052e\u0001\u0000\u0000\u0000\u052e"+
		"\u052f\u0005l\u0000\u0000\u052f\u0532\u0003b1\u0000\u0530\u0531\u0005"+
		";\u0000\u0000\u0531\u0533\u0003b1\u0000\u0532\u0530\u0001\u0000\u0000"+
		"\u0000\u0532\u0533\u0001\u0000\u0000\u0000\u0533\u0541\u0001\u0000\u0000"+
		"\u0000\u0534\u0536\u0005c\u0000\u0000\u0535\u0537\u0005~\u0000\u0000\u0536"+
		"\u0535\u0001\u0000\u0000\u0000\u0536\u0537\u0001\u0000\u0000\u0000\u0537"+
		"\u0538\u0001\u0000\u0000\u0000\u0538\u0541\u0005\u007f\u0000\u0000\u0539"+
		"\u053b\u0005c\u0000\u0000\u053a\u053c\u0005~\u0000\u0000\u053b\u053a\u0001"+
		"\u0000\u0000\u0000\u053b\u053c\u0001\u0000\u0000\u0000\u053c\u053d\u0001"+
		"\u0000\u0000\u0000\u053d\u053e\u00056\u0000\u0000\u053e\u053f\u0005J\u0000"+
		"\u0000\u053f\u0541\u0003b1\u0000\u0540\u0503\u0001\u0000\u0000\u0000\u0540"+
		"\u0506\u0001\u0000\u0000\u0000\u0540\u050d\u0001\u0000\u0000\u0000\u0540"+
		"\u0515\u0001\u0000\u0000\u0000\u0540\u0524\u0001\u0000\u0000\u0000\u0540"+
		"\u052c\u0001\u0000\u0000\u0000\u0540\u0534\u0001\u0000\u0000\u0000\u0540"+
		"\u0539\u0001\u0000\u0000\u0000\u0541a\u0001\u0000\u0000\u0000\u0542\u0543"+
		"\u00061\uffff\uffff\u0000\u0543\u0547\u0003d2\u0000\u0544\u0545\u0007"+
		"\u000b\u0000\u0000\u0545\u0547\u0003b1\u0004\u0546\u0542\u0001\u0000\u0000"+
		"\u0000\u0546\u0544\u0001\u0000\u0000\u0000\u0547\u0556\u0001\u0000\u0000"+
		"\u0000\u0548\u0549\n\u0003\u0000\u0000\u0549\u054a\u0007\f\u0000\u0000"+
		"\u054a\u0555\u0003b1\u0004\u054b\u054c\n\u0002\u0000\u0000\u054c\u054d"+
		"\u0007\u000b\u0000\u0000\u054d\u0555\u0003b1\u0003\u054e\u054f\n\u0001"+
		"\u0000\u0000\u054f\u0550\u0005\u00e3\u0000\u0000\u0550\u0555\u0003b1\u0002"+
		"\u0551\u0552\n\u0005\u0000\u0000\u0552\u0553\u0005\u0014\u0000\u0000\u0553"+
		"\u0555\u0003j5\u0000\u0554\u0548\u0001\u0000\u0000\u0000\u0554\u054b\u0001"+
		"\u0000\u0000\u0000\u0554\u054e\u0001\u0000\u0000\u0000\u0554\u0551\u0001"+
		"\u0000\u0000\u0000\u0555\u0558\u0001\u0000\u0000\u0000\u0556\u0554\u0001"+
		"\u0000\u0000\u0000\u0556\u0557\u0001\u0000\u0000\u0000\u0557c\u0001\u0000"+
		"\u0000\u0000\u0558\u0556\u0001\u0000\u0000\u0000\u0559\u055a\u00062\uffff"+
		"\uffff\u0000\u055a\u0649\u0005\u007f\u0000\u0000\u055b\u0649\u0003r9\u0000"+
		"\u055c\u055d\u0003\u009cN\u0000\u055d\u055e\u0003f3\u0000\u055e\u0649"+
		"\u0001\u0000\u0000\u0000\u055f\u0560\u0005\u00f0\u0000\u0000\u0560\u0649"+
		"\u0003f3\u0000\u0561\u0649\u0003\u009eO\u0000\u0562\u0649\u0003p8\u0000"+
		"\u0563\u0649\u0003f3\u0000\u0564\u0649\u0005\u00e6\u0000\u0000\u0565\u0649"+
		"\u0005\u0005\u0000\u0000\u0566\u0567\u0005\u008e\u0000\u0000\u0567\u0568"+
		"\u0005\u0002\u0000\u0000\u0568\u0569\u0003b1\u0000\u0569\u056a\u0005Y"+
		"\u0000\u0000\u056a\u056b\u0003b1\u0000\u056b\u056c\u0005\u0003\u0000\u0000"+
		"\u056c\u0649\u0001\u0000\u0000\u0000\u056d\u056e\u0005\u0002\u0000\u0000"+
		"\u056e\u0571\u0003\\.\u0000\u056f\u0570\u0005\u0004\u0000\u0000\u0570"+
		"\u0572\u0003\\.\u0000\u0571\u056f\u0001\u0000\u0000\u0000\u0572\u0573"+
		"\u0001\u0000\u0000\u0000\u0573\u0571\u0001\u0000\u0000\u0000\u0573\u0574"+
		"\u0001\u0000\u0000\u0000\u0574\u0575\u0001\u0000\u0000\u0000\u0575\u0576"+
		"\u0005\u0003\u0000\u0000\u0576\u0649\u0001\u0000\u0000\u0000\u0577\u0578"+
		"\u0005\u00a5\u0000\u0000\u0578\u0579\u0005\u0002\u0000\u0000\u0579\u057e"+
		"\u0003\\.\u0000\u057a\u057b\u0005\u0004\u0000\u0000\u057b\u057d\u0003"+
		"\\.\u0000\u057c\u057a\u0001\u0000\u0000\u0000\u057d\u0580\u0001\u0000"+
		"\u0000\u0000\u057e\u057c\u0001\u0000\u0000\u0000\u057e\u057f\u0001\u0000"+
		"\u0000\u0000\u057f\u0581\u0001\u0000\u0000\u0000\u0580\u057e\u0001\u0000"+
		"\u0000\u0000\u0581\u0582\u0005\u0003\u0000\u0000\u0582\u0649\u0001\u0000"+
		"\u0000\u0000\u0583\u0584\u0003\u0094J\u0000\u0584\u0585\u0005\u0002\u0000"+
		"\u0000\u0585\u0586\u0005\u00e0\u0000\u0000\u0586\u0588\u0005\u0003\u0000"+
		"\u0000\u0587\u0589\u0003\u0082A\u0000\u0588\u0587\u0001\u0000\u0000\u0000"+
		"\u0588\u0589\u0001\u0000\u0000\u0000\u0589\u058b\u0001\u0000\u0000\u0000"+
		"\u058a\u058c\u0003\u0084B\u0000\u058b\u058a\u0001\u0000\u0000\u0000\u058b"+
		"\u058c\u0001\u0000\u0000\u0000\u058c\u0649\u0001\u0000\u0000\u0000\u058d"+
		"\u058e\u0003\u0094J\u0000\u058e\u059a\u0005\u0002\u0000\u0000\u058f\u0591"+
		"\u0003H$\u0000\u0590\u058f\u0001\u0000\u0000\u0000\u0590\u0591\u0001\u0000"+
		"\u0000\u0000\u0591\u0592\u0001\u0000\u0000\u0000\u0592\u0597\u0003\\."+
		"\u0000\u0593\u0594\u0005\u0004\u0000\u0000\u0594\u0596\u0003\\.\u0000"+
		"\u0595\u0593\u0001\u0000\u0000\u0000\u0596\u0599\u0001\u0000\u0000\u0000"+
		"\u0597\u0595\u0001\u0000\u0000\u0000\u0597\u0598\u0001\u0000\u0000\u0000"+
		"\u0598\u059b\u0001\u0000\u0000\u0000\u0599\u0597\u0001\u0000\u0000\u0000"+
		"\u059a\u0590\u0001\u0000\u0000\u0000\u059a\u059b\u0001\u0000\u0000\u0000"+
		"\u059b\u05a6\u0001\u0000\u0000\u0000\u059c\u059d\u0005\u0087\u0000\u0000"+
		"\u059d\u059e\u0005\u0017\u0000\u0000\u059e\u05a3\u00034\u001a\u0000\u059f"+
		"\u05a0\u0005\u0004\u0000\u0000\u05a0\u05a2\u00034\u001a\u0000\u05a1\u059f"+
		"\u0001\u0000\u0000\u0000\u05a2\u05a5\u0001\u0000\u0000\u0000\u05a3\u05a1"+
		"\u0001\u0000\u0000\u0000\u05a3\u05a4\u0001\u0000\u0000\u0000\u05a4\u05a7"+
		"\u0001\u0000\u0000\u0000\u05a5\u05a3\u0001\u0000\u0000\u0000\u05a6\u059c"+
		"\u0001\u0000\u0000\u0000\u05a6\u05a7\u0001\u0000\u0000\u0000\u05a7\u05a8"+
		"\u0001\u0000\u0000\u0000\u05a8\u05aa\u0005\u0003\u0000\u0000\u05a9\u05ab"+
		"\u0003\u0082A\u0000\u05aa\u05a9\u0001\u0000\u0000\u0000\u05aa\u05ab\u0001"+
		"\u0000\u0000\u0000\u05ab\u05b0\u0001\u0000\u0000\u0000\u05ac\u05ae\u0003"+
		"h4\u0000\u05ad\u05ac\u0001\u0000\u0000\u0000\u05ad\u05ae\u0001\u0000\u0000"+
		"\u0000\u05ae\u05af\u0001\u0000\u0000\u0000\u05af\u05b1\u0003\u0084B\u0000"+
		"\u05b0\u05ad\u0001\u0000\u0000\u0000\u05b0\u05b1\u0001\u0000\u0000\u0000"+
		"\u05b1\u0649\u0001\u0000\u0000\u0000\u05b2\u05b3\u0003\u009cN\u0000\u05b3"+
		"\u05b4\u0005\u0006\u0000\u0000\u05b4\u05b5\u0003\\.\u0000\u05b5\u0649"+
		"\u0001\u0000\u0000\u0000\u05b6\u05bf\u0005\u0002\u0000\u0000\u05b7\u05bc"+
		"\u0003\u009cN\u0000\u05b8\u05b9\u0005\u0004\u0000\u0000\u05b9\u05bb\u0003"+
		"\u009cN\u0000\u05ba\u05b8\u0001\u0000\u0000\u0000\u05bb\u05be\u0001\u0000"+
		"\u0000\u0000\u05bc\u05ba\u0001\u0000\u0000\u0000\u05bc\u05bd\u0001\u0000"+
		"\u0000\u0000\u05bd\u05c0\u0001\u0000\u0000\u0000\u05be\u05bc\u0001\u0000"+
		"\u0000\u0000\u05bf\u05b7\u0001\u0000\u0000\u0000\u05bf\u05c0\u0001\u0000"+
		"\u0000\u0000\u05c0\u05c1\u0001\u0000\u0000\u0000\u05c1\u05c2\u0005\u0003"+
		"\u0000\u0000\u05c2\u05c3\u0005\u0006\u0000\u0000\u05c3\u0649\u0003\\."+
		"\u0000\u05c4\u05c5\u0005\u0002\u0000\u0000\u05c5\u05c6\u0003\b\u0004\u0000"+
		"\u05c6\u05c7\u0005\u0003\u0000\u0000\u05c7\u0649\u0001\u0000\u0000\u0000"+
		"\u05c8\u05c9\u0005?\u0000\u0000\u05c9\u05ca\u0005\u0002\u0000\u0000\u05ca"+
		"\u05cb\u0003\b\u0004\u0000\u05cb\u05cc\u0005\u0003\u0000\u0000\u05cc\u0649"+
		"\u0001\u0000\u0000\u0000\u05cd\u05ce\u0005\u001b\u0000\u0000\u05ce\u05d0"+
		"\u0003b1\u0000\u05cf\u05d1\u0003\u0080@\u0000\u05d0\u05cf\u0001\u0000"+
		"\u0000\u0000\u05d1\u05d2\u0001\u0000\u0000\u0000\u05d2\u05d0\u0001\u0000"+
		"\u0000\u0000\u05d2\u05d3\u0001\u0000\u0000\u0000\u05d3\u05d6\u0001\u0000"+
		"\u0000\u0000\u05d4\u05d5\u00059\u0000\u0000\u05d5\u05d7\u0003\\.\u0000"+
		"\u05d6\u05d4\u0001\u0000\u0000\u0000\u05d6\u05d7\u0001\u0000\u0000\u0000"+
		"\u05d7\u05d8\u0001\u0000\u0000\u0000\u05d8\u05d9\u0005:\u0000\u0000\u05d9"+
		"\u0649\u0001\u0000\u0000\u0000\u05da\u05dc\u0005\u001b\u0000\u0000\u05db"+
		"\u05dd\u0003\u0080@\u0000\u05dc\u05db\u0001\u0000\u0000\u0000\u05dd\u05de"+
		"\u0001\u0000\u0000\u0000\u05de\u05dc\u0001\u0000\u0000\u0000\u05de\u05df"+
		"\u0001\u0000\u0000\u0000\u05df\u05e2\u0001\u0000\u0000\u0000\u05e0\u05e1"+
		"\u00059\u0000\u0000\u05e1\u05e3\u0003\\.\u0000\u05e2\u05e0\u0001\u0000"+
		"\u0000\u0000\u05e2\u05e3\u0001\u0000\u0000\u0000\u05e3\u05e4\u0001\u0000"+
		"\u0000\u0000\u05e4\u05e5\u0005:\u0000\u0000\u05e5\u0649\u0001\u0000\u0000"+
		"\u0000\u05e6\u05e7\u0005\u001c\u0000\u0000\u05e7\u05e8\u0005\u0002\u0000"+
		"\u0000\u05e8\u05e9\u0003\\.\u0000\u05e9\u05ea\u0005\u0012\u0000\u0000"+
		"\u05ea\u05eb\u0003z=\u0000\u05eb\u05ec\u0005\u0003\u0000\u0000\u05ec\u0649"+
		"\u0001\u0000\u0000\u0000\u05ed\u05ee\u0005\u00c3\u0000\u0000\u05ee\u05ef"+
		"\u0005\u0002\u0000\u0000\u05ef\u05f0\u0003\\.\u0000\u05f0\u05f1\u0005"+
		"\u0012\u0000\u0000\u05f1\u05f2\u0003z=\u0000\u05f2\u05f3\u0005\u0003\u0000"+
		"\u0000\u05f3\u0649\u0001\u0000\u0000\u0000\u05f4\u05f5\u0005\u0011\u0000"+
		"\u0000\u05f5\u05fe\u0005\u0007\u0000\u0000\u05f6\u05fb\u0003\\.\u0000"+
		"\u05f7\u05f8\u0005\u0004\u0000\u0000\u05f8\u05fa\u0003\\.\u0000\u05f9"+
		"\u05f7\u0001\u0000\u0000\u0000\u05fa\u05fd\u0001\u0000\u0000\u0000\u05fb"+
		"\u05f9\u0001\u0000\u0000\u0000\u05fb\u05fc\u0001\u0000\u0000\u0000\u05fc"+
		"\u05ff\u0001\u0000\u0000\u0000\u05fd\u05fb\u0001\u0000\u0000\u0000\u05fe"+
		"\u05f6\u0001\u0000\u0000\u0000\u05fe\u05ff\u0001\u0000\u0000\u0000\u05ff"+
		"\u0600\u0001\u0000\u0000\u0000\u0600\u0649\u0005\b\u0000\u0000\u0601\u0649"+
		"\u0003\u009cN\u0000\u0602\u0649\u0005(\u0000\u0000\u0603\u0607\u0005*"+
		"\u0000\u0000\u0604\u0605\u0005\u0002\u0000\u0000\u0605\u0606\u0005\u00e7"+
		"\u0000\u0000\u0606\u0608\u0005\u0003\u0000\u0000\u0607\u0604\u0001\u0000"+
		"\u0000\u0000\u0607\u0608\u0001\u0000\u0000\u0000\u0608\u0649\u0001\u0000"+
		"\u0000\u0000\u0609\u060d\u0005+\u0000\u0000\u060a\u060b\u0005\u0002\u0000"+
		"\u0000\u060b\u060c\u0005\u00e7\u0000\u0000\u060c\u060e\u0005\u0003\u0000"+
		"\u0000\u060d\u060a\u0001\u0000\u0000\u0000\u060d\u060e\u0001\u0000\u0000"+
		"\u0000\u060e\u0649\u0001\u0000\u0000\u0000\u060f\u0613\u0005n\u0000\u0000"+
		"\u0610\u0611\u0005\u0002\u0000\u0000\u0611\u0612\u0005\u00e7\u0000\u0000"+
		"\u0612\u0614\u0005\u0003\u0000\u0000\u0613\u0610\u0001\u0000\u0000\u0000"+
		"\u0613\u0614\u0001\u0000\u0000\u0000\u0614\u0649\u0001\u0000\u0000\u0000"+
		"\u0615\u0619\u0005o\u0000\u0000\u0616\u0617\u0005\u0002\u0000\u0000\u0617"+
		"\u0618\u0005\u00e7\u0000\u0000\u0618\u061a\u0005\u0003\u0000\u0000\u0619"+
		"\u0616\u0001\u0000\u0000\u0000\u0619\u061a\u0001\u0000\u0000\u0000\u061a"+
		"\u0649\u0001\u0000\u0000\u0000\u061b\u0649\u0005,\u0000\u0000\u061c\u061d"+
		"\u0005\u00b5\u0000\u0000\u061d\u061e\u0005\u0002\u0000\u0000\u061e\u061f"+
		"\u0003b1\u0000\u061f\u0620\u0005J\u0000\u0000\u0620\u0623\u0003b1\u0000"+
		"\u0621\u0622\u0005H\u0000\u0000\u0622\u0624\u0003b1\u0000\u0623\u0621"+
		"\u0001\u0000\u0000\u0000\u0623\u0624\u0001\u0000\u0000\u0000\u0624\u0625"+
		"\u0001\u0000\u0000\u0000\u0625\u0626\u0005\u0003\u0000\u0000\u0626\u0649"+
		"\u0001\u0000\u0000\u0000\u0627\u0628\u0005}\u0000\u0000\u0628\u0629\u0005"+
		"\u0002\u0000\u0000\u0629\u062c\u0003b1\u0000\u062a\u062b\u0005\u0004\u0000"+
		"\u0000\u062b\u062d\u0003v;\u0000\u062c\u062a\u0001\u0000\u0000\u0000\u062c"+
		"\u062d\u0001\u0000\u0000\u0000\u062d\u062e\u0001\u0000\u0000\u0000\u062e"+
		"\u062f\u0005\u0003\u0000\u0000\u062f\u0649\u0001\u0000\u0000\u0000\u0630"+
		"\u0631\u0005A\u0000\u0000\u0631\u0632\u0005\u0002\u0000\u0000\u0632\u0633"+
		"\u0003\u009cN\u0000\u0633\u0634\u0005J\u0000\u0000\u0634\u0635\u0003b"+
		"1\u0000\u0635\u0636\u0005\u0003\u0000\u0000\u0636\u0649\u0001\u0000\u0000"+
		"\u0000\u0637\u0638\u0005\u0002\u0000\u0000\u0638\u0639\u0003\\.\u0000"+
		"\u0639\u063a\u0005\u0003\u0000\u0000\u063a\u0649\u0001\u0000\u0000\u0000"+
		"\u063b\u063c\u0005S\u0000\u0000\u063c\u0645\u0005\u0002\u0000\u0000\u063d"+
		"\u0642\u0003\u0094J\u0000\u063e\u063f\u0005\u0004\u0000\u0000\u063f\u0641"+
		"\u0003\u0094J\u0000\u0640\u063e\u0001\u0000\u0000\u0000\u0641\u0644\u0001"+
		"\u0000\u0000\u0000\u0642\u0640\u0001\u0000\u0000\u0000\u0642\u0643\u0001"+
		"\u0000\u0000\u0000\u0643\u0646\u0001\u0000\u0000\u0000\u0644\u0642\u0001"+
		"\u0000\u0000\u0000\u0645\u063d\u0001\u0000\u0000\u0000\u0645\u0646\u0001"+
		"\u0000\u0000\u0000\u0646\u0647\u0001\u0000\u0000\u0000\u0647\u0649\u0005"+
		"\u0003\u0000\u0000\u0648\u0559\u0001\u0000\u0000\u0000\u0648\u055b\u0001"+
		"\u0000\u0000\u0000\u0648\u055c\u0001\u0000\u0000\u0000\u0648\u055f\u0001"+
		"\u0000\u0000\u0000\u0648\u0561\u0001\u0000\u0000\u0000\u0648\u0562\u0001"+
		"\u0000\u0000\u0000\u0648\u0563\u0001\u0000\u0000\u0000\u0648\u0564\u0001"+
		"\u0000\u0000\u0000\u0648\u0565\u0001\u0000\u0000\u0000\u0648\u0566\u0001"+
		"\u0000\u0000\u0000\u0648\u056d\u0001\u0000\u0000\u0000\u0648\u0577\u0001"+
		"\u0000\u0000\u0000\u0648\u0583\u0001\u0000\u0000\u0000\u0648\u058d\u0001"+
		"\u0000\u0000\u0000\u0648\u05b2\u0001\u0000\u0000\u0000\u0648\u05b6\u0001"+
		"\u0000\u0000\u0000\u0648\u05c4\u0001\u0000\u0000\u0000\u0648\u05c8\u0001"+
		"\u0000\u0000\u0000\u0648\u05cd\u0001\u0000\u0000\u0000\u0648\u05da\u0001"+
		"\u0000\u0000\u0000\u0648\u05e6\u0001\u0000\u0000\u0000\u0648\u05ed\u0001"+
		"\u0000\u0000\u0000\u0648\u05f4\u0001\u0000\u0000\u0000\u0648\u0601\u0001"+
		"\u0000\u0000\u0000\u0648\u0602\u0001\u0000\u0000\u0000\u0648\u0603\u0001"+
		"\u0000\u0000\u0000\u0648\u0609\u0001\u0000\u0000\u0000\u0648\u060f\u0001"+
		"\u0000\u0000\u0000\u0648\u0615\u0001\u0000\u0000\u0000\u0648\u061b\u0001"+
		"\u0000\u0000\u0000\u0648\u061c\u0001\u0000\u0000\u0000\u0648\u0627\u0001"+
		"\u0000\u0000\u0000\u0648\u0630\u0001\u0000\u0000\u0000\u0648\u0637\u0001"+
		"\u0000\u0000\u0000\u0648\u063b\u0001\u0000\u0000\u0000\u0649\u0654\u0001"+
		"\u0000\u0000\u0000\u064a\u064b\n\u000e\u0000\u0000\u064b\u064c\u0005\u0007"+
		"\u0000\u0000\u064c\u064d\u0003b1\u0000\u064d\u064e\u0005\b\u0000\u0000"+
		"\u064e\u0653\u0001\u0000\u0000\u0000\u064f\u0650\n\f\u0000\u0000\u0650"+
		"\u0651\u0005\u0001\u0000\u0000\u0651\u0653\u0003\u009cN\u0000\u0652\u064a"+
		"\u0001\u0000\u0000\u0000\u0652\u064f\u0001\u0000\u0000\u0000\u0653\u0656"+
		"\u0001\u0000\u0000\u0000\u0654\u0652\u0001\u0000\u0000\u0000\u0654\u0655"+
		"\u0001\u0000\u0000\u0000\u0655e\u0001\u0000\u0000\u0000\u0656\u0654\u0001"+
		"\u0000\u0000\u0000\u0657\u065e\u0005\u00e4\u0000\u0000\u0658\u065b\u0005"+
		"\u00e5\u0000\u0000\u0659\u065a\u0005\u00c5\u0000\u0000\u065a\u065c\u0005"+
		"\u00e4\u0000\u0000\u065b\u0659\u0001\u0000\u0000\u0000\u065b\u065c\u0001"+
		"\u0000\u0000\u0000\u065c\u065e\u0001\u0000\u0000\u0000\u065d\u0657\u0001"+
		"\u0000\u0000\u0000\u065d\u0658\u0001\u0000\u0000\u0000\u065eg\u0001\u0000"+
		"\u0000\u0000\u065f\u0660\u0005X\u0000\u0000\u0660\u0664\u0005\u0081\u0000"+
		"\u0000\u0661\u0662\u0005\u009b\u0000\u0000\u0662\u0664\u0005\u0081\u0000"+
		"\u0000\u0663\u065f\u0001\u0000\u0000\u0000\u0663\u0661\u0001\u0000\u0000"+
		"\u0000\u0664i\u0001\u0000\u0000\u0000\u0665\u0666\u0005\u00bd\u0000\u0000"+
		"\u0666\u0667\u0005\u00d7\u0000\u0000\u0667\u066c\u0003r9\u0000\u0668\u0669"+
		"\u0005\u00bd\u0000\u0000\u0669\u066a\u0005\u00d7\u0000\u0000\u066a\u066c"+
		"\u0003f3\u0000\u066b\u0665\u0001\u0000\u0000\u0000\u066b\u0668\u0001\u0000"+
		"\u0000\u0000\u066ck\u0001\u0000\u0000\u0000\u066d\u066e\u0007\r\u0000"+
		"\u0000\u066em\u0001\u0000\u0000\u0000\u066f\u0670\u0007\u000e\u0000\u0000"+
		"\u0670o\u0001\u0000\u0000\u0000\u0671\u0672\u0007\u000f\u0000\u0000\u0672"+
		"q\u0001\u0000\u0000\u0000\u0673\u0675\u0005_\u0000\u0000\u0674\u0676\u0007"+
		"\u000b\u0000\u0000\u0675\u0674\u0001\u0000\u0000\u0000\u0675\u0676\u0001"+
		"\u0000\u0000\u0000\u0676\u0677\u0001\u0000\u0000\u0000\u0677\u0678\u0003"+
		"f3\u0000\u0678\u067b\u0003t:\u0000\u0679\u067a\u0005\u00bf\u0000\u0000"+
		"\u067a\u067c\u0003t:\u0000\u067b\u0679\u0001\u0000\u0000\u0000\u067b\u067c"+
		"\u0001\u0000\u0000\u0000\u067cs\u0001\u0000\u0000\u0000\u067d\u067e\u0007"+
		"\u0010\u0000\u0000\u067eu\u0001\u0000\u0000\u0000\u067f\u0680\u0007\u0011"+
		"\u0000\u0000\u0680w\u0001\u0000\u0000\u0000\u0681\u068a\u0005\u0002\u0000"+
		"\u0000\u0682\u0687\u0003z=\u0000\u0683\u0684\u0005\u0004\u0000\u0000\u0684"+
		"\u0686\u0003z=\u0000\u0685\u0683\u0001\u0000\u0000\u0000\u0686\u0689\u0001"+
		"\u0000\u0000\u0000\u0687\u0685\u0001\u0000\u0000\u0000\u0687\u0688\u0001"+
		"\u0000\u0000\u0000\u0688\u068b\u0001\u0000\u0000\u0000\u0689\u0687\u0001"+
		"\u0000\u0000\u0000\u068a\u0682\u0001\u0000\u0000\u0000\u068a\u068b\u0001"+
		"\u0000\u0000\u0000\u068b\u068c\u0001\u0000\u0000\u0000\u068c\u068d\u0005"+
		"\u0003\u0000\u0000\u068dy\u0001\u0000\u0000\u0000\u068e\u068f\u0006=\uffff"+
		"\uffff\u0000\u068f\u0690\u0005\u0011\u0000\u0000\u0690\u0691\u0005\u00da"+
		"\u0000\u0000\u0691\u0692\u0003z=\u0000\u0692\u0693\u0005\u00dc\u0000\u0000"+
		"\u0693\u06be\u0001\u0000\u0000\u0000\u0694\u0695\u0005q\u0000\u0000\u0695"+
		"\u0696\u0005\u00da\u0000\u0000\u0696\u0697\u0003z=\u0000\u0697\u0698\u0005"+
		"\u0004\u0000\u0000\u0698\u0699\u0003z=\u0000\u0699\u069a\u0005\u00dc\u0000"+
		"\u0000\u069a\u06be\u0001\u0000\u0000\u0000\u069b\u069c\u0005\u00a5\u0000"+
		"\u0000\u069c\u069d\u0005\u0002\u0000\u0000\u069d\u069e\u0003\u009cN\u0000"+
		"\u069e\u06a5\u0003z=\u0000\u069f\u06a0\u0005\u0004\u0000\u0000\u06a0\u06a1"+
		"\u0003\u009cN\u0000\u06a1\u06a2\u0003z=\u0000\u06a2\u06a4\u0001\u0000"+
		"\u0000\u0000\u06a3\u069f\u0001\u0000\u0000\u0000\u06a4\u06a7\u0001\u0000"+
		"\u0000\u0000\u06a5\u06a3\u0001\u0000\u0000\u0000\u06a5\u06a6\u0001\u0000"+
		"\u0000\u0000\u06a6\u06a8\u0001\u0000\u0000\u0000\u06a7\u06a5\u0001\u0000"+
		"\u0000\u0000\u06a8\u06a9\u0005\u0003\u0000\u0000\u06a9\u06be\u0001\u0000"+
		"\u0000\u0000\u06aa\u06b6\u0003~?\u0000\u06ab\u06ac\u0005\u0002\u0000\u0000"+
		"\u06ac\u06b1\u0003|>\u0000\u06ad\u06ae\u0005\u0004\u0000\u0000\u06ae\u06b0"+
		"\u0003|>\u0000\u06af\u06ad\u0001\u0000\u0000\u0000\u06b0\u06b3\u0001\u0000"+
		"\u0000\u0000\u06b1\u06af\u0001\u0000\u0000\u0000\u06b1\u06b2\u0001\u0000"+
		"\u0000\u0000\u06b2\u06b4\u0001\u0000\u0000\u0000\u06b3\u06b1\u0001\u0000"+
		"\u0000\u0000\u06b4\u06b5\u0005\u0003\u0000\u0000\u06b5\u06b7\u0001\u0000"+
		"\u0000\u0000\u06b6\u06ab\u0001\u0000\u0000\u0000\u06b6\u06b7\u0001\u0000"+
		"\u0000\u0000\u06b7\u06be\u0001\u0000\u0000\u0000\u06b8\u06b9\u0005_\u0000"+
		"\u0000\u06b9\u06ba\u0003t:\u0000\u06ba\u06bb\u0005\u00bf\u0000\u0000\u06bb"+
		"\u06bc\u0003t:\u0000\u06bc\u06be\u0001\u0000\u0000\u0000\u06bd\u068e\u0001"+
		"\u0000\u0000\u0000\u06bd\u0694\u0001\u0000\u0000\u0000\u06bd\u069b\u0001"+
		"\u0000\u0000\u0000\u06bd\u06aa\u0001\u0000\u0000\u0000\u06bd\u06b8\u0001"+
		"\u0000\u0000\u0000\u06be\u06c3\u0001\u0000\u0000\u0000\u06bf\u06c0\n\u0006"+
		"\u0000\u0000\u06c0\u06c2\u0005\u0011\u0000\u0000\u06c1\u06bf\u0001\u0000"+
		"\u0000\u0000\u06c2\u06c5\u0001\u0000\u0000\u0000\u06c3\u06c1\u0001\u0000"+
		"\u0000\u0000\u06c3\u06c4\u0001\u0000\u0000\u0000\u06c4{\u0001\u0000\u0000"+
		"\u0000\u06c5\u06c3\u0001\u0000\u0000\u0000\u06c6\u06c9\u0005\u00e7\u0000"+
		"\u0000\u06c7\u06c9\u0003z=\u0000\u06c8\u06c6\u0001\u0000\u0000\u0000\u06c8"+
		"\u06c7\u0001\u0000\u0000\u0000\u06c9}\u0001\u0000\u0000\u0000\u06ca\u06cf"+
		"\u0005\u00ee\u0000\u0000\u06cb\u06cf\u0005\u00ef\u0000\u0000\u06cc\u06cf"+
		"\u0005\u00f0\u0000\u0000\u06cd\u06cf\u0003\u0094J\u0000\u06ce\u06ca\u0001"+
		"\u0000\u0000\u0000\u06ce\u06cb\u0001\u0000\u0000\u0000\u06ce\u06cc\u0001"+
		"\u0000\u0000\u0000\u06ce\u06cd\u0001\u0000\u0000\u0000\u06cf\u007f\u0001"+
		"\u0000\u0000\u0000\u06d0\u06d1\u0005\u00d1\u0000\u0000\u06d1\u06d2\u0003"+
		"\\.\u0000\u06d2\u06d3\u0005\u00bc\u0000\u0000\u06d3\u06d4\u0003\\.\u0000"+
		"\u06d4\u0081\u0001\u0000\u0000\u0000\u06d5\u06d6\u0005E\u0000\u0000\u06d6"+
		"\u06d7\u0005\u0002\u0000\u0000\u06d7\u06d8\u0005\u00d2\u0000\u0000\u06d8"+
		"\u06d9\u0003^/\u0000\u06d9\u06da\u0005\u0003\u0000\u0000\u06da\u0083\u0001"+
		"\u0000\u0000\u0000\u06db\u06dc\u0005\u008b\u0000\u0000\u06dc\u06e7\u0005"+
		"\u0002\u0000\u0000\u06dd\u06de\u0005\u008c\u0000\u0000\u06de\u06df\u0005"+
		"\u0017\u0000\u0000\u06df\u06e4\u0003\\.\u0000\u06e0\u06e1\u0005\u0004"+
		"\u0000\u0000\u06e1\u06e3\u0003\\.\u0000\u06e2\u06e0\u0001\u0000\u0000"+
		"\u0000\u06e3\u06e6\u0001\u0000\u0000\u0000\u06e4\u06e2\u0001\u0000\u0000"+
		"\u0000\u06e4\u06e5\u0001\u0000\u0000\u0000\u06e5\u06e8\u0001\u0000\u0000"+
		"\u0000\u06e6\u06e4\u0001\u0000\u0000\u0000\u06e7\u06dd\u0001\u0000\u0000"+
		"\u0000\u06e7\u06e8\u0001\u0000\u0000\u0000\u06e8\u06f3\u0001\u0000\u0000"+
		"\u0000\u06e9\u06ea\u0005\u0087\u0000\u0000\u06ea\u06eb\u0005\u0017\u0000"+
		"\u0000\u06eb\u06f0\u00034\u001a\u0000\u06ec\u06ed\u0005\u0004\u0000\u0000"+
		"\u06ed\u06ef\u00034\u001a\u0000\u06ee\u06ec\u0001\u0000\u0000\u0000\u06ef"+
		"\u06f2\u0001\u0000\u0000\u0000\u06f0\u06ee\u0001\u0000\u0000\u0000\u06f0"+
		"\u06f1\u0001\u0000\u0000\u0000\u06f1\u06f4\u0001\u0000\u0000\u0000\u06f2"+
		"\u06f0\u0001\u0000\u0000\u0000\u06f3\u06e9\u0001\u0000\u0000\u0000\u06f3"+
		"\u06f4\u0001\u0000\u0000\u0000\u06f4\u06f6\u0001\u0000\u0000\u0000\u06f5"+
		"\u06f7\u0003\u0086C\u0000\u06f6\u06f5\u0001\u0000\u0000\u0000\u06f6\u06f7"+
		"\u0001\u0000\u0000\u0000\u06f7\u06f8\u0001\u0000\u0000\u0000\u06f8\u06f9"+
		"\u0005\u0003\u0000\u0000\u06f9\u0085\u0001\u0000\u0000\u0000\u06fa\u06fb"+
		"\u0005\u0093\u0000\u0000\u06fb\u0713\u0003\u0088D\u0000\u06fc\u06fd\u0005"+
		"\u00a6\u0000\u0000\u06fd\u0713\u0003\u0088D\u0000\u06fe\u06ff\u0005T\u0000"+
		"\u0000\u06ff\u0713\u0003\u0088D\u0000\u0700\u0701\u0005\u0093\u0000\u0000"+
		"\u0701\u0702\u0005\u0016\u0000\u0000\u0702\u0703\u0003\u0088D\u0000\u0703"+
		"\u0704\u0005\u000f\u0000\u0000\u0704\u0705\u0003\u0088D\u0000\u0705\u0713"+
		"\u0001\u0000\u0000\u0000\u0706\u0707\u0005\u00a6\u0000\u0000\u0707\u0708"+
		"\u0005\u0016\u0000\u0000\u0708\u0709\u0003\u0088D\u0000\u0709\u070a\u0005"+
		"\u000f\u0000\u0000\u070a\u070b\u0003\u0088D\u0000\u070b\u0713\u0001\u0000"+
		"\u0000\u0000\u070c\u070d\u0005T\u0000\u0000\u070d\u070e\u0005\u0016\u0000"+
		"\u0000\u070e\u070f\u0003\u0088D\u0000\u070f\u0710\u0005\u000f\u0000\u0000"+
		"\u0710\u0711\u0003\u0088D\u0000\u0711\u0713\u0001\u0000\u0000\u0000\u0712"+
		"\u06fa\u0001\u0000\u0000\u0000\u0712\u06fc\u0001\u0000\u0000\u0000\u0712"+
		"\u06fe\u0001\u0000\u0000\u0000\u0712\u0700\u0001\u0000\u0000\u0000\u0712"+
		"\u0706\u0001\u0000\u0000\u0000\u0712\u070c\u0001\u0000\u0000\u0000\u0713"+
		"\u0087\u0001\u0000\u0000\u0000\u0714\u0715\u0005\u00c6\u0000\u0000\u0715"+
		"\u071e\u0005\u008f\u0000\u0000\u0716\u0717\u0005\u00c6\u0000\u0000\u0717"+
		"\u071e\u0005G\u0000\u0000\u0718\u0719\u0005\'\u0000\u0000\u0719\u071e"+
		"\u0005\u00a5\u0000\u0000\u071a\u071b\u0003\\.\u0000\u071b\u071c\u0007"+
		"\u0012\u0000\u0000\u071c\u071e\u0001\u0000\u0000\u0000\u071d\u0714\u0001"+
		"\u0000\u0000\u0000\u071d\u0716\u0001\u0000\u0000\u0000\u071d\u0718\u0001"+
		"\u0000\u0000\u0000\u071d\u071a\u0001\u0000\u0000\u0000\u071e\u0089\u0001"+
		"\u0000\u0000\u0000\u071f\u0720\u0005I\u0000\u0000\u0720\u0724\u0007\u0013"+
		"\u0000\u0000\u0721\u0722\u0005\u00c4\u0000\u0000\u0722\u0724\u0007\u0014"+
		"\u0000\u0000\u0723\u071f\u0001\u0000\u0000\u0000\u0723\u0721\u0001\u0000"+
		"\u0000\u0000\u0724\u008b\u0001\u0000\u0000\u0000\u0725\u0726\u0005d\u0000"+
		"\u0000\u0726\u0727\u0005k\u0000\u0000\u0727\u072b\u0003\u008eG\u0000\u0728"+
		"\u0729\u0005\u0094\u0000\u0000\u0729\u072b\u0007\u0015\u0000\u0000\u072a"+
		"\u0725\u0001\u0000\u0000\u0000\u072a\u0728\u0001\u0000\u0000\u0000\u072b"+
		"\u008d\u0001\u0000\u0000\u0000\u072c\u072d\u0005\u0094\u0000\u0000\u072d"+
		"\u0734\u0005\u00c7\u0000\u0000\u072e\u072f\u0005\u0094\u0000\u0000\u072f"+
		"\u0734\u0005\"\u0000\u0000\u0730\u0731\u0005\u0098\u0000\u0000\u0731\u0734"+
		"\u0005\u0094\u0000\u0000\u0732\u0734\u0005\u00ac\u0000\u0000\u0733\u072c"+
		"\u0001\u0000\u0000\u0000\u0733\u072e\u0001\u0000\u0000\u0000\u0733\u0730"+
		"\u0001\u0000\u0000\u0000\u0733\u0732\u0001\u0000\u0000\u0000\u0734\u008f"+
		"\u0001\u0000\u0000\u0000\u0735\u073b\u0003\\.\u0000\u0736\u0737\u0003"+
		"\u009cN\u0000\u0737\u0738\u0005\t\u0000\u0000\u0738\u0739\u0003\\.\u0000"+
		"\u0739\u073b\u0001\u0000\u0000\u0000\u073a\u0735\u0001\u0000\u0000\u0000"+
		"\u073a\u0736\u0001\u0000\u0000\u0000\u073b\u0091\u0001\u0000\u0000\u0000"+
		"\u073c\u0741\u0005\u00ab\u0000\u0000\u073d\u0741\u00052\u0000\u0000\u073e"+
		"\u0741\u0005]\u0000\u0000\u073f\u0741\u0003\u009cN\u0000\u0740\u073c\u0001"+
		"\u0000\u0000\u0000\u0740\u073d\u0001\u0000\u0000\u0000\u0740\u073e\u0001"+
		"\u0000\u0000\u0000\u0740\u073f\u0001\u0000\u0000\u0000\u0741\u0093\u0001"+
		"\u0000\u0000\u0000\u0742\u0747\u0003\u009cN\u0000\u0743\u0744\u0005\u0001"+
		"\u0000\u0000\u0744\u0746\u0003\u009cN\u0000\u0745\u0743\u0001\u0000\u0000"+
		"\u0000\u0746\u0749\u0001\u0000\u0000\u0000\u0747\u0745\u0001\u0000\u0000"+
		"\u0000\u0747\u0748\u0001\u0000\u0000\u0000\u0748\u0095\u0001\u0000\u0000"+
		"\u0000\u0749\u0747\u0001\u0000\u0000\u0000\u074a\u074e\u0005,\u0000\u0000"+
		"\u074b\u074e\u0005)\u0000\u0000\u074c\u074e\u0003\u0098L\u0000\u074d\u074a"+
		"\u0001\u0000\u0000\u0000\u074d\u074b\u0001\u0000\u0000\u0000\u074d\u074c"+
		"\u0001\u0000\u0000\u0000\u074e\u0097\u0001\u0000\u0000\u0000\u074f\u0750"+
		"\u0005\u00cb\u0000\u0000\u0750\u0755\u0003\u009cN\u0000\u0751\u0752\u0005"+
		"\u00a1\u0000\u0000\u0752\u0755\u0003\u009cN\u0000\u0753\u0755\u0003\u009c"+
		"N\u0000\u0754\u074f\u0001\u0000\u0000\u0000\u0754\u0751\u0001\u0000\u0000"+
		"\u0000\u0754\u0753\u0001\u0000\u0000\u0000\u0755\u0099\u0001\u0000\u0000"+
		"\u0000\u0756\u075b\u0003\u009cN\u0000\u0757\u0758\u0005\u0004\u0000\u0000"+
		"\u0758\u075a\u0003\u009cN\u0000\u0759\u0757\u0001\u0000\u0000\u0000\u075a"+
		"\u075d\u0001\u0000\u0000\u0000\u075b\u0759\u0001\u0000\u0000\u0000\u075b"+
		"\u075c\u0001\u0000\u0000\u0000\u075c\u009b\u0001\u0000\u0000\u0000\u075d"+
		"\u075b\u0001\u0000\u0000\u0000\u075e\u0764\u0005\u00ea\u0000\u0000\u075f"+
		"\u0764\u0005\u00ec\u0000\u0000\u0760\u0764\u0003\u00a0P\u0000\u0761\u0764"+
		"\u0005\u00ed\u0000\u0000\u0762\u0764\u0005\u00eb\u0000\u0000\u0763\u075e"+
		"\u0001\u0000\u0000\u0000\u0763\u075f\u0001\u0000\u0000\u0000\u0763\u0760"+
		"\u0001\u0000\u0000\u0000\u0763\u0761\u0001\u0000\u0000\u0000\u0763\u0762"+
		"\u0001\u0000\u0000\u0000\u0764\u009d\u0001\u0000\u0000\u0000\u0765\u0769"+
		"\u0005\u00e8\u0000\u0000\u0766\u0769\u0005\u00e9\u0000\u0000\u0767\u0769"+
		"\u0005\u00e7\u0000\u0000\u0768\u0765\u0001\u0000\u0000\u0000\u0768\u0766"+
		"\u0001\u0000\u0000\u0000\u0768\u0767\u0001\u0000\u0000\u0000\u0769\u009f"+
		"\u0001\u0000\u0000\u0000\u076a\u076b\u0007\u0016\u0000\u0000\u076b\u00a1"+
		"\u0001\u0000\u0000\u0000\u00f2\u00b8\u00bd\u00c3\u00c7\u00d5\u00d9\u00dd"+
		"\u00e1\u00e9\u00ed\u00f0\u00f7\u0100\u0106\u010a\u0110\u0117\u0120\u0129"+
		"\u0134\u013b\u0145\u014c\u0154\u015c\u0164\u0170\u0176\u017b\u0181\u018a"+
		"\u0193\u0198\u019c\u01a4\u01ab\u01b8\u01bb\u01c5\u01c8\u01cf\u01d8\u01de"+
		"\u01e3\u01e7\u01f1\u01f4\u01fe\u020b\u0211\u0216\u021c\u0225\u022b\u0232"+
		"\u023a\u023f\u0243\u024b\u0251\u0258\u025d\u0261\u026b\u026e\u0272\u0275"+
		"\u027d\u0282\u0297\u029d\u02a3\u02a5\u02ab\u02b1\u02b3\u02bb\u02bd\u02d0"+
		"\u02d5\u02dc\u02e8\u02ea\u02f2\u02f4\u0306\u0309\u030d\u0311\u0323\u0326"+
		"\u032e\u0331\u0337\u033e\u0343\u0349\u034d\u0351\u0357\u035f\u036e\u0375"+
		"\u037a\u0381\u0389\u038d\u0392\u039d\u03a9\u03ac\u03b1\u03b3\u03bc\u03be"+
		"\u03c6\u03cc\u03cf\u03d1\u03dd\u03e4\u03e8\u03ec\u03f0\u03f3\u03f6\u03f9"+
		"\u03fd\u0404\u040d\u0416\u041d\u042b\u042e\u0438\u043b\u0446\u044b\u0453"+
		"\u0456\u045a\u045e\u0469\u046c\u0473\u0486\u048a\u048e\u0492\u0496\u049a"+
		"\u049c\u04a7\u04ac\u04b5\u04bb\u04bf\u04c1\u04c9\u04da\u04e0\u04eb\u04f2"+
		"\u04f6\u04fe\u0500\u050d\u0515\u051e\u0524\u052c\u0532\u0536\u053b\u0540"+
		"\u0546\u0554\u0556\u0573\u057e\u0588\u058b\u0590\u0597\u059a\u05a3\u05a6"+
		"\u05aa\u05ad\u05b0\u05bc\u05bf\u05d2\u05d6\u05de\u05e2\u05fb\u05fe\u0607"+
		"\u060d\u0613\u0619\u0623\u062c\u0642\u0645\u0648\u0652\u0654\u065b\u065d"+
		"\u0663\u066b\u0675\u067b\u0687\u068a\u06a5\u06b1\u06b6\u06bd\u06c3\u06c8"+
		"\u06ce\u06e4\u06e7\u06f0\u06f3\u06f6\u0712\u071d\u0723\u072a\u0733\u073a"+
		"\u0740\u0747\u074d\u0754\u075b\u0763\u0768";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}