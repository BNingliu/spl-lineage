// Generated from D:/workspace/myxql/myxql-parser-spark/src/main/antlr4/com/myxql/parser/spark/antlr4\SqlBaseParser.g4 by ANTLR 4.9.2
package com.myxql.parser.spark.antlr4;
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
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SEMICOLON=1, LEFT_PAREN=2, RIGHT_PAREN=3, COMMA=4, DOT=5, LEFT_BRACKET=6, 
		RIGHT_BRACKET=7, ADD=8, AFTER=9, ALL=10, ALTER=11, ANALYZE=12, AND=13, 
		ANTI=14, ANY=15, ANY_VALUE=16, ARCHIVE=17, ARRAY=18, AS=19, ASC=20, AT=21, 
		AUTHORIZATION=22, BETWEEN=23, BOTH=24, BUCKET=25, BUCKETS=26, BY=27, CACHE=28, 
		CASCADE=29, CASE=30, CAST=31, CATALOG=32, CATALOGS=33, CHANGE=34, CHECK=35, 
		CLEAR=36, CLUSTER=37, CLUSTERED=38, CODEGEN=39, COLLATE=40, COLLECTION=41, 
		COLUMN=42, COLUMNS=43, COMMENT=44, COMMIT=45, COMPACT=46, COMPACTIONS=47, 
		COMPUTE=48, CONCATENATE=49, CONSTRAINT=50, COST=51, CREATE=52, CROSS=53, 
		CUBE=54, CURRENT=55, CURRENT_DATE=56, CURRENT_TIME=57, CURRENT_TIMESTAMP=58, 
		CURRENT_USER=59, DAY=60, DAYS=61, DAYOFYEAR=62, DATA=63, DATABASE=64, 
		DATABASES=65, DATEADD=66, DATEDIFF=67, DBPROPERTIES=68, DEFAULT=69, DEFINED=70, 
		DELETE=71, DELIMITED=72, DESC=73, DESCRIBE=74, DFS=75, DIRECTORIES=76, 
		DIRECTORY=77, DISTINCT=78, DISTRIBUTE=79, DIV=80, DROP=81, ELSE=82, END=83, 
		ESCAPE=84, ESCAPED=85, EXCEPT=86, EXCHANGE=87, EXCLUDE=88, EXISTS=89, 
		EXPLAIN=90, EXPORT=91, EXTENDED=92, EXTERNAL=93, EXTRACT=94, FALSE=95, 
		FETCH=96, FIELDS=97, FILTER=98, FILEFORMAT=99, FIRST=100, FOLLOWING=101, 
		FOR=102, FOREIGN=103, FORMAT=104, FORMATTED=105, FROM=106, FULL=107, FUNCTION=108, 
		FUNCTIONS=109, GLOBAL=110, GRANT=111, GROUP=112, GROUPING=113, HAVING=114, 
		HOUR=115, HOURS=116, IF=117, IGNORE=118, IMPORT=119, IN=120, INCLUDE=121, 
		INDEX=122, INDEXES=123, INNER=124, INPATH=125, INPUTFORMAT=126, INSERT=127, 
		INTERSECT=128, INTERVAL=129, INTO=130, IS=131, ITEMS=132, JOIN=133, KEYS=134, 
		LAST=135, LATERAL=136, LAZY=137, LEADING=138, LEFT=139, LIKE=140, ILIKE=141, 
		LIMIT=142, LINES=143, LIST=144, LOAD=145, LOCAL=146, LOCATION=147, LOCK=148, 
		LOCKS=149, LOGICAL=150, MACRO=151, MAP=152, MATCHED=153, MERGE=154, MICROSECOND=155, 
		MICROSECONDS=156, MILLISECOND=157, MILLISECONDS=158, MINUTE=159, MINUTES=160, 
		MONTH=161, MONTHS=162, MSCK=163, NAMESPACE=164, NAMESPACES=165, NANOSECOND=166, 
		NANOSECONDS=167, NATURAL=168, NO=169, NOT=170, NULL=171, NULLS=172, OF=173, 
		OFFSET=174, ON=175, ONLY=176, OPTION=177, OPTIONS=178, OR=179, ORDER=180, 
		OUT=181, OUTER=182, OUTPUTFORMAT=183, OVER=184, OVERLAPS=185, OVERLAY=186, 
		OVERWRITE=187, PARTITION=188, PARTITIONED=189, PARTITIONS=190, PERCENTILE_CONT=191, 
		PERCENTILE_DISC=192, PERCENTLIT=193, PIVOT=194, PLACING=195, POSITION=196, 
		PRECEDING=197, PRIMARY=198, PRINCIPALS=199, PROPERTIES=200, PURGE=201, 
		QUARTER=202, QUERY=203, RANGE=204, RECORDREADER=205, RECORDWRITER=206, 
		RECOVER=207, REDUCE=208, REFERENCES=209, REFRESH=210, RENAME=211, REPAIR=212, 
		REPEATABLE=213, REPLACE=214, RESET=215, RESPECT=216, RESTRICT=217, REVOKE=218, 
		RIGHT=219, RLIKE=220, ROLE=221, ROLES=222, ROLLBACK=223, ROLLUP=224, ROW=225, 
		ROWS=226, SECOND=227, SECONDS=228, SCHEMA=229, SCHEMAS=230, SELECT=231, 
		SEMI=232, SEPARATED=233, SERDE=234, SERDEPROPERTIES=235, SESSION_USER=236, 
		SET=237, SETMINUS=238, SETS=239, SHOW=240, SKEWED=241, SOME=242, SORT=243, 
		SORTED=244, SOURCE=245, START=246, STATISTICS=247, STORED=248, STRATIFY=249, 
		STRUCT=250, SUBSTR=251, SUBSTRING=252, SYNC=253, SYSTEM_TIME=254, SYSTEM_VERSION=255, 
		TABLE=256, TABLES=257, TABLESAMPLE=258, TARGET=259, TBLPROPERTIES=260, 
		TEMPORARY=261, TERMINATED=262, THEN=263, TIME=264, TIMESTAMP=265, TIMESTAMPADD=266, 
		TIMESTAMPDIFF=267, TO=268, TOUCH=269, TRAILING=270, TRANSACTION=271, TRANSACTIONS=272, 
		TRANSFORM=273, TRIM=274, TRUE=275, TRUNCATE=276, TRY_CAST=277, TYPE=278, 
		UNARCHIVE=279, UNBOUNDED=280, UNCACHE=281, UNION=282, UNIQUE=283, UNKNOWN=284, 
		UNLOCK=285, UNPIVOT=286, UNSET=287, UPDATE=288, USE=289, USER=290, USING=291, 
		VALUES=292, VERSION=293, VIEW=294, VIEWS=295, WEEK=296, WEEKS=297, WHEN=298, 
		WHERE=299, WINDOW=300, WITH=301, WITHIN=302, YEAR=303, YEARS=304, ZONE=305, 
		COLLECT_SET=306, EQ=307, NSEQ=308, NEQ=309, NEQJ=310, LT=311, LTE=312, 
		GT=313, GTE=314, PLUS=315, MINUS=316, ASTERISK=317, SLASH=318, PERCENT=319, 
		TILDE=320, AMPERSAND=321, PIPE=322, CONCAT_PIPE=323, HAT=324, COLON=325, 
		ARROW=326, HENT_START=327, HENT_END=328, STRING=329, DOUBLEQUOTED_STRING=330, 
		BIGINT_LITERAL=331, SMALLINT_LITERAL=332, TINYINT_LITERAL=333, INTEGER_VALUE=334, 
		EXPONENT_VALUE=335, DECIMAL_VALUE=336, FLOAT_LITERAL=337, DOUBLE_LITERAL=338, 
		BIGDECIMAL_LITERAL=339, IDENTIFIER=340, BACKQUOTED_IDENTIFIER=341, SIMPLE_COMMENT=342, 
		BRACKETED_COMMENT=343, WS=344, UNRECOGNIZED=345;
	public static final int
		RULE_singleStatement = 0, RULE_singleExpression = 1, RULE_singleTableIdentifier = 2, 
		RULE_singleMultipartIdentifier = 3, RULE_singleFunctionIdentifier = 4, 
		RULE_singleDataType = 5, RULE_singleTableSchema = 6, RULE_statement = 7, 
		RULE_timezone = 8, RULE_configKey = 9, RULE_configValue = 10, RULE_unsupportedHiveNativeCommands = 11, 
		RULE_createTableHeader = 12, RULE_replaceTableHeader = 13, RULE_bucketSpec = 14, 
		RULE_skewSpec = 15, RULE_locationSpec = 16, RULE_commentSpec = 17, RULE_query = 18, 
		RULE_insertInto = 19, RULE_partitionSpecLocation = 20, RULE_partitionSpec = 21, 
		RULE_partitionVal = 22, RULE_namespace = 23, RULE_namespaces = 24, RULE_describeFuncName = 25, 
		RULE_describeColName = 26, RULE_ctes = 27, RULE_namedQuery = 28, RULE_tableProvider = 29, 
		RULE_createTableClauses = 30, RULE_propertyList = 31, RULE_property = 32, 
		RULE_propertyKey = 33, RULE_propertyValue = 34, RULE_constantList = 35, 
		RULE_nestedConstantList = 36, RULE_createFileFormat = 37, RULE_fileFormat = 38, 
		RULE_storageHandler = 39, RULE_resource = 40, RULE_dmlStatementNoWith = 41, 
		RULE_queryOrganization = 42, RULE_multiInsertQueryBody = 43, RULE_queryTerm = 44, 
		RULE_queryPrimary = 45, RULE_sortItem = 46, RULE_fromStatement = 47, RULE_fromStatementBody = 48, 
		RULE_querySpecification = 49, RULE_transformClause = 50, RULE_selectClause = 51, 
		RULE_setClause = 52, RULE_matchedClause = 53, RULE_notMatchedClause = 54, 
		RULE_notMatchedBySourceClause = 55, RULE_matchedAction = 56, RULE_notMatchedAction = 57, 
		RULE_notMatchedBySourceAction = 58, RULE_assignmentList = 59, RULE_assignment = 60, 
		RULE_whereClause = 61, RULE_havingClause = 62, RULE_hint = 63, RULE_hintStatement = 64, 
		RULE_fromClause = 65, RULE_temporalClause = 66, RULE_aggregationClause = 67, 
		RULE_groupByClause = 68, RULE_groupingAnalytics = 69, RULE_groupingElement = 70, 
		RULE_groupingSet = 71, RULE_pivotClause = 72, RULE_pivotColumn = 73, RULE_pivotValue = 74, 
		RULE_unpivotClause = 75, RULE_unpivotNullClause = 76, RULE_unpivotOperator = 77, 
		RULE_unpivotSingleValueColumnClause = 78, RULE_unpivotMultiValueColumnClause = 79, 
		RULE_unpivotColumnSet = 80, RULE_unpivotValueColumn = 81, RULE_unpivotNameColumn = 82, 
		RULE_unpivotColumnAndAlias = 83, RULE_unpivotColumn = 84, RULE_unpivotAlias = 85, 
		RULE_lateralView = 86, RULE_setQuantifier = 87, RULE_relation = 88, RULE_relationExtension = 89, 
		RULE_joinRelation = 90, RULE_joinType = 91, RULE_joinCriteria = 92, RULE_sample = 93, 
		RULE_sampleMethod = 94, RULE_identifierList = 95, RULE_identifierSeq = 96, 
		RULE_capturingIdent = 97, RULE_orderedIdentifierList = 98, RULE_orderedIdentifier = 99, 
		RULE_identifierCommentList = 100, RULE_identifierComment = 101, RULE_relationPrimary = 102, 
		RULE_inlineTable = 103, RULE_functionTable = 104, RULE_tableAlias = 105, 
		RULE_rowFormat = 106, RULE_multipartIdentifierList = 107, RULE_multipartIdentifier = 108, 
		RULE_multipartIdentifierPropertyList = 109, RULE_multipartIdentifierProperty = 110, 
		RULE_tableIdentifier = 111, RULE_functionIdentifier = 112, RULE_namedExpression = 113, 
		RULE_namedExpressionSeq = 114, RULE_partitionFieldList = 115, RULE_partitionField = 116, 
		RULE_transform = 117, RULE_transformArgument = 118, RULE_expression = 119, 
		RULE_expressionSeq = 120, RULE_booleanExpression = 121, RULE_predicate = 122, 
		RULE_valueExpression = 123, RULE_datetimeUnit = 124, RULE_primaryExpression = 125, 
		RULE_constant = 126, RULE_comparisonOperator = 127, RULE_arithmeticOperator = 128, 
		RULE_predicateOperator = 129, RULE_booleanValue = 130, RULE_interval = 131, 
		RULE_errorCapturingMultiUnitsInterval = 132, RULE_multiUnitsInterval = 133, 
		RULE_errorCapturingUnitToUnitInterval = 134, RULE_unitToUnitInterval = 135, 
		RULE_intervalValue = 136, RULE_unitInMultiUnits = 137, RULE_unitInUnitToUnit = 138, 
		RULE_colPosition = 139, RULE_dataType = 140, RULE_qualifiedColTypeWithPositionList = 141, 
		RULE_qualifiedColTypeWithPosition = 142, RULE_defaultExpression = 143, 
		RULE_colTypeList = 144, RULE_colType = 145, RULE_createOrReplaceTableColTypeList = 146, 
		RULE_createOrReplaceTableColType = 147, RULE_colDefinitionOption = 148, 
		RULE_complexColTypeList = 149, RULE_complexColType = 150, RULE_whenClause = 151, 
		RULE_windowClause = 152, RULE_namedWindow = 153, RULE_windowSpec = 154, 
		RULE_windowFrame = 155, RULE_frameBound = 156, RULE_qualifiedNameList = 157, 
		RULE_functionName = 158, RULE_qualifiedName = 159, RULE_errorCapturingIdentifier = 160, 
		RULE_errorCapturingIdentifierExtra = 161, RULE_identifier = 162, RULE_strictIdentifier = 163, 
		RULE_quotedIdentifier = 164, RULE_backQuotedIdentifier = 165, RULE_number = 166, 
		RULE_alterColumnAction = 167, RULE_stringLit = 168, RULE_comment = 169, 
		RULE_version = 170, RULE_ansiNonReserved = 171, RULE_strictNonReserved = 172, 
		RULE_nonReserved = 173;
	private static String[] makeRuleNames() {
		return new String[] {
			"singleStatement", "singleExpression", "singleTableIdentifier", "singleMultipartIdentifier", 
			"singleFunctionIdentifier", "singleDataType", "singleTableSchema", "statement", 
			"timezone", "configKey", "configValue", "unsupportedHiveNativeCommands", 
			"createTableHeader", "replaceTableHeader", "bucketSpec", "skewSpec", 
			"locationSpec", "commentSpec", "query", "insertInto", "partitionSpecLocation", 
			"partitionSpec", "partitionVal", "namespace", "namespaces", "describeFuncName", 
			"describeColName", "ctes", "namedQuery", "tableProvider", "createTableClauses", 
			"propertyList", "property", "propertyKey", "propertyValue", "constantList", 
			"nestedConstantList", "createFileFormat", "fileFormat", "storageHandler", 
			"resource", "dmlStatementNoWith", "queryOrganization", "multiInsertQueryBody", 
			"queryTerm", "queryPrimary", "sortItem", "fromStatement", "fromStatementBody", 
			"querySpecification", "transformClause", "selectClause", "setClause", 
			"matchedClause", "notMatchedClause", "notMatchedBySourceClause", "matchedAction", 
			"notMatchedAction", "notMatchedBySourceAction", "assignmentList", "assignment", 
			"whereClause", "havingClause", "hint", "hintStatement", "fromClause", 
			"temporalClause", "aggregationClause", "groupByClause", "groupingAnalytics", 
			"groupingElement", "groupingSet", "pivotClause", "pivotColumn", "pivotValue", 
			"unpivotClause", "unpivotNullClause", "unpivotOperator", "unpivotSingleValueColumnClause", 
			"unpivotMultiValueColumnClause", "unpivotColumnSet", "unpivotValueColumn", 
			"unpivotNameColumn", "unpivotColumnAndAlias", "unpivotColumn", "unpivotAlias", 
			"lateralView", "setQuantifier", "relation", "relationExtension", "joinRelation", 
			"joinType", "joinCriteria", "sample", "sampleMethod", "identifierList", 
			"identifierSeq", "capturingIdent", "orderedIdentifierList", "orderedIdentifier", 
			"identifierCommentList", "identifierComment", "relationPrimary", "inlineTable", 
			"functionTable", "tableAlias", "rowFormat", "multipartIdentifierList", 
			"multipartIdentifier", "multipartIdentifierPropertyList", "multipartIdentifierProperty", 
			"tableIdentifier", "functionIdentifier", "namedExpression", "namedExpressionSeq", 
			"partitionFieldList", "partitionField", "transform", "transformArgument", 
			"expression", "expressionSeq", "booleanExpression", "predicate", "valueExpression", 
			"datetimeUnit", "primaryExpression", "constant", "comparisonOperator", 
			"arithmeticOperator", "predicateOperator", "booleanValue", "interval", 
			"errorCapturingMultiUnitsInterval", "multiUnitsInterval", "errorCapturingUnitToUnitInterval", 
			"unitToUnitInterval", "intervalValue", "unitInMultiUnits", "unitInUnitToUnit", 
			"colPosition", "dataType", "qualifiedColTypeWithPositionList", "qualifiedColTypeWithPosition", 
			"defaultExpression", "colTypeList", "colType", "createOrReplaceTableColTypeList", 
			"createOrReplaceTableColType", "colDefinitionOption", "complexColTypeList", 
			"complexColType", "whenClause", "windowClause", "namedWindow", "windowSpec", 
			"windowFrame", "frameBound", "qualifiedNameList", "functionName", "qualifiedName", 
			"errorCapturingIdentifier", "errorCapturingIdentifierExtra", "identifier", 
			"strictIdentifier", "quotedIdentifier", "backQuotedIdentifier", "number", 
			"alterColumnAction", "stringLit", "comment", "version", "ansiNonReserved", 
			"strictNonReserved", "nonReserved"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'('", "')'", "','", "'.'", "'['", "']'", "'ADD'", "'AFTER'", 
			"'ALL'", "'ALTER'", "'ANALYZE'", "'AND'", "'ANTI'", "'ANY'", "'ANY_VALUE'", 
			"'ARCHIVE'", "'ARRAY'", "'AS'", "'ASC'", "'AT'", "'AUTHORIZATION'", "'BETWEEN'", 
			"'BOTH'", "'BUCKET'", "'BUCKETS'", "'BY'", "'CACHE'", "'CASCADE'", "'CASE'", 
			"'CAST'", "'CATALOG'", "'CATALOGS'", "'CHANGE'", "'CHECK'", "'CLEAR'", 
			"'CLUSTER'", "'CLUSTERED'", "'CODEGEN'", "'COLLATE'", "'COLLECTION'", 
			"'COLUMN'", "'COLUMNS'", "'COMMENT'", "'COMMIT'", "'COMPACT'", "'COMPACTIONS'", 
			"'COMPUTE'", "'CONCATENATE'", "'CONSTRAINT'", "'COST'", "'CREATE'", "'CROSS'", 
			"'CUBE'", "'CURRENT'", "'CURRENT_DATE'", "'CURRENT_TIME'", "'CURRENT_TIMESTAMP'", 
			"'CURRENT_USER'", "'DAY'", "'DAYS'", "'DAYOFYEAR'", "'DATA'", "'DATABASE'", 
			"'DATABASES'", "'DATEADD'", "'DATEDIFF'", "'DBPROPERTIES'", "'DEFAULT'", 
			"'DEFINED'", "'DELETE'", "'DELIMITED'", "'DESC'", "'DESCRIBE'", "'DFS'", 
			"'DIRECTORIES'", "'DIRECTORY'", "'DISTINCT'", "'DISTRIBUTE'", "'DIV'", 
			"'DROP'", "'ELSE'", "'END'", "'ESCAPE'", "'ESCAPED'", "'EXCEPT'", "'EXCHANGE'", 
			"'EXCLUDE'", "'EXISTS'", "'EXPLAIN'", "'EXPORT'", "'EXTENDED'", "'EXTERNAL'", 
			"'EXTRACT'", "'FALSE'", "'FETCH'", "'FIELDS'", "'FILTER'", "'FILEFORMAT'", 
			"'FIRST'", "'FOLLOWING'", "'FOR'", "'FOREIGN'", "'FORMAT'", "'FORMATTED'", 
			"'FROM'", "'FULL'", "'FUNCTION'", "'FUNCTIONS'", "'GLOBAL'", "'GRANT'", 
			"'GROUP'", "'GROUPING'", "'HAVING'", "'HOUR'", "'HOURS'", "'IF'", "'IGNORE'", 
			"'IMPORT'", "'IN'", "'INCLUDE'", "'INDEX'", "'INDEXES'", "'INNER'", "'INPATH'", 
			"'INPUTFORMAT'", "'INSERT'", "'INTERSECT'", "'INTERVAL'", "'INTO'", "'IS'", 
			"'ITEMS'", "'JOIN'", "'KEYS'", "'LAST'", "'LATERAL'", "'LAZY'", "'LEADING'", 
			"'LEFT'", "'LIKE'", "'ILIKE'", "'LIMIT'", "'LINES'", "'LIST'", "'LOAD'", 
			"'LOCAL'", "'LOCATION'", "'LOCK'", "'LOCKS'", "'LOGICAL'", "'MACRO'", 
			"'MAP'", "'MATCHED'", "'MERGE'", "'MICROSECOND'", "'MICROSECONDS'", "'MILLISECOND'", 
			"'MILLISECONDS'", "'MINUTE'", "'MINUTES'", "'MONTH'", "'MONTHS'", "'MSCK'", 
			"'NAMESPACE'", "'NAMESPACES'", "'NANOSECOND'", "'NANOSECONDS'", "'NATURAL'", 
			"'NO'", null, "'NULL'", "'NULLS'", "'OF'", "'OFFSET'", "'ON'", "'ONLY'", 
			"'OPTION'", "'OPTIONS'", "'OR'", "'ORDER'", "'OUT'", "'OUTER'", "'OUTPUTFORMAT'", 
			"'OVER'", "'OVERLAPS'", "'OVERLAY'", "'OVERWRITE'", "'PARTITION'", "'PARTITIONED'", 
			"'PARTITIONS'", "'PERCENTILE_CONT'", "'PERCENTILE_DISC'", "'PERCENT'", 
			"'PIVOT'", "'PLACING'", "'POSITION'", "'PRECEDING'", "'PRIMARY'", "'PRINCIPALS'", 
			"'PROPERTIES'", "'PURGE'", "'QUARTER'", "'QUERY'", "'RANGE'", "'RECORDREADER'", 
			"'RECORDWRITER'", "'RECOVER'", "'REDUCE'", "'REFERENCES'", "'REFRESH'", 
			"'RENAME'", "'REPAIR'", "'REPEATABLE'", "'REPLACE'", "'RESET'", "'RESPECT'", 
			"'RESTRICT'", "'REVOKE'", "'RIGHT'", null, "'ROLE'", "'ROLES'", "'ROLLBACK'", 
			"'ROLLUP'", "'ROW'", "'ROWS'", "'SECOND'", "'SECONDS'", "'SCHEMA'", "'SCHEMAS'", 
			"'SELECT'", "'SEMI'", "'SEPARATED'", "'SERDE'", "'SERDEPROPERTIES'", 
			"'SESSION_USER'", "'SET'", "'MINUS'", "'SETS'", "'SHOW'", "'SKEWED'", 
			"'SOME'", "'SORT'", "'SORTED'", "'SOURCE'", "'START'", "'STATISTICS'", 
			"'STORED'", "'STRATIFY'", "'STRUCT'", "'SUBSTR'", "'SUBSTRING'", "'SYNC'", 
			"'SYSTEM_TIME'", "'SYSTEM_VERSION'", "'TABLE'", "'TABLES'", "'TABLESAMPLE'", 
			"'TARGET'", "'TBLPROPERTIES'", null, "'TERMINATED'", "'THEN'", "'TIME'", 
			"'TIMESTAMP'", "'TIMESTAMPADD'", "'TIMESTAMPDIFF'", "'TO'", "'TOUCH'", 
			"'TRAILING'", "'TRANSACTION'", "'TRANSACTIONS'", "'TRANSFORM'", "'TRIM'", 
			"'TRUE'", "'TRUNCATE'", "'TRY_CAST'", "'TYPE'", "'UNARCHIVE'", "'UNBOUNDED'", 
			"'UNCACHE'", "'UNION'", "'UNIQUE'", "'UNKNOWN'", "'UNLOCK'", "'UNPIVOT'", 
			"'UNSET'", "'UPDATE'", "'USE'", "'USER'", "'USING'", "'VALUES'", "'VERSION'", 
			"'VIEW'", "'VIEWS'", "'WEEK'", "'WEEKS'", "'WHEN'", "'WHERE'", "'WINDOW'", 
			"'WITH'", "'WITHIN'", "'YEAR'", "'YEARS'", "'ZONE'", "'COLLECT_SET'", 
			null, "'<=>'", "'<>'", "'!='", "'<'", null, "'>'", null, "'+'", "'-'", 
			"'*'", "'/'", "'%'", "'~'", "'&'", "'|'", "'||'", "'^'", "':'", "'->'", 
			"'/*+'", "'*/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SEMICOLON", "LEFT_PAREN", "RIGHT_PAREN", "COMMA", "DOT", "LEFT_BRACKET", 
			"RIGHT_BRACKET", "ADD", "AFTER", "ALL", "ALTER", "ANALYZE", "AND", "ANTI", 
			"ANY", "ANY_VALUE", "ARCHIVE", "ARRAY", "AS", "ASC", "AT", "AUTHORIZATION", 
			"BETWEEN", "BOTH", "BUCKET", "BUCKETS", "BY", "CACHE", "CASCADE", "CASE", 
			"CAST", "CATALOG", "CATALOGS", "CHANGE", "CHECK", "CLEAR", "CLUSTER", 
			"CLUSTERED", "CODEGEN", "COLLATE", "COLLECTION", "COLUMN", "COLUMNS", 
			"COMMENT", "COMMIT", "COMPACT", "COMPACTIONS", "COMPUTE", "CONCATENATE", 
			"CONSTRAINT", "COST", "CREATE", "CROSS", "CUBE", "CURRENT", "CURRENT_DATE", 
			"CURRENT_TIME", "CURRENT_TIMESTAMP", "CURRENT_USER", "DAY", "DAYS", "DAYOFYEAR", 
			"DATA", "DATABASE", "DATABASES", "DATEADD", "DATEDIFF", "DBPROPERTIES", 
			"DEFAULT", "DEFINED", "DELETE", "DELIMITED", "DESC", "DESCRIBE", "DFS", 
			"DIRECTORIES", "DIRECTORY", "DISTINCT", "DISTRIBUTE", "DIV", "DROP", 
			"ELSE", "END", "ESCAPE", "ESCAPED", "EXCEPT", "EXCHANGE", "EXCLUDE", 
			"EXISTS", "EXPLAIN", "EXPORT", "EXTENDED", "EXTERNAL", "EXTRACT", "FALSE", 
			"FETCH", "FIELDS", "FILTER", "FILEFORMAT", "FIRST", "FOLLOWING", "FOR", 
			"FOREIGN", "FORMAT", "FORMATTED", "FROM", "FULL", "FUNCTION", "FUNCTIONS", 
			"GLOBAL", "GRANT", "GROUP", "GROUPING", "HAVING", "HOUR", "HOURS", "IF", 
			"IGNORE", "IMPORT", "IN", "INCLUDE", "INDEX", "INDEXES", "INNER", "INPATH", 
			"INPUTFORMAT", "INSERT", "INTERSECT", "INTERVAL", "INTO", "IS", "ITEMS", 
			"JOIN", "KEYS", "LAST", "LATERAL", "LAZY", "LEADING", "LEFT", "LIKE", 
			"ILIKE", "LIMIT", "LINES", "LIST", "LOAD", "LOCAL", "LOCATION", "LOCK", 
			"LOCKS", "LOGICAL", "MACRO", "MAP", "MATCHED", "MERGE", "MICROSECOND", 
			"MICROSECONDS", "MILLISECOND", "MILLISECONDS", "MINUTE", "MINUTES", "MONTH", 
			"MONTHS", "MSCK", "NAMESPACE", "NAMESPACES", "NANOSECOND", "NANOSECONDS", 
			"NATURAL", "NO", "NOT", "NULL", "NULLS", "OF", "OFFSET", "ON", "ONLY", 
			"OPTION", "OPTIONS", "OR", "ORDER", "OUT", "OUTER", "OUTPUTFORMAT", "OVER", 
			"OVERLAPS", "OVERLAY", "OVERWRITE", "PARTITION", "PARTITIONED", "PARTITIONS", 
			"PERCENTILE_CONT", "PERCENTILE_DISC", "PERCENTLIT", "PIVOT", "PLACING", 
			"POSITION", "PRECEDING", "PRIMARY", "PRINCIPALS", "PROPERTIES", "PURGE", 
			"QUARTER", "QUERY", "RANGE", "RECORDREADER", "RECORDWRITER", "RECOVER", 
			"REDUCE", "REFERENCES", "REFRESH", "RENAME", "REPAIR", "REPEATABLE", 
			"REPLACE", "RESET", "RESPECT", "RESTRICT", "REVOKE", "RIGHT", "RLIKE", 
			"ROLE", "ROLES", "ROLLBACK", "ROLLUP", "ROW", "ROWS", "SECOND", "SECONDS", 
			"SCHEMA", "SCHEMAS", "SELECT", "SEMI", "SEPARATED", "SERDE", "SERDEPROPERTIES", 
			"SESSION_USER", "SET", "SETMINUS", "SETS", "SHOW", "SKEWED", "SOME", 
			"SORT", "SORTED", "SOURCE", "START", "STATISTICS", "STORED", "STRATIFY", 
			"STRUCT", "SUBSTR", "SUBSTRING", "SYNC", "SYSTEM_TIME", "SYSTEM_VERSION", 
			"TABLE", "TABLES", "TABLESAMPLE", "TARGET", "TBLPROPERTIES", "TEMPORARY", 
			"TERMINATED", "THEN", "TIME", "TIMESTAMP", "TIMESTAMPADD", "TIMESTAMPDIFF", 
			"TO", "TOUCH", "TRAILING", "TRANSACTION", "TRANSACTIONS", "TRANSFORM", 
			"TRIM", "TRUE", "TRUNCATE", "TRY_CAST", "TYPE", "UNARCHIVE", "UNBOUNDED", 
			"UNCACHE", "UNION", "UNIQUE", "UNKNOWN", "UNLOCK", "UNPIVOT", "UNSET", 
			"UPDATE", "USE", "USER", "USING", "VALUES", "VERSION", "VIEW", "VIEWS", 
			"WEEK", "WEEKS", "WHEN", "WHERE", "WINDOW", "WITH", "WITHIN", "YEAR", 
			"YEARS", "ZONE", "COLLECT_SET", "EQ", "NSEQ", "NEQ", "NEQJ", "LT", "LTE", 
			"GT", "GTE", "PLUS", "MINUS", "ASTERISK", "SLASH", "PERCENT", "TILDE", 
			"AMPERSAND", "PIPE", "CONCAT_PIPE", "HAT", "COLON", "ARROW", "HENT_START", 
			"HENT_END", "STRING", "DOUBLEQUOTED_STRING", "BIGINT_LITERAL", "SMALLINT_LITERAL", 
			"TINYINT_LITERAL", "INTEGER_VALUE", "EXPONENT_VALUE", "DECIMAL_VALUE", 
			"FLOAT_LITERAL", "DOUBLE_LITERAL", "BIGDECIMAL_LITERAL", "IDENTIFIER", 
			"BACKQUOTED_IDENTIFIER", "SIMPLE_COMMENT", "BRACKETED_COMMENT", "WS", 
			"UNRECOGNIZED"
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
	public String getGrammarFileName() { return "SqlBaseParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	  /**
	   * When false, INTERSECT is given the greater precedence over the other set
	   * operations (UNION, EXCEPT and MINUS) as per the SQL standard.
	   */
	  public boolean legacy_setops_precedence_enabled = false;

	  /**
	   * When false, a literal with an exponent would be converted into
	   * double type rather than decimal type.
	   */
	  public boolean legacy_exponent_literal_as_decimal_enabled = false;

	  /**
	   * When true, the behavior of keywords follows ANSI SQL standard.
	   */
	  public boolean SQL_standard_keyword_behavior = false;

	  /**
	   * When true, double quoted literals are identifiers rather than STRINGs.
	   */
	  public boolean double_quoted_identifiers = false;

	public SqlBaseParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SingleStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(SqlBaseParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(SqlBaseParser.SEMICOLON, i);
		}
		public SingleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSingleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSingleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitSingleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleStatementContext singleStatement() throws RecognitionException {
		SingleStatementContext _localctx = new SingleStatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_singleStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			statement();
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMICOLON) {
				{
				{
				setState(349);
				match(SEMICOLON);
				}
				}
				setState(354);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(355);
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

	public static class SingleExpressionContext extends ParserRuleContext {
		public NamedExpressionContext namedExpression() {
			return getRuleContext(NamedExpressionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSingleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSingleExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitSingleExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleExpressionContext singleExpression() throws RecognitionException {
		SingleExpressionContext _localctx = new SingleExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_singleExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			namedExpression();
			setState(358);
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

	public static class SingleTableIdentifierContext extends ParserRuleContext {
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleTableIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleTableIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSingleTableIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSingleTableIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitSingleTableIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleTableIdentifierContext singleTableIdentifier() throws RecognitionException {
		SingleTableIdentifierContext _localctx = new SingleTableIdentifierContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_singleTableIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			tableIdentifier();
			setState(361);
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

	public static class SingleMultipartIdentifierContext extends ParserRuleContext {
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleMultipartIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleMultipartIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSingleMultipartIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSingleMultipartIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitSingleMultipartIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleMultipartIdentifierContext singleMultipartIdentifier() throws RecognitionException {
		SingleMultipartIdentifierContext _localctx = new SingleMultipartIdentifierContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_singleMultipartIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			multipartIdentifier();
			setState(364);
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

	public static class SingleFunctionIdentifierContext extends ParserRuleContext {
		public FunctionIdentifierContext functionIdentifier() {
			return getRuleContext(FunctionIdentifierContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleFunctionIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleFunctionIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSingleFunctionIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSingleFunctionIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitSingleFunctionIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleFunctionIdentifierContext singleFunctionIdentifier() throws RecognitionException {
		SingleFunctionIdentifierContext _localctx = new SingleFunctionIdentifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_singleFunctionIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			functionIdentifier();
			setState(367);
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

	public static class SingleDataTypeContext extends ParserRuleContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleDataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleDataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSingleDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSingleDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitSingleDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleDataTypeContext singleDataType() throws RecognitionException {
		SingleDataTypeContext _localctx = new SingleDataTypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_singleDataType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			dataType();
			setState(370);
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

	public static class SingleTableSchemaContext extends ParserRuleContext {
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleTableSchemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleTableSchema; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSingleTableSchema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSingleTableSchema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitSingleTableSchema(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleTableSchemaContext singleTableSchema() throws RecognitionException {
		SingleTableSchemaContext _localctx = new SingleTableSchemaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_singleTableSchema);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			colTypeList();
			setState(373);
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
		public TerminalNode LOGICAL() { return getToken(SqlBaseParser.LOGICAL, 0); }
		public TerminalNode FORMATTED() { return getToken(SqlBaseParser.FORMATTED, 0); }
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public TerminalNode CODEGEN() { return getToken(SqlBaseParser.CODEGEN, 0); }
		public TerminalNode COST() { return getToken(SqlBaseParser.COST, 0); }
		public ExplainContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterExplain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitExplain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitExplain(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ResetConfigurationContext extends StatementContext {
		public TerminalNode RESET() { return getToken(SqlBaseParser.RESET, 0); }
		public ResetConfigurationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterResetConfiguration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitResetConfiguration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitResetConfiguration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterViewQueryContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public AlterViewQueryContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterAlterViewQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitAlterViewQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitAlterViewQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UseContext extends StatementContext {
		public TerminalNode USE() { return getToken(SqlBaseParser.USE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public UseContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterUse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitUse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitUse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropNamespaceContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode RESTRICT() { return getToken(SqlBaseParser.RESTRICT, 0); }
		public TerminalNode CASCADE() { return getToken(SqlBaseParser.CASCADE, 0); }
		public DropNamespaceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterDropNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitDropNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitDropNamespace(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateTempViewUsingContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TableProviderContext tableProvider() {
			return getRuleContext(TableProviderContext.class,0);
		}
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode GLOBAL() { return getToken(SqlBaseParser.GLOBAL, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public TerminalNode OPTIONS() { return getToken(SqlBaseParser.OPTIONS, 0); }
		public PropertyListContext propertyList() {
			return getRuleContext(PropertyListContext.class,0);
		}
		public CreateTempViewUsingContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterCreateTempViewUsing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitCreateTempViewUsing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitCreateTempViewUsing(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RenameTableContext extends StatementContext {
		public MultipartIdentifierContext from;
		public MultipartIdentifierContext to;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public List<MultipartIdentifierContext> multipartIdentifier() {
			return getRuleContexts(MultipartIdentifierContext.class);
		}
		public MultipartIdentifierContext multipartIdentifier(int i) {
			return getRuleContext(MultipartIdentifierContext.class,i);
		}
		public RenameTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterRenameTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitRenameTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitRenameTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FailNativeCommandContext extends StatementContext {
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode ROLE() { return getToken(SqlBaseParser.ROLE, 0); }
		public UnsupportedHiveNativeCommandsContext unsupportedHiveNativeCommands() {
			return getRuleContext(UnsupportedHiveNativeCommandsContext.class,0);
		}
		public FailNativeCommandContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterFailNativeCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitFailNativeCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitFailNativeCommand(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetCatalogContext extends StatementContext {
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode CATALOG() { return getToken(SqlBaseParser.CATALOG, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public SetCatalogContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSetCatalog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSetCatalog(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitSetCatalog(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ClearCacheContext extends StatementContext {
		public TerminalNode CLEAR() { return getToken(SqlBaseParser.CLEAR, 0); }
		public TerminalNode CACHE() { return getToken(SqlBaseParser.CACHE, 0); }
		public ClearCacheContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterClearCache(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitClearCache(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitClearCache(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropViewContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public DropViewContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterDropView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitDropView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitDropView(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowTablesContext extends StatementContext {
		public StringLitContext pattern;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode TABLES() { return getToken(SqlBaseParser.TABLES, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public ShowTablesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterShowTables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitShowTables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitShowTables(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RecoverPartitionsContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode RECOVER() { return getToken(SqlBaseParser.RECOVER, 0); }
		public TerminalNode PARTITIONS() { return getToken(SqlBaseParser.PARTITIONS, 0); }
		public RecoverPartitionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterRecoverPartitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitRecoverPartitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitRecoverPartitions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropIndexContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode INDEX() { return getToken(SqlBaseParser.INDEX, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public DropIndexContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterDropIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitDropIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitDropIndex(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowCatalogsContext extends StatementContext {
		public StringLitContext pattern;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode CATALOGS() { return getToken(SqlBaseParser.CATALOGS, 0); }
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public ShowCatalogsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterShowCatalogs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitShowCatalogs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitShowCatalogs(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowCurrentNamespaceContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode CURRENT() { return getToken(SqlBaseParser.CURRENT, 0); }
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public ShowCurrentNamespaceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterShowCurrentNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitShowCurrentNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitShowCurrentNamespace(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RenameTablePartitionContext extends StatementContext {
		public PartitionSpecContext from;
		public PartitionSpecContext to;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public List<PartitionSpecContext> partitionSpec() {
			return getRuleContexts(PartitionSpecContext.class);
		}
		public PartitionSpecContext partitionSpec(int i) {
			return getRuleContext(PartitionSpecContext.class,i);
		}
		public RenameTablePartitionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterRenameTablePartition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitRenameTablePartition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitRenameTablePartition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RepairTableContext extends StatementContext {
		public Token option;
		public TerminalNode REPAIR() { return getToken(SqlBaseParser.REPAIR, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode MSCK() { return getToken(SqlBaseParser.MSCK, 0); }
		public TerminalNode PARTITIONS() { return getToken(SqlBaseParser.PARTITIONS, 0); }
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode SYNC() { return getToken(SqlBaseParser.SYNC, 0); }
		public RepairTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterRepairTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitRepairTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitRepairTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RefreshResourceContext extends StatementContext {
		public TerminalNode REFRESH() { return getToken(SqlBaseParser.REFRESH, 0); }
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public RefreshResourceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterRefreshResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitRefreshResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitRefreshResource(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowCreateTableContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TerminalNode SERDE() { return getToken(SqlBaseParser.SERDE, 0); }
		public ShowCreateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterShowCreateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitShowCreateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitShowCreateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowNamespacesContext extends StatementContext {
		public StringLitContext pattern;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public NamespacesContext namespaces() {
			return getRuleContext(NamespacesContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public ShowNamespacesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterShowNamespaces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitShowNamespaces(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitShowNamespaces(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowColumnsContext extends StatementContext {
		public MultipartIdentifierContext table;
		public MultipartIdentifierContext ns;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public List<TerminalNode> FROM() { return getTokens(SqlBaseParser.FROM); }
		public TerminalNode FROM(int i) {
			return getToken(SqlBaseParser.FROM, i);
		}
		public List<TerminalNode> IN() { return getTokens(SqlBaseParser.IN); }
		public TerminalNode IN(int i) {
			return getToken(SqlBaseParser.IN, i);
		}
		public List<MultipartIdentifierContext> multipartIdentifier() {
			return getRuleContexts(MultipartIdentifierContext.class);
		}
		public MultipartIdentifierContext multipartIdentifier(int i) {
			return getRuleContext(MultipartIdentifierContext.class,i);
		}
		public ShowColumnsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterShowColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitShowColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitShowColumns(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReplaceTableContext extends StatementContext {
		public ReplaceTableHeaderContext replaceTableHeader() {
			return getRuleContext(ReplaceTableHeaderContext.class,0);
		}
		public CreateTableClausesContext createTableClauses() {
			return getRuleContext(CreateTableClausesContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public CreateOrReplaceTableColTypeListContext createOrReplaceTableColTypeList() {
			return getRuleContext(CreateOrReplaceTableColTypeListContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public TableProviderContext tableProvider() {
			return getRuleContext(TableProviderContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public ReplaceTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterReplaceTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitReplaceTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitReplaceTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AnalyzeTablesContext extends StatementContext {
		public TerminalNode ANALYZE() { return getToken(SqlBaseParser.ANALYZE, 0); }
		public TerminalNode TABLES() { return getToken(SqlBaseParser.TABLES, 0); }
		public TerminalNode COMPUTE() { return getToken(SqlBaseParser.COMPUTE, 0); }
		public TerminalNode STATISTICS() { return getToken(SqlBaseParser.STATISTICS, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public AnalyzeTablesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterAnalyzeTables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitAnalyzeTables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitAnalyzeTables(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddTablePartitionContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public List<PartitionSpecLocationContext> partitionSpecLocation() {
			return getRuleContexts(PartitionSpecLocationContext.class);
		}
		public PartitionSpecLocationContext partitionSpecLocation(int i) {
			return getRuleContext(PartitionSpecLocationContext.class,i);
		}
		public AddTablePartitionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterAddTablePartition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitAddTablePartition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitAddTablePartition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetNamespaceLocationContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public SetNamespaceLocationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSetNamespaceLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSetNamespaceLocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitSetNamespaceLocation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RefreshTableContext extends StatementContext {
		public TerminalNode REFRESH() { return getToken(SqlBaseParser.REFRESH, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public RefreshTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterRefreshTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitRefreshTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitRefreshTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetNamespacePropertiesContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public PropertyListContext propertyList() {
			return getRuleContext(PropertyListContext.class,0);
		}
		public TerminalNode DBPROPERTIES() { return getToken(SqlBaseParser.DBPROPERTIES, 0); }
		public TerminalNode PROPERTIES() { return getToken(SqlBaseParser.PROPERTIES, 0); }
		public SetNamespacePropertiesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSetNamespaceProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSetNamespaceProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitSetNamespaceProperties(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ManageResourceContext extends StatementContext {
		public Token op;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode LIST() { return getToken(SqlBaseParser.LIST, 0); }
		public ManageResourceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterManageResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitManageResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitManageResource(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetQuotedConfigurationContext extends StatementContext {
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public ConfigKeyContext configKey() {
			return getRuleContext(ConfigKeyContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public ConfigValueContext configValue() {
			return getRuleContext(ConfigValueContext.class,0);
		}
		public SetQuotedConfigurationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSetQuotedConfiguration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSetQuotedConfiguration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitSetQuotedConfiguration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateFunctionContext extends StatementContext {
		public StringLitContext className;
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public CreateFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterCreateFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitCreateFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitCreateFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class HiveReplaceColumnsContext extends StatementContext {
		public MultipartIdentifierContext table;
		public QualifiedColTypeWithPositionListContext columns;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public QualifiedColTypeWithPositionListContext qualifiedColTypeWithPositionList() {
			return getRuleContext(QualifiedColTypeWithPositionListContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public HiveReplaceColumnsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterHiveReplaceColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitHiveReplaceColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitHiveReplaceColumns(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CommentNamespaceContext extends StatementContext {
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode IS() { return getToken(SqlBaseParser.IS, 0); }
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public CommentNamespaceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterCommentNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitCommentNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitCommentNamespace(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ResetQuotedConfigurationContext extends StatementContext {
		public TerminalNode RESET() { return getToken(SqlBaseParser.RESET, 0); }
		public ConfigKeyContext configKey() {
			return getRuleContext(ConfigKeyContext.class,0);
		}
		public ResetQuotedConfigurationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterResetQuotedConfiguration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitResetQuotedConfiguration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitResetQuotedConfiguration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateTableContext extends StatementContext {
		public CreateTableHeaderContext createTableHeader() {
			return getRuleContext(CreateTableHeaderContext.class,0);
		}
		public CreateTableClausesContext createTableClauses() {
			return getRuleContext(CreateTableClausesContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public CreateOrReplaceTableColTypeListContext createOrReplaceTableColTypeList() {
			return getRuleContext(CreateOrReplaceTableColTypeListContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public TableProviderContext tableProvider() {
			return getRuleContext(TableProviderContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public CreateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterCreateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitCreateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitCreateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DmlStatementContext extends StatementContext {
		public DmlStatementNoWithContext dmlStatementNoWith() {
			return getRuleContext(DmlStatementNoWithContext.class,0);
		}
		public CtesContext ctes() {
			return getRuleContext(CtesContext.class,0);
		}
		public DmlStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterDmlStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitDmlStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitDmlStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateTableLikeContext extends StatementContext {
		public TableIdentifierContext target;
		public TableIdentifierContext source;
		public PropertyListContext tableProps;
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public List<TableIdentifierContext> tableIdentifier() {
			return getRuleContexts(TableIdentifierContext.class);
		}
		public TableIdentifierContext tableIdentifier(int i) {
			return getRuleContext(TableIdentifierContext.class,i);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public List<TableProviderContext> tableProvider() {
			return getRuleContexts(TableProviderContext.class);
		}
		public TableProviderContext tableProvider(int i) {
			return getRuleContext(TableProviderContext.class,i);
		}
		public List<RowFormatContext> rowFormat() {
			return getRuleContexts(RowFormatContext.class);
		}
		public RowFormatContext rowFormat(int i) {
			return getRuleContext(RowFormatContext.class,i);
		}
		public List<CreateFileFormatContext> createFileFormat() {
			return getRuleContexts(CreateFileFormatContext.class);
		}
		public CreateFileFormatContext createFileFormat(int i) {
			return getRuleContext(CreateFileFormatContext.class,i);
		}
		public List<LocationSpecContext> locationSpec() {
			return getRuleContexts(LocationSpecContext.class);
		}
		public LocationSpecContext locationSpec(int i) {
			return getRuleContext(LocationSpecContext.class,i);
		}
		public List<TerminalNode> TBLPROPERTIES() { return getTokens(SqlBaseParser.TBLPROPERTIES); }
		public TerminalNode TBLPROPERTIES(int i) {
			return getToken(SqlBaseParser.TBLPROPERTIES, i);
		}
		public List<PropertyListContext> propertyList() {
			return getRuleContexts(PropertyListContext.class);
		}
		public PropertyListContext propertyList(int i) {
			return getRuleContext(PropertyListContext.class,i);
		}
		public CreateTableLikeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterCreateTableLike(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitCreateTableLike(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitCreateTableLike(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UncacheTableContext extends StatementContext {
		public TerminalNode UNCACHE() { return getToken(SqlBaseParser.UNCACHE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public UncacheTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterUncacheTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitUncacheTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitUncacheTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropFunctionContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public DropFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterDropFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitDropFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitDropFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescribeRelationContext extends StatementContext {
		public Token option;
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public DescribeColNameContext describeColName() {
			return getRuleContext(DescribeColNameContext.class,0);
		}
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public TerminalNode FORMATTED() { return getToken(SqlBaseParser.FORMATTED, 0); }
		public DescribeRelationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterDescribeRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitDescribeRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitDescribeRelation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LoadDataContext extends StatementContext {
		public StringLitContext path;
		public TerminalNode LOAD() { return getToken(SqlBaseParser.LOAD, 0); }
		public TerminalNode DATA() { return getToken(SqlBaseParser.DATA, 0); }
		public TerminalNode INPATH() { return getToken(SqlBaseParser.INPATH, 0); }
		public TerminalNode INTO() { return getToken(SqlBaseParser.INTO, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public TerminalNode LOCAL() { return getToken(SqlBaseParser.LOCAL, 0); }
		public TerminalNode OVERWRITE() { return getToken(SqlBaseParser.OVERWRITE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public LoadDataContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterLoadData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitLoadData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitLoadData(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowPartitionsContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode PARTITIONS() { return getToken(SqlBaseParser.PARTITIONS, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public ShowPartitionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterShowPartitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitShowPartitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitShowPartitions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescribeFunctionContext extends StatementContext {
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public DescribeFuncNameContext describeFuncName() {
			return getRuleContext(DescribeFuncNameContext.class,0);
		}
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public DescribeFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterDescribeFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitDescribeFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitDescribeFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RenameTableColumnContext extends StatementContext {
		public MultipartIdentifierContext table;
		public MultipartIdentifierContext from;
		public ErrorCapturingIdentifierContext to;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public List<MultipartIdentifierContext> multipartIdentifier() {
			return getRuleContexts(MultipartIdentifierContext.class);
		}
		public MultipartIdentifierContext multipartIdentifier(int i) {
			return getRuleContext(MultipartIdentifierContext.class,i);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public RenameTableColumnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterRenameTableColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitRenameTableColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitRenameTableColumn(this);
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
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterStatementDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitStatementDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitStatementDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class HiveChangeColumnContext extends StatementContext {
		public MultipartIdentifierContext table;
		public MultipartIdentifierContext colName;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode CHANGE() { return getToken(SqlBaseParser.CHANGE, 0); }
		public ColTypeContext colType() {
			return getRuleContext(ColTypeContext.class,0);
		}
		public List<MultipartIdentifierContext> multipartIdentifier() {
			return getRuleContexts(MultipartIdentifierContext.class);
		}
		public MultipartIdentifierContext multipartIdentifier(int i) {
			return getRuleContext(MultipartIdentifierContext.class,i);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public ColPositionContext colPosition() {
			return getRuleContext(ColPositionContext.class,0);
		}
		public HiveChangeColumnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterHiveChangeColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitHiveChangeColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitHiveChangeColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetTimeZoneContext extends StatementContext {
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode TIME() { return getToken(SqlBaseParser.TIME, 0); }
		public TerminalNode ZONE() { return getToken(SqlBaseParser.ZONE, 0); }
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public TimezoneContext timezone() {
			return getRuleContext(TimezoneContext.class,0);
		}
		public SetTimeZoneContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSetTimeZone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSetTimeZone(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitSetTimeZone(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescribeQueryContext extends StatementContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode QUERY() { return getToken(SqlBaseParser.QUERY, 0); }
		public DescribeQueryContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterDescribeQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitDescribeQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitDescribeQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TruncateTableContext extends StatementContext {
		public TerminalNode TRUNCATE() { return getToken(SqlBaseParser.TRUNCATE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TruncateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterTruncateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitTruncateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitTruncateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetTableSerDeContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode SERDE() { return getToken(SqlBaseParser.SERDE, 0); }
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SqlBaseParser.SERDEPROPERTIES, 0); }
		public PropertyListContext propertyList() {
			return getRuleContext(PropertyListContext.class,0);
		}
		public SetTableSerDeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSetTableSerDe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSetTableSerDe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitSetTableSerDe(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateViewContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public IdentifierCommentListContext identifierCommentList() {
			return getRuleContext(IdentifierCommentListContext.class,0);
		}
		public List<CommentSpecContext> commentSpec() {
			return getRuleContexts(CommentSpecContext.class);
		}
		public CommentSpecContext commentSpec(int i) {
			return getRuleContext(CommentSpecContext.class,i);
		}
		public List<TerminalNode> PARTITIONED() { return getTokens(SqlBaseParser.PARTITIONED); }
		public TerminalNode PARTITIONED(int i) {
			return getToken(SqlBaseParser.PARTITIONED, i);
		}
		public List<TerminalNode> ON() { return getTokens(SqlBaseParser.ON); }
		public TerminalNode ON(int i) {
			return getToken(SqlBaseParser.ON, i);
		}
		public List<IdentifierListContext> identifierList() {
			return getRuleContexts(IdentifierListContext.class);
		}
		public IdentifierListContext identifierList(int i) {
			return getRuleContext(IdentifierListContext.class,i);
		}
		public List<TerminalNode> TBLPROPERTIES() { return getTokens(SqlBaseParser.TBLPROPERTIES); }
		public TerminalNode TBLPROPERTIES(int i) {
			return getToken(SqlBaseParser.TBLPROPERTIES, i);
		}
		public List<PropertyListContext> propertyList() {
			return getRuleContexts(PropertyListContext.class);
		}
		public PropertyListContext propertyList(int i) {
			return getRuleContext(PropertyListContext.class,i);
		}
		public TerminalNode GLOBAL() { return getToken(SqlBaseParser.GLOBAL, 0); }
		public CreateViewContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterCreateView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitCreateView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitCreateView(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropTablePartitionsContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public List<PartitionSpecContext> partitionSpec() {
			return getRuleContexts(PartitionSpecContext.class);
		}
		public PartitionSpecContext partitionSpec(int i) {
			return getRuleContext(PartitionSpecContext.class,i);
		}
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public TerminalNode PURGE() { return getToken(SqlBaseParser.PURGE, 0); }
		public DropTablePartitionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterDropTablePartitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitDropTablePartitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitDropTablePartitions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetConfigurationContext extends StatementContext {
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public ConfigKeyContext configKey() {
			return getRuleContext(ConfigKeyContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public SetConfigurationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSetConfiguration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSetConfiguration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitSetConfiguration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropTableContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode PURGE() { return getToken(SqlBaseParser.PURGE, 0); }
		public DropTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterDropTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitDropTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitDropTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowTableExtendedContext extends StatementContext {
		public MultipartIdentifierContext ns;
		public StringLitContext pattern;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public ShowTableExtendedContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterShowTableExtended(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitShowTableExtended(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitShowTableExtended(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescribeNamespaceContext extends StatementContext {
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public DescribeNamespaceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterDescribeNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitDescribeNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitDescribeNamespace(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableAlterColumnContext extends StatementContext {
		public MultipartIdentifierContext table;
		public MultipartIdentifierContext column;
		public List<TerminalNode> ALTER() { return getTokens(SqlBaseParser.ALTER); }
		public TerminalNode ALTER(int i) {
			return getToken(SqlBaseParser.ALTER, i);
		}
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public List<MultipartIdentifierContext> multipartIdentifier() {
			return getRuleContexts(MultipartIdentifierContext.class);
		}
		public MultipartIdentifierContext multipartIdentifier(int i) {
			return getRuleContext(MultipartIdentifierContext.class,i);
		}
		public TerminalNode CHANGE() { return getToken(SqlBaseParser.CHANGE, 0); }
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public AlterColumnActionContext alterColumnAction() {
			return getRuleContext(AlterColumnActionContext.class,0);
		}
		public AlterTableAlterColumnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterAlterTableAlterColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitAlterTableAlterColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitAlterTableAlterColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AnalyzeStatementDefaultContext extends StatementContext {
		public TerminalNode ANALYZE() { return getToken(SqlBaseParser.ANALYZE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode COMPUTE() { return getToken(SqlBaseParser.COMPUTE, 0); }
		public TerminalNode STATISTICS() { return getToken(SqlBaseParser.STATISTICS, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public AnalyzeStatementDefaultContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterAnalyzeStatementDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitAnalyzeStatementDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitAnalyzeStatementDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RefreshFunctionContext extends StatementContext {
		public TerminalNode REFRESH() { return getToken(SqlBaseParser.REFRESH, 0); }
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public RefreshFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterRefreshFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitRefreshFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitRefreshFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CommentTableContext extends StatementContext {
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode IS() { return getToken(SqlBaseParser.IS, 0); }
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public CommentTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterCommentTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitCommentTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitCommentTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateIndexContext extends StatementContext {
		public IdentifierContext indexType;
		public MultipartIdentifierPropertyListContext columns;
		public PropertyListContext options;
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode INDEX() { return getToken(SqlBaseParser.INDEX, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public MultipartIdentifierPropertyListContext multipartIdentifierPropertyList() {
			return getRuleContext(MultipartIdentifierPropertyListContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public TerminalNode OPTIONS() { return getToken(SqlBaseParser.OPTIONS, 0); }
		public PropertyListContext propertyList() {
			return getRuleContext(PropertyListContext.class,0);
		}
		public CreateIndexContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterCreateIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitCreateIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitCreateIndex(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UseNamespaceContext extends StatementContext {
		public TerminalNode USE() { return getToken(SqlBaseParser.USE, 0); }
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public UseNamespaceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterUseNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitUseNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitUseNamespace(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateNamespaceContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public List<CommentSpecContext> commentSpec() {
			return getRuleContexts(CommentSpecContext.class);
		}
		public CommentSpecContext commentSpec(int i) {
			return getRuleContext(CommentSpecContext.class,i);
		}
		public List<LocationSpecContext> locationSpec() {
			return getRuleContexts(LocationSpecContext.class);
		}
		public LocationSpecContext locationSpec(int i) {
			return getRuleContext(LocationSpecContext.class,i);
		}
		public List<TerminalNode> WITH() { return getTokens(SqlBaseParser.WITH); }
		public TerminalNode WITH(int i) {
			return getToken(SqlBaseParser.WITH, i);
		}
		public List<PropertyListContext> propertyList() {
			return getRuleContexts(PropertyListContext.class);
		}
		public PropertyListContext propertyList(int i) {
			return getRuleContext(PropertyListContext.class,i);
		}
		public List<TerminalNode> DBPROPERTIES() { return getTokens(SqlBaseParser.DBPROPERTIES); }
		public TerminalNode DBPROPERTIES(int i) {
			return getToken(SqlBaseParser.DBPROPERTIES, i);
		}
		public List<TerminalNode> PROPERTIES() { return getTokens(SqlBaseParser.PROPERTIES); }
		public TerminalNode PROPERTIES(int i) {
			return getToken(SqlBaseParser.PROPERTIES, i);
		}
		public CreateNamespaceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterCreateNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitCreateNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitCreateNamespace(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowTblPropertiesContext extends StatementContext {
		public MultipartIdentifierContext table;
		public PropertyKeyContext key;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SqlBaseParser.TBLPROPERTIES, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public PropertyKeyContext propertyKey() {
			return getRuleContext(PropertyKeyContext.class,0);
		}
		public ShowTblPropertiesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterShowTblProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitShowTblProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitShowTblProperties(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnsetTablePropertiesContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode UNSET() { return getToken(SqlBaseParser.UNSET, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SqlBaseParser.TBLPROPERTIES, 0); }
		public PropertyListContext propertyList() {
			return getRuleContext(PropertyListContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public UnsetTablePropertiesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterUnsetTableProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitUnsetTableProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitUnsetTableProperties(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetTableLocationContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public SetTableLocationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSetTableLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSetTableLocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitSetTableLocation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropTableColumnsContext extends StatementContext {
		public MultipartIdentifierListContext columns;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public MultipartIdentifierListContext multipartIdentifierList() {
			return getRuleContext(MultipartIdentifierListContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public DropTableColumnsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterDropTableColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitDropTableColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitDropTableColumns(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowViewsContext extends StatementContext {
		public StringLitContext pattern;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode VIEWS() { return getToken(SqlBaseParser.VIEWS, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public ShowViewsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterShowViews(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitShowViews(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitShowViews(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowFunctionsContext extends StatementContext {
		public MultipartIdentifierContext ns;
		public MultipartIdentifierContext legacy;
		public StringLitContext pattern;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode FUNCTIONS() { return getToken(SqlBaseParser.FUNCTIONS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public List<MultipartIdentifierContext> multipartIdentifier() {
			return getRuleContexts(MultipartIdentifierContext.class);
		}
		public MultipartIdentifierContext multipartIdentifier(int i) {
			return getRuleContext(MultipartIdentifierContext.class,i);
		}
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public ShowFunctionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterShowFunctions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitShowFunctions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitShowFunctions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CacheTableContext extends StatementContext {
		public PropertyListContext options;
		public TerminalNode CACHE() { return getToken(SqlBaseParser.CACHE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode LAZY() { return getToken(SqlBaseParser.LAZY, 0); }
		public TerminalNode OPTIONS() { return getToken(SqlBaseParser.OPTIONS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public PropertyListContext propertyList() {
			return getRuleContext(PropertyListContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public CacheTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterCacheTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitCacheTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitCacheTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddTableColumnsContext extends StatementContext {
		public QualifiedColTypeWithPositionListContext columns;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public QualifiedColTypeWithPositionListContext qualifiedColTypeWithPositionList() {
			return getRuleContext(QualifiedColTypeWithPositionListContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public AddTableColumnsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterAddTableColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitAddTableColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitAddTableColumns(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetTablePropertiesContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SqlBaseParser.TBLPROPERTIES, 0); }
		public PropertyListContext propertyList() {
			return getRuleContext(PropertyListContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public SetTablePropertiesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSetTableProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSetTableProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitSetTableProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(1178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				_localctx = new StatementDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(375);
				query();
				}
				break;
			case 2:
				_localctx = new DmlStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(377);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(376);
					ctes();
					}
				}

				setState(379);
				dmlStatementNoWith();
				}
				break;
			case 3:
				_localctx = new UseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(380);
				match(USE);
				setState(381);
				multipartIdentifier();
				}
				break;
			case 4:
				_localctx = new UseNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(382);
				match(USE);
				setState(383);
				namespace();
				setState(384);
				multipartIdentifier();
				}
				break;
			case 5:
				_localctx = new SetCatalogContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(386);
				match(SET);
				setState(387);
				match(CATALOG);
				setState(390);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(388);
					identifier();
					}
					break;
				case 2:
					{
					setState(389);
					stringLit();
					}
					break;
				}
				}
				break;
			case 6:
				_localctx = new CreateNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(392);
				match(CREATE);
				setState(393);
				namespace();
				setState(397);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(394);
					match(IF);
					setState(395);
					match(NOT);
					setState(396);
					match(EXISTS);
					}
					break;
				}
				setState(399);
				multipartIdentifier();
				setState(407);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT || _la==LOCATION || _la==WITH) {
					{
					setState(405);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case COMMENT:
						{
						setState(400);
						commentSpec();
						}
						break;
					case LOCATION:
						{
						setState(401);
						locationSpec();
						}
						break;
					case WITH:
						{
						{
						setState(402);
						match(WITH);
						setState(403);
						_la = _input.LA(1);
						if ( !(_la==DBPROPERTIES || _la==PROPERTIES) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(404);
						propertyList();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(409);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 7:
				_localctx = new SetNamespacePropertiesContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(410);
				match(ALTER);
				setState(411);
				namespace();
				setState(412);
				multipartIdentifier();
				setState(413);
				match(SET);
				setState(414);
				_la = _input.LA(1);
				if ( !(_la==DBPROPERTIES || _la==PROPERTIES) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(415);
				propertyList();
				}
				break;
			case 8:
				_localctx = new SetNamespaceLocationContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(417);
				match(ALTER);
				setState(418);
				namespace();
				setState(419);
				multipartIdentifier();
				setState(420);
				match(SET);
				setState(421);
				locationSpec();
				}
				break;
			case 9:
				_localctx = new DropNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(423);
				match(DROP);
				setState(424);
				namespace();
				setState(427);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
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
				multipartIdentifier();
				setState(431);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CASCADE || _la==RESTRICT) {
					{
					setState(430);
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
			case 10:
				_localctx = new ShowNamespacesContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(433);
				match(SHOW);
				setState(434);
				namespaces();
				setState(437);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(435);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(436);
					multipartIdentifier();
					}
					break;
				}
				setState(443);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(440);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						setState(439);
						match(LIKE);
						}
						break;
					}
					setState(442);
					((ShowNamespacesContext)_localctx).pattern = stringLit();
					}
					break;
				}
				}
				break;
			case 11:
				_localctx = new CreateTableContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(445);
				createTableHeader();
				setState(450);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(446);
					match(LEFT_PAREN);
					setState(447);
					createOrReplaceTableColTypeList();
					setState(448);
					match(RIGHT_PAREN);
					}
					break;
				}
				setState(453);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(452);
					tableProvider();
					}
				}

				setState(455);
				createTableClauses();
				setState(460);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT_PAREN || _la==AS || _la==FROM || _la==MAP || ((((_la - 208)) & ~0x3f) == 0 && ((1L << (_la - 208)) & ((1L << (REDUCE - 208)) | (1L << (SELECT - 208)) | (1L << (TABLE - 208)))) != 0) || _la==VALUES || _la==WITH) {
					{
					setState(457);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(456);
						match(AS);
						}
					}

					setState(459);
					query();
					}
				}

				}
				break;
			case 12:
				_localctx = new CreateTableLikeContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(462);
				match(CREATE);
				setState(463);
				match(TABLE);
				setState(467);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(464);
					match(IF);
					setState(465);
					match(NOT);
					setState(466);
					match(EXISTS);
					}
					break;
				}
				setState(469);
				((CreateTableLikeContext)_localctx).target = tableIdentifier();
				setState(470);
				match(LIKE);
				setState(471);
				((CreateTableLikeContext)_localctx).source = tableIdentifier();
				setState(480);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOCATION || ((((_la - 225)) & ~0x3f) == 0 && ((1L << (_la - 225)) & ((1L << (ROW - 225)) | (1L << (STORED - 225)) | (1L << (TBLPROPERTIES - 225)))) != 0) || _la==USING) {
					{
					setState(478);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case USING:
						{
						setState(472);
						tableProvider();
						}
						break;
					case ROW:
						{
						setState(473);
						rowFormat();
						}
						break;
					case STORED:
						{
						setState(474);
						createFileFormat();
						}
						break;
					case LOCATION:
						{
						setState(475);
						locationSpec();
						}
						break;
					case TBLPROPERTIES:
						{
						{
						setState(476);
						match(TBLPROPERTIES);
						setState(477);
						((CreateTableLikeContext)_localctx).tableProps = propertyList();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(482);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 13:
				_localctx = new ReplaceTableContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(483);
				replaceTableHeader();
				setState(488);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(484);
					match(LEFT_PAREN);
					setState(485);
					createOrReplaceTableColTypeList();
					setState(486);
					match(RIGHT_PAREN);
					}
					break;
				}
				setState(491);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(490);
					tableProvider();
					}
				}

				setState(493);
				createTableClauses();
				setState(498);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT_PAREN || _la==AS || _la==FROM || _la==MAP || ((((_la - 208)) & ~0x3f) == 0 && ((1L << (_la - 208)) & ((1L << (REDUCE - 208)) | (1L << (SELECT - 208)) | (1L << (TABLE - 208)))) != 0) || _la==VALUES || _la==WITH) {
					{
					setState(495);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(494);
						match(AS);
						}
					}

					setState(497);
					query();
					}
				}

				}
				break;
			case 14:
				_localctx = new AnalyzeStatementDefaultContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(500);
				match(ANALYZE);
				setState(501);
				match(TABLE);
				setState(502);
				multipartIdentifier();
				setState(504);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(503);
					partitionSpec();
					}
				}

				setState(506);
				match(COMPUTE);
				setState(507);
				match(STATISTICS);
				setState(515);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(508);
					identifier();
					}
					break;
				case 2:
					{
					setState(509);
					match(FOR);
					setState(510);
					match(COLUMNS);
					setState(511);
					identifierSeq();
					}
					break;
				case 3:
					{
					setState(512);
					match(FOR);
					setState(513);
					match(ALL);
					setState(514);
					match(COLUMNS);
					}
					break;
				}
				}
				break;
			case 15:
				_localctx = new AnalyzeTablesContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(517);
				match(ANALYZE);
				setState(518);
				match(TABLES);
				setState(521);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(519);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(520);
					multipartIdentifier();
					}
				}

				setState(523);
				match(COMPUTE);
				setState(524);
				match(STATISTICS);
				setState(526);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(525);
					identifier();
					}
					break;
				}
				}
				break;
			case 16:
				_localctx = new AddTableColumnsContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(528);
				match(ALTER);
				setState(529);
				match(TABLE);
				setState(530);
				multipartIdentifier();
				setState(531);
				match(ADD);
				setState(532);
				_la = _input.LA(1);
				if ( !(_la==COLUMN || _la==COLUMNS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(533);
				((AddTableColumnsContext)_localctx).columns = qualifiedColTypeWithPositionList();
				}
				break;
			case 17:
				_localctx = new AddTableColumnsContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(535);
				match(ALTER);
				setState(536);
				match(TABLE);
				setState(537);
				multipartIdentifier();
				setState(538);
				match(ADD);
				setState(539);
				_la = _input.LA(1);
				if ( !(_la==COLUMN || _la==COLUMNS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(540);
				match(LEFT_PAREN);
				setState(541);
				((AddTableColumnsContext)_localctx).columns = qualifiedColTypeWithPositionList();
				setState(542);
				match(RIGHT_PAREN);
				}
				break;
			case 18:
				_localctx = new RenameTableColumnContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(544);
				match(ALTER);
				setState(545);
				match(TABLE);
				setState(546);
				((RenameTableColumnContext)_localctx).table = multipartIdentifier();
				setState(547);
				match(RENAME);
				setState(548);
				match(COLUMN);
				setState(549);
				((RenameTableColumnContext)_localctx).from = multipartIdentifier();
				setState(550);
				match(TO);
				setState(551);
				((RenameTableColumnContext)_localctx).to = errorCapturingIdentifier();
				}
				break;
			case 19:
				_localctx = new DropTableColumnsContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(553);
				match(ALTER);
				setState(554);
				match(TABLE);
				setState(555);
				multipartIdentifier();
				setState(556);
				match(DROP);
				setState(557);
				_la = _input.LA(1);
				if ( !(_la==COLUMN || _la==COLUMNS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(560);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(558);
					match(IF);
					setState(559);
					match(EXISTS);
					}
				}

				setState(562);
				match(LEFT_PAREN);
				setState(563);
				((DropTableColumnsContext)_localctx).columns = multipartIdentifierList();
				setState(564);
				match(RIGHT_PAREN);
				}
				break;
			case 20:
				_localctx = new DropTableColumnsContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(566);
				match(ALTER);
				setState(567);
				match(TABLE);
				setState(568);
				multipartIdentifier();
				setState(569);
				match(DROP);
				setState(570);
				_la = _input.LA(1);
				if ( !(_la==COLUMN || _la==COLUMNS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(573);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(571);
					match(IF);
					setState(572);
					match(EXISTS);
					}
					break;
				}
				setState(575);
				((DropTableColumnsContext)_localctx).columns = multipartIdentifierList();
				}
				break;
			case 21:
				_localctx = new RenameTableContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(577);
				match(ALTER);
				setState(578);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(579);
				((RenameTableContext)_localctx).from = multipartIdentifier();
				setState(580);
				match(RENAME);
				setState(581);
				match(TO);
				setState(582);
				((RenameTableContext)_localctx).to = multipartIdentifier();
				}
				break;
			case 22:
				_localctx = new SetTablePropertiesContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(584);
				match(ALTER);
				setState(585);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(586);
				multipartIdentifier();
				setState(587);
				match(SET);
				setState(588);
				match(TBLPROPERTIES);
				setState(589);
				propertyList();
				}
				break;
			case 23:
				_localctx = new UnsetTablePropertiesContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(591);
				match(ALTER);
				setState(592);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(593);
				multipartIdentifier();
				setState(594);
				match(UNSET);
				setState(595);
				match(TBLPROPERTIES);
				setState(598);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(596);
					match(IF);
					setState(597);
					match(EXISTS);
					}
				}

				setState(600);
				propertyList();
				}
				break;
			case 24:
				_localctx = new AlterTableAlterColumnContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(602);
				match(ALTER);
				setState(603);
				match(TABLE);
				setState(604);
				((AlterTableAlterColumnContext)_localctx).table = multipartIdentifier();
				setState(605);
				_la = _input.LA(1);
				if ( !(_la==ALTER || _la==CHANGE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(607);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(606);
					match(COLUMN);
					}
					break;
				}
				setState(609);
				((AlterTableAlterColumnContext)_localctx).column = multipartIdentifier();
				setState(611);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AFTER || _la==COMMENT || _la==DROP || _la==FIRST || _la==SET || _la==TYPE) {
					{
					setState(610);
					alterColumnAction();
					}
				}

				}
				break;
			case 25:
				_localctx = new HiveChangeColumnContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(613);
				match(ALTER);
				setState(614);
				match(TABLE);
				setState(615);
				((HiveChangeColumnContext)_localctx).table = multipartIdentifier();
				setState(617);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(616);
					partitionSpec();
					}
				}

				setState(619);
				match(CHANGE);
				setState(621);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(620);
					match(COLUMN);
					}
					break;
				}
				setState(623);
				((HiveChangeColumnContext)_localctx).colName = multipartIdentifier();
				setState(624);
				colType();
				setState(626);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AFTER || _la==FIRST) {
					{
					setState(625);
					colPosition();
					}
				}

				}
				break;
			case 26:
				_localctx = new HiveReplaceColumnsContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(628);
				match(ALTER);
				setState(629);
				match(TABLE);
				setState(630);
				((HiveReplaceColumnsContext)_localctx).table = multipartIdentifier();
				setState(632);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(631);
					partitionSpec();
					}
				}

				setState(634);
				match(REPLACE);
				setState(635);
				match(COLUMNS);
				setState(636);
				match(LEFT_PAREN);
				setState(637);
				((HiveReplaceColumnsContext)_localctx).columns = qualifiedColTypeWithPositionList();
				setState(638);
				match(RIGHT_PAREN);
				}
				break;
			case 27:
				_localctx = new SetTableSerDeContext(_localctx);
				enterOuterAlt(_localctx, 27);
				{
				setState(640);
				match(ALTER);
				setState(641);
				match(TABLE);
				setState(642);
				multipartIdentifier();
				setState(644);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(643);
					partitionSpec();
					}
				}

				setState(646);
				match(SET);
				setState(647);
				match(SERDE);
				setState(648);
				stringLit();
				setState(652);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(649);
					match(WITH);
					setState(650);
					match(SERDEPROPERTIES);
					setState(651);
					propertyList();
					}
				}

				}
				break;
			case 28:
				_localctx = new SetTableSerDeContext(_localctx);
				enterOuterAlt(_localctx, 28);
				{
				setState(654);
				match(ALTER);
				setState(655);
				match(TABLE);
				setState(656);
				multipartIdentifier();
				setState(658);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(657);
					partitionSpec();
					}
				}

				setState(660);
				match(SET);
				setState(661);
				match(SERDEPROPERTIES);
				setState(662);
				propertyList();
				}
				break;
			case 29:
				_localctx = new AddTablePartitionContext(_localctx);
				enterOuterAlt(_localctx, 29);
				{
				setState(664);
				match(ALTER);
				setState(665);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(666);
				multipartIdentifier();
				setState(667);
				match(ADD);
				setState(671);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(668);
					match(IF);
					setState(669);
					match(NOT);
					setState(670);
					match(EXISTS);
					}
				}

				setState(674); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(673);
					partitionSpecLocation();
					}
					}
					setState(676); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==PARTITION );
				}
				break;
			case 30:
				_localctx = new RenameTablePartitionContext(_localctx);
				enterOuterAlt(_localctx, 30);
				{
				setState(678);
				match(ALTER);
				setState(679);
				match(TABLE);
				setState(680);
				multipartIdentifier();
				setState(681);
				((RenameTablePartitionContext)_localctx).from = partitionSpec();
				setState(682);
				match(RENAME);
				setState(683);
				match(TO);
				setState(684);
				((RenameTablePartitionContext)_localctx).to = partitionSpec();
				}
				break;
			case 31:
				_localctx = new DropTablePartitionsContext(_localctx);
				enterOuterAlt(_localctx, 31);
				{
				setState(686);
				match(ALTER);
				setState(687);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(688);
				multipartIdentifier();
				setState(689);
				match(DROP);
				setState(692);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(690);
					match(IF);
					setState(691);
					match(EXISTS);
					}
				}

				setState(694);
				partitionSpec();
				setState(699);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(695);
					match(COMMA);
					setState(696);
					partitionSpec();
					}
					}
					setState(701);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(703);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PURGE) {
					{
					setState(702);
					match(PURGE);
					}
				}

				}
				break;
			case 32:
				_localctx = new SetTableLocationContext(_localctx);
				enterOuterAlt(_localctx, 32);
				{
				setState(705);
				match(ALTER);
				setState(706);
				match(TABLE);
				setState(707);
				multipartIdentifier();
				setState(709);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(708);
					partitionSpec();
					}
				}

				setState(711);
				match(SET);
				setState(712);
				locationSpec();
				}
				break;
			case 33:
				_localctx = new RecoverPartitionsContext(_localctx);
				enterOuterAlt(_localctx, 33);
				{
				setState(714);
				match(ALTER);
				setState(715);
				match(TABLE);
				setState(716);
				multipartIdentifier();
				setState(717);
				match(RECOVER);
				setState(718);
				match(PARTITIONS);
				}
				break;
			case 34:
				_localctx = new DropTableContext(_localctx);
				enterOuterAlt(_localctx, 34);
				{
				setState(720);
				match(DROP);
				setState(721);
				match(TABLE);
				setState(724);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(722);
					match(IF);
					setState(723);
					match(EXISTS);
					}
					break;
				}
				setState(726);
				multipartIdentifier();
				setState(728);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PURGE) {
					{
					setState(727);
					match(PURGE);
					}
				}

				}
				break;
			case 35:
				_localctx = new DropViewContext(_localctx);
				enterOuterAlt(_localctx, 35);
				{
				setState(730);
				match(DROP);
				setState(731);
				match(VIEW);
				setState(734);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(732);
					match(IF);
					setState(733);
					match(EXISTS);
					}
					break;
				}
				setState(736);
				multipartIdentifier();
				}
				break;
			case 36:
				_localctx = new CreateViewContext(_localctx);
				enterOuterAlt(_localctx, 36);
				{
				setState(737);
				match(CREATE);
				setState(740);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(738);
					match(OR);
					setState(739);
					match(REPLACE);
					}
				}

				setState(746);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GLOBAL || _la==TEMPORARY) {
					{
					setState(743);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==GLOBAL) {
						{
						setState(742);
						match(GLOBAL);
						}
					}

					setState(745);
					match(TEMPORARY);
					}
				}

				setState(748);
				match(VIEW);
				setState(752);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
				case 1:
					{
					setState(749);
					match(IF);
					setState(750);
					match(NOT);
					setState(751);
					match(EXISTS);
					}
					break;
				}
				setState(754);
				multipartIdentifier();
				setState(756);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT_PAREN) {
					{
					setState(755);
					identifierCommentList();
					}
				}

				setState(766);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT || _la==PARTITIONED || _la==TBLPROPERTIES) {
					{
					setState(764);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case COMMENT:
						{
						setState(758);
						commentSpec();
						}
						break;
					case PARTITIONED:
						{
						{
						setState(759);
						match(PARTITIONED);
						setState(760);
						match(ON);
						setState(761);
						identifierList();
						}
						}
						break;
					case TBLPROPERTIES:
						{
						{
						setState(762);
						match(TBLPROPERTIES);
						setState(763);
						propertyList();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(768);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(769);
				match(AS);
				setState(770);
				query();
				}
				break;
			case 37:
				_localctx = new CreateTempViewUsingContext(_localctx);
				enterOuterAlt(_localctx, 37);
				{
				setState(772);
				match(CREATE);
				setState(775);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(773);
					match(OR);
					setState(774);
					match(REPLACE);
					}
				}

				setState(778);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GLOBAL) {
					{
					setState(777);
					match(GLOBAL);
					}
				}

				setState(780);
				match(TEMPORARY);
				setState(781);
				match(VIEW);
				setState(782);
				tableIdentifier();
				setState(787);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT_PAREN) {
					{
					setState(783);
					match(LEFT_PAREN);
					setState(784);
					colTypeList();
					setState(785);
					match(RIGHT_PAREN);
					}
				}

				setState(789);
				tableProvider();
				setState(792);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(790);
					match(OPTIONS);
					setState(791);
					propertyList();
					}
				}

				}
				break;
			case 38:
				_localctx = new AlterViewQueryContext(_localctx);
				enterOuterAlt(_localctx, 38);
				{
				setState(794);
				match(ALTER);
				setState(795);
				match(VIEW);
				setState(796);
				multipartIdentifier();
				setState(798);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(797);
					match(AS);
					}
				}

				setState(800);
				query();
				}
				break;
			case 39:
				_localctx = new CreateFunctionContext(_localctx);
				enterOuterAlt(_localctx, 39);
				{
				setState(802);
				match(CREATE);
				setState(805);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(803);
					match(OR);
					setState(804);
					match(REPLACE);
					}
				}

				setState(808);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TEMPORARY) {
					{
					setState(807);
					match(TEMPORARY);
					}
				}

				setState(810);
				match(FUNCTION);
				setState(814);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
				case 1:
					{
					setState(811);
					match(IF);
					setState(812);
					match(NOT);
					setState(813);
					match(EXISTS);
					}
					break;
				}
				setState(816);
				multipartIdentifier();
				setState(817);
				match(AS);
				setState(818);
				((CreateFunctionContext)_localctx).className = stringLit();
				setState(828);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(819);
					match(USING);
					setState(820);
					resource();
					setState(825);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(821);
						match(COMMA);
						setState(822);
						resource();
						}
						}
						setState(827);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				break;
			case 40:
				_localctx = new DropFunctionContext(_localctx);
				enterOuterAlt(_localctx, 40);
				{
				setState(830);
				match(DROP);
				setState(832);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TEMPORARY) {
					{
					setState(831);
					match(TEMPORARY);
					}
				}

				setState(834);
				match(FUNCTION);
				setState(837);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
				case 1:
					{
					setState(835);
					match(IF);
					setState(836);
					match(EXISTS);
					}
					break;
				}
				setState(839);
				multipartIdentifier();
				}
				break;
			case 41:
				_localctx = new ExplainContext(_localctx);
				enterOuterAlt(_localctx, 41);
				{
				setState(840);
				match(EXPLAIN);
				setState(842);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CODEGEN || _la==COST || ((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & ((1L << (EXTENDED - 92)) | (1L << (FORMATTED - 92)) | (1L << (LOGICAL - 92)))) != 0)) {
					{
					setState(841);
					_la = _input.LA(1);
					if ( !(_la==CODEGEN || _la==COST || ((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & ((1L << (EXTENDED - 92)) | (1L << (FORMATTED - 92)) | (1L << (LOGICAL - 92)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(844);
				statement();
				}
				break;
			case 42:
				_localctx = new ShowTablesContext(_localctx);
				enterOuterAlt(_localctx, 42);
				{
				setState(845);
				match(SHOW);
				setState(846);
				match(TABLES);
				setState(849);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
				case 1:
					{
					setState(847);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(848);
					multipartIdentifier();
					}
					break;
				}
				setState(855);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
				case 1:
					{
					setState(852);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
					case 1:
						{
						setState(851);
						match(LIKE);
						}
						break;
					}
					setState(854);
					((ShowTablesContext)_localctx).pattern = stringLit();
					}
					break;
				}
				}
				break;
			case 43:
				_localctx = new ShowTableExtendedContext(_localctx);
				enterOuterAlt(_localctx, 43);
				{
				setState(857);
				match(SHOW);
				setState(858);
				match(TABLE);
				setState(859);
				match(EXTENDED);
				setState(862);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(860);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(861);
					((ShowTableExtendedContext)_localctx).ns = multipartIdentifier();
					}
				}

				setState(864);
				match(LIKE);
				setState(865);
				((ShowTableExtendedContext)_localctx).pattern = stringLit();
				setState(867);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(866);
					partitionSpec();
					}
				}

				}
				break;
			case 44:
				_localctx = new ShowTblPropertiesContext(_localctx);
				enterOuterAlt(_localctx, 44);
				{
				setState(869);
				match(SHOW);
				setState(870);
				match(TBLPROPERTIES);
				setState(871);
				((ShowTblPropertiesContext)_localctx).table = multipartIdentifier();
				setState(876);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT_PAREN) {
					{
					setState(872);
					match(LEFT_PAREN);
					setState(873);
					((ShowTblPropertiesContext)_localctx).key = propertyKey();
					setState(874);
					match(RIGHT_PAREN);
					}
				}

				}
				break;
			case 45:
				_localctx = new ShowColumnsContext(_localctx);
				enterOuterAlt(_localctx, 45);
				{
				setState(878);
				match(SHOW);
				setState(879);
				match(COLUMNS);
				setState(880);
				_la = _input.LA(1);
				if ( !(_la==FROM || _la==IN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(881);
				((ShowColumnsContext)_localctx).table = multipartIdentifier();
				setState(884);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(882);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(883);
					((ShowColumnsContext)_localctx).ns = multipartIdentifier();
					}
				}

				}
				break;
			case 46:
				_localctx = new ShowViewsContext(_localctx);
				enterOuterAlt(_localctx, 46);
				{
				setState(886);
				match(SHOW);
				setState(887);
				match(VIEWS);
				setState(890);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
				case 1:
					{
					setState(888);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(889);
					multipartIdentifier();
					}
					break;
				}
				setState(896);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
				case 1:
					{
					setState(893);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
					case 1:
						{
						setState(892);
						match(LIKE);
						}
						break;
					}
					setState(895);
					((ShowViewsContext)_localctx).pattern = stringLit();
					}
					break;
				}
				}
				break;
			case 47:
				_localctx = new ShowPartitionsContext(_localctx);
				enterOuterAlt(_localctx, 47);
				{
				setState(898);
				match(SHOW);
				setState(899);
				match(PARTITIONS);
				setState(900);
				multipartIdentifier();
				setState(902);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(901);
					partitionSpec();
					}
				}

				}
				break;
			case 48:
				_localctx = new ShowFunctionsContext(_localctx);
				enterOuterAlt(_localctx, 48);
				{
				setState(904);
				match(SHOW);
				setState(906);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
				case 1:
					{
					setState(905);
					identifier();
					}
					break;
				}
				setState(908);
				match(FUNCTIONS);
				setState(911);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
				case 1:
					{
					setState(909);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(910);
					((ShowFunctionsContext)_localctx).ns = multipartIdentifier();
					}
					break;
				}
				setState(920);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
				case 1:
					{
					setState(914);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
					case 1:
						{
						setState(913);
						match(LIKE);
						}
						break;
					}
					setState(918);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
					case 1:
						{
						setState(916);
						((ShowFunctionsContext)_localctx).legacy = multipartIdentifier();
						}
						break;
					case 2:
						{
						setState(917);
						((ShowFunctionsContext)_localctx).pattern = stringLit();
						}
						break;
					}
					}
					break;
				}
				}
				break;
			case 49:
				_localctx = new ShowCreateTableContext(_localctx);
				enterOuterAlt(_localctx, 49);
				{
				setState(922);
				match(SHOW);
				setState(923);
				match(CREATE);
				setState(924);
				match(TABLE);
				setState(925);
				multipartIdentifier();
				setState(928);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(926);
					match(AS);
					setState(927);
					match(SERDE);
					}
				}

				}
				break;
			case 50:
				_localctx = new ShowCurrentNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 50);
				{
				setState(930);
				match(SHOW);
				setState(931);
				match(CURRENT);
				setState(932);
				namespace();
				}
				break;
			case 51:
				_localctx = new ShowCatalogsContext(_localctx);
				enterOuterAlt(_localctx, 51);
				{
				setState(933);
				match(SHOW);
				setState(934);
				match(CATALOGS);
				setState(939);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
				case 1:
					{
					setState(936);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
					case 1:
						{
						setState(935);
						match(LIKE);
						}
						break;
					}
					setState(938);
					((ShowCatalogsContext)_localctx).pattern = stringLit();
					}
					break;
				}
				}
				break;
			case 52:
				_localctx = new DescribeFunctionContext(_localctx);
				enterOuterAlt(_localctx, 52);
				{
				setState(941);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(942);
				match(FUNCTION);
				setState(944);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
				case 1:
					{
					setState(943);
					match(EXTENDED);
					}
					break;
				}
				setState(946);
				describeFuncName();
				}
				break;
			case 53:
				_localctx = new DescribeNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 53);
				{
				setState(947);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(948);
				namespace();
				setState(950);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
				case 1:
					{
					setState(949);
					match(EXTENDED);
					}
					break;
				}
				setState(952);
				multipartIdentifier();
				}
				break;
			case 54:
				_localctx = new DescribeRelationContext(_localctx);
				enterOuterAlt(_localctx, 54);
				{
				setState(954);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(956);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
				case 1:
					{
					setState(955);
					match(TABLE);
					}
					break;
				}
				setState(959);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
				case 1:
					{
					setState(958);
					((DescribeRelationContext)_localctx).option = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==EXTENDED || _la==FORMATTED) ) {
						((DescribeRelationContext)_localctx).option = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(961);
				multipartIdentifier();
				setState(963);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
				case 1:
					{
					setState(962);
					partitionSpec();
					}
					break;
				}
				setState(966);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
				case 1:
					{
					setState(965);
					describeColName();
					}
					break;
				}
				}
				break;
			case 55:
				_localctx = new DescribeQueryContext(_localctx);
				enterOuterAlt(_localctx, 55);
				{
				setState(968);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(970);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QUERY) {
					{
					setState(969);
					match(QUERY);
					}
				}

				setState(972);
				query();
				}
				break;
			case 56:
				_localctx = new CommentNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 56);
				{
				setState(973);
				match(COMMENT);
				setState(974);
				match(ON);
				setState(975);
				namespace();
				setState(976);
				multipartIdentifier();
				setState(977);
				match(IS);
				setState(978);
				comment();
				}
				break;
			case 57:
				_localctx = new CommentTableContext(_localctx);
				enterOuterAlt(_localctx, 57);
				{
				setState(980);
				match(COMMENT);
				setState(981);
				match(ON);
				setState(982);
				match(TABLE);
				setState(983);
				multipartIdentifier();
				setState(984);
				match(IS);
				setState(985);
				comment();
				}
				break;
			case 58:
				_localctx = new RefreshTableContext(_localctx);
				enterOuterAlt(_localctx, 58);
				{
				setState(987);
				match(REFRESH);
				setState(988);
				match(TABLE);
				setState(989);
				multipartIdentifier();
				}
				break;
			case 59:
				_localctx = new RefreshFunctionContext(_localctx);
				enterOuterAlt(_localctx, 59);
				{
				setState(990);
				match(REFRESH);
				setState(991);
				match(FUNCTION);
				setState(992);
				multipartIdentifier();
				}
				break;
			case 60:
				_localctx = new RefreshResourceContext(_localctx);
				enterOuterAlt(_localctx, 60);
				{
				setState(993);
				match(REFRESH);
				setState(1001);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
				case 1:
					{
					setState(994);
					stringLit();
					}
					break;
				case 2:
					{
					setState(998);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
					while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1+1 ) {
							{
							{
							setState(995);
							matchWildcard();
							}
							} 
						}
						setState(1000);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
					}
					}
					break;
				}
				}
				break;
			case 61:
				_localctx = new CacheTableContext(_localctx);
				enterOuterAlt(_localctx, 61);
				{
				setState(1003);
				match(CACHE);
				setState(1005);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LAZY) {
					{
					setState(1004);
					match(LAZY);
					}
				}

				setState(1007);
				match(TABLE);
				setState(1008);
				multipartIdentifier();
				setState(1011);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(1009);
					match(OPTIONS);
					setState(1010);
					((CacheTableContext)_localctx).options = propertyList();
					}
				}

				setState(1017);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT_PAREN || _la==AS || _la==FROM || _la==MAP || ((((_la - 208)) & ~0x3f) == 0 && ((1L << (_la - 208)) & ((1L << (REDUCE - 208)) | (1L << (SELECT - 208)) | (1L << (TABLE - 208)))) != 0) || _la==VALUES || _la==WITH) {
					{
					setState(1014);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(1013);
						match(AS);
						}
					}

					setState(1016);
					query();
					}
				}

				}
				break;
			case 62:
				_localctx = new UncacheTableContext(_localctx);
				enterOuterAlt(_localctx, 62);
				{
				setState(1019);
				match(UNCACHE);
				setState(1020);
				match(TABLE);
				setState(1023);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
				case 1:
					{
					setState(1021);
					match(IF);
					setState(1022);
					match(EXISTS);
					}
					break;
				}
				setState(1025);
				multipartIdentifier();
				}
				break;
			case 63:
				_localctx = new ClearCacheContext(_localctx);
				enterOuterAlt(_localctx, 63);
				{
				setState(1026);
				match(CLEAR);
				setState(1027);
				match(CACHE);
				}
				break;
			case 64:
				_localctx = new LoadDataContext(_localctx);
				enterOuterAlt(_localctx, 64);
				{
				setState(1028);
				match(LOAD);
				setState(1029);
				match(DATA);
				setState(1031);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCAL) {
					{
					setState(1030);
					match(LOCAL);
					}
				}

				setState(1033);
				match(INPATH);
				setState(1034);
				((LoadDataContext)_localctx).path = stringLit();
				setState(1036);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OVERWRITE) {
					{
					setState(1035);
					match(OVERWRITE);
					}
				}

				setState(1038);
				match(INTO);
				setState(1039);
				match(TABLE);
				setState(1040);
				multipartIdentifier();
				setState(1042);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1041);
					partitionSpec();
					}
				}

				}
				break;
			case 65:
				_localctx = new TruncateTableContext(_localctx);
				enterOuterAlt(_localctx, 65);
				{
				setState(1044);
				match(TRUNCATE);
				setState(1045);
				match(TABLE);
				setState(1046);
				multipartIdentifier();
				setState(1048);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1047);
					partitionSpec();
					}
				}

				}
				break;
			case 66:
				_localctx = new RepairTableContext(_localctx);
				enterOuterAlt(_localctx, 66);
				{
				setState(1051);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MSCK) {
					{
					setState(1050);
					match(MSCK);
					}
				}

				setState(1053);
				match(REPAIR);
				setState(1054);
				match(TABLE);
				setState(1055);
				multipartIdentifier();
				setState(1058);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ADD || _la==DROP || _la==SYNC) {
					{
					setState(1056);
					((RepairTableContext)_localctx).option = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==ADD || _la==DROP || _la==SYNC) ) {
						((RepairTableContext)_localctx).option = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1057);
					match(PARTITIONS);
					}
				}

				}
				break;
			case 67:
				_localctx = new ManageResourceContext(_localctx);
				enterOuterAlt(_localctx, 67);
				{
				setState(1060);
				((ManageResourceContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==LIST) ) {
					((ManageResourceContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1061);
				identifier();
				setState(1065);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(1062);
						matchWildcard();
						}
						} 
					}
					setState(1067);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
				}
				}
				break;
			case 68:
				_localctx = new FailNativeCommandContext(_localctx);
				enterOuterAlt(_localctx, 68);
				{
				setState(1068);
				match(SET);
				setState(1069);
				match(ROLE);
				setState(1073);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(1070);
						matchWildcard();
						}
						} 
					}
					setState(1075);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
				}
				}
				break;
			case 69:
				_localctx = new SetTimeZoneContext(_localctx);
				enterOuterAlt(_localctx, 69);
				{
				setState(1076);
				match(SET);
				setState(1077);
				match(TIME);
				setState(1078);
				match(ZONE);
				setState(1079);
				interval();
				}
				break;
			case 70:
				_localctx = new SetTimeZoneContext(_localctx);
				enterOuterAlt(_localctx, 70);
				{
				setState(1080);
				match(SET);
				setState(1081);
				match(TIME);
				setState(1082);
				match(ZONE);
				setState(1083);
				timezone();
				}
				break;
			case 71:
				_localctx = new SetTimeZoneContext(_localctx);
				enterOuterAlt(_localctx, 71);
				{
				setState(1084);
				match(SET);
				setState(1085);
				match(TIME);
				setState(1086);
				match(ZONE);
				setState(1090);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(1087);
						matchWildcard();
						}
						} 
					}
					setState(1092);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
				}
				}
				break;
			case 72:
				_localctx = new SetQuotedConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 72);
				{
				setState(1093);
				match(SET);
				setState(1094);
				configKey();
				setState(1095);
				match(EQ);
				setState(1096);
				configValue();
				}
				break;
			case 73:
				_localctx = new SetConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 73);
				{
				setState(1098);
				match(SET);
				setState(1099);
				configKey();
				setState(1107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ) {
					{
					setState(1100);
					match(EQ);
					setState(1104);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
					while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1+1 ) {
							{
							{
							setState(1101);
							matchWildcard();
							}
							} 
						}
						setState(1106);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
					}
					}
				}

				}
				break;
			case 74:
				_localctx = new SetQuotedConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 74);
				{
				setState(1109);
				match(SET);
				setState(1113);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(1110);
						matchWildcard();
						}
						} 
					}
					setState(1115);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
				}
				setState(1116);
				match(EQ);
				setState(1117);
				configValue();
				}
				break;
			case 75:
				_localctx = new SetConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 75);
				{
				setState(1118);
				match(SET);
				setState(1122);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(1119);
						matchWildcard();
						}
						} 
					}
					setState(1124);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
				}
				}
				break;
			case 76:
				_localctx = new ResetQuotedConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 76);
				{
				setState(1125);
				match(RESET);
				setState(1126);
				configKey();
				}
				break;
			case 77:
				_localctx = new ResetConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 77);
				{
				setState(1127);
				match(RESET);
				setState(1131);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(1128);
						matchWildcard();
						}
						} 
					}
					setState(1133);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
				}
				}
				break;
			case 78:
				_localctx = new CreateIndexContext(_localctx);
				enterOuterAlt(_localctx, 78);
				{
				setState(1134);
				match(CREATE);
				setState(1135);
				match(INDEX);
				setState(1139);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
				case 1:
					{
					setState(1136);
					match(IF);
					setState(1137);
					match(NOT);
					setState(1138);
					match(EXISTS);
					}
					break;
				}
				setState(1141);
				identifier();
				setState(1142);
				match(ON);
				setState(1144);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
				case 1:
					{
					setState(1143);
					match(TABLE);
					}
					break;
				}
				setState(1146);
				multipartIdentifier();
				setState(1149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(1147);
					match(USING);
					setState(1148);
					((CreateIndexContext)_localctx).indexType = identifier();
					}
				}

				setState(1151);
				match(LEFT_PAREN);
				setState(1152);
				((CreateIndexContext)_localctx).columns = multipartIdentifierPropertyList();
				setState(1153);
				match(RIGHT_PAREN);
				setState(1156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(1154);
					match(OPTIONS);
					setState(1155);
					((CreateIndexContext)_localctx).options = propertyList();
					}
				}

				}
				break;
			case 79:
				_localctx = new DropIndexContext(_localctx);
				enterOuterAlt(_localctx, 79);
				{
				setState(1158);
				match(DROP);
				setState(1159);
				match(INDEX);
				setState(1162);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
				case 1:
					{
					setState(1160);
					match(IF);
					setState(1161);
					match(EXISTS);
					}
					break;
				}
				setState(1164);
				identifier();
				setState(1165);
				match(ON);
				setState(1167);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
				case 1:
					{
					setState(1166);
					match(TABLE);
					}
					break;
				}
				setState(1169);
				multipartIdentifier();
				}
				break;
			case 80:
				_localctx = new FailNativeCommandContext(_localctx);
				enterOuterAlt(_localctx, 80);
				{
				setState(1171);
				unsupportedHiveNativeCommands();
				setState(1175);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(1172);
						matchWildcard();
						}
						} 
					}
					setState(1177);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
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

	public static class TimezoneContext extends ParserRuleContext {
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public TerminalNode LOCAL() { return getToken(SqlBaseParser.LOCAL, 0); }
		public TimezoneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timezone; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterTimezone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitTimezone(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitTimezone(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimezoneContext timezone() throws RecognitionException {
		TimezoneContext _localctx = new TimezoneContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_timezone);
		try {
			setState(1182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1180);
				stringLit();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1181);
				match(LOCAL);
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

	public static class ConfigKeyContext extends ParserRuleContext {
		public QuotedIdentifierContext quotedIdentifier() {
			return getRuleContext(QuotedIdentifierContext.class,0);
		}
		public ConfigKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_configKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterConfigKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitConfigKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitConfigKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConfigKeyContext configKey() throws RecognitionException {
		ConfigKeyContext _localctx = new ConfigKeyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_configKey);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1184);
			quotedIdentifier();
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

	public static class ConfigValueContext extends ParserRuleContext {
		public BackQuotedIdentifierContext backQuotedIdentifier() {
			return getRuleContext(BackQuotedIdentifierContext.class,0);
		}
		public ConfigValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_configValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterConfigValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitConfigValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitConfigValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConfigValueContext configValue() throws RecognitionException {
		ConfigValueContext _localctx = new ConfigValueContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_configValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1186);
			backQuotedIdentifier();
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

	public static class UnsupportedHiveNativeCommandsContext extends ParserRuleContext {
		public Token kw1;
		public Token kw2;
		public Token kw3;
		public Token kw4;
		public Token kw5;
		public Token kw6;
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode ROLE() { return getToken(SqlBaseParser.ROLE, 0); }
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode GRANT() { return getToken(SqlBaseParser.GRANT, 0); }
		public TerminalNode REVOKE() { return getToken(SqlBaseParser.REVOKE, 0); }
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode PRINCIPALS() { return getToken(SqlBaseParser.PRINCIPALS, 0); }
		public TerminalNode ROLES() { return getToken(SqlBaseParser.ROLES, 0); }
		public TerminalNode CURRENT() { return getToken(SqlBaseParser.CURRENT, 0); }
		public TerminalNode EXPORT() { return getToken(SqlBaseParser.EXPORT, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode IMPORT() { return getToken(SqlBaseParser.IMPORT, 0); }
		public TerminalNode COMPACTIONS() { return getToken(SqlBaseParser.COMPACTIONS, 0); }
		public TerminalNode TRANSACTIONS() { return getToken(SqlBaseParser.TRANSACTIONS, 0); }
		public TerminalNode INDEXES() { return getToken(SqlBaseParser.INDEXES, 0); }
		public TerminalNode LOCKS() { return getToken(SqlBaseParser.LOCKS, 0); }
		public TerminalNode INDEX() { return getToken(SqlBaseParser.INDEX, 0); }
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode LOCK() { return getToken(SqlBaseParser.LOCK, 0); }
		public TerminalNode DATABASE() { return getToken(SqlBaseParser.DATABASE, 0); }
		public TerminalNode UNLOCK() { return getToken(SqlBaseParser.UNLOCK, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode MACRO() { return getToken(SqlBaseParser.MACRO, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode CLUSTERED() { return getToken(SqlBaseParser.CLUSTERED, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public TerminalNode SORTED() { return getToken(SqlBaseParser.SORTED, 0); }
		public TerminalNode SKEWED() { return getToken(SqlBaseParser.SKEWED, 0); }
		public TerminalNode STORED() { return getToken(SqlBaseParser.STORED, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TerminalNode DIRECTORIES() { return getToken(SqlBaseParser.DIRECTORIES, 0); }
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode LOCATION() { return getToken(SqlBaseParser.LOCATION, 0); }
		public TerminalNode EXCHANGE() { return getToken(SqlBaseParser.EXCHANGE, 0); }
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public TerminalNode ARCHIVE() { return getToken(SqlBaseParser.ARCHIVE, 0); }
		public TerminalNode UNARCHIVE() { return getToken(SqlBaseParser.UNARCHIVE, 0); }
		public TerminalNode TOUCH() { return getToken(SqlBaseParser.TOUCH, 0); }
		public TerminalNode COMPACT() { return getToken(SqlBaseParser.COMPACT, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode CONCATENATE() { return getToken(SqlBaseParser.CONCATENATE, 0); }
		public TerminalNode FILEFORMAT() { return getToken(SqlBaseParser.FILEFORMAT, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public TerminalNode START() { return getToken(SqlBaseParser.START, 0); }
		public TerminalNode TRANSACTION() { return getToken(SqlBaseParser.TRANSACTION, 0); }
		public TerminalNode COMMIT() { return getToken(SqlBaseParser.COMMIT, 0); }
		public TerminalNode ROLLBACK() { return getToken(SqlBaseParser.ROLLBACK, 0); }
		public TerminalNode DFS() { return getToken(SqlBaseParser.DFS, 0); }
		public UnsupportedHiveNativeCommandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsupportedHiveNativeCommands; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterUnsupportedHiveNativeCommands(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitUnsupportedHiveNativeCommands(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitUnsupportedHiveNativeCommands(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnsupportedHiveNativeCommandsContext unsupportedHiveNativeCommands() throws RecognitionException {
		UnsupportedHiveNativeCommandsContext _localctx = new UnsupportedHiveNativeCommandsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_unsupportedHiveNativeCommands);
		int _la;
		try {
			setState(1356);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1188);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(1189);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1190);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(1191);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1192);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(GRANT);
				setState(1194);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
				case 1:
					{
					setState(1193);
					((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1196);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(REVOKE);
				setState(1198);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
				case 1:
					{
					setState(1197);
					((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1200);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1201);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(GRANT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1202);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1203);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				setState(1205);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
				case 1:
					{
					setState(1204);
					((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(GRANT);
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1207);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1208);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(PRINCIPALS);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1209);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1210);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLES);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1211);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1212);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(CURRENT);
				setState(1213);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(ROLES);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1214);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(EXPORT);
				setState(1215);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1216);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(IMPORT);
				setState(1217);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1218);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1219);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(COMPACTIONS);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1220);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1221);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(CREATE);
				setState(1222);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(TABLE);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1223);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1224);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TRANSACTIONS);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1225);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1226);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEXES);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1227);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1228);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(LOCKS);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1229);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(1230);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1231);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(1232);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1233);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1234);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(1235);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(LOCK);
				setState(1236);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(1237);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(LOCK);
				setState(1238);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(DATABASE);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(1239);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(UNLOCK);
				setState(1240);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(1241);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(UNLOCK);
				setState(1242);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(DATABASE);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(1243);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(1244);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TEMPORARY);
				setState(1245);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(MACRO);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(1246);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(1247);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TEMPORARY);
				setState(1248);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(MACRO);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(1249);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1250);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1251);
				tableIdentifier();
				setState(1252);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(1253);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(CLUSTERED);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(1255);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1256);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1257);
				tableIdentifier();
				setState(1258);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(CLUSTERED);
				setState(1259);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(BY);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(1261);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1262);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1263);
				tableIdentifier();
				setState(1264);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(1265);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SORTED);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(1267);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1268);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1269);
				tableIdentifier();
				setState(1270);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SKEWED);
				setState(1271);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(BY);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(1273);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1274);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1275);
				tableIdentifier();
				setState(1276);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(1277);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SKEWED);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(1279);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1280);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1281);
				tableIdentifier();
				setState(1282);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(1283);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(STORED);
				setState(1284);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw5 = match(AS);
				setState(1285);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw6 = match(DIRECTORIES);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(1287);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1288);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1289);
				tableIdentifier();
				setState(1290);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SET);
				setState(1291);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SKEWED);
				setState(1292);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw5 = match(LOCATION);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(1294);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1295);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1296);
				tableIdentifier();
				setState(1297);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(EXCHANGE);
				setState(1298);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(1300);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1301);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1302);
				tableIdentifier();
				setState(1303);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(ARCHIVE);
				setState(1304);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(1306);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1307);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1308);
				tableIdentifier();
				setState(1309);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(UNARCHIVE);
				setState(1310);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(1312);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1313);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1314);
				tableIdentifier();
				setState(1315);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(TOUCH);
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(1317);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1318);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1319);
				tableIdentifier();
				setState(1321);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1320);
					partitionSpec();
					}
				}

				setState(1323);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(COMPACT);
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(1325);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1326);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1327);
				tableIdentifier();
				setState(1329);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1328);
					partitionSpec();
					}
				}

				setState(1331);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(CONCATENATE);
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(1333);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1334);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1335);
				tableIdentifier();
				setState(1337);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1336);
					partitionSpec();
					}
				}

				setState(1339);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SET);
				setState(1340);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(FILEFORMAT);
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(1342);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1343);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1344);
				tableIdentifier();
				setState(1346);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1345);
					partitionSpec();
					}
				}

				setState(1348);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(REPLACE);
				setState(1349);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(COLUMNS);
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(1351);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(START);
				setState(1352);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TRANSACTION);
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(1353);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(COMMIT);
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(1354);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ROLLBACK);
				}
				break;
			case 44:
				enterOuterAlt(_localctx, 44);
				{
				setState(1355);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DFS);
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

	public static class CreateTableHeaderContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode EXTERNAL() { return getToken(SqlBaseParser.EXTERNAL, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public CreateTableHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterCreateTableHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitCreateTableHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitCreateTableHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTableHeaderContext createTableHeader() throws RecognitionException {
		CreateTableHeaderContext _localctx = new CreateTableHeaderContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_createTableHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1358);
			match(CREATE);
			setState(1360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TEMPORARY) {
				{
				setState(1359);
				match(TEMPORARY);
				}
			}

			setState(1363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTERNAL) {
				{
				setState(1362);
				match(EXTERNAL);
				}
			}

			setState(1365);
			match(TABLE);
			setState(1369);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				{
				setState(1366);
				match(IF);
				setState(1367);
				match(NOT);
				setState(1368);
				match(EXISTS);
				}
				break;
			}
			setState(1371);
			multipartIdentifier();
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

	public static class ReplaceTableHeaderContext extends ParserRuleContext {
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public ReplaceTableHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_replaceTableHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterReplaceTableHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitReplaceTableHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitReplaceTableHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReplaceTableHeaderContext replaceTableHeader() throws RecognitionException {
		ReplaceTableHeaderContext _localctx = new ReplaceTableHeaderContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_replaceTableHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CREATE) {
				{
				setState(1373);
				match(CREATE);
				setState(1374);
				match(OR);
				}
			}

			setState(1377);
			match(REPLACE);
			setState(1378);
			match(TABLE);
			setState(1379);
			multipartIdentifier();
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

	public static class BucketSpecContext extends ParserRuleContext {
		public TerminalNode CLUSTERED() { return getToken(SqlBaseParser.CLUSTERED, 0); }
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode INTO() { return getToken(SqlBaseParser.INTO, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode BUCKETS() { return getToken(SqlBaseParser.BUCKETS, 0); }
		public TerminalNode SORTED() { return getToken(SqlBaseParser.SORTED, 0); }
		public OrderedIdentifierListContext orderedIdentifierList() {
			return getRuleContext(OrderedIdentifierListContext.class,0);
		}
		public BucketSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bucketSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterBucketSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitBucketSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitBucketSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BucketSpecContext bucketSpec() throws RecognitionException {
		BucketSpecContext _localctx = new BucketSpecContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_bucketSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1381);
			match(CLUSTERED);
			setState(1382);
			match(BY);
			setState(1383);
			identifierList();
			setState(1387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SORTED) {
				{
				setState(1384);
				match(SORTED);
				setState(1385);
				match(BY);
				setState(1386);
				orderedIdentifierList();
				}
			}

			setState(1389);
			match(INTO);
			setState(1390);
			match(INTEGER_VALUE);
			setState(1391);
			match(BUCKETS);
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

	public static class SkewSpecContext extends ParserRuleContext {
		public TerminalNode SKEWED() { return getToken(SqlBaseParser.SKEWED, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public ConstantListContext constantList() {
			return getRuleContext(ConstantListContext.class,0);
		}
		public NestedConstantListContext nestedConstantList() {
			return getRuleContext(NestedConstantListContext.class,0);
		}
		public TerminalNode STORED() { return getToken(SqlBaseParser.STORED, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TerminalNode DIRECTORIES() { return getToken(SqlBaseParser.DIRECTORIES, 0); }
		public SkewSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skewSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSkewSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSkewSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitSkewSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SkewSpecContext skewSpec() throws RecognitionException {
		SkewSpecContext _localctx = new SkewSpecContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_skewSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1393);
			match(SKEWED);
			setState(1394);
			match(BY);
			setState(1395);
			identifierList();
			setState(1396);
			match(ON);
			setState(1399);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				{
				setState(1397);
				constantList();
				}
				break;
			case 2:
				{
				setState(1398);
				nestedConstantList();
				}
				break;
			}
			setState(1404);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				{
				setState(1401);
				match(STORED);
				setState(1402);
				match(AS);
				setState(1403);
				match(DIRECTORIES);
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

	public static class LocationSpecContext extends ParserRuleContext {
		public TerminalNode LOCATION() { return getToken(SqlBaseParser.LOCATION, 0); }
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public LocationSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_locationSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterLocationSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitLocationSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitLocationSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocationSpecContext locationSpec() throws RecognitionException {
		LocationSpecContext _localctx = new LocationSpecContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_locationSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1406);
			match(LOCATION);
			setState(1407);
			stringLit();
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

	public static class CommentSpecContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public CommentSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commentSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterCommentSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitCommentSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitCommentSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentSpecContext commentSpec() throws RecognitionException {
		CommentSpecContext _localctx = new CommentSpecContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_commentSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1409);
			match(COMMENT);
			setState(1410);
			stringLit();
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
		public QueryTermContext queryTerm() {
			return getRuleContext(QueryTermContext.class,0);
		}
		public QueryOrganizationContext queryOrganization() {
			return getRuleContext(QueryOrganizationContext.class,0);
		}
		public CtesContext ctes() {
			return getRuleContext(CtesContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1412);
				ctes();
				}
			}

			setState(1415);
			queryTerm(0);
			setState(1416);
			queryOrganization();
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

	public static class InsertIntoContext extends ParserRuleContext {
		public InsertIntoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertInto; }
	 
		public InsertIntoContext() { }
		public void copyFrom(InsertIntoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InsertIntoReplaceWhereContext extends InsertIntoContext {
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(SqlBaseParser.INTO, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public InsertIntoReplaceWhereContext(InsertIntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterInsertIntoReplaceWhere(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitInsertIntoReplaceWhere(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitInsertIntoReplaceWhere(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InsertOverwriteHiveDirContext extends InsertIntoContext {
		public StringLitContext path;
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode OVERWRITE() { return getToken(SqlBaseParser.OVERWRITE, 0); }
		public TerminalNode DIRECTORY() { return getToken(SqlBaseParser.DIRECTORY, 0); }
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public TerminalNode LOCAL() { return getToken(SqlBaseParser.LOCAL, 0); }
		public RowFormatContext rowFormat() {
			return getRuleContext(RowFormatContext.class,0);
		}
		public CreateFileFormatContext createFileFormat() {
			return getRuleContext(CreateFileFormatContext.class,0);
		}
		public InsertOverwriteHiveDirContext(InsertIntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterInsertOverwriteHiveDir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitInsertOverwriteHiveDir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitInsertOverwriteHiveDir(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InsertOverwriteDirContext extends InsertIntoContext {
		public StringLitContext path;
		public PropertyListContext options;
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode OVERWRITE() { return getToken(SqlBaseParser.OVERWRITE, 0); }
		public TerminalNode DIRECTORY() { return getToken(SqlBaseParser.DIRECTORY, 0); }
		public TableProviderContext tableProvider() {
			return getRuleContext(TableProviderContext.class,0);
		}
		public TerminalNode LOCAL() { return getToken(SqlBaseParser.LOCAL, 0); }
		public TerminalNode OPTIONS() { return getToken(SqlBaseParser.OPTIONS, 0); }
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public PropertyListContext propertyList() {
			return getRuleContext(PropertyListContext.class,0);
		}
		public InsertOverwriteDirContext(InsertIntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterInsertOverwriteDir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitInsertOverwriteDir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitInsertOverwriteDir(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InsertOverwriteTableContext extends InsertIntoContext {
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode OVERWRITE() { return getToken(SqlBaseParser.OVERWRITE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public InsertOverwriteTableContext(InsertIntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterInsertOverwriteTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitInsertOverwriteTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitInsertOverwriteTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InsertIntoTableContext extends InsertIntoContext {
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(SqlBaseParser.INTO, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public InsertIntoTableContext(InsertIntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterInsertIntoTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitInsertIntoTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitInsertIntoTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertIntoContext insertInto() throws RecognitionException {
		InsertIntoContext _localctx = new InsertIntoContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_insertInto);
		int _la;
		try {
			setState(1488);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
			case 1:
				_localctx = new InsertOverwriteTableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1418);
				match(INSERT);
				setState(1419);
				match(OVERWRITE);
				setState(1421);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
				case 1:
					{
					setState(1420);
					match(TABLE);
					}
					break;
				}
				setState(1423);
				multipartIdentifier();
				setState(1430);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1424);
					partitionSpec();
					setState(1428);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IF) {
						{
						setState(1425);
						match(IF);
						setState(1426);
						match(NOT);
						setState(1427);
						match(EXISTS);
						}
					}

					}
				}

				setState(1433);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
				case 1:
					{
					setState(1432);
					identifierList();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new InsertIntoTableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1435);
				match(INSERT);
				setState(1436);
				match(INTO);
				setState(1438);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
				case 1:
					{
					setState(1437);
					match(TABLE);
					}
					break;
				}
				setState(1440);
				multipartIdentifier();
				setState(1442);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1441);
					partitionSpec();
					}
				}

				setState(1447);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(1444);
					match(IF);
					setState(1445);
					match(NOT);
					setState(1446);
					match(EXISTS);
					}
				}

				setState(1450);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
				case 1:
					{
					setState(1449);
					identifierList();
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new InsertIntoReplaceWhereContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1452);
				match(INSERT);
				setState(1453);
				match(INTO);
				setState(1455);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
				case 1:
					{
					setState(1454);
					match(TABLE);
					}
					break;
				}
				setState(1457);
				multipartIdentifier();
				setState(1458);
				match(REPLACE);
				setState(1459);
				whereClause();
				}
				break;
			case 4:
				_localctx = new InsertOverwriteHiveDirContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1461);
				match(INSERT);
				setState(1462);
				match(OVERWRITE);
				setState(1464);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCAL) {
					{
					setState(1463);
					match(LOCAL);
					}
				}

				setState(1466);
				match(DIRECTORY);
				setState(1467);
				((InsertOverwriteHiveDirContext)_localctx).path = stringLit();
				setState(1469);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ROW) {
					{
					setState(1468);
					rowFormat();
					}
				}

				setState(1472);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STORED) {
					{
					setState(1471);
					createFileFormat();
					}
				}

				}
				break;
			case 5:
				_localctx = new InsertOverwriteDirContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1474);
				match(INSERT);
				setState(1475);
				match(OVERWRITE);
				setState(1477);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCAL) {
					{
					setState(1476);
					match(LOCAL);
					}
				}

				setState(1479);
				match(DIRECTORY);
				setState(1481);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
				case 1:
					{
					setState(1480);
					((InsertOverwriteDirContext)_localctx).path = stringLit();
					}
					break;
				}
				setState(1483);
				tableProvider();
				setState(1486);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(1484);
					match(OPTIONS);
					setState(1485);
					((InsertOverwriteDirContext)_localctx).options = propertyList();
					}
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

	public static class PartitionSpecLocationContext extends ParserRuleContext {
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public PartitionSpecLocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionSpecLocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterPartitionSpecLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitPartitionSpecLocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitPartitionSpecLocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionSpecLocationContext partitionSpecLocation() throws RecognitionException {
		PartitionSpecLocationContext _localctx = new PartitionSpecLocationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_partitionSpecLocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1490);
			partitionSpec();
			setState(1492);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOCATION) {
				{
				setState(1491);
				locationSpec();
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

	public static class PartitionSpecContext extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public List<PartitionValContext> partitionVal() {
			return getRuleContexts(PartitionValContext.class);
		}
		public PartitionValContext partitionVal(int i) {
			return getRuleContext(PartitionValContext.class,i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public PartitionSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterPartitionSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitPartitionSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitPartitionSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionSpecContext partitionSpec() throws RecognitionException {
		PartitionSpecContext _localctx = new PartitionSpecContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_partitionSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1494);
			match(PARTITION);
			setState(1495);
			match(LEFT_PAREN);
			setState(1496);
			partitionVal();
			setState(1501);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1497);
				match(COMMA);
				setState(1498);
				partitionVal();
				}
				}
				setState(1503);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1504);
			match(RIGHT_PAREN);
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

	public static class PartitionValContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(SqlBaseParser.DEFAULT, 0); }
		public PartitionValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionVal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterPartitionVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitPartitionVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitPartitionVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionValContext partitionVal() throws RecognitionException {
		PartitionValContext _localctx = new PartitionValContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_partitionVal);
		int _la;
		try {
			setState(1515);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1506);
				identifier();
				setState(1509);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ) {
					{
					setState(1507);
					match(EQ);
					setState(1508);
					constant();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1511);
				identifier();
				setState(1512);
				match(EQ);
				setState(1513);
				match(DEFAULT);
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

	public static class NamespaceContext extends ParserRuleContext {
		public TerminalNode NAMESPACE() { return getToken(SqlBaseParser.NAMESPACE, 0); }
		public TerminalNode DATABASE() { return getToken(SqlBaseParser.DATABASE, 0); }
		public TerminalNode SCHEMA() { return getToken(SqlBaseParser.SCHEMA, 0); }
		public NamespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitNamespace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespaceContext namespace() throws RecognitionException {
		NamespaceContext _localctx = new NamespaceContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_namespace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1517);
			_la = _input.LA(1);
			if ( !(_la==DATABASE || _la==NAMESPACE || _la==SCHEMA) ) {
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

	public static class NamespacesContext extends ParserRuleContext {
		public TerminalNode NAMESPACES() { return getToken(SqlBaseParser.NAMESPACES, 0); }
		public TerminalNode DATABASES() { return getToken(SqlBaseParser.DATABASES, 0); }
		public TerminalNode SCHEMAS() { return getToken(SqlBaseParser.SCHEMAS, 0); }
		public NamespacesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaces; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterNamespaces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitNamespaces(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitNamespaces(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespacesContext namespaces() throws RecognitionException {
		NamespacesContext _localctx = new NamespacesContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_namespaces);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1519);
			_la = _input.LA(1);
			if ( !(_la==DATABASES || _la==NAMESPACES || _la==SCHEMAS) ) {
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

	public static class DescribeFuncNameContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public ArithmeticOperatorContext arithmeticOperator() {
			return getRuleContext(ArithmeticOperatorContext.class,0);
		}
		public PredicateOperatorContext predicateOperator() {
			return getRuleContext(PredicateOperatorContext.class,0);
		}
		public DescribeFuncNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_describeFuncName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterDescribeFuncName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitDescribeFuncName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitDescribeFuncName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescribeFuncNameContext describeFuncName() throws RecognitionException {
		DescribeFuncNameContext _localctx = new DescribeFuncNameContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_describeFuncName);
		try {
			setState(1526);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1521);
				qualifiedName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1522);
				stringLit();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1523);
				comparisonOperator();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1524);
				arithmeticOperator();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1525);
				predicateOperator();
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

	public static class DescribeColNameContext extends ParserRuleContext {
		public IdentifierContext identifier;
		public List<IdentifierContext> nameParts = new ArrayList<IdentifierContext>();
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(SqlBaseParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SqlBaseParser.DOT, i);
		}
		public DescribeColNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_describeColName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterDescribeColName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitDescribeColName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitDescribeColName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescribeColNameContext describeColName() throws RecognitionException {
		DescribeColNameContext _localctx = new DescribeColNameContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_describeColName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1528);
			((DescribeColNameContext)_localctx).identifier = identifier();
			((DescribeColNameContext)_localctx).nameParts.add(((DescribeColNameContext)_localctx).identifier);
			setState(1533);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(1529);
				match(DOT);
				setState(1530);
				((DescribeColNameContext)_localctx).identifier = identifier();
				((DescribeColNameContext)_localctx).nameParts.add(((DescribeColNameContext)_localctx).identifier);
				}
				}
				setState(1535);
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

	public static class CtesContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public List<NamedQueryContext> namedQuery() {
			return getRuleContexts(NamedQueryContext.class);
		}
		public NamedQueryContext namedQuery(int i) {
			return getRuleContext(NamedQueryContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public CtesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterCtes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitCtes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitCtes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CtesContext ctes() throws RecognitionException {
		CtesContext _localctx = new CtesContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_ctes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1536);
			match(WITH);
			setState(1537);
			namedQuery();
			setState(1542);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1538);
				match(COMMA);
				setState(1539);
				namedQuery();
				}
				}
				setState(1544);
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

	public static class NamedQueryContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext name;
		public IdentifierListContext columnAliases;
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public NamedQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterNamedQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitNamedQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitNamedQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedQueryContext namedQuery() throws RecognitionException {
		NamedQueryContext _localctx = new NamedQueryContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_namedQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1545);
			((NamedQueryContext)_localctx).name = errorCapturingIdentifier();
			setState(1547);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
			case 1:
				{
				setState(1546);
				((NamedQueryContext)_localctx).columnAliases = identifierList();
				}
				break;
			}
			setState(1550);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(1549);
				match(AS);
				}
			}

			setState(1552);
			match(LEFT_PAREN);
			setState(1553);
			query();
			setState(1554);
			match(RIGHT_PAREN);
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

	public static class TableProviderContext extends ParserRuleContext {
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TableProviderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableProvider; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterTableProvider(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitTableProvider(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitTableProvider(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableProviderContext tableProvider() throws RecognitionException {
		TableProviderContext _localctx = new TableProviderContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_tableProvider);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1556);
			match(USING);
			setState(1557);
			multipartIdentifier();
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

	public static class CreateTableClausesContext extends ParserRuleContext {
		public PropertyListContext options;
		public PartitionFieldListContext partitioning;
		public PropertyListContext tableProps;
		public List<SkewSpecContext> skewSpec() {
			return getRuleContexts(SkewSpecContext.class);
		}
		public SkewSpecContext skewSpec(int i) {
			return getRuleContext(SkewSpecContext.class,i);
		}
		public List<BucketSpecContext> bucketSpec() {
			return getRuleContexts(BucketSpecContext.class);
		}
		public BucketSpecContext bucketSpec(int i) {
			return getRuleContext(BucketSpecContext.class,i);
		}
		public List<RowFormatContext> rowFormat() {
			return getRuleContexts(RowFormatContext.class);
		}
		public RowFormatContext rowFormat(int i) {
			return getRuleContext(RowFormatContext.class,i);
		}
		public List<CreateFileFormatContext> createFileFormat() {
			return getRuleContexts(CreateFileFormatContext.class);
		}
		public CreateFileFormatContext createFileFormat(int i) {
			return getRuleContext(CreateFileFormatContext.class,i);
		}
		public List<LocationSpecContext> locationSpec() {
			return getRuleContexts(LocationSpecContext.class);
		}
		public LocationSpecContext locationSpec(int i) {
			return getRuleContext(LocationSpecContext.class,i);
		}
		public List<CommentSpecContext> commentSpec() {
			return getRuleContexts(CommentSpecContext.class);
		}
		public CommentSpecContext commentSpec(int i) {
			return getRuleContext(CommentSpecContext.class,i);
		}
		public List<TerminalNode> OPTIONS() { return getTokens(SqlBaseParser.OPTIONS); }
		public TerminalNode OPTIONS(int i) {
			return getToken(SqlBaseParser.OPTIONS, i);
		}
		public List<TerminalNode> PARTITIONED() { return getTokens(SqlBaseParser.PARTITIONED); }
		public TerminalNode PARTITIONED(int i) {
			return getToken(SqlBaseParser.PARTITIONED, i);
		}
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public List<TerminalNode> TBLPROPERTIES() { return getTokens(SqlBaseParser.TBLPROPERTIES); }
		public TerminalNode TBLPROPERTIES(int i) {
			return getToken(SqlBaseParser.TBLPROPERTIES, i);
		}
		public List<PropertyListContext> propertyList() {
			return getRuleContexts(PropertyListContext.class);
		}
		public PropertyListContext propertyList(int i) {
			return getRuleContext(PropertyListContext.class,i);
		}
		public List<PartitionFieldListContext> partitionFieldList() {
			return getRuleContexts(PartitionFieldListContext.class);
		}
		public PartitionFieldListContext partitionFieldList(int i) {
			return getRuleContext(PartitionFieldListContext.class,i);
		}
		public CreateTableClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableClauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterCreateTableClauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitCreateTableClauses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitCreateTableClauses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTableClausesContext createTableClauses() throws RecognitionException {
		CreateTableClausesContext _localctx = new CreateTableClausesContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_createTableClauses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1574);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLUSTERED || _la==COMMENT || ((((_la - 147)) & ~0x3f) == 0 && ((1L << (_la - 147)) & ((1L << (LOCATION - 147)) | (1L << (OPTIONS - 147)) | (1L << (PARTITIONED - 147)))) != 0) || ((((_la - 225)) & ~0x3f) == 0 && ((1L << (_la - 225)) & ((1L << (ROW - 225)) | (1L << (SKEWED - 225)) | (1L << (STORED - 225)) | (1L << (TBLPROPERTIES - 225)))) != 0)) {
				{
				setState(1572);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPTIONS:
					{
					{
					setState(1559);
					match(OPTIONS);
					setState(1560);
					((CreateTableClausesContext)_localctx).options = propertyList();
					}
					}
					break;
				case PARTITIONED:
					{
					{
					setState(1561);
					match(PARTITIONED);
					setState(1562);
					match(BY);
					setState(1563);
					((CreateTableClausesContext)_localctx).partitioning = partitionFieldList();
					}
					}
					break;
				case SKEWED:
					{
					setState(1564);
					skewSpec();
					}
					break;
				case CLUSTERED:
					{
					setState(1565);
					bucketSpec();
					}
					break;
				case ROW:
					{
					setState(1566);
					rowFormat();
					}
					break;
				case STORED:
					{
					setState(1567);
					createFileFormat();
					}
					break;
				case LOCATION:
					{
					setState(1568);
					locationSpec();
					}
					break;
				case COMMENT:
					{
					setState(1569);
					commentSpec();
					}
					break;
				case TBLPROPERTIES:
					{
					{
					setState(1570);
					match(TBLPROPERTIES);
					setState(1571);
					((CreateTableClausesContext)_localctx).tableProps = propertyList();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1576);
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

	public static class PropertyListContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public List<PropertyContext> property() {
			return getRuleContexts(PropertyContext.class);
		}
		public PropertyContext property(int i) {
			return getRuleContext(PropertyContext.class,i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public PropertyListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterPropertyList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitPropertyList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitPropertyList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyListContext propertyList() throws RecognitionException {
		PropertyListContext _localctx = new PropertyListContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_propertyList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1577);
			match(LEFT_PAREN);
			setState(1578);
			property();
			setState(1583);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1579);
				match(COMMA);
				setState(1580);
				property();
				}
				}
				setState(1585);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1586);
			match(RIGHT_PAREN);
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
		public PropertyKeyContext key;
		public PropertyValueContext value;
		public PropertyKeyContext propertyKey() {
			return getRuleContext(PropertyKeyContext.class,0);
		}
		public PropertyValueContext propertyValue() {
			return getRuleContext(PropertyValueContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_property);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1588);
			((PropertyContext)_localctx).key = propertyKey();
			setState(1593);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
			case 1:
				{
				setState(1590);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
				case 1:
					{
					setState(1589);
					match(EQ);
					}
					break;
				}
				setState(1592);
				((PropertyContext)_localctx).value = propertyValue();
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

	public static class PropertyKeyContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(SqlBaseParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SqlBaseParser.DOT, i);
		}
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public PropertyKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterPropertyKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitPropertyKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitPropertyKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyKeyContext propertyKey() throws RecognitionException {
		PropertyKeyContext _localctx = new PropertyKeyContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_propertyKey);
		try {
			int _alt;
			setState(1604);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1595);
				identifier();
				setState(1600);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,169,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1596);
						match(DOT);
						setState(1597);
						identifier();
						}
						} 
					}
					setState(1602);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,169,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1603);
				stringLit();
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

	public static class PropertyValueContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(SqlBaseParser.DECIMAL_VALUE, 0); }
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public PropertyValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterPropertyValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitPropertyValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitPropertyValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyValueContext propertyValue() throws RecognitionException {
		PropertyValueContext _localctx = new PropertyValueContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_propertyValue);
		try {
			setState(1610);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1606);
				match(INTEGER_VALUE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1607);
				match(DECIMAL_VALUE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1608);
				booleanValue();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1609);
				stringLit();
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

	public static class ConstantListContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public ConstantListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterConstantList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitConstantList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitConstantList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantListContext constantList() throws RecognitionException {
		ConstantListContext _localctx = new ConstantListContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_constantList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1612);
			match(LEFT_PAREN);
			setState(1613);
			constant();
			setState(1618);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1614);
				match(COMMA);
				setState(1615);
				constant();
				}
				}
				setState(1620);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1621);
			match(RIGHT_PAREN);
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

	public static class NestedConstantListContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public List<ConstantListContext> constantList() {
			return getRuleContexts(ConstantListContext.class);
		}
		public ConstantListContext constantList(int i) {
			return getRuleContext(ConstantListContext.class,i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public NestedConstantListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedConstantList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterNestedConstantList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitNestedConstantList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitNestedConstantList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NestedConstantListContext nestedConstantList() throws RecognitionException {
		NestedConstantListContext _localctx = new NestedConstantListContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_nestedConstantList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1623);
			match(LEFT_PAREN);
			setState(1624);
			constantList();
			setState(1629);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1625);
				match(COMMA);
				setState(1626);
				constantList();
				}
				}
				setState(1631);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1632);
			match(RIGHT_PAREN);
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

	public static class CreateFileFormatContext extends ParserRuleContext {
		public TerminalNode STORED() { return getToken(SqlBaseParser.STORED, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public FileFormatContext fileFormat() {
			return getRuleContext(FileFormatContext.class,0);
		}
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public StorageHandlerContext storageHandler() {
			return getRuleContext(StorageHandlerContext.class,0);
		}
		public CreateFileFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createFileFormat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterCreateFileFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitCreateFileFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitCreateFileFormat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateFileFormatContext createFileFormat() throws RecognitionException {
		CreateFileFormatContext _localctx = new CreateFileFormatContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_createFileFormat);
		try {
			setState(1640);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1634);
				match(STORED);
				setState(1635);
				match(AS);
				setState(1636);
				fileFormat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1637);
				match(STORED);
				setState(1638);
				match(BY);
				setState(1639);
				storageHandler();
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

	public static class FileFormatContext extends ParserRuleContext {
		public FileFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileFormat; }
	 
		public FileFormatContext() { }
		public void copyFrom(FileFormatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TableFileFormatContext extends FileFormatContext {
		public StringLitContext inFmt;
		public StringLitContext outFmt;
		public TerminalNode INPUTFORMAT() { return getToken(SqlBaseParser.INPUTFORMAT, 0); }
		public TerminalNode OUTPUTFORMAT() { return getToken(SqlBaseParser.OUTPUTFORMAT, 0); }
		public List<StringLitContext> stringLit() {
			return getRuleContexts(StringLitContext.class);
		}
		public StringLitContext stringLit(int i) {
			return getRuleContext(StringLitContext.class,i);
		}
		public TableFileFormatContext(FileFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterTableFileFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitTableFileFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitTableFileFormat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GenericFileFormatContext extends FileFormatContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public GenericFileFormatContext(FileFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterGenericFileFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitGenericFileFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitGenericFileFormat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileFormatContext fileFormat() throws RecognitionException {
		FileFormatContext _localctx = new FileFormatContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_fileFormat);
		try {
			setState(1648);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
			case 1:
				_localctx = new TableFileFormatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1642);
				match(INPUTFORMAT);
				setState(1643);
				((TableFileFormatContext)_localctx).inFmt = stringLit();
				setState(1644);
				match(OUTPUTFORMAT);
				setState(1645);
				((TableFileFormatContext)_localctx).outFmt = stringLit();
				}
				break;
			case 2:
				_localctx = new GenericFileFormatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1647);
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

	public static class StorageHandlerContext extends ParserRuleContext {
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SqlBaseParser.SERDEPROPERTIES, 0); }
		public PropertyListContext propertyList() {
			return getRuleContext(PropertyListContext.class,0);
		}
		public StorageHandlerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageHandler; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterStorageHandler(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitStorageHandler(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitStorageHandler(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StorageHandlerContext storageHandler() throws RecognitionException {
		StorageHandlerContext _localctx = new StorageHandlerContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_storageHandler);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1650);
			stringLit();
			setState(1654);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
			case 1:
				{
				setState(1651);
				match(WITH);
				setState(1652);
				match(SERDEPROPERTIES);
				setState(1653);
				propertyList();
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

	public static class ResourceContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitResource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_resource);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1656);
			identifier();
			setState(1657);
			stringLit();
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

	public static class DmlStatementNoWithContext extends ParserRuleContext {
		public DmlStatementNoWithContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dmlStatementNoWith; }
	 
		public DmlStatementNoWithContext() { }
		public void copyFrom(DmlStatementNoWithContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeleteFromTableContext extends DmlStatementNoWithContext {
		public TerminalNode DELETE() { return getToken(SqlBaseParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public DeleteFromTableContext(DmlStatementNoWithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterDeleteFromTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitDeleteFromTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitDeleteFromTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SingleInsertQueryContext extends DmlStatementNoWithContext {
		public InsertIntoContext insertInto() {
			return getRuleContext(InsertIntoContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public SingleInsertQueryContext(DmlStatementNoWithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSingleInsertQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSingleInsertQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitSingleInsertQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiInsertQueryContext extends DmlStatementNoWithContext {
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public List<MultiInsertQueryBodyContext> multiInsertQueryBody() {
			return getRuleContexts(MultiInsertQueryBodyContext.class);
		}
		public MultiInsertQueryBodyContext multiInsertQueryBody(int i) {
			return getRuleContext(MultiInsertQueryBodyContext.class,i);
		}
		public MultiInsertQueryContext(DmlStatementNoWithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterMultiInsertQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitMultiInsertQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitMultiInsertQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UpdateTableContext extends DmlStatementNoWithContext {
		public TerminalNode UPDATE() { return getToken(SqlBaseParser.UPDATE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public SetClauseContext setClause() {
			return getRuleContext(SetClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public UpdateTableContext(DmlStatementNoWithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterUpdateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitUpdateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitUpdateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MergeIntoTableContext extends DmlStatementNoWithContext {
		public MultipartIdentifierContext target;
		public TableAliasContext targetAlias;
		public MultipartIdentifierContext source;
		public QueryContext sourceQuery;
		public TableAliasContext sourceAlias;
		public BooleanExpressionContext mergeCondition;
		public TerminalNode MERGE() { return getToken(SqlBaseParser.MERGE, 0); }
		public TerminalNode INTO() { return getToken(SqlBaseParser.INTO, 0); }
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public List<MultipartIdentifierContext> multipartIdentifier() {
			return getRuleContexts(MultipartIdentifierContext.class);
		}
		public MultipartIdentifierContext multipartIdentifier(int i) {
			return getRuleContext(MultipartIdentifierContext.class,i);
		}
		public List<TableAliasContext> tableAlias() {
			return getRuleContexts(TableAliasContext.class);
		}
		public TableAliasContext tableAlias(int i) {
			return getRuleContext(TableAliasContext.class,i);
		}
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public List<MatchedClauseContext> matchedClause() {
			return getRuleContexts(MatchedClauseContext.class);
		}
		public MatchedClauseContext matchedClause(int i) {
			return getRuleContext(MatchedClauseContext.class,i);
		}
		public List<NotMatchedClauseContext> notMatchedClause() {
			return getRuleContexts(NotMatchedClauseContext.class);
		}
		public NotMatchedClauseContext notMatchedClause(int i) {
			return getRuleContext(NotMatchedClauseContext.class,i);
		}
		public List<NotMatchedBySourceClauseContext> notMatchedBySourceClause() {
			return getRuleContexts(NotMatchedBySourceClauseContext.class);
		}
		public NotMatchedBySourceClauseContext notMatchedBySourceClause(int i) {
			return getRuleContext(NotMatchedBySourceClauseContext.class,i);
		}
		public MergeIntoTableContext(DmlStatementNoWithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterMergeIntoTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitMergeIntoTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitMergeIntoTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DmlStatementNoWithContext dmlStatementNoWith() throws RecognitionException {
		DmlStatementNoWithContext _localctx = new DmlStatementNoWithContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_dmlStatementNoWith);
		int _la;
		try {
			int _alt;
			setState(1715);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INSERT:
				_localctx = new SingleInsertQueryContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1659);
				insertInto();
				setState(1660);
				query();
				}
				break;
			case FROM:
				_localctx = new MultiInsertQueryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1662);
				fromClause();
				setState(1664); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1663);
					multiInsertQueryBody();
					}
					}
					setState(1666); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==INSERT );
				}
				break;
			case DELETE:
				_localctx = new DeleteFromTableContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1668);
				match(DELETE);
				setState(1669);
				match(FROM);
				setState(1670);
				multipartIdentifier();
				setState(1671);
				tableAlias();
				setState(1673);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(1672);
					whereClause();
					}
				}

				}
				break;
			case UPDATE:
				_localctx = new UpdateTableContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1675);
				match(UPDATE);
				setState(1676);
				multipartIdentifier();
				setState(1677);
				tableAlias();
				setState(1678);
				setClause();
				setState(1680);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(1679);
					whereClause();
					}
				}

				}
				break;
			case MERGE:
				_localctx = new MergeIntoTableContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1682);
				match(MERGE);
				setState(1683);
				match(INTO);
				setState(1684);
				((MergeIntoTableContext)_localctx).target = multipartIdentifier();
				setState(1685);
				((MergeIntoTableContext)_localctx).targetAlias = tableAlias();
				setState(1686);
				match(USING);
				setState(1692);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
				case 1:
					{
					setState(1687);
					((MergeIntoTableContext)_localctx).source = multipartIdentifier();
					}
					break;
				case 2:
					{
					setState(1688);
					match(LEFT_PAREN);
					setState(1689);
					((MergeIntoTableContext)_localctx).sourceQuery = query();
					setState(1690);
					match(RIGHT_PAREN);
					}
					break;
				}
				setState(1694);
				((MergeIntoTableContext)_localctx).sourceAlias = tableAlias();
				setState(1695);
				match(ON);
				setState(1696);
				((MergeIntoTableContext)_localctx).mergeCondition = booleanExpression(0);
				setState(1700);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,181,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1697);
						matchedClause();
						}
						} 
					}
					setState(1702);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,181,_ctx);
				}
				setState(1706);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,182,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1703);
						notMatchedClause();
						}
						} 
					}
					setState(1708);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,182,_ctx);
				}
				setState(1712);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHEN) {
					{
					{
					setState(1709);
					notMatchedBySourceClause();
					}
					}
					setState(1714);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class QueryOrganizationContext extends ParserRuleContext {
		public SortItemContext sortItem;
		public List<SortItemContext> order = new ArrayList<SortItemContext>();
		public ExpressionContext expression;
		public List<ExpressionContext> clusterBy = new ArrayList<ExpressionContext>();
		public List<ExpressionContext> distributeBy = new ArrayList<ExpressionContext>();
		public List<SortItemContext> sort = new ArrayList<SortItemContext>();
		public ExpressionContext limit;
		public ExpressionContext offset;
		public TerminalNode ORDER() { return getToken(SqlBaseParser.ORDER, 0); }
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public TerminalNode CLUSTER() { return getToken(SqlBaseParser.CLUSTER, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(SqlBaseParser.DISTRIBUTE, 0); }
		public TerminalNode SORT() { return getToken(SqlBaseParser.SORT, 0); }
		public WindowClauseContext windowClause() {
			return getRuleContext(WindowClauseContext.class,0);
		}
		public TerminalNode LIMIT() { return getToken(SqlBaseParser.LIMIT, 0); }
		public TerminalNode OFFSET() { return getToken(SqlBaseParser.OFFSET, 0); }
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public QueryOrganizationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryOrganization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterQueryOrganization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitQueryOrganization(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitQueryOrganization(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryOrganizationContext queryOrganization() throws RecognitionException {
		QueryOrganizationContext _localctx = new QueryOrganizationContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_queryOrganization);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1727);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
			case 1:
				{
				setState(1717);
				match(ORDER);
				setState(1718);
				match(BY);
				setState(1719);
				((QueryOrganizationContext)_localctx).sortItem = sortItem();
				((QueryOrganizationContext)_localctx).order.add(((QueryOrganizationContext)_localctx).sortItem);
				setState(1724);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,185,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1720);
						match(COMMA);
						setState(1721);
						((QueryOrganizationContext)_localctx).sortItem = sortItem();
						((QueryOrganizationContext)_localctx).order.add(((QueryOrganizationContext)_localctx).sortItem);
						}
						} 
					}
					setState(1726);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,185,_ctx);
				}
				}
				break;
			}
			setState(1739);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
			case 1:
				{
				setState(1729);
				match(CLUSTER);
				setState(1730);
				match(BY);
				setState(1731);
				((QueryOrganizationContext)_localctx).expression = expression();
				((QueryOrganizationContext)_localctx).clusterBy.add(((QueryOrganizationContext)_localctx).expression);
				setState(1736);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,187,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1732);
						match(COMMA);
						setState(1733);
						((QueryOrganizationContext)_localctx).expression = expression();
						((QueryOrganizationContext)_localctx).clusterBy.add(((QueryOrganizationContext)_localctx).expression);
						}
						} 
					}
					setState(1738);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,187,_ctx);
				}
				}
				break;
			}
			setState(1751);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
			case 1:
				{
				setState(1741);
				match(DISTRIBUTE);
				setState(1742);
				match(BY);
				setState(1743);
				((QueryOrganizationContext)_localctx).expression = expression();
				((QueryOrganizationContext)_localctx).distributeBy.add(((QueryOrganizationContext)_localctx).expression);
				setState(1748);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,189,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1744);
						match(COMMA);
						setState(1745);
						((QueryOrganizationContext)_localctx).expression = expression();
						((QueryOrganizationContext)_localctx).distributeBy.add(((QueryOrganizationContext)_localctx).expression);
						}
						} 
					}
					setState(1750);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,189,_ctx);
				}
				}
				break;
			}
			setState(1763);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
			case 1:
				{
				setState(1753);
				match(SORT);
				setState(1754);
				match(BY);
				setState(1755);
				((QueryOrganizationContext)_localctx).sortItem = sortItem();
				((QueryOrganizationContext)_localctx).sort.add(((QueryOrganizationContext)_localctx).sortItem);
				setState(1760);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,191,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1756);
						match(COMMA);
						setState(1757);
						((QueryOrganizationContext)_localctx).sortItem = sortItem();
						((QueryOrganizationContext)_localctx).sort.add(((QueryOrganizationContext)_localctx).sortItem);
						}
						} 
					}
					setState(1762);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,191,_ctx);
				}
				}
				break;
			}
			setState(1766);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
			case 1:
				{
				setState(1765);
				windowClause();
				}
				break;
			}
			setState(1773);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
			case 1:
				{
				setState(1768);
				match(LIMIT);
				setState(1771);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
				case 1:
					{
					setState(1769);
					match(ALL);
					}
					break;
				case 2:
					{
					setState(1770);
					((QueryOrganizationContext)_localctx).limit = expression();
					}
					break;
				}
				}
				break;
			}
			setState(1777);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
			case 1:
				{
				setState(1775);
				match(OFFSET);
				setState(1776);
				((QueryOrganizationContext)_localctx).offset = expression();
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

	public static class MultiInsertQueryBodyContext extends ParserRuleContext {
		public InsertIntoContext insertInto() {
			return getRuleContext(InsertIntoContext.class,0);
		}
		public FromStatementBodyContext fromStatementBody() {
			return getRuleContext(FromStatementBodyContext.class,0);
		}
		public MultiInsertQueryBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiInsertQueryBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterMultiInsertQueryBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitMultiInsertQueryBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitMultiInsertQueryBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiInsertQueryBodyContext multiInsertQueryBody() throws RecognitionException {
		MultiInsertQueryBodyContext _localctx = new MultiInsertQueryBodyContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_multiInsertQueryBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1779);
			insertInto();
			setState(1780);
			fromStatementBody();
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
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterQueryTermDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitQueryTermDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitQueryTermDefault(this);
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
		public TerminalNode UNION() { return getToken(SqlBaseParser.UNION, 0); }
		public TerminalNode EXCEPT() { return getToken(SqlBaseParser.EXCEPT, 0); }
		public TerminalNode SETMINUS() { return getToken(SqlBaseParser.SETMINUS, 0); }
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public SetOperationContext(QueryTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSetOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSetOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitSetOperation(this);
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
		int _startState = 88;
		enterRecursionRule(_localctx, 88, RULE_queryTerm, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new QueryTermDefaultContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1783);
			queryPrimary();
			}
			_ctx.stop = _input.LT(-1);
			setState(1808);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,201,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1806);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
					case 1:
						{
						_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
						((SetOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
						setState(1785);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1786);
						if (!(legacy_setops_precedence_enabled)) throw new FailedPredicateException(this, "legacy_setops_precedence_enabled");
						setState(1787);
						((SetOperationContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EXCEPT || _la==INTERSECT || _la==SETMINUS || _la==UNION) ) {
							((SetOperationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1789);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ALL || _la==DISTINCT) {
							{
							setState(1788);
							setQuantifier();
							}
						}

						setState(1791);
						((SetOperationContext)_localctx).right = queryTerm(4);
						}
						break;
					case 2:
						{
						_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
						((SetOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
						setState(1792);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1793);
						if (!(!legacy_setops_precedence_enabled)) throw new FailedPredicateException(this, "!legacy_setops_precedence_enabled");
						setState(1794);
						((SetOperationContext)_localctx).operator = match(INTERSECT);
						setState(1796);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ALL || _la==DISTINCT) {
							{
							setState(1795);
							setQuantifier();
							}
						}

						setState(1798);
						((SetOperationContext)_localctx).right = queryTerm(3);
						}
						break;
					case 3:
						{
						_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
						((SetOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
						setState(1799);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1800);
						if (!(!legacy_setops_precedence_enabled)) throw new FailedPredicateException(this, "!legacy_setops_precedence_enabled");
						setState(1801);
						((SetOperationContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EXCEPT || _la==SETMINUS || _la==UNION) ) {
							((SetOperationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1803);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ALL || _la==DISTINCT) {
							{
							setState(1802);
							setQuantifier();
							}
						}

						setState(1805);
						((SetOperationContext)_localctx).right = queryTerm(2);
						}
						break;
					}
					} 
				}
				setState(1810);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,201,_ctx);
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
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public SubqueryContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSubquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitSubquery(this);
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
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterQueryPrimaryDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitQueryPrimaryDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitQueryPrimaryDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InlineTableDefault1Context extends QueryPrimaryContext {
		public InlineTableContext inlineTable() {
			return getRuleContext(InlineTableContext.class,0);
		}
		public InlineTableDefault1Context(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterInlineTableDefault1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitInlineTableDefault1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitInlineTableDefault1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FromStmtContext extends QueryPrimaryContext {
		public FromStatementContext fromStatement() {
			return getRuleContext(FromStatementContext.class,0);
		}
		public FromStmtContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterFromStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitFromStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitFromStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableContext extends QueryPrimaryContext {
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TableContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryPrimaryContext queryPrimary() throws RecognitionException {
		QueryPrimaryContext _localctx = new QueryPrimaryContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_queryPrimary);
		try {
			setState(1820);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAP:
			case REDUCE:
			case SELECT:
				_localctx = new QueryPrimaryDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1811);
				querySpecification();
				}
				break;
			case FROM:
				_localctx = new FromStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1812);
				fromStatement();
				}
				break;
			case TABLE:
				_localctx = new TableContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1813);
				match(TABLE);
				setState(1814);
				multipartIdentifier();
				}
				break;
			case VALUES:
				_localctx = new InlineTableDefault1Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1815);
				inlineTable();
				}
				break;
			case LEFT_PAREN:
				_localctx = new SubqueryContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1816);
				match(LEFT_PAREN);
				setState(1817);
				query();
				setState(1818);
				match(RIGHT_PAREN);
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
		public Token nullOrder;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public TerminalNode ASC() { return getToken(SqlBaseParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode LAST() { return getToken(SqlBaseParser.LAST, 0); }
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public SortItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSortItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSortItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitSortItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SortItemContext sortItem() throws RecognitionException {
		SortItemContext _localctx = new SortItemContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_sortItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1822);
			expression();
			setState(1824);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
			case 1:
				{
				setState(1823);
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
				break;
			}
			setState(1828);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
			case 1:
				{
				setState(1826);
				match(NULLS);
				setState(1827);
				((SortItemContext)_localctx).nullOrder = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FIRST || _la==LAST) ) {
					((SortItemContext)_localctx).nullOrder = (Token)_errHandler.recoverInline(this);
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

	public static class FromStatementContext extends ParserRuleContext {
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public List<FromStatementBodyContext> fromStatementBody() {
			return getRuleContexts(FromStatementBodyContext.class);
		}
		public FromStatementBodyContext fromStatementBody(int i) {
			return getRuleContext(FromStatementBodyContext.class,i);
		}
		public FromStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterFromStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitFromStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitFromStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromStatementContext fromStatement() throws RecognitionException {
		FromStatementContext _localctx = new FromStatementContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_fromStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1830);
			fromClause();
			setState(1832); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1831);
					fromStatementBody();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1834); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,205,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class FromStatementBodyContext extends ParserRuleContext {
		public TransformClauseContext transformClause() {
			return getRuleContext(TransformClauseContext.class,0);
		}
		public QueryOrganizationContext queryOrganization() {
			return getRuleContext(QueryOrganizationContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public SelectClauseContext selectClause() {
			return getRuleContext(SelectClauseContext.class,0);
		}
		public List<LateralViewContext> lateralView() {
			return getRuleContexts(LateralViewContext.class);
		}
		public LateralViewContext lateralView(int i) {
			return getRuleContext(LateralViewContext.class,i);
		}
		public AggregationClauseContext aggregationClause() {
			return getRuleContext(AggregationClauseContext.class,0);
		}
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public WindowClauseContext windowClause() {
			return getRuleContext(WindowClauseContext.class,0);
		}
		public FromStatementBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromStatementBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterFromStatementBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitFromStatementBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitFromStatementBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromStatementBodyContext fromStatementBody() throws RecognitionException {
		FromStatementBodyContext _localctx = new FromStatementBodyContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_fromStatementBody);
		try {
			int _alt;
			setState(1863);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1836);
				transformClause();
				setState(1838);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
				case 1:
					{
					setState(1837);
					whereClause();
					}
					break;
				}
				setState(1840);
				queryOrganization();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1842);
				selectClause();
				setState(1846);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,207,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1843);
						lateralView();
						}
						} 
					}
					setState(1848);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,207,_ctx);
				}
				setState(1850);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
				case 1:
					{
					setState(1849);
					whereClause();
					}
					break;
				}
				setState(1853);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
				case 1:
					{
					setState(1852);
					aggregationClause();
					}
					break;
				}
				setState(1856);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
				case 1:
					{
					setState(1855);
					havingClause();
					}
					break;
				}
				setState(1859);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
				case 1:
					{
					setState(1858);
					windowClause();
					}
					break;
				}
				setState(1861);
				queryOrganization();
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

	public static class QuerySpecificationContext extends ParserRuleContext {
		public QuerySpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_querySpecification; }
	 
		public QuerySpecificationContext() { }
		public void copyFrom(QuerySpecificationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RegularQuerySpecificationContext extends QuerySpecificationContext {
		public SelectClauseContext selectClause() {
			return getRuleContext(SelectClauseContext.class,0);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public List<LateralViewContext> lateralView() {
			return getRuleContexts(LateralViewContext.class);
		}
		public LateralViewContext lateralView(int i) {
			return getRuleContext(LateralViewContext.class,i);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public AggregationClauseContext aggregationClause() {
			return getRuleContext(AggregationClauseContext.class,0);
		}
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public WindowClauseContext windowClause() {
			return getRuleContext(WindowClauseContext.class,0);
		}
		public RegularQuerySpecificationContext(QuerySpecificationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterRegularQuerySpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitRegularQuerySpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitRegularQuerySpecification(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TransformQuerySpecificationContext extends QuerySpecificationContext {
		public TransformClauseContext transformClause() {
			return getRuleContext(TransformClauseContext.class,0);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public List<LateralViewContext> lateralView() {
			return getRuleContexts(LateralViewContext.class);
		}
		public LateralViewContext lateralView(int i) {
			return getRuleContext(LateralViewContext.class,i);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public AggregationClauseContext aggregationClause() {
			return getRuleContext(AggregationClauseContext.class,0);
		}
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public WindowClauseContext windowClause() {
			return getRuleContext(WindowClauseContext.class,0);
		}
		public TransformQuerySpecificationContext(QuerySpecificationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterTransformQuerySpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitTransformQuerySpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitTransformQuerySpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuerySpecificationContext querySpecification() throws RecognitionException {
		QuerySpecificationContext _localctx = new QuerySpecificationContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_querySpecification);
		try {
			int _alt;
			setState(1909);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
			case 1:
				_localctx = new TransformQuerySpecificationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1865);
				transformClause();
				setState(1867);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
				case 1:
					{
					setState(1866);
					fromClause();
					}
					break;
				}
				setState(1872);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,214,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1869);
						lateralView();
						}
						} 
					}
					setState(1874);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,214,_ctx);
				}
				setState(1876);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
				case 1:
					{
					setState(1875);
					whereClause();
					}
					break;
				}
				setState(1879);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
				case 1:
					{
					setState(1878);
					aggregationClause();
					}
					break;
				}
				setState(1882);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
				case 1:
					{
					setState(1881);
					havingClause();
					}
					break;
				}
				setState(1885);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
				case 1:
					{
					setState(1884);
					windowClause();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new RegularQuerySpecificationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1887);
				selectClause();
				setState(1889);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
				case 1:
					{
					setState(1888);
					fromClause();
					}
					break;
				}
				setState(1894);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,220,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1891);
						lateralView();
						}
						} 
					}
					setState(1896);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,220,_ctx);
				}
				setState(1898);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
				case 1:
					{
					setState(1897);
					whereClause();
					}
					break;
				}
				setState(1901);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
				case 1:
					{
					setState(1900);
					aggregationClause();
					}
					break;
				}
				setState(1904);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
				case 1:
					{
					setState(1903);
					havingClause();
					}
					break;
				}
				setState(1907);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
				case 1:
					{
					setState(1906);
					windowClause();
					}
					break;
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

	public static class TransformClauseContext extends ParserRuleContext {
		public Token kind;
		public RowFormatContext inRowFormat;
		public StringLitContext recordWriter;
		public StringLitContext script;
		public RowFormatContext outRowFormat;
		public StringLitContext recordReader;
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public List<StringLitContext> stringLit() {
			return getRuleContexts(StringLitContext.class);
		}
		public StringLitContext stringLit(int i) {
			return getRuleContext(StringLitContext.class,i);
		}
		public TerminalNode SELECT() { return getToken(SqlBaseParser.SELECT, 0); }
		public List<TerminalNode> LEFT_PAREN() { return getTokens(SqlBaseParser.LEFT_PAREN); }
		public TerminalNode LEFT_PAREN(int i) {
			return getToken(SqlBaseParser.LEFT_PAREN, i);
		}
		public ExpressionSeqContext expressionSeq() {
			return getRuleContext(ExpressionSeqContext.class,0);
		}
		public List<TerminalNode> RIGHT_PAREN() { return getTokens(SqlBaseParser.RIGHT_PAREN); }
		public TerminalNode RIGHT_PAREN(int i) {
			return getToken(SqlBaseParser.RIGHT_PAREN, i);
		}
		public TerminalNode TRANSFORM() { return getToken(SqlBaseParser.TRANSFORM, 0); }
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode REDUCE() { return getToken(SqlBaseParser.REDUCE, 0); }
		public TerminalNode RECORDWRITER() { return getToken(SqlBaseParser.RECORDWRITER, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TerminalNode RECORDREADER() { return getToken(SqlBaseParser.RECORDREADER, 0); }
		public List<RowFormatContext> rowFormat() {
			return getRuleContexts(RowFormatContext.class);
		}
		public RowFormatContext rowFormat(int i) {
			return getRuleContext(RowFormatContext.class,i);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TransformClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transformClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterTransformClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitTransformClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitTransformClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransformClauseContext transformClause() throws RecognitionException {
		TransformClauseContext _localctx = new TransformClauseContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_transformClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1930);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				{
				setState(1911);
				match(SELECT);
				setState(1912);
				((TransformClauseContext)_localctx).kind = match(TRANSFORM);
				setState(1913);
				match(LEFT_PAREN);
				setState(1915);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,226,_ctx) ) {
				case 1:
					{
					setState(1914);
					setQuantifier();
					}
					break;
				}
				setState(1917);
				expressionSeq();
				setState(1918);
				match(RIGHT_PAREN);
				}
				break;
			case MAP:
				{
				setState(1920);
				((TransformClauseContext)_localctx).kind = match(MAP);
				setState(1922);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,227,_ctx) ) {
				case 1:
					{
					setState(1921);
					setQuantifier();
					}
					break;
				}
				setState(1924);
				expressionSeq();
				}
				break;
			case REDUCE:
				{
				setState(1925);
				((TransformClauseContext)_localctx).kind = match(REDUCE);
				setState(1927);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
				case 1:
					{
					setState(1926);
					setQuantifier();
					}
					break;
				}
				setState(1929);
				expressionSeq();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1933);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ROW) {
				{
				setState(1932);
				((TransformClauseContext)_localctx).inRowFormat = rowFormat();
				}
			}

			setState(1937);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RECORDWRITER) {
				{
				setState(1935);
				match(RECORDWRITER);
				setState(1936);
				((TransformClauseContext)_localctx).recordWriter = stringLit();
				}
			}

			setState(1939);
			match(USING);
			setState(1940);
			((TransformClauseContext)_localctx).script = stringLit();
			setState(1953);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
			case 1:
				{
				setState(1941);
				match(AS);
				setState(1951);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
				case 1:
					{
					setState(1942);
					identifierSeq();
					}
					break;
				case 2:
					{
					setState(1943);
					colTypeList();
					}
					break;
				case 3:
					{
					{
					setState(1944);
					match(LEFT_PAREN);
					setState(1947);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
					case 1:
						{
						setState(1945);
						identifierSeq();
						}
						break;
					case 2:
						{
						setState(1946);
						colTypeList();
						}
						break;
					}
					setState(1949);
					match(RIGHT_PAREN);
					}
					}
					break;
				}
				}
				break;
			}
			setState(1956);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
			case 1:
				{
				setState(1955);
				((TransformClauseContext)_localctx).outRowFormat = rowFormat();
				}
				break;
			}
			setState(1960);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,236,_ctx) ) {
			case 1:
				{
				setState(1958);
				match(RECORDREADER);
				setState(1959);
				((TransformClauseContext)_localctx).recordReader = stringLit();
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
		public HintContext hint;
		public List<HintContext> hints = new ArrayList<HintContext>();
		public TerminalNode SELECT() { return getToken(SqlBaseParser.SELECT, 0); }
		public NamedExpressionSeqContext namedExpressionSeq() {
			return getRuleContext(NamedExpressionSeqContext.class,0);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public List<HintContext> hint() {
			return getRuleContexts(HintContext.class);
		}
		public HintContext hint(int i) {
			return getRuleContext(HintContext.class,i);
		}
		public SelectClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSelectClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSelectClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitSelectClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectClauseContext selectClause() throws RecognitionException {
		SelectClauseContext _localctx = new SelectClauseContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_selectClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1962);
			match(SELECT);
			setState(1966);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,237,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1963);
					((SelectClauseContext)_localctx).hint = hint();
					((SelectClauseContext)_localctx).hints.add(((SelectClauseContext)_localctx).hint);
					}
					} 
				}
				setState(1968);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,237,_ctx);
			}
			setState(1970);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,238,_ctx) ) {
			case 1:
				{
				setState(1969);
				setQuantifier();
				}
				break;
			}
			setState(1972);
			namedExpressionSeq();
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

	public static class SetClauseContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public AssignmentListContext assignmentList() {
			return getRuleContext(AssignmentListContext.class,0);
		}
		public SetClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSetClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSetClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitSetClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetClauseContext setClause() throws RecognitionException {
		SetClauseContext _localctx = new SetClauseContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_setClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1974);
			match(SET);
			setState(1975);
			assignmentList();
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

	public static class MatchedClauseContext extends ParserRuleContext {
		public BooleanExpressionContext matchedCond;
		public TerminalNode WHEN() { return getToken(SqlBaseParser.WHEN, 0); }
		public TerminalNode MATCHED() { return getToken(SqlBaseParser.MATCHED, 0); }
		public TerminalNode THEN() { return getToken(SqlBaseParser.THEN, 0); }
		public MatchedActionContext matchedAction() {
			return getRuleContext(MatchedActionContext.class,0);
		}
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public MatchedClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchedClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterMatchedClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitMatchedClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitMatchedClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchedClauseContext matchedClause() throws RecognitionException {
		MatchedClauseContext _localctx = new MatchedClauseContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_matchedClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1977);
			match(WHEN);
			setState(1978);
			match(MATCHED);
			setState(1981);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AND) {
				{
				setState(1979);
				match(AND);
				setState(1980);
				((MatchedClauseContext)_localctx).matchedCond = booleanExpression(0);
				}
			}

			setState(1983);
			match(THEN);
			setState(1984);
			matchedAction();
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

	public static class NotMatchedClauseContext extends ParserRuleContext {
		public BooleanExpressionContext notMatchedCond;
		public TerminalNode WHEN() { return getToken(SqlBaseParser.WHEN, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode MATCHED() { return getToken(SqlBaseParser.MATCHED, 0); }
		public TerminalNode THEN() { return getToken(SqlBaseParser.THEN, 0); }
		public NotMatchedActionContext notMatchedAction() {
			return getRuleContext(NotMatchedActionContext.class,0);
		}
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public TerminalNode TARGET() { return getToken(SqlBaseParser.TARGET, 0); }
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public NotMatchedClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notMatchedClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterNotMatchedClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitNotMatchedClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitNotMatchedClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotMatchedClauseContext notMatchedClause() throws RecognitionException {
		NotMatchedClauseContext _localctx = new NotMatchedClauseContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_notMatchedClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1986);
			match(WHEN);
			setState(1987);
			match(NOT);
			setState(1988);
			match(MATCHED);
			setState(1991);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BY) {
				{
				setState(1989);
				match(BY);
				setState(1990);
				match(TARGET);
				}
			}

			setState(1995);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AND) {
				{
				setState(1993);
				match(AND);
				setState(1994);
				((NotMatchedClauseContext)_localctx).notMatchedCond = booleanExpression(0);
				}
			}

			setState(1997);
			match(THEN);
			setState(1998);
			notMatchedAction();
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

	public static class NotMatchedBySourceClauseContext extends ParserRuleContext {
		public BooleanExpressionContext notMatchedBySourceCond;
		public TerminalNode WHEN() { return getToken(SqlBaseParser.WHEN, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode MATCHED() { return getToken(SqlBaseParser.MATCHED, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public TerminalNode SOURCE() { return getToken(SqlBaseParser.SOURCE, 0); }
		public TerminalNode THEN() { return getToken(SqlBaseParser.THEN, 0); }
		public NotMatchedBySourceActionContext notMatchedBySourceAction() {
			return getRuleContext(NotMatchedBySourceActionContext.class,0);
		}
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public NotMatchedBySourceClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notMatchedBySourceClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterNotMatchedBySourceClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitNotMatchedBySourceClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitNotMatchedBySourceClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotMatchedBySourceClauseContext notMatchedBySourceClause() throws RecognitionException {
		NotMatchedBySourceClauseContext _localctx = new NotMatchedBySourceClauseContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_notMatchedBySourceClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2000);
			match(WHEN);
			setState(2001);
			match(NOT);
			setState(2002);
			match(MATCHED);
			setState(2003);
			match(BY);
			setState(2004);
			match(SOURCE);
			setState(2007);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AND) {
				{
				setState(2005);
				match(AND);
				setState(2006);
				((NotMatchedBySourceClauseContext)_localctx).notMatchedBySourceCond = booleanExpression(0);
				}
			}

			setState(2009);
			match(THEN);
			setState(2010);
			notMatchedBySourceAction();
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

	public static class MatchedActionContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(SqlBaseParser.DELETE, 0); }
		public TerminalNode UPDATE() { return getToken(SqlBaseParser.UPDATE, 0); }
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public AssignmentListContext assignmentList() {
			return getRuleContext(AssignmentListContext.class,0);
		}
		public MatchedActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchedAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterMatchedAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitMatchedAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitMatchedAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchedActionContext matchedAction() throws RecognitionException {
		MatchedActionContext _localctx = new MatchedActionContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_matchedAction);
		try {
			setState(2019);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2012);
				match(DELETE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2013);
				match(UPDATE);
				setState(2014);
				match(SET);
				setState(2015);
				match(ASTERISK);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2016);
				match(UPDATE);
				setState(2017);
				match(SET);
				setState(2018);
				assignmentList();
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

	public static class NotMatchedActionContext extends ParserRuleContext {
		public MultipartIdentifierListContext columns;
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public List<TerminalNode> LEFT_PAREN() { return getTokens(SqlBaseParser.LEFT_PAREN); }
		public TerminalNode LEFT_PAREN(int i) {
			return getToken(SqlBaseParser.LEFT_PAREN, i);
		}
		public List<TerminalNode> RIGHT_PAREN() { return getTokens(SqlBaseParser.RIGHT_PAREN); }
		public TerminalNode RIGHT_PAREN(int i) {
			return getToken(SqlBaseParser.RIGHT_PAREN, i);
		}
		public TerminalNode VALUES() { return getToken(SqlBaseParser.VALUES, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MultipartIdentifierListContext multipartIdentifierList() {
			return getRuleContext(MultipartIdentifierListContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public NotMatchedActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notMatchedAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterNotMatchedAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitNotMatchedAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitNotMatchedAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotMatchedActionContext notMatchedAction() throws RecognitionException {
		NotMatchedActionContext _localctx = new NotMatchedActionContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_notMatchedAction);
		int _la;
		try {
			setState(2039);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2021);
				match(INSERT);
				setState(2022);
				match(ASTERISK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2023);
				match(INSERT);
				setState(2024);
				match(LEFT_PAREN);
				setState(2025);
				((NotMatchedActionContext)_localctx).columns = multipartIdentifierList();
				setState(2026);
				match(RIGHT_PAREN);
				setState(2027);
				match(VALUES);
				setState(2028);
				match(LEFT_PAREN);
				setState(2029);
				expression();
				setState(2034);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2030);
					match(COMMA);
					setState(2031);
					expression();
					}
					}
					setState(2036);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2037);
				match(RIGHT_PAREN);
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

	public static class NotMatchedBySourceActionContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(SqlBaseParser.DELETE, 0); }
		public TerminalNode UPDATE() { return getToken(SqlBaseParser.UPDATE, 0); }
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public AssignmentListContext assignmentList() {
			return getRuleContext(AssignmentListContext.class,0);
		}
		public NotMatchedBySourceActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notMatchedBySourceAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterNotMatchedBySourceAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitNotMatchedBySourceAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitNotMatchedBySourceAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotMatchedBySourceActionContext notMatchedBySourceAction() throws RecognitionException {
		NotMatchedBySourceActionContext _localctx = new NotMatchedBySourceActionContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_notMatchedBySourceAction);
		try {
			setState(2045);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DELETE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2041);
				match(DELETE);
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2042);
				match(UPDATE);
				setState(2043);
				match(SET);
				setState(2044);
				assignmentList();
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

	public static class AssignmentListContext extends ParserRuleContext {
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public AssignmentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterAssignmentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitAssignmentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitAssignmentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentListContext assignmentList() throws RecognitionException {
		AssignmentListContext _localctx = new AssignmentListContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_assignmentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2047);
			assignment();
			setState(2052);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2048);
				match(COMMA);
				setState(2049);
				assignment();
				}
				}
				setState(2054);
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

	public static class AssignmentContext extends ParserRuleContext {
		public MultipartIdentifierContext key;
		public ExpressionContext value;
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2055);
			((AssignmentContext)_localctx).key = multipartIdentifier();
			setState(2056);
			match(EQ);
			setState(2057);
			((AssignmentContext)_localctx).value = expression();
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
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitWhereClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2059);
			match(WHERE);
			setState(2060);
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

	public static class HavingClauseContext extends ParserRuleContext {
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
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterHavingClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitHavingClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitHavingClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HavingClauseContext havingClause() throws RecognitionException {
		HavingClauseContext _localctx = new HavingClauseContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_havingClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2062);
			match(HAVING);
			setState(2063);
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

	public static class HintContext extends ParserRuleContext {
		public HintStatementContext hintStatement;
		public List<HintStatementContext> hintStatements = new ArrayList<HintStatementContext>();
		public TerminalNode HENT_START() { return getToken(SqlBaseParser.HENT_START, 0); }
		public TerminalNode HENT_END() { return getToken(SqlBaseParser.HENT_END, 0); }
		public List<HintStatementContext> hintStatement() {
			return getRuleContexts(HintStatementContext.class);
		}
		public HintStatementContext hintStatement(int i) {
			return getRuleContext(HintStatementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public HintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterHint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitHint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitHint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HintContext hint() throws RecognitionException {
		HintContext _localctx = new HintContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_hint);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2065);
			match(HENT_START);
			setState(2066);
			((HintContext)_localctx).hintStatement = hintStatement();
			((HintContext)_localctx).hintStatements.add(((HintContext)_localctx).hintStatement);
			setState(2073);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,249,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2068);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,248,_ctx) ) {
					case 1:
						{
						setState(2067);
						match(COMMA);
						}
						break;
					}
					setState(2070);
					((HintContext)_localctx).hintStatement = hintStatement();
					((HintContext)_localctx).hintStatements.add(((HintContext)_localctx).hintStatement);
					}
					} 
				}
				setState(2075);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,249,_ctx);
			}
			setState(2076);
			match(HENT_END);
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

	public static class HintStatementContext extends ParserRuleContext {
		public IdentifierContext hintName;
		public PrimaryExpressionContext primaryExpression;
		public List<PrimaryExpressionContext> parameters = new ArrayList<PrimaryExpressionContext>();
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public List<PrimaryExpressionContext> primaryExpression() {
			return getRuleContexts(PrimaryExpressionContext.class);
		}
		public PrimaryExpressionContext primaryExpression(int i) {
			return getRuleContext(PrimaryExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public HintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hintStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterHintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitHintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitHintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HintStatementContext hintStatement() throws RecognitionException {
		HintStatementContext _localctx = new HintStatementContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_hintStatement);
		int _la;
		try {
			setState(2091);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,251,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2078);
				((HintStatementContext)_localctx).hintName = identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2079);
				((HintStatementContext)_localctx).hintName = identifier();
				setState(2080);
				match(LEFT_PAREN);
				setState(2081);
				((HintStatementContext)_localctx).primaryExpression = primaryExpression(0);
				((HintStatementContext)_localctx).parameters.add(((HintStatementContext)_localctx).primaryExpression);
				setState(2086);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2082);
					match(COMMA);
					setState(2083);
					((HintStatementContext)_localctx).primaryExpression = primaryExpression(0);
					((HintStatementContext)_localctx).parameters.add(((HintStatementContext)_localctx).primaryExpression);
					}
					}
					setState(2088);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2089);
				match(RIGHT_PAREN);
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

	public static class FromClauseContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}
		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public List<LateralViewContext> lateralView() {
			return getRuleContexts(LateralViewContext.class);
		}
		public LateralViewContext lateralView(int i) {
			return getRuleContext(LateralViewContext.class,i);
		}
		public PivotClauseContext pivotClause() {
			return getRuleContext(PivotClauseContext.class,0);
		}
		public UnpivotClauseContext unpivotClause() {
			return getRuleContext(UnpivotClauseContext.class,0);
		}
		public FromClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterFromClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitFromClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitFromClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_fromClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2093);
			match(FROM);
			setState(2094);
			relation();
			setState(2099);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,252,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2095);
					match(COMMA);
					setState(2096);
					relation();
					}
					} 
				}
				setState(2101);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,252,_ctx);
			}
			setState(2105);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,253,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2102);
					lateralView();
					}
					} 
				}
				setState(2107);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,253,_ctx);
			}
			setState(2109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,254,_ctx) ) {
			case 1:
				{
				setState(2108);
				pivotClause();
				}
				break;
			}
			setState(2112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,255,_ctx) ) {
			case 1:
				{
				setState(2111);
				unpivotClause();
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

	public static class TemporalClauseContext extends ParserRuleContext {
		public ValueExpressionContext timestamp;
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TerminalNode OF() { return getToken(SqlBaseParser.OF, 0); }
		public VersionContext version() {
			return getRuleContext(VersionContext.class,0);
		}
		public TerminalNode SYSTEM_VERSION() { return getToken(SqlBaseParser.SYSTEM_VERSION, 0); }
		public TerminalNode VERSION() { return getToken(SqlBaseParser.VERSION, 0); }
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public TerminalNode SYSTEM_TIME() { return getToken(SqlBaseParser.SYSTEM_TIME, 0); }
		public TerminalNode TIMESTAMP() { return getToken(SqlBaseParser.TIMESTAMP, 0); }
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TemporalClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_temporalClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterTemporalClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitTemporalClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitTemporalClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemporalClauseContext temporalClause() throws RecognitionException {
		TemporalClauseContext _localctx = new TemporalClauseContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_temporalClause);
		int _la;
		try {
			setState(2128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,258,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FOR) {
					{
					setState(2114);
					match(FOR);
					}
				}

				setState(2117);
				_la = _input.LA(1);
				if ( !(_la==SYSTEM_VERSION || _la==VERSION) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2118);
				match(AS);
				setState(2119);
				match(OF);
				setState(2120);
				version();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2122);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FOR) {
					{
					setState(2121);
					match(FOR);
					}
				}

				setState(2124);
				_la = _input.LA(1);
				if ( !(_la==SYSTEM_TIME || _la==TIMESTAMP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2125);
				match(AS);
				setState(2126);
				match(OF);
				setState(2127);
				((TemporalClauseContext)_localctx).timestamp = valueExpression(0);
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

	public static class AggregationClauseContext extends ParserRuleContext {
		public GroupByClauseContext groupByClause;
		public List<GroupByClauseContext> groupingExpressionsWithGroupingAnalytics = new ArrayList<GroupByClauseContext>();
		public ExpressionContext expression;
		public List<ExpressionContext> groupingExpressions = new ArrayList<ExpressionContext>();
		public Token kind;
		public TerminalNode GROUP() { return getToken(SqlBaseParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public List<GroupByClauseContext> groupByClause() {
			return getRuleContexts(GroupByClauseContext.class);
		}
		public GroupByClauseContext groupByClause(int i) {
			return getRuleContext(GroupByClauseContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode SETS() { return getToken(SqlBaseParser.SETS, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public List<GroupingSetContext> groupingSet() {
			return getRuleContexts(GroupingSetContext.class);
		}
		public GroupingSetContext groupingSet(int i) {
			return getRuleContext(GroupingSetContext.class,i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public TerminalNode ROLLUP() { return getToken(SqlBaseParser.ROLLUP, 0); }
		public TerminalNode CUBE() { return getToken(SqlBaseParser.CUBE, 0); }
		public TerminalNode GROUPING() { return getToken(SqlBaseParser.GROUPING, 0); }
		public AggregationClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregationClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterAggregationClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitAggregationClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitAggregationClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregationClauseContext aggregationClause() throws RecognitionException {
		AggregationClauseContext _localctx = new AggregationClauseContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_aggregationClause);
		int _la;
		try {
			int _alt;
			setState(2169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,263,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2130);
				match(GROUP);
				setState(2131);
				match(BY);
				setState(2132);
				((AggregationClauseContext)_localctx).groupByClause = groupByClause();
				((AggregationClauseContext)_localctx).groupingExpressionsWithGroupingAnalytics.add(((AggregationClauseContext)_localctx).groupByClause);
				setState(2137);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,259,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2133);
						match(COMMA);
						setState(2134);
						((AggregationClauseContext)_localctx).groupByClause = groupByClause();
						((AggregationClauseContext)_localctx).groupingExpressionsWithGroupingAnalytics.add(((AggregationClauseContext)_localctx).groupByClause);
						}
						} 
					}
					setState(2139);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,259,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2140);
				match(GROUP);
				setState(2141);
				match(BY);
				setState(2142);
				((AggregationClauseContext)_localctx).expression = expression();
				((AggregationClauseContext)_localctx).groupingExpressions.add(((AggregationClauseContext)_localctx).expression);
				setState(2147);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,260,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2143);
						match(COMMA);
						setState(2144);
						((AggregationClauseContext)_localctx).expression = expression();
						((AggregationClauseContext)_localctx).groupingExpressions.add(((AggregationClauseContext)_localctx).expression);
						}
						} 
					}
					setState(2149);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,260,_ctx);
				}
				setState(2167);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,262,_ctx) ) {
				case 1:
					{
					setState(2150);
					match(WITH);
					setState(2151);
					((AggregationClauseContext)_localctx).kind = match(ROLLUP);
					}
					break;
				case 2:
					{
					setState(2152);
					match(WITH);
					setState(2153);
					((AggregationClauseContext)_localctx).kind = match(CUBE);
					}
					break;
				case 3:
					{
					setState(2154);
					((AggregationClauseContext)_localctx).kind = match(GROUPING);
					setState(2155);
					match(SETS);
					setState(2156);
					match(LEFT_PAREN);
					setState(2157);
					groupingSet();
					setState(2162);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(2158);
						match(COMMA);
						setState(2159);
						groupingSet();
						}
						}
						setState(2164);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2165);
					match(RIGHT_PAREN);
					}
					break;
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

	public static class GroupByClauseContext extends ParserRuleContext {
		public GroupingAnalyticsContext groupingAnalytics() {
			return getRuleContext(GroupingAnalyticsContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public GroupByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterGroupByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitGroupByClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitGroupByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupByClauseContext groupByClause() throws RecognitionException {
		GroupByClauseContext _localctx = new GroupByClauseContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_groupByClause);
		try {
			setState(2173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,264,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2171);
				groupingAnalytics();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2172);
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

	public static class GroupingAnalyticsContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public List<GroupingSetContext> groupingSet() {
			return getRuleContexts(GroupingSetContext.class);
		}
		public GroupingSetContext groupingSet(int i) {
			return getRuleContext(GroupingSetContext.class,i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public TerminalNode ROLLUP() { return getToken(SqlBaseParser.ROLLUP, 0); }
		public TerminalNode CUBE() { return getToken(SqlBaseParser.CUBE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public TerminalNode GROUPING() { return getToken(SqlBaseParser.GROUPING, 0); }
		public TerminalNode SETS() { return getToken(SqlBaseParser.SETS, 0); }
		public List<GroupingElementContext> groupingElement() {
			return getRuleContexts(GroupingElementContext.class);
		}
		public GroupingElementContext groupingElement(int i) {
			return getRuleContext(GroupingElementContext.class,i);
		}
		public GroupingAnalyticsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupingAnalytics; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterGroupingAnalytics(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitGroupingAnalytics(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitGroupingAnalytics(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupingAnalyticsContext groupingAnalytics() throws RecognitionException {
		GroupingAnalyticsContext _localctx = new GroupingAnalyticsContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_groupingAnalytics);
		int _la;
		try {
			setState(2200);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CUBE:
			case ROLLUP:
				enterOuterAlt(_localctx, 1);
				{
				setState(2175);
				_la = _input.LA(1);
				if ( !(_la==CUBE || _la==ROLLUP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2176);
				match(LEFT_PAREN);
				setState(2177);
				groupingSet();
				setState(2182);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2178);
					match(COMMA);
					setState(2179);
					groupingSet();
					}
					}
					setState(2184);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2185);
				match(RIGHT_PAREN);
				}
				break;
			case GROUPING:
				enterOuterAlt(_localctx, 2);
				{
				setState(2187);
				match(GROUPING);
				setState(2188);
				match(SETS);
				setState(2189);
				match(LEFT_PAREN);
				setState(2190);
				groupingElement();
				setState(2195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2191);
					match(COMMA);
					setState(2192);
					groupingElement();
					}
					}
					setState(2197);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2198);
				match(RIGHT_PAREN);
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

	public static class GroupingElementContext extends ParserRuleContext {
		public GroupingAnalyticsContext groupingAnalytics() {
			return getRuleContext(GroupingAnalyticsContext.class,0);
		}
		public GroupingSetContext groupingSet() {
			return getRuleContext(GroupingSetContext.class,0);
		}
		public GroupingElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupingElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterGroupingElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitGroupingElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitGroupingElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupingElementContext groupingElement() throws RecognitionException {
		GroupingElementContext _localctx = new GroupingElementContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_groupingElement);
		try {
			setState(2204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,268,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2202);
				groupingAnalytics();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2203);
				groupingSet();
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
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public GroupingSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupingSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterGroupingSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitGroupingSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitGroupingSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupingSetContext groupingSet() throws RecognitionException {
		GroupingSetContext _localctx = new GroupingSetContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_groupingSet);
		int _la;
		try {
			setState(2219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,271,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2206);
				match(LEFT_PAREN);
				setState(2215);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,270,_ctx) ) {
				case 1:
					{
					setState(2207);
					expression();
					setState(2212);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(2208);
						match(COMMA);
						setState(2209);
						expression();
						}
						}
						setState(2214);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(2217);
				match(RIGHT_PAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2218);
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

	public static class PivotClauseContext extends ParserRuleContext {
		public NamedExpressionSeqContext aggregates;
		public PivotValueContext pivotValue;
		public List<PivotValueContext> pivotValues = new ArrayList<PivotValueContext>();
		public TerminalNode PIVOT() { return getToken(SqlBaseParser.PIVOT, 0); }
		public List<TerminalNode> LEFT_PAREN() { return getTokens(SqlBaseParser.LEFT_PAREN); }
		public TerminalNode LEFT_PAREN(int i) {
			return getToken(SqlBaseParser.LEFT_PAREN, i);
		}
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public PivotColumnContext pivotColumn() {
			return getRuleContext(PivotColumnContext.class,0);
		}
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public List<TerminalNode> RIGHT_PAREN() { return getTokens(SqlBaseParser.RIGHT_PAREN); }
		public TerminalNode RIGHT_PAREN(int i) {
			return getToken(SqlBaseParser.RIGHT_PAREN, i);
		}
		public NamedExpressionSeqContext namedExpressionSeq() {
			return getRuleContext(NamedExpressionSeqContext.class,0);
		}
		public List<PivotValueContext> pivotValue() {
			return getRuleContexts(PivotValueContext.class);
		}
		public PivotValueContext pivotValue(int i) {
			return getRuleContext(PivotValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public PivotClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pivotClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterPivotClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitPivotClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitPivotClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PivotClauseContext pivotClause() throws RecognitionException {
		PivotClauseContext _localctx = new PivotClauseContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_pivotClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2221);
			match(PIVOT);
			setState(2222);
			match(LEFT_PAREN);
			setState(2223);
			((PivotClauseContext)_localctx).aggregates = namedExpressionSeq();
			setState(2224);
			match(FOR);
			setState(2225);
			pivotColumn();
			setState(2226);
			match(IN);
			setState(2227);
			match(LEFT_PAREN);
			setState(2228);
			((PivotClauseContext)_localctx).pivotValue = pivotValue();
			((PivotClauseContext)_localctx).pivotValues.add(((PivotClauseContext)_localctx).pivotValue);
			setState(2233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2229);
				match(COMMA);
				setState(2230);
				((PivotClauseContext)_localctx).pivotValue = pivotValue();
				((PivotClauseContext)_localctx).pivotValues.add(((PivotClauseContext)_localctx).pivotValue);
				}
				}
				setState(2235);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2236);
			match(RIGHT_PAREN);
			setState(2237);
			match(RIGHT_PAREN);
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

	public static class PivotColumnContext extends ParserRuleContext {
		public IdentifierContext identifier;
		public List<IdentifierContext> identifiers = new ArrayList<IdentifierContext>();
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public PivotColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pivotColumn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterPivotColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitPivotColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitPivotColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PivotColumnContext pivotColumn() throws RecognitionException {
		PivotColumnContext _localctx = new PivotColumnContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_pivotColumn);
		int _la;
		try {
			setState(2251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,274,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2239);
				((PivotColumnContext)_localctx).identifier = identifier();
				((PivotColumnContext)_localctx).identifiers.add(((PivotColumnContext)_localctx).identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2240);
				match(LEFT_PAREN);
				setState(2241);
				((PivotColumnContext)_localctx).identifier = identifier();
				((PivotColumnContext)_localctx).identifiers.add(((PivotColumnContext)_localctx).identifier);
				setState(2246);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2242);
					match(COMMA);
					setState(2243);
					((PivotColumnContext)_localctx).identifier = identifier();
					((PivotColumnContext)_localctx).identifiers.add(((PivotColumnContext)_localctx).identifier);
					}
					}
					setState(2248);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2249);
				match(RIGHT_PAREN);
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

	public static class PivotValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public PivotValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pivotValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterPivotValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitPivotValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitPivotValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PivotValueContext pivotValue() throws RecognitionException {
		PivotValueContext _localctx = new PivotValueContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_pivotValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2253);
			expression();
			setState(2258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,276,_ctx) ) {
			case 1:
				{
				setState(2255);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,275,_ctx) ) {
				case 1:
					{
					setState(2254);
					match(AS);
					}
					break;
				}
				setState(2257);
				identifier();
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

	public static class UnpivotClauseContext extends ParserRuleContext {
		public UnpivotNullClauseContext nullOperator;
		public UnpivotOperatorContext operator;
		public TerminalNode UNPIVOT() { return getToken(SqlBaseParser.UNPIVOT, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public UnpivotOperatorContext unpivotOperator() {
			return getRuleContext(UnpivotOperatorContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public UnpivotNullClauseContext unpivotNullClause() {
			return getRuleContext(UnpivotNullClauseContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public UnpivotClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unpivotClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterUnpivotClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitUnpivotClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitUnpivotClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnpivotClauseContext unpivotClause() throws RecognitionException {
		UnpivotClauseContext _localctx = new UnpivotClauseContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_unpivotClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2260);
			match(UNPIVOT);
			setState(2262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXCLUDE || _la==INCLUDE) {
				{
				setState(2261);
				((UnpivotClauseContext)_localctx).nullOperator = unpivotNullClause();
				}
			}

			setState(2264);
			match(LEFT_PAREN);
			setState(2265);
			((UnpivotClauseContext)_localctx).operator = unpivotOperator();
			setState(2266);
			match(RIGHT_PAREN);
			setState(2271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,279,_ctx) ) {
			case 1:
				{
				setState(2268);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,278,_ctx) ) {
				case 1:
					{
					setState(2267);
					match(AS);
					}
					break;
				}
				setState(2270);
				identifier();
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

	public static class UnpivotNullClauseContext extends ParserRuleContext {
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public TerminalNode INCLUDE() { return getToken(SqlBaseParser.INCLUDE, 0); }
		public TerminalNode EXCLUDE() { return getToken(SqlBaseParser.EXCLUDE, 0); }
		public UnpivotNullClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unpivotNullClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterUnpivotNullClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitUnpivotNullClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitUnpivotNullClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnpivotNullClauseContext unpivotNullClause() throws RecognitionException {
		UnpivotNullClauseContext _localctx = new UnpivotNullClauseContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_unpivotNullClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2273);
			_la = _input.LA(1);
			if ( !(_la==EXCLUDE || _la==INCLUDE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2274);
			match(NULLS);
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

	public static class UnpivotOperatorContext extends ParserRuleContext {
		public UnpivotSingleValueColumnClauseContext unpivotSingleValueColumnClause() {
			return getRuleContext(UnpivotSingleValueColumnClauseContext.class,0);
		}
		public UnpivotMultiValueColumnClauseContext unpivotMultiValueColumnClause() {
			return getRuleContext(UnpivotMultiValueColumnClauseContext.class,0);
		}
		public UnpivotOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unpivotOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterUnpivotOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitUnpivotOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitUnpivotOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnpivotOperatorContext unpivotOperator() throws RecognitionException {
		UnpivotOperatorContext _localctx = new UnpivotOperatorContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_unpivotOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,280,_ctx) ) {
			case 1:
				{
				setState(2276);
				unpivotSingleValueColumnClause();
				}
				break;
			case 2:
				{
				setState(2277);
				unpivotMultiValueColumnClause();
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

	public static class UnpivotSingleValueColumnClauseContext extends ParserRuleContext {
		public UnpivotColumnAndAliasContext unpivotColumnAndAlias;
		public List<UnpivotColumnAndAliasContext> unpivotColumns = new ArrayList<UnpivotColumnAndAliasContext>();
		public UnpivotValueColumnContext unpivotValueColumn() {
			return getRuleContext(UnpivotValueColumnContext.class,0);
		}
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public UnpivotNameColumnContext unpivotNameColumn() {
			return getRuleContext(UnpivotNameColumnContext.class,0);
		}
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public List<UnpivotColumnAndAliasContext> unpivotColumnAndAlias() {
			return getRuleContexts(UnpivotColumnAndAliasContext.class);
		}
		public UnpivotColumnAndAliasContext unpivotColumnAndAlias(int i) {
			return getRuleContext(UnpivotColumnAndAliasContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public UnpivotSingleValueColumnClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unpivotSingleValueColumnClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterUnpivotSingleValueColumnClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitUnpivotSingleValueColumnClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitUnpivotSingleValueColumnClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnpivotSingleValueColumnClauseContext unpivotSingleValueColumnClause() throws RecognitionException {
		UnpivotSingleValueColumnClauseContext _localctx = new UnpivotSingleValueColumnClauseContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_unpivotSingleValueColumnClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2280);
			unpivotValueColumn();
			setState(2281);
			match(FOR);
			setState(2282);
			unpivotNameColumn();
			setState(2283);
			match(IN);
			setState(2284);
			match(LEFT_PAREN);
			setState(2285);
			((UnpivotSingleValueColumnClauseContext)_localctx).unpivotColumnAndAlias = unpivotColumnAndAlias();
			((UnpivotSingleValueColumnClauseContext)_localctx).unpivotColumns.add(((UnpivotSingleValueColumnClauseContext)_localctx).unpivotColumnAndAlias);
			setState(2290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2286);
				match(COMMA);
				setState(2287);
				((UnpivotSingleValueColumnClauseContext)_localctx).unpivotColumnAndAlias = unpivotColumnAndAlias();
				((UnpivotSingleValueColumnClauseContext)_localctx).unpivotColumns.add(((UnpivotSingleValueColumnClauseContext)_localctx).unpivotColumnAndAlias);
				}
				}
				setState(2292);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2293);
			match(RIGHT_PAREN);
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

	public static class UnpivotMultiValueColumnClauseContext extends ParserRuleContext {
		public UnpivotValueColumnContext unpivotValueColumn;
		public List<UnpivotValueColumnContext> unpivotValueColumns = new ArrayList<UnpivotValueColumnContext>();
		public UnpivotColumnSetContext unpivotColumnSet;
		public List<UnpivotColumnSetContext> unpivotColumnSets = new ArrayList<UnpivotColumnSetContext>();
		public List<TerminalNode> LEFT_PAREN() { return getTokens(SqlBaseParser.LEFT_PAREN); }
		public TerminalNode LEFT_PAREN(int i) {
			return getToken(SqlBaseParser.LEFT_PAREN, i);
		}
		public List<TerminalNode> RIGHT_PAREN() { return getTokens(SqlBaseParser.RIGHT_PAREN); }
		public TerminalNode RIGHT_PAREN(int i) {
			return getToken(SqlBaseParser.RIGHT_PAREN, i);
		}
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public UnpivotNameColumnContext unpivotNameColumn() {
			return getRuleContext(UnpivotNameColumnContext.class,0);
		}
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public List<UnpivotValueColumnContext> unpivotValueColumn() {
			return getRuleContexts(UnpivotValueColumnContext.class);
		}
		public UnpivotValueColumnContext unpivotValueColumn(int i) {
			return getRuleContext(UnpivotValueColumnContext.class,i);
		}
		public List<UnpivotColumnSetContext> unpivotColumnSet() {
			return getRuleContexts(UnpivotColumnSetContext.class);
		}
		public UnpivotColumnSetContext unpivotColumnSet(int i) {
			return getRuleContext(UnpivotColumnSetContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public UnpivotMultiValueColumnClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unpivotMultiValueColumnClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterUnpivotMultiValueColumnClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitUnpivotMultiValueColumnClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitUnpivotMultiValueColumnClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnpivotMultiValueColumnClauseContext unpivotMultiValueColumnClause() throws RecognitionException {
		UnpivotMultiValueColumnClauseContext _localctx = new UnpivotMultiValueColumnClauseContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_unpivotMultiValueColumnClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2295);
			match(LEFT_PAREN);
			setState(2296);
			((UnpivotMultiValueColumnClauseContext)_localctx).unpivotValueColumn = unpivotValueColumn();
			((UnpivotMultiValueColumnClauseContext)_localctx).unpivotValueColumns.add(((UnpivotMultiValueColumnClauseContext)_localctx).unpivotValueColumn);
			setState(2301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2297);
				match(COMMA);
				setState(2298);
				((UnpivotMultiValueColumnClauseContext)_localctx).unpivotValueColumn = unpivotValueColumn();
				((UnpivotMultiValueColumnClauseContext)_localctx).unpivotValueColumns.add(((UnpivotMultiValueColumnClauseContext)_localctx).unpivotValueColumn);
				}
				}
				setState(2303);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2304);
			match(RIGHT_PAREN);
			setState(2305);
			match(FOR);
			setState(2306);
			unpivotNameColumn();
			setState(2307);
			match(IN);
			setState(2308);
			match(LEFT_PAREN);
			setState(2309);
			((UnpivotMultiValueColumnClauseContext)_localctx).unpivotColumnSet = unpivotColumnSet();
			((UnpivotMultiValueColumnClauseContext)_localctx).unpivotColumnSets.add(((UnpivotMultiValueColumnClauseContext)_localctx).unpivotColumnSet);
			setState(2314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2310);
				match(COMMA);
				setState(2311);
				((UnpivotMultiValueColumnClauseContext)_localctx).unpivotColumnSet = unpivotColumnSet();
				((UnpivotMultiValueColumnClauseContext)_localctx).unpivotColumnSets.add(((UnpivotMultiValueColumnClauseContext)_localctx).unpivotColumnSet);
				}
				}
				setState(2316);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2317);
			match(RIGHT_PAREN);
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

	public static class UnpivotColumnSetContext extends ParserRuleContext {
		public UnpivotColumnContext unpivotColumn;
		public List<UnpivotColumnContext> unpivotColumns = new ArrayList<UnpivotColumnContext>();
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public List<UnpivotColumnContext> unpivotColumn() {
			return getRuleContexts(UnpivotColumnContext.class);
		}
		public UnpivotColumnContext unpivotColumn(int i) {
			return getRuleContext(UnpivotColumnContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public UnpivotAliasContext unpivotAlias() {
			return getRuleContext(UnpivotAliasContext.class,0);
		}
		public UnpivotColumnSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unpivotColumnSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterUnpivotColumnSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitUnpivotColumnSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitUnpivotColumnSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnpivotColumnSetContext unpivotColumnSet() throws RecognitionException {
		UnpivotColumnSetContext _localctx = new UnpivotColumnSetContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_unpivotColumnSet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2319);
			match(LEFT_PAREN);
			setState(2320);
			((UnpivotColumnSetContext)_localctx).unpivotColumn = unpivotColumn();
			((UnpivotColumnSetContext)_localctx).unpivotColumns.add(((UnpivotColumnSetContext)_localctx).unpivotColumn);
			setState(2325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2321);
				match(COMMA);
				setState(2322);
				((UnpivotColumnSetContext)_localctx).unpivotColumn = unpivotColumn();
				((UnpivotColumnSetContext)_localctx).unpivotColumns.add(((UnpivotColumnSetContext)_localctx).unpivotColumn);
				}
				}
				setState(2327);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2328);
			match(RIGHT_PAREN);
			setState(2330);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,285,_ctx) ) {
			case 1:
				{
				setState(2329);
				unpivotAlias();
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

	public static class UnpivotValueColumnContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public UnpivotValueColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unpivotValueColumn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterUnpivotValueColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitUnpivotValueColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitUnpivotValueColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnpivotValueColumnContext unpivotValueColumn() throws RecognitionException {
		UnpivotValueColumnContext _localctx = new UnpivotValueColumnContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_unpivotValueColumn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2332);
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

	public static class UnpivotNameColumnContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public UnpivotNameColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unpivotNameColumn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterUnpivotNameColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitUnpivotNameColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitUnpivotNameColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnpivotNameColumnContext unpivotNameColumn() throws RecognitionException {
		UnpivotNameColumnContext _localctx = new UnpivotNameColumnContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_unpivotNameColumn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2334);
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

	public static class UnpivotColumnAndAliasContext extends ParserRuleContext {
		public UnpivotColumnContext unpivotColumn() {
			return getRuleContext(UnpivotColumnContext.class,0);
		}
		public UnpivotAliasContext unpivotAlias() {
			return getRuleContext(UnpivotAliasContext.class,0);
		}
		public UnpivotColumnAndAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unpivotColumnAndAlias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterUnpivotColumnAndAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitUnpivotColumnAndAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitUnpivotColumnAndAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnpivotColumnAndAliasContext unpivotColumnAndAlias() throws RecognitionException {
		UnpivotColumnAndAliasContext _localctx = new UnpivotColumnAndAliasContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_unpivotColumnAndAlias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2336);
			unpivotColumn();
			setState(2338);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,286,_ctx) ) {
			case 1:
				{
				setState(2337);
				unpivotAlias();
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

	public static class UnpivotColumnContext extends ParserRuleContext {
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public UnpivotColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unpivotColumn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterUnpivotColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitUnpivotColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitUnpivotColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnpivotColumnContext unpivotColumn() throws RecognitionException {
		UnpivotColumnContext _localctx = new UnpivotColumnContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_unpivotColumn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2340);
			multipartIdentifier();
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

	public static class UnpivotAliasContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public UnpivotAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unpivotAlias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterUnpivotAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitUnpivotAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitUnpivotAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnpivotAliasContext unpivotAlias() throws RecognitionException {
		UnpivotAliasContext _localctx = new UnpivotAliasContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_unpivotAlias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2343);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,287,_ctx) ) {
			case 1:
				{
				setState(2342);
				match(AS);
				}
				break;
			}
			setState(2345);
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

	public static class LateralViewContext extends ParserRuleContext {
		public IdentifierContext tblName;
		public IdentifierContext identifier;
		public List<IdentifierContext> colName = new ArrayList<IdentifierContext>();
		public TerminalNode LATERAL() { return getToken(SqlBaseParser.LATERAL, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode OUTER() { return getToken(SqlBaseParser.OUTER, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public LateralViewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lateralView; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterLateralView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitLateralView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitLateralView(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LateralViewContext lateralView() throws RecognitionException {
		LateralViewContext _localctx = new LateralViewContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_lateralView);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2347);
			match(LATERAL);
			setState(2348);
			match(VIEW);
			setState(2350);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,288,_ctx) ) {
			case 1:
				{
				setState(2349);
				match(OUTER);
				}
				break;
			}
			setState(2352);
			qualifiedName();
			setState(2353);
			match(LEFT_PAREN);
			setState(2362);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,290,_ctx) ) {
			case 1:
				{
				setState(2354);
				expression();
				setState(2359);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2355);
					match(COMMA);
					setState(2356);
					expression();
					}
					}
					setState(2361);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(2364);
			match(RIGHT_PAREN);
			setState(2365);
			((LateralViewContext)_localctx).tblName = identifier();
			setState(2377);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,293,_ctx) ) {
			case 1:
				{
				setState(2367);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,291,_ctx) ) {
				case 1:
					{
					setState(2366);
					match(AS);
					}
					break;
				}
				setState(2369);
				((LateralViewContext)_localctx).identifier = identifier();
				((LateralViewContext)_localctx).colName.add(((LateralViewContext)_localctx).identifier);
				setState(2374);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,292,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2370);
						match(COMMA);
						setState(2371);
						((LateralViewContext)_localctx).identifier = identifier();
						((LateralViewContext)_localctx).colName.add(((LateralViewContext)_localctx).identifier);
						}
						} 
					}
					setState(2376);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,292,_ctx);
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

	public static class SetQuantifierContext extends ParserRuleContext {
		public TerminalNode DISTINCT() { return getToken(SqlBaseParser.DISTINCT, 0); }
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public SetQuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setQuantifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSetQuantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSetQuantifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitSetQuantifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetQuantifierContext setQuantifier() throws RecognitionException {
		SetQuantifierContext _localctx = new SetQuantifierContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_setQuantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2379);
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

	public static class RelationContext extends ParserRuleContext {
		public RelationPrimaryContext relationPrimary() {
			return getRuleContext(RelationPrimaryContext.class,0);
		}
		public TerminalNode LATERAL() { return getToken(SqlBaseParser.LATERAL, 0); }
		public List<RelationExtensionContext> relationExtension() {
			return getRuleContexts(RelationExtensionContext.class);
		}
		public RelationExtensionContext relationExtension(int i) {
			return getRuleContext(RelationExtensionContext.class,i);
		}
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationContext relation() throws RecognitionException {
		RelationContext _localctx = new RelationContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_relation);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2382);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,294,_ctx) ) {
			case 1:
				{
				setState(2381);
				match(LATERAL);
				}
				break;
			}
			setState(2384);
			relationPrimary();
			setState(2388);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,295,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2385);
					relationExtension();
					}
					} 
				}
				setState(2390);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,295,_ctx);
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

	public static class RelationExtensionContext extends ParserRuleContext {
		public JoinRelationContext joinRelation() {
			return getRuleContext(JoinRelationContext.class,0);
		}
		public PivotClauseContext pivotClause() {
			return getRuleContext(PivotClauseContext.class,0);
		}
		public UnpivotClauseContext unpivotClause() {
			return getRuleContext(UnpivotClauseContext.class,0);
		}
		public RelationExtensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationExtension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterRelationExtension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitRelationExtension(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitRelationExtension(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationExtensionContext relationExtension() throws RecognitionException {
		RelationExtensionContext _localctx = new RelationExtensionContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_relationExtension);
		try {
			setState(2394);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ANTI:
			case CROSS:
			case FULL:
			case INNER:
			case JOIN:
			case LEFT:
			case NATURAL:
			case RIGHT:
			case SEMI:
				enterOuterAlt(_localctx, 1);
				{
				setState(2391);
				joinRelation();
				}
				break;
			case PIVOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2392);
				pivotClause();
				}
				break;
			case UNPIVOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(2393);
				unpivotClause();
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

	public static class JoinRelationContext extends ParserRuleContext {
		public RelationPrimaryContext right;
		public TerminalNode JOIN() { return getToken(SqlBaseParser.JOIN, 0); }
		public RelationPrimaryContext relationPrimary() {
			return getRuleContext(RelationPrimaryContext.class,0);
		}
		public JoinTypeContext joinType() {
			return getRuleContext(JoinTypeContext.class,0);
		}
		public TerminalNode LATERAL() { return getToken(SqlBaseParser.LATERAL, 0); }
		public JoinCriteriaContext joinCriteria() {
			return getRuleContext(JoinCriteriaContext.class,0);
		}
		public TerminalNode NATURAL() { return getToken(SqlBaseParser.NATURAL, 0); }
		public JoinRelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinRelation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterJoinRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitJoinRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitJoinRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinRelationContext joinRelation() throws RecognitionException {
		JoinRelationContext _localctx = new JoinRelationContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_joinRelation);
		try {
			setState(2413);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ANTI:
			case CROSS:
			case FULL:
			case INNER:
			case JOIN:
			case LEFT:
			case RIGHT:
			case SEMI:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(2396);
				joinType();
				}
				setState(2397);
				match(JOIN);
				setState(2399);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,297,_ctx) ) {
				case 1:
					{
					setState(2398);
					match(LATERAL);
					}
					break;
				}
				setState(2401);
				((JoinRelationContext)_localctx).right = relationPrimary();
				setState(2403);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,298,_ctx) ) {
				case 1:
					{
					setState(2402);
					joinCriteria();
					}
					break;
				}
				}
				break;
			case NATURAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(2405);
				match(NATURAL);
				setState(2406);
				joinType();
				setState(2407);
				match(JOIN);
				setState(2409);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,299,_ctx) ) {
				case 1:
					{
					setState(2408);
					match(LATERAL);
					}
					break;
				}
				setState(2411);
				((JoinRelationContext)_localctx).right = relationPrimary();
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

	public static class JoinTypeContext extends ParserRuleContext {
		public TerminalNode INNER() { return getToken(SqlBaseParser.INNER, 0); }
		public TerminalNode CROSS() { return getToken(SqlBaseParser.CROSS, 0); }
		public TerminalNode LEFT() { return getToken(SqlBaseParser.LEFT, 0); }
		public TerminalNode OUTER() { return getToken(SqlBaseParser.OUTER, 0); }
		public TerminalNode SEMI() { return getToken(SqlBaseParser.SEMI, 0); }
		public TerminalNode RIGHT() { return getToken(SqlBaseParser.RIGHT, 0); }
		public TerminalNode FULL() { return getToken(SqlBaseParser.FULL, 0); }
		public TerminalNode ANTI() { return getToken(SqlBaseParser.ANTI, 0); }
		public JoinTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterJoinType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitJoinType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitJoinType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinTypeContext joinType() throws RecognitionException {
		JoinTypeContext _localctx = new JoinTypeContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_joinType);
		int _la;
		try {
			setState(2439);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,307,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2416);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INNER) {
					{
					setState(2415);
					match(INNER);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2418);
				match(CROSS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2419);
				match(LEFT);
				setState(2421);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(2420);
					match(OUTER);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2424);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT) {
					{
					setState(2423);
					match(LEFT);
					}
				}

				setState(2426);
				match(SEMI);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2427);
				match(RIGHT);
				setState(2429);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(2428);
					match(OUTER);
					}
				}

				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2431);
				match(FULL);
				setState(2433);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(2432);
					match(OUTER);
					}
				}

				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2436);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT) {
					{
					setState(2435);
					match(LEFT);
					}
				}

				setState(2438);
				match(ANTI);
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

	public static class JoinCriteriaContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public JoinCriteriaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinCriteria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterJoinCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitJoinCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitJoinCriteria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinCriteriaContext joinCriteria() throws RecognitionException {
		JoinCriteriaContext _localctx = new JoinCriteriaContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_joinCriteria);
		try {
			setState(2445);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(2441);
				match(ON);
				setState(2442);
				booleanExpression(0);
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(2443);
				match(USING);
				setState(2444);
				identifierList();
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

	public static class SampleContext extends ParserRuleContext {
		public Token seed;
		public TerminalNode TABLESAMPLE() { return getToken(SqlBaseParser.TABLESAMPLE, 0); }
		public List<TerminalNode> LEFT_PAREN() { return getTokens(SqlBaseParser.LEFT_PAREN); }
		public TerminalNode LEFT_PAREN(int i) {
			return getToken(SqlBaseParser.LEFT_PAREN, i);
		}
		public List<TerminalNode> RIGHT_PAREN() { return getTokens(SqlBaseParser.RIGHT_PAREN); }
		public TerminalNode RIGHT_PAREN(int i) {
			return getToken(SqlBaseParser.RIGHT_PAREN, i);
		}
		public SampleMethodContext sampleMethod() {
			return getRuleContext(SampleMethodContext.class,0);
		}
		public TerminalNode REPEATABLE() { return getToken(SqlBaseParser.REPEATABLE, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public SampleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sample; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSample(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSample(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitSample(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SampleContext sample() throws RecognitionException {
		SampleContext _localctx = new SampleContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_sample);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2447);
			match(TABLESAMPLE);
			setState(2448);
			match(LEFT_PAREN);
			setState(2450);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,309,_ctx) ) {
			case 1:
				{
				setState(2449);
				sampleMethod();
				}
				break;
			}
			setState(2452);
			match(RIGHT_PAREN);
			setState(2457);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,310,_ctx) ) {
			case 1:
				{
				setState(2453);
				match(REPEATABLE);
				setState(2454);
				match(LEFT_PAREN);
				setState(2455);
				((SampleContext)_localctx).seed = match(INTEGER_VALUE);
				setState(2456);
				match(RIGHT_PAREN);
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

	public static class SampleMethodContext extends ParserRuleContext {
		public SampleMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sampleMethod; }
	 
		public SampleMethodContext() { }
		public void copyFrom(SampleMethodContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SampleByRowsContext extends SampleMethodContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ROWS() { return getToken(SqlBaseParser.ROWS, 0); }
		public SampleByRowsContext(SampleMethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSampleByRows(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSampleByRows(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitSampleByRows(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SampleByPercentileContext extends SampleMethodContext {
		public Token negativeSign;
		public Token percentage;
		public TerminalNode PERCENTLIT() { return getToken(SqlBaseParser.PERCENTLIT, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(SqlBaseParser.DECIMAL_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public SampleByPercentileContext(SampleMethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSampleByPercentile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSampleByPercentile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitSampleByPercentile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SampleByBucketContext extends SampleMethodContext {
		public Token sampleType;
		public Token numerator;
		public Token denominator;
		public TerminalNode OUT() { return getToken(SqlBaseParser.OUT, 0); }
		public TerminalNode OF() { return getToken(SqlBaseParser.OF, 0); }
		public TerminalNode BUCKET() { return getToken(SqlBaseParser.BUCKET, 0); }
		public List<TerminalNode> INTEGER_VALUE() { return getTokens(SqlBaseParser.INTEGER_VALUE); }
		public TerminalNode INTEGER_VALUE(int i) {
			return getToken(SqlBaseParser.INTEGER_VALUE, i);
		}
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public SampleByBucketContext(SampleMethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSampleByBucket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSampleByBucket(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitSampleByBucket(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SampleByBytesContext extends SampleMethodContext {
		public ExpressionContext bytes;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SampleByBytesContext(SampleMethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSampleByBytes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSampleByBytes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitSampleByBytes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SampleMethodContext sampleMethod() throws RecognitionException {
		SampleMethodContext _localctx = new SampleMethodContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_sampleMethod);
		int _la;
		try {
			setState(2483);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,314,_ctx) ) {
			case 1:
				_localctx = new SampleByPercentileContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2460);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2459);
					((SampleByPercentileContext)_localctx).negativeSign = match(MINUS);
					}
				}

				setState(2462);
				((SampleByPercentileContext)_localctx).percentage = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INTEGER_VALUE || _la==DECIMAL_VALUE) ) {
					((SampleByPercentileContext)_localctx).percentage = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2463);
				match(PERCENTLIT);
				}
				break;
			case 2:
				_localctx = new SampleByRowsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2464);
				expression();
				setState(2465);
				match(ROWS);
				}
				break;
			case 3:
				_localctx = new SampleByBucketContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2467);
				((SampleByBucketContext)_localctx).sampleType = match(BUCKET);
				setState(2468);
				((SampleByBucketContext)_localctx).numerator = match(INTEGER_VALUE);
				setState(2469);
				match(OUT);
				setState(2470);
				match(OF);
				setState(2471);
				((SampleByBucketContext)_localctx).denominator = match(INTEGER_VALUE);
				setState(2480);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(2472);
					match(ON);
					setState(2478);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,312,_ctx) ) {
					case 1:
						{
						setState(2473);
						identifier();
						}
						break;
					case 2:
						{
						setState(2474);
						qualifiedName();
						setState(2475);
						match(LEFT_PAREN);
						setState(2476);
						match(RIGHT_PAREN);
						}
						break;
					}
					}
				}

				}
				break;
			case 4:
				_localctx = new SampleByBytesContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2482);
				((SampleByBytesContext)_localctx).bytes = expression();
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

	public static class IdentifierListContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_identifierList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2485);
			match(LEFT_PAREN);
			setState(2486);
			identifierSeq();
			setState(2487);
			match(RIGHT_PAREN);
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

	public static class IdentifierSeqContext extends ParserRuleContext {
		public List<CapturingIdentContext> capturingIdent() {
			return getRuleContexts(CapturingIdentContext.class);
		}
		public CapturingIdentContext capturingIdent(int i) {
			return getRuleContext(CapturingIdentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public IdentifierSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterIdentifierSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitIdentifierSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitIdentifierSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierSeqContext identifierSeq() throws RecognitionException {
		IdentifierSeqContext _localctx = new IdentifierSeqContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_identifierSeq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2489);
			capturingIdent();
			setState(2494);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,315,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2490);
					match(COMMA);
					setState(2491);
					capturingIdent();
					}
					} 
				}
				setState(2496);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,315,_ctx);
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

	public static class CapturingIdentContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext errorCapturingIdentifier;
		public List<ErrorCapturingIdentifierContext> ident = new ArrayList<ErrorCapturingIdentifierContext>();
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public CapturingIdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capturingIdent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterCapturingIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitCapturingIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitCapturingIdent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CapturingIdentContext capturingIdent() throws RecognitionException {
		CapturingIdentContext _localctx = new CapturingIdentContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_capturingIdent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2497);
			((CapturingIdentContext)_localctx).errorCapturingIdentifier = errorCapturingIdentifier();
			((CapturingIdentContext)_localctx).ident.add(((CapturingIdentContext)_localctx).errorCapturingIdentifier);
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

	public static class OrderedIdentifierListContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public List<OrderedIdentifierContext> orderedIdentifier() {
			return getRuleContexts(OrderedIdentifierContext.class);
		}
		public OrderedIdentifierContext orderedIdentifier(int i) {
			return getRuleContext(OrderedIdentifierContext.class,i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public OrderedIdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderedIdentifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterOrderedIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitOrderedIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitOrderedIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderedIdentifierListContext orderedIdentifierList() throws RecognitionException {
		OrderedIdentifierListContext _localctx = new OrderedIdentifierListContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_orderedIdentifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2499);
			match(LEFT_PAREN);
			setState(2500);
			orderedIdentifier();
			setState(2505);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2501);
				match(COMMA);
				setState(2502);
				orderedIdentifier();
				}
				}
				setState(2507);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2508);
			match(RIGHT_PAREN);
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

	public static class OrderedIdentifierContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext ident;
		public Token ordering;
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public TerminalNode ASC() { return getToken(SqlBaseParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public OrderedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderedIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterOrderedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitOrderedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitOrderedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderedIdentifierContext orderedIdentifier() throws RecognitionException {
		OrderedIdentifierContext _localctx = new OrderedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_orderedIdentifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2510);
			((OrderedIdentifierContext)_localctx).ident = errorCapturingIdentifier();
			setState(2512);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(2511);
				((OrderedIdentifierContext)_localctx).ordering = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((OrderedIdentifierContext)_localctx).ordering = (Token)_errHandler.recoverInline(this);
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

	public static class IdentifierCommentListContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public List<IdentifierCommentContext> identifierComment() {
			return getRuleContexts(IdentifierCommentContext.class);
		}
		public IdentifierCommentContext identifierComment(int i) {
			return getRuleContext(IdentifierCommentContext.class,i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public IdentifierCommentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierCommentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterIdentifierCommentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitIdentifierCommentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitIdentifierCommentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierCommentListContext identifierCommentList() throws RecognitionException {
		IdentifierCommentListContext _localctx = new IdentifierCommentListContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_identifierCommentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2514);
			match(LEFT_PAREN);
			setState(2515);
			identifierComment();
			setState(2520);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2516);
				match(COMMA);
				setState(2517);
				identifierComment();
				}
				}
				setState(2522);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2523);
			match(RIGHT_PAREN);
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

	public static class IdentifierCommentContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public CommentSpecContext commentSpec() {
			return getRuleContext(CommentSpecContext.class,0);
		}
		public IdentifierCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierComment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterIdentifierComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitIdentifierComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitIdentifierComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierCommentContext identifierComment() throws RecognitionException {
		IdentifierCommentContext _localctx = new IdentifierCommentContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_identifierComment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2525);
			identifier();
			setState(2527);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(2526);
				commentSpec();
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
	public static class TableValuedFunctionContext extends RelationPrimaryContext {
		public FunctionTableContext functionTable() {
			return getRuleContext(FunctionTableContext.class,0);
		}
		public TableValuedFunctionContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterTableValuedFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitTableValuedFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitTableValuedFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InlineTableDefault2Context extends RelationPrimaryContext {
		public InlineTableContext inlineTable() {
			return getRuleContext(InlineTableContext.class,0);
		}
		public InlineTableDefault2Context(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterInlineTableDefault2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitInlineTableDefault2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitInlineTableDefault2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AliasedRelationContext extends RelationPrimaryContext {
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public SampleContext sample() {
			return getRuleContext(SampleContext.class,0);
		}
		public AliasedRelationContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterAliasedRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitAliasedRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitAliasedRelation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AliasedQueryContext extends RelationPrimaryContext {
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public SampleContext sample() {
			return getRuleContext(SampleContext.class,0);
		}
		public AliasedQueryContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterAliasedQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitAliasedQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitAliasedQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableNameContext extends RelationPrimaryContext {
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public TemporalClauseContext temporalClause() {
			return getRuleContext(TemporalClauseContext.class,0);
		}
		public SampleContext sample() {
			return getRuleContext(SampleContext.class,0);
		}
		public TableNameContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitTableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationPrimaryContext relationPrimary() throws RecognitionException {
		RelationPrimaryContext _localctx = new RelationPrimaryContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_relationPrimary);
		try {
			setState(2556);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,324,_ctx) ) {
			case 1:
				_localctx = new TableNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2529);
				multipartIdentifier();
				setState(2531);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,320,_ctx) ) {
				case 1:
					{
					setState(2530);
					temporalClause();
					}
					break;
				}
				setState(2534);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,321,_ctx) ) {
				case 1:
					{
					setState(2533);
					sample();
					}
					break;
				}
				setState(2536);
				tableAlias();
				}
				break;
			case 2:
				_localctx = new AliasedQueryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2538);
				match(LEFT_PAREN);
				setState(2539);
				query();
				setState(2540);
				match(RIGHT_PAREN);
				setState(2542);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,322,_ctx) ) {
				case 1:
					{
					setState(2541);
					sample();
					}
					break;
				}
				setState(2544);
				tableAlias();
				}
				break;
			case 3:
				_localctx = new AliasedRelationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2546);
				match(LEFT_PAREN);
				setState(2547);
				relation();
				setState(2548);
				match(RIGHT_PAREN);
				setState(2550);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,323,_ctx) ) {
				case 1:
					{
					setState(2549);
					sample();
					}
					break;
				}
				setState(2552);
				tableAlias();
				}
				break;
			case 4:
				_localctx = new InlineTableDefault2Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2554);
				inlineTable();
				}
				break;
			case 5:
				_localctx = new TableValuedFunctionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2555);
				functionTable();
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

	public static class InlineTableContext extends ParserRuleContext {
		public TerminalNode VALUES() { return getToken(SqlBaseParser.VALUES, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public InlineTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterInlineTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitInlineTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitInlineTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InlineTableContext inlineTable() throws RecognitionException {
		InlineTableContext _localctx = new InlineTableContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_inlineTable);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2558);
			match(VALUES);
			setState(2559);
			expression();
			setState(2564);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,325,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2560);
					match(COMMA);
					setState(2561);
					expression();
					}
					} 
				}
				setState(2566);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,325,_ctx);
			}
			setState(2567);
			tableAlias();
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

	public static class FunctionTableContext extends ParserRuleContext {
		public FunctionNameContext funcName;
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public FunctionTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterFunctionTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitFunctionTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitFunctionTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionTableContext functionTable() throws RecognitionException {
		FunctionTableContext _localctx = new FunctionTableContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_functionTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2569);
			((FunctionTableContext)_localctx).funcName = functionName();
			setState(2570);
			match(LEFT_PAREN);
			setState(2579);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,327,_ctx) ) {
			case 1:
				{
				setState(2571);
				expression();
				setState(2576);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2572);
					match(COMMA);
					setState(2573);
					expression();
					}
					}
					setState(2578);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(2581);
			match(RIGHT_PAREN);
			setState(2582);
			tableAlias();
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

	public static class TableAliasContext extends ParserRuleContext {
		public StrictIdentifierContext strictIdentifier() {
			return getRuleContext(StrictIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TableAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableAlias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterTableAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitTableAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitTableAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableAliasContext tableAlias() throws RecognitionException {
		TableAliasContext _localctx = new TableAliasContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_tableAlias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2591);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,330,_ctx) ) {
			case 1:
				{
				setState(2585);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,328,_ctx) ) {
				case 1:
					{
					setState(2584);
					match(AS);
					}
					break;
				}
				setState(2587);
				strictIdentifier();
				setState(2589);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,329,_ctx) ) {
				case 1:
					{
					setState(2588);
					identifierList();
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

	public static class RowFormatContext extends ParserRuleContext {
		public RowFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowFormat; }
	 
		public RowFormatContext() { }
		public void copyFrom(RowFormatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RowFormatSerdeContext extends RowFormatContext {
		public StringLitContext name;
		public PropertyListContext props;
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public TerminalNode FORMAT() { return getToken(SqlBaseParser.FORMAT, 0); }
		public TerminalNode SERDE() { return getToken(SqlBaseParser.SERDE, 0); }
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SqlBaseParser.SERDEPROPERTIES, 0); }
		public PropertyListContext propertyList() {
			return getRuleContext(PropertyListContext.class,0);
		}
		public RowFormatSerdeContext(RowFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterRowFormatSerde(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitRowFormatSerde(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitRowFormatSerde(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RowFormatDelimitedContext extends RowFormatContext {
		public StringLitContext fieldsTerminatedBy;
		public StringLitContext escapedBy;
		public StringLitContext collectionItemsTerminatedBy;
		public StringLitContext keysTerminatedBy;
		public StringLitContext linesSeparatedBy;
		public StringLitContext nullDefinedAs;
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public TerminalNode FORMAT() { return getToken(SqlBaseParser.FORMAT, 0); }
		public TerminalNode DELIMITED() { return getToken(SqlBaseParser.DELIMITED, 0); }
		public TerminalNode FIELDS() { return getToken(SqlBaseParser.FIELDS, 0); }
		public List<TerminalNode> TERMINATED() { return getTokens(SqlBaseParser.TERMINATED); }
		public TerminalNode TERMINATED(int i) {
			return getToken(SqlBaseParser.TERMINATED, i);
		}
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public TerminalNode COLLECTION() { return getToken(SqlBaseParser.COLLECTION, 0); }
		public TerminalNode ITEMS() { return getToken(SqlBaseParser.ITEMS, 0); }
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode KEYS() { return getToken(SqlBaseParser.KEYS, 0); }
		public TerminalNode LINES() { return getToken(SqlBaseParser.LINES, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public TerminalNode DEFINED() { return getToken(SqlBaseParser.DEFINED, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public List<StringLitContext> stringLit() {
			return getRuleContexts(StringLitContext.class);
		}
		public StringLitContext stringLit(int i) {
			return getRuleContext(StringLitContext.class,i);
		}
		public TerminalNode ESCAPED() { return getToken(SqlBaseParser.ESCAPED, 0); }
		public RowFormatDelimitedContext(RowFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterRowFormatDelimited(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitRowFormatDelimited(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitRowFormatDelimited(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowFormatContext rowFormat() throws RecognitionException {
		RowFormatContext _localctx = new RowFormatContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_rowFormat);
		try {
			setState(2642);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,338,_ctx) ) {
			case 1:
				_localctx = new RowFormatSerdeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2593);
				match(ROW);
				setState(2594);
				match(FORMAT);
				setState(2595);
				match(SERDE);
				setState(2596);
				((RowFormatSerdeContext)_localctx).name = stringLit();
				setState(2600);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,331,_ctx) ) {
				case 1:
					{
					setState(2597);
					match(WITH);
					setState(2598);
					match(SERDEPROPERTIES);
					setState(2599);
					((RowFormatSerdeContext)_localctx).props = propertyList();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new RowFormatDelimitedContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2602);
				match(ROW);
				setState(2603);
				match(FORMAT);
				setState(2604);
				match(DELIMITED);
				setState(2614);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,333,_ctx) ) {
				case 1:
					{
					setState(2605);
					match(FIELDS);
					setState(2606);
					match(TERMINATED);
					setState(2607);
					match(BY);
					setState(2608);
					((RowFormatDelimitedContext)_localctx).fieldsTerminatedBy = stringLit();
					setState(2612);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,332,_ctx) ) {
					case 1:
						{
						setState(2609);
						match(ESCAPED);
						setState(2610);
						match(BY);
						setState(2611);
						((RowFormatDelimitedContext)_localctx).escapedBy = stringLit();
						}
						break;
					}
					}
					break;
				}
				setState(2621);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,334,_ctx) ) {
				case 1:
					{
					setState(2616);
					match(COLLECTION);
					setState(2617);
					match(ITEMS);
					setState(2618);
					match(TERMINATED);
					setState(2619);
					match(BY);
					setState(2620);
					((RowFormatDelimitedContext)_localctx).collectionItemsTerminatedBy = stringLit();
					}
					break;
				}
				setState(2628);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,335,_ctx) ) {
				case 1:
					{
					setState(2623);
					match(MAP);
					setState(2624);
					match(KEYS);
					setState(2625);
					match(TERMINATED);
					setState(2626);
					match(BY);
					setState(2627);
					((RowFormatDelimitedContext)_localctx).keysTerminatedBy = stringLit();
					}
					break;
				}
				setState(2634);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,336,_ctx) ) {
				case 1:
					{
					setState(2630);
					match(LINES);
					setState(2631);
					match(TERMINATED);
					setState(2632);
					match(BY);
					setState(2633);
					((RowFormatDelimitedContext)_localctx).linesSeparatedBy = stringLit();
					}
					break;
				}
				setState(2640);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,337,_ctx) ) {
				case 1:
					{
					setState(2636);
					match(NULL);
					setState(2637);
					match(DEFINED);
					setState(2638);
					match(AS);
					setState(2639);
					((RowFormatDelimitedContext)_localctx).nullDefinedAs = stringLit();
					}
					break;
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

	public static class MultipartIdentifierListContext extends ParserRuleContext {
		public List<MultipartIdentifierContext> multipartIdentifier() {
			return getRuleContexts(MultipartIdentifierContext.class);
		}
		public MultipartIdentifierContext multipartIdentifier(int i) {
			return getRuleContext(MultipartIdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public MultipartIdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipartIdentifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterMultipartIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitMultipartIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitMultipartIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipartIdentifierListContext multipartIdentifierList() throws RecognitionException {
		MultipartIdentifierListContext _localctx = new MultipartIdentifierListContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_multipartIdentifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2644);
			multipartIdentifier();
			setState(2649);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2645);
				match(COMMA);
				setState(2646);
				multipartIdentifier();
				}
				}
				setState(2651);
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

	public static class MultipartIdentifierContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext errorCapturingIdentifier;
		public List<ErrorCapturingIdentifierContext> parts = new ArrayList<ErrorCapturingIdentifierContext>();
		public List<ErrorCapturingIdentifierContext> errorCapturingIdentifier() {
			return getRuleContexts(ErrorCapturingIdentifierContext.class);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier(int i) {
			return getRuleContext(ErrorCapturingIdentifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(SqlBaseParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SqlBaseParser.DOT, i);
		}
		public MultipartIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipartIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterMultipartIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitMultipartIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitMultipartIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipartIdentifierContext multipartIdentifier() throws RecognitionException {
		MultipartIdentifierContext _localctx = new MultipartIdentifierContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_multipartIdentifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2652);
			((MultipartIdentifierContext)_localctx).errorCapturingIdentifier = errorCapturingIdentifier();
			((MultipartIdentifierContext)_localctx).parts.add(((MultipartIdentifierContext)_localctx).errorCapturingIdentifier);
			setState(2657);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,340,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2653);
					match(DOT);
					setState(2654);
					((MultipartIdentifierContext)_localctx).errorCapturingIdentifier = errorCapturingIdentifier();
					((MultipartIdentifierContext)_localctx).parts.add(((MultipartIdentifierContext)_localctx).errorCapturingIdentifier);
					}
					} 
				}
				setState(2659);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,340,_ctx);
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

	public static class MultipartIdentifierPropertyListContext extends ParserRuleContext {
		public List<MultipartIdentifierPropertyContext> multipartIdentifierProperty() {
			return getRuleContexts(MultipartIdentifierPropertyContext.class);
		}
		public MultipartIdentifierPropertyContext multipartIdentifierProperty(int i) {
			return getRuleContext(MultipartIdentifierPropertyContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public MultipartIdentifierPropertyListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipartIdentifierPropertyList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterMultipartIdentifierPropertyList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitMultipartIdentifierPropertyList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitMultipartIdentifierPropertyList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipartIdentifierPropertyListContext multipartIdentifierPropertyList() throws RecognitionException {
		MultipartIdentifierPropertyListContext _localctx = new MultipartIdentifierPropertyListContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_multipartIdentifierPropertyList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2660);
			multipartIdentifierProperty();
			setState(2665);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2661);
				match(COMMA);
				setState(2662);
				multipartIdentifierProperty();
				}
				}
				setState(2667);
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

	public static class MultipartIdentifierPropertyContext extends ParserRuleContext {
		public PropertyListContext options;
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode OPTIONS() { return getToken(SqlBaseParser.OPTIONS, 0); }
		public PropertyListContext propertyList() {
			return getRuleContext(PropertyListContext.class,0);
		}
		public MultipartIdentifierPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipartIdentifierProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterMultipartIdentifierProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitMultipartIdentifierProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitMultipartIdentifierProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipartIdentifierPropertyContext multipartIdentifierProperty() throws RecognitionException {
		MultipartIdentifierPropertyContext _localctx = new MultipartIdentifierPropertyContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_multipartIdentifierProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2668);
			multipartIdentifier();
			setState(2671);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPTIONS) {
				{
				setState(2669);
				match(OPTIONS);
				setState(2670);
				((MultipartIdentifierPropertyContext)_localctx).options = propertyList();
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

	public static class TableIdentifierContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext db;
		public ErrorCapturingIdentifierContext table;
		public List<ErrorCapturingIdentifierContext> errorCapturingIdentifier() {
			return getRuleContexts(ErrorCapturingIdentifierContext.class);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier(int i) {
			return getRuleContext(ErrorCapturingIdentifierContext.class,i);
		}
		public TerminalNode DOT() { return getToken(SqlBaseParser.DOT, 0); }
		public TableIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterTableIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitTableIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitTableIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableIdentifierContext tableIdentifier() throws RecognitionException {
		TableIdentifierContext _localctx = new TableIdentifierContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_tableIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2676);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,343,_ctx) ) {
			case 1:
				{
				setState(2673);
				((TableIdentifierContext)_localctx).db = errorCapturingIdentifier();
				setState(2674);
				match(DOT);
				}
				break;
			}
			setState(2678);
			((TableIdentifierContext)_localctx).table = errorCapturingIdentifier();
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

	public static class FunctionIdentifierContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext db;
		public ErrorCapturingIdentifierContext function;
		public List<ErrorCapturingIdentifierContext> errorCapturingIdentifier() {
			return getRuleContexts(ErrorCapturingIdentifierContext.class);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier(int i) {
			return getRuleContext(ErrorCapturingIdentifierContext.class,i);
		}
		public TerminalNode DOT() { return getToken(SqlBaseParser.DOT, 0); }
		public FunctionIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterFunctionIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitFunctionIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitFunctionIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionIdentifierContext functionIdentifier() throws RecognitionException {
		FunctionIdentifierContext _localctx = new FunctionIdentifierContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_functionIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2683);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,344,_ctx) ) {
			case 1:
				{
				setState(2680);
				((FunctionIdentifierContext)_localctx).db = errorCapturingIdentifier();
				setState(2681);
				match(DOT);
				}
				break;
			}
			setState(2685);
			((FunctionIdentifierContext)_localctx).function = errorCapturingIdentifier();
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

	public static class NamedExpressionContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext name;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public NamedExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterNamedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitNamedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitNamedExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedExpressionContext namedExpression() throws RecognitionException {
		NamedExpressionContext _localctx = new NamedExpressionContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_namedExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2687);
			expression();
			setState(2695);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,347,_ctx) ) {
			case 1:
				{
				setState(2689);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,345,_ctx) ) {
				case 1:
					{
					setState(2688);
					match(AS);
					}
					break;
				}
				setState(2693);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,346,_ctx) ) {
				case 1:
					{
					setState(2691);
					((NamedExpressionContext)_localctx).name = errorCapturingIdentifier();
					}
					break;
				case 2:
					{
					setState(2692);
					identifierList();
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

	public static class NamedExpressionSeqContext extends ParserRuleContext {
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public NamedExpressionSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedExpressionSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterNamedExpressionSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitNamedExpressionSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitNamedExpressionSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedExpressionSeqContext namedExpressionSeq() throws RecognitionException {
		NamedExpressionSeqContext _localctx = new NamedExpressionSeqContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_namedExpressionSeq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2697);
			namedExpression();
			setState(2702);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,348,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2698);
					match(COMMA);
					setState(2699);
					namedExpression();
					}
					} 
				}
				setState(2704);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,348,_ctx);
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

	public static class PartitionFieldListContext extends ParserRuleContext {
		public PartitionFieldContext partitionField;
		public List<PartitionFieldContext> fields = new ArrayList<PartitionFieldContext>();
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public List<PartitionFieldContext> partitionField() {
			return getRuleContexts(PartitionFieldContext.class);
		}
		public PartitionFieldContext partitionField(int i) {
			return getRuleContext(PartitionFieldContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public PartitionFieldListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionFieldList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterPartitionFieldList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitPartitionFieldList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitPartitionFieldList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionFieldListContext partitionFieldList() throws RecognitionException {
		PartitionFieldListContext _localctx = new PartitionFieldListContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_partitionFieldList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2705);
			match(LEFT_PAREN);
			setState(2706);
			((PartitionFieldListContext)_localctx).partitionField = partitionField();
			((PartitionFieldListContext)_localctx).fields.add(((PartitionFieldListContext)_localctx).partitionField);
			setState(2711);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2707);
				match(COMMA);
				setState(2708);
				((PartitionFieldListContext)_localctx).partitionField = partitionField();
				((PartitionFieldListContext)_localctx).fields.add(((PartitionFieldListContext)_localctx).partitionField);
				}
				}
				setState(2713);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2714);
			match(RIGHT_PAREN);
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

	public static class PartitionFieldContext extends ParserRuleContext {
		public PartitionFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionField; }
	 
		public PartitionFieldContext() { }
		public void copyFrom(PartitionFieldContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PartitionColumnContext extends PartitionFieldContext {
		public ColTypeContext colType() {
			return getRuleContext(ColTypeContext.class,0);
		}
		public PartitionColumnContext(PartitionFieldContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterPartitionColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitPartitionColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitPartitionColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PartitionTransformContext extends PartitionFieldContext {
		public TransformContext transform() {
			return getRuleContext(TransformContext.class,0);
		}
		public PartitionTransformContext(PartitionFieldContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterPartitionTransform(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitPartitionTransform(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitPartitionTransform(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionFieldContext partitionField() throws RecognitionException {
		PartitionFieldContext _localctx = new PartitionFieldContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_partitionField);
		try {
			setState(2718);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,350,_ctx) ) {
			case 1:
				_localctx = new PartitionTransformContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2716);
				transform();
				}
				break;
			case 2:
				_localctx = new PartitionColumnContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2717);
				colType();
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

	public static class TransformContext extends ParserRuleContext {
		public TransformContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transform; }
	 
		public TransformContext() { }
		public void copyFrom(TransformContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdentityTransformContext extends TransformContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public IdentityTransformContext(TransformContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterIdentityTransform(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitIdentityTransform(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitIdentityTransform(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ApplyTransformContext extends TransformContext {
		public IdentifierContext transformName;
		public TransformArgumentContext transformArgument;
		public List<TransformArgumentContext> argument = new ArrayList<TransformArgumentContext>();
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TransformArgumentContext> transformArgument() {
			return getRuleContexts(TransformArgumentContext.class);
		}
		public TransformArgumentContext transformArgument(int i) {
			return getRuleContext(TransformArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public ApplyTransformContext(TransformContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterApplyTransform(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitApplyTransform(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitApplyTransform(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransformContext transform() throws RecognitionException {
		TransformContext _localctx = new TransformContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_transform);
		int _la;
		try {
			setState(2733);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,352,_ctx) ) {
			case 1:
				_localctx = new IdentityTransformContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2720);
				qualifiedName();
				}
				break;
			case 2:
				_localctx = new ApplyTransformContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2721);
				((ApplyTransformContext)_localctx).transformName = identifier();
				setState(2722);
				match(LEFT_PAREN);
				setState(2723);
				((ApplyTransformContext)_localctx).transformArgument = transformArgument();
				((ApplyTransformContext)_localctx).argument.add(((ApplyTransformContext)_localctx).transformArgument);
				setState(2728);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2724);
					match(COMMA);
					setState(2725);
					((ApplyTransformContext)_localctx).transformArgument = transformArgument();
					((ApplyTransformContext)_localctx).argument.add(((ApplyTransformContext)_localctx).transformArgument);
					}
					}
					setState(2730);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2731);
				match(RIGHT_PAREN);
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

	public static class TransformArgumentContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TransformArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transformArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterTransformArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitTransformArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitTransformArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransformArgumentContext transformArgument() throws RecognitionException {
		TransformArgumentContext _localctx = new TransformArgumentContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_transformArgument);
		try {
			setState(2737);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,353,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2735);
				qualifiedName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2736);
				constant();
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
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2739);
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

	public static class ExpressionSeqContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public ExpressionSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterExpressionSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitExpressionSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitExpressionSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionSeqContext expressionSeq() throws RecognitionException {
		ExpressionSeqContext _localctx = new ExpressionSeqContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_expressionSeq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2741);
			expression();
			setState(2746);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2742);
				match(COMMA);
				setState(2743);
				expression();
				}
				}
				setState(2748);
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
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterLogicalNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitLogicalNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitLogicalNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PredicatedContext extends BooleanExpressionContext {
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public PredicatedContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterPredicated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitPredicated(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitPredicated(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExistsContext extends BooleanExpressionContext {
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public ExistsContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterExists(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitExists(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitExists(this);
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
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterLogicalBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitLogicalBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitLogicalBinary(this);
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
		int _startState = 242;
		enterRecursionRule(_localctx, 242, RULE_booleanExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2761);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,356,_ctx) ) {
			case 1:
				{
				_localctx = new LogicalNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2750);
				match(NOT);
				setState(2751);
				booleanExpression(5);
				}
				break;
			case 2:
				{
				_localctx = new ExistsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2752);
				match(EXISTS);
				setState(2753);
				match(LEFT_PAREN);
				setState(2754);
				query();
				setState(2755);
				match(RIGHT_PAREN);
				}
				break;
			case 3:
				{
				_localctx = new PredicatedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2757);
				valueExpression(0);
				setState(2759);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,355,_ctx) ) {
				case 1:
					{
					setState(2758);
					predicate();
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2771);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,358,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2769);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,357,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(2763);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2764);
						((LogicalBinaryContext)_localctx).operator = match(AND);
						setState(2765);
						((LogicalBinaryContext)_localctx).right = booleanExpression(3);
						}
						break;
					case 2:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(2766);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2767);
						((LogicalBinaryContext)_localctx).operator = match(OR);
						setState(2768);
						((LogicalBinaryContext)_localctx).right = booleanExpression(2);
						}
						break;
					}
					} 
				}
				setState(2773);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,358,_ctx);
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
		public Token kind;
		public ValueExpressionContext lower;
		public ValueExpressionContext upper;
		public ValueExpressionContext pattern;
		public Token quantifier;
		public StringLitContext escapeChar;
		public ValueExpressionContext right;
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public TerminalNode BETWEEN() { return getToken(SqlBaseParser.BETWEEN, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode RLIKE() { return getToken(SqlBaseParser.RLIKE, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public TerminalNode ILIKE() { return getToken(SqlBaseParser.ILIKE, 0); }
		public TerminalNode ANY() { return getToken(SqlBaseParser.ANY, 0); }
		public TerminalNode SOME() { return getToken(SqlBaseParser.SOME, 0); }
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public TerminalNode ESCAPE() { return getToken(SqlBaseParser.ESCAPE, 0); }
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public TerminalNode IS() { return getToken(SqlBaseParser.IS, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public TerminalNode TRUE() { return getToken(SqlBaseParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SqlBaseParser.FALSE, 0); }
		public TerminalNode UNKNOWN() { return getToken(SqlBaseParser.UNKNOWN, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode DISTINCT() { return getToken(SqlBaseParser.DISTINCT, 0); }
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_predicate);
		int _la;
		try {
			setState(2856);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,372,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2775);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2774);
					match(NOT);
					}
				}

				setState(2777);
				((PredicateContext)_localctx).kind = match(BETWEEN);
				setState(2778);
				((PredicateContext)_localctx).lower = valueExpression(0);
				setState(2779);
				match(AND);
				setState(2780);
				((PredicateContext)_localctx).upper = valueExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2783);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2782);
					match(NOT);
					}
				}

				setState(2785);
				((PredicateContext)_localctx).kind = match(IN);
				setState(2786);
				match(LEFT_PAREN);
				setState(2787);
				expression();
				setState(2792);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2788);
					match(COMMA);
					setState(2789);
					expression();
					}
					}
					setState(2794);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2795);
				match(RIGHT_PAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2798);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2797);
					match(NOT);
					}
				}

				setState(2800);
				((PredicateContext)_localctx).kind = match(IN);
				setState(2801);
				match(LEFT_PAREN);
				setState(2802);
				query();
				setState(2803);
				match(RIGHT_PAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2806);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2805);
					match(NOT);
					}
				}

				setState(2808);
				((PredicateContext)_localctx).kind = match(RLIKE);
				setState(2809);
				((PredicateContext)_localctx).pattern = valueExpression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2811);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2810);
					match(NOT);
					}
				}

				setState(2813);
				((PredicateContext)_localctx).kind = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==LIKE || _la==ILIKE) ) {
					((PredicateContext)_localctx).kind = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2814);
				((PredicateContext)_localctx).quantifier = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ALL || _la==ANY || _la==SOME) ) {
					((PredicateContext)_localctx).quantifier = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2828);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,366,_ctx) ) {
				case 1:
					{
					setState(2815);
					match(LEFT_PAREN);
					setState(2816);
					match(RIGHT_PAREN);
					}
					break;
				case 2:
					{
					setState(2817);
					match(LEFT_PAREN);
					setState(2818);
					expression();
					setState(2823);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(2819);
						match(COMMA);
						setState(2820);
						expression();
						}
						}
						setState(2825);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2826);
					match(RIGHT_PAREN);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2831);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2830);
					match(NOT);
					}
				}

				setState(2833);
				((PredicateContext)_localctx).kind = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==LIKE || _la==ILIKE) ) {
					((PredicateContext)_localctx).kind = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2834);
				((PredicateContext)_localctx).pattern = valueExpression(0);
				setState(2837);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,368,_ctx) ) {
				case 1:
					{
					setState(2835);
					match(ESCAPE);
					setState(2836);
					((PredicateContext)_localctx).escapeChar = stringLit();
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2839);
				match(IS);
				setState(2841);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2840);
					match(NOT);
					}
				}

				setState(2843);
				((PredicateContext)_localctx).kind = match(NULL);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2844);
				match(IS);
				setState(2846);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2845);
					match(NOT);
					}
				}

				setState(2848);
				((PredicateContext)_localctx).kind = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FALSE || _la==TRUE || _la==UNKNOWN) ) {
					((PredicateContext)_localctx).kind = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2849);
				match(IS);
				setState(2851);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2850);
					match(NOT);
					}
				}

				setState(2853);
				((PredicateContext)_localctx).kind = match(DISTINCT);
				setState(2854);
				match(FROM);
				setState(2855);
				((PredicateContext)_localctx).right = valueExpression(0);
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
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterValueExpressionDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitValueExpressionDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitValueExpressionDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparisonContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public ValueExpressionContext right;
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public ComparisonContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitComparison(this);
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
		public TerminalNode DIV() { return getToken(SqlBaseParser.DIV, 0); }
		public TerminalNode PLUS() { return getToken(SqlBaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public TerminalNode CONCAT_PIPE() { return getToken(SqlBaseParser.CONCAT_PIPE, 0); }
		public TerminalNode AMPERSAND() { return getToken(SqlBaseParser.AMPERSAND, 0); }
		public TerminalNode HAT() { return getToken(SqlBaseParser.HAT, 0); }
		public TerminalNode PIPE() { return getToken(SqlBaseParser.PIPE, 0); }
		public ArithmeticBinaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterArithmeticBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitArithmeticBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitArithmeticBinary(this);
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
		public TerminalNode TILDE() { return getToken(SqlBaseParser.TILDE, 0); }
		public ArithmeticUnaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterArithmeticUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitArithmeticUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitArithmeticUnary(this);
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
		int _startState = 246;
		enterRecursionRule(_localctx, 246, RULE_valueExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2862);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,373,_ctx) ) {
			case 1:
				{
				_localctx = new ValueExpressionDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2859);
				primaryExpression(0);
				}
				break;
			case 2:
				{
				_localctx = new ArithmeticUnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2860);
				((ArithmeticUnaryContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 315)) & ~0x3f) == 0 && ((1L << (_la - 315)) & ((1L << (PLUS - 315)) | (1L << (MINUS - 315)) | (1L << (TILDE - 315)))) != 0)) ) {
					((ArithmeticUnaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2861);
				valueExpression(7);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2885);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,375,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2883);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,374,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2864);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(2865);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==DIV || ((((_la - 317)) & ~0x3f) == 0 && ((1L << (_la - 317)) & ((1L << (ASTERISK - 317)) | (1L << (SLASH - 317)) | (1L << (PERCENT - 317)))) != 0)) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2866);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(7);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2867);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(2868);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 315)) & ~0x3f) == 0 && ((1L << (_la - 315)) & ((1L << (PLUS - 315)) | (1L << (MINUS - 315)) | (1L << (CONCAT_PIPE - 315)))) != 0)) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2869);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(6);
						}
						break;
					case 3:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2870);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2871);
						((ArithmeticBinaryContext)_localctx).operator = match(AMPERSAND);
						setState(2872);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(5);
						}
						break;
					case 4:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2873);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2874);
						((ArithmeticBinaryContext)_localctx).operator = match(HAT);
						setState(2875);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(4);
						}
						break;
					case 5:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2876);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2877);
						((ArithmeticBinaryContext)_localctx).operator = match(PIPE);
						setState(2878);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(3);
						}
						break;
					case 6:
						{
						_localctx = new ComparisonContext(new ValueExpressionContext(_parentctx, _parentState));
						((ComparisonContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2879);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2880);
						comparisonOperator();
						setState(2881);
						((ComparisonContext)_localctx).right = valueExpression(2);
						}
						break;
					}
					} 
				}
				setState(2887);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,375,_ctx);
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

	public static class DatetimeUnitContext extends ParserRuleContext {
		public TerminalNode YEAR() { return getToken(SqlBaseParser.YEAR, 0); }
		public TerminalNode QUARTER() { return getToken(SqlBaseParser.QUARTER, 0); }
		public TerminalNode MONTH() { return getToken(SqlBaseParser.MONTH, 0); }
		public TerminalNode WEEK() { return getToken(SqlBaseParser.WEEK, 0); }
		public TerminalNode DAY() { return getToken(SqlBaseParser.DAY, 0); }
		public TerminalNode DAYOFYEAR() { return getToken(SqlBaseParser.DAYOFYEAR, 0); }
		public TerminalNode HOUR() { return getToken(SqlBaseParser.HOUR, 0); }
		public TerminalNode MINUTE() { return getToken(SqlBaseParser.MINUTE, 0); }
		public TerminalNode SECOND() { return getToken(SqlBaseParser.SECOND, 0); }
		public TerminalNode MILLISECOND() { return getToken(SqlBaseParser.MILLISECOND, 0); }
		public TerminalNode MICROSECOND() { return getToken(SqlBaseParser.MICROSECOND, 0); }
		public DatetimeUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datetimeUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterDatetimeUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitDatetimeUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitDatetimeUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatetimeUnitContext datetimeUnit() throws RecognitionException {
		DatetimeUnitContext _localctx = new DatetimeUnitContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_datetimeUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2888);
			_la = _input.LA(1);
			if ( !(_la==DAY || _la==DAYOFYEAR || ((((_la - 115)) & ~0x3f) == 0 && ((1L << (_la - 115)) & ((1L << (HOUR - 115)) | (1L << (MICROSECOND - 115)) | (1L << (MILLISECOND - 115)) | (1L << (MINUTE - 115)) | (1L << (MONTH - 115)))) != 0) || _la==QUARTER || _la==SECOND || _la==WEEK || _la==YEAR) ) {
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
	public static class StructContext extends PrimaryExpressionContext {
		public NamedExpressionContext namedExpression;
		public List<NamedExpressionContext> argument = new ArrayList<NamedExpressionContext>();
		public TerminalNode STRUCT() { return getToken(SqlBaseParser.STRUCT, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public StructContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterStruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitStruct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitStruct(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DereferenceContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext base;
		public IdentifierContext fieldName;
		public TerminalNode DOT() { return getToken(SqlBaseParser.DOT, 0); }
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DereferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterDereference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitDereference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitDereference(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TimestampaddContext extends PrimaryExpressionContext {
		public Token name;
		public DatetimeUnitContext unit;
		public ValueExpressionContext unitsAmount;
		public ValueExpressionContext timestamp;
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public DatetimeUnitContext datetimeUnit() {
			return getRuleContext(DatetimeUnitContext.class,0);
		}
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode TIMESTAMPADD() { return getToken(SqlBaseParser.TIMESTAMPADD, 0); }
		public TerminalNode DATEADD() { return getToken(SqlBaseParser.DATEADD, 0); }
		public TimestampaddContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterTimestampadd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitTimestampadd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitTimestampadd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubstringContext extends PrimaryExpressionContext {
		public ValueExpressionContext str;
		public ValueExpressionContext pos;
		public ValueExpressionContext len;
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public TerminalNode SUBSTR() { return getToken(SqlBaseParser.SUBSTR, 0); }
		public TerminalNode SUBSTRING() { return getToken(SqlBaseParser.SUBSTRING, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public SubstringContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSubstring(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSubstring(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitSubstring(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CastContext extends PrimaryExpressionContext {
		public Token name;
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public TerminalNode CAST() { return getToken(SqlBaseParser.CAST, 0); }
		public TerminalNode TRY_CAST() { return getToken(SqlBaseParser.TRY_CAST, 0); }
		public CastContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitCast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitCast(this);
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
		public TerminalNode ARROW() { return getToken(SqlBaseParser.ARROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public LambdaContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterLambda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitLambda(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitLambda(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesizedExpressionContext extends PrimaryExpressionContext {
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public ParenthesizedExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterParenthesizedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitParenthesizedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitParenthesizedExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Any_valueContext extends PrimaryExpressionContext {
		public TerminalNode ANY_VALUE() { return getToken(SqlBaseParser.ANY_VALUE, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public TerminalNode IGNORE() { return getToken(SqlBaseParser.IGNORE, 0); }
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public Any_valueContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterAny_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitAny_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitAny_value(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrimContext extends PrimaryExpressionContext {
		public Token trimOption;
		public ValueExpressionContext trimStr;
		public ValueExpressionContext srcStr;
		public TerminalNode TRIM() { return getToken(SqlBaseParser.TRIM, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode BOTH() { return getToken(SqlBaseParser.BOTH, 0); }
		public TerminalNode LEADING() { return getToken(SqlBaseParser.LEADING, 0); }
		public TerminalNode TRAILING() { return getToken(SqlBaseParser.TRAILING, 0); }
		public TrimContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterTrim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitTrim(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitTrim(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SimpleCaseContext extends PrimaryExpressionContext {
		public ExpressionContext value;
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(SqlBaseParser.CASE, 0); }
		public TerminalNode END() { return getToken(SqlBaseParser.END, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SqlBaseParser.ELSE, 0); }
		public SimpleCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSimpleCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSimpleCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitSimpleCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CurrentLikeContext extends PrimaryExpressionContext {
		public Token name;
		public TerminalNode CURRENT_DATE() { return getToken(SqlBaseParser.CURRENT_DATE, 0); }
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(SqlBaseParser.CURRENT_TIMESTAMP, 0); }
		public TerminalNode CURRENT_USER() { return getToken(SqlBaseParser.CURRENT_USER, 0); }
		public TerminalNode USER() { return getToken(SqlBaseParser.USER, 0); }
		public CurrentLikeContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterCurrentLike(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitCurrentLike(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitCurrentLike(this);
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
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterColumnReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitColumnReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitColumnReference(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RowConstructorContext extends PrimaryExpressionContext {
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public RowConstructorContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterRowConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitRowConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitRowConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LastContext extends PrimaryExpressionContext {
		public TerminalNode LAST() { return getToken(SqlBaseParser.LAST, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public TerminalNode IGNORE() { return getToken(SqlBaseParser.IGNORE, 0); }
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public LastContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterLast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitLast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitLast(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StarContext extends PrimaryExpressionContext {
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SqlBaseParser.DOT, 0); }
		public StarContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterStar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitStar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitStar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OverlayContext extends PrimaryExpressionContext {
		public ValueExpressionContext input;
		public ValueExpressionContext replace;
		public ValueExpressionContext position;
		public ValueExpressionContext length;
		public TerminalNode OVERLAY() { return getToken(SqlBaseParser.OVERLAY, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode PLACING() { return getToken(SqlBaseParser.PLACING, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public OverlayContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterOverlay(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitOverlay(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitOverlay(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubscriptContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext value;
		public ValueExpressionContext index;
		public TerminalNode LEFT_BRACKET() { return getToken(SqlBaseParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(SqlBaseParser.RIGHT_BRACKET, 0); }
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public SubscriptContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSubscript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSubscript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitSubscript(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TimestampdiffContext extends PrimaryExpressionContext {
		public Token name;
		public DatetimeUnitContext unit;
		public ValueExpressionContext startTimestamp;
		public ValueExpressionContext endTimestamp;
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public DatetimeUnitContext datetimeUnit() {
			return getRuleContext(DatetimeUnitContext.class,0);
		}
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode TIMESTAMPDIFF() { return getToken(SqlBaseParser.TIMESTAMPDIFF, 0); }
		public TerminalNode DATEDIFF() { return getToken(SqlBaseParser.DATEDIFF, 0); }
		public TimestampdiffContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterTimestampdiff(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitTimestampdiff(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitTimestampdiff(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubqueryExpressionContext extends PrimaryExpressionContext {
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public SubqueryExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSubqueryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSubqueryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitSubqueryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CollectSetContext extends PrimaryExpressionContext {
		public TerminalNode COLLECT_SET() { return getToken(SqlBaseParser.COLLECT_SET, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public CollectSetContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterCollectSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitCollectSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitCollectSet(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstantDefaultContext extends PrimaryExpressionContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstantDefaultContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterConstantDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitConstantDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitConstantDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExtractContext extends PrimaryExpressionContext {
		public IdentifierContext field;
		public ValueExpressionContext source;
		public TerminalNode EXTRACT() { return getToken(SqlBaseParser.EXTRACT, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public ExtractContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterExtract(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitExtract(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitExtract(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PercentileContext extends PrimaryExpressionContext {
		public Token name;
		public ValueExpressionContext percentage;
		public BooleanExpressionContext where;
		public List<TerminalNode> LEFT_PAREN() { return getTokens(SqlBaseParser.LEFT_PAREN); }
		public TerminalNode LEFT_PAREN(int i) {
			return getToken(SqlBaseParser.LEFT_PAREN, i);
		}
		public List<TerminalNode> RIGHT_PAREN() { return getTokens(SqlBaseParser.RIGHT_PAREN); }
		public TerminalNode RIGHT_PAREN(int i) {
			return getToken(SqlBaseParser.RIGHT_PAREN, i);
		}
		public TerminalNode WITHIN() { return getToken(SqlBaseParser.WITHIN, 0); }
		public TerminalNode GROUP() { return getToken(SqlBaseParser.GROUP, 0); }
		public TerminalNode ORDER() { return getToken(SqlBaseParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public SortItemContext sortItem() {
			return getRuleContext(SortItemContext.class,0);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode PERCENTILE_CONT() { return getToken(SqlBaseParser.PERCENTILE_CONT, 0); }
		public TerminalNode PERCENTILE_DISC() { return getToken(SqlBaseParser.PERCENTILE_DISC, 0); }
		public TerminalNode FILTER() { return getToken(SqlBaseParser.FILTER, 0); }
		public TerminalNode WHERE() { return getToken(SqlBaseParser.WHERE, 0); }
		public TerminalNode OVER() { return getToken(SqlBaseParser.OVER, 0); }
		public WindowSpecContext windowSpec() {
			return getRuleContext(WindowSpecContext.class,0);
		}
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public PercentileContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterPercentile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitPercentile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitPercentile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallContext extends PrimaryExpressionContext {
		public ExpressionContext expression;
		public List<ExpressionContext> argument = new ArrayList<ExpressionContext>();
		public BooleanExpressionContext where;
		public Token nullsOption;
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public List<TerminalNode> LEFT_PAREN() { return getTokens(SqlBaseParser.LEFT_PAREN); }
		public TerminalNode LEFT_PAREN(int i) {
			return getToken(SqlBaseParser.LEFT_PAREN, i);
		}
		public List<TerminalNode> RIGHT_PAREN() { return getTokens(SqlBaseParser.RIGHT_PAREN); }
		public TerminalNode RIGHT_PAREN(int i) {
			return getToken(SqlBaseParser.RIGHT_PAREN, i);
		}
		public TerminalNode FILTER() { return getToken(SqlBaseParser.FILTER, 0); }
		public TerminalNode WHERE() { return getToken(SqlBaseParser.WHERE, 0); }
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public TerminalNode OVER() { return getToken(SqlBaseParser.OVER, 0); }
		public WindowSpecContext windowSpec() {
			return getRuleContext(WindowSpecContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode IGNORE() { return getToken(SqlBaseParser.IGNORE, 0); }
		public TerminalNode RESPECT() { return getToken(SqlBaseParser.RESPECT, 0); }
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public FunctionCallContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitFunctionCall(this);
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
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSearchedCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSearchedCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitSearchedCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PositionContext extends PrimaryExpressionContext {
		public ValueExpressionContext substr;
		public ValueExpressionContext str;
		public TerminalNode POSITION() { return getToken(SqlBaseParser.POSITION, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public PositionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterPosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitPosition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitPosition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FirstContext extends PrimaryExpressionContext {
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public TerminalNode IGNORE() { return getToken(SqlBaseParser.IGNORE, 0); }
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public FirstContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterFirst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitFirst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitFirst(this);
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
		int _startState = 250;
		enterRecursionRule(_localctx, 250, RULE_primaryExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,399,_ctx) ) {
			case 1:
				{
				_localctx = new CurrentLikeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2891);
				((CurrentLikeContext)_localctx).name = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CURRENT_DATE) | (1L << CURRENT_TIMESTAMP) | (1L << CURRENT_USER))) != 0) || _la==USER) ) {
					((CurrentLikeContext)_localctx).name = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				{
				_localctx = new TimestampaddContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2892);
				((TimestampaddContext)_localctx).name = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==DATEADD || _la==TIMESTAMPADD) ) {
					((TimestampaddContext)_localctx).name = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2893);
				match(LEFT_PAREN);
				setState(2894);
				((TimestampaddContext)_localctx).unit = datetimeUnit();
				setState(2895);
				match(COMMA);
				setState(2896);
				((TimestampaddContext)_localctx).unitsAmount = valueExpression(0);
				setState(2897);
				match(COMMA);
				setState(2898);
				((TimestampaddContext)_localctx).timestamp = valueExpression(0);
				setState(2899);
				match(RIGHT_PAREN);
				}
				break;
			case 3:
				{
				_localctx = new TimestampdiffContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2901);
				((TimestampdiffContext)_localctx).name = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==DATEDIFF || _la==TIMESTAMPDIFF) ) {
					((TimestampdiffContext)_localctx).name = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2902);
				match(LEFT_PAREN);
				setState(2903);
				((TimestampdiffContext)_localctx).unit = datetimeUnit();
				setState(2904);
				match(COMMA);
				setState(2905);
				((TimestampdiffContext)_localctx).startTimestamp = valueExpression(0);
				setState(2906);
				match(COMMA);
				setState(2907);
				((TimestampdiffContext)_localctx).endTimestamp = valueExpression(0);
				setState(2908);
				match(RIGHT_PAREN);
				}
				break;
			case 4:
				{
				_localctx = new SearchedCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2910);
				match(CASE);
				setState(2912); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2911);
					whenClause();
					}
					}
					setState(2914); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(2918);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(2916);
					match(ELSE);
					setState(2917);
					((SearchedCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(2920);
				match(END);
				}
				break;
			case 5:
				{
				_localctx = new SimpleCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2922);
				match(CASE);
				setState(2923);
				((SimpleCaseContext)_localctx).value = expression();
				setState(2925); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2924);
					whenClause();
					}
					}
					setState(2927); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(2931);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(2929);
					match(ELSE);
					setState(2930);
					((SimpleCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(2933);
				match(END);
				}
				break;
			case 6:
				{
				_localctx = new CastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2935);
				((CastContext)_localctx).name = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==CAST || _la==TRY_CAST) ) {
					((CastContext)_localctx).name = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2936);
				match(LEFT_PAREN);
				setState(2937);
				expression();
				setState(2938);
				match(AS);
				setState(2939);
				dataType();
				setState(2940);
				match(RIGHT_PAREN);
				}
				break;
			case 7:
				{
				_localctx = new StructContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2942);
				match(STRUCT);
				setState(2943);
				match(LEFT_PAREN);
				setState(2952);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,381,_ctx) ) {
				case 1:
					{
					setState(2944);
					((StructContext)_localctx).namedExpression = namedExpression();
					((StructContext)_localctx).argument.add(((StructContext)_localctx).namedExpression);
					setState(2949);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(2945);
						match(COMMA);
						setState(2946);
						((StructContext)_localctx).namedExpression = namedExpression();
						((StructContext)_localctx).argument.add(((StructContext)_localctx).namedExpression);
						}
						}
						setState(2951);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(2954);
				match(RIGHT_PAREN);
				}
				break;
			case 8:
				{
				_localctx = new FirstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2955);
				match(FIRST);
				setState(2956);
				match(LEFT_PAREN);
				setState(2957);
				expression();
				setState(2960);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IGNORE) {
					{
					setState(2958);
					match(IGNORE);
					setState(2959);
					match(NULLS);
					}
				}

				setState(2962);
				match(RIGHT_PAREN);
				}
				break;
			case 9:
				{
				_localctx = new Any_valueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2964);
				match(ANY_VALUE);
				setState(2965);
				match(LEFT_PAREN);
				setState(2966);
				expression();
				setState(2969);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IGNORE) {
					{
					setState(2967);
					match(IGNORE);
					setState(2968);
					match(NULLS);
					}
				}

				setState(2971);
				match(RIGHT_PAREN);
				}
				break;
			case 10:
				{
				_localctx = new LastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2973);
				match(LAST);
				setState(2974);
				match(LEFT_PAREN);
				setState(2975);
				expression();
				setState(2978);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IGNORE) {
					{
					setState(2976);
					match(IGNORE);
					setState(2977);
					match(NULLS);
					}
				}

				setState(2980);
				match(RIGHT_PAREN);
				}
				break;
			case 11:
				{
				_localctx = new PositionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2982);
				match(POSITION);
				setState(2983);
				match(LEFT_PAREN);
				setState(2984);
				((PositionContext)_localctx).substr = valueExpression(0);
				setState(2985);
				match(IN);
				setState(2986);
				((PositionContext)_localctx).str = valueExpression(0);
				setState(2987);
				match(RIGHT_PAREN);
				}
				break;
			case 12:
				{
				_localctx = new ConstantDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2989);
				constant();
				}
				break;
			case 13:
				{
				_localctx = new StarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2990);
				match(ASTERISK);
				}
				break;
			case 14:
				{
				_localctx = new StarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2991);
				qualifiedName();
				setState(2992);
				match(DOT);
				setState(2993);
				match(ASTERISK);
				}
				break;
			case 15:
				{
				_localctx = new RowConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2995);
				match(LEFT_PAREN);
				setState(2996);
				namedExpression();
				setState(3001);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2997);
					match(COMMA);
					setState(2998);
					namedExpression();
					}
					}
					setState(3003);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(3004);
				match(RIGHT_PAREN);
				}
				break;
			case 16:
				{
				_localctx = new SubqueryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(3006);
				match(LEFT_PAREN);
				setState(3007);
				query();
				setState(3008);
				match(RIGHT_PAREN);
				}
				break;
			case 17:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(3010);
				functionName();
				setState(3011);
				match(LEFT_PAREN);
				setState(3023);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,388,_ctx) ) {
				case 1:
					{
					setState(3013);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,386,_ctx) ) {
					case 1:
						{
						setState(3012);
						setQuantifier();
						}
						break;
					}
					setState(3015);
					((FunctionCallContext)_localctx).expression = expression();
					((FunctionCallContext)_localctx).argument.add(((FunctionCallContext)_localctx).expression);
					setState(3020);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(3016);
						match(COMMA);
						setState(3017);
						((FunctionCallContext)_localctx).expression = expression();
						((FunctionCallContext)_localctx).argument.add(((FunctionCallContext)_localctx).expression);
						}
						}
						setState(3022);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(3025);
				match(RIGHT_PAREN);
				setState(3032);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,389,_ctx) ) {
				case 1:
					{
					setState(3026);
					match(FILTER);
					setState(3027);
					match(LEFT_PAREN);
					setState(3028);
					match(WHERE);
					setState(3029);
					((FunctionCallContext)_localctx).where = booleanExpression(0);
					setState(3030);
					match(RIGHT_PAREN);
					}
					break;
				}
				setState(3036);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,390,_ctx) ) {
				case 1:
					{
					setState(3034);
					((FunctionCallContext)_localctx).nullsOption = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==IGNORE || _la==RESPECT) ) {
						((FunctionCallContext)_localctx).nullsOption = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(3035);
					match(NULLS);
					}
					break;
				}
				setState(3040);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,391,_ctx) ) {
				case 1:
					{
					setState(3038);
					match(OVER);
					setState(3039);
					windowSpec();
					}
					break;
				}
				}
				break;
			case 18:
				{
				_localctx = new LambdaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(3042);
				identifier();
				setState(3043);
				match(ARROW);
				setState(3044);
				expression();
				}
				break;
			case 19:
				{
				_localctx = new LambdaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(3046);
				match(LEFT_PAREN);
				setState(3047);
				identifier();
				setState(3050); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3048);
					match(COMMA);
					setState(3049);
					identifier();
					}
					}
					setState(3052); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA );
				setState(3054);
				match(RIGHT_PAREN);
				setState(3055);
				match(ARROW);
				setState(3056);
				expression();
				}
				break;
			case 20:
				{
				_localctx = new ColumnReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(3058);
				identifier();
				}
				break;
			case 21:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(3059);
				match(LEFT_PAREN);
				setState(3060);
				expression();
				setState(3061);
				match(RIGHT_PAREN);
				}
				break;
			case 22:
				{
				_localctx = new ExtractContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(3063);
				match(EXTRACT);
				setState(3064);
				match(LEFT_PAREN);
				setState(3065);
				((ExtractContext)_localctx).field = identifier();
				setState(3066);
				match(FROM);
				setState(3067);
				((ExtractContext)_localctx).source = valueExpression(0);
				setState(3068);
				match(RIGHT_PAREN);
				}
				break;
			case 23:
				{
				_localctx = new SubstringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(3070);
				_la = _input.LA(1);
				if ( !(_la==SUBSTR || _la==SUBSTRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(3071);
				match(LEFT_PAREN);
				setState(3072);
				((SubstringContext)_localctx).str = valueExpression(0);
				setState(3073);
				_la = _input.LA(1);
				if ( !(_la==COMMA || _la==FROM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(3074);
				((SubstringContext)_localctx).pos = valueExpression(0);
				setState(3077);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==FOR) {
					{
					setState(3075);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==FOR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(3076);
					((SubstringContext)_localctx).len = valueExpression(0);
					}
				}

				setState(3079);
				match(RIGHT_PAREN);
				}
				break;
			case 24:
				{
				_localctx = new TrimContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(3081);
				match(TRIM);
				setState(3082);
				match(LEFT_PAREN);
				setState(3084);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,394,_ctx) ) {
				case 1:
					{
					setState(3083);
					((TrimContext)_localctx).trimOption = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==BOTH || _la==LEADING || _la==TRAILING) ) {
						((TrimContext)_localctx).trimOption = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(3087);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,395,_ctx) ) {
				case 1:
					{
					setState(3086);
					((TrimContext)_localctx).trimStr = valueExpression(0);
					}
					break;
				}
				setState(3089);
				match(FROM);
				setState(3090);
				((TrimContext)_localctx).srcStr = valueExpression(0);
				setState(3091);
				match(RIGHT_PAREN);
				}
				break;
			case 25:
				{
				_localctx = new OverlayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(3093);
				match(OVERLAY);
				setState(3094);
				match(LEFT_PAREN);
				setState(3095);
				((OverlayContext)_localctx).input = valueExpression(0);
				setState(3096);
				match(PLACING);
				setState(3097);
				((OverlayContext)_localctx).replace = valueExpression(0);
				setState(3098);
				match(FROM);
				setState(3099);
				((OverlayContext)_localctx).position = valueExpression(0);
				setState(3102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FOR) {
					{
					setState(3100);
					match(FOR);
					setState(3101);
					((OverlayContext)_localctx).length = valueExpression(0);
					}
				}

				setState(3104);
				match(RIGHT_PAREN);
				}
				break;
			case 26:
				{
				_localctx = new PercentileContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(3106);
				((PercentileContext)_localctx).name = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PERCENTILE_CONT || _la==PERCENTILE_DISC) ) {
					((PercentileContext)_localctx).name = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(3107);
				match(LEFT_PAREN);
				setState(3108);
				((PercentileContext)_localctx).percentage = valueExpression(0);
				setState(3109);
				match(RIGHT_PAREN);
				setState(3110);
				match(WITHIN);
				setState(3111);
				match(GROUP);
				setState(3112);
				match(LEFT_PAREN);
				setState(3113);
				match(ORDER);
				setState(3114);
				match(BY);
				setState(3115);
				sortItem();
				setState(3116);
				match(RIGHT_PAREN);
				setState(3123);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,397,_ctx) ) {
				case 1:
					{
					setState(3117);
					match(FILTER);
					setState(3118);
					match(LEFT_PAREN);
					setState(3119);
					match(WHERE);
					setState(3120);
					((PercentileContext)_localctx).where = booleanExpression(0);
					setState(3121);
					match(RIGHT_PAREN);
					}
					break;
				}
				setState(3127);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,398,_ctx) ) {
				case 1:
					{
					setState(3125);
					match(OVER);
					setState(3126);
					windowSpec();
					}
					break;
				}
				}
				break;
			case 27:
				{
				_localctx = new CollectSetContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(3129);
				match(COLLECT_SET);
				setState(3130);
				match(LEFT_PAREN);
				setState(3131);
				expression();
				setState(3132);
				match(RIGHT_PAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(3146);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,401,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(3144);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,400,_ctx) ) {
					case 1:
						{
						_localctx = new SubscriptContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((SubscriptContext)_localctx).value = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(3136);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(3137);
						match(LEFT_BRACKET);
						setState(3138);
						((SubscriptContext)_localctx).index = valueExpression(0);
						setState(3139);
						match(RIGHT_BRACKET);
						}
						break;
					case 2:
						{
						_localctx = new DereferenceContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((DereferenceContext)_localctx).base = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(3141);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(3142);
						match(DOT);
						setState(3143);
						((DereferenceContext)_localctx).fieldName = identifier();
						}
						break;
					}
					} 
				}
				setState(3148);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,401,_ctx);
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

	public static class ConstantContext extends ParserRuleContext {
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	 
		public ConstantContext() { }
		public void copyFrom(ConstantContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NullLiteralContext extends ConstantContext {
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public NullLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterNullLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitNullLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitNullLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringLiteralContext extends ConstantContext {
		public List<StringLitContext> stringLit() {
			return getRuleContexts(StringLitContext.class);
		}
		public StringLitContext stringLit(int i) {
			return getRuleContext(StringLitContext.class,i);
		}
		public StringLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeConstructorContext extends ConstantContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public TypeConstructorContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterTypeConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitTypeConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitTypeConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParameterLiteralContext extends ConstantContext {
		public TerminalNode COLON() { return getToken(SqlBaseParser.COLON, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ParameterLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterParameterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitParameterLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitParameterLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntervalLiteralContext extends ConstantContext {
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public IntervalLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterIntervalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitIntervalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitIntervalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumericLiteralContext extends ConstantContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NumericLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterNumericLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitNumericLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitNumericLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanLiteralContext extends ConstantContext {
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public BooleanLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitBooleanLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_constant);
		try {
			int _alt;
			setState(3163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,403,_ctx) ) {
			case 1:
				_localctx = new NullLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(3149);
				match(NULL);
				}
				break;
			case 2:
				_localctx = new ParameterLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(3150);
				match(COLON);
				setState(3151);
				identifier();
				}
				break;
			case 3:
				_localctx = new IntervalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(3152);
				interval();
				}
				break;
			case 4:
				_localctx = new TypeConstructorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(3153);
				identifier();
				setState(3154);
				stringLit();
				}
				break;
			case 5:
				_localctx = new NumericLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(3156);
				number();
				}
				break;
			case 6:
				_localctx = new BooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(3157);
				booleanValue();
				}
				break;
			case 7:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(3159); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(3158);
						stringLit();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(3161); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,402,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		public TerminalNode NEQJ() { return getToken(SqlBaseParser.NEQJ, 0); }
		public TerminalNode LT() { return getToken(SqlBaseParser.LT, 0); }
		public TerminalNode LTE() { return getToken(SqlBaseParser.LTE, 0); }
		public TerminalNode GT() { return getToken(SqlBaseParser.GT, 0); }
		public TerminalNode GTE() { return getToken(SqlBaseParser.GTE, 0); }
		public TerminalNode NSEQ() { return getToken(SqlBaseParser.NSEQ, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitComparisonOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3165);
			_la = _input.LA(1);
			if ( !(((((_la - 307)) & ~0x3f) == 0 && ((1L << (_la - 307)) & ((1L << (EQ - 307)) | (1L << (NSEQ - 307)) | (1L << (NEQ - 307)) | (1L << (NEQJ - 307)) | (1L << (LT - 307)) | (1L << (LTE - 307)) | (1L << (GT - 307)) | (1L << (GTE - 307)))) != 0)) ) {
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

	public static class ArithmeticOperatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(SqlBaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(SqlBaseParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(SqlBaseParser.PERCENT, 0); }
		public TerminalNode DIV() { return getToken(SqlBaseParser.DIV, 0); }
		public TerminalNode TILDE() { return getToken(SqlBaseParser.TILDE, 0); }
		public TerminalNode AMPERSAND() { return getToken(SqlBaseParser.AMPERSAND, 0); }
		public TerminalNode PIPE() { return getToken(SqlBaseParser.PIPE, 0); }
		public TerminalNode CONCAT_PIPE() { return getToken(SqlBaseParser.CONCAT_PIPE, 0); }
		public TerminalNode HAT() { return getToken(SqlBaseParser.HAT, 0); }
		public ArithmeticOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterArithmeticOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitArithmeticOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitArithmeticOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticOperatorContext arithmeticOperator() throws RecognitionException {
		ArithmeticOperatorContext _localctx = new ArithmeticOperatorContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_arithmeticOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3167);
			_la = _input.LA(1);
			if ( !(_la==DIV || ((((_la - 315)) & ~0x3f) == 0 && ((1L << (_la - 315)) & ((1L << (PLUS - 315)) | (1L << (MINUS - 315)) | (1L << (ASTERISK - 315)) | (1L << (SLASH - 315)) | (1L << (PERCENT - 315)) | (1L << (TILDE - 315)) | (1L << (AMPERSAND - 315)) | (1L << (PIPE - 315)) | (1L << (CONCAT_PIPE - 315)) | (1L << (HAT - 315)))) != 0)) ) {
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

	public static class PredicateOperatorContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public PredicateOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicateOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterPredicateOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitPredicateOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitPredicateOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateOperatorContext predicateOperator() throws RecognitionException {
		PredicateOperatorContext _localctx = new PredicateOperatorContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_predicateOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3169);
			_la = _input.LA(1);
			if ( !(_la==AND || ((((_la - 120)) & ~0x3f) == 0 && ((1L << (_la - 120)) & ((1L << (IN - 120)) | (1L << (NOT - 120)) | (1L << (OR - 120)))) != 0)) ) {
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
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterBooleanValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitBooleanValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitBooleanValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanValueContext booleanValue() throws RecognitionException {
		BooleanValueContext _localctx = new BooleanValueContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_booleanValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3171);
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
		public TerminalNode INTERVAL() { return getToken(SqlBaseParser.INTERVAL, 0); }
		public ErrorCapturingMultiUnitsIntervalContext errorCapturingMultiUnitsInterval() {
			return getRuleContext(ErrorCapturingMultiUnitsIntervalContext.class,0);
		}
		public ErrorCapturingUnitToUnitIntervalContext errorCapturingUnitToUnitInterval() {
			return getRuleContext(ErrorCapturingUnitToUnitIntervalContext.class,0);
		}
		public IntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalContext interval() throws RecognitionException {
		IntervalContext _localctx = new IntervalContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_interval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3173);
			match(INTERVAL);
			setState(3176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,404,_ctx) ) {
			case 1:
				{
				setState(3174);
				errorCapturingMultiUnitsInterval();
				}
				break;
			case 2:
				{
				setState(3175);
				errorCapturingUnitToUnitInterval();
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

	public static class ErrorCapturingMultiUnitsIntervalContext extends ParserRuleContext {
		public MultiUnitsIntervalContext body;
		public MultiUnitsIntervalContext multiUnitsInterval() {
			return getRuleContext(MultiUnitsIntervalContext.class,0);
		}
		public UnitToUnitIntervalContext unitToUnitInterval() {
			return getRuleContext(UnitToUnitIntervalContext.class,0);
		}
		public ErrorCapturingMultiUnitsIntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorCapturingMultiUnitsInterval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterErrorCapturingMultiUnitsInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitErrorCapturingMultiUnitsInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitErrorCapturingMultiUnitsInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorCapturingMultiUnitsIntervalContext errorCapturingMultiUnitsInterval() throws RecognitionException {
		ErrorCapturingMultiUnitsIntervalContext _localctx = new ErrorCapturingMultiUnitsIntervalContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_errorCapturingMultiUnitsInterval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3178);
			((ErrorCapturingMultiUnitsIntervalContext)_localctx).body = multiUnitsInterval();
			setState(3180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,405,_ctx) ) {
			case 1:
				{
				setState(3179);
				unitToUnitInterval();
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

	public static class MultiUnitsIntervalContext extends ParserRuleContext {
		public UnitInMultiUnitsContext unitInMultiUnits;
		public List<UnitInMultiUnitsContext> unit = new ArrayList<UnitInMultiUnitsContext>();
		public List<IntervalValueContext> intervalValue() {
			return getRuleContexts(IntervalValueContext.class);
		}
		public IntervalValueContext intervalValue(int i) {
			return getRuleContext(IntervalValueContext.class,i);
		}
		public List<UnitInMultiUnitsContext> unitInMultiUnits() {
			return getRuleContexts(UnitInMultiUnitsContext.class);
		}
		public UnitInMultiUnitsContext unitInMultiUnits(int i) {
			return getRuleContext(UnitInMultiUnitsContext.class,i);
		}
		public MultiUnitsIntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiUnitsInterval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterMultiUnitsInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitMultiUnitsInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitMultiUnitsInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiUnitsIntervalContext multiUnitsInterval() throws RecognitionException {
		MultiUnitsIntervalContext _localctx = new MultiUnitsIntervalContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_multiUnitsInterval);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3185); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(3182);
					intervalValue();
					setState(3183);
					((MultiUnitsIntervalContext)_localctx).unitInMultiUnits = unitInMultiUnits();
					((MultiUnitsIntervalContext)_localctx).unit.add(((MultiUnitsIntervalContext)_localctx).unitInMultiUnits);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(3187); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,406,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class ErrorCapturingUnitToUnitIntervalContext extends ParserRuleContext {
		public UnitToUnitIntervalContext body;
		public MultiUnitsIntervalContext error1;
		public UnitToUnitIntervalContext error2;
		public List<UnitToUnitIntervalContext> unitToUnitInterval() {
			return getRuleContexts(UnitToUnitIntervalContext.class);
		}
		public UnitToUnitIntervalContext unitToUnitInterval(int i) {
			return getRuleContext(UnitToUnitIntervalContext.class,i);
		}
		public MultiUnitsIntervalContext multiUnitsInterval() {
			return getRuleContext(MultiUnitsIntervalContext.class,0);
		}
		public ErrorCapturingUnitToUnitIntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorCapturingUnitToUnitInterval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterErrorCapturingUnitToUnitInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitErrorCapturingUnitToUnitInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitErrorCapturingUnitToUnitInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorCapturingUnitToUnitIntervalContext errorCapturingUnitToUnitInterval() throws RecognitionException {
		ErrorCapturingUnitToUnitIntervalContext _localctx = new ErrorCapturingUnitToUnitIntervalContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_errorCapturingUnitToUnitInterval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3189);
			((ErrorCapturingUnitToUnitIntervalContext)_localctx).body = unitToUnitInterval();
			setState(3192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,407,_ctx) ) {
			case 1:
				{
				setState(3190);
				((ErrorCapturingUnitToUnitIntervalContext)_localctx).error1 = multiUnitsInterval();
				}
				break;
			case 2:
				{
				setState(3191);
				((ErrorCapturingUnitToUnitIntervalContext)_localctx).error2 = unitToUnitInterval();
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

	public static class UnitToUnitIntervalContext extends ParserRuleContext {
		public IntervalValueContext value;
		public UnitInUnitToUnitContext from;
		public UnitInUnitToUnitContext to;
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public IntervalValueContext intervalValue() {
			return getRuleContext(IntervalValueContext.class,0);
		}
		public List<UnitInUnitToUnitContext> unitInUnitToUnit() {
			return getRuleContexts(UnitInUnitToUnitContext.class);
		}
		public UnitInUnitToUnitContext unitInUnitToUnit(int i) {
			return getRuleContext(UnitInUnitToUnitContext.class,i);
		}
		public UnitToUnitIntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unitToUnitInterval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterUnitToUnitInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitUnitToUnitInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitUnitToUnitInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnitToUnitIntervalContext unitToUnitInterval() throws RecognitionException {
		UnitToUnitIntervalContext _localctx = new UnitToUnitIntervalContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_unitToUnitInterval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3194);
			((UnitToUnitIntervalContext)_localctx).value = intervalValue();
			setState(3195);
			((UnitToUnitIntervalContext)_localctx).from = unitInUnitToUnit();
			setState(3196);
			match(TO);
			setState(3197);
			((UnitToUnitIntervalContext)_localctx).to = unitInUnitToUnit();
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

	public static class IntervalValueContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(SqlBaseParser.DECIMAL_VALUE, 0); }
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(SqlBaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public IntervalValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterIntervalValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitIntervalValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitIntervalValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalValueContext intervalValue() throws RecognitionException {
		IntervalValueContext _localctx = new IntervalValueContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_intervalValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,408,_ctx) ) {
			case 1:
				{
				setState(3199);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(3205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,409,_ctx) ) {
			case 1:
				{
				setState(3202);
				match(INTEGER_VALUE);
				}
				break;
			case 2:
				{
				setState(3203);
				match(DECIMAL_VALUE);
				}
				break;
			case 3:
				{
				setState(3204);
				stringLit();
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

	public static class UnitInMultiUnitsContext extends ParserRuleContext {
		public TerminalNode NANOSECOND() { return getToken(SqlBaseParser.NANOSECOND, 0); }
		public TerminalNode NANOSECONDS() { return getToken(SqlBaseParser.NANOSECONDS, 0); }
		public TerminalNode MICROSECOND() { return getToken(SqlBaseParser.MICROSECOND, 0); }
		public TerminalNode MICROSECONDS() { return getToken(SqlBaseParser.MICROSECONDS, 0); }
		public TerminalNode MILLISECOND() { return getToken(SqlBaseParser.MILLISECOND, 0); }
		public TerminalNode MILLISECONDS() { return getToken(SqlBaseParser.MILLISECONDS, 0); }
		public TerminalNode SECOND() { return getToken(SqlBaseParser.SECOND, 0); }
		public TerminalNode SECONDS() { return getToken(SqlBaseParser.SECONDS, 0); }
		public TerminalNode MINUTE() { return getToken(SqlBaseParser.MINUTE, 0); }
		public TerminalNode MINUTES() { return getToken(SqlBaseParser.MINUTES, 0); }
		public TerminalNode HOUR() { return getToken(SqlBaseParser.HOUR, 0); }
		public TerminalNode HOURS() { return getToken(SqlBaseParser.HOURS, 0); }
		public TerminalNode DAY() { return getToken(SqlBaseParser.DAY, 0); }
		public TerminalNode DAYS() { return getToken(SqlBaseParser.DAYS, 0); }
		public TerminalNode WEEK() { return getToken(SqlBaseParser.WEEK, 0); }
		public TerminalNode WEEKS() { return getToken(SqlBaseParser.WEEKS, 0); }
		public TerminalNode MONTH() { return getToken(SqlBaseParser.MONTH, 0); }
		public TerminalNode MONTHS() { return getToken(SqlBaseParser.MONTHS, 0); }
		public TerminalNode YEAR() { return getToken(SqlBaseParser.YEAR, 0); }
		public TerminalNode YEARS() { return getToken(SqlBaseParser.YEARS, 0); }
		public UnitInMultiUnitsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unitInMultiUnits; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterUnitInMultiUnits(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitUnitInMultiUnits(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitUnitInMultiUnits(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnitInMultiUnitsContext unitInMultiUnits() throws RecognitionException {
		UnitInMultiUnitsContext _localctx = new UnitInMultiUnitsContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_unitInMultiUnits);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3207);
			_la = _input.LA(1);
			if ( !(_la==DAY || _la==DAYS || ((((_la - 115)) & ~0x3f) == 0 && ((1L << (_la - 115)) & ((1L << (HOUR - 115)) | (1L << (HOURS - 115)) | (1L << (MICROSECOND - 115)) | (1L << (MICROSECONDS - 115)) | (1L << (MILLISECOND - 115)) | (1L << (MILLISECONDS - 115)) | (1L << (MINUTE - 115)) | (1L << (MINUTES - 115)) | (1L << (MONTH - 115)) | (1L << (MONTHS - 115)) | (1L << (NANOSECOND - 115)) | (1L << (NANOSECONDS - 115)))) != 0) || _la==SECOND || _la==SECONDS || ((((_la - 296)) & ~0x3f) == 0 && ((1L << (_la - 296)) & ((1L << (WEEK - 296)) | (1L << (WEEKS - 296)) | (1L << (YEAR - 296)) | (1L << (YEARS - 296)))) != 0)) ) {
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

	public static class UnitInUnitToUnitContext extends ParserRuleContext {
		public TerminalNode SECOND() { return getToken(SqlBaseParser.SECOND, 0); }
		public TerminalNode MINUTE() { return getToken(SqlBaseParser.MINUTE, 0); }
		public TerminalNode HOUR() { return getToken(SqlBaseParser.HOUR, 0); }
		public TerminalNode DAY() { return getToken(SqlBaseParser.DAY, 0); }
		public TerminalNode MONTH() { return getToken(SqlBaseParser.MONTH, 0); }
		public TerminalNode YEAR() { return getToken(SqlBaseParser.YEAR, 0); }
		public UnitInUnitToUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unitInUnitToUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterUnitInUnitToUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitUnitInUnitToUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitUnitInUnitToUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnitInUnitToUnitContext unitInUnitToUnit() throws RecognitionException {
		UnitInUnitToUnitContext _localctx = new UnitInUnitToUnitContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_unitInUnitToUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3209);
			_la = _input.LA(1);
			if ( !(_la==DAY || ((((_la - 115)) & ~0x3f) == 0 && ((1L << (_la - 115)) & ((1L << (HOUR - 115)) | (1L << (MINUTE - 115)) | (1L << (MONTH - 115)))) != 0) || _la==SECOND || _la==YEAR) ) {
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

	public static class ColPositionContext extends ParserRuleContext {
		public Token position;
		public ErrorCapturingIdentifierContext afterCol;
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public TerminalNode AFTER() { return getToken(SqlBaseParser.AFTER, 0); }
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public ColPositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colPosition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterColPosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitColPosition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitColPosition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColPositionContext colPosition() throws RecognitionException {
		ColPositionContext _localctx = new ColPositionContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_colPosition);
		try {
			setState(3214);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FIRST:
				enterOuterAlt(_localctx, 1);
				{
				setState(3211);
				((ColPositionContext)_localctx).position = match(FIRST);
				}
				break;
			case AFTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(3212);
				((ColPositionContext)_localctx).position = match(AFTER);
				setState(3213);
				((ColPositionContext)_localctx).afterCol = errorCapturingIdentifier();
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

	public static class DataTypeContext extends ParserRuleContext {
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
	 
		public DataTypeContext() { }
		public void copyFrom(DataTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ComplexDataTypeContext extends DataTypeContext {
		public Token complex;
		public TerminalNode LT() { return getToken(SqlBaseParser.LT, 0); }
		public List<DataTypeContext> dataType() {
			return getRuleContexts(DataTypeContext.class);
		}
		public DataTypeContext dataType(int i) {
			return getRuleContext(DataTypeContext.class,i);
		}
		public TerminalNode GT() { return getToken(SqlBaseParser.GT, 0); }
		public TerminalNode ARRAY() { return getToken(SqlBaseParser.ARRAY, 0); }
		public TerminalNode COMMA() { return getToken(SqlBaseParser.COMMA, 0); }
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode STRUCT() { return getToken(SqlBaseParser.STRUCT, 0); }
		public TerminalNode NEQ() { return getToken(SqlBaseParser.NEQ, 0); }
		public ComplexColTypeListContext complexColTypeList() {
			return getRuleContext(ComplexColTypeListContext.class,0);
		}
		public ComplexDataTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterComplexDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitComplexDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitComplexDataType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class YearMonthIntervalDataTypeContext extends DataTypeContext {
		public Token from;
		public Token to;
		public TerminalNode INTERVAL() { return getToken(SqlBaseParser.INTERVAL, 0); }
		public TerminalNode YEAR() { return getToken(SqlBaseParser.YEAR, 0); }
		public List<TerminalNode> MONTH() { return getTokens(SqlBaseParser.MONTH); }
		public TerminalNode MONTH(int i) {
			return getToken(SqlBaseParser.MONTH, i);
		}
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public YearMonthIntervalDataTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterYearMonthIntervalDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitYearMonthIntervalDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitYearMonthIntervalDataType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DayTimeIntervalDataTypeContext extends DataTypeContext {
		public Token from;
		public Token to;
		public TerminalNode INTERVAL() { return getToken(SqlBaseParser.INTERVAL, 0); }
		public TerminalNode DAY() { return getToken(SqlBaseParser.DAY, 0); }
		public List<TerminalNode> HOUR() { return getTokens(SqlBaseParser.HOUR); }
		public TerminalNode HOUR(int i) {
			return getToken(SqlBaseParser.HOUR, i);
		}
		public List<TerminalNode> MINUTE() { return getTokens(SqlBaseParser.MINUTE); }
		public TerminalNode MINUTE(int i) {
			return getToken(SqlBaseParser.MINUTE, i);
		}
		public List<TerminalNode> SECOND() { return getTokens(SqlBaseParser.SECOND); }
		public TerminalNode SECOND(int i) {
			return getToken(SqlBaseParser.SECOND, i);
		}
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public DayTimeIntervalDataTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterDayTimeIntervalDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitDayTimeIntervalDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitDayTimeIntervalDataType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimitiveDataTypeContext extends DataTypeContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public List<TerminalNode> INTEGER_VALUE() { return getTokens(SqlBaseParser.INTEGER_VALUE); }
		public TerminalNode INTEGER_VALUE(int i) {
			return getToken(SqlBaseParser.INTEGER_VALUE, i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public PrimitiveDataTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterPrimitiveDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitPrimitiveDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitPrimitiveDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_dataType);
		int _la;
		try {
			setState(3262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,417,_ctx) ) {
			case 1:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(3216);
				((ComplexDataTypeContext)_localctx).complex = match(ARRAY);
				setState(3217);
				match(LT);
				setState(3218);
				dataType();
				setState(3219);
				match(GT);
				}
				break;
			case 2:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(3221);
				((ComplexDataTypeContext)_localctx).complex = match(MAP);
				setState(3222);
				match(LT);
				setState(3223);
				dataType();
				setState(3224);
				match(COMMA);
				setState(3225);
				dataType();
				setState(3226);
				match(GT);
				}
				break;
			case 3:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(3228);
				((ComplexDataTypeContext)_localctx).complex = match(STRUCT);
				setState(3235);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LT:
					{
					setState(3229);
					match(LT);
					setState(3231);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,411,_ctx) ) {
					case 1:
						{
						setState(3230);
						complexColTypeList();
						}
						break;
					}
					setState(3233);
					match(GT);
					}
					break;
				case NEQ:
					{
					setState(3234);
					match(NEQ);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 4:
				_localctx = new YearMonthIntervalDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(3237);
				match(INTERVAL);
				setState(3238);
				((YearMonthIntervalDataTypeContext)_localctx).from = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==MONTH || _la==YEAR) ) {
					((YearMonthIntervalDataTypeContext)_localctx).from = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(3241);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,413,_ctx) ) {
				case 1:
					{
					setState(3239);
					match(TO);
					setState(3240);
					((YearMonthIntervalDataTypeContext)_localctx).to = match(MONTH);
					}
					break;
				}
				}
				break;
			case 5:
				_localctx = new DayTimeIntervalDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(3243);
				match(INTERVAL);
				setState(3244);
				((DayTimeIntervalDataTypeContext)_localctx).from = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==DAY || _la==HOUR || _la==MINUTE || _la==SECOND) ) {
					((DayTimeIntervalDataTypeContext)_localctx).from = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(3247);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,414,_ctx) ) {
				case 1:
					{
					setState(3245);
					match(TO);
					setState(3246);
					((DayTimeIntervalDataTypeContext)_localctx).to = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==HOUR || _la==MINUTE || _la==SECOND) ) {
						((DayTimeIntervalDataTypeContext)_localctx).to = (Token)_errHandler.recoverInline(this);
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
				break;
			case 6:
				_localctx = new PrimitiveDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(3249);
				identifier();
				setState(3260);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,416,_ctx) ) {
				case 1:
					{
					setState(3250);
					match(LEFT_PAREN);
					setState(3251);
					match(INTEGER_VALUE);
					setState(3256);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(3252);
						match(COMMA);
						setState(3253);
						match(INTEGER_VALUE);
						}
						}
						setState(3258);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(3259);
					match(RIGHT_PAREN);
					}
					break;
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

	public static class QualifiedColTypeWithPositionListContext extends ParserRuleContext {
		public List<QualifiedColTypeWithPositionContext> qualifiedColTypeWithPosition() {
			return getRuleContexts(QualifiedColTypeWithPositionContext.class);
		}
		public QualifiedColTypeWithPositionContext qualifiedColTypeWithPosition(int i) {
			return getRuleContext(QualifiedColTypeWithPositionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public QualifiedColTypeWithPositionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedColTypeWithPositionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterQualifiedColTypeWithPositionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitQualifiedColTypeWithPositionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitQualifiedColTypeWithPositionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedColTypeWithPositionListContext qualifiedColTypeWithPositionList() throws RecognitionException {
		QualifiedColTypeWithPositionListContext _localctx = new QualifiedColTypeWithPositionListContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_qualifiedColTypeWithPositionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3264);
			qualifiedColTypeWithPosition();
			setState(3269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(3265);
				match(COMMA);
				setState(3266);
				qualifiedColTypeWithPosition();
				}
				}
				setState(3271);
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

	public static class QualifiedColTypeWithPositionContext extends ParserRuleContext {
		public MultipartIdentifierContext name;
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public DefaultExpressionContext defaultExpression() {
			return getRuleContext(DefaultExpressionContext.class,0);
		}
		public CommentSpecContext commentSpec() {
			return getRuleContext(CommentSpecContext.class,0);
		}
		public ColPositionContext colPosition() {
			return getRuleContext(ColPositionContext.class,0);
		}
		public QualifiedColTypeWithPositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedColTypeWithPosition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterQualifiedColTypeWithPosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitQualifiedColTypeWithPosition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitQualifiedColTypeWithPosition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedColTypeWithPositionContext qualifiedColTypeWithPosition() throws RecognitionException {
		QualifiedColTypeWithPositionContext _localctx = new QualifiedColTypeWithPositionContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_qualifiedColTypeWithPosition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3272);
			((QualifiedColTypeWithPositionContext)_localctx).name = multipartIdentifier();
			setState(3273);
			dataType();
			setState(3276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(3274);
				match(NOT);
				setState(3275);
				match(NULL);
				}
			}

			setState(3279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(3278);
				defaultExpression();
				}
			}

			setState(3282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(3281);
				commentSpec();
				}
			}

			setState(3285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AFTER || _la==FIRST) {
				{
				setState(3284);
				colPosition();
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

	public static class DefaultExpressionContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(SqlBaseParser.DEFAULT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DefaultExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterDefaultExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitDefaultExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitDefaultExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultExpressionContext defaultExpression() throws RecognitionException {
		DefaultExpressionContext _localctx = new DefaultExpressionContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_defaultExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3287);
			match(DEFAULT);
			setState(3288);
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

	public static class ColTypeListContext extends ParserRuleContext {
		public List<ColTypeContext> colType() {
			return getRuleContexts(ColTypeContext.class);
		}
		public ColTypeContext colType(int i) {
			return getRuleContext(ColTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public ColTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterColTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitColTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitColTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColTypeListContext colTypeList() throws RecognitionException {
		ColTypeListContext _localctx = new ColTypeListContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_colTypeList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3290);
			colType();
			setState(3295);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,423,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3291);
					match(COMMA);
					setState(3292);
					colType();
					}
					} 
				}
				setState(3297);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,423,_ctx);
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

	public static class ColTypeContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext colName;
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public CommentSpecContext commentSpec() {
			return getRuleContext(CommentSpecContext.class,0);
		}
		public ColTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterColType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitColType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitColType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColTypeContext colType() throws RecognitionException {
		ColTypeContext _localctx = new ColTypeContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_colType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3298);
			((ColTypeContext)_localctx).colName = errorCapturingIdentifier();
			setState(3299);
			dataType();
			setState(3302);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,424,_ctx) ) {
			case 1:
				{
				setState(3300);
				match(NOT);
				setState(3301);
				match(NULL);
				}
				break;
			}
			setState(3305);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,425,_ctx) ) {
			case 1:
				{
				setState(3304);
				commentSpec();
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

	public static class CreateOrReplaceTableColTypeListContext extends ParserRuleContext {
		public List<CreateOrReplaceTableColTypeContext> createOrReplaceTableColType() {
			return getRuleContexts(CreateOrReplaceTableColTypeContext.class);
		}
		public CreateOrReplaceTableColTypeContext createOrReplaceTableColType(int i) {
			return getRuleContext(CreateOrReplaceTableColTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public CreateOrReplaceTableColTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createOrReplaceTableColTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterCreateOrReplaceTableColTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitCreateOrReplaceTableColTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitCreateOrReplaceTableColTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateOrReplaceTableColTypeListContext createOrReplaceTableColTypeList() throws RecognitionException {
		CreateOrReplaceTableColTypeListContext _localctx = new CreateOrReplaceTableColTypeListContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_createOrReplaceTableColTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3307);
			createOrReplaceTableColType();
			setState(3312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(3308);
				match(COMMA);
				setState(3309);
				createOrReplaceTableColType();
				}
				}
				setState(3314);
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

	public static class CreateOrReplaceTableColTypeContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext colName;
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public List<ColDefinitionOptionContext> colDefinitionOption() {
			return getRuleContexts(ColDefinitionOptionContext.class);
		}
		public ColDefinitionOptionContext colDefinitionOption(int i) {
			return getRuleContext(ColDefinitionOptionContext.class,i);
		}
		public CreateOrReplaceTableColTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createOrReplaceTableColType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterCreateOrReplaceTableColType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitCreateOrReplaceTableColType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitCreateOrReplaceTableColType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateOrReplaceTableColTypeContext createOrReplaceTableColType() throws RecognitionException {
		CreateOrReplaceTableColTypeContext _localctx = new CreateOrReplaceTableColTypeContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_createOrReplaceTableColType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3315);
			((CreateOrReplaceTableColTypeContext)_localctx).colName = errorCapturingIdentifier();
			setState(3316);
			dataType();
			setState(3320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==DEFAULT || _la==NOT) {
				{
				{
				setState(3317);
				colDefinitionOption();
				}
				}
				setState(3322);
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

	public static class ColDefinitionOptionContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public DefaultExpressionContext defaultExpression() {
			return getRuleContext(DefaultExpressionContext.class,0);
		}
		public CommentSpecContext commentSpec() {
			return getRuleContext(CommentSpecContext.class,0);
		}
		public ColDefinitionOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colDefinitionOption; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterColDefinitionOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitColDefinitionOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitColDefinitionOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColDefinitionOptionContext colDefinitionOption() throws RecognitionException {
		ColDefinitionOptionContext _localctx = new ColDefinitionOptionContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_colDefinitionOption);
		try {
			setState(3327);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(3323);
				match(NOT);
				setState(3324);
				match(NULL);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(3325);
				defaultExpression();
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(3326);
				commentSpec();
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

	public static class ComplexColTypeListContext extends ParserRuleContext {
		public List<ComplexColTypeContext> complexColType() {
			return getRuleContexts(ComplexColTypeContext.class);
		}
		public ComplexColTypeContext complexColType(int i) {
			return getRuleContext(ComplexColTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public ComplexColTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexColTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterComplexColTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitComplexColTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitComplexColTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplexColTypeListContext complexColTypeList() throws RecognitionException {
		ComplexColTypeListContext _localctx = new ComplexColTypeListContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_complexColTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3329);
			complexColType();
			setState(3334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(3330);
				match(COMMA);
				setState(3331);
				complexColType();
				}
				}
				setState(3336);
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

	public static class ComplexColTypeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode COLON() { return getToken(SqlBaseParser.COLON, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public CommentSpecContext commentSpec() {
			return getRuleContext(CommentSpecContext.class,0);
		}
		public ComplexColTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexColType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterComplexColType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitComplexColType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitComplexColType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplexColTypeContext complexColType() throws RecognitionException {
		ComplexColTypeContext _localctx = new ComplexColTypeContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_complexColType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3337);
			identifier();
			setState(3339);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,430,_ctx) ) {
			case 1:
				{
				setState(3338);
				match(COLON);
				}
				break;
			}
			setState(3341);
			dataType();
			setState(3344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(3342);
				match(NOT);
				setState(3343);
				match(NULL);
				}
			}

			setState(3347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(3346);
				commentSpec();
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
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterWhenClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitWhenClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitWhenClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenClauseContext whenClause() throws RecognitionException {
		WhenClauseContext _localctx = new WhenClauseContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_whenClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3349);
			match(WHEN);
			setState(3350);
			((WhenClauseContext)_localctx).condition = expression();
			setState(3351);
			match(THEN);
			setState(3352);
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

	public static class WindowClauseContext extends ParserRuleContext {
		public TerminalNode WINDOW() { return getToken(SqlBaseParser.WINDOW, 0); }
		public List<NamedWindowContext> namedWindow() {
			return getRuleContexts(NamedWindowContext.class);
		}
		public NamedWindowContext namedWindow(int i) {
			return getRuleContext(NamedWindowContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public WindowClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterWindowClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitWindowClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitWindowClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowClauseContext windowClause() throws RecognitionException {
		WindowClauseContext _localctx = new WindowClauseContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_windowClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3354);
			match(WINDOW);
			setState(3355);
			namedWindow();
			setState(3360);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,433,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3356);
					match(COMMA);
					setState(3357);
					namedWindow();
					}
					} 
				}
				setState(3362);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,433,_ctx);
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

	public static class NamedWindowContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext name;
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public WindowSpecContext windowSpec() {
			return getRuleContext(WindowSpecContext.class,0);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public NamedWindowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedWindow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterNamedWindow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitNamedWindow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitNamedWindow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedWindowContext namedWindow() throws RecognitionException {
		NamedWindowContext _localctx = new NamedWindowContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_namedWindow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3363);
			((NamedWindowContext)_localctx).name = errorCapturingIdentifier();
			setState(3364);
			match(AS);
			setState(3365);
			windowSpec();
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

	public static class WindowSpecContext extends ParserRuleContext {
		public WindowSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowSpec; }
	 
		public WindowSpecContext() { }
		public void copyFrom(WindowSpecContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WindowRefContext extends WindowSpecContext {
		public ErrorCapturingIdentifierContext name;
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public WindowRefContext(WindowSpecContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterWindowRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitWindowRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitWindowRef(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WindowDefContext extends WindowSpecContext {
		public ExpressionContext expression;
		public List<ExpressionContext> partition = new ArrayList<ExpressionContext>();
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public TerminalNode CLUSTER() { return getToken(SqlBaseParser.CLUSTER, 0); }
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public WindowFrameContext windowFrame() {
			return getRuleContext(WindowFrameContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(SqlBaseParser.DISTRIBUTE, 0); }
		public TerminalNode ORDER() { return getToken(SqlBaseParser.ORDER, 0); }
		public TerminalNode SORT() { return getToken(SqlBaseParser.SORT, 0); }
		public WindowDefContext(WindowSpecContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterWindowDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitWindowDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitWindowDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowSpecContext windowSpec() throws RecognitionException {
		WindowSpecContext _localctx = new WindowSpecContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_windowSpec);
		int _la;
		try {
			setState(3413);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,441,_ctx) ) {
			case 1:
				_localctx = new WindowRefContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(3367);
				((WindowRefContext)_localctx).name = errorCapturingIdentifier();
				}
				break;
			case 2:
				_localctx = new WindowRefContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(3368);
				match(LEFT_PAREN);
				setState(3369);
				((WindowRefContext)_localctx).name = errorCapturingIdentifier();
				setState(3370);
				match(RIGHT_PAREN);
				}
				break;
			case 3:
				_localctx = new WindowDefContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(3372);
				match(LEFT_PAREN);
				setState(3407);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CLUSTER:
					{
					setState(3373);
					match(CLUSTER);
					setState(3374);
					match(BY);
					setState(3375);
					((WindowDefContext)_localctx).expression = expression();
					((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
					setState(3380);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(3376);
						match(COMMA);
						setState(3377);
						((WindowDefContext)_localctx).expression = expression();
						((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
						}
						}
						setState(3382);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case RIGHT_PAREN:
				case DISTRIBUTE:
				case ORDER:
				case PARTITION:
				case RANGE:
				case ROWS:
				case SORT:
					{
					setState(3393);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==DISTRIBUTE || _la==PARTITION) {
						{
						setState(3383);
						_la = _input.LA(1);
						if ( !(_la==DISTRIBUTE || _la==PARTITION) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(3384);
						match(BY);
						setState(3385);
						((WindowDefContext)_localctx).expression = expression();
						((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
						setState(3390);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(3386);
							match(COMMA);
							setState(3387);
							((WindowDefContext)_localctx).expression = expression();
							((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
							}
							}
							setState(3392);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(3405);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ORDER || _la==SORT) {
						{
						setState(3395);
						_la = _input.LA(1);
						if ( !(_la==ORDER || _la==SORT) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(3396);
						match(BY);
						setState(3397);
						sortItem();
						setState(3402);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(3398);
							match(COMMA);
							setState(3399);
							sortItem();
							}
							}
							setState(3404);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(3410);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RANGE || _la==ROWS) {
					{
					setState(3409);
					windowFrame();
					}
				}

				setState(3412);
				match(RIGHT_PAREN);
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
		public TerminalNode BETWEEN() { return getToken(SqlBaseParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public WindowFrameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFrame; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterWindowFrame(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitWindowFrame(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitWindowFrame(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowFrameContext windowFrame() throws RecognitionException {
		WindowFrameContext _localctx = new WindowFrameContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_windowFrame);
		try {
			setState(3431);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,442,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3415);
				((WindowFrameContext)_localctx).frameType = match(RANGE);
				setState(3416);
				((WindowFrameContext)_localctx).start = frameBound();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3417);
				((WindowFrameContext)_localctx).frameType = match(ROWS);
				setState(3418);
				((WindowFrameContext)_localctx).start = frameBound();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3419);
				((WindowFrameContext)_localctx).frameType = match(RANGE);
				setState(3420);
				match(BETWEEN);
				setState(3421);
				((WindowFrameContext)_localctx).start = frameBound();
				setState(3422);
				match(AND);
				setState(3423);
				((WindowFrameContext)_localctx).end = frameBound();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(3425);
				((WindowFrameContext)_localctx).frameType = match(ROWS);
				setState(3426);
				match(BETWEEN);
				setState(3427);
				((WindowFrameContext)_localctx).start = frameBound();
				setState(3428);
				match(AND);
				setState(3429);
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
		public Token boundType;
		public TerminalNode UNBOUNDED() { return getToken(SqlBaseParser.UNBOUNDED, 0); }
		public TerminalNode PRECEDING() { return getToken(SqlBaseParser.PRECEDING, 0); }
		public TerminalNode FOLLOWING() { return getToken(SqlBaseParser.FOLLOWING, 0); }
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public TerminalNode CURRENT() { return getToken(SqlBaseParser.CURRENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FrameBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterFrameBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitFrameBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitFrameBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FrameBoundContext frameBound() throws RecognitionException {
		FrameBoundContext _localctx = new FrameBoundContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_frameBound);
		int _la;
		try {
			setState(3440);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,443,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3433);
				match(UNBOUNDED);
				setState(3434);
				((FrameBoundContext)_localctx).boundType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FOLLOWING || _la==PRECEDING) ) {
					((FrameBoundContext)_localctx).boundType = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3435);
				((FrameBoundContext)_localctx).boundType = match(CURRENT);
				setState(3436);
				match(ROW);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3437);
				expression();
				setState(3438);
				((FrameBoundContext)_localctx).boundType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FOLLOWING || _la==PRECEDING) ) {
					((FrameBoundContext)_localctx).boundType = (Token)_errHandler.recoverInline(this);
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

	public static class QualifiedNameListContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public QualifiedNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterQualifiedNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitQualifiedNameList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitQualifiedNameList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameListContext qualifiedNameList() throws RecognitionException {
		QualifiedNameListContext _localctx = new QualifiedNameListContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_qualifiedNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3442);
			qualifiedName();
			setState(3447);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(3443);
				match(COMMA);
				setState(3444);
				qualifiedName();
				}
				}
				setState(3449);
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

	public static class FunctionNameContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode FILTER() { return getToken(SqlBaseParser.FILTER, 0); }
		public TerminalNode LEFT() { return getToken(SqlBaseParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(SqlBaseParser.RIGHT, 0); }
		public FunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitFunctionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitFunctionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionNameContext functionName() throws RecognitionException {
		FunctionNameContext _localctx = new FunctionNameContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_functionName);
		try {
			setState(3454);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,445,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3450);
				qualifiedName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3451);
				match(FILTER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3452);
				match(LEFT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(3453);
				match(RIGHT);
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

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(SqlBaseParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SqlBaseParser.DOT, i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3456);
			identifier();
			setState(3461);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,446,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3457);
					match(DOT);
					setState(3458);
					identifier();
					}
					} 
				}
				setState(3463);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,446,_ctx);
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

	public static class ErrorCapturingIdentifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ErrorCapturingIdentifierExtraContext errorCapturingIdentifierExtra() {
			return getRuleContext(ErrorCapturingIdentifierExtraContext.class,0);
		}
		public ErrorCapturingIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorCapturingIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterErrorCapturingIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitErrorCapturingIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitErrorCapturingIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorCapturingIdentifierContext errorCapturingIdentifier() throws RecognitionException {
		ErrorCapturingIdentifierContext _localctx = new ErrorCapturingIdentifierContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_errorCapturingIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3464);
			identifier();
			setState(3465);
			errorCapturingIdentifierExtra();
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

	public static class ErrorCapturingIdentifierExtraContext extends ParserRuleContext {
		public ErrorCapturingIdentifierExtraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorCapturingIdentifierExtra; }
	 
		public ErrorCapturingIdentifierExtraContext() { }
		public void copyFrom(ErrorCapturingIdentifierExtraContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ErrorIdentContext extends ErrorCapturingIdentifierExtraContext {
		public List<TerminalNode> MINUS() { return getTokens(SqlBaseParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(SqlBaseParser.MINUS, i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public ErrorIdentContext(ErrorCapturingIdentifierExtraContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterErrorIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitErrorIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitErrorIdent(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RealIdentContext extends ErrorCapturingIdentifierExtraContext {
		public RealIdentContext(ErrorCapturingIdentifierExtraContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterRealIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitRealIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitRealIdent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorCapturingIdentifierExtraContext errorCapturingIdentifierExtra() throws RecognitionException {
		ErrorCapturingIdentifierExtraContext _localctx = new ErrorCapturingIdentifierExtraContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_errorCapturingIdentifierExtra);
		try {
			int _alt;
			setState(3474);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,448,_ctx) ) {
			case 1:
				_localctx = new ErrorIdentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(3469); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(3467);
						match(MINUS);
						setState(3468);
						identifier();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(3471); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,447,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				_localctx = new RealIdentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
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

	public static class IdentifierContext extends ParserRuleContext {
		public StrictIdentifierContext strictIdentifier() {
			return getRuleContext(StrictIdentifierContext.class,0);
		}
		public StrictNonReservedContext strictNonReserved() {
			return getRuleContext(StrictNonReservedContext.class,0);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_identifier);
		try {
			setState(3479);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,449,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3476);
				strictIdentifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3477);
				if (!(!SQL_standard_keyword_behavior)) throw new FailedPredicateException(this, "!SQL_standard_keyword_behavior");
				setState(3478);
				strictNonReserved();
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

	public static class StrictIdentifierContext extends ParserRuleContext {
		public StrictIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strictIdentifier; }
	 
		public StrictIdentifierContext() { }
		public void copyFrom(StrictIdentifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class QuotedIdentifierAlternativeContext extends StrictIdentifierContext {
		public QuotedIdentifierContext quotedIdentifier() {
			return getRuleContext(QuotedIdentifierContext.class,0);
		}
		public QuotedIdentifierAlternativeContext(StrictIdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterQuotedIdentifierAlternative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitQuotedIdentifierAlternative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitQuotedIdentifierAlternative(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnquotedIdentifierContext extends StrictIdentifierContext {
		public TerminalNode IDENTIFIER() { return getToken(SqlBaseParser.IDENTIFIER, 0); }
		public AnsiNonReservedContext ansiNonReserved() {
			return getRuleContext(AnsiNonReservedContext.class,0);
		}
		public NonReservedContext nonReserved() {
			return getRuleContext(NonReservedContext.class,0);
		}
		public UnquotedIdentifierContext(StrictIdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterUnquotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitUnquotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitUnquotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrictIdentifierContext strictIdentifier() throws RecognitionException {
		StrictIdentifierContext _localctx = new StrictIdentifierContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_strictIdentifier);
		try {
			setState(3487);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,450,_ctx) ) {
			case 1:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(3481);
				match(IDENTIFIER);
				}
				break;
			case 2:
				_localctx = new QuotedIdentifierAlternativeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(3482);
				quotedIdentifier();
				}
				break;
			case 3:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(3483);
				if (!(SQL_standard_keyword_behavior)) throw new FailedPredicateException(this, "SQL_standard_keyword_behavior");
				setState(3484);
				ansiNonReserved();
				}
				break;
			case 4:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(3485);
				if (!(!SQL_standard_keyword_behavior)) throw new FailedPredicateException(this, "!SQL_standard_keyword_behavior");
				setState(3486);
				nonReserved();
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

	public static class QuotedIdentifierContext extends ParserRuleContext {
		public TerminalNode BACKQUOTED_IDENTIFIER() { return getToken(SqlBaseParser.BACKQUOTED_IDENTIFIER, 0); }
		public TerminalNode DOUBLEQUOTED_STRING() { return getToken(SqlBaseParser.DOUBLEQUOTED_STRING, 0); }
		public QuotedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quotedIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterQuotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitQuotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitQuotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuotedIdentifierContext quotedIdentifier() throws RecognitionException {
		QuotedIdentifierContext _localctx = new QuotedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_quotedIdentifier);
		try {
			setState(3492);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,451,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3489);
				match(BACKQUOTED_IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3490);
				if (!(double_quoted_identifiers)) throw new FailedPredicateException(this, "double_quoted_identifiers");
				setState(3491);
				match(DOUBLEQUOTED_STRING);
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

	public static class BackQuotedIdentifierContext extends ParserRuleContext {
		public TerminalNode BACKQUOTED_IDENTIFIER() { return getToken(SqlBaseParser.BACKQUOTED_IDENTIFIER, 0); }
		public BackQuotedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_backQuotedIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterBackQuotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitBackQuotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitBackQuotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BackQuotedIdentifierContext backQuotedIdentifier() throws RecognitionException {
		BackQuotedIdentifierContext _localctx = new BackQuotedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_backQuotedIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3494);
			match(BACKQUOTED_IDENTIFIER);
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
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public DecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BigIntLiteralContext extends NumberContext {
		public TerminalNode BIGINT_LITERAL() { return getToken(SqlBaseParser.BIGINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public BigIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterBigIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitBigIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitBigIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TinyIntLiteralContext extends NumberContext {
		public TerminalNode TINYINT_LITERAL() { return getToken(SqlBaseParser.TINYINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public TinyIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterTinyIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitTinyIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitTinyIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LegacyDecimalLiteralContext extends NumberContext {
		public TerminalNode EXPONENT_VALUE() { return getToken(SqlBaseParser.EXPONENT_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(SqlBaseParser.DECIMAL_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public LegacyDecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterLegacyDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitLegacyDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitLegacyDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BigDecimalLiteralContext extends NumberContext {
		public TerminalNode BIGDECIMAL_LITERAL() { return getToken(SqlBaseParser.BIGDECIMAL_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public BigDecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterBigDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitBigDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitBigDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExponentLiteralContext extends NumberContext {
		public TerminalNode EXPONENT_VALUE() { return getToken(SqlBaseParser.EXPONENT_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public ExponentLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterExponentLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitExponentLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitExponentLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleLiteralContext extends NumberContext {
		public TerminalNode DOUBLE_LITERAL() { return getToken(SqlBaseParser.DOUBLE_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public DoubleLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterDoubleLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitDoubleLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitDoubleLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerLiteralContext extends NumberContext {
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public IntegerLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FloatLiteralContext extends NumberContext {
		public TerminalNode FLOAT_LITERAL() { return getToken(SqlBaseParser.FLOAT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public FloatLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterFloatLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitFloatLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitFloatLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SmallIntLiteralContext extends NumberContext {
		public TerminalNode SMALLINT_LITERAL() { return getToken(SqlBaseParser.SMALLINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public SmallIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSmallIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSmallIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitSmallIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_number);
		int _la;
		try {
			setState(3539);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,462,_ctx) ) {
			case 1:
				_localctx = new ExponentLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(3496);
				if (!(!legacy_exponent_literal_as_decimal_enabled)) throw new FailedPredicateException(this, "!legacy_exponent_literal_as_decimal_enabled");
				setState(3498);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3497);
					match(MINUS);
					}
				}

				setState(3500);
				match(EXPONENT_VALUE);
				}
				break;
			case 2:
				_localctx = new DecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(3501);
				if (!(!legacy_exponent_literal_as_decimal_enabled)) throw new FailedPredicateException(this, "!legacy_exponent_literal_as_decimal_enabled");
				setState(3503);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3502);
					match(MINUS);
					}
				}

				setState(3505);
				match(DECIMAL_VALUE);
				}
				break;
			case 3:
				_localctx = new LegacyDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(3506);
				if (!(legacy_exponent_literal_as_decimal_enabled)) throw new FailedPredicateException(this, "legacy_exponent_literal_as_decimal_enabled");
				setState(3508);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3507);
					match(MINUS);
					}
				}

				setState(3510);
				_la = _input.LA(1);
				if ( !(_la==EXPONENT_VALUE || _la==DECIMAL_VALUE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 4:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(3512);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3511);
					match(MINUS);
					}
				}

				setState(3514);
				match(INTEGER_VALUE);
				}
				break;
			case 5:
				_localctx = new BigIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(3516);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3515);
					match(MINUS);
					}
				}

				setState(3518);
				match(BIGINT_LITERAL);
				}
				break;
			case 6:
				_localctx = new SmallIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(3520);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3519);
					match(MINUS);
					}
				}

				setState(3522);
				match(SMALLINT_LITERAL);
				}
				break;
			case 7:
				_localctx = new TinyIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(3524);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3523);
					match(MINUS);
					}
				}

				setState(3526);
				match(TINYINT_LITERAL);
				}
				break;
			case 8:
				_localctx = new DoubleLiteralContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(3528);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3527);
					match(MINUS);
					}
				}

				setState(3530);
				match(DOUBLE_LITERAL);
				}
				break;
			case 9:
				_localctx = new FloatLiteralContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(3532);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3531);
					match(MINUS);
					}
				}

				setState(3534);
				match(FLOAT_LITERAL);
				}
				break;
			case 10:
				_localctx = new BigDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(3536);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3535);
					match(MINUS);
					}
				}

				setState(3538);
				match(BIGDECIMAL_LITERAL);
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

	public static class AlterColumnActionContext extends ParserRuleContext {
		public Token setOrDrop;
		public Token dropDefault;
		public TerminalNode TYPE() { return getToken(SqlBaseParser.TYPE, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public CommentSpecContext commentSpec() {
			return getRuleContext(CommentSpecContext.class,0);
		}
		public ColPositionContext colPosition() {
			return getRuleContext(ColPositionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public DefaultExpressionContext defaultExpression() {
			return getRuleContext(DefaultExpressionContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(SqlBaseParser.DEFAULT, 0); }
		public AlterColumnActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterColumnAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterAlterColumnAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitAlterColumnAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitAlterColumnAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterColumnActionContext alterColumnAction() throws RecognitionException {
		AlterColumnActionContext _localctx = new AlterColumnActionContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_alterColumnAction);
		int _la;
		try {
			setState(3552);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,463,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3541);
				match(TYPE);
				setState(3542);
				dataType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3543);
				commentSpec();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3544);
				colPosition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(3545);
				((AlterColumnActionContext)_localctx).setOrDrop = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==DROP || _la==SET) ) {
					((AlterColumnActionContext)_localctx).setOrDrop = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(3546);
				match(NOT);
				setState(3547);
				match(NULL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(3548);
				match(SET);
				setState(3549);
				defaultExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(3550);
				((AlterColumnActionContext)_localctx).dropDefault = match(DROP);
				setState(3551);
				match(DEFAULT);
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

	public static class StringLitContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode DOUBLEQUOTED_STRING() { return getToken(SqlBaseParser.DOUBLEQUOTED_STRING, 0); }
		public StringLitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterStringLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitStringLit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitStringLit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringLitContext stringLit() throws RecognitionException {
		StringLitContext _localctx = new StringLitContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_stringLit);
		try {
			setState(3557);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,464,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3554);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3555);
				if (!(!double_quoted_identifiers)) throw new FailedPredicateException(this, "!double_quoted_identifiers");
				setState(3556);
				match(DOUBLEQUOTED_STRING);
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

	public static class CommentContext extends ParserRuleContext {
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_comment);
		try {
			setState(3561);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,465,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3559);
				stringLit();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3560);
				match(NULL);
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

	public static class VersionContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public VersionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_version; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterVersion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitVersion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitVersion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VersionContext version() throws RecognitionException {
		VersionContext _localctx = new VersionContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_version);
		try {
			setState(3565);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,466,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3563);
				match(INTEGER_VALUE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3564);
				stringLit();
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

	public static class AnsiNonReservedContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode AFTER() { return getToken(SqlBaseParser.AFTER, 0); }
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode ANALYZE() { return getToken(SqlBaseParser.ANALYZE, 0); }
		public TerminalNode ANTI() { return getToken(SqlBaseParser.ANTI, 0); }
		public TerminalNode ANY_VALUE() { return getToken(SqlBaseParser.ANY_VALUE, 0); }
		public TerminalNode ARCHIVE() { return getToken(SqlBaseParser.ARCHIVE, 0); }
		public TerminalNode ARRAY() { return getToken(SqlBaseParser.ARRAY, 0); }
		public TerminalNode ASC() { return getToken(SqlBaseParser.ASC, 0); }
		public TerminalNode AT() { return getToken(SqlBaseParser.AT, 0); }
		public TerminalNode BETWEEN() { return getToken(SqlBaseParser.BETWEEN, 0); }
		public TerminalNode BUCKET() { return getToken(SqlBaseParser.BUCKET, 0); }
		public TerminalNode BUCKETS() { return getToken(SqlBaseParser.BUCKETS, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public TerminalNode CACHE() { return getToken(SqlBaseParser.CACHE, 0); }
		public TerminalNode CASCADE() { return getToken(SqlBaseParser.CASCADE, 0); }
		public TerminalNode CATALOG() { return getToken(SqlBaseParser.CATALOG, 0); }
		public TerminalNode CATALOGS() { return getToken(SqlBaseParser.CATALOGS, 0); }
		public TerminalNode CHANGE() { return getToken(SqlBaseParser.CHANGE, 0); }
		public TerminalNode CLEAR() { return getToken(SqlBaseParser.CLEAR, 0); }
		public TerminalNode CLUSTER() { return getToken(SqlBaseParser.CLUSTER, 0); }
		public TerminalNode CLUSTERED() { return getToken(SqlBaseParser.CLUSTERED, 0); }
		public TerminalNode CODEGEN() { return getToken(SqlBaseParser.CODEGEN, 0); }
		public TerminalNode COLLECTION() { return getToken(SqlBaseParser.COLLECTION, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode COMMIT() { return getToken(SqlBaseParser.COMMIT, 0); }
		public TerminalNode COMPACT() { return getToken(SqlBaseParser.COMPACT, 0); }
		public TerminalNode COMPACTIONS() { return getToken(SqlBaseParser.COMPACTIONS, 0); }
		public TerminalNode COMPUTE() { return getToken(SqlBaseParser.COMPUTE, 0); }
		public TerminalNode CONCATENATE() { return getToken(SqlBaseParser.CONCATENATE, 0); }
		public TerminalNode COST() { return getToken(SqlBaseParser.COST, 0); }
		public TerminalNode CUBE() { return getToken(SqlBaseParser.CUBE, 0); }
		public TerminalNode CURRENT() { return getToken(SqlBaseParser.CURRENT, 0); }
		public TerminalNode DATA() { return getToken(SqlBaseParser.DATA, 0); }
		public TerminalNode DATABASE() { return getToken(SqlBaseParser.DATABASE, 0); }
		public TerminalNode DATABASES() { return getToken(SqlBaseParser.DATABASES, 0); }
		public TerminalNode DATEADD() { return getToken(SqlBaseParser.DATEADD, 0); }
		public TerminalNode DATEDIFF() { return getToken(SqlBaseParser.DATEDIFF, 0); }
		public TerminalNode DAY() { return getToken(SqlBaseParser.DAY, 0); }
		public TerminalNode DAYS() { return getToken(SqlBaseParser.DAYS, 0); }
		public TerminalNode DAYOFYEAR() { return getToken(SqlBaseParser.DAYOFYEAR, 0); }
		public TerminalNode DBPROPERTIES() { return getToken(SqlBaseParser.DBPROPERTIES, 0); }
		public TerminalNode DEFAULT() { return getToken(SqlBaseParser.DEFAULT, 0); }
		public TerminalNode DEFINED() { return getToken(SqlBaseParser.DEFINED, 0); }
		public TerminalNode DELETE() { return getToken(SqlBaseParser.DELETE, 0); }
		public TerminalNode DELIMITED() { return getToken(SqlBaseParser.DELIMITED, 0); }
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode DFS() { return getToken(SqlBaseParser.DFS, 0); }
		public TerminalNode DIRECTORIES() { return getToken(SqlBaseParser.DIRECTORIES, 0); }
		public TerminalNode DIRECTORY() { return getToken(SqlBaseParser.DIRECTORY, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(SqlBaseParser.DISTRIBUTE, 0); }
		public TerminalNode DIV() { return getToken(SqlBaseParser.DIV, 0); }
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode ESCAPED() { return getToken(SqlBaseParser.ESCAPED, 0); }
		public TerminalNode EXCHANGE() { return getToken(SqlBaseParser.EXCHANGE, 0); }
		public TerminalNode EXCLUDE() { return getToken(SqlBaseParser.EXCLUDE, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode EXPLAIN() { return getToken(SqlBaseParser.EXPLAIN, 0); }
		public TerminalNode EXPORT() { return getToken(SqlBaseParser.EXPORT, 0); }
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public TerminalNode EXTERNAL() { return getToken(SqlBaseParser.EXTERNAL, 0); }
		public TerminalNode EXTRACT() { return getToken(SqlBaseParser.EXTRACT, 0); }
		public TerminalNode FIELDS() { return getToken(SqlBaseParser.FIELDS, 0); }
		public TerminalNode FILEFORMAT() { return getToken(SqlBaseParser.FILEFORMAT, 0); }
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public TerminalNode FOLLOWING() { return getToken(SqlBaseParser.FOLLOWING, 0); }
		public TerminalNode FORMAT() { return getToken(SqlBaseParser.FORMAT, 0); }
		public TerminalNode FORMATTED() { return getToken(SqlBaseParser.FORMATTED, 0); }
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public TerminalNode FUNCTIONS() { return getToken(SqlBaseParser.FUNCTIONS, 0); }
		public TerminalNode GLOBAL() { return getToken(SqlBaseParser.GLOBAL, 0); }
		public TerminalNode GROUPING() { return getToken(SqlBaseParser.GROUPING, 0); }
		public TerminalNode HOUR() { return getToken(SqlBaseParser.HOUR, 0); }
		public TerminalNode HOURS() { return getToken(SqlBaseParser.HOURS, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode IGNORE() { return getToken(SqlBaseParser.IGNORE, 0); }
		public TerminalNode IMPORT() { return getToken(SqlBaseParser.IMPORT, 0); }
		public TerminalNode INCLUDE() { return getToken(SqlBaseParser.INCLUDE, 0); }
		public TerminalNode INDEX() { return getToken(SqlBaseParser.INDEX, 0); }
		public TerminalNode INDEXES() { return getToken(SqlBaseParser.INDEXES, 0); }
		public TerminalNode INPATH() { return getToken(SqlBaseParser.INPATH, 0); }
		public TerminalNode INPUTFORMAT() { return getToken(SqlBaseParser.INPUTFORMAT, 0); }
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode INTERVAL() { return getToken(SqlBaseParser.INTERVAL, 0); }
		public TerminalNode ITEMS() { return getToken(SqlBaseParser.ITEMS, 0); }
		public TerminalNode KEYS() { return getToken(SqlBaseParser.KEYS, 0); }
		public TerminalNode LAST() { return getToken(SqlBaseParser.LAST, 0); }
		public TerminalNode LAZY() { return getToken(SqlBaseParser.LAZY, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public TerminalNode ILIKE() { return getToken(SqlBaseParser.ILIKE, 0); }
		public TerminalNode LIMIT() { return getToken(SqlBaseParser.LIMIT, 0); }
		public TerminalNode LINES() { return getToken(SqlBaseParser.LINES, 0); }
		public TerminalNode LIST() { return getToken(SqlBaseParser.LIST, 0); }
		public TerminalNode LOAD() { return getToken(SqlBaseParser.LOAD, 0); }
		public TerminalNode LOCAL() { return getToken(SqlBaseParser.LOCAL, 0); }
		public TerminalNode LOCATION() { return getToken(SqlBaseParser.LOCATION, 0); }
		public TerminalNode LOCK() { return getToken(SqlBaseParser.LOCK, 0); }
		public TerminalNode LOCKS() { return getToken(SqlBaseParser.LOCKS, 0); }
		public TerminalNode LOGICAL() { return getToken(SqlBaseParser.LOGICAL, 0); }
		public TerminalNode MACRO() { return getToken(SqlBaseParser.MACRO, 0); }
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode MATCHED() { return getToken(SqlBaseParser.MATCHED, 0); }
		public TerminalNode MERGE() { return getToken(SqlBaseParser.MERGE, 0); }
		public TerminalNode MICROSECOND() { return getToken(SqlBaseParser.MICROSECOND, 0); }
		public TerminalNode MICROSECONDS() { return getToken(SqlBaseParser.MICROSECONDS, 0); }
		public TerminalNode MILLISECOND() { return getToken(SqlBaseParser.MILLISECOND, 0); }
		public TerminalNode MILLISECONDS() { return getToken(SqlBaseParser.MILLISECONDS, 0); }
		public TerminalNode MINUTE() { return getToken(SqlBaseParser.MINUTE, 0); }
		public TerminalNode MINUTES() { return getToken(SqlBaseParser.MINUTES, 0); }
		public TerminalNode MONTH() { return getToken(SqlBaseParser.MONTH, 0); }
		public TerminalNode MONTHS() { return getToken(SqlBaseParser.MONTHS, 0); }
		public TerminalNode MSCK() { return getToken(SqlBaseParser.MSCK, 0); }
		public TerminalNode NAMESPACE() { return getToken(SqlBaseParser.NAMESPACE, 0); }
		public TerminalNode NAMESPACES() { return getToken(SqlBaseParser.NAMESPACES, 0); }
		public TerminalNode NANOSECOND() { return getToken(SqlBaseParser.NANOSECOND, 0); }
		public TerminalNode NANOSECONDS() { return getToken(SqlBaseParser.NANOSECONDS, 0); }
		public TerminalNode NO() { return getToken(SqlBaseParser.NO, 0); }
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public TerminalNode OF() { return getToken(SqlBaseParser.OF, 0); }
		public TerminalNode OPTION() { return getToken(SqlBaseParser.OPTION, 0); }
		public TerminalNode OPTIONS() { return getToken(SqlBaseParser.OPTIONS, 0); }
		public TerminalNode OUT() { return getToken(SqlBaseParser.OUT, 0); }
		public TerminalNode OUTPUTFORMAT() { return getToken(SqlBaseParser.OUTPUTFORMAT, 0); }
		public TerminalNode OVER() { return getToken(SqlBaseParser.OVER, 0); }
		public TerminalNode OVERLAY() { return getToken(SqlBaseParser.OVERLAY, 0); }
		public TerminalNode OVERWRITE() { return getToken(SqlBaseParser.OVERWRITE, 0); }
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public TerminalNode PARTITIONED() { return getToken(SqlBaseParser.PARTITIONED, 0); }
		public TerminalNode PARTITIONS() { return getToken(SqlBaseParser.PARTITIONS, 0); }
		public TerminalNode PERCENTLIT() { return getToken(SqlBaseParser.PERCENTLIT, 0); }
		public TerminalNode PIVOT() { return getToken(SqlBaseParser.PIVOT, 0); }
		public TerminalNode PLACING() { return getToken(SqlBaseParser.PLACING, 0); }
		public TerminalNode POSITION() { return getToken(SqlBaseParser.POSITION, 0); }
		public TerminalNode PRECEDING() { return getToken(SqlBaseParser.PRECEDING, 0); }
		public TerminalNode PRINCIPALS() { return getToken(SqlBaseParser.PRINCIPALS, 0); }
		public TerminalNode PROPERTIES() { return getToken(SqlBaseParser.PROPERTIES, 0); }
		public TerminalNode PURGE() { return getToken(SqlBaseParser.PURGE, 0); }
		public TerminalNode QUARTER() { return getToken(SqlBaseParser.QUARTER, 0); }
		public TerminalNode QUERY() { return getToken(SqlBaseParser.QUERY, 0); }
		public TerminalNode RANGE() { return getToken(SqlBaseParser.RANGE, 0); }
		public TerminalNode RECORDREADER() { return getToken(SqlBaseParser.RECORDREADER, 0); }
		public TerminalNode RECORDWRITER() { return getToken(SqlBaseParser.RECORDWRITER, 0); }
		public TerminalNode RECOVER() { return getToken(SqlBaseParser.RECOVER, 0); }
		public TerminalNode REDUCE() { return getToken(SqlBaseParser.REDUCE, 0); }
		public TerminalNode REFRESH() { return getToken(SqlBaseParser.REFRESH, 0); }
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode REPAIR() { return getToken(SqlBaseParser.REPAIR, 0); }
		public TerminalNode REPEATABLE() { return getToken(SqlBaseParser.REPEATABLE, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode RESET() { return getToken(SqlBaseParser.RESET, 0); }
		public TerminalNode RESPECT() { return getToken(SqlBaseParser.RESPECT, 0); }
		public TerminalNode RESTRICT() { return getToken(SqlBaseParser.RESTRICT, 0); }
		public TerminalNode REVOKE() { return getToken(SqlBaseParser.REVOKE, 0); }
		public TerminalNode RLIKE() { return getToken(SqlBaseParser.RLIKE, 0); }
		public TerminalNode ROLE() { return getToken(SqlBaseParser.ROLE, 0); }
		public TerminalNode ROLES() { return getToken(SqlBaseParser.ROLES, 0); }
		public TerminalNode ROLLBACK() { return getToken(SqlBaseParser.ROLLBACK, 0); }
		public TerminalNode ROLLUP() { return getToken(SqlBaseParser.ROLLUP, 0); }
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public TerminalNode ROWS() { return getToken(SqlBaseParser.ROWS, 0); }
		public TerminalNode SCHEMA() { return getToken(SqlBaseParser.SCHEMA, 0); }
		public TerminalNode SCHEMAS() { return getToken(SqlBaseParser.SCHEMAS, 0); }
		public TerminalNode SECOND() { return getToken(SqlBaseParser.SECOND, 0); }
		public TerminalNode SECONDS() { return getToken(SqlBaseParser.SECONDS, 0); }
		public TerminalNode SEMI() { return getToken(SqlBaseParser.SEMI, 0); }
		public TerminalNode SEPARATED() { return getToken(SqlBaseParser.SEPARATED, 0); }
		public TerminalNode SERDE() { return getToken(SqlBaseParser.SERDE, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SqlBaseParser.SERDEPROPERTIES, 0); }
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode SETMINUS() { return getToken(SqlBaseParser.SETMINUS, 0); }
		public TerminalNode SETS() { return getToken(SqlBaseParser.SETS, 0); }
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode SKEWED() { return getToken(SqlBaseParser.SKEWED, 0); }
		public TerminalNode SORT() { return getToken(SqlBaseParser.SORT, 0); }
		public TerminalNode SORTED() { return getToken(SqlBaseParser.SORTED, 0); }
		public TerminalNode SOURCE() { return getToken(SqlBaseParser.SOURCE, 0); }
		public TerminalNode START() { return getToken(SqlBaseParser.START, 0); }
		public TerminalNode STATISTICS() { return getToken(SqlBaseParser.STATISTICS, 0); }
		public TerminalNode STORED() { return getToken(SqlBaseParser.STORED, 0); }
		public TerminalNode STRATIFY() { return getToken(SqlBaseParser.STRATIFY, 0); }
		public TerminalNode STRUCT() { return getToken(SqlBaseParser.STRUCT, 0); }
		public TerminalNode SUBSTR() { return getToken(SqlBaseParser.SUBSTR, 0); }
		public TerminalNode SUBSTRING() { return getToken(SqlBaseParser.SUBSTRING, 0); }
		public TerminalNode SYNC() { return getToken(SqlBaseParser.SYNC, 0); }
		public TerminalNode SYSTEM_TIME() { return getToken(SqlBaseParser.SYSTEM_TIME, 0); }
		public TerminalNode SYSTEM_VERSION() { return getToken(SqlBaseParser.SYSTEM_VERSION, 0); }
		public TerminalNode TABLES() { return getToken(SqlBaseParser.TABLES, 0); }
		public TerminalNode TABLESAMPLE() { return getToken(SqlBaseParser.TABLESAMPLE, 0); }
		public TerminalNode TARGET() { return getToken(SqlBaseParser.TARGET, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SqlBaseParser.TBLPROPERTIES, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode TERMINATED() { return getToken(SqlBaseParser.TERMINATED, 0); }
		public TerminalNode TIMESTAMP() { return getToken(SqlBaseParser.TIMESTAMP, 0); }
		public TerminalNode TIMESTAMPADD() { return getToken(SqlBaseParser.TIMESTAMPADD, 0); }
		public TerminalNode TIMESTAMPDIFF() { return getToken(SqlBaseParser.TIMESTAMPDIFF, 0); }
		public TerminalNode TOUCH() { return getToken(SqlBaseParser.TOUCH, 0); }
		public TerminalNode TRANSACTION() { return getToken(SqlBaseParser.TRANSACTION, 0); }
		public TerminalNode TRANSACTIONS() { return getToken(SqlBaseParser.TRANSACTIONS, 0); }
		public TerminalNode TRANSFORM() { return getToken(SqlBaseParser.TRANSFORM, 0); }
		public TerminalNode TRIM() { return getToken(SqlBaseParser.TRIM, 0); }
		public TerminalNode TRUE() { return getToken(SqlBaseParser.TRUE, 0); }
		public TerminalNode TRUNCATE() { return getToken(SqlBaseParser.TRUNCATE, 0); }
		public TerminalNode TRY_CAST() { return getToken(SqlBaseParser.TRY_CAST, 0); }
		public TerminalNode TYPE() { return getToken(SqlBaseParser.TYPE, 0); }
		public TerminalNode UNARCHIVE() { return getToken(SqlBaseParser.UNARCHIVE, 0); }
		public TerminalNode UNBOUNDED() { return getToken(SqlBaseParser.UNBOUNDED, 0); }
		public TerminalNode UNCACHE() { return getToken(SqlBaseParser.UNCACHE, 0); }
		public TerminalNode UNLOCK() { return getToken(SqlBaseParser.UNLOCK, 0); }
		public TerminalNode UNPIVOT() { return getToken(SqlBaseParser.UNPIVOT, 0); }
		public TerminalNode UNSET() { return getToken(SqlBaseParser.UNSET, 0); }
		public TerminalNode UPDATE() { return getToken(SqlBaseParser.UPDATE, 0); }
		public TerminalNode USE() { return getToken(SqlBaseParser.USE, 0); }
		public TerminalNode VALUES() { return getToken(SqlBaseParser.VALUES, 0); }
		public TerminalNode VERSION() { return getToken(SqlBaseParser.VERSION, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TerminalNode VIEWS() { return getToken(SqlBaseParser.VIEWS, 0); }
		public TerminalNode WEEK() { return getToken(SqlBaseParser.WEEK, 0); }
		public TerminalNode WEEKS() { return getToken(SqlBaseParser.WEEKS, 0); }
		public TerminalNode WINDOW() { return getToken(SqlBaseParser.WINDOW, 0); }
		public TerminalNode YEAR() { return getToken(SqlBaseParser.YEAR, 0); }
		public TerminalNode YEARS() { return getToken(SqlBaseParser.YEARS, 0); }
		public TerminalNode ZONE() { return getToken(SqlBaseParser.ZONE, 0); }
		public TerminalNode COLLECT_SET() { return getToken(SqlBaseParser.COLLECT_SET, 0); }
		public AnsiNonReservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ansiNonReserved; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterAnsiNonReserved(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitAnsiNonReserved(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitAnsiNonReserved(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnsiNonReservedContext ansiNonReserved() throws RecognitionException {
		AnsiNonReservedContext _localctx = new AnsiNonReservedContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_ansiNonReserved);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3567);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << AFTER) | (1L << ALTER) | (1L << ANALYZE) | (1L << ANTI) | (1L << ANY_VALUE) | (1L << ARCHIVE) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << BETWEEN) | (1L << BUCKET) | (1L << BUCKETS) | (1L << BY) | (1L << CACHE) | (1L << CASCADE) | (1L << CATALOG) | (1L << CATALOGS) | (1L << CHANGE) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CLUSTERED) | (1L << CODEGEN) | (1L << COLLECTION) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMPACT) | (1L << COMPACTIONS) | (1L << COMPUTE) | (1L << CONCATENATE) | (1L << COST) | (1L << CUBE) | (1L << CURRENT) | (1L << DAY) | (1L << DAYS) | (1L << DAYOFYEAR) | (1L << DATA))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DATABASE - 64)) | (1L << (DATABASES - 64)) | (1L << (DATEADD - 64)) | (1L << (DATEDIFF - 64)) | (1L << (DBPROPERTIES - 64)) | (1L << (DEFAULT - 64)) | (1L << (DEFINED - 64)) | (1L << (DELETE - 64)) | (1L << (DELIMITED - 64)) | (1L << (DESC - 64)) | (1L << (DESCRIBE - 64)) | (1L << (DFS - 64)) | (1L << (DIRECTORIES - 64)) | (1L << (DIRECTORY - 64)) | (1L << (DISTRIBUTE - 64)) | (1L << (DIV - 64)) | (1L << (DROP - 64)) | (1L << (ESCAPED - 64)) | (1L << (EXCHANGE - 64)) | (1L << (EXCLUDE - 64)) | (1L << (EXISTS - 64)) | (1L << (EXPLAIN - 64)) | (1L << (EXPORT - 64)) | (1L << (EXTENDED - 64)) | (1L << (EXTERNAL - 64)) | (1L << (EXTRACT - 64)) | (1L << (FIELDS - 64)) | (1L << (FILEFORMAT - 64)) | (1L << (FIRST - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FORMAT - 64)) | (1L << (FORMATTED - 64)) | (1L << (FUNCTION - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GLOBAL - 64)) | (1L << (GROUPING - 64)) | (1L << (HOUR - 64)) | (1L << (HOURS - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (IMPORT - 64)) | (1L << (INCLUDE - 64)) | (1L << (INDEX - 64)) | (1L << (INDEXES - 64)) | (1L << (INPATH - 64)) | (1L << (INPUTFORMAT - 64)) | (1L << (INSERT - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (INTERVAL - 129)) | (1L << (ITEMS - 129)) | (1L << (KEYS - 129)) | (1L << (LAST - 129)) | (1L << (LAZY - 129)) | (1L << (LIKE - 129)) | (1L << (ILIKE - 129)) | (1L << (LIMIT - 129)) | (1L << (LINES - 129)) | (1L << (LIST - 129)) | (1L << (LOAD - 129)) | (1L << (LOCAL - 129)) | (1L << (LOCATION - 129)) | (1L << (LOCK - 129)) | (1L << (LOCKS - 129)) | (1L << (LOGICAL - 129)) | (1L << (MACRO - 129)) | (1L << (MAP - 129)) | (1L << (MATCHED - 129)) | (1L << (MERGE - 129)) | (1L << (MICROSECOND - 129)) | (1L << (MICROSECONDS - 129)) | (1L << (MILLISECOND - 129)) | (1L << (MILLISECONDS - 129)) | (1L << (MINUTE - 129)) | (1L << (MINUTES - 129)) | (1L << (MONTH - 129)) | (1L << (MONTHS - 129)) | (1L << (MSCK - 129)) | (1L << (NAMESPACE - 129)) | (1L << (NAMESPACES - 129)) | (1L << (NANOSECOND - 129)) | (1L << (NANOSECONDS - 129)) | (1L << (NO - 129)) | (1L << (NULLS - 129)) | (1L << (OF - 129)) | (1L << (OPTION - 129)) | (1L << (OPTIONS - 129)) | (1L << (OUT - 129)) | (1L << (OUTPUTFORMAT - 129)) | (1L << (OVER - 129)) | (1L << (OVERLAY - 129)) | (1L << (OVERWRITE - 129)) | (1L << (PARTITION - 129)) | (1L << (PARTITIONED - 129)) | (1L << (PARTITIONS - 129)))) != 0) || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (PERCENTLIT - 193)) | (1L << (PIVOT - 193)) | (1L << (PLACING - 193)) | (1L << (POSITION - 193)) | (1L << (PRECEDING - 193)) | (1L << (PRINCIPALS - 193)) | (1L << (PROPERTIES - 193)) | (1L << (PURGE - 193)) | (1L << (QUARTER - 193)) | (1L << (QUERY - 193)) | (1L << (RANGE - 193)) | (1L << (RECORDREADER - 193)) | (1L << (RECORDWRITER - 193)) | (1L << (RECOVER - 193)) | (1L << (REDUCE - 193)) | (1L << (REFRESH - 193)) | (1L << (RENAME - 193)) | (1L << (REPAIR - 193)) | (1L << (REPEATABLE - 193)) | (1L << (REPLACE - 193)) | (1L << (RESET - 193)) | (1L << (RESPECT - 193)) | (1L << (RESTRICT - 193)) | (1L << (REVOKE - 193)) | (1L << (RLIKE - 193)) | (1L << (ROLE - 193)) | (1L << (ROLES - 193)) | (1L << (ROLLBACK - 193)) | (1L << (ROLLUP - 193)) | (1L << (ROW - 193)) | (1L << (ROWS - 193)) | (1L << (SECOND - 193)) | (1L << (SECONDS - 193)) | (1L << (SCHEMA - 193)) | (1L << (SCHEMAS - 193)) | (1L << (SEMI - 193)) | (1L << (SEPARATED - 193)) | (1L << (SERDE - 193)) | (1L << (SERDEPROPERTIES - 193)) | (1L << (SET - 193)) | (1L << (SETMINUS - 193)) | (1L << (SETS - 193)) | (1L << (SHOW - 193)) | (1L << (SKEWED - 193)) | (1L << (SORT - 193)) | (1L << (SORTED - 193)) | (1L << (SOURCE - 193)) | (1L << (START - 193)) | (1L << (STATISTICS - 193)) | (1L << (STORED - 193)) | (1L << (STRATIFY - 193)) | (1L << (STRUCT - 193)) | (1L << (SUBSTR - 193)) | (1L << (SUBSTRING - 193)) | (1L << (SYNC - 193)) | (1L << (SYSTEM_TIME - 193)) | (1L << (SYSTEM_VERSION - 193)))) != 0) || ((((_la - 257)) & ~0x3f) == 0 && ((1L << (_la - 257)) & ((1L << (TABLES - 257)) | (1L << (TABLESAMPLE - 257)) | (1L << (TARGET - 257)) | (1L << (TBLPROPERTIES - 257)) | (1L << (TEMPORARY - 257)) | (1L << (TERMINATED - 257)) | (1L << (TIMESTAMP - 257)) | (1L << (TIMESTAMPADD - 257)) | (1L << (TIMESTAMPDIFF - 257)) | (1L << (TOUCH - 257)) | (1L << (TRANSACTION - 257)) | (1L << (TRANSACTIONS - 257)) | (1L << (TRANSFORM - 257)) | (1L << (TRIM - 257)) | (1L << (TRUE - 257)) | (1L << (TRUNCATE - 257)) | (1L << (TRY_CAST - 257)) | (1L << (TYPE - 257)) | (1L << (UNARCHIVE - 257)) | (1L << (UNBOUNDED - 257)) | (1L << (UNCACHE - 257)) | (1L << (UNLOCK - 257)) | (1L << (UNPIVOT - 257)) | (1L << (UNSET - 257)) | (1L << (UPDATE - 257)) | (1L << (USE - 257)) | (1L << (VALUES - 257)) | (1L << (VERSION - 257)) | (1L << (VIEW - 257)) | (1L << (VIEWS - 257)) | (1L << (WEEK - 257)) | (1L << (WEEKS - 257)) | (1L << (WINDOW - 257)) | (1L << (YEAR - 257)) | (1L << (YEARS - 257)) | (1L << (ZONE - 257)) | (1L << (COLLECT_SET - 257)))) != 0)) ) {
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

	public static class StrictNonReservedContext extends ParserRuleContext {
		public TerminalNode ANTI() { return getToken(SqlBaseParser.ANTI, 0); }
		public TerminalNode CROSS() { return getToken(SqlBaseParser.CROSS, 0); }
		public TerminalNode EXCEPT() { return getToken(SqlBaseParser.EXCEPT, 0); }
		public TerminalNode FULL() { return getToken(SqlBaseParser.FULL, 0); }
		public TerminalNode INNER() { return getToken(SqlBaseParser.INNER, 0); }
		public TerminalNode INTERSECT() { return getToken(SqlBaseParser.INTERSECT, 0); }
		public TerminalNode JOIN() { return getToken(SqlBaseParser.JOIN, 0); }
		public TerminalNode LATERAL() { return getToken(SqlBaseParser.LATERAL, 0); }
		public TerminalNode LEFT() { return getToken(SqlBaseParser.LEFT, 0); }
		public TerminalNode NATURAL() { return getToken(SqlBaseParser.NATURAL, 0); }
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public TerminalNode RIGHT() { return getToken(SqlBaseParser.RIGHT, 0); }
		public TerminalNode SEMI() { return getToken(SqlBaseParser.SEMI, 0); }
		public TerminalNode SETMINUS() { return getToken(SqlBaseParser.SETMINUS, 0); }
		public TerminalNode UNION() { return getToken(SqlBaseParser.UNION, 0); }
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public StrictNonReservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strictNonReserved; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterStrictNonReserved(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitStrictNonReserved(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitStrictNonReserved(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrictNonReservedContext strictNonReserved() throws RecognitionException {
		StrictNonReservedContext _localctx = new StrictNonReservedContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_strictNonReserved);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3569);
			_la = _input.LA(1);
			if ( !(_la==ANTI || _la==CROSS || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (EXCEPT - 86)) | (1L << (FULL - 86)) | (1L << (INNER - 86)) | (1L << (INTERSECT - 86)) | (1L << (JOIN - 86)) | (1L << (LATERAL - 86)) | (1L << (LEFT - 86)))) != 0) || ((((_la - 168)) & ~0x3f) == 0 && ((1L << (_la - 168)) & ((1L << (NATURAL - 168)) | (1L << (ON - 168)) | (1L << (RIGHT - 168)))) != 0) || ((((_la - 232)) & ~0x3f) == 0 && ((1L << (_la - 232)) & ((1L << (SEMI - 232)) | (1L << (SETMINUS - 232)) | (1L << (UNION - 232)) | (1L << (USING - 232)))) != 0)) ) {
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

	public static class NonReservedContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode AFTER() { return getToken(SqlBaseParser.AFTER, 0); }
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode ANALYZE() { return getToken(SqlBaseParser.ANALYZE, 0); }
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public TerminalNode ANY() { return getToken(SqlBaseParser.ANY, 0); }
		public TerminalNode ANY_VALUE() { return getToken(SqlBaseParser.ANY_VALUE, 0); }
		public TerminalNode ARCHIVE() { return getToken(SqlBaseParser.ARCHIVE, 0); }
		public TerminalNode ARRAY() { return getToken(SqlBaseParser.ARRAY, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TerminalNode ASC() { return getToken(SqlBaseParser.ASC, 0); }
		public TerminalNode AT() { return getToken(SqlBaseParser.AT, 0); }
		public TerminalNode AUTHORIZATION() { return getToken(SqlBaseParser.AUTHORIZATION, 0); }
		public TerminalNode BETWEEN() { return getToken(SqlBaseParser.BETWEEN, 0); }
		public TerminalNode BOTH() { return getToken(SqlBaseParser.BOTH, 0); }
		public TerminalNode BUCKET() { return getToken(SqlBaseParser.BUCKET, 0); }
		public TerminalNode BUCKETS() { return getToken(SqlBaseParser.BUCKETS, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public TerminalNode CACHE() { return getToken(SqlBaseParser.CACHE, 0); }
		public TerminalNode CASCADE() { return getToken(SqlBaseParser.CASCADE, 0); }
		public TerminalNode CASE() { return getToken(SqlBaseParser.CASE, 0); }
		public TerminalNode CAST() { return getToken(SqlBaseParser.CAST, 0); }
		public TerminalNode CATALOG() { return getToken(SqlBaseParser.CATALOG, 0); }
		public TerminalNode CATALOGS() { return getToken(SqlBaseParser.CATALOGS, 0); }
		public TerminalNode CHANGE() { return getToken(SqlBaseParser.CHANGE, 0); }
		public TerminalNode CHECK() { return getToken(SqlBaseParser.CHECK, 0); }
		public TerminalNode CLEAR() { return getToken(SqlBaseParser.CLEAR, 0); }
		public TerminalNode CLUSTER() { return getToken(SqlBaseParser.CLUSTER, 0); }
		public TerminalNode CLUSTERED() { return getToken(SqlBaseParser.CLUSTERED, 0); }
		public TerminalNode CODEGEN() { return getToken(SqlBaseParser.CODEGEN, 0); }
		public TerminalNode COLLATE() { return getToken(SqlBaseParser.COLLATE, 0); }
		public TerminalNode COLLECTION() { return getToken(SqlBaseParser.COLLECTION, 0); }
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode COMMIT() { return getToken(SqlBaseParser.COMMIT, 0); }
		public TerminalNode COMPACT() { return getToken(SqlBaseParser.COMPACT, 0); }
		public TerminalNode COMPACTIONS() { return getToken(SqlBaseParser.COMPACTIONS, 0); }
		public TerminalNode COMPUTE() { return getToken(SqlBaseParser.COMPUTE, 0); }
		public TerminalNode CONCATENATE() { return getToken(SqlBaseParser.CONCATENATE, 0); }
		public TerminalNode CONSTRAINT() { return getToken(SqlBaseParser.CONSTRAINT, 0); }
		public TerminalNode COST() { return getToken(SqlBaseParser.COST, 0); }
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode CUBE() { return getToken(SqlBaseParser.CUBE, 0); }
		public TerminalNode CURRENT() { return getToken(SqlBaseParser.CURRENT, 0); }
		public TerminalNode CURRENT_DATE() { return getToken(SqlBaseParser.CURRENT_DATE, 0); }
		public TerminalNode CURRENT_TIME() { return getToken(SqlBaseParser.CURRENT_TIME, 0); }
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(SqlBaseParser.CURRENT_TIMESTAMP, 0); }
		public TerminalNode CURRENT_USER() { return getToken(SqlBaseParser.CURRENT_USER, 0); }
		public TerminalNode DATA() { return getToken(SqlBaseParser.DATA, 0); }
		public TerminalNode DATABASE() { return getToken(SqlBaseParser.DATABASE, 0); }
		public TerminalNode DATABASES() { return getToken(SqlBaseParser.DATABASES, 0); }
		public TerminalNode DATEADD() { return getToken(SqlBaseParser.DATEADD, 0); }
		public TerminalNode DATEDIFF() { return getToken(SqlBaseParser.DATEDIFF, 0); }
		public TerminalNode DAY() { return getToken(SqlBaseParser.DAY, 0); }
		public TerminalNode DAYS() { return getToken(SqlBaseParser.DAYS, 0); }
		public TerminalNode DAYOFYEAR() { return getToken(SqlBaseParser.DAYOFYEAR, 0); }
		public TerminalNode DBPROPERTIES() { return getToken(SqlBaseParser.DBPROPERTIES, 0); }
		public TerminalNode DEFAULT() { return getToken(SqlBaseParser.DEFAULT, 0); }
		public TerminalNode DEFINED() { return getToken(SqlBaseParser.DEFINED, 0); }
		public TerminalNode DELETE() { return getToken(SqlBaseParser.DELETE, 0); }
		public TerminalNode DELIMITED() { return getToken(SqlBaseParser.DELIMITED, 0); }
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode DFS() { return getToken(SqlBaseParser.DFS, 0); }
		public TerminalNode DIRECTORIES() { return getToken(SqlBaseParser.DIRECTORIES, 0); }
		public TerminalNode DIRECTORY() { return getToken(SqlBaseParser.DIRECTORY, 0); }
		public TerminalNode DISTINCT() { return getToken(SqlBaseParser.DISTINCT, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(SqlBaseParser.DISTRIBUTE, 0); }
		public TerminalNode DIV() { return getToken(SqlBaseParser.DIV, 0); }
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode ELSE() { return getToken(SqlBaseParser.ELSE, 0); }
		public TerminalNode END() { return getToken(SqlBaseParser.END, 0); }
		public TerminalNode ESCAPE() { return getToken(SqlBaseParser.ESCAPE, 0); }
		public TerminalNode ESCAPED() { return getToken(SqlBaseParser.ESCAPED, 0); }
		public TerminalNode EXCHANGE() { return getToken(SqlBaseParser.EXCHANGE, 0); }
		public TerminalNode EXCLUDE() { return getToken(SqlBaseParser.EXCLUDE, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode EXPLAIN() { return getToken(SqlBaseParser.EXPLAIN, 0); }
		public TerminalNode EXPORT() { return getToken(SqlBaseParser.EXPORT, 0); }
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public TerminalNode EXTERNAL() { return getToken(SqlBaseParser.EXTERNAL, 0); }
		public TerminalNode EXTRACT() { return getToken(SqlBaseParser.EXTRACT, 0); }
		public TerminalNode FALSE() { return getToken(SqlBaseParser.FALSE, 0); }
		public TerminalNode FETCH() { return getToken(SqlBaseParser.FETCH, 0); }
		public TerminalNode FILTER() { return getToken(SqlBaseParser.FILTER, 0); }
		public TerminalNode FIELDS() { return getToken(SqlBaseParser.FIELDS, 0); }
		public TerminalNode FILEFORMAT() { return getToken(SqlBaseParser.FILEFORMAT, 0); }
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public TerminalNode FOLLOWING() { return getToken(SqlBaseParser.FOLLOWING, 0); }
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public TerminalNode FOREIGN() { return getToken(SqlBaseParser.FOREIGN, 0); }
		public TerminalNode FORMAT() { return getToken(SqlBaseParser.FORMAT, 0); }
		public TerminalNode FORMATTED() { return getToken(SqlBaseParser.FORMATTED, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public TerminalNode FUNCTIONS() { return getToken(SqlBaseParser.FUNCTIONS, 0); }
		public TerminalNode GLOBAL() { return getToken(SqlBaseParser.GLOBAL, 0); }
		public TerminalNode GRANT() { return getToken(SqlBaseParser.GRANT, 0); }
		public TerminalNode GROUP() { return getToken(SqlBaseParser.GROUP, 0); }
		public TerminalNode GROUPING() { return getToken(SqlBaseParser.GROUPING, 0); }
		public TerminalNode HAVING() { return getToken(SqlBaseParser.HAVING, 0); }
		public TerminalNode HOUR() { return getToken(SqlBaseParser.HOUR, 0); }
		public TerminalNode HOURS() { return getToken(SqlBaseParser.HOURS, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode IGNORE() { return getToken(SqlBaseParser.IGNORE, 0); }
		public TerminalNode IMPORT() { return getToken(SqlBaseParser.IMPORT, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public TerminalNode INCLUDE() { return getToken(SqlBaseParser.INCLUDE, 0); }
		public TerminalNode INDEX() { return getToken(SqlBaseParser.INDEX, 0); }
		public TerminalNode INDEXES() { return getToken(SqlBaseParser.INDEXES, 0); }
		public TerminalNode INPATH() { return getToken(SqlBaseParser.INPATH, 0); }
		public TerminalNode INPUTFORMAT() { return getToken(SqlBaseParser.INPUTFORMAT, 0); }
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode INTERVAL() { return getToken(SqlBaseParser.INTERVAL, 0); }
		public TerminalNode INTO() { return getToken(SqlBaseParser.INTO, 0); }
		public TerminalNode IS() { return getToken(SqlBaseParser.IS, 0); }
		public TerminalNode ITEMS() { return getToken(SqlBaseParser.ITEMS, 0); }
		public TerminalNode KEYS() { return getToken(SqlBaseParser.KEYS, 0); }
		public TerminalNode LAST() { return getToken(SqlBaseParser.LAST, 0); }
		public TerminalNode LAZY() { return getToken(SqlBaseParser.LAZY, 0); }
		public TerminalNode LEADING() { return getToken(SqlBaseParser.LEADING, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public TerminalNode ILIKE() { return getToken(SqlBaseParser.ILIKE, 0); }
		public TerminalNode LIMIT() { return getToken(SqlBaseParser.LIMIT, 0); }
		public TerminalNode LINES() { return getToken(SqlBaseParser.LINES, 0); }
		public TerminalNode LIST() { return getToken(SqlBaseParser.LIST, 0); }
		public TerminalNode LOAD() { return getToken(SqlBaseParser.LOAD, 0); }
		public TerminalNode LOCAL() { return getToken(SqlBaseParser.LOCAL, 0); }
		public TerminalNode LOCATION() { return getToken(SqlBaseParser.LOCATION, 0); }
		public TerminalNode LOCK() { return getToken(SqlBaseParser.LOCK, 0); }
		public TerminalNode LOCKS() { return getToken(SqlBaseParser.LOCKS, 0); }
		public TerminalNode LOGICAL() { return getToken(SqlBaseParser.LOGICAL, 0); }
		public TerminalNode MACRO() { return getToken(SqlBaseParser.MACRO, 0); }
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode MATCHED() { return getToken(SqlBaseParser.MATCHED, 0); }
		public TerminalNode MERGE() { return getToken(SqlBaseParser.MERGE, 0); }
		public TerminalNode MICROSECOND() { return getToken(SqlBaseParser.MICROSECOND, 0); }
		public TerminalNode MICROSECONDS() { return getToken(SqlBaseParser.MICROSECONDS, 0); }
		public TerminalNode MILLISECOND() { return getToken(SqlBaseParser.MILLISECOND, 0); }
		public TerminalNode MILLISECONDS() { return getToken(SqlBaseParser.MILLISECONDS, 0); }
		public TerminalNode MINUTE() { return getToken(SqlBaseParser.MINUTE, 0); }
		public TerminalNode MINUTES() { return getToken(SqlBaseParser.MINUTES, 0); }
		public TerminalNode MONTH() { return getToken(SqlBaseParser.MONTH, 0); }
		public TerminalNode MONTHS() { return getToken(SqlBaseParser.MONTHS, 0); }
		public TerminalNode MSCK() { return getToken(SqlBaseParser.MSCK, 0); }
		public TerminalNode NAMESPACE() { return getToken(SqlBaseParser.NAMESPACE, 0); }
		public TerminalNode NAMESPACES() { return getToken(SqlBaseParser.NAMESPACES, 0); }
		public TerminalNode NANOSECOND() { return getToken(SqlBaseParser.NANOSECOND, 0); }
		public TerminalNode NANOSECONDS() { return getToken(SqlBaseParser.NANOSECONDS, 0); }
		public TerminalNode NO() { return getToken(SqlBaseParser.NO, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public TerminalNode OF() { return getToken(SqlBaseParser.OF, 0); }
		public TerminalNode OFFSET() { return getToken(SqlBaseParser.OFFSET, 0); }
		public TerminalNode ONLY() { return getToken(SqlBaseParser.ONLY, 0); }
		public TerminalNode OPTION() { return getToken(SqlBaseParser.OPTION, 0); }
		public TerminalNode OPTIONS() { return getToken(SqlBaseParser.OPTIONS, 0); }
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public TerminalNode ORDER() { return getToken(SqlBaseParser.ORDER, 0); }
		public TerminalNode OUT() { return getToken(SqlBaseParser.OUT, 0); }
		public TerminalNode OUTER() { return getToken(SqlBaseParser.OUTER, 0); }
		public TerminalNode OUTPUTFORMAT() { return getToken(SqlBaseParser.OUTPUTFORMAT, 0); }
		public TerminalNode OVER() { return getToken(SqlBaseParser.OVER, 0); }
		public TerminalNode OVERLAPS() { return getToken(SqlBaseParser.OVERLAPS, 0); }
		public TerminalNode OVERLAY() { return getToken(SqlBaseParser.OVERLAY, 0); }
		public TerminalNode OVERWRITE() { return getToken(SqlBaseParser.OVERWRITE, 0); }
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public TerminalNode PARTITIONED() { return getToken(SqlBaseParser.PARTITIONED, 0); }
		public TerminalNode PARTITIONS() { return getToken(SqlBaseParser.PARTITIONS, 0); }
		public TerminalNode PERCENTILE_CONT() { return getToken(SqlBaseParser.PERCENTILE_CONT, 0); }
		public TerminalNode PERCENTILE_DISC() { return getToken(SqlBaseParser.PERCENTILE_DISC, 0); }
		public TerminalNode PERCENTLIT() { return getToken(SqlBaseParser.PERCENTLIT, 0); }
		public TerminalNode PIVOT() { return getToken(SqlBaseParser.PIVOT, 0); }
		public TerminalNode PLACING() { return getToken(SqlBaseParser.PLACING, 0); }
		public TerminalNode POSITION() { return getToken(SqlBaseParser.POSITION, 0); }
		public TerminalNode PRECEDING() { return getToken(SqlBaseParser.PRECEDING, 0); }
		public TerminalNode PRIMARY() { return getToken(SqlBaseParser.PRIMARY, 0); }
		public TerminalNode PRINCIPALS() { return getToken(SqlBaseParser.PRINCIPALS, 0); }
		public TerminalNode PROPERTIES() { return getToken(SqlBaseParser.PROPERTIES, 0); }
		public TerminalNode PURGE() { return getToken(SqlBaseParser.PURGE, 0); }
		public TerminalNode QUARTER() { return getToken(SqlBaseParser.QUARTER, 0); }
		public TerminalNode QUERY() { return getToken(SqlBaseParser.QUERY, 0); }
		public TerminalNode RANGE() { return getToken(SqlBaseParser.RANGE, 0); }
		public TerminalNode RECORDREADER() { return getToken(SqlBaseParser.RECORDREADER, 0); }
		public TerminalNode RECORDWRITER() { return getToken(SqlBaseParser.RECORDWRITER, 0); }
		public TerminalNode RECOVER() { return getToken(SqlBaseParser.RECOVER, 0); }
		public TerminalNode REDUCE() { return getToken(SqlBaseParser.REDUCE, 0); }
		public TerminalNode REFERENCES() { return getToken(SqlBaseParser.REFERENCES, 0); }
		public TerminalNode REFRESH() { return getToken(SqlBaseParser.REFRESH, 0); }
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode REPAIR() { return getToken(SqlBaseParser.REPAIR, 0); }
		public TerminalNode REPEATABLE() { return getToken(SqlBaseParser.REPEATABLE, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode RESET() { return getToken(SqlBaseParser.RESET, 0); }
		public TerminalNode RESPECT() { return getToken(SqlBaseParser.RESPECT, 0); }
		public TerminalNode RESTRICT() { return getToken(SqlBaseParser.RESTRICT, 0); }
		public TerminalNode REVOKE() { return getToken(SqlBaseParser.REVOKE, 0); }
		public TerminalNode RLIKE() { return getToken(SqlBaseParser.RLIKE, 0); }
		public TerminalNode ROLE() { return getToken(SqlBaseParser.ROLE, 0); }
		public TerminalNode ROLES() { return getToken(SqlBaseParser.ROLES, 0); }
		public TerminalNode ROLLBACK() { return getToken(SqlBaseParser.ROLLBACK, 0); }
		public TerminalNode ROLLUP() { return getToken(SqlBaseParser.ROLLUP, 0); }
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public TerminalNode ROWS() { return getToken(SqlBaseParser.ROWS, 0); }
		public TerminalNode SCHEMA() { return getToken(SqlBaseParser.SCHEMA, 0); }
		public TerminalNode SCHEMAS() { return getToken(SqlBaseParser.SCHEMAS, 0); }
		public TerminalNode SECOND() { return getToken(SqlBaseParser.SECOND, 0); }
		public TerminalNode SECONDS() { return getToken(SqlBaseParser.SECONDS, 0); }
		public TerminalNode SELECT() { return getToken(SqlBaseParser.SELECT, 0); }
		public TerminalNode SEPARATED() { return getToken(SqlBaseParser.SEPARATED, 0); }
		public TerminalNode SERDE() { return getToken(SqlBaseParser.SERDE, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SqlBaseParser.SERDEPROPERTIES, 0); }
		public TerminalNode SESSION_USER() { return getToken(SqlBaseParser.SESSION_USER, 0); }
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode SETS() { return getToken(SqlBaseParser.SETS, 0); }
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode SKEWED() { return getToken(SqlBaseParser.SKEWED, 0); }
		public TerminalNode SOME() { return getToken(SqlBaseParser.SOME, 0); }
		public TerminalNode SORT() { return getToken(SqlBaseParser.SORT, 0); }
		public TerminalNode SORTED() { return getToken(SqlBaseParser.SORTED, 0); }
		public TerminalNode SOURCE() { return getToken(SqlBaseParser.SOURCE, 0); }
		public TerminalNode START() { return getToken(SqlBaseParser.START, 0); }
		public TerminalNode STATISTICS() { return getToken(SqlBaseParser.STATISTICS, 0); }
		public TerminalNode STORED() { return getToken(SqlBaseParser.STORED, 0); }
		public TerminalNode STRATIFY() { return getToken(SqlBaseParser.STRATIFY, 0); }
		public TerminalNode STRUCT() { return getToken(SqlBaseParser.STRUCT, 0); }
		public TerminalNode SUBSTR() { return getToken(SqlBaseParser.SUBSTR, 0); }
		public TerminalNode SUBSTRING() { return getToken(SqlBaseParser.SUBSTRING, 0); }
		public TerminalNode SYNC() { return getToken(SqlBaseParser.SYNC, 0); }
		public TerminalNode SYSTEM_TIME() { return getToken(SqlBaseParser.SYSTEM_TIME, 0); }
		public TerminalNode SYSTEM_VERSION() { return getToken(SqlBaseParser.SYSTEM_VERSION, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode TABLES() { return getToken(SqlBaseParser.TABLES, 0); }
		public TerminalNode TABLESAMPLE() { return getToken(SqlBaseParser.TABLESAMPLE, 0); }
		public TerminalNode TARGET() { return getToken(SqlBaseParser.TARGET, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SqlBaseParser.TBLPROPERTIES, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode TERMINATED() { return getToken(SqlBaseParser.TERMINATED, 0); }
		public TerminalNode THEN() { return getToken(SqlBaseParser.THEN, 0); }
		public TerminalNode TIME() { return getToken(SqlBaseParser.TIME, 0); }
		public TerminalNode TIMESTAMP() { return getToken(SqlBaseParser.TIMESTAMP, 0); }
		public TerminalNode TIMESTAMPADD() { return getToken(SqlBaseParser.TIMESTAMPADD, 0); }
		public TerminalNode TIMESTAMPDIFF() { return getToken(SqlBaseParser.TIMESTAMPDIFF, 0); }
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public TerminalNode TOUCH() { return getToken(SqlBaseParser.TOUCH, 0); }
		public TerminalNode TRAILING() { return getToken(SqlBaseParser.TRAILING, 0); }
		public TerminalNode TRANSACTION() { return getToken(SqlBaseParser.TRANSACTION, 0); }
		public TerminalNode TRANSACTIONS() { return getToken(SqlBaseParser.TRANSACTIONS, 0); }
		public TerminalNode TRANSFORM() { return getToken(SqlBaseParser.TRANSFORM, 0); }
		public TerminalNode TRIM() { return getToken(SqlBaseParser.TRIM, 0); }
		public TerminalNode TRUE() { return getToken(SqlBaseParser.TRUE, 0); }
		public TerminalNode TRUNCATE() { return getToken(SqlBaseParser.TRUNCATE, 0); }
		public TerminalNode TRY_CAST() { return getToken(SqlBaseParser.TRY_CAST, 0); }
		public TerminalNode TYPE() { return getToken(SqlBaseParser.TYPE, 0); }
		public TerminalNode UNARCHIVE() { return getToken(SqlBaseParser.UNARCHIVE, 0); }
		public TerminalNode UNBOUNDED() { return getToken(SqlBaseParser.UNBOUNDED, 0); }
		public TerminalNode UNCACHE() { return getToken(SqlBaseParser.UNCACHE, 0); }
		public TerminalNode UNIQUE() { return getToken(SqlBaseParser.UNIQUE, 0); }
		public TerminalNode UNKNOWN() { return getToken(SqlBaseParser.UNKNOWN, 0); }
		public TerminalNode UNLOCK() { return getToken(SqlBaseParser.UNLOCK, 0); }
		public TerminalNode UNPIVOT() { return getToken(SqlBaseParser.UNPIVOT, 0); }
		public TerminalNode UNSET() { return getToken(SqlBaseParser.UNSET, 0); }
		public TerminalNode UPDATE() { return getToken(SqlBaseParser.UPDATE, 0); }
		public TerminalNode USE() { return getToken(SqlBaseParser.USE, 0); }
		public TerminalNode USER() { return getToken(SqlBaseParser.USER, 0); }
		public TerminalNode VALUES() { return getToken(SqlBaseParser.VALUES, 0); }
		public TerminalNode VERSION() { return getToken(SqlBaseParser.VERSION, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TerminalNode VIEWS() { return getToken(SqlBaseParser.VIEWS, 0); }
		public TerminalNode WEEK() { return getToken(SqlBaseParser.WEEK, 0); }
		public TerminalNode WEEKS() { return getToken(SqlBaseParser.WEEKS, 0); }
		public TerminalNode WHEN() { return getToken(SqlBaseParser.WHEN, 0); }
		public TerminalNode WHERE() { return getToken(SqlBaseParser.WHERE, 0); }
		public TerminalNode WINDOW() { return getToken(SqlBaseParser.WINDOW, 0); }
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode WITHIN() { return getToken(SqlBaseParser.WITHIN, 0); }
		public TerminalNode YEAR() { return getToken(SqlBaseParser.YEAR, 0); }
		public TerminalNode YEARS() { return getToken(SqlBaseParser.YEARS, 0); }
		public TerminalNode ZONE() { return getToken(SqlBaseParser.ZONE, 0); }
		public NonReservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonReserved; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterNonReserved(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitNonReserved(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitNonReserved(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonReservedContext nonReserved() throws RecognitionException {
		NonReservedContext _localctx = new NonReservedContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_nonReserved);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3571);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << AFTER) | (1L << ALL) | (1L << ALTER) | (1L << ANALYZE) | (1L << AND) | (1L << ANY) | (1L << ANY_VALUE) | (1L << ARCHIVE) | (1L << ARRAY) | (1L << AS) | (1L << ASC) | (1L << AT) | (1L << AUTHORIZATION) | (1L << BETWEEN) | (1L << BOTH) | (1L << BUCKET) | (1L << BUCKETS) | (1L << BY) | (1L << CACHE) | (1L << CASCADE) | (1L << CASE) | (1L << CAST) | (1L << CATALOG) | (1L << CATALOGS) | (1L << CHANGE) | (1L << CHECK) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CLUSTERED) | (1L << CODEGEN) | (1L << COLLATE) | (1L << COLLECTION) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMPACT) | (1L << COMPACTIONS) | (1L << COMPUTE) | (1L << CONCATENATE) | (1L << CONSTRAINT) | (1L << COST) | (1L << CREATE) | (1L << CUBE) | (1L << CURRENT) | (1L << CURRENT_DATE) | (1L << CURRENT_TIME) | (1L << CURRENT_TIMESTAMP) | (1L << CURRENT_USER) | (1L << DAY) | (1L << DAYS) | (1L << DAYOFYEAR) | (1L << DATA))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DATABASE - 64)) | (1L << (DATABASES - 64)) | (1L << (DATEADD - 64)) | (1L << (DATEDIFF - 64)) | (1L << (DBPROPERTIES - 64)) | (1L << (DEFAULT - 64)) | (1L << (DEFINED - 64)) | (1L << (DELETE - 64)) | (1L << (DELIMITED - 64)) | (1L << (DESC - 64)) | (1L << (DESCRIBE - 64)) | (1L << (DFS - 64)) | (1L << (DIRECTORIES - 64)) | (1L << (DIRECTORY - 64)) | (1L << (DISTINCT - 64)) | (1L << (DISTRIBUTE - 64)) | (1L << (DIV - 64)) | (1L << (DROP - 64)) | (1L << (ELSE - 64)) | (1L << (END - 64)) | (1L << (ESCAPE - 64)) | (1L << (ESCAPED - 64)) | (1L << (EXCHANGE - 64)) | (1L << (EXCLUDE - 64)) | (1L << (EXISTS - 64)) | (1L << (EXPLAIN - 64)) | (1L << (EXPORT - 64)) | (1L << (EXTENDED - 64)) | (1L << (EXTERNAL - 64)) | (1L << (EXTRACT - 64)) | (1L << (FALSE - 64)) | (1L << (FETCH - 64)) | (1L << (FIELDS - 64)) | (1L << (FILTER - 64)) | (1L << (FILEFORMAT - 64)) | (1L << (FIRST - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FOR - 64)) | (1L << (FOREIGN - 64)) | (1L << (FORMAT - 64)) | (1L << (FORMATTED - 64)) | (1L << (FROM - 64)) | (1L << (FUNCTION - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GLOBAL - 64)) | (1L << (GRANT - 64)) | (1L << (GROUP - 64)) | (1L << (GROUPING - 64)) | (1L << (HAVING - 64)) | (1L << (HOUR - 64)) | (1L << (HOURS - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (IMPORT - 64)) | (1L << (IN - 64)) | (1L << (INCLUDE - 64)) | (1L << (INDEX - 64)) | (1L << (INDEXES - 64)) | (1L << (INPATH - 64)) | (1L << (INPUTFORMAT - 64)) | (1L << (INSERT - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (INTERVAL - 129)) | (1L << (INTO - 129)) | (1L << (IS - 129)) | (1L << (ITEMS - 129)) | (1L << (KEYS - 129)) | (1L << (LAST - 129)) | (1L << (LAZY - 129)) | (1L << (LEADING - 129)) | (1L << (LIKE - 129)) | (1L << (ILIKE - 129)) | (1L << (LIMIT - 129)) | (1L << (LINES - 129)) | (1L << (LIST - 129)) | (1L << (LOAD - 129)) | (1L << (LOCAL - 129)) | (1L << (LOCATION - 129)) | (1L << (LOCK - 129)) | (1L << (LOCKS - 129)) | (1L << (LOGICAL - 129)) | (1L << (MACRO - 129)) | (1L << (MAP - 129)) | (1L << (MATCHED - 129)) | (1L << (MERGE - 129)) | (1L << (MICROSECOND - 129)) | (1L << (MICROSECONDS - 129)) | (1L << (MILLISECOND - 129)) | (1L << (MILLISECONDS - 129)) | (1L << (MINUTE - 129)) | (1L << (MINUTES - 129)) | (1L << (MONTH - 129)) | (1L << (MONTHS - 129)) | (1L << (MSCK - 129)) | (1L << (NAMESPACE - 129)) | (1L << (NAMESPACES - 129)) | (1L << (NANOSECOND - 129)) | (1L << (NANOSECONDS - 129)) | (1L << (NO - 129)) | (1L << (NOT - 129)) | (1L << (NULL - 129)) | (1L << (NULLS - 129)) | (1L << (OF - 129)) | (1L << (OFFSET - 129)) | (1L << (ONLY - 129)) | (1L << (OPTION - 129)) | (1L << (OPTIONS - 129)) | (1L << (OR - 129)) | (1L << (ORDER - 129)) | (1L << (OUT - 129)) | (1L << (OUTER - 129)) | (1L << (OUTPUTFORMAT - 129)) | (1L << (OVER - 129)) | (1L << (OVERLAPS - 129)) | (1L << (OVERLAY - 129)) | (1L << (OVERWRITE - 129)) | (1L << (PARTITION - 129)) | (1L << (PARTITIONED - 129)) | (1L << (PARTITIONS - 129)) | (1L << (PERCENTILE_CONT - 129)) | (1L << (PERCENTILE_DISC - 129)))) != 0) || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (PERCENTLIT - 193)) | (1L << (PIVOT - 193)) | (1L << (PLACING - 193)) | (1L << (POSITION - 193)) | (1L << (PRECEDING - 193)) | (1L << (PRIMARY - 193)) | (1L << (PRINCIPALS - 193)) | (1L << (PROPERTIES - 193)) | (1L << (PURGE - 193)) | (1L << (QUARTER - 193)) | (1L << (QUERY - 193)) | (1L << (RANGE - 193)) | (1L << (RECORDREADER - 193)) | (1L << (RECORDWRITER - 193)) | (1L << (RECOVER - 193)) | (1L << (REDUCE - 193)) | (1L << (REFERENCES - 193)) | (1L << (REFRESH - 193)) | (1L << (RENAME - 193)) | (1L << (REPAIR - 193)) | (1L << (REPEATABLE - 193)) | (1L << (REPLACE - 193)) | (1L << (RESET - 193)) | (1L << (RESPECT - 193)) | (1L << (RESTRICT - 193)) | (1L << (REVOKE - 193)) | (1L << (RLIKE - 193)) | (1L << (ROLE - 193)) | (1L << (ROLES - 193)) | (1L << (ROLLBACK - 193)) | (1L << (ROLLUP - 193)) | (1L << (ROW - 193)) | (1L << (ROWS - 193)) | (1L << (SECOND - 193)) | (1L << (SECONDS - 193)) | (1L << (SCHEMA - 193)) | (1L << (SCHEMAS - 193)) | (1L << (SELECT - 193)) | (1L << (SEPARATED - 193)) | (1L << (SERDE - 193)) | (1L << (SERDEPROPERTIES - 193)) | (1L << (SESSION_USER - 193)) | (1L << (SET - 193)) | (1L << (SETS - 193)) | (1L << (SHOW - 193)) | (1L << (SKEWED - 193)) | (1L << (SOME - 193)) | (1L << (SORT - 193)) | (1L << (SORTED - 193)) | (1L << (SOURCE - 193)) | (1L << (START - 193)) | (1L << (STATISTICS - 193)) | (1L << (STORED - 193)) | (1L << (STRATIFY - 193)) | (1L << (STRUCT - 193)) | (1L << (SUBSTR - 193)) | (1L << (SUBSTRING - 193)) | (1L << (SYNC - 193)) | (1L << (SYSTEM_TIME - 193)) | (1L << (SYSTEM_VERSION - 193)) | (1L << (TABLE - 193)))) != 0) || ((((_la - 257)) & ~0x3f) == 0 && ((1L << (_la - 257)) & ((1L << (TABLES - 257)) | (1L << (TABLESAMPLE - 257)) | (1L << (TARGET - 257)) | (1L << (TBLPROPERTIES - 257)) | (1L << (TEMPORARY - 257)) | (1L << (TERMINATED - 257)) | (1L << (THEN - 257)) | (1L << (TIME - 257)) | (1L << (TIMESTAMP - 257)) | (1L << (TIMESTAMPADD - 257)) | (1L << (TIMESTAMPDIFF - 257)) | (1L << (TO - 257)) | (1L << (TOUCH - 257)) | (1L << (TRAILING - 257)) | (1L << (TRANSACTION - 257)) | (1L << (TRANSACTIONS - 257)) | (1L << (TRANSFORM - 257)) | (1L << (TRIM - 257)) | (1L << (TRUE - 257)) | (1L << (TRUNCATE - 257)) | (1L << (TRY_CAST - 257)) | (1L << (TYPE - 257)) | (1L << (UNARCHIVE - 257)) | (1L << (UNBOUNDED - 257)) | (1L << (UNCACHE - 257)) | (1L << (UNIQUE - 257)) | (1L << (UNKNOWN - 257)) | (1L << (UNLOCK - 257)) | (1L << (UNPIVOT - 257)) | (1L << (UNSET - 257)) | (1L << (UPDATE - 257)) | (1L << (USE - 257)) | (1L << (USER - 257)) | (1L << (VALUES - 257)) | (1L << (VERSION - 257)) | (1L << (VIEW - 257)) | (1L << (VIEWS - 257)) | (1L << (WEEK - 257)) | (1L << (WEEKS - 257)) | (1L << (WHEN - 257)) | (1L << (WHERE - 257)) | (1L << (WINDOW - 257)) | (1L << (WITH - 257)) | (1L << (WITHIN - 257)) | (1L << (YEAR - 257)) | (1L << (YEARS - 257)) | (1L << (ZONE - 257)))) != 0)) ) {
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
		case 44:
			return queryTerm_sempred((QueryTermContext)_localctx, predIndex);
		case 121:
			return booleanExpression_sempred((BooleanExpressionContext)_localctx, predIndex);
		case 123:
			return valueExpression_sempred((ValueExpressionContext)_localctx, predIndex);
		case 125:
			return primaryExpression_sempred((PrimaryExpressionContext)_localctx, predIndex);
		case 162:
			return identifier_sempred((IdentifierContext)_localctx, predIndex);
		case 163:
			return strictIdentifier_sempred((StrictIdentifierContext)_localctx, predIndex);
		case 164:
			return quotedIdentifier_sempred((QuotedIdentifierContext)_localctx, predIndex);
		case 166:
			return number_sempred((NumberContext)_localctx, predIndex);
		case 168:
			return stringLit_sempred((StringLitContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean queryTerm_sempred(QueryTermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return legacy_setops_precedence_enabled;
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return !legacy_setops_precedence_enabled;
		case 4:
			return precpred(_ctx, 1);
		case 5:
			return !legacy_setops_precedence_enabled;
		}
		return true;
	}
	private boolean booleanExpression_sempred(BooleanExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 2);
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean valueExpression_sempred(ValueExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 6);
		case 9:
			return precpred(_ctx, 5);
		case 10:
			return precpred(_ctx, 4);
		case 11:
			return precpred(_ctx, 3);
		case 12:
			return precpred(_ctx, 2);
		case 13:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean primaryExpression_sempred(PrimaryExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 14:
			return precpred(_ctx, 10);
		case 15:
			return precpred(_ctx, 8);
		}
		return true;
	}
	private boolean identifier_sempred(IdentifierContext _localctx, int predIndex) {
		switch (predIndex) {
		case 16:
			return !SQL_standard_keyword_behavior;
		}
		return true;
	}
	private boolean strictIdentifier_sempred(StrictIdentifierContext _localctx, int predIndex) {
		switch (predIndex) {
		case 17:
			return SQL_standard_keyword_behavior;
		case 18:
			return !SQL_standard_keyword_behavior;
		}
		return true;
	}
	private boolean quotedIdentifier_sempred(QuotedIdentifierContext _localctx, int predIndex) {
		switch (predIndex) {
		case 19:
			return double_quoted_identifiers;
		}
		return true;
	}
	private boolean number_sempred(NumberContext _localctx, int predIndex) {
		switch (predIndex) {
		case 20:
			return !legacy_exponent_literal_as_decimal_enabled;
		case 21:
			return !legacy_exponent_literal_as_decimal_enabled;
		case 22:
			return legacy_exponent_literal_as_decimal_enabled;
		}
		return true;
	}
	private boolean stringLit_sempred(StringLitContext _localctx, int predIndex) {
		switch (predIndex) {
		case 23:
			return !double_quoted_identifiers;
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u015b\u0df8\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\3\2\3\2\7\2\u0161\n\2\f\2\16\2\u0164"+
		"\13\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\t\3\t\5\t\u017c\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\5\t\u0189\n\t\3\t\3\t\3\t\3\t\3\t\5\t\u0190\n\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\7\t\u0198\n\t\f\t\16\t\u019b\13\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u01ae\n\t\3\t\3\t\5"+
		"\t\u01b2\n\t\3\t\3\t\3\t\3\t\5\t\u01b8\n\t\3\t\5\t\u01bb\n\t\3\t\5\t\u01be"+
		"\n\t\3\t\3\t\3\t\3\t\3\t\5\t\u01c5\n\t\3\t\5\t\u01c8\n\t\3\t\3\t\5\t\u01cc"+
		"\n\t\3\t\5\t\u01cf\n\t\3\t\3\t\3\t\3\t\3\t\5\t\u01d6\n\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\7\t\u01e1\n\t\f\t\16\t\u01e4\13\t\3\t\3\t\3\t\3"+
		"\t\3\t\5\t\u01eb\n\t\3\t\5\t\u01ee\n\t\3\t\3\t\5\t\u01f2\n\t\3\t\5\t\u01f5"+
		"\n\t\3\t\3\t\3\t\3\t\5\t\u01fb\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\5\t\u0206\n\t\3\t\3\t\3\t\3\t\5\t\u020c\n\t\3\t\3\t\3\t\5\t\u0211\n\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0233\n"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0240\n\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\5\t\u0259\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0262\n\t\3"+
		"\t\3\t\5\t\u0266\n\t\3\t\3\t\3\t\3\t\5\t\u026c\n\t\3\t\3\t\5\t\u0270\n"+
		"\t\3\t\3\t\3\t\5\t\u0275\n\t\3\t\3\t\3\t\3\t\5\t\u027b\n\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0287\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t"+
		"\u028f\n\t\3\t\3\t\3\t\3\t\5\t\u0295\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\5\t\u02a2\n\t\3\t\6\t\u02a5\n\t\r\t\16\t\u02a6\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u02b7\n\t\3\t\3\t"+
		"\3\t\7\t\u02bc\n\t\f\t\16\t\u02bf\13\t\3\t\5\t\u02c2\n\t\3\t\3\t\3\t\3"+
		"\t\5\t\u02c8\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5"+
		"\t\u02d7\n\t\3\t\3\t\5\t\u02db\n\t\3\t\3\t\3\t\3\t\5\t\u02e1\n\t\3\t\3"+
		"\t\3\t\3\t\5\t\u02e7\n\t\3\t\5\t\u02ea\n\t\3\t\5\t\u02ed\n\t\3\t\3\t\3"+
		"\t\3\t\5\t\u02f3\n\t\3\t\3\t\5\t\u02f7\n\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t"+
		"\u02ff\n\t\f\t\16\t\u0302\13\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u030a\n\t\3"+
		"\t\5\t\u030d\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0316\n\t\3\t\3\t\3\t"+
		"\5\t\u031b\n\t\3\t\3\t\3\t\3\t\5\t\u0321\n\t\3\t\3\t\3\t\3\t\3\t\5\t\u0328"+
		"\n\t\3\t\5\t\u032b\n\t\3\t\3\t\3\t\3\t\5\t\u0331\n\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\7\t\u033a\n\t\f\t\16\t\u033d\13\t\5\t\u033f\n\t\3\t\3\t\5\t"+
		"\u0343\n\t\3\t\3\t\3\t\5\t\u0348\n\t\3\t\3\t\3\t\5\t\u034d\n\t\3\t\3\t"+
		"\3\t\3\t\3\t\5\t\u0354\n\t\3\t\5\t\u0357\n\t\3\t\5\t\u035a\n\t\3\t\3\t"+
		"\3\t\3\t\3\t\5\t\u0361\n\t\3\t\3\t\3\t\5\t\u0366\n\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\5\t\u036f\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0377\n\t\3\t\3\t"+
		"\3\t\3\t\5\t\u037d\n\t\3\t\5\t\u0380\n\t\3\t\5\t\u0383\n\t\3\t\3\t\3\t"+
		"\3\t\5\t\u0389\n\t\3\t\3\t\5\t\u038d\n\t\3\t\3\t\3\t\5\t\u0392\n\t\3\t"+
		"\5\t\u0395\n\t\3\t\3\t\5\t\u0399\n\t\5\t\u039b\n\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\5\t\u03a3\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u03ab\n\t\3\t\5\t\u03ae"+
		"\n\t\3\t\3\t\3\t\5\t\u03b3\n\t\3\t\3\t\3\t\3\t\5\t\u03b9\n\t\3\t\3\t\3"+
		"\t\3\t\5\t\u03bf\n\t\3\t\5\t\u03c2\n\t\3\t\3\t\5\t\u03c6\n\t\3\t\5\t\u03c9"+
		"\n\t\3\t\3\t\5\t\u03cd\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u03e7\n\t\f\t"+
		"\16\t\u03ea\13\t\5\t\u03ec\n\t\3\t\3\t\5\t\u03f0\n\t\3\t\3\t\3\t\3\t\5"+
		"\t\u03f6\n\t\3\t\5\t\u03f9\n\t\3\t\5\t\u03fc\n\t\3\t\3\t\3\t\3\t\5\t\u0402"+
		"\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u040a\n\t\3\t\3\t\3\t\5\t\u040f\n\t\3"+
		"\t\3\t\3\t\3\t\5\t\u0415\n\t\3\t\3\t\3\t\3\t\5\t\u041b\n\t\3\t\5\t\u041e"+
		"\n\t\3\t\3\t\3\t\3\t\3\t\5\t\u0425\n\t\3\t\3\t\3\t\7\t\u042a\n\t\f\t\16"+
		"\t\u042d\13\t\3\t\3\t\3\t\7\t\u0432\n\t\f\t\16\t\u0435\13\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0443\n\t\f\t\16\t\u0446\13"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0451\n\t\f\t\16\t\u0454\13"+
		"\t\5\t\u0456\n\t\3\t\3\t\7\t\u045a\n\t\f\t\16\t\u045d\13\t\3\t\3\t\3\t"+
		"\3\t\7\t\u0463\n\t\f\t\16\t\u0466\13\t\3\t\3\t\3\t\3\t\7\t\u046c\n\t\f"+
		"\t\16\t\u046f\13\t\3\t\3\t\3\t\3\t\3\t\5\t\u0476\n\t\3\t\3\t\3\t\5\t\u047b"+
		"\n\t\3\t\3\t\3\t\5\t\u0480\n\t\3\t\3\t\3\t\3\t\3\t\5\t\u0487\n\t\3\t\3"+
		"\t\3\t\3\t\5\t\u048d\n\t\3\t\3\t\3\t\5\t\u0492\n\t\3\t\3\t\3\t\3\t\7\t"+
		"\u0498\n\t\f\t\16\t\u049b\13\t\5\t\u049d\n\t\3\n\3\n\5\n\u04a1\n\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u04ad\n\r\3\r\3\r\5\r\u04b1"+
		"\n\r\3\r\3\r\3\r\3\r\3\r\5\r\u04b8\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\5\r\u052c\n\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0534\n\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\5\r\u053c\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0545\n\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u054f\n\r\3\16\3\16\5\16\u0553\n\16\3"+
		"\16\5\16\u0556\n\16\3\16\3\16\3\16\3\16\5\16\u055c\n\16\3\16\3\16\3\17"+
		"\3\17\5\17\u0562\n\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\5\20\u056e\n\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21"+
		"\u057a\n\21\3\21\3\21\3\21\5\21\u057f\n\21\3\22\3\22\3\22\3\23\3\23\3"+
		"\23\3\24\5\24\u0588\n\24\3\24\3\24\3\24\3\25\3\25\3\25\5\25\u0590\n\25"+
		"\3\25\3\25\3\25\3\25\3\25\5\25\u0597\n\25\5\25\u0599\n\25\3\25\5\25\u059c"+
		"\n\25\3\25\3\25\3\25\5\25\u05a1\n\25\3\25\3\25\5\25\u05a5\n\25\3\25\3"+
		"\25\3\25\5\25\u05aa\n\25\3\25\5\25\u05ad\n\25\3\25\3\25\3\25\5\25\u05b2"+
		"\n\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u05bb\n\25\3\25\3\25\3\25"+
		"\5\25\u05c0\n\25\3\25\5\25\u05c3\n\25\3\25\3\25\3\25\5\25\u05c8\n\25\3"+
		"\25\3\25\5\25\u05cc\n\25\3\25\3\25\3\25\5\25\u05d1\n\25\5\25\u05d3\n\25"+
		"\3\26\3\26\5\26\u05d7\n\26\3\27\3\27\3\27\3\27\3\27\7\27\u05de\n\27\f"+
		"\27\16\27\u05e1\13\27\3\27\3\27\3\30\3\30\3\30\5\30\u05e8\n\30\3\30\3"+
		"\30\3\30\3\30\5\30\u05ee\n\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\3\33\5\33\u05f9\n\33\3\34\3\34\3\34\7\34\u05fe\n\34\f\34\16\34\u0601"+
		"\13\34\3\35\3\35\3\35\3\35\7\35\u0607\n\35\f\35\16\35\u060a\13\35\3\36"+
		"\3\36\5\36\u060e\n\36\3\36\5\36\u0611\n\36\3\36\3\36\3\36\3\36\3\37\3"+
		"\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \7 \u0627\n \f \16 \u062a"+
		"\13 \3!\3!\3!\3!\7!\u0630\n!\f!\16!\u0633\13!\3!\3!\3\"\3\"\5\"\u0639"+
		"\n\"\3\"\5\"\u063c\n\"\3#\3#\3#\7#\u0641\n#\f#\16#\u0644\13#\3#\5#\u0647"+
		"\n#\3$\3$\3$\3$\5$\u064d\n$\3%\3%\3%\3%\7%\u0653\n%\f%\16%\u0656\13%\3"+
		"%\3%\3&\3&\3&\3&\7&\u065e\n&\f&\16&\u0661\13&\3&\3&\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\5\'\u066b\n\'\3(\3(\3(\3(\3(\3(\5(\u0673\n(\3)\3)\3)\3)\5)\u0679"+
		"\n)\3*\3*\3*\3+\3+\3+\3+\3+\6+\u0683\n+\r+\16+\u0684\3+\3+\3+\3+\3+\5"+
		"+\u068c\n+\3+\3+\3+\3+\3+\5+\u0693\n+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5"+
		"+\u069f\n+\3+\3+\3+\3+\7+\u06a5\n+\f+\16+\u06a8\13+\3+\7+\u06ab\n+\f+"+
		"\16+\u06ae\13+\3+\7+\u06b1\n+\f+\16+\u06b4\13+\5+\u06b6\n+\3,\3,\3,\3"+
		",\3,\7,\u06bd\n,\f,\16,\u06c0\13,\5,\u06c2\n,\3,\3,\3,\3,\3,\7,\u06c9"+
		"\n,\f,\16,\u06cc\13,\5,\u06ce\n,\3,\3,\3,\3,\3,\7,\u06d5\n,\f,\16,\u06d8"+
		"\13,\5,\u06da\n,\3,\3,\3,\3,\3,\7,\u06e1\n,\f,\16,\u06e4\13,\5,\u06e6"+
		"\n,\3,\5,\u06e9\n,\3,\3,\3,\5,\u06ee\n,\5,\u06f0\n,\3,\3,\5,\u06f4\n,"+
		"\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\5.\u0700\n.\3.\3.\3.\3.\3.\5.\u0707\n."+
		"\3.\3.\3.\3.\3.\5.\u070e\n.\3.\7.\u0711\n.\f.\16.\u0714\13.\3/\3/\3/\3"+
		"/\3/\3/\3/\3/\3/\5/\u071f\n/\3\60\3\60\5\60\u0723\n\60\3\60\3\60\5\60"+
		"\u0727\n\60\3\61\3\61\6\61\u072b\n\61\r\61\16\61\u072c\3\62\3\62\5\62"+
		"\u0731\n\62\3\62\3\62\3\62\3\62\7\62\u0737\n\62\f\62\16\62\u073a\13\62"+
		"\3\62\5\62\u073d\n\62\3\62\5\62\u0740\n\62\3\62\5\62\u0743\n\62\3\62\5"+
		"\62\u0746\n\62\3\62\3\62\5\62\u074a\n\62\3\63\3\63\5\63\u074e\n\63\3\63"+
		"\7\63\u0751\n\63\f\63\16\63\u0754\13\63\3\63\5\63\u0757\n\63\3\63\5\63"+
		"\u075a\n\63\3\63\5\63\u075d\n\63\3\63\5\63\u0760\n\63\3\63\3\63\5\63\u0764"+
		"\n\63\3\63\7\63\u0767\n\63\f\63\16\63\u076a\13\63\3\63\5\63\u076d\n\63"+
		"\3\63\5\63\u0770\n\63\3\63\5\63\u0773\n\63\3\63\5\63\u0776\n\63\5\63\u0778"+
		"\n\63\3\64\3\64\3\64\3\64\5\64\u077e\n\64\3\64\3\64\3\64\3\64\3\64\5\64"+
		"\u0785\n\64\3\64\3\64\3\64\5\64\u078a\n\64\3\64\5\64\u078d\n\64\3\64\5"+
		"\64\u0790\n\64\3\64\3\64\5\64\u0794\n\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\5\64\u079e\n\64\3\64\3\64\5\64\u07a2\n\64\5\64\u07a4\n\64\3"+
		"\64\5\64\u07a7\n\64\3\64\3\64\5\64\u07ab\n\64\3\65\3\65\7\65\u07af\n\65"+
		"\f\65\16\65\u07b2\13\65\3\65\5\65\u07b5\n\65\3\65\3\65\3\66\3\66\3\66"+
		"\3\67\3\67\3\67\3\67\5\67\u07c0\n\67\3\67\3\67\3\67\38\38\38\38\38\58"+
		"\u07ca\n8\38\38\58\u07ce\n8\38\38\38\39\39\39\39\39\39\39\59\u07da\n9"+
		"\39\39\39\3:\3:\3:\3:\3:\3:\3:\5:\u07e6\n:\3;\3;\3;\3;\3;\3;\3;\3;\3;"+
		"\3;\3;\7;\u07f3\n;\f;\16;\u07f6\13;\3;\3;\5;\u07fa\n;\3<\3<\3<\3<\5<\u0800"+
		"\n<\3=\3=\3=\7=\u0805\n=\f=\16=\u0808\13=\3>\3>\3>\3>\3?\3?\3?\3@\3@\3"+
		"@\3A\3A\3A\5A\u0817\nA\3A\7A\u081a\nA\fA\16A\u081d\13A\3A\3A\3B\3B\3B"+
		"\3B\3B\3B\7B\u0827\nB\fB\16B\u082a\13B\3B\3B\5B\u082e\nB\3C\3C\3C\3C\7"+
		"C\u0834\nC\fC\16C\u0837\13C\3C\7C\u083a\nC\fC\16C\u083d\13C\3C\5C\u0840"+
		"\nC\3C\5C\u0843\nC\3D\5D\u0846\nD\3D\3D\3D\3D\3D\5D\u084d\nD\3D\3D\3D"+
		"\3D\5D\u0853\nD\3E\3E\3E\3E\3E\7E\u085a\nE\fE\16E\u085d\13E\3E\3E\3E\3"+
		"E\3E\7E\u0864\nE\fE\16E\u0867\13E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\7E\u0873"+
		"\nE\fE\16E\u0876\13E\3E\3E\5E\u087a\nE\5E\u087c\nE\3F\3F\5F\u0880\nF\3"+
		"G\3G\3G\3G\3G\7G\u0887\nG\fG\16G\u088a\13G\3G\3G\3G\3G\3G\3G\3G\3G\7G"+
		"\u0894\nG\fG\16G\u0897\13G\3G\3G\5G\u089b\nG\3H\3H\5H\u089f\nH\3I\3I\3"+
		"I\3I\7I\u08a5\nI\fI\16I\u08a8\13I\5I\u08aa\nI\3I\3I\5I\u08ae\nI\3J\3J"+
		"\3J\3J\3J\3J\3J\3J\3J\3J\7J\u08ba\nJ\fJ\16J\u08bd\13J\3J\3J\3J\3K\3K\3"+
		"K\3K\3K\7K\u08c7\nK\fK\16K\u08ca\13K\3K\3K\5K\u08ce\nK\3L\3L\5L\u08d2"+
		"\nL\3L\5L\u08d5\nL\3M\3M\5M\u08d9\nM\3M\3M\3M\3M\5M\u08df\nM\3M\5M\u08e2"+
		"\nM\3N\3N\3N\3O\3O\5O\u08e9\nO\3P\3P\3P\3P\3P\3P\3P\3P\7P\u08f3\nP\fP"+
		"\16P\u08f6\13P\3P\3P\3Q\3Q\3Q\3Q\7Q\u08fe\nQ\fQ\16Q\u0901\13Q\3Q\3Q\3"+
		"Q\3Q\3Q\3Q\3Q\3Q\7Q\u090b\nQ\fQ\16Q\u090e\13Q\3Q\3Q\3R\3R\3R\3R\7R\u0916"+
		"\nR\fR\16R\u0919\13R\3R\3R\5R\u091d\nR\3S\3S\3T\3T\3U\3U\5U\u0925\nU\3"+
		"V\3V\3W\5W\u092a\nW\3W\3W\3X\3X\3X\5X\u0931\nX\3X\3X\3X\3X\3X\7X\u0938"+
		"\nX\fX\16X\u093b\13X\5X\u093d\nX\3X\3X\3X\5X\u0942\nX\3X\3X\3X\7X\u0947"+
		"\nX\fX\16X\u094a\13X\5X\u094c\nX\3Y\3Y\3Z\5Z\u0951\nZ\3Z\3Z\7Z\u0955\n"+
		"Z\fZ\16Z\u0958\13Z\3[\3[\3[\5[\u095d\n[\3\\\3\\\3\\\5\\\u0962\n\\\3\\"+
		"\3\\\5\\\u0966\n\\\3\\\3\\\3\\\3\\\5\\\u096c\n\\\3\\\3\\\5\\\u0970\n\\"+
		"\3]\5]\u0973\n]\3]\3]\3]\5]\u0978\n]\3]\5]\u097b\n]\3]\3]\3]\5]\u0980"+
		"\n]\3]\3]\5]\u0984\n]\3]\5]\u0987\n]\3]\5]\u098a\n]\3^\3^\3^\3^\5^\u0990"+
		"\n^\3_\3_\3_\5_\u0995\n_\3_\3_\3_\3_\3_\5_\u099c\n_\3`\5`\u099f\n`\3`"+
		"\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\5`\u09b1\n`\5`\u09b3\n`"+
		"\3`\5`\u09b6\n`\3a\3a\3a\3a\3b\3b\3b\7b\u09bf\nb\fb\16b\u09c2\13b\3c\3"+
		"c\3d\3d\3d\3d\7d\u09ca\nd\fd\16d\u09cd\13d\3d\3d\3e\3e\5e\u09d3\ne\3f"+
		"\3f\3f\3f\7f\u09d9\nf\ff\16f\u09dc\13f\3f\3f\3g\3g\5g\u09e2\ng\3h\3h\5"+
		"h\u09e6\nh\3h\5h\u09e9\nh\3h\3h\3h\3h\3h\3h\5h\u09f1\nh\3h\3h\3h\3h\3"+
		"h\3h\5h\u09f9\nh\3h\3h\3h\3h\5h\u09ff\nh\3i\3i\3i\3i\7i\u0a05\ni\fi\16"+
		"i\u0a08\13i\3i\3i\3j\3j\3j\3j\3j\7j\u0a11\nj\fj\16j\u0a14\13j\5j\u0a16"+
		"\nj\3j\3j\3j\3k\5k\u0a1c\nk\3k\3k\5k\u0a20\nk\5k\u0a22\nk\3l\3l\3l\3l"+
		"\3l\3l\3l\5l\u0a2b\nl\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\5l\u0a37\nl\5l\u0a39"+
		"\nl\3l\3l\3l\3l\3l\5l\u0a40\nl\3l\3l\3l\3l\3l\5l\u0a47\nl\3l\3l\3l\3l"+
		"\5l\u0a4d\nl\3l\3l\3l\3l\5l\u0a53\nl\5l\u0a55\nl\3m\3m\3m\7m\u0a5a\nm"+
		"\fm\16m\u0a5d\13m\3n\3n\3n\7n\u0a62\nn\fn\16n\u0a65\13n\3o\3o\3o\7o\u0a6a"+
		"\no\fo\16o\u0a6d\13o\3p\3p\3p\5p\u0a72\np\3q\3q\3q\5q\u0a77\nq\3q\3q\3"+
		"r\3r\3r\5r\u0a7e\nr\3r\3r\3s\3s\5s\u0a84\ns\3s\3s\5s\u0a88\ns\5s\u0a8a"+
		"\ns\3t\3t\3t\7t\u0a8f\nt\ft\16t\u0a92\13t\3u\3u\3u\3u\7u\u0a98\nu\fu\16"+
		"u\u0a9b\13u\3u\3u\3v\3v\5v\u0aa1\nv\3w\3w\3w\3w\3w\3w\7w\u0aa9\nw\fw\16"+
		"w\u0aac\13w\3w\3w\5w\u0ab0\nw\3x\3x\5x\u0ab4\nx\3y\3y\3z\3z\3z\7z\u0abb"+
		"\nz\fz\16z\u0abe\13z\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\5{\u0aca\n{\5{\u0acc"+
		"\n{\3{\3{\3{\3{\3{\3{\7{\u0ad4\n{\f{\16{\u0ad7\13{\3|\5|\u0ada\n|\3|\3"+
		"|\3|\3|\3|\3|\5|\u0ae2\n|\3|\3|\3|\3|\3|\7|\u0ae9\n|\f|\16|\u0aec\13|"+
		"\3|\3|\3|\5|\u0af1\n|\3|\3|\3|\3|\3|\3|\5|\u0af9\n|\3|\3|\3|\5|\u0afe"+
		"\n|\3|\3|\3|\3|\3|\3|\3|\3|\7|\u0b08\n|\f|\16|\u0b0b\13|\3|\3|\5|\u0b0f"+
		"\n|\3|\5|\u0b12\n|\3|\3|\3|\3|\5|\u0b18\n|\3|\3|\5|\u0b1c\n|\3|\3|\3|"+
		"\5|\u0b21\n|\3|\3|\3|\5|\u0b26\n|\3|\3|\3|\5|\u0b2b\n|\3}\3}\3}\3}\5}"+
		"\u0b31\n}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\7}"+
		"\u0b46\n}\f}\16}\u0b49\13}\3~\3~\3\177\3\177\3\177\3\177\3\177\3\177\3"+
		"\177\3\177\3\177\3\177\3\177\3\177\3\177\3\177\3\177\3\177\3\177\3\177"+
		"\3\177\3\177\3\177\3\177\6\177\u0b63\n\177\r\177\16\177\u0b64\3\177\3"+
		"\177\5\177\u0b69\n\177\3\177\3\177\3\177\3\177\3\177\6\177\u0b70\n\177"+
		"\r\177\16\177\u0b71\3\177\3\177\5\177\u0b76\n\177\3\177\3\177\3\177\3"+
		"\177\3\177\3\177\3\177\3\177\3\177\3\177\3\177\3\177\3\177\3\177\7\177"+
		"\u0b86\n\177\f\177\16\177\u0b89\13\177\5\177\u0b8b\n\177\3\177\3\177\3"+
		"\177\3\177\3\177\3\177\5\177\u0b93\n\177\3\177\3\177\3\177\3\177\3\177"+
		"\3\177\3\177\5\177\u0b9c\n\177\3\177\3\177\3\177\3\177\3\177\3\177\3\177"+
		"\5\177\u0ba5\n\177\3\177\3\177\3\177\3\177\3\177\3\177\3\177\3\177\3\177"+
		"\3\177\3\177\3\177\3\177\3\177\3\177\3\177\3\177\3\177\3\177\7\177\u0bba"+
		"\n\177\f\177\16\177\u0bbd\13\177\3\177\3\177\3\177\3\177\3\177\3\177\3"+
		"\177\3\177\3\177\5\177\u0bc8\n\177\3\177\3\177\3\177\7\177\u0bcd\n\177"+
		"\f\177\16\177\u0bd0\13\177\5\177\u0bd2\n\177\3\177\3\177\3\177\3\177\3"+
		"\177\3\177\3\177\5\177\u0bdb\n\177\3\177\3\177\5\177\u0bdf\n\177\3\177"+
		"\3\177\5\177\u0be3\n\177\3\177\3\177\3\177\3\177\3\177\3\177\3\177\3\177"+
		"\6\177\u0bed\n\177\r\177\16\177\u0bee\3\177\3\177\3\177\3\177\3\177\3"+
		"\177\3\177\3\177\3\177\3\177\3\177\3\177\3\177\3\177\3\177\3\177\3\177"+
		"\3\177\3\177\3\177\3\177\3\177\3\177\5\177\u0c08\n\177\3\177\3\177\3\177"+
		"\3\177\3\177\5\177\u0c0f\n\177\3\177\5\177\u0c12\n\177\3\177\3\177\3\177"+
		"\3\177\3\177\3\177\3\177\3\177\3\177\3\177\3\177\3\177\3\177\5\177\u0c21"+
		"\n\177\3\177\3\177\3\177\3\177\3\177\3\177\3\177\3\177\3\177\3\177\3\177"+
		"\3\177\3\177\3\177\3\177\3\177\3\177\3\177\3\177\5\177\u0c36\n\177\3\177"+
		"\3\177\5\177\u0c3a\n\177\3\177\3\177\3\177\3\177\3\177\5\177\u0c41\n\177"+
		"\3\177\3\177\3\177\3\177\3\177\3\177\3\177\3\177\7\177\u0c4b\n\177\f\177"+
		"\16\177\u0c4e\13\177\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3"+
		"\u0080\3\u0080\3\u0080\3\u0080\6\u0080\u0c5a\n\u0080\r\u0080\16\u0080"+
		"\u0c5b\5\u0080\u0c5e\n\u0080\3\u0081\3\u0081\3\u0082\3\u0082\3\u0083\3"+
		"\u0083\3\u0084\3\u0084\3\u0085\3\u0085\3\u0085\5\u0085\u0c6b\n\u0085\3"+
		"\u0086\3\u0086\5\u0086\u0c6f\n\u0086\3\u0087\3\u0087\3\u0087\6\u0087\u0c74"+
		"\n\u0087\r\u0087\16\u0087\u0c75\3\u0088\3\u0088\3\u0088\5\u0088\u0c7b"+
		"\n\u0088\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u008a\5\u008a\u0c83"+
		"\n\u008a\3\u008a\3\u008a\3\u008a\5\u008a\u0c88\n\u008a\3\u008b\3\u008b"+
		"\3\u008c\3\u008c\3\u008d\3\u008d\3\u008d\5\u008d\u0c91\n\u008d\3\u008e"+
		"\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e"+
		"\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\5\u008e\u0ca2\n\u008e\3\u008e"+
		"\3\u008e\5\u008e\u0ca6\n\u008e\3\u008e\3\u008e\3\u008e\3\u008e\5\u008e"+
		"\u0cac\n\u008e\3\u008e\3\u008e\3\u008e\3\u008e\5\u008e\u0cb2\n\u008e\3"+
		"\u008e\3\u008e\3\u008e\3\u008e\3\u008e\7\u008e\u0cb9\n\u008e\f\u008e\16"+
		"\u008e\u0cbc\13\u008e\3\u008e\5\u008e\u0cbf\n\u008e\5\u008e\u0cc1\n\u008e"+
		"\3\u008f\3\u008f\3\u008f\7\u008f\u0cc6\n\u008f\f\u008f\16\u008f\u0cc9"+
		"\13\u008f\3\u0090\3\u0090\3\u0090\3\u0090\5\u0090\u0ccf\n\u0090\3\u0090"+
		"\5\u0090\u0cd2\n\u0090\3\u0090\5\u0090\u0cd5\n\u0090\3\u0090\5\u0090\u0cd8"+
		"\n\u0090\3\u0091\3\u0091\3\u0091\3\u0092\3\u0092\3\u0092\7\u0092\u0ce0"+
		"\n\u0092\f\u0092\16\u0092\u0ce3\13\u0092\3\u0093\3\u0093\3\u0093\3\u0093"+
		"\5\u0093\u0ce9\n\u0093\3\u0093\5\u0093\u0cec\n\u0093\3\u0094\3\u0094\3"+
		"\u0094\7\u0094\u0cf1\n\u0094\f\u0094\16\u0094\u0cf4\13\u0094\3\u0095\3"+
		"\u0095\3\u0095\7\u0095\u0cf9\n\u0095\f\u0095\16\u0095\u0cfc\13\u0095\3"+
		"\u0096\3\u0096\3\u0096\3\u0096\5\u0096\u0d02\n\u0096\3\u0097\3\u0097\3"+
		"\u0097\7\u0097\u0d07\n\u0097\f\u0097\16\u0097\u0d0a\13\u0097\3\u0098\3"+
		"\u0098\5\u0098\u0d0e\n\u0098\3\u0098\3\u0098\3\u0098\5\u0098\u0d13\n\u0098"+
		"\3\u0098\5\u0098\u0d16\n\u0098\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099"+
		"\3\u009a\3\u009a\3\u009a\3\u009a\7\u009a\u0d21\n\u009a\f\u009a\16\u009a"+
		"\u0d24\13\u009a\3\u009b\3\u009b\3\u009b\3\u009b\3\u009c\3\u009c\3\u009c"+
		"\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\7\u009c"+
		"\u0d35\n\u009c\f\u009c\16\u009c\u0d38\13\u009c\3\u009c\3\u009c\3\u009c"+
		"\3\u009c\3\u009c\7\u009c\u0d3f\n\u009c\f\u009c\16\u009c\u0d42\13\u009c"+
		"\5\u009c\u0d44\n\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\7\u009c"+
		"\u0d4b\n\u009c\f\u009c\16\u009c\u0d4e\13\u009c\5\u009c\u0d50\n\u009c\5"+
		"\u009c\u0d52\n\u009c\3\u009c\5\u009c\u0d55\n\u009c\3\u009c\5\u009c\u0d58"+
		"\n\u009c\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d"+
		"\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\5\u009d"+
		"\u0d6a\n\u009d\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e"+
		"\5\u009e\u0d73\n\u009e\3\u009f\3\u009f\3\u009f\7\u009f\u0d78\n\u009f\f"+
		"\u009f\16\u009f\u0d7b\13\u009f\3\u00a0\3\u00a0\3\u00a0\3\u00a0\5\u00a0"+
		"\u0d81\n\u00a0\3\u00a1\3\u00a1\3\u00a1\7\u00a1\u0d86\n\u00a1\f\u00a1\16"+
		"\u00a1\u0d89\13\u00a1\3\u00a2\3\u00a2\3\u00a2\3\u00a3\3\u00a3\6\u00a3"+
		"\u0d90\n\u00a3\r\u00a3\16\u00a3\u0d91\3\u00a3\5\u00a3\u0d95\n\u00a3\3"+
		"\u00a4\3\u00a4\3\u00a4\5\u00a4\u0d9a\n\u00a4\3\u00a5\3\u00a5\3\u00a5\3"+
		"\u00a5\3\u00a5\3\u00a5\5\u00a5\u0da2\n\u00a5\3\u00a6\3\u00a6\3\u00a6\5"+
		"\u00a6\u0da7\n\u00a6\3\u00a7\3\u00a7\3\u00a8\3\u00a8\5\u00a8\u0dad\n\u00a8"+
		"\3\u00a8\3\u00a8\3\u00a8\5\u00a8\u0db2\n\u00a8\3\u00a8\3\u00a8\3\u00a8"+
		"\5\u00a8\u0db7\n\u00a8\3\u00a8\3\u00a8\5\u00a8\u0dbb\n\u00a8\3\u00a8\3"+
		"\u00a8\5\u00a8\u0dbf\n\u00a8\3\u00a8\3\u00a8\5\u00a8\u0dc3\n\u00a8\3\u00a8"+
		"\3\u00a8\5\u00a8\u0dc7\n\u00a8\3\u00a8\3\u00a8\5\u00a8\u0dcb\n\u00a8\3"+
		"\u00a8\3\u00a8\5\u00a8\u0dcf\n\u00a8\3\u00a8\3\u00a8\5\u00a8\u0dd3\n\u00a8"+
		"\3\u00a8\5\u00a8\u0dd6\n\u00a8\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9"+
		"\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\5\u00a9\u0de3\n\u00a9"+
		"\3\u00aa\3\u00aa\3\u00aa\5\u00aa\u0de8\n\u00aa\3\u00ab\3\u00ab\5\u00ab"+
		"\u0dec\n\u00ab\3\u00ac\3\u00ac\5\u00ac\u0df0\n\u00ac\3\u00ad\3\u00ad\3"+
		"\u00ae\3\u00ae\3\u00af\3\u00af\3\u00af\13\u03e8\u042b\u0433\u0444\u0452"+
		"\u045b\u0464\u046d\u0499\6Z\u00f4\u00f8\u00fc\u00b0\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhj"+
		"lnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092"+
		"\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa"+
		"\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2"+
		"\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da"+
		"\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2"+
		"\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a"+
		"\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122"+
		"\u0124\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134\u0136\u0138\u013a"+
		"\u013c\u013e\u0140\u0142\u0144\u0146\u0148\u014a\u014c\u014e\u0150\u0152"+
		"\u0154\u0156\u0158\u015a\u015c\2<\4\2FF\u00ca\u00ca\4\2\37\37\u00db\u00db"+
		"\4\2llzz\3\2,-\4\2\u0102\u0102\u0128\u0128\4\2\r\r$$\7\2))\65\65^^kk\u0098"+
		"\u0098\3\2KL\4\2^^kk\5\2\n\nSS\u00ff\u00ff\4\2\n\n\u0092\u0092\5\2BB\u00a6"+
		"\u00a6\u00e7\u00e7\5\2CC\u00a7\u00a7\u00e8\u00e8\6\2XX\u0082\u0082\u00f0"+
		"\u00f0\u011c\u011c\5\2XX\u00f0\u00f0\u011c\u011c\4\2\26\26KK\4\2ff\u0089"+
		"\u0089\4\2\u0101\u0101\u0127\u0127\4\2\u0100\u0100\u010b\u010b\4\288\u00e2"+
		"\u00e2\4\2ZZ{{\4\2\f\fPP\4\2\u0150\u0150\u0152\u0152\3\2\u008e\u008f\5"+
		"\2\f\f\21\21\u00f4\u00f4\5\2aa\u0115\u0115\u011e\u011e\4\2\u013d\u013e"+
		"\u0142\u0142\4\2RR\u013f\u0141\4\2\u013d\u013e\u0145\u0145\r\2>>@@uu\u009d"+
		"\u009d\u009f\u009f\u00a1\u00a1\u00a3\u00a3\u00cc\u00cc\u00e5\u00e5\u012a"+
		"\u012a\u0131\u0131\5\2::<=\u0124\u0124\4\2DD\u010c\u010c\4\2EE\u010d\u010d"+
		"\4\2!!\u0117\u0117\4\2xx\u00da\u00da\3\2\u00fd\u00fe\4\2\6\6ll\4\2\6\6"+
		"hh\5\2\32\32\u008c\u008c\u0110\u0110\3\2\u00c1\u00c2\3\2\u0135\u013c\4"+
		"\2RR\u013d\u0146\6\2\17\17zz\u00ac\u00ac\u00b5\u00b5\4\2aa\u0115\u0115"+
		"\3\2\u013d\u013e\t\2>?uv\u009d\u00a4\u00a8\u00a9\u00e5\u00e6\u012a\u012b"+
		"\u0131\u0132\b\2>>uu\u00a1\u00a1\u00a3\u00a3\u00e5\u00e5\u0131\u0131\4"+
		"\2\u00a3\u00a3\u0131\u0131\6\2>>uu\u00a1\u00a1\u00e5\u00e5\5\2uu\u00a1"+
		"\u00a1\u00e5\u00e5\4\2QQ\u00be\u00be\4\2\u00b6\u00b6\u00f5\u00f5\4\2g"+
		"g\u00c7\u00c7\3\2\u0151\u0152\4\2SS\u00ef\u00ef\65\2\n\13\r\16\20\20\22"+
		"\24\26\27\31\31\33\37\"$&)++-\63\65\6589>OQSWWY`ccegjknpssuy{}\177\u0081"+
		"\u0083\u0083\u0086\u0086\u0088\u0089\u008b\u008b\u008e\u00a9\u00ab\u00ab"+
		"\u00ae\u00af\u00b3\u00b4\u00b7\u00b7\u00b9\u00ba\u00bc\u00c0\u00c3\u00c7"+
		"\u00c9\u00d2\u00d4\u00dc\u00de\u00e8\u00ea\u00ed\u00ef\u00f3\u00f5\u0101"+
		"\u0103\u0108\u010b\u010d\u010f\u010f\u0111\u011b\u011f\u0123\u0126\u012b"+
		"\u012e\u012e\u0131\u0134\22\2\20\20\67\67XXmm~~\u0082\u0082\u0087\u0087"+
		"\u008a\u008a\u008d\u008d\u00aa\u00aa\u00b1\u00b1\u00dd\u00dd\u00ea\u00ea"+
		"\u00f0\u00f0\u011c\u011c\u0125\u0125\23\2\n\17\21\668WYln}\177\u0081\u0083"+
		"\u0086\u0088\u0089\u008b\u008c\u008e\u00a9\u00ab\u00b0\u00b2\u00dc\u00de"+
		"\u00e9\u00eb\u00ef\u00f1\u011b\u011d\u0124\u0126\u0133\2\u1007\2\u015e"+
		"\3\2\2\2\4\u0167\3\2\2\2\6\u016a\3\2\2\2\b\u016d\3\2\2\2\n\u0170\3\2\2"+
		"\2\f\u0173\3\2\2\2\16\u0176\3\2\2\2\20\u049c\3\2\2\2\22\u04a0\3\2\2\2"+
		"\24\u04a2\3\2\2\2\26\u04a4\3\2\2\2\30\u054e\3\2\2\2\32\u0550\3\2\2\2\34"+
		"\u0561\3\2\2\2\36\u0567\3\2\2\2 \u0573\3\2\2\2\"\u0580\3\2\2\2$\u0583"+
		"\3\2\2\2&\u0587\3\2\2\2(\u05d2\3\2\2\2*\u05d4\3\2\2\2,\u05d8\3\2\2\2."+
		"\u05ed\3\2\2\2\60\u05ef\3\2\2\2\62\u05f1\3\2\2\2\64\u05f8\3\2\2\2\66\u05fa"+
		"\3\2\2\28\u0602\3\2\2\2:\u060b\3\2\2\2<\u0616\3\2\2\2>\u0628\3\2\2\2@"+
		"\u062b\3\2\2\2B\u0636\3\2\2\2D\u0646\3\2\2\2F\u064c\3\2\2\2H\u064e\3\2"+
		"\2\2J\u0659\3\2\2\2L\u066a\3\2\2\2N\u0672\3\2\2\2P\u0674\3\2\2\2R\u067a"+
		"\3\2\2\2T\u06b5\3\2\2\2V\u06c1\3\2\2\2X\u06f5\3\2\2\2Z\u06f8\3\2\2\2\\"+
		"\u071e\3\2\2\2^\u0720\3\2\2\2`\u0728\3\2\2\2b\u0749\3\2\2\2d\u0777\3\2"+
		"\2\2f\u078c\3\2\2\2h\u07ac\3\2\2\2j\u07b8\3\2\2\2l\u07bb\3\2\2\2n\u07c4"+
		"\3\2\2\2p\u07d2\3\2\2\2r\u07e5\3\2\2\2t\u07f9\3\2\2\2v\u07ff\3\2\2\2x"+
		"\u0801\3\2\2\2z\u0809\3\2\2\2|\u080d\3\2\2\2~\u0810\3\2\2\2\u0080\u0813"+
		"\3\2\2\2\u0082\u082d\3\2\2\2\u0084\u082f\3\2\2\2\u0086\u0852\3\2\2\2\u0088"+
		"\u087b\3\2\2\2\u008a\u087f\3\2\2\2\u008c\u089a\3\2\2\2\u008e\u089e\3\2"+
		"\2\2\u0090\u08ad\3\2\2\2\u0092\u08af\3\2\2\2\u0094\u08cd\3\2\2\2\u0096"+
		"\u08cf\3\2\2\2\u0098\u08d6\3\2\2\2\u009a\u08e3\3\2\2\2\u009c\u08e8\3\2"+
		"\2\2\u009e\u08ea\3\2\2\2\u00a0\u08f9\3\2\2\2\u00a2\u0911\3\2\2\2\u00a4"+
		"\u091e\3\2\2\2\u00a6\u0920\3\2\2\2\u00a8\u0922\3\2\2\2\u00aa\u0926\3\2"+
		"\2\2\u00ac\u0929\3\2\2\2\u00ae\u092d\3\2\2\2\u00b0\u094d\3\2\2\2\u00b2"+
		"\u0950\3\2\2\2\u00b4\u095c\3\2\2\2\u00b6\u096f\3\2\2\2\u00b8\u0989\3\2"+
		"\2\2\u00ba\u098f\3\2\2\2\u00bc\u0991\3\2\2\2\u00be\u09b5\3\2\2\2\u00c0"+
		"\u09b7\3\2\2\2\u00c2\u09bb\3\2\2\2\u00c4\u09c3\3\2\2\2\u00c6\u09c5\3\2"+
		"\2\2\u00c8\u09d0\3\2\2\2\u00ca\u09d4\3\2\2\2\u00cc\u09df\3\2\2\2\u00ce"+
		"\u09fe\3\2\2\2\u00d0\u0a00\3\2\2\2\u00d2\u0a0b\3\2\2\2\u00d4\u0a21\3\2"+
		"\2\2\u00d6\u0a54\3\2\2\2\u00d8\u0a56\3\2\2\2\u00da\u0a5e\3\2\2\2\u00dc"+
		"\u0a66\3\2\2\2\u00de\u0a6e\3\2\2\2\u00e0\u0a76\3\2\2\2\u00e2\u0a7d\3\2"+
		"\2\2\u00e4\u0a81\3\2\2\2\u00e6\u0a8b\3\2\2\2\u00e8\u0a93\3\2\2\2\u00ea"+
		"\u0aa0\3\2\2\2\u00ec\u0aaf\3\2\2\2\u00ee\u0ab3\3\2\2\2\u00f0\u0ab5\3\2"+
		"\2\2\u00f2\u0ab7\3\2\2\2\u00f4\u0acb\3\2\2\2\u00f6\u0b2a\3\2\2\2\u00f8"+
		"\u0b30\3\2\2\2\u00fa\u0b4a\3\2\2\2\u00fc\u0c40\3\2\2\2\u00fe\u0c5d\3\2"+
		"\2\2\u0100\u0c5f\3\2\2\2\u0102\u0c61\3\2\2\2\u0104\u0c63\3\2\2\2\u0106"+
		"\u0c65\3\2\2\2\u0108\u0c67\3\2\2\2\u010a\u0c6c\3\2\2\2\u010c\u0c73\3\2"+
		"\2\2\u010e\u0c77\3\2\2\2\u0110\u0c7c\3\2\2\2\u0112\u0c82\3\2\2\2\u0114"+
		"\u0c89\3\2\2\2\u0116\u0c8b\3\2\2\2\u0118\u0c90\3\2\2\2\u011a\u0cc0\3\2"+
		"\2\2\u011c\u0cc2\3\2\2\2\u011e\u0cca\3\2\2\2\u0120\u0cd9\3\2\2\2\u0122"+
		"\u0cdc\3\2\2\2\u0124\u0ce4\3\2\2\2\u0126\u0ced\3\2\2\2\u0128\u0cf5\3\2"+
		"\2\2\u012a\u0d01\3\2\2\2\u012c\u0d03\3\2\2\2\u012e\u0d0b\3\2\2\2\u0130"+
		"\u0d17\3\2\2\2\u0132\u0d1c\3\2\2\2\u0134\u0d25\3\2\2\2\u0136\u0d57\3\2"+
		"\2\2\u0138\u0d69\3\2\2\2\u013a\u0d72\3\2\2\2\u013c\u0d74\3\2\2\2\u013e"+
		"\u0d80\3\2\2\2\u0140\u0d82\3\2\2\2\u0142\u0d8a\3\2\2\2\u0144\u0d94\3\2"+
		"\2\2\u0146\u0d99\3\2\2\2\u0148\u0da1\3\2\2\2\u014a\u0da6\3\2\2\2\u014c"+
		"\u0da8\3\2\2\2\u014e\u0dd5\3\2\2\2\u0150\u0de2\3\2\2\2\u0152\u0de7\3\2"+
		"\2\2\u0154\u0deb\3\2\2\2\u0156\u0def\3\2\2\2\u0158\u0df1\3\2\2\2\u015a"+
		"\u0df3\3\2\2\2\u015c\u0df5\3\2\2\2\u015e\u0162\5\20\t\2\u015f\u0161\7"+
		"\3\2\2\u0160\u015f\3\2\2\2\u0161\u0164\3\2\2\2\u0162\u0160\3\2\2\2\u0162"+
		"\u0163\3\2\2\2\u0163\u0165\3\2\2\2\u0164\u0162\3\2\2\2\u0165\u0166\7\2"+
		"\2\3\u0166\3\3\2\2\2\u0167\u0168\5\u00e4s\2\u0168\u0169\7\2\2\3\u0169"+
		"\5\3\2\2\2\u016a\u016b\5\u00e0q\2\u016b\u016c\7\2\2\3\u016c\7\3\2\2\2"+
		"\u016d\u016e\5\u00dan\2\u016e\u016f\7\2\2\3\u016f\t\3\2\2\2\u0170\u0171"+
		"\5\u00e2r\2\u0171\u0172\7\2\2\3\u0172\13\3\2\2\2\u0173\u0174\5\u011a\u008e"+
		"\2\u0174\u0175\7\2\2\3\u0175\r\3\2\2\2\u0176\u0177\5\u0122\u0092\2\u0177"+
		"\u0178\7\2\2\3\u0178\17\3\2\2\2\u0179\u049d\5&\24\2\u017a\u017c\58\35"+
		"\2\u017b\u017a\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u049d"+
		"\5T+\2\u017e\u017f\7\u0123\2\2\u017f\u049d\5\u00dan\2\u0180\u0181\7\u0123"+
		"\2\2\u0181\u0182\5\60\31\2\u0182\u0183\5\u00dan\2\u0183\u049d\3\2\2\2"+
		"\u0184\u0185\7\u00ef\2\2\u0185\u0188\7\"\2\2\u0186\u0189\5\u0146\u00a4"+
		"\2\u0187\u0189\5\u0152\u00aa\2\u0188\u0186\3\2\2\2\u0188\u0187\3\2\2\2"+
		"\u0189\u049d\3\2\2\2\u018a\u018b\7\66\2\2\u018b\u018f\5\60\31\2\u018c"+
		"\u018d\7w\2\2\u018d\u018e\7\u00ac\2\2\u018e\u0190\7[\2\2\u018f\u018c\3"+
		"\2\2\2\u018f\u0190\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0199\5\u00dan\2"+
		"\u0192\u0198\5$\23\2\u0193\u0198\5\"\22\2\u0194\u0195\7\u012f\2\2\u0195"+
		"\u0196\t\2\2\2\u0196\u0198\5@!\2\u0197\u0192\3\2\2\2\u0197\u0193\3\2\2"+
		"\2\u0197\u0194\3\2\2\2\u0198\u019b\3\2\2\2\u0199\u0197\3\2\2\2\u0199\u019a"+
		"\3\2\2\2\u019a\u049d\3\2\2\2\u019b\u0199\3\2\2\2\u019c\u019d\7\r\2\2\u019d"+
		"\u019e\5\60\31\2\u019e\u019f\5\u00dan\2\u019f\u01a0\7\u00ef\2\2\u01a0"+
		"\u01a1\t\2\2\2\u01a1\u01a2\5@!\2\u01a2\u049d\3\2\2\2\u01a3\u01a4\7\r\2"+
		"\2\u01a4\u01a5\5\60\31\2\u01a5\u01a6\5\u00dan\2\u01a6\u01a7\7\u00ef\2"+
		"\2\u01a7\u01a8\5\"\22\2\u01a8\u049d\3\2\2\2\u01a9\u01aa\7S\2\2\u01aa\u01ad"+
		"\5\60\31\2\u01ab\u01ac\7w\2\2\u01ac\u01ae\7[\2\2\u01ad\u01ab\3\2\2\2\u01ad"+
		"\u01ae\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b1\5\u00dan\2\u01b0\u01b2"+
		"\t\3\2\2\u01b1\u01b0\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u049d\3\2\2\2\u01b3"+
		"\u01b4\7\u00f2\2\2\u01b4\u01b7\5\62\32\2\u01b5\u01b6\t\4\2\2\u01b6\u01b8"+
		"\5\u00dan\2\u01b7\u01b5\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01bd\3\2\2"+
		"\2\u01b9\u01bb\7\u008e\2\2\u01ba\u01b9\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb"+
		"\u01bc\3\2\2\2\u01bc\u01be\5\u0152\u00aa\2\u01bd\u01ba\3\2\2\2\u01bd\u01be"+
		"\3\2\2\2\u01be\u049d\3\2\2\2\u01bf\u01c4\5\32\16\2\u01c0\u01c1\7\4\2\2"+
		"\u01c1\u01c2\5\u0126\u0094\2\u01c2\u01c3\7\5\2\2\u01c3\u01c5\3\2\2\2\u01c4"+
		"\u01c0\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c7\3\2\2\2\u01c6\u01c8\5<"+
		"\37\2\u01c7\u01c6\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9"+
		"\u01ce\5> \2\u01ca\u01cc\7\25\2\2\u01cb\u01ca\3\2\2\2\u01cb\u01cc\3\2"+
		"\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01cf\5&\24\2\u01ce\u01cb\3\2\2\2\u01ce"+
		"\u01cf\3\2\2\2\u01cf\u049d\3\2\2\2\u01d0\u01d1\7\66\2\2\u01d1\u01d5\7"+
		"\u0102\2\2\u01d2\u01d3\7w\2\2\u01d3\u01d4\7\u00ac\2\2\u01d4\u01d6\7[\2"+
		"\2\u01d5\u01d2\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d8"+
		"\5\u00e0q\2\u01d8\u01d9\7\u008e\2\2\u01d9\u01e2\5\u00e0q\2\u01da\u01e1"+
		"\5<\37\2\u01db\u01e1\5\u00d6l\2\u01dc\u01e1\5L\'\2\u01dd\u01e1\5\"\22"+
		"\2\u01de\u01df\7\u0106\2\2\u01df\u01e1\5@!\2\u01e0\u01da\3\2\2\2\u01e0"+
		"\u01db\3\2\2\2\u01e0\u01dc\3\2\2\2\u01e0\u01dd\3\2\2\2\u01e0\u01de\3\2"+
		"\2\2\u01e1\u01e4\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3"+
		"\u049d\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e5\u01ea\5\34\17\2\u01e6\u01e7\7"+
		"\4\2\2\u01e7\u01e8\5\u0126\u0094\2\u01e8\u01e9\7\5\2\2\u01e9\u01eb\3\2"+
		"\2\2\u01ea\u01e6\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ed\3\2\2\2\u01ec"+
		"\u01ee\5<\37\2\u01ed\u01ec\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01ef\3\2"+
		"\2\2\u01ef\u01f4\5> \2\u01f0\u01f2\7\25\2\2\u01f1\u01f0\3\2\2\2\u01f1"+
		"\u01f2\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f5\5&\24\2\u01f4\u01f1\3\2"+
		"\2\2\u01f4\u01f5\3\2\2\2\u01f5\u049d\3\2\2\2\u01f6\u01f7\7\16\2\2\u01f7"+
		"\u01f8\7\u0102\2\2\u01f8\u01fa\5\u00dan\2\u01f9\u01fb\5,\27\2\u01fa\u01f9"+
		"\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u01fd\7\62\2\2"+
		"\u01fd\u0205\7\u00f9\2\2\u01fe\u0206\5\u0146\u00a4\2\u01ff\u0200\7h\2"+
		"\2\u0200\u0201\7-\2\2\u0201\u0206\5\u00c2b\2\u0202\u0203\7h\2\2\u0203"+
		"\u0204\7\f\2\2\u0204\u0206\7-\2\2\u0205\u01fe\3\2\2\2\u0205\u01ff\3\2"+
		"\2\2\u0205\u0202\3\2\2\2\u0205\u0206\3\2\2\2\u0206\u049d\3\2\2\2\u0207"+
		"\u0208\7\16\2\2\u0208\u020b\7\u0103\2\2\u0209\u020a\t\4\2\2\u020a\u020c"+
		"\5\u00dan\2\u020b\u0209\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020d\3\2\2"+
		"\2\u020d\u020e\7\62\2\2\u020e\u0210\7\u00f9\2\2\u020f\u0211\5\u0146\u00a4"+
		"\2\u0210\u020f\3\2\2\2\u0210\u0211\3\2\2\2\u0211\u049d\3\2\2\2\u0212\u0213"+
		"\7\r\2\2\u0213\u0214\7\u0102\2\2\u0214\u0215\5\u00dan\2\u0215\u0216\7"+
		"\n\2\2\u0216\u0217\t\5\2\2\u0217\u0218\5\u011c\u008f\2\u0218\u049d\3\2"+
		"\2\2\u0219\u021a\7\r\2\2\u021a\u021b\7\u0102\2\2\u021b\u021c\5\u00dan"+
		"\2\u021c\u021d\7\n\2\2\u021d\u021e\t\5\2\2\u021e\u021f\7\4\2\2\u021f\u0220"+
		"\5\u011c\u008f\2\u0220\u0221\7\5\2\2\u0221\u049d\3\2\2\2\u0222\u0223\7"+
		"\r\2\2\u0223\u0224\7\u0102\2\2\u0224\u0225\5\u00dan\2\u0225\u0226\7\u00d5"+
		"\2\2\u0226\u0227\7,\2\2\u0227\u0228\5\u00dan\2\u0228\u0229\7\u010e\2\2"+
		"\u0229\u022a\5\u0142\u00a2\2\u022a\u049d\3\2\2\2\u022b\u022c\7\r\2\2\u022c"+
		"\u022d\7\u0102\2\2\u022d\u022e\5\u00dan\2\u022e\u022f\7S\2\2\u022f\u0232"+
		"\t\5\2\2\u0230\u0231\7w\2\2\u0231\u0233\7[\2\2\u0232\u0230\3\2\2\2\u0232"+
		"\u0233\3\2\2\2\u0233\u0234\3\2\2\2\u0234\u0235\7\4\2\2\u0235\u0236\5\u00d8"+
		"m\2\u0236\u0237\7\5\2\2\u0237\u049d\3\2\2\2\u0238\u0239\7\r\2\2\u0239"+
		"\u023a\7\u0102\2\2\u023a\u023b\5\u00dan\2\u023b\u023c\7S\2\2\u023c\u023f"+
		"\t\5\2\2\u023d\u023e\7w\2\2\u023e\u0240\7[\2\2\u023f\u023d\3\2\2\2\u023f"+
		"\u0240\3\2\2\2\u0240\u0241\3\2\2\2\u0241\u0242\5\u00d8m\2\u0242\u049d"+
		"\3\2\2\2\u0243\u0244\7\r\2\2\u0244\u0245\t\6\2\2\u0245\u0246\5\u00dan"+
		"\2\u0246\u0247\7\u00d5\2\2\u0247\u0248\7\u010e\2\2\u0248\u0249\5\u00da"+
		"n\2\u0249\u049d\3\2\2\2\u024a\u024b\7\r\2\2\u024b\u024c\t\6\2\2\u024c"+
		"\u024d\5\u00dan\2\u024d\u024e\7\u00ef\2\2\u024e\u024f\7\u0106\2\2\u024f"+
		"\u0250\5@!\2\u0250\u049d\3\2\2\2\u0251\u0252\7\r\2\2\u0252\u0253\t\6\2"+
		"\2\u0253\u0254\5\u00dan\2\u0254\u0255\7\u0121\2\2\u0255\u0258\7\u0106"+
		"\2\2\u0256\u0257\7w\2\2\u0257\u0259\7[\2\2\u0258\u0256\3\2\2\2\u0258\u0259"+
		"\3\2\2\2\u0259\u025a\3\2\2\2\u025a\u025b\5@!\2\u025b\u049d\3\2\2\2\u025c"+
		"\u025d\7\r\2\2\u025d\u025e\7\u0102\2\2\u025e\u025f\5\u00dan\2\u025f\u0261"+
		"\t\7\2\2\u0260\u0262\7,\2\2\u0261\u0260\3\2\2\2\u0261\u0262\3\2\2\2\u0262"+
		"\u0263\3\2\2\2\u0263\u0265\5\u00dan\2\u0264\u0266\5\u0150\u00a9\2\u0265"+
		"\u0264\3\2\2\2\u0265\u0266\3\2\2\2\u0266\u049d\3\2\2\2\u0267\u0268\7\r"+
		"\2\2\u0268\u0269\7\u0102\2\2\u0269\u026b\5\u00dan\2\u026a\u026c\5,\27"+
		"\2\u026b\u026a\3\2\2\2\u026b\u026c\3\2\2\2\u026c\u026d\3\2\2\2\u026d\u026f"+
		"\7$\2\2\u026e\u0270\7,\2\2\u026f\u026e\3\2\2\2\u026f\u0270\3\2\2\2\u0270"+
		"\u0271\3\2\2\2\u0271\u0272\5\u00dan\2\u0272\u0274\5\u0124\u0093\2\u0273"+
		"\u0275\5\u0118\u008d\2\u0274\u0273\3\2\2\2\u0274\u0275\3\2\2\2\u0275\u049d"+
		"\3\2\2\2\u0276\u0277\7\r\2\2\u0277\u0278\7\u0102\2\2\u0278\u027a\5\u00da"+
		"n\2\u0279\u027b\5,\27\2\u027a\u0279\3\2\2\2\u027a\u027b\3\2\2\2\u027b"+
		"\u027c\3\2\2\2\u027c\u027d\7\u00d8\2\2\u027d\u027e\7-\2\2\u027e\u027f"+
		"\7\4\2\2\u027f\u0280\5\u011c\u008f\2\u0280\u0281\7\5\2\2\u0281\u049d\3"+
		"\2\2\2\u0282\u0283\7\r\2\2\u0283\u0284\7\u0102\2\2\u0284\u0286\5\u00da"+
		"n\2\u0285\u0287\5,\27\2\u0286\u0285\3\2\2\2\u0286\u0287\3\2\2\2\u0287"+
		"\u0288\3\2\2\2\u0288\u0289\7\u00ef\2\2\u0289\u028a\7\u00ec\2\2\u028a\u028e"+
		"\5\u0152\u00aa\2\u028b\u028c\7\u012f\2\2\u028c\u028d\7\u00ed\2\2\u028d"+
		"\u028f\5@!\2\u028e\u028b\3\2\2\2\u028e\u028f\3\2\2\2\u028f\u049d\3\2\2"+
		"\2\u0290\u0291\7\r\2\2\u0291\u0292\7\u0102\2\2\u0292\u0294\5\u00dan\2"+
		"\u0293\u0295\5,\27\2\u0294\u0293\3\2\2\2\u0294\u0295\3\2\2\2\u0295\u0296"+
		"\3\2\2\2\u0296\u0297\7\u00ef\2\2\u0297\u0298\7\u00ed\2\2\u0298\u0299\5"+
		"@!\2\u0299\u049d\3\2\2\2\u029a\u029b\7\r\2\2\u029b\u029c\t\6\2\2\u029c"+
		"\u029d\5\u00dan\2\u029d\u02a1\7\n\2\2\u029e\u029f\7w\2\2\u029f\u02a0\7"+
		"\u00ac\2\2\u02a0\u02a2\7[\2\2\u02a1\u029e\3\2\2\2\u02a1\u02a2\3\2\2\2"+
		"\u02a2\u02a4\3\2\2\2\u02a3\u02a5\5*\26\2\u02a4\u02a3\3\2\2\2\u02a5\u02a6"+
		"\3\2\2\2\u02a6\u02a4\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7\u049d\3\2\2\2\u02a8"+
		"\u02a9\7\r\2\2\u02a9\u02aa\7\u0102\2\2\u02aa\u02ab\5\u00dan\2\u02ab\u02ac"+
		"\5,\27\2\u02ac\u02ad\7\u00d5\2\2\u02ad\u02ae\7\u010e\2\2\u02ae\u02af\5"+
		",\27\2\u02af\u049d\3\2\2\2\u02b0\u02b1\7\r\2\2\u02b1\u02b2\t\6\2\2\u02b2"+
		"\u02b3\5\u00dan\2\u02b3\u02b6\7S\2\2\u02b4\u02b5\7w\2\2\u02b5\u02b7\7"+
		"[\2\2\u02b6\u02b4\3\2\2\2\u02b6\u02b7\3\2\2\2\u02b7\u02b8\3\2\2\2\u02b8"+
		"\u02bd\5,\27\2\u02b9\u02ba\7\6\2\2\u02ba\u02bc\5,\27\2\u02bb\u02b9\3\2"+
		"\2\2\u02bc\u02bf\3\2\2\2\u02bd\u02bb\3\2\2\2\u02bd\u02be\3\2\2\2\u02be"+
		"\u02c1\3\2\2\2\u02bf\u02bd\3\2\2\2\u02c0\u02c2\7\u00cb\2\2\u02c1\u02c0"+
		"\3\2\2\2\u02c1\u02c2\3\2\2\2\u02c2\u049d\3\2\2\2\u02c3\u02c4\7\r\2\2\u02c4"+
		"\u02c5\7\u0102\2\2\u02c5\u02c7\5\u00dan\2\u02c6\u02c8\5,\27\2\u02c7\u02c6"+
		"\3\2\2\2\u02c7\u02c8\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9\u02ca\7\u00ef\2"+
		"\2\u02ca\u02cb\5\"\22\2\u02cb\u049d\3\2\2\2\u02cc\u02cd\7\r\2\2\u02cd"+
		"\u02ce\7\u0102\2\2\u02ce\u02cf\5\u00dan\2\u02cf\u02d0\7\u00d1\2\2\u02d0"+
		"\u02d1\7\u00c0\2\2\u02d1\u049d\3\2\2\2\u02d2\u02d3\7S\2\2\u02d3\u02d6"+
		"\7\u0102\2\2\u02d4\u02d5\7w\2\2\u02d5\u02d7\7[\2\2\u02d6\u02d4\3\2\2\2"+
		"\u02d6\u02d7\3\2\2\2\u02d7\u02d8\3\2\2\2\u02d8\u02da\5\u00dan\2\u02d9"+
		"\u02db\7\u00cb\2\2\u02da\u02d9\3\2\2\2\u02da\u02db\3\2\2\2\u02db\u049d"+
		"\3\2\2\2\u02dc\u02dd\7S\2\2\u02dd\u02e0\7\u0128\2\2\u02de\u02df\7w\2\2"+
		"\u02df\u02e1\7[\2\2\u02e0\u02de\3\2\2\2\u02e0\u02e1\3\2\2\2\u02e1\u02e2"+
		"\3\2\2\2\u02e2\u049d\5\u00dan\2\u02e3\u02e6\7\66\2\2\u02e4\u02e5\7\u00b5"+
		"\2\2\u02e5\u02e7\7\u00d8\2\2\u02e6\u02e4\3\2\2\2\u02e6\u02e7\3\2\2\2\u02e7"+
		"\u02ec\3\2\2\2\u02e8\u02ea\7p\2\2\u02e9\u02e8\3\2\2\2\u02e9\u02ea\3\2"+
		"\2\2\u02ea\u02eb\3\2\2\2\u02eb\u02ed\7\u0107\2\2\u02ec\u02e9\3\2\2\2\u02ec"+
		"\u02ed\3\2\2\2\u02ed\u02ee\3\2\2\2\u02ee\u02f2\7\u0128\2\2\u02ef\u02f0"+
		"\7w\2\2\u02f0\u02f1\7\u00ac\2\2\u02f1\u02f3\7[\2\2\u02f2\u02ef\3\2\2\2"+
		"\u02f2\u02f3\3\2\2\2\u02f3\u02f4\3\2\2\2\u02f4\u02f6\5\u00dan\2\u02f5"+
		"\u02f7\5\u00caf\2\u02f6\u02f5\3\2\2\2\u02f6\u02f7\3\2\2\2\u02f7\u0300"+
		"\3\2\2\2\u02f8\u02ff\5$\23\2\u02f9\u02fa\7\u00bf\2\2\u02fa\u02fb\7\u00b1"+
		"\2\2\u02fb\u02ff\5\u00c0a\2\u02fc\u02fd\7\u0106\2\2\u02fd\u02ff\5@!\2"+
		"\u02fe\u02f8\3\2\2\2\u02fe\u02f9\3\2\2\2\u02fe\u02fc\3\2\2\2\u02ff\u0302"+
		"\3\2\2\2\u0300\u02fe\3\2\2\2\u0300\u0301\3\2\2\2\u0301\u0303\3\2\2\2\u0302"+
		"\u0300\3\2\2\2\u0303\u0304\7\25\2\2\u0304\u0305\5&\24\2\u0305\u049d\3"+
		"\2\2\2\u0306\u0309\7\66\2\2\u0307\u0308\7\u00b5\2\2\u0308\u030a\7\u00d8"+
		"\2\2\u0309\u0307\3\2\2\2\u0309\u030a\3\2\2\2\u030a\u030c\3\2\2\2\u030b"+
		"\u030d\7p\2\2\u030c\u030b\3\2\2\2\u030c\u030d\3\2\2\2\u030d\u030e\3\2"+
		"\2\2\u030e\u030f\7\u0107\2\2\u030f\u0310\7\u0128\2\2\u0310\u0315\5\u00e0"+
		"q\2\u0311\u0312\7\4\2\2\u0312\u0313\5\u0122\u0092\2\u0313\u0314\7\5\2"+
		"\2\u0314\u0316\3\2\2\2\u0315\u0311\3\2\2\2\u0315\u0316\3\2\2\2\u0316\u0317"+
		"\3\2\2\2\u0317\u031a\5<\37\2\u0318\u0319\7\u00b4\2\2\u0319\u031b\5@!\2"+
		"\u031a\u0318\3\2\2\2\u031a\u031b\3\2\2\2\u031b\u049d\3\2\2\2\u031c\u031d"+
		"\7\r\2\2\u031d\u031e\7\u0128\2\2\u031e\u0320\5\u00dan\2\u031f\u0321\7"+
		"\25\2\2\u0320\u031f\3\2\2\2\u0320\u0321\3\2\2\2\u0321\u0322\3\2\2\2\u0322"+
		"\u0323\5&\24\2\u0323\u049d\3\2\2\2\u0324\u0327\7\66\2\2\u0325\u0326\7"+
		"\u00b5\2\2\u0326\u0328\7\u00d8\2\2\u0327\u0325\3\2\2\2\u0327\u0328\3\2"+
		"\2\2\u0328\u032a\3\2\2\2\u0329\u032b\7\u0107\2\2\u032a\u0329\3\2\2\2\u032a"+
		"\u032b\3\2\2\2\u032b\u032c\3\2\2\2\u032c\u0330\7n\2\2\u032d\u032e\7w\2"+
		"\2\u032e\u032f\7\u00ac\2\2\u032f\u0331\7[\2\2\u0330\u032d\3\2\2\2\u0330"+
		"\u0331\3\2\2\2\u0331\u0332\3\2\2\2\u0332\u0333\5\u00dan\2\u0333\u0334"+
		"\7\25\2\2\u0334\u033e\5\u0152\u00aa\2\u0335\u0336\7\u0125\2\2\u0336\u033b"+
		"\5R*\2\u0337\u0338\7\6\2\2\u0338\u033a\5R*\2\u0339\u0337\3\2\2\2\u033a"+
		"\u033d\3\2\2\2\u033b\u0339\3\2\2\2\u033b\u033c\3\2\2\2\u033c\u033f\3\2"+
		"\2\2\u033d\u033b\3\2\2\2\u033e\u0335\3\2\2\2\u033e\u033f\3\2\2\2\u033f"+
		"\u049d\3\2\2\2\u0340\u0342\7S\2\2\u0341\u0343\7\u0107\2\2\u0342\u0341"+
		"\3\2\2\2\u0342\u0343\3\2\2\2\u0343\u0344\3\2\2\2\u0344\u0347\7n\2\2\u0345"+
		"\u0346\7w\2\2\u0346\u0348\7[\2\2\u0347\u0345\3\2\2\2\u0347\u0348\3\2\2"+
		"\2\u0348\u0349\3\2\2\2\u0349\u049d\5\u00dan\2\u034a\u034c\7\\\2\2\u034b"+
		"\u034d\t\b\2\2\u034c\u034b\3\2\2\2\u034c\u034d\3\2\2\2\u034d\u034e\3\2"+
		"\2\2\u034e\u049d\5\20\t\2\u034f\u0350\7\u00f2\2\2\u0350\u0353\7\u0103"+
		"\2\2\u0351\u0352\t\4\2\2\u0352\u0354\5\u00dan\2\u0353\u0351\3\2\2\2\u0353"+
		"\u0354\3\2\2\2\u0354\u0359\3\2\2\2\u0355\u0357\7\u008e\2\2\u0356\u0355"+
		"\3\2\2\2\u0356\u0357\3\2\2\2\u0357\u0358\3\2\2\2\u0358\u035a\5\u0152\u00aa"+
		"\2\u0359\u0356\3\2\2\2\u0359\u035a\3\2\2\2\u035a\u049d\3\2\2\2\u035b\u035c"+
		"\7\u00f2\2\2\u035c\u035d\7\u0102\2\2\u035d\u0360\7^\2\2\u035e\u035f\t"+
		"\4\2\2\u035f\u0361\5\u00dan\2\u0360\u035e\3\2\2\2\u0360\u0361\3\2\2\2"+
		"\u0361\u0362\3\2\2\2\u0362\u0363\7\u008e\2\2\u0363\u0365\5\u0152\u00aa"+
		"\2\u0364\u0366\5,\27\2\u0365\u0364\3\2\2\2\u0365\u0366\3\2\2\2\u0366\u049d"+
		"\3\2\2\2\u0367\u0368\7\u00f2\2\2\u0368\u0369\7\u0106\2\2\u0369\u036e\5"+
		"\u00dan\2\u036a\u036b\7\4\2\2\u036b\u036c\5D#\2\u036c\u036d\7\5\2\2\u036d"+
		"\u036f\3\2\2\2\u036e\u036a\3\2\2\2\u036e\u036f\3\2\2\2\u036f\u049d\3\2"+
		"\2\2\u0370\u0371\7\u00f2\2\2\u0371\u0372\7-\2\2\u0372\u0373\t\4\2\2\u0373"+
		"\u0376\5\u00dan\2\u0374\u0375\t\4\2\2\u0375\u0377\5\u00dan\2\u0376\u0374"+
		"\3\2\2\2\u0376\u0377\3\2\2\2\u0377\u049d\3\2\2\2\u0378\u0379\7\u00f2\2"+
		"\2\u0379\u037c\7\u0129\2\2\u037a\u037b\t\4\2\2\u037b\u037d\5\u00dan\2"+
		"\u037c\u037a\3\2\2\2\u037c\u037d\3\2\2\2\u037d\u0382\3\2\2\2\u037e\u0380"+
		"\7\u008e\2\2\u037f\u037e\3\2\2\2\u037f\u0380\3\2\2\2\u0380\u0381\3\2\2"+
		"\2\u0381\u0383\5\u0152\u00aa\2\u0382\u037f\3\2\2\2\u0382\u0383\3\2\2\2"+
		"\u0383\u049d\3\2\2\2\u0384\u0385\7\u00f2\2\2\u0385\u0386\7\u00c0\2\2\u0386"+
		"\u0388\5\u00dan\2\u0387\u0389\5,\27\2\u0388\u0387\3\2\2\2\u0388\u0389"+
		"\3\2\2\2\u0389\u049d\3\2\2\2\u038a\u038c\7\u00f2\2\2\u038b\u038d\5\u0146"+
		"\u00a4\2\u038c\u038b\3\2\2\2\u038c\u038d\3\2\2\2\u038d\u038e\3\2\2\2\u038e"+
		"\u0391\7o\2\2\u038f\u0390\t\4\2\2\u0390\u0392\5\u00dan\2\u0391\u038f\3"+
		"\2\2\2\u0391\u0392\3\2\2\2\u0392\u039a\3\2\2\2\u0393\u0395\7\u008e\2\2"+
		"\u0394\u0393\3\2\2\2\u0394\u0395\3\2\2\2\u0395\u0398\3\2\2\2\u0396\u0399"+
		"\5\u00dan\2\u0397\u0399\5\u0152\u00aa\2\u0398\u0396\3\2\2\2\u0398\u0397"+
		"\3\2\2\2\u0399\u039b\3\2\2\2\u039a\u0394\3\2\2\2\u039a\u039b\3\2\2\2\u039b"+
		"\u049d\3\2\2\2\u039c\u039d\7\u00f2\2\2\u039d\u039e\7\66\2\2\u039e\u039f"+
		"\7\u0102\2\2\u039f\u03a2\5\u00dan\2\u03a0\u03a1\7\25\2\2\u03a1\u03a3\7"+
		"\u00ec\2\2\u03a2\u03a0\3\2\2\2\u03a2\u03a3\3\2\2\2\u03a3\u049d\3\2\2\2"+
		"\u03a4\u03a5\7\u00f2\2\2\u03a5\u03a6\79\2\2\u03a6\u049d\5\60\31\2\u03a7"+
		"\u03a8\7\u00f2\2\2\u03a8\u03ad\7#\2\2\u03a9\u03ab\7\u008e\2\2\u03aa\u03a9"+
		"\3\2\2\2\u03aa\u03ab\3\2\2\2\u03ab\u03ac\3\2\2\2\u03ac\u03ae\5\u0152\u00aa"+
		"\2\u03ad\u03aa\3\2\2\2\u03ad\u03ae\3\2\2\2\u03ae\u049d\3\2\2\2\u03af\u03b0"+
		"\t\t\2\2\u03b0\u03b2\7n\2\2\u03b1\u03b3\7^\2\2\u03b2\u03b1\3\2\2\2\u03b2"+
		"\u03b3\3\2\2\2\u03b3\u03b4\3\2\2\2\u03b4\u049d\5\64\33\2\u03b5\u03b6\t"+
		"\t\2\2\u03b6\u03b8\5\60\31\2\u03b7\u03b9\7^\2\2\u03b8\u03b7\3\2\2\2\u03b8"+
		"\u03b9\3\2\2\2\u03b9\u03ba\3\2\2\2\u03ba\u03bb\5\u00dan\2\u03bb\u049d"+
		"\3\2\2\2\u03bc\u03be\t\t\2\2\u03bd\u03bf\7\u0102\2\2\u03be\u03bd\3\2\2"+
		"\2\u03be\u03bf\3\2\2\2\u03bf\u03c1\3\2\2\2\u03c0\u03c2\t\n\2\2\u03c1\u03c0"+
		"\3\2\2\2\u03c1\u03c2\3\2\2\2\u03c2\u03c3\3\2\2\2\u03c3\u03c5\5\u00dan"+
		"\2\u03c4\u03c6\5,\27\2\u03c5\u03c4\3\2\2\2\u03c5\u03c6\3\2\2\2\u03c6\u03c8"+
		"\3\2\2\2\u03c7\u03c9\5\66\34\2\u03c8\u03c7\3\2\2\2\u03c8\u03c9\3\2\2\2"+
		"\u03c9\u049d\3\2\2\2\u03ca\u03cc\t\t\2\2\u03cb\u03cd\7\u00cd\2\2\u03cc"+
		"\u03cb\3\2\2\2\u03cc\u03cd\3\2\2\2\u03cd\u03ce\3\2\2\2\u03ce\u049d\5&"+
		"\24\2\u03cf\u03d0\7.\2\2\u03d0\u03d1\7\u00b1\2\2\u03d1\u03d2\5\60\31\2"+
		"\u03d2\u03d3\5\u00dan\2\u03d3\u03d4\7\u0085\2\2\u03d4\u03d5\5\u0154\u00ab"+
		"\2\u03d5\u049d\3\2\2\2\u03d6\u03d7\7.\2\2\u03d7\u03d8\7\u00b1\2\2\u03d8"+
		"\u03d9\7\u0102\2\2\u03d9\u03da\5\u00dan\2\u03da\u03db\7\u0085\2\2\u03db"+
		"\u03dc\5\u0154\u00ab\2\u03dc\u049d\3\2\2\2\u03dd\u03de\7\u00d4\2\2\u03de"+
		"\u03df\7\u0102\2\2\u03df\u049d\5\u00dan\2\u03e0\u03e1\7\u00d4\2\2\u03e1"+
		"\u03e2\7n\2\2\u03e2\u049d\5\u00dan\2\u03e3\u03eb\7\u00d4\2\2\u03e4\u03ec"+
		"\5\u0152\u00aa\2\u03e5\u03e7\13\2\2\2\u03e6\u03e5\3\2\2\2\u03e7\u03ea"+
		"\3\2\2\2\u03e8\u03e9\3\2\2\2\u03e8\u03e6\3\2\2\2\u03e9\u03ec\3\2\2\2\u03ea"+
		"\u03e8\3\2\2\2\u03eb\u03e4\3\2\2\2\u03eb\u03e8\3\2\2\2\u03ec\u049d\3\2"+
		"\2\2\u03ed\u03ef\7\36\2\2\u03ee\u03f0\7\u008b\2\2\u03ef\u03ee\3\2\2\2"+
		"\u03ef\u03f0\3\2\2\2\u03f0\u03f1\3\2\2\2\u03f1\u03f2\7\u0102\2\2\u03f2"+
		"\u03f5\5\u00dan\2\u03f3\u03f4\7\u00b4\2\2\u03f4\u03f6\5@!\2\u03f5\u03f3"+
		"\3\2\2\2\u03f5\u03f6\3\2\2\2\u03f6\u03fb\3\2\2\2\u03f7\u03f9\7\25\2\2"+
		"\u03f8\u03f7\3\2\2\2\u03f8\u03f9\3\2\2\2\u03f9\u03fa\3\2\2\2\u03fa\u03fc"+
		"\5&\24\2\u03fb\u03f8\3\2\2\2\u03fb\u03fc\3\2\2\2\u03fc\u049d\3\2\2\2\u03fd"+
		"\u03fe\7\u011b\2\2\u03fe\u0401\7\u0102\2\2\u03ff\u0400\7w\2\2\u0400\u0402"+
		"\7[\2\2\u0401\u03ff\3\2\2\2\u0401\u0402\3\2\2\2\u0402\u0403\3\2\2\2\u0403"+
		"\u049d\5\u00dan\2\u0404\u0405\7&\2\2\u0405\u049d\7\36\2\2\u0406\u0407"+
		"\7\u0093\2\2\u0407\u0409\7A\2\2\u0408\u040a\7\u0094\2\2\u0409\u0408\3"+
		"\2\2\2\u0409\u040a\3\2\2\2\u040a\u040b\3\2\2\2\u040b\u040c\7\177\2\2\u040c"+
		"\u040e\5\u0152\u00aa\2\u040d\u040f\7\u00bd\2\2\u040e\u040d\3\2\2\2\u040e"+
		"\u040f\3\2\2\2\u040f\u0410\3\2\2\2\u0410\u0411\7\u0084\2\2\u0411\u0412"+
		"\7\u0102\2\2\u0412\u0414\5\u00dan\2\u0413\u0415\5,\27\2\u0414\u0413\3"+
		"\2\2\2\u0414\u0415\3\2\2\2\u0415\u049d\3\2\2\2\u0416\u0417\7\u0116\2\2"+
		"\u0417\u0418\7\u0102\2\2\u0418\u041a\5\u00dan\2\u0419\u041b\5,\27\2\u041a"+
		"\u0419\3\2\2\2\u041a\u041b\3\2\2\2\u041b\u049d\3\2\2\2\u041c\u041e\7\u00a5"+
		"\2\2\u041d\u041c\3\2\2\2\u041d\u041e\3\2\2\2\u041e\u041f\3\2\2\2\u041f"+
		"\u0420\7\u00d6\2\2\u0420\u0421\7\u0102\2\2\u0421\u0424\5\u00dan\2\u0422"+
		"\u0423\t\13\2\2\u0423\u0425\7\u00c0\2\2\u0424\u0422\3\2\2\2\u0424\u0425"+
		"\3\2\2\2\u0425\u049d\3\2\2\2\u0426\u0427\t\f\2\2\u0427\u042b\5\u0146\u00a4"+
		"\2\u0428\u042a\13\2\2\2\u0429\u0428\3\2\2\2\u042a\u042d\3\2\2\2\u042b"+
		"\u042c\3\2\2\2\u042b\u0429\3\2\2\2\u042c\u049d\3\2\2\2\u042d\u042b\3\2"+
		"\2\2\u042e\u042f\7\u00ef\2\2\u042f\u0433\7\u00df\2\2\u0430\u0432\13\2"+
		"\2\2\u0431\u0430\3\2\2\2\u0432\u0435\3\2\2\2\u0433\u0434\3\2\2\2\u0433"+
		"\u0431\3\2\2\2\u0434\u049d\3\2\2\2\u0435\u0433\3\2\2\2\u0436\u0437\7\u00ef"+
		"\2\2\u0437\u0438\7\u010a\2\2\u0438\u0439\7\u0133\2\2\u0439\u049d\5\u0108"+
		"\u0085\2\u043a\u043b\7\u00ef\2\2\u043b\u043c\7\u010a\2\2\u043c\u043d\7"+
		"\u0133\2\2\u043d\u049d\5\22\n\2\u043e\u043f\7\u00ef\2\2\u043f\u0440\7"+
		"\u010a\2\2\u0440\u0444\7\u0133\2\2\u0441\u0443\13\2\2\2\u0442\u0441\3"+
		"\2\2\2\u0443\u0446\3\2\2\2\u0444\u0445\3\2\2\2\u0444\u0442\3\2\2\2\u0445"+
		"\u049d\3\2\2\2\u0446\u0444\3\2\2\2\u0447\u0448\7\u00ef\2\2\u0448\u0449"+
		"\5\24\13\2\u0449\u044a\7\u0135\2\2\u044a\u044b\5\26\f\2\u044b\u049d\3"+
		"\2\2\2\u044c\u044d\7\u00ef\2\2\u044d\u0455\5\24\13\2\u044e\u0452\7\u0135"+
		"\2\2\u044f\u0451\13\2\2\2\u0450\u044f\3\2\2\2\u0451\u0454\3\2\2\2\u0452"+
		"\u0453\3\2\2\2\u0452\u0450\3\2\2\2\u0453\u0456\3\2\2\2\u0454\u0452\3\2"+
		"\2\2\u0455\u044e\3\2\2\2\u0455\u0456\3\2\2\2\u0456\u049d\3\2\2\2\u0457"+
		"\u045b\7\u00ef\2\2\u0458\u045a\13\2\2\2\u0459\u0458\3\2\2\2\u045a\u045d"+
		"\3\2\2\2\u045b\u045c\3\2\2\2\u045b\u0459\3\2\2\2\u045c\u045e\3\2\2\2\u045d"+
		"\u045b\3\2\2\2\u045e\u045f\7\u0135\2\2\u045f\u049d\5\26\f\2\u0460\u0464"+
		"\7\u00ef\2\2\u0461\u0463\13\2\2\2\u0462\u0461\3\2\2\2\u0463\u0466\3\2"+
		"\2\2\u0464\u0465\3\2\2\2\u0464\u0462\3\2\2\2\u0465\u049d\3\2\2\2\u0466"+
		"\u0464\3\2\2\2\u0467\u0468\7\u00d9\2\2\u0468\u049d\5\24\13\2\u0469\u046d"+
		"\7\u00d9\2\2\u046a\u046c\13\2\2\2\u046b\u046a\3\2\2\2\u046c\u046f\3\2"+
		"\2\2\u046d\u046e\3\2\2\2\u046d\u046b\3\2\2\2\u046e\u049d\3\2\2\2\u046f"+
		"\u046d\3\2\2\2\u0470\u0471\7\66\2\2\u0471\u0475\7|\2\2\u0472\u0473\7w"+
		"\2\2\u0473\u0474\7\u00ac\2\2\u0474\u0476\7[\2\2\u0475\u0472\3\2\2\2\u0475"+
		"\u0476\3\2\2\2\u0476\u0477\3\2\2\2\u0477\u0478\5\u0146\u00a4\2\u0478\u047a"+
		"\7\u00b1\2\2\u0479\u047b\7\u0102\2\2\u047a\u0479\3\2\2\2\u047a\u047b\3"+
		"\2\2\2\u047b\u047c\3\2\2\2\u047c\u047f\5\u00dan\2\u047d\u047e\7\u0125"+
		"\2\2\u047e\u0480\5\u0146\u00a4\2\u047f\u047d\3\2\2\2\u047f\u0480\3\2\2"+
		"\2\u0480\u0481\3\2\2\2\u0481\u0482\7\4\2\2\u0482\u0483\5\u00dco\2\u0483"+
		"\u0486\7\5\2\2\u0484\u0485\7\u00b4\2\2\u0485\u0487\5@!\2\u0486\u0484\3"+
		"\2\2\2\u0486\u0487\3\2\2\2\u0487\u049d\3\2\2\2\u0488\u0489\7S\2\2\u0489"+
		"\u048c\7|\2\2\u048a\u048b\7w\2\2\u048b\u048d\7[\2\2\u048c\u048a\3\2\2"+
		"\2\u048c\u048d\3\2\2\2\u048d\u048e\3\2\2\2\u048e\u048f\5\u0146\u00a4\2"+
		"\u048f\u0491\7\u00b1\2\2\u0490\u0492\7\u0102\2\2\u0491\u0490\3\2\2\2\u0491"+
		"\u0492\3\2\2\2\u0492\u0493\3\2\2\2\u0493\u0494\5\u00dan\2\u0494\u049d"+
		"\3\2\2\2\u0495\u0499\5\30\r\2\u0496\u0498\13\2\2\2\u0497\u0496\3\2\2\2"+
		"\u0498\u049b\3\2\2\2\u0499\u049a\3\2\2\2\u0499\u0497\3\2\2\2\u049a\u049d"+
		"\3\2\2\2\u049b\u0499\3\2\2\2\u049c\u0179\3\2\2\2\u049c\u017b\3\2\2\2\u049c"+
		"\u017e\3\2\2\2\u049c\u0180\3\2\2\2\u049c\u0184\3\2\2\2\u049c\u018a\3\2"+
		"\2\2\u049c\u019c\3\2\2\2\u049c\u01a3\3\2\2\2\u049c\u01a9\3\2\2\2\u049c"+
		"\u01b3\3\2\2\2\u049c\u01bf\3\2\2\2\u049c\u01d0\3\2\2\2\u049c\u01e5\3\2"+
		"\2\2\u049c\u01f6\3\2\2\2\u049c\u0207\3\2\2\2\u049c\u0212\3\2\2\2\u049c"+
		"\u0219\3\2\2\2\u049c\u0222\3\2\2\2\u049c\u022b\3\2\2\2\u049c\u0238\3\2"+
		"\2\2\u049c\u0243\3\2\2\2\u049c\u024a\3\2\2\2\u049c\u0251\3\2\2\2\u049c"+
		"\u025c\3\2\2\2\u049c\u0267\3\2\2\2\u049c\u0276\3\2\2\2\u049c\u0282\3\2"+
		"\2\2\u049c\u0290\3\2\2\2\u049c\u029a\3\2\2\2\u049c\u02a8\3\2\2\2\u049c"+
		"\u02b0\3\2\2\2\u049c\u02c3\3\2\2\2\u049c\u02cc\3\2\2\2\u049c\u02d2\3\2"+
		"\2\2\u049c\u02dc\3\2\2\2\u049c\u02e3\3\2\2\2\u049c\u0306\3\2\2\2\u049c"+
		"\u031c\3\2\2\2\u049c\u0324\3\2\2\2\u049c\u0340\3\2\2\2\u049c\u034a\3\2"+
		"\2\2\u049c\u034f\3\2\2\2\u049c\u035b\3\2\2\2\u049c\u0367\3\2\2\2\u049c"+
		"\u0370\3\2\2\2\u049c\u0378\3\2\2\2\u049c\u0384\3\2\2\2\u049c\u038a\3\2"+
		"\2\2\u049c\u039c\3\2\2\2\u049c\u03a4\3\2\2\2\u049c\u03a7\3\2\2\2\u049c"+
		"\u03af\3\2\2\2\u049c\u03b5\3\2\2\2\u049c\u03bc\3\2\2\2\u049c\u03ca\3\2"+
		"\2\2\u049c\u03cf\3\2\2\2\u049c\u03d6\3\2\2\2\u049c\u03dd\3\2\2\2\u049c"+
		"\u03e0\3\2\2\2\u049c\u03e3\3\2\2\2\u049c\u03ed\3\2\2\2\u049c\u03fd\3\2"+
		"\2\2\u049c\u0404\3\2\2\2\u049c\u0406\3\2\2\2\u049c\u0416\3\2\2\2\u049c"+
		"\u041d\3\2\2\2\u049c\u0426\3\2\2\2\u049c\u042e\3\2\2\2\u049c\u0436\3\2"+
		"\2\2\u049c\u043a\3\2\2\2\u049c\u043e\3\2\2\2\u049c\u0447\3\2\2\2\u049c"+
		"\u044c\3\2\2\2\u049c\u0457\3\2\2\2\u049c\u0460\3\2\2\2\u049c\u0467\3\2"+
		"\2\2\u049c\u0469\3\2\2\2\u049c\u0470\3\2\2\2\u049c\u0488\3\2\2\2\u049c"+
		"\u0495\3\2\2\2\u049d\21\3\2\2\2\u049e\u04a1\5\u0152\u00aa\2\u049f\u04a1"+
		"\7\u0094\2\2\u04a0\u049e\3\2\2\2\u04a0\u049f\3\2\2\2\u04a1\23\3\2\2\2"+
		"\u04a2\u04a3\5\u014a\u00a6\2\u04a3\25\3\2\2\2\u04a4\u04a5\5\u014c\u00a7"+
		"\2\u04a5\27\3\2\2\2\u04a6\u04a7\7\66\2\2\u04a7\u054f\7\u00df\2\2\u04a8"+
		"\u04a9\7S\2\2\u04a9\u054f\7\u00df\2\2\u04aa\u04ac\7q\2\2\u04ab\u04ad\7"+
		"\u00df\2\2\u04ac\u04ab\3\2\2\2\u04ac\u04ad\3\2\2\2\u04ad\u054f\3\2\2\2"+
		"\u04ae\u04b0\7\u00dc\2\2\u04af\u04b1\7\u00df\2\2\u04b0\u04af\3\2\2\2\u04b0"+
		"\u04b1\3\2\2\2\u04b1\u054f\3\2\2\2\u04b2\u04b3\7\u00f2\2\2\u04b3\u054f"+
		"\7q\2\2\u04b4\u04b5\7\u00f2\2\2\u04b5\u04b7\7\u00df\2\2\u04b6\u04b8\7"+
		"q\2\2\u04b7\u04b6\3\2\2\2\u04b7\u04b8\3\2\2\2\u04b8\u054f\3\2\2\2\u04b9"+
		"\u04ba\7\u00f2\2\2\u04ba\u054f\7\u00c9\2\2\u04bb\u04bc\7\u00f2\2\2\u04bc"+
		"\u054f\7\u00e0\2\2\u04bd\u04be\7\u00f2\2\2\u04be\u04bf\79\2\2\u04bf\u054f"+
		"\7\u00e0\2\2\u04c0\u04c1\7]\2\2\u04c1\u054f\7\u0102\2\2\u04c2\u04c3\7"+
		"y\2\2\u04c3\u054f\7\u0102\2\2\u04c4\u04c5\7\u00f2\2\2\u04c5\u054f\7\61"+
		"\2\2\u04c6\u04c7\7\u00f2\2\2\u04c7\u04c8\7\66\2\2\u04c8\u054f\7\u0102"+
		"\2\2\u04c9\u04ca\7\u00f2\2\2\u04ca\u054f\7\u0112\2\2\u04cb\u04cc\7\u00f2"+
		"\2\2\u04cc\u054f\7}\2\2\u04cd\u04ce\7\u00f2\2\2\u04ce\u054f\7\u0097\2"+
		"\2\u04cf\u04d0\7\66\2\2\u04d0\u054f\7|\2\2\u04d1\u04d2\7S\2\2\u04d2\u054f"+
		"\7|\2\2\u04d3\u04d4\7\r\2\2\u04d4\u054f\7|\2\2\u04d5\u04d6\7\u0096\2\2"+
		"\u04d6\u054f\7\u0102\2\2\u04d7\u04d8\7\u0096\2\2\u04d8\u054f\7B\2\2\u04d9"+
		"\u04da\7\u011f\2\2\u04da\u054f\7\u0102\2\2\u04db\u04dc\7\u011f\2\2\u04dc"+
		"\u054f\7B\2\2\u04dd\u04de\7\66\2\2\u04de\u04df\7\u0107\2\2\u04df\u054f"+
		"\7\u0099\2\2\u04e0\u04e1\7S\2\2\u04e1\u04e2\7\u0107\2\2\u04e2\u054f\7"+
		"\u0099\2\2\u04e3\u04e4\7\r\2\2\u04e4\u04e5\7\u0102\2\2\u04e5\u04e6\5\u00e0"+
		"q\2\u04e6\u04e7\7\u00ac\2\2\u04e7\u04e8\7(\2\2\u04e8\u054f\3\2\2\2\u04e9"+
		"\u04ea\7\r\2\2\u04ea\u04eb\7\u0102\2\2\u04eb\u04ec\5\u00e0q\2\u04ec\u04ed"+
		"\7(\2\2\u04ed\u04ee\7\35\2\2\u04ee\u054f\3\2\2\2\u04ef\u04f0\7\r\2\2\u04f0"+
		"\u04f1\7\u0102\2\2\u04f1\u04f2\5\u00e0q\2\u04f2\u04f3\7\u00ac\2\2\u04f3"+
		"\u04f4\7\u00f6\2\2\u04f4\u054f\3\2\2\2\u04f5\u04f6\7\r\2\2\u04f6\u04f7"+
		"\7\u0102\2\2\u04f7\u04f8\5\u00e0q\2\u04f8\u04f9\7\u00f3\2\2\u04f9\u04fa"+
		"\7\35\2\2\u04fa\u054f\3\2\2\2\u04fb\u04fc\7\r\2\2\u04fc\u04fd\7\u0102"+
		"\2\2\u04fd\u04fe\5\u00e0q\2\u04fe\u04ff\7\u00ac\2\2\u04ff\u0500\7\u00f3"+
		"\2\2\u0500\u054f\3\2\2\2\u0501\u0502\7\r\2\2\u0502\u0503\7\u0102\2\2\u0503"+
		"\u0504\5\u00e0q\2\u0504\u0505\7\u00ac\2\2\u0505\u0506\7\u00fa\2\2\u0506"+
		"\u0507\7\25\2\2\u0507\u0508\7N\2\2\u0508\u054f\3\2\2\2\u0509\u050a\7\r"+
		"\2\2\u050a\u050b\7\u0102\2\2\u050b\u050c\5\u00e0q\2\u050c\u050d\7\u00ef"+
		"\2\2\u050d\u050e\7\u00f3\2\2\u050e\u050f\7\u0095\2\2\u050f\u054f\3\2\2"+
		"\2\u0510\u0511\7\r\2\2\u0511\u0512\7\u0102\2\2\u0512\u0513\5\u00e0q\2"+
		"\u0513\u0514\7Y\2\2\u0514\u0515\7\u00be\2\2\u0515\u054f\3\2\2\2\u0516"+
		"\u0517\7\r\2\2\u0517\u0518\7\u0102\2\2\u0518\u0519\5\u00e0q\2\u0519\u051a"+
		"\7\23\2\2\u051a\u051b\7\u00be\2\2\u051b\u054f\3\2\2\2\u051c\u051d\7\r"+
		"\2\2\u051d\u051e\7\u0102\2\2\u051e\u051f\5\u00e0q\2\u051f\u0520\7\u0119"+
		"\2\2\u0520\u0521\7\u00be\2\2\u0521\u054f\3\2\2\2\u0522\u0523\7\r\2\2\u0523"+
		"\u0524\7\u0102\2\2\u0524\u0525\5\u00e0q\2\u0525\u0526\7\u010f\2\2\u0526"+
		"\u054f\3\2\2\2\u0527\u0528\7\r\2\2\u0528\u0529\7\u0102\2\2\u0529\u052b"+
		"\5\u00e0q\2\u052a\u052c\5,\27\2\u052b\u052a\3\2\2\2\u052b\u052c\3\2\2"+
		"\2\u052c\u052d\3\2\2\2\u052d\u052e\7\60\2\2\u052e\u054f\3\2\2\2\u052f"+
		"\u0530\7\r\2\2\u0530\u0531\7\u0102\2\2\u0531\u0533\5\u00e0q\2\u0532\u0534"+
		"\5,\27\2\u0533\u0532\3\2\2\2\u0533\u0534\3\2\2\2\u0534\u0535\3\2\2\2\u0535"+
		"\u0536\7\63\2\2\u0536\u054f\3\2\2\2\u0537\u0538\7\r\2\2\u0538\u0539\7"+
		"\u0102\2\2\u0539\u053b\5\u00e0q\2\u053a\u053c\5,\27\2\u053b\u053a\3\2"+
		"\2\2\u053b\u053c\3\2\2\2\u053c\u053d\3\2\2\2\u053d\u053e\7\u00ef\2\2\u053e"+
		"\u053f\7e\2\2\u053f\u054f\3\2\2\2\u0540\u0541\7\r\2\2\u0541\u0542\7\u0102"+
		"\2\2\u0542\u0544\5\u00e0q\2\u0543\u0545\5,\27\2\u0544\u0543\3\2\2\2\u0544"+
		"\u0545\3\2\2\2\u0545\u0546\3\2\2\2\u0546\u0547\7\u00d8\2\2\u0547\u0548"+
		"\7-\2\2\u0548\u054f\3\2\2\2\u0549\u054a\7\u00f8\2\2\u054a\u054f\7\u0111"+
		"\2\2\u054b\u054f\7/\2\2\u054c\u054f\7\u00e1\2\2\u054d\u054f\7M\2\2\u054e"+
		"\u04a6\3\2\2\2\u054e\u04a8\3\2\2\2\u054e\u04aa\3\2\2\2\u054e\u04ae\3\2"+
		"\2\2\u054e\u04b2\3\2\2\2\u054e\u04b4\3\2\2\2\u054e\u04b9\3\2\2\2\u054e"+
		"\u04bb\3\2\2\2\u054e\u04bd\3\2\2\2\u054e\u04c0\3\2\2\2\u054e\u04c2\3\2"+
		"\2\2\u054e\u04c4\3\2\2\2\u054e\u04c6\3\2\2\2\u054e\u04c9\3\2\2\2\u054e"+
		"\u04cb\3\2\2\2\u054e\u04cd\3\2\2\2\u054e\u04cf\3\2\2\2\u054e\u04d1\3\2"+
		"\2\2\u054e\u04d3\3\2\2\2\u054e\u04d5\3\2\2\2\u054e\u04d7\3\2\2\2\u054e"+
		"\u04d9\3\2\2\2\u054e\u04db\3\2\2\2\u054e\u04dd\3\2\2\2\u054e\u04e0\3\2"+
		"\2\2\u054e\u04e3\3\2\2\2\u054e\u04e9\3\2\2\2\u054e\u04ef\3\2\2\2\u054e"+
		"\u04f5\3\2\2\2\u054e\u04fb\3\2\2\2\u054e\u0501\3\2\2\2\u054e\u0509\3\2"+
		"\2\2\u054e\u0510\3\2\2\2\u054e\u0516\3\2\2\2\u054e\u051c\3\2\2\2\u054e"+
		"\u0522\3\2\2\2\u054e\u0527\3\2\2\2\u054e\u052f\3\2\2\2\u054e\u0537\3\2"+
		"\2\2\u054e\u0540\3\2\2\2\u054e\u0549\3\2\2\2\u054e\u054b\3\2\2\2\u054e"+
		"\u054c\3\2\2\2\u054e\u054d\3\2\2\2\u054f\31\3\2\2\2\u0550\u0552\7\66\2"+
		"\2\u0551\u0553\7\u0107\2\2\u0552\u0551\3\2\2\2\u0552\u0553\3\2\2\2\u0553"+
		"\u0555\3\2\2\2\u0554\u0556\7_\2\2\u0555\u0554\3\2\2\2\u0555\u0556\3\2"+
		"\2\2\u0556\u0557\3\2\2\2\u0557\u055b\7\u0102\2\2\u0558\u0559\7w\2\2\u0559"+
		"\u055a\7\u00ac\2\2\u055a\u055c\7[\2\2\u055b\u0558\3\2\2\2\u055b\u055c"+
		"\3\2\2\2\u055c\u055d\3\2\2\2\u055d\u055e\5\u00dan\2\u055e\33\3\2\2\2\u055f"+
		"\u0560\7\66\2\2\u0560\u0562\7\u00b5\2\2\u0561\u055f\3\2\2\2\u0561\u0562"+
		"\3\2\2\2\u0562\u0563\3\2\2\2\u0563\u0564\7\u00d8\2\2\u0564\u0565\7\u0102"+
		"\2\2\u0565\u0566\5\u00dan\2\u0566\35\3\2\2\2\u0567\u0568\7(\2\2\u0568"+
		"\u0569\7\35\2\2\u0569\u056d\5\u00c0a\2\u056a\u056b\7\u00f6\2\2\u056b\u056c"+
		"\7\35\2\2\u056c\u056e\5\u00c6d\2\u056d\u056a\3\2\2\2\u056d\u056e\3\2\2"+
		"\2\u056e\u056f\3\2\2\2\u056f\u0570\7\u0084\2\2\u0570\u0571\7\u0150\2\2"+
		"\u0571\u0572\7\34\2\2\u0572\37\3\2\2\2\u0573\u0574\7\u00f3\2\2\u0574\u0575"+
		"\7\35\2\2\u0575\u0576\5\u00c0a\2\u0576\u0579\7\u00b1\2\2\u0577\u057a\5"+
		"H%\2\u0578\u057a\5J&\2\u0579\u0577\3\2\2\2\u0579\u0578\3\2\2\2\u057a\u057e"+
		"\3\2\2\2\u057b\u057c\7\u00fa\2\2\u057c\u057d\7\25\2\2\u057d\u057f\7N\2"+
		"\2\u057e\u057b\3\2\2\2\u057e\u057f\3\2\2\2\u057f!\3\2\2\2\u0580\u0581"+
		"\7\u0095\2\2\u0581\u0582\5\u0152\u00aa\2\u0582#\3\2\2\2\u0583\u0584\7"+
		".\2\2\u0584\u0585\5\u0152\u00aa\2\u0585%\3\2\2\2\u0586\u0588\58\35\2\u0587"+
		"\u0586\3\2\2\2\u0587\u0588\3\2\2\2\u0588\u0589\3\2\2\2\u0589\u058a\5Z"+
		".\2\u058a\u058b\5V,\2\u058b\'\3\2\2\2\u058c\u058d\7\u0081\2\2\u058d\u058f"+
		"\7\u00bd\2\2\u058e\u0590\7\u0102\2\2\u058f\u058e\3\2\2\2\u058f\u0590\3"+
		"\2\2\2\u0590\u0591\3\2\2\2\u0591\u0598\5\u00dan\2\u0592\u0596\5,\27\2"+
		"\u0593\u0594\7w\2\2\u0594\u0595\7\u00ac\2\2\u0595\u0597\7[\2\2\u0596\u0593"+
		"\3\2\2\2\u0596\u0597\3\2\2\2\u0597\u0599\3\2\2\2\u0598\u0592\3\2\2\2\u0598"+
		"\u0599\3\2\2\2\u0599\u059b\3\2\2\2\u059a\u059c\5\u00c0a\2\u059b\u059a"+
		"\3\2\2\2\u059b\u059c\3\2\2\2\u059c\u05d3\3\2\2\2\u059d\u059e\7\u0081\2"+
		"\2\u059e\u05a0\7\u0084\2\2\u059f\u05a1\7\u0102\2\2\u05a0\u059f\3\2\2\2"+
		"\u05a0\u05a1\3\2\2\2\u05a1\u05a2\3\2\2\2\u05a2\u05a4\5\u00dan\2\u05a3"+
		"\u05a5\5,\27\2\u05a4\u05a3\3\2\2\2\u05a4\u05a5\3\2\2\2\u05a5\u05a9\3\2"+
		"\2\2\u05a6\u05a7\7w\2\2\u05a7\u05a8\7\u00ac\2\2\u05a8\u05aa\7[\2\2\u05a9"+
		"\u05a6\3\2\2\2\u05a9\u05aa\3\2\2\2\u05aa\u05ac\3\2\2\2\u05ab\u05ad\5\u00c0"+
		"a\2\u05ac\u05ab\3\2\2\2\u05ac\u05ad\3\2\2\2\u05ad\u05d3\3\2\2\2\u05ae"+
		"\u05af\7\u0081\2\2\u05af\u05b1\7\u0084\2\2\u05b0\u05b2\7\u0102\2\2\u05b1"+
		"\u05b0\3\2\2\2\u05b1\u05b2\3\2\2\2\u05b2\u05b3\3\2\2\2\u05b3\u05b4\5\u00da"+
		"n\2\u05b4\u05b5\7\u00d8\2\2\u05b5\u05b6\5|?\2\u05b6\u05d3\3\2\2\2\u05b7"+
		"\u05b8\7\u0081\2\2\u05b8\u05ba\7\u00bd\2\2\u05b9\u05bb\7\u0094\2\2\u05ba"+
		"\u05b9\3\2\2\2\u05ba\u05bb\3\2\2\2\u05bb\u05bc\3\2\2\2\u05bc\u05bd\7O"+
		"\2\2\u05bd\u05bf\5\u0152\u00aa\2\u05be\u05c0\5\u00d6l\2\u05bf\u05be\3"+
		"\2\2\2\u05bf\u05c0\3\2\2\2\u05c0\u05c2\3\2\2\2\u05c1\u05c3\5L\'\2\u05c2"+
		"\u05c1\3\2\2\2\u05c2\u05c3\3\2\2\2\u05c3\u05d3\3\2\2\2\u05c4\u05c5\7\u0081"+
		"\2\2\u05c5\u05c7\7\u00bd\2\2\u05c6\u05c8\7\u0094\2\2\u05c7\u05c6\3\2\2"+
		"\2\u05c7\u05c8\3\2\2\2\u05c8\u05c9\3\2\2\2\u05c9\u05cb\7O\2\2\u05ca\u05cc"+
		"\5\u0152\u00aa\2\u05cb\u05ca\3\2\2\2\u05cb\u05cc\3\2\2\2\u05cc\u05cd\3"+
		"\2\2\2\u05cd\u05d0\5<\37\2\u05ce\u05cf\7\u00b4\2\2\u05cf\u05d1\5@!\2\u05d0"+
		"\u05ce\3\2\2\2\u05d0\u05d1\3\2\2\2\u05d1\u05d3\3\2\2\2\u05d2\u058c\3\2"+
		"\2\2\u05d2\u059d\3\2\2\2\u05d2\u05ae\3\2\2\2\u05d2\u05b7\3\2\2\2\u05d2"+
		"\u05c4\3\2\2\2\u05d3)\3\2\2\2\u05d4\u05d6\5,\27\2\u05d5\u05d7\5\"\22\2"+
		"\u05d6\u05d5\3\2\2\2\u05d6\u05d7\3\2\2\2\u05d7+\3\2\2\2\u05d8\u05d9\7"+
		"\u00be\2\2\u05d9\u05da\7\4\2\2\u05da\u05df\5.\30\2\u05db\u05dc\7\6\2\2"+
		"\u05dc\u05de\5.\30\2\u05dd\u05db\3\2\2\2\u05de\u05e1\3\2\2\2\u05df\u05dd"+
		"\3\2\2\2\u05df\u05e0\3\2\2\2\u05e0\u05e2\3\2\2\2\u05e1\u05df\3\2\2\2\u05e2"+
		"\u05e3\7\5\2\2\u05e3-\3\2\2\2\u05e4\u05e7\5\u0146\u00a4\2\u05e5\u05e6"+
		"\7\u0135\2\2\u05e6\u05e8\5\u00fe\u0080\2\u05e7\u05e5\3\2\2\2\u05e7\u05e8"+
		"\3\2\2\2\u05e8\u05ee\3\2\2\2\u05e9\u05ea\5\u0146\u00a4\2\u05ea\u05eb\7"+
		"\u0135\2\2\u05eb\u05ec\7G\2\2\u05ec\u05ee\3\2\2\2\u05ed\u05e4\3\2\2\2"+
		"\u05ed\u05e9\3\2\2\2\u05ee/\3\2\2\2\u05ef\u05f0\t\r\2\2\u05f0\61\3\2\2"+
		"\2\u05f1\u05f2\t\16\2\2\u05f2\63\3\2\2\2\u05f3\u05f9\5\u0140\u00a1\2\u05f4"+
		"\u05f9\5\u0152\u00aa\2\u05f5\u05f9\5\u0100\u0081\2\u05f6\u05f9\5\u0102"+
		"\u0082\2\u05f7\u05f9\5\u0104\u0083\2\u05f8\u05f3\3\2\2\2\u05f8\u05f4\3"+
		"\2\2\2\u05f8\u05f5\3\2\2\2\u05f8\u05f6\3\2\2\2\u05f8\u05f7\3\2\2\2\u05f9"+
		"\65\3\2\2\2\u05fa\u05ff\5\u0146\u00a4\2\u05fb\u05fc\7\7\2\2\u05fc\u05fe"+
		"\5\u0146\u00a4\2\u05fd\u05fb\3\2\2\2\u05fe\u0601\3\2\2\2\u05ff\u05fd\3"+
		"\2\2\2\u05ff\u0600\3\2\2\2\u0600\67\3\2\2\2\u0601\u05ff\3\2\2\2\u0602"+
		"\u0603\7\u012f\2\2\u0603\u0608\5:\36\2\u0604\u0605\7\6\2\2\u0605\u0607"+
		"\5:\36\2\u0606\u0604\3\2\2\2\u0607\u060a\3\2\2\2\u0608\u0606\3\2\2\2\u0608"+
		"\u0609\3\2\2\2\u06099\3\2\2\2\u060a\u0608\3\2\2\2\u060b\u060d\5\u0142"+
		"\u00a2\2\u060c\u060e\5\u00c0a\2\u060d\u060c\3\2\2\2\u060d\u060e\3\2\2"+
		"\2\u060e\u0610\3\2\2\2\u060f\u0611\7\25\2\2\u0610\u060f\3\2\2\2\u0610"+
		"\u0611\3\2\2\2\u0611\u0612\3\2\2\2\u0612\u0613\7\4\2\2\u0613\u0614\5&"+
		"\24\2\u0614\u0615\7\5\2\2\u0615;\3\2\2\2\u0616\u0617\7\u0125\2\2\u0617"+
		"\u0618\5\u00dan\2\u0618=\3\2\2\2\u0619\u061a\7\u00b4\2\2\u061a\u0627\5"+
		"@!\2\u061b\u061c\7\u00bf\2\2\u061c\u061d\7\35\2\2\u061d\u0627\5\u00e8"+
		"u\2\u061e\u0627\5 \21\2\u061f\u0627\5\36\20\2\u0620\u0627\5\u00d6l\2\u0621"+
		"\u0627\5L\'\2\u0622\u0627\5\"\22\2\u0623\u0627\5$\23\2\u0624\u0625\7\u0106"+
		"\2\2\u0625\u0627\5@!\2\u0626\u0619\3\2\2\2\u0626\u061b\3\2\2\2\u0626\u061e"+
		"\3\2\2\2\u0626\u061f\3\2\2\2\u0626\u0620\3\2\2\2\u0626\u0621\3\2\2\2\u0626"+
		"\u0622\3\2\2\2\u0626\u0623\3\2\2\2\u0626\u0624\3\2\2\2\u0627\u062a\3\2"+
		"\2\2\u0628\u0626\3\2\2\2\u0628\u0629\3\2\2\2\u0629?\3\2\2\2\u062a\u0628"+
		"\3\2\2\2\u062b\u062c\7\4\2\2\u062c\u0631\5B\"\2\u062d\u062e\7\6\2\2\u062e"+
		"\u0630\5B\"\2\u062f\u062d\3\2\2\2\u0630\u0633\3\2\2\2\u0631\u062f\3\2"+
		"\2\2\u0631\u0632\3\2\2\2\u0632\u0634\3\2\2\2\u0633\u0631\3\2\2\2\u0634"+
		"\u0635\7\5\2\2\u0635A\3\2\2\2\u0636\u063b\5D#\2\u0637\u0639\7\u0135\2"+
		"\2\u0638\u0637\3\2\2\2\u0638\u0639\3\2\2\2\u0639\u063a\3\2\2\2\u063a\u063c"+
		"\5F$\2\u063b\u0638\3\2\2\2\u063b\u063c\3\2\2\2\u063cC\3\2\2\2\u063d\u0642"+
		"\5\u0146\u00a4\2\u063e\u063f\7\7\2\2\u063f\u0641\5\u0146\u00a4\2\u0640"+
		"\u063e\3\2\2\2\u0641\u0644\3\2\2\2\u0642\u0640\3\2\2\2\u0642\u0643\3\2"+
		"\2\2\u0643\u0647\3\2\2\2\u0644\u0642\3\2\2\2\u0645\u0647\5\u0152\u00aa"+
		"\2\u0646\u063d\3\2\2\2\u0646\u0645\3\2\2\2\u0647E\3\2\2\2\u0648\u064d"+
		"\7\u0150\2\2\u0649\u064d\7\u0152\2\2\u064a\u064d\5\u0106\u0084\2\u064b"+
		"\u064d\5\u0152\u00aa\2\u064c\u0648\3\2\2\2\u064c\u0649\3\2\2\2\u064c\u064a"+
		"\3\2\2\2\u064c\u064b\3\2\2\2\u064dG\3\2\2\2\u064e\u064f\7\4\2\2\u064f"+
		"\u0654\5\u00fe\u0080\2\u0650\u0651\7\6\2\2\u0651\u0653\5\u00fe\u0080\2"+
		"\u0652\u0650\3\2\2\2\u0653\u0656\3\2\2\2\u0654\u0652\3\2\2\2\u0654\u0655"+
		"\3\2\2\2\u0655\u0657\3\2\2\2\u0656\u0654\3\2\2\2\u0657\u0658\7\5\2\2\u0658"+
		"I\3\2\2\2\u0659\u065a\7\4\2\2\u065a\u065f\5H%\2\u065b\u065c\7\6\2\2\u065c"+
		"\u065e\5H%\2\u065d\u065b\3\2\2\2\u065e\u0661\3\2\2\2\u065f\u065d\3\2\2"+
		"\2\u065f\u0660\3\2\2\2\u0660\u0662\3\2\2\2\u0661\u065f\3\2\2\2\u0662\u0663"+
		"\7\5\2\2\u0663K\3\2\2\2\u0664\u0665\7\u00fa\2\2\u0665\u0666\7\25\2\2\u0666"+
		"\u066b\5N(\2\u0667\u0668\7\u00fa\2\2\u0668\u0669\7\35\2\2\u0669\u066b"+
		"\5P)\2\u066a\u0664\3\2\2\2\u066a\u0667\3\2\2\2\u066bM\3\2\2\2\u066c\u066d"+
		"\7\u0080\2\2\u066d\u066e\5\u0152\u00aa\2\u066e\u066f\7\u00b9\2\2\u066f"+
		"\u0670\5\u0152\u00aa\2\u0670\u0673\3\2\2\2\u0671\u0673\5\u0146\u00a4\2"+
		"\u0672\u066c\3\2\2\2\u0672\u0671\3\2\2\2\u0673O\3\2\2\2\u0674\u0678\5"+
		"\u0152\u00aa\2\u0675\u0676\7\u012f\2\2\u0676\u0677\7\u00ed\2\2\u0677\u0679"+
		"\5@!\2\u0678\u0675\3\2\2\2\u0678\u0679\3\2\2\2\u0679Q\3\2\2\2\u067a\u067b"+
		"\5\u0146\u00a4\2\u067b\u067c\5\u0152\u00aa\2\u067cS\3\2\2\2\u067d\u067e"+
		"\5(\25\2\u067e\u067f\5&\24\2\u067f\u06b6\3\2\2\2\u0680\u0682\5\u0084C"+
		"\2\u0681\u0683\5X-\2\u0682\u0681\3\2\2\2\u0683\u0684\3\2\2\2\u0684\u0682"+
		"\3\2\2\2\u0684\u0685\3\2\2\2\u0685\u06b6\3\2\2\2\u0686\u0687\7I\2\2\u0687"+
		"\u0688\7l\2\2\u0688\u0689\5\u00dan\2\u0689\u068b\5\u00d4k\2\u068a\u068c"+
		"\5|?\2\u068b\u068a\3\2\2\2\u068b\u068c\3\2\2\2\u068c\u06b6\3\2\2\2\u068d"+
		"\u068e\7\u0122\2\2\u068e\u068f\5\u00dan\2\u068f\u0690\5\u00d4k\2\u0690"+
		"\u0692\5j\66\2\u0691\u0693\5|?\2\u0692\u0691\3\2\2\2\u0692\u0693\3\2\2"+
		"\2\u0693\u06b6\3\2\2\2\u0694\u0695\7\u009c\2\2\u0695\u0696\7\u0084\2\2"+
		"\u0696\u0697\5\u00dan\2\u0697\u0698\5\u00d4k\2\u0698\u069e\7\u0125\2\2"+
		"\u0699\u069f\5\u00dan\2\u069a\u069b\7\4\2\2\u069b\u069c\5&\24\2\u069c"+
		"\u069d\7\5\2\2\u069d\u069f\3\2\2\2\u069e\u0699\3\2\2\2\u069e\u069a\3\2"+
		"\2\2\u069f\u06a0\3\2\2\2\u06a0\u06a1\5\u00d4k\2\u06a1\u06a2\7\u00b1\2"+
		"\2\u06a2\u06a6\5\u00f4{\2\u06a3\u06a5\5l\67\2\u06a4\u06a3\3\2\2\2\u06a5"+
		"\u06a8\3\2\2\2\u06a6\u06a4\3\2\2\2\u06a6\u06a7\3\2\2\2\u06a7\u06ac\3\2"+
		"\2\2\u06a8\u06a6\3\2\2\2\u06a9\u06ab\5n8\2\u06aa\u06a9\3\2\2\2\u06ab\u06ae"+
		"\3\2\2\2\u06ac\u06aa\3\2\2\2\u06ac\u06ad\3\2\2\2\u06ad\u06b2\3\2\2\2\u06ae"+
		"\u06ac\3\2\2\2\u06af\u06b1\5p9\2\u06b0\u06af\3\2\2\2\u06b1\u06b4\3\2\2"+
		"\2\u06b2\u06b0\3\2\2\2\u06b2\u06b3\3\2\2\2\u06b3\u06b6\3\2\2\2\u06b4\u06b2"+
		"\3\2\2\2\u06b5\u067d\3\2\2\2\u06b5\u0680\3\2\2\2\u06b5\u0686\3\2\2\2\u06b5"+
		"\u068d\3\2\2\2\u06b5\u0694\3\2\2\2\u06b6U\3\2\2\2\u06b7\u06b8\7\u00b6"+
		"\2\2\u06b8\u06b9\7\35\2\2\u06b9\u06be\5^\60\2\u06ba\u06bb\7\6\2\2\u06bb"+
		"\u06bd\5^\60\2\u06bc\u06ba\3\2\2\2\u06bd\u06c0\3\2\2\2\u06be\u06bc\3\2"+
		"\2\2\u06be\u06bf\3\2\2\2\u06bf\u06c2\3\2\2\2\u06c0\u06be\3\2\2\2\u06c1"+
		"\u06b7\3\2\2\2\u06c1\u06c2\3\2\2\2\u06c2\u06cd\3\2\2\2\u06c3\u06c4\7\'"+
		"\2\2\u06c4\u06c5\7\35\2\2\u06c5\u06ca\5\u00f0y\2\u06c6\u06c7\7\6\2\2\u06c7"+
		"\u06c9\5\u00f0y\2\u06c8\u06c6\3\2\2\2\u06c9\u06cc\3\2\2\2\u06ca\u06c8"+
		"\3\2\2\2\u06ca\u06cb\3\2\2\2\u06cb\u06ce\3\2\2\2\u06cc\u06ca\3\2\2\2\u06cd"+
		"\u06c3\3\2\2\2\u06cd\u06ce\3\2\2\2\u06ce\u06d9\3\2\2\2\u06cf\u06d0\7Q"+
		"\2\2\u06d0\u06d1\7\35\2\2\u06d1\u06d6\5\u00f0y\2\u06d2\u06d3\7\6\2\2\u06d3"+
		"\u06d5\5\u00f0y\2\u06d4\u06d2\3\2\2\2\u06d5\u06d8\3\2\2\2\u06d6\u06d4"+
		"\3\2\2\2\u06d6\u06d7\3\2\2\2\u06d7\u06da\3\2\2\2\u06d8\u06d6\3\2\2\2\u06d9"+
		"\u06cf\3\2\2\2\u06d9\u06da\3\2\2\2\u06da\u06e5\3\2\2\2\u06db\u06dc\7\u00f5"+
		"\2\2\u06dc\u06dd\7\35\2\2\u06dd\u06e2\5^\60\2\u06de\u06df\7\6\2\2\u06df"+
		"\u06e1\5^\60\2\u06e0\u06de\3\2\2\2\u06e1\u06e4\3\2\2\2\u06e2\u06e0\3\2"+
		"\2\2\u06e2\u06e3\3\2\2\2\u06e3\u06e6\3\2\2\2\u06e4\u06e2\3\2\2\2\u06e5"+
		"\u06db\3\2\2\2\u06e5\u06e6\3\2\2\2\u06e6\u06e8\3\2\2\2\u06e7\u06e9\5\u0132"+
		"\u009a\2\u06e8\u06e7\3\2\2\2\u06e8\u06e9\3\2\2\2\u06e9\u06ef\3\2\2\2\u06ea"+
		"\u06ed\7\u0090\2\2\u06eb\u06ee\7\f\2\2\u06ec\u06ee\5\u00f0y\2\u06ed\u06eb"+
		"\3\2\2\2\u06ed\u06ec\3\2\2\2\u06ee\u06f0\3\2\2\2\u06ef\u06ea\3\2\2\2\u06ef"+
		"\u06f0\3\2\2\2\u06f0\u06f3\3\2\2\2\u06f1\u06f2\7\u00b0\2\2\u06f2\u06f4"+
		"\5\u00f0y\2\u06f3\u06f1\3\2\2\2\u06f3\u06f4\3\2\2\2\u06f4W\3\2\2\2\u06f5"+
		"\u06f6\5(\25\2\u06f6\u06f7\5b\62\2\u06f7Y\3\2\2\2\u06f8\u06f9\b.\1\2\u06f9"+
		"\u06fa\5\\/\2\u06fa\u0712\3\2\2\2\u06fb\u06fc\f\5\2\2\u06fc\u06fd\6.\3"+
		"\2\u06fd\u06ff\t\17\2\2\u06fe\u0700\5\u00b0Y\2\u06ff\u06fe\3\2\2\2\u06ff"+
		"\u0700\3\2\2\2\u0700\u0701\3\2\2\2\u0701\u0711\5Z.\6\u0702\u0703\f\4\2"+
		"\2\u0703\u0704\6.\5\2\u0704\u0706\7\u0082\2\2\u0705\u0707\5\u00b0Y\2\u0706"+
		"\u0705\3\2\2\2\u0706\u0707\3\2\2\2\u0707\u0708\3\2\2\2\u0708\u0711\5Z"+
		".\5\u0709\u070a\f\3\2\2\u070a\u070b\6.\7\2\u070b\u070d\t\20\2\2\u070c"+
		"\u070e\5\u00b0Y\2\u070d\u070c\3\2\2\2\u070d\u070e\3\2\2\2\u070e\u070f"+
		"\3\2\2\2\u070f\u0711\5Z.\4\u0710\u06fb\3\2\2\2\u0710\u0702\3\2\2\2\u0710"+
		"\u0709\3\2\2\2\u0711\u0714\3\2\2\2\u0712\u0710\3\2\2\2\u0712\u0713\3\2"+
		"\2\2\u0713[\3\2\2\2\u0714\u0712\3\2\2\2\u0715\u071f\5d\63\2\u0716\u071f"+
		"\5`\61\2\u0717\u0718\7\u0102\2\2\u0718\u071f\5\u00dan\2\u0719\u071f\5"+
		"\u00d0i\2\u071a\u071b\7\4\2\2\u071b\u071c\5&\24\2\u071c\u071d\7\5\2\2"+
		"\u071d\u071f\3\2\2\2\u071e\u0715\3\2\2\2\u071e\u0716\3\2\2\2\u071e\u0717"+
		"\3\2\2\2\u071e\u0719\3\2\2\2\u071e\u071a\3\2\2\2\u071f]\3\2\2\2\u0720"+
		"\u0722\5\u00f0y\2\u0721\u0723\t\21\2\2\u0722\u0721\3\2\2\2\u0722\u0723"+
		"\3\2\2\2\u0723\u0726\3\2\2\2\u0724\u0725\7\u00ae\2\2\u0725\u0727\t\22"+
		"\2\2\u0726\u0724\3\2\2\2\u0726\u0727\3\2\2\2\u0727_\3\2\2\2\u0728\u072a"+
		"\5\u0084C\2\u0729\u072b\5b\62\2\u072a\u0729\3\2\2\2\u072b\u072c\3\2\2"+
		"\2\u072c\u072a\3\2\2\2\u072c\u072d\3\2\2\2\u072da\3\2\2\2\u072e\u0730"+
		"\5f\64\2\u072f\u0731\5|?\2\u0730\u072f\3\2\2\2\u0730\u0731\3\2\2\2\u0731"+
		"\u0732\3\2\2\2\u0732\u0733\5V,\2\u0733\u074a\3\2\2\2\u0734\u0738\5h\65"+
		"\2\u0735\u0737\5\u00aeX\2\u0736\u0735\3\2\2\2\u0737\u073a\3\2\2\2\u0738"+
		"\u0736\3\2\2\2\u0738\u0739\3\2\2\2\u0739\u073c\3\2\2\2\u073a\u0738\3\2"+
		"\2\2\u073b\u073d\5|?\2\u073c\u073b\3\2\2\2\u073c\u073d\3\2\2\2\u073d\u073f"+
		"\3\2\2\2\u073e\u0740\5\u0088E\2\u073f\u073e\3\2\2\2\u073f\u0740\3\2\2"+
		"\2\u0740\u0742\3\2\2\2\u0741\u0743\5~@\2\u0742\u0741\3\2\2\2\u0742\u0743"+
		"\3\2\2\2\u0743\u0745\3\2\2\2\u0744\u0746\5\u0132\u009a\2\u0745\u0744\3"+
		"\2\2\2\u0745\u0746\3\2\2\2\u0746\u0747\3\2\2\2\u0747\u0748\5V,\2\u0748"+
		"\u074a\3\2\2\2\u0749\u072e\3\2\2\2\u0749\u0734\3\2\2\2\u074ac\3\2\2\2"+
		"\u074b\u074d\5f\64\2\u074c\u074e\5\u0084C\2\u074d\u074c\3\2\2\2\u074d"+
		"\u074e\3\2\2\2\u074e\u0752\3\2\2\2\u074f\u0751\5\u00aeX\2\u0750\u074f"+
		"\3\2\2\2\u0751\u0754\3\2\2\2\u0752\u0750\3\2\2\2\u0752\u0753\3\2\2\2\u0753"+
		"\u0756\3\2\2\2\u0754\u0752\3\2\2\2\u0755\u0757\5|?\2\u0756\u0755\3\2\2"+
		"\2\u0756\u0757\3\2\2\2\u0757\u0759\3\2\2\2\u0758\u075a\5\u0088E\2\u0759"+
		"\u0758\3\2\2\2\u0759\u075a\3\2\2\2\u075a\u075c\3\2\2\2\u075b\u075d\5~"+
		"@\2\u075c\u075b\3\2\2\2\u075c\u075d\3\2\2\2\u075d\u075f\3\2\2\2\u075e"+
		"\u0760\5\u0132\u009a\2\u075f\u075e\3\2\2\2\u075f\u0760\3\2\2\2\u0760\u0778"+
		"\3\2\2\2\u0761\u0763\5h\65\2\u0762\u0764\5\u0084C\2\u0763\u0762\3\2\2"+
		"\2\u0763\u0764\3\2\2\2\u0764\u0768\3\2\2\2\u0765\u0767\5\u00aeX\2\u0766"+
		"\u0765\3\2\2\2\u0767\u076a\3\2\2\2\u0768\u0766\3\2\2\2\u0768\u0769\3\2"+
		"\2\2\u0769\u076c\3\2\2\2\u076a\u0768\3\2\2\2\u076b\u076d\5|?\2\u076c\u076b"+
		"\3\2\2\2\u076c\u076d\3\2\2\2\u076d\u076f\3\2\2\2\u076e\u0770\5\u0088E"+
		"\2\u076f\u076e\3\2\2\2\u076f\u0770\3\2\2\2\u0770\u0772\3\2\2\2\u0771\u0773"+
		"\5~@\2\u0772\u0771\3\2\2\2\u0772\u0773\3\2\2\2\u0773\u0775\3\2\2\2\u0774"+
		"\u0776\5\u0132\u009a\2\u0775\u0774\3\2\2\2\u0775\u0776\3\2\2\2\u0776\u0778"+
		"\3\2\2\2\u0777\u074b\3\2\2\2\u0777\u0761\3\2\2\2\u0778e\3\2\2\2\u0779"+
		"\u077a\7\u00e9\2\2\u077a\u077b\7\u0113\2\2\u077b\u077d\7\4\2\2\u077c\u077e"+
		"\5\u00b0Y\2\u077d\u077c\3\2\2\2\u077d\u077e\3\2\2\2\u077e\u077f\3\2\2"+
		"\2\u077f\u0780\5\u00f2z\2\u0780\u0781\7\5\2\2\u0781\u078d\3\2\2\2\u0782"+
		"\u0784\7\u009a\2\2\u0783\u0785\5\u00b0Y\2\u0784\u0783\3\2\2\2\u0784\u0785"+
		"\3\2\2\2\u0785\u0786\3\2\2\2\u0786\u078d\5\u00f2z\2\u0787\u0789\7\u00d2"+
		"\2\2\u0788\u078a\5\u00b0Y\2\u0789\u0788\3\2\2\2\u0789\u078a\3\2\2\2\u078a"+
		"\u078b\3\2\2\2\u078b\u078d\5\u00f2z\2\u078c\u0779\3\2\2\2\u078c\u0782"+
		"\3\2\2\2\u078c\u0787\3\2\2\2\u078d\u078f\3\2\2\2\u078e\u0790\5\u00d6l"+
		"\2\u078f\u078e\3\2\2\2\u078f\u0790\3\2\2\2\u0790\u0793\3\2\2\2\u0791\u0792"+
		"\7\u00d0\2\2\u0792\u0794\5\u0152\u00aa\2\u0793\u0791\3\2\2\2\u0793\u0794"+
		"\3\2\2\2\u0794\u0795\3\2\2\2\u0795\u0796\7\u0125\2\2\u0796\u07a3\5\u0152"+
		"\u00aa\2\u0797\u07a1\7\25\2\2\u0798\u07a2\5\u00c2b\2\u0799\u07a2\5\u0122"+
		"\u0092\2\u079a\u079d\7\4\2\2\u079b\u079e\5\u00c2b\2\u079c\u079e\5\u0122"+
		"\u0092\2\u079d\u079b\3\2\2\2\u079d\u079c\3\2\2\2\u079e\u079f\3\2\2\2\u079f"+
		"\u07a0\7\5\2\2\u07a0\u07a2\3\2\2\2\u07a1\u0798\3\2\2\2\u07a1\u0799\3\2"+
		"\2\2\u07a1\u079a\3\2\2\2\u07a2\u07a4\3\2\2\2\u07a3\u0797\3\2\2\2\u07a3"+
		"\u07a4\3\2\2\2\u07a4\u07a6\3\2\2\2\u07a5\u07a7\5\u00d6l\2\u07a6\u07a5"+
		"\3\2\2\2\u07a6\u07a7\3\2\2\2\u07a7\u07aa\3\2\2\2\u07a8\u07a9\7\u00cf\2"+
		"\2\u07a9\u07ab\5\u0152\u00aa\2\u07aa\u07a8\3\2\2\2\u07aa\u07ab\3\2\2\2"+
		"\u07abg\3\2\2\2\u07ac\u07b0\7\u00e9\2\2\u07ad\u07af\5\u0080A\2\u07ae\u07ad"+
		"\3\2\2\2\u07af\u07b2\3\2\2\2\u07b0\u07ae\3\2\2\2\u07b0\u07b1\3\2\2\2\u07b1"+
		"\u07b4\3\2\2\2\u07b2\u07b0\3\2\2\2\u07b3\u07b5\5\u00b0Y\2\u07b4\u07b3"+
		"\3\2\2\2\u07b4\u07b5\3\2\2\2\u07b5\u07b6\3\2\2\2\u07b6\u07b7\5\u00e6t"+
		"\2\u07b7i\3\2\2\2\u07b8\u07b9\7\u00ef\2\2\u07b9\u07ba\5x=\2\u07bak\3\2"+
		"\2\2\u07bb\u07bc\7\u012c\2\2\u07bc\u07bf\7\u009b\2\2\u07bd\u07be\7\17"+
		"\2\2\u07be\u07c0\5\u00f4{\2\u07bf\u07bd\3\2\2\2\u07bf\u07c0\3\2\2\2\u07c0"+
		"\u07c1\3\2\2\2\u07c1\u07c2\7\u0109\2\2\u07c2\u07c3\5r:\2\u07c3m\3\2\2"+
		"\2\u07c4\u07c5\7\u012c\2\2\u07c5\u07c6\7\u00ac\2\2\u07c6\u07c9\7\u009b"+
		"\2\2\u07c7\u07c8\7\35\2\2\u07c8\u07ca\7\u0105\2\2\u07c9\u07c7\3\2\2\2"+
		"\u07c9\u07ca\3\2\2\2\u07ca\u07cd\3\2\2\2\u07cb\u07cc\7\17\2\2\u07cc\u07ce"+
		"\5\u00f4{\2\u07cd\u07cb\3\2\2\2\u07cd\u07ce\3\2\2\2\u07ce\u07cf\3\2\2"+
		"\2\u07cf\u07d0\7\u0109\2\2\u07d0\u07d1\5t;\2\u07d1o\3\2\2\2\u07d2\u07d3"+
		"\7\u012c\2\2\u07d3\u07d4\7\u00ac\2\2\u07d4\u07d5\7\u009b\2\2\u07d5\u07d6"+
		"\7\35\2\2\u07d6\u07d9\7\u00f7\2\2\u07d7\u07d8\7\17\2\2\u07d8\u07da\5\u00f4"+
		"{\2\u07d9\u07d7\3\2\2\2\u07d9\u07da\3\2\2\2\u07da\u07db\3\2\2\2\u07db";
	private static final String _serializedATNSegment1 =
		"\u07dc\7\u0109\2\2\u07dc\u07dd\5v<\2\u07ddq\3\2\2\2\u07de\u07e6\7I\2\2"+
		"\u07df\u07e0\7\u0122\2\2\u07e0\u07e1\7\u00ef\2\2\u07e1\u07e6\7\u013f\2"+
		"\2\u07e2\u07e3\7\u0122\2\2\u07e3\u07e4\7\u00ef\2\2\u07e4\u07e6\5x=\2\u07e5"+
		"\u07de\3\2\2\2\u07e5\u07df\3\2\2\2\u07e5\u07e2\3\2\2\2\u07e6s\3\2\2\2"+
		"\u07e7\u07e8\7\u0081\2\2\u07e8\u07fa\7\u013f\2\2\u07e9\u07ea\7\u0081\2"+
		"\2\u07ea\u07eb\7\4\2\2\u07eb\u07ec\5\u00d8m\2\u07ec\u07ed\7\5\2\2\u07ed"+
		"\u07ee\7\u0126\2\2\u07ee\u07ef\7\4\2\2\u07ef\u07f4\5\u00f0y\2\u07f0\u07f1"+
		"\7\6\2\2\u07f1\u07f3\5\u00f0y\2\u07f2\u07f0\3\2\2\2\u07f3\u07f6\3\2\2"+
		"\2\u07f4\u07f2\3\2\2\2\u07f4\u07f5\3\2\2\2\u07f5\u07f7\3\2\2\2\u07f6\u07f4"+
		"\3\2\2\2\u07f7\u07f8\7\5\2\2\u07f8\u07fa\3\2\2\2\u07f9\u07e7\3\2\2\2\u07f9"+
		"\u07e9\3\2\2\2\u07fau\3\2\2\2\u07fb\u0800\7I\2\2\u07fc\u07fd\7\u0122\2"+
		"\2\u07fd\u07fe\7\u00ef\2\2\u07fe\u0800\5x=\2\u07ff\u07fb\3\2\2\2\u07ff"+
		"\u07fc\3\2\2\2\u0800w\3\2\2\2\u0801\u0806\5z>\2\u0802\u0803\7\6\2\2\u0803"+
		"\u0805\5z>\2\u0804\u0802\3\2\2\2\u0805\u0808\3\2\2\2\u0806\u0804\3\2\2"+
		"\2\u0806\u0807\3\2\2\2\u0807y\3\2\2\2\u0808\u0806\3\2\2\2\u0809\u080a"+
		"\5\u00dan\2\u080a\u080b\7\u0135\2\2\u080b\u080c\5\u00f0y\2\u080c{\3\2"+
		"\2\2\u080d\u080e\7\u012d\2\2\u080e\u080f\5\u00f4{\2\u080f}\3\2\2\2\u0810"+
		"\u0811\7t\2\2\u0811\u0812\5\u00f4{\2\u0812\177\3\2\2\2\u0813\u0814\7\u0149"+
		"\2\2\u0814\u081b\5\u0082B\2\u0815\u0817\7\6\2\2\u0816\u0815\3\2\2\2\u0816"+
		"\u0817\3\2\2\2\u0817\u0818\3\2\2\2\u0818\u081a\5\u0082B\2\u0819\u0816"+
		"\3\2\2\2\u081a\u081d\3\2\2\2\u081b\u0819\3\2\2\2\u081b\u081c\3\2\2\2\u081c"+
		"\u081e\3\2\2\2\u081d\u081b\3\2\2\2\u081e\u081f\7\u014a\2\2\u081f\u0081"+
		"\3\2\2\2\u0820\u082e\5\u0146\u00a4\2\u0821\u0822\5\u0146\u00a4\2\u0822"+
		"\u0823\7\4\2\2\u0823\u0828\5\u00fc\177\2\u0824\u0825\7\6\2\2\u0825\u0827"+
		"\5\u00fc\177\2\u0826\u0824\3\2\2\2\u0827\u082a\3\2\2\2\u0828\u0826\3\2"+
		"\2\2\u0828\u0829\3\2\2\2\u0829\u082b\3\2\2\2\u082a\u0828\3\2\2\2\u082b"+
		"\u082c\7\5\2\2\u082c\u082e\3\2\2\2\u082d\u0820\3\2\2\2\u082d\u0821\3\2"+
		"\2\2\u082e\u0083\3\2\2\2\u082f\u0830\7l\2\2\u0830\u0835\5\u00b2Z\2\u0831"+
		"\u0832\7\6\2\2\u0832\u0834\5\u00b2Z\2\u0833\u0831\3\2\2\2\u0834\u0837"+
		"\3\2\2\2\u0835\u0833\3\2\2\2\u0835\u0836\3\2\2\2\u0836\u083b\3\2\2\2\u0837"+
		"\u0835\3\2\2\2\u0838\u083a\5\u00aeX\2\u0839\u0838\3\2\2\2\u083a\u083d"+
		"\3\2\2\2\u083b\u0839\3\2\2\2\u083b\u083c\3\2\2\2\u083c\u083f\3\2\2\2\u083d"+
		"\u083b\3\2\2\2\u083e\u0840\5\u0092J\2\u083f\u083e\3\2\2\2\u083f\u0840"+
		"\3\2\2\2\u0840\u0842\3\2\2\2\u0841\u0843\5\u0098M\2\u0842\u0841\3\2\2"+
		"\2\u0842\u0843\3\2\2\2\u0843\u0085\3\2\2\2\u0844\u0846\7h\2\2\u0845\u0844"+
		"\3\2\2\2\u0845\u0846\3\2\2\2\u0846\u0847\3\2\2\2\u0847\u0848\t\23\2\2"+
		"\u0848\u0849\7\25\2\2\u0849\u084a\7\u00af\2\2\u084a\u0853\5\u0156\u00ac"+
		"\2\u084b\u084d\7h\2\2\u084c\u084b\3\2\2\2\u084c\u084d\3\2\2\2\u084d\u084e"+
		"\3\2\2\2\u084e\u084f\t\24\2\2\u084f\u0850\7\25\2\2\u0850\u0851\7\u00af"+
		"\2\2\u0851\u0853\5\u00f8}\2\u0852\u0845\3\2\2\2\u0852\u084c\3\2\2\2\u0853"+
		"\u0087\3\2\2\2\u0854\u0855\7r\2\2\u0855\u0856\7\35\2\2\u0856\u085b\5\u008a"+
		"F\2\u0857\u0858\7\6\2\2\u0858\u085a\5\u008aF\2\u0859\u0857\3\2\2\2\u085a"+
		"\u085d\3\2\2\2\u085b\u0859\3\2\2\2\u085b\u085c\3\2\2\2\u085c\u087c\3\2"+
		"\2\2\u085d\u085b\3\2\2\2\u085e\u085f\7r\2\2\u085f\u0860\7\35\2\2\u0860"+
		"\u0865\5\u00f0y\2\u0861\u0862\7\6\2\2\u0862\u0864\5\u00f0y\2\u0863\u0861"+
		"\3\2\2\2\u0864\u0867\3\2\2\2\u0865\u0863\3\2\2\2\u0865\u0866\3\2\2\2\u0866"+
		"\u0879\3\2\2\2\u0867\u0865\3\2\2\2\u0868\u0869\7\u012f\2\2\u0869\u087a"+
		"\7\u00e2\2\2\u086a\u086b\7\u012f\2\2\u086b\u087a\78\2\2\u086c\u086d\7"+
		"s\2\2\u086d\u086e\7\u00f1\2\2\u086e\u086f\7\4\2\2\u086f\u0874\5\u0090"+
		"I\2\u0870\u0871\7\6\2\2\u0871\u0873\5\u0090I\2\u0872\u0870\3\2\2\2\u0873"+
		"\u0876\3\2\2\2\u0874\u0872\3\2\2\2\u0874\u0875\3\2\2\2\u0875\u0877\3\2"+
		"\2\2\u0876\u0874\3\2\2\2\u0877\u0878\7\5\2\2\u0878\u087a\3\2\2\2\u0879"+
		"\u0868\3\2\2\2\u0879\u086a\3\2\2\2\u0879\u086c\3\2\2\2\u0879\u087a\3\2"+
		"\2\2\u087a\u087c\3\2\2\2\u087b\u0854\3\2\2\2\u087b\u085e\3\2\2\2\u087c"+
		"\u0089\3\2\2\2\u087d\u0880\5\u008cG\2\u087e\u0880\5\u00f0y\2\u087f\u087d"+
		"\3\2\2\2\u087f\u087e\3\2\2\2\u0880\u008b\3\2\2\2\u0881\u0882\t\25\2\2"+
		"\u0882\u0883\7\4\2\2\u0883\u0888\5\u0090I\2\u0884\u0885\7\6\2\2\u0885"+
		"\u0887\5\u0090I\2\u0886\u0884\3\2\2\2\u0887\u088a\3\2\2\2\u0888\u0886"+
		"\3\2\2\2\u0888\u0889\3\2\2\2\u0889\u088b\3\2\2\2\u088a\u0888\3\2\2\2\u088b"+
		"\u088c\7\5\2\2\u088c\u089b\3\2\2\2\u088d\u088e\7s\2\2\u088e\u088f\7\u00f1"+
		"\2\2\u088f\u0890\7\4\2\2\u0890\u0895\5\u008eH\2\u0891\u0892\7\6\2\2\u0892"+
		"\u0894\5\u008eH\2\u0893\u0891\3\2\2\2\u0894\u0897\3\2\2\2\u0895\u0893"+
		"\3\2\2\2\u0895\u0896\3\2\2\2\u0896\u0898\3\2\2\2\u0897\u0895\3\2\2\2\u0898"+
		"\u0899\7\5\2\2\u0899\u089b\3\2\2\2\u089a\u0881\3\2\2\2\u089a\u088d\3\2"+
		"\2\2\u089b\u008d\3\2\2\2\u089c\u089f\5\u008cG\2\u089d\u089f\5\u0090I\2"+
		"\u089e\u089c\3\2\2\2\u089e\u089d\3\2\2\2\u089f\u008f\3\2\2\2\u08a0\u08a9"+
		"\7\4\2\2\u08a1\u08a6\5\u00f0y\2\u08a2\u08a3\7\6\2\2\u08a3\u08a5\5\u00f0"+
		"y\2\u08a4\u08a2\3\2\2\2\u08a5\u08a8\3\2\2\2\u08a6\u08a4\3\2\2\2\u08a6"+
		"\u08a7\3\2\2\2\u08a7\u08aa\3\2\2\2\u08a8\u08a6\3\2\2\2\u08a9\u08a1\3\2"+
		"\2\2\u08a9\u08aa\3\2\2\2\u08aa\u08ab\3\2\2\2\u08ab\u08ae\7\5\2\2\u08ac"+
		"\u08ae\5\u00f0y\2\u08ad\u08a0\3\2\2\2\u08ad\u08ac\3\2\2\2\u08ae\u0091"+
		"\3\2\2\2\u08af\u08b0\7\u00c4\2\2\u08b0\u08b1\7\4\2\2\u08b1\u08b2\5\u00e6"+
		"t\2\u08b2\u08b3\7h\2\2\u08b3\u08b4\5\u0094K\2\u08b4\u08b5\7z\2\2\u08b5"+
		"\u08b6\7\4\2\2\u08b6\u08bb\5\u0096L\2\u08b7\u08b8\7\6\2\2\u08b8\u08ba"+
		"\5\u0096L\2\u08b9\u08b7\3\2\2\2\u08ba\u08bd\3\2\2\2\u08bb\u08b9\3\2\2"+
		"\2\u08bb\u08bc\3\2\2\2\u08bc\u08be\3\2\2\2\u08bd\u08bb\3\2\2\2\u08be\u08bf"+
		"\7\5\2\2\u08bf\u08c0\7\5\2\2\u08c0\u0093\3\2\2\2\u08c1\u08ce\5\u0146\u00a4"+
		"\2\u08c2\u08c3\7\4\2\2\u08c3\u08c8\5\u0146\u00a4\2\u08c4\u08c5\7\6\2\2"+
		"\u08c5\u08c7\5\u0146\u00a4\2\u08c6\u08c4\3\2\2\2\u08c7\u08ca\3\2\2\2\u08c8"+
		"\u08c6\3\2\2\2\u08c8\u08c9\3\2\2\2\u08c9\u08cb\3\2\2\2\u08ca\u08c8\3\2"+
		"\2\2\u08cb\u08cc\7\5\2\2\u08cc\u08ce\3\2\2\2\u08cd\u08c1\3\2\2\2\u08cd"+
		"\u08c2\3\2\2\2\u08ce\u0095\3\2\2\2\u08cf\u08d4\5\u00f0y\2\u08d0\u08d2"+
		"\7\25\2\2\u08d1\u08d0\3\2\2\2\u08d1\u08d2\3\2\2\2\u08d2\u08d3\3\2\2\2"+
		"\u08d3\u08d5\5\u0146\u00a4\2\u08d4\u08d1\3\2\2\2\u08d4\u08d5\3\2\2\2\u08d5"+
		"\u0097\3\2\2\2\u08d6\u08d8\7\u0120\2\2\u08d7\u08d9\5\u009aN\2\u08d8\u08d7"+
		"\3\2\2\2\u08d8\u08d9\3\2\2\2\u08d9\u08da\3\2\2\2\u08da\u08db\7\4\2\2\u08db"+
		"\u08dc\5\u009cO\2\u08dc\u08e1\7\5\2\2\u08dd\u08df\7\25\2\2\u08de\u08dd"+
		"\3\2\2\2\u08de\u08df\3\2\2\2\u08df\u08e0\3\2\2\2\u08e0\u08e2\5\u0146\u00a4"+
		"\2\u08e1\u08de\3\2\2\2\u08e1\u08e2\3\2\2\2\u08e2\u0099\3\2\2\2\u08e3\u08e4"+
		"\t\26\2\2\u08e4\u08e5\7\u00ae\2\2\u08e5\u009b\3\2\2\2\u08e6\u08e9\5\u009e"+
		"P\2\u08e7\u08e9\5\u00a0Q\2\u08e8\u08e6\3\2\2\2\u08e8\u08e7\3\2\2\2\u08e9"+
		"\u009d\3\2\2\2\u08ea\u08eb\5\u00a4S\2\u08eb\u08ec\7h\2\2\u08ec\u08ed\5"+
		"\u00a6T\2\u08ed\u08ee\7z\2\2\u08ee\u08ef\7\4\2\2\u08ef\u08f4\5\u00a8U"+
		"\2\u08f0\u08f1\7\6\2\2\u08f1\u08f3\5\u00a8U\2\u08f2\u08f0\3\2\2\2\u08f3"+
		"\u08f6\3\2\2\2\u08f4\u08f2\3\2\2\2\u08f4\u08f5\3\2\2\2\u08f5\u08f7\3\2"+
		"\2\2\u08f6\u08f4\3\2\2\2\u08f7\u08f8\7\5\2\2\u08f8\u009f\3\2\2\2\u08f9"+
		"\u08fa\7\4\2\2\u08fa\u08ff\5\u00a4S\2\u08fb\u08fc\7\6\2\2\u08fc\u08fe"+
		"\5\u00a4S\2\u08fd\u08fb\3\2\2\2\u08fe\u0901\3\2\2\2\u08ff\u08fd\3\2\2"+
		"\2\u08ff\u0900\3\2\2\2\u0900\u0902\3\2\2\2\u0901\u08ff\3\2\2\2\u0902\u0903"+
		"\7\5\2\2\u0903\u0904\7h\2\2\u0904\u0905\5\u00a6T\2\u0905\u0906\7z\2\2"+
		"\u0906\u0907\7\4\2\2\u0907\u090c\5\u00a2R\2\u0908\u0909\7\6\2\2\u0909"+
		"\u090b\5\u00a2R\2\u090a\u0908\3\2\2\2\u090b\u090e\3\2\2\2\u090c\u090a"+
		"\3\2\2\2\u090c\u090d\3\2\2\2\u090d\u090f\3\2\2\2\u090e\u090c\3\2\2\2\u090f"+
		"\u0910\7\5\2\2\u0910\u00a1\3\2\2\2\u0911\u0912\7\4\2\2\u0912\u0917\5\u00aa"+
		"V\2\u0913\u0914\7\6\2\2\u0914\u0916\5\u00aaV\2\u0915\u0913\3\2\2\2\u0916"+
		"\u0919\3\2\2\2\u0917\u0915\3\2\2\2\u0917\u0918\3\2\2\2\u0918\u091a\3\2"+
		"\2\2\u0919\u0917\3\2\2\2\u091a\u091c\7\5\2\2\u091b\u091d\5\u00acW\2\u091c"+
		"\u091b\3\2\2\2\u091c\u091d\3\2\2\2\u091d\u00a3\3\2\2\2\u091e\u091f\5\u0146"+
		"\u00a4\2\u091f\u00a5\3\2\2\2\u0920\u0921\5\u0146\u00a4\2\u0921\u00a7\3"+
		"\2\2\2\u0922\u0924\5\u00aaV\2\u0923\u0925\5\u00acW\2\u0924\u0923\3\2\2"+
		"\2\u0924\u0925\3\2\2\2\u0925\u00a9\3\2\2\2\u0926\u0927\5\u00dan\2\u0927"+
		"\u00ab\3\2\2\2\u0928\u092a\7\25\2\2\u0929\u0928\3\2\2\2\u0929\u092a\3"+
		"\2\2\2\u092a\u092b\3\2\2\2\u092b\u092c\5\u0146\u00a4\2\u092c\u00ad\3\2"+
		"\2\2\u092d\u092e\7\u008a\2\2\u092e\u0930\7\u0128\2\2\u092f\u0931\7\u00b8"+
		"\2\2\u0930\u092f\3\2\2\2\u0930\u0931\3\2\2\2\u0931\u0932\3\2\2\2\u0932"+
		"\u0933\5\u0140\u00a1\2\u0933\u093c\7\4\2\2\u0934\u0939\5\u00f0y\2\u0935"+
		"\u0936\7\6\2\2\u0936\u0938\5\u00f0y\2\u0937\u0935\3\2\2\2\u0938\u093b"+
		"\3\2\2\2\u0939\u0937\3\2\2\2\u0939\u093a\3\2\2\2\u093a\u093d\3\2\2\2\u093b"+
		"\u0939\3\2\2\2\u093c\u0934\3\2\2\2\u093c\u093d\3\2\2\2\u093d\u093e\3\2"+
		"\2\2\u093e\u093f\7\5\2\2\u093f\u094b\5\u0146\u00a4\2\u0940\u0942\7\25"+
		"\2\2\u0941\u0940\3\2\2\2\u0941\u0942\3\2\2\2\u0942\u0943\3\2\2\2\u0943"+
		"\u0948\5\u0146\u00a4\2\u0944\u0945\7\6\2\2\u0945\u0947\5\u0146\u00a4\2"+
		"\u0946\u0944\3\2\2\2\u0947\u094a\3\2\2\2\u0948\u0946\3\2\2\2\u0948\u0949"+
		"\3\2\2\2\u0949\u094c\3\2\2\2\u094a\u0948\3\2\2\2\u094b\u0941\3\2\2\2\u094b"+
		"\u094c\3\2\2\2\u094c\u00af\3\2\2\2\u094d\u094e\t\27\2\2\u094e\u00b1\3"+
		"\2\2\2\u094f\u0951\7\u008a\2\2\u0950\u094f\3\2\2\2\u0950\u0951\3\2\2\2"+
		"\u0951\u0952\3\2\2\2\u0952\u0956\5\u00ceh\2\u0953\u0955\5\u00b4[\2\u0954"+
		"\u0953\3\2\2\2\u0955\u0958\3\2\2\2\u0956\u0954\3\2\2\2\u0956\u0957\3\2"+
		"\2\2\u0957\u00b3\3\2\2\2\u0958\u0956\3\2\2\2\u0959\u095d\5\u00b6\\\2\u095a"+
		"\u095d\5\u0092J\2\u095b\u095d\5\u0098M\2\u095c\u0959\3\2\2\2\u095c\u095a"+
		"\3\2\2\2\u095c\u095b\3\2\2\2\u095d\u00b5\3\2\2\2\u095e\u095f\5\u00b8]"+
		"\2\u095f\u0961\7\u0087\2\2\u0960\u0962\7\u008a\2\2\u0961\u0960\3\2\2\2"+
		"\u0961\u0962\3\2\2\2\u0962\u0963\3\2\2\2\u0963\u0965\5\u00ceh\2\u0964"+
		"\u0966\5\u00ba^\2\u0965\u0964\3\2\2\2\u0965\u0966\3\2\2\2\u0966\u0970"+
		"\3\2\2\2\u0967\u0968\7\u00aa\2\2\u0968\u0969\5\u00b8]\2\u0969\u096b\7"+
		"\u0087\2\2\u096a\u096c\7\u008a\2\2\u096b\u096a\3\2\2\2\u096b\u096c\3\2"+
		"\2\2\u096c\u096d\3\2\2\2\u096d\u096e\5\u00ceh\2\u096e\u0970\3\2\2\2\u096f"+
		"\u095e\3\2\2\2\u096f\u0967\3\2\2\2\u0970\u00b7\3\2\2\2\u0971\u0973\7~"+
		"\2\2\u0972\u0971\3\2\2\2\u0972\u0973\3\2\2\2\u0973\u098a\3\2\2\2\u0974"+
		"\u098a\7\67\2\2\u0975\u0977\7\u008d\2\2\u0976\u0978\7\u00b8\2\2\u0977"+
		"\u0976\3\2\2\2\u0977\u0978\3\2\2\2\u0978\u098a\3\2\2\2\u0979\u097b\7\u008d"+
		"\2\2\u097a\u0979\3\2\2\2\u097a\u097b\3\2\2\2\u097b\u097c\3\2\2\2\u097c"+
		"\u098a\7\u00ea\2\2\u097d\u097f\7\u00dd\2\2\u097e\u0980\7\u00b8\2\2\u097f"+
		"\u097e\3\2\2\2\u097f\u0980\3\2\2\2\u0980\u098a\3\2\2\2\u0981\u0983\7m"+
		"\2\2\u0982\u0984\7\u00b8\2\2\u0983\u0982\3\2\2\2\u0983\u0984\3\2\2\2\u0984"+
		"\u098a\3\2\2\2\u0985\u0987\7\u008d\2\2\u0986\u0985\3\2\2\2\u0986\u0987"+
		"\3\2\2\2\u0987\u0988\3\2\2\2\u0988\u098a\7\20\2\2\u0989\u0972\3\2\2\2"+
		"\u0989\u0974\3\2\2\2\u0989\u0975\3\2\2\2\u0989\u097a\3\2\2\2\u0989\u097d"+
		"\3\2\2\2\u0989\u0981\3\2\2\2\u0989\u0986\3\2\2\2\u098a\u00b9\3\2\2\2\u098b"+
		"\u098c\7\u00b1\2\2\u098c\u0990\5\u00f4{\2\u098d\u098e\7\u0125\2\2\u098e"+
		"\u0990\5\u00c0a\2\u098f\u098b\3\2\2\2\u098f\u098d\3\2\2\2\u0990\u00bb"+
		"\3\2\2\2\u0991\u0992\7\u0104\2\2\u0992\u0994\7\4\2\2\u0993\u0995\5\u00be"+
		"`\2\u0994\u0993\3\2\2\2\u0994\u0995\3\2\2\2\u0995\u0996\3\2\2\2\u0996"+
		"\u099b\7\5\2\2\u0997\u0998\7\u00d7\2\2\u0998\u0999\7\4\2\2\u0999\u099a"+
		"\7\u0150\2\2\u099a\u099c\7\5\2\2\u099b\u0997\3\2\2\2\u099b\u099c\3\2\2"+
		"\2\u099c\u00bd\3\2\2\2\u099d\u099f\7\u013e\2\2\u099e\u099d\3\2\2\2\u099e"+
		"\u099f\3\2\2\2\u099f\u09a0\3\2\2\2\u09a0\u09a1\t\30\2\2\u09a1\u09b6\7"+
		"\u00c3\2\2\u09a2\u09a3\5\u00f0y\2\u09a3\u09a4\7\u00e4\2\2\u09a4\u09b6"+
		"\3\2\2\2\u09a5\u09a6\7\33\2\2\u09a6\u09a7\7\u0150\2\2\u09a7\u09a8\7\u00b7"+
		"\2\2\u09a8\u09a9\7\u00af\2\2\u09a9\u09b2\7\u0150\2\2\u09aa\u09b0\7\u00b1"+
		"\2\2\u09ab\u09b1\5\u0146\u00a4\2\u09ac\u09ad\5\u0140\u00a1\2\u09ad\u09ae"+
		"\7\4\2\2\u09ae\u09af\7\5\2\2\u09af\u09b1\3\2\2\2\u09b0\u09ab\3\2\2\2\u09b0"+
		"\u09ac\3\2\2\2\u09b1\u09b3\3\2\2\2\u09b2\u09aa\3\2\2\2\u09b2\u09b3\3\2"+
		"\2\2\u09b3\u09b6\3\2\2\2\u09b4\u09b6\5\u00f0y\2\u09b5\u099e\3\2\2\2\u09b5"+
		"\u09a2\3\2\2\2\u09b5\u09a5\3\2\2\2\u09b5\u09b4\3\2\2\2\u09b6\u00bf\3\2"+
		"\2\2\u09b7\u09b8\7\4\2\2\u09b8\u09b9\5\u00c2b\2\u09b9\u09ba\7\5\2\2\u09ba"+
		"\u00c1\3\2\2\2\u09bb\u09c0\5\u00c4c\2\u09bc\u09bd\7\6\2\2\u09bd\u09bf"+
		"\5\u00c4c\2\u09be\u09bc\3\2\2\2\u09bf\u09c2\3\2\2\2\u09c0\u09be\3\2\2"+
		"\2\u09c0\u09c1\3\2\2\2\u09c1\u00c3\3\2\2\2\u09c2\u09c0\3\2\2\2\u09c3\u09c4"+
		"\5\u0142\u00a2\2\u09c4\u00c5\3\2\2\2\u09c5\u09c6\7\4\2\2\u09c6\u09cb\5"+
		"\u00c8e\2\u09c7\u09c8\7\6\2\2\u09c8\u09ca\5\u00c8e\2\u09c9\u09c7\3\2\2"+
		"\2\u09ca\u09cd\3\2\2\2\u09cb\u09c9\3\2\2\2\u09cb\u09cc\3\2\2\2\u09cc\u09ce"+
		"\3\2\2\2\u09cd\u09cb\3\2\2\2\u09ce\u09cf\7\5\2\2\u09cf\u00c7\3\2\2\2\u09d0"+
		"\u09d2\5\u0142\u00a2\2\u09d1\u09d3\t\21\2\2\u09d2\u09d1\3\2\2\2\u09d2"+
		"\u09d3\3\2\2\2\u09d3\u00c9\3\2\2\2\u09d4\u09d5\7\4\2\2\u09d5\u09da\5\u00cc"+
		"g\2\u09d6\u09d7\7\6\2\2\u09d7\u09d9\5\u00ccg\2\u09d8\u09d6\3\2\2\2\u09d9"+
		"\u09dc\3\2\2\2\u09da\u09d8\3\2\2\2\u09da\u09db\3\2\2\2\u09db\u09dd\3\2"+
		"\2\2\u09dc\u09da\3\2\2\2\u09dd\u09de\7\5\2\2\u09de\u00cb\3\2\2\2\u09df"+
		"\u09e1\5\u0146\u00a4\2\u09e0\u09e2\5$\23\2\u09e1\u09e0\3\2\2\2\u09e1\u09e2"+
		"\3\2\2\2\u09e2\u00cd\3\2\2\2\u09e3\u09e5\5\u00dan\2\u09e4\u09e6\5\u0086"+
		"D\2\u09e5\u09e4\3\2\2\2\u09e5\u09e6\3\2\2\2\u09e6\u09e8\3\2\2\2\u09e7"+
		"\u09e9\5\u00bc_\2\u09e8\u09e7\3\2\2\2\u09e8\u09e9\3\2\2\2\u09e9\u09ea"+
		"\3\2\2\2\u09ea\u09eb\5\u00d4k\2\u09eb\u09ff\3\2\2\2\u09ec\u09ed\7\4\2"+
		"\2\u09ed\u09ee\5&\24\2\u09ee\u09f0\7\5\2\2\u09ef\u09f1\5\u00bc_\2\u09f0"+
		"\u09ef\3\2\2\2\u09f0\u09f1\3\2\2\2\u09f1\u09f2\3\2\2\2\u09f2\u09f3\5\u00d4"+
		"k\2\u09f3\u09ff\3\2\2\2\u09f4\u09f5\7\4\2\2\u09f5\u09f6\5\u00b2Z\2\u09f6"+
		"\u09f8\7\5\2\2\u09f7\u09f9\5\u00bc_\2\u09f8\u09f7\3\2\2\2\u09f8\u09f9"+
		"\3\2\2\2\u09f9\u09fa\3\2\2\2\u09fa\u09fb\5\u00d4k\2\u09fb\u09ff\3\2\2"+
		"\2\u09fc\u09ff\5\u00d0i\2\u09fd\u09ff\5\u00d2j\2\u09fe\u09e3\3\2\2\2\u09fe"+
		"\u09ec\3\2\2\2\u09fe\u09f4\3\2\2\2\u09fe\u09fc\3\2\2\2\u09fe\u09fd\3\2"+
		"\2\2\u09ff\u00cf\3\2\2\2\u0a00\u0a01\7\u0126\2\2\u0a01\u0a06\5\u00f0y"+
		"\2\u0a02\u0a03\7\6\2\2\u0a03\u0a05\5\u00f0y\2\u0a04\u0a02\3\2\2\2\u0a05"+
		"\u0a08\3\2\2\2\u0a06\u0a04\3\2\2\2\u0a06\u0a07\3\2\2\2\u0a07\u0a09\3\2"+
		"\2\2\u0a08\u0a06\3\2\2\2\u0a09\u0a0a\5\u00d4k\2\u0a0a\u00d1\3\2\2\2\u0a0b"+
		"\u0a0c\5\u013e\u00a0\2\u0a0c\u0a15\7\4\2\2\u0a0d\u0a12\5\u00f0y\2\u0a0e"+
		"\u0a0f\7\6\2\2\u0a0f\u0a11\5\u00f0y\2\u0a10\u0a0e\3\2\2\2\u0a11\u0a14"+
		"\3\2\2\2\u0a12\u0a10\3\2\2\2\u0a12\u0a13\3\2\2\2\u0a13\u0a16\3\2\2\2\u0a14"+
		"\u0a12\3\2\2\2\u0a15\u0a0d\3\2\2\2\u0a15\u0a16\3\2\2\2\u0a16\u0a17\3\2"+
		"\2\2\u0a17\u0a18\7\5\2\2\u0a18\u0a19\5\u00d4k\2\u0a19\u00d3\3\2\2\2\u0a1a"+
		"\u0a1c\7\25\2\2\u0a1b\u0a1a\3\2\2\2\u0a1b\u0a1c\3\2\2\2\u0a1c\u0a1d\3"+
		"\2\2\2\u0a1d\u0a1f\5\u0148\u00a5\2\u0a1e\u0a20\5\u00c0a\2\u0a1f\u0a1e"+
		"\3\2\2\2\u0a1f\u0a20\3\2\2\2\u0a20\u0a22\3\2\2\2\u0a21\u0a1b\3\2\2\2\u0a21"+
		"\u0a22\3\2\2\2\u0a22\u00d5\3\2\2\2\u0a23\u0a24\7\u00e3\2\2\u0a24\u0a25"+
		"\7j\2\2\u0a25\u0a26\7\u00ec\2\2\u0a26\u0a2a\5\u0152\u00aa\2\u0a27\u0a28"+
		"\7\u012f\2\2\u0a28\u0a29\7\u00ed\2\2\u0a29\u0a2b\5@!\2\u0a2a\u0a27\3\2"+
		"\2\2\u0a2a\u0a2b\3\2\2\2\u0a2b\u0a55\3\2\2\2\u0a2c\u0a2d\7\u00e3\2\2\u0a2d"+
		"\u0a2e\7j\2\2\u0a2e\u0a38\7J\2\2\u0a2f\u0a30\7c\2\2\u0a30\u0a31\7\u0108"+
		"\2\2\u0a31\u0a32\7\35\2\2\u0a32\u0a36\5\u0152\u00aa\2\u0a33\u0a34\7W\2"+
		"\2\u0a34\u0a35\7\35\2\2\u0a35\u0a37\5\u0152\u00aa\2\u0a36\u0a33\3\2\2"+
		"\2\u0a36\u0a37\3\2\2\2\u0a37\u0a39\3\2\2\2\u0a38\u0a2f\3\2\2\2\u0a38\u0a39"+
		"\3\2\2\2\u0a39\u0a3f\3\2\2\2\u0a3a\u0a3b\7+\2\2\u0a3b\u0a3c\7\u0086\2"+
		"\2\u0a3c\u0a3d\7\u0108\2\2\u0a3d\u0a3e\7\35\2\2\u0a3e\u0a40\5\u0152\u00aa"+
		"\2\u0a3f\u0a3a\3\2\2\2\u0a3f\u0a40\3\2\2\2\u0a40\u0a46\3\2\2\2\u0a41\u0a42"+
		"\7\u009a\2\2\u0a42\u0a43\7\u0088\2\2\u0a43\u0a44\7\u0108\2\2\u0a44\u0a45"+
		"\7\35\2\2\u0a45\u0a47\5\u0152\u00aa\2\u0a46\u0a41\3\2\2\2\u0a46\u0a47"+
		"\3\2\2\2\u0a47\u0a4c\3\2\2\2\u0a48\u0a49\7\u0091\2\2\u0a49\u0a4a\7\u0108"+
		"\2\2\u0a4a\u0a4b\7\35\2\2\u0a4b\u0a4d\5\u0152\u00aa\2\u0a4c\u0a48\3\2"+
		"\2\2\u0a4c\u0a4d\3\2\2\2\u0a4d\u0a52\3\2\2\2\u0a4e\u0a4f\7\u00ad\2\2\u0a4f"+
		"\u0a50\7H\2\2\u0a50\u0a51\7\25\2\2\u0a51\u0a53\5\u0152\u00aa\2\u0a52\u0a4e"+
		"\3\2\2\2\u0a52\u0a53\3\2\2\2\u0a53\u0a55\3\2\2\2\u0a54\u0a23\3\2\2\2\u0a54"+
		"\u0a2c\3\2\2\2\u0a55\u00d7\3\2\2\2\u0a56\u0a5b\5\u00dan\2\u0a57\u0a58"+
		"\7\6\2\2\u0a58\u0a5a\5\u00dan\2\u0a59\u0a57\3\2\2\2\u0a5a\u0a5d\3\2\2"+
		"\2\u0a5b\u0a59\3\2\2\2\u0a5b\u0a5c\3\2\2\2\u0a5c\u00d9\3\2\2\2\u0a5d\u0a5b"+
		"\3\2\2\2\u0a5e\u0a63\5\u0142\u00a2\2\u0a5f\u0a60\7\7\2\2\u0a60\u0a62\5"+
		"\u0142\u00a2\2\u0a61\u0a5f\3\2\2\2\u0a62\u0a65\3\2\2\2\u0a63\u0a61\3\2"+
		"\2\2\u0a63\u0a64\3\2\2\2\u0a64\u00db\3\2\2\2\u0a65\u0a63\3\2\2\2\u0a66"+
		"\u0a6b\5\u00dep\2\u0a67\u0a68\7\6\2\2\u0a68\u0a6a\5\u00dep\2\u0a69\u0a67"+
		"\3\2\2\2\u0a6a\u0a6d\3\2\2\2\u0a6b\u0a69\3\2\2\2\u0a6b\u0a6c\3\2\2\2\u0a6c"+
		"\u00dd\3\2\2\2\u0a6d\u0a6b\3\2\2\2\u0a6e\u0a71\5\u00dan\2\u0a6f\u0a70"+
		"\7\u00b4\2\2\u0a70\u0a72\5@!\2\u0a71\u0a6f\3\2\2\2\u0a71\u0a72\3\2\2\2"+
		"\u0a72\u00df\3\2\2\2\u0a73\u0a74\5\u0142\u00a2\2\u0a74\u0a75\7\7\2\2\u0a75"+
		"\u0a77\3\2\2\2\u0a76\u0a73\3\2\2\2\u0a76\u0a77\3\2\2\2\u0a77\u0a78\3\2"+
		"\2\2\u0a78\u0a79\5\u0142\u00a2\2\u0a79\u00e1\3\2\2\2\u0a7a\u0a7b\5\u0142"+
		"\u00a2\2\u0a7b\u0a7c\7\7\2\2\u0a7c\u0a7e\3\2\2\2\u0a7d\u0a7a\3\2\2\2\u0a7d"+
		"\u0a7e\3\2\2\2\u0a7e\u0a7f\3\2\2\2\u0a7f\u0a80\5\u0142\u00a2\2\u0a80\u00e3"+
		"\3\2\2\2\u0a81\u0a89\5\u00f0y\2\u0a82\u0a84\7\25\2\2\u0a83\u0a82\3\2\2"+
		"\2\u0a83\u0a84\3\2\2\2\u0a84\u0a87\3\2\2\2\u0a85\u0a88\5\u0142\u00a2\2"+
		"\u0a86\u0a88\5\u00c0a\2\u0a87\u0a85\3\2\2\2\u0a87\u0a86\3\2\2\2\u0a88"+
		"\u0a8a\3\2\2\2\u0a89\u0a83\3\2\2\2\u0a89\u0a8a\3\2\2\2\u0a8a\u00e5\3\2"+
		"\2\2\u0a8b\u0a90\5\u00e4s\2\u0a8c\u0a8d\7\6\2\2\u0a8d\u0a8f\5\u00e4s\2"+
		"\u0a8e\u0a8c\3\2\2\2\u0a8f\u0a92\3\2\2\2\u0a90\u0a8e\3\2\2\2\u0a90\u0a91"+
		"\3\2\2\2\u0a91\u00e7\3\2\2\2\u0a92\u0a90\3\2\2\2\u0a93\u0a94\7\4\2\2\u0a94"+
		"\u0a99\5\u00eav\2\u0a95\u0a96\7\6\2\2\u0a96\u0a98\5\u00eav\2\u0a97\u0a95"+
		"\3\2\2\2\u0a98\u0a9b\3\2\2\2\u0a99\u0a97\3\2\2\2\u0a99\u0a9a\3\2\2\2\u0a9a"+
		"\u0a9c\3\2\2\2\u0a9b\u0a99\3\2\2\2\u0a9c\u0a9d\7\5\2\2\u0a9d\u00e9\3\2"+
		"\2\2\u0a9e\u0aa1\5\u00ecw\2\u0a9f\u0aa1\5\u0124\u0093\2\u0aa0\u0a9e\3"+
		"\2\2\2\u0aa0\u0a9f\3\2\2\2\u0aa1\u00eb\3\2\2\2\u0aa2\u0ab0\5\u0140\u00a1"+
		"\2\u0aa3\u0aa4\5\u0146\u00a4\2\u0aa4\u0aa5\7\4\2\2\u0aa5\u0aaa\5\u00ee"+
		"x\2\u0aa6\u0aa7\7\6\2\2\u0aa7\u0aa9\5\u00eex\2\u0aa8\u0aa6\3\2\2\2\u0aa9"+
		"\u0aac\3\2\2\2\u0aaa\u0aa8\3\2\2\2\u0aaa\u0aab\3\2\2\2\u0aab\u0aad\3\2"+
		"\2\2\u0aac\u0aaa\3\2\2\2\u0aad\u0aae\7\5\2\2\u0aae\u0ab0\3\2\2\2\u0aaf"+
		"\u0aa2\3\2\2\2\u0aaf\u0aa3\3\2\2\2\u0ab0\u00ed\3\2\2\2\u0ab1\u0ab4\5\u0140"+
		"\u00a1\2\u0ab2\u0ab4\5\u00fe\u0080\2\u0ab3\u0ab1\3\2\2\2\u0ab3\u0ab2\3"+
		"\2\2\2\u0ab4\u00ef\3\2\2\2\u0ab5\u0ab6\5\u00f4{\2\u0ab6\u00f1\3\2\2\2"+
		"\u0ab7\u0abc\5\u00f0y\2\u0ab8\u0ab9\7\6\2\2\u0ab9\u0abb\5\u00f0y\2\u0aba"+
		"\u0ab8\3\2\2\2\u0abb\u0abe\3\2\2\2\u0abc\u0aba\3\2\2\2\u0abc\u0abd\3\2"+
		"\2\2\u0abd\u00f3\3\2\2\2\u0abe\u0abc\3\2\2\2\u0abf\u0ac0\b{\1\2\u0ac0"+
		"\u0ac1\7\u00ac\2\2\u0ac1\u0acc\5\u00f4{\7\u0ac2\u0ac3\7[\2\2\u0ac3\u0ac4"+
		"\7\4\2\2\u0ac4\u0ac5\5&\24\2\u0ac5\u0ac6\7\5\2\2\u0ac6\u0acc\3\2\2\2\u0ac7"+
		"\u0ac9\5\u00f8}\2\u0ac8\u0aca\5\u00f6|\2\u0ac9\u0ac8\3\2\2\2\u0ac9\u0aca"+
		"\3\2\2\2\u0aca\u0acc\3\2\2\2\u0acb\u0abf\3\2\2\2\u0acb\u0ac2\3\2\2\2\u0acb"+
		"\u0ac7\3\2\2\2\u0acc\u0ad5\3\2\2\2\u0acd\u0ace\f\4\2\2\u0ace\u0acf\7\17"+
		"\2\2\u0acf\u0ad4\5\u00f4{\5\u0ad0\u0ad1\f\3\2\2\u0ad1\u0ad2\7\u00b5\2"+
		"\2\u0ad2\u0ad4\5\u00f4{\4\u0ad3\u0acd\3\2\2\2\u0ad3\u0ad0\3\2\2\2\u0ad4"+
		"\u0ad7\3\2\2\2\u0ad5\u0ad3\3\2\2\2\u0ad5\u0ad6\3\2\2\2\u0ad6\u00f5\3\2"+
		"\2\2\u0ad7\u0ad5\3\2\2\2\u0ad8\u0ada\7\u00ac\2\2\u0ad9\u0ad8\3\2\2\2\u0ad9"+
		"\u0ada\3\2\2\2\u0ada\u0adb\3\2\2\2\u0adb\u0adc\7\31\2\2\u0adc\u0add\5"+
		"\u00f8}\2\u0add\u0ade\7\17\2\2\u0ade\u0adf\5\u00f8}\2\u0adf\u0b2b\3\2"+
		"\2\2\u0ae0\u0ae2\7\u00ac\2\2\u0ae1\u0ae0\3\2\2\2\u0ae1\u0ae2\3\2\2\2\u0ae2"+
		"\u0ae3\3\2\2\2\u0ae3\u0ae4\7z\2\2\u0ae4\u0ae5\7\4\2\2\u0ae5\u0aea\5\u00f0"+
		"y\2\u0ae6\u0ae7\7\6\2\2\u0ae7\u0ae9\5\u00f0y\2\u0ae8\u0ae6\3\2\2\2\u0ae9"+
		"\u0aec\3\2\2\2\u0aea\u0ae8\3\2\2\2\u0aea\u0aeb\3\2\2\2\u0aeb\u0aed\3\2"+
		"\2\2\u0aec\u0aea\3\2\2\2\u0aed\u0aee\7\5\2\2\u0aee\u0b2b\3\2\2\2\u0aef"+
		"\u0af1\7\u00ac\2\2\u0af0\u0aef\3\2\2\2\u0af0\u0af1\3\2\2\2\u0af1\u0af2"+
		"\3\2\2\2\u0af2\u0af3\7z\2\2\u0af3\u0af4\7\4\2\2\u0af4\u0af5\5&\24\2\u0af5"+
		"\u0af6\7\5\2\2\u0af6\u0b2b\3\2\2\2\u0af7\u0af9\7\u00ac\2\2\u0af8\u0af7"+
		"\3\2\2\2\u0af8\u0af9\3\2\2\2\u0af9\u0afa\3\2\2\2\u0afa\u0afb\7\u00de\2"+
		"\2\u0afb\u0b2b\5\u00f8}\2\u0afc\u0afe\7\u00ac\2\2\u0afd\u0afc\3\2\2\2"+
		"\u0afd\u0afe\3\2\2\2\u0afe\u0aff\3\2\2\2\u0aff\u0b00\t\31\2\2\u0b00\u0b0e"+
		"\t\32\2\2\u0b01\u0b02\7\4\2\2\u0b02\u0b0f\7\5\2\2\u0b03\u0b04\7\4\2\2"+
		"\u0b04\u0b09\5\u00f0y\2\u0b05\u0b06\7\6\2\2\u0b06\u0b08\5\u00f0y\2\u0b07"+
		"\u0b05\3\2\2\2\u0b08\u0b0b\3\2\2\2\u0b09\u0b07\3\2\2\2\u0b09\u0b0a\3\2"+
		"\2\2\u0b0a\u0b0c\3\2\2\2\u0b0b\u0b09\3\2\2\2\u0b0c\u0b0d\7\5\2\2\u0b0d"+
		"\u0b0f\3\2\2\2\u0b0e\u0b01\3\2\2\2\u0b0e\u0b03\3\2\2\2\u0b0f\u0b2b\3\2"+
		"\2\2\u0b10\u0b12\7\u00ac\2\2\u0b11\u0b10\3\2\2\2\u0b11\u0b12\3\2\2\2\u0b12"+
		"\u0b13\3\2\2\2\u0b13\u0b14\t\31\2\2\u0b14\u0b17\5\u00f8}\2\u0b15\u0b16"+
		"\7V\2\2\u0b16\u0b18\5\u0152\u00aa\2\u0b17\u0b15\3\2\2\2\u0b17\u0b18\3"+
		"\2\2\2\u0b18\u0b2b\3\2\2\2\u0b19\u0b1b\7\u0085\2\2\u0b1a\u0b1c\7\u00ac"+
		"\2\2\u0b1b\u0b1a\3\2\2\2\u0b1b\u0b1c\3\2\2\2\u0b1c\u0b1d\3\2\2\2\u0b1d"+
		"\u0b2b\7\u00ad\2\2\u0b1e\u0b20\7\u0085\2\2\u0b1f\u0b21\7\u00ac\2\2\u0b20"+
		"\u0b1f\3\2\2\2\u0b20\u0b21\3\2\2\2\u0b21\u0b22\3\2\2\2\u0b22\u0b2b\t\33"+
		"\2\2\u0b23\u0b25\7\u0085\2\2\u0b24\u0b26\7\u00ac\2\2\u0b25\u0b24\3\2\2"+
		"\2\u0b25\u0b26\3\2\2\2\u0b26\u0b27\3\2\2\2\u0b27\u0b28\7P\2\2\u0b28\u0b29"+
		"\7l\2\2\u0b29\u0b2b\5\u00f8}\2\u0b2a\u0ad9\3\2\2\2\u0b2a\u0ae1\3\2\2\2"+
		"\u0b2a\u0af0\3\2\2\2\u0b2a\u0af8\3\2\2\2\u0b2a\u0afd\3\2\2\2\u0b2a\u0b11"+
		"\3\2\2\2\u0b2a\u0b19\3\2\2\2\u0b2a\u0b1e\3\2\2\2\u0b2a\u0b23\3\2\2\2\u0b2b"+
		"\u00f7\3\2\2\2\u0b2c\u0b2d\b}\1\2\u0b2d\u0b31\5\u00fc\177\2\u0b2e\u0b2f"+
		"\t\34\2\2\u0b2f\u0b31\5\u00f8}\t\u0b30\u0b2c\3\2\2\2\u0b30\u0b2e\3\2\2"+
		"\2\u0b31\u0b47\3\2\2\2\u0b32\u0b33\f\b\2\2\u0b33\u0b34\t\35\2\2\u0b34"+
		"\u0b46\5\u00f8}\t\u0b35\u0b36\f\7\2\2\u0b36\u0b37\t\36\2\2\u0b37\u0b46"+
		"\5\u00f8}\b\u0b38\u0b39\f\6\2\2\u0b39\u0b3a\7\u0143\2\2\u0b3a\u0b46\5"+
		"\u00f8}\7\u0b3b\u0b3c\f\5\2\2\u0b3c\u0b3d\7\u0146\2\2\u0b3d\u0b46\5\u00f8"+
		"}\6\u0b3e\u0b3f\f\4\2\2\u0b3f\u0b40\7\u0144\2\2\u0b40\u0b46\5\u00f8}\5"+
		"\u0b41\u0b42\f\3\2\2\u0b42\u0b43\5\u0100\u0081\2\u0b43\u0b44\5\u00f8}"+
		"\4\u0b44\u0b46\3\2\2\2\u0b45\u0b32\3\2\2\2\u0b45\u0b35\3\2\2\2\u0b45\u0b38"+
		"\3\2\2\2\u0b45\u0b3b\3\2\2\2\u0b45\u0b3e\3\2\2\2\u0b45\u0b41\3\2\2\2\u0b46"+
		"\u0b49\3\2\2\2\u0b47\u0b45\3\2\2\2\u0b47\u0b48\3\2\2\2\u0b48\u00f9\3\2"+
		"\2\2\u0b49\u0b47\3\2\2\2\u0b4a\u0b4b\t\37\2\2\u0b4b\u00fb\3\2\2\2\u0b4c"+
		"\u0b4d\b\177\1\2\u0b4d\u0c41\t \2\2\u0b4e\u0b4f\t!\2\2\u0b4f\u0b50\7\4"+
		"\2\2\u0b50\u0b51\5\u00fa~\2\u0b51\u0b52\7\6\2\2\u0b52\u0b53\5\u00f8}\2"+
		"\u0b53\u0b54\7\6\2\2\u0b54\u0b55\5\u00f8}\2\u0b55\u0b56\7\5\2\2\u0b56"+
		"\u0c41\3\2\2\2\u0b57\u0b58\t\"\2\2\u0b58\u0b59\7\4\2\2\u0b59\u0b5a\5\u00fa"+
		"~\2\u0b5a\u0b5b\7\6\2\2\u0b5b\u0b5c\5\u00f8}\2\u0b5c\u0b5d\7\6\2\2\u0b5d"+
		"\u0b5e\5\u00f8}\2\u0b5e\u0b5f\7\5\2\2\u0b5f\u0c41\3\2\2\2\u0b60\u0b62"+
		"\7 \2\2\u0b61\u0b63\5\u0130\u0099\2\u0b62\u0b61\3\2\2\2\u0b63\u0b64\3"+
		"\2\2\2\u0b64\u0b62\3\2\2\2\u0b64\u0b65\3\2\2\2\u0b65\u0b68\3\2\2\2\u0b66"+
		"\u0b67\7T\2\2\u0b67\u0b69\5\u00f0y\2\u0b68\u0b66\3\2\2\2\u0b68\u0b69\3"+
		"\2\2\2\u0b69\u0b6a\3\2\2\2\u0b6a\u0b6b\7U\2\2\u0b6b\u0c41\3\2\2\2\u0b6c"+
		"\u0b6d\7 \2\2\u0b6d\u0b6f\5\u00f0y\2\u0b6e\u0b70\5\u0130\u0099\2\u0b6f"+
		"\u0b6e\3\2\2\2\u0b70\u0b71\3\2\2\2\u0b71\u0b6f\3\2\2\2\u0b71\u0b72\3\2"+
		"\2\2\u0b72\u0b75\3\2\2\2\u0b73\u0b74\7T\2\2\u0b74\u0b76\5\u00f0y\2\u0b75"+
		"\u0b73\3\2\2\2\u0b75\u0b76\3\2\2\2\u0b76\u0b77\3\2\2\2\u0b77\u0b78\7U"+
		"\2\2\u0b78\u0c41\3\2\2\2\u0b79\u0b7a\t#\2\2\u0b7a\u0b7b\7\4\2\2\u0b7b"+
		"\u0b7c\5\u00f0y\2\u0b7c\u0b7d\7\25\2\2\u0b7d\u0b7e\5\u011a\u008e\2\u0b7e"+
		"\u0b7f\7\5\2\2\u0b7f\u0c41\3\2\2\2\u0b80\u0b81\7\u00fc\2\2\u0b81\u0b8a"+
		"\7\4\2\2\u0b82\u0b87\5\u00e4s\2\u0b83\u0b84\7\6\2\2\u0b84\u0b86\5\u00e4"+
		"s\2\u0b85\u0b83\3\2\2\2\u0b86\u0b89\3\2\2\2\u0b87\u0b85\3\2\2\2\u0b87"+
		"\u0b88\3\2\2\2\u0b88\u0b8b\3\2\2\2\u0b89\u0b87\3\2\2\2\u0b8a\u0b82\3\2"+
		"\2\2\u0b8a\u0b8b\3\2\2\2\u0b8b\u0b8c\3\2\2\2\u0b8c\u0c41\7\5\2\2\u0b8d"+
		"\u0b8e\7f\2\2\u0b8e\u0b8f\7\4\2\2\u0b8f\u0b92\5\u00f0y\2\u0b90\u0b91\7"+
		"x\2\2\u0b91\u0b93\7\u00ae\2\2\u0b92\u0b90\3\2\2\2\u0b92\u0b93\3\2\2\2"+
		"\u0b93\u0b94\3\2\2\2\u0b94\u0b95\7\5\2\2\u0b95\u0c41\3\2\2\2\u0b96\u0b97"+
		"\7\22\2\2\u0b97\u0b98\7\4\2\2\u0b98\u0b9b\5\u00f0y\2\u0b99\u0b9a\7x\2"+
		"\2\u0b9a\u0b9c\7\u00ae\2\2\u0b9b\u0b99\3\2\2\2\u0b9b\u0b9c\3\2\2\2\u0b9c"+
		"\u0b9d\3\2\2\2\u0b9d\u0b9e\7\5\2\2\u0b9e\u0c41\3\2\2\2\u0b9f\u0ba0\7\u0089"+
		"\2\2\u0ba0\u0ba1\7\4\2\2\u0ba1\u0ba4\5\u00f0y\2\u0ba2\u0ba3\7x\2\2\u0ba3"+
		"\u0ba5\7\u00ae\2\2\u0ba4\u0ba2\3\2\2\2\u0ba4\u0ba5\3\2\2\2\u0ba5\u0ba6"+
		"\3\2\2\2\u0ba6\u0ba7\7\5\2\2\u0ba7\u0c41\3\2\2\2\u0ba8\u0ba9\7\u00c6\2"+
		"\2\u0ba9\u0baa\7\4\2\2\u0baa\u0bab\5\u00f8}\2\u0bab\u0bac\7z\2\2\u0bac"+
		"\u0bad\5\u00f8}\2\u0bad\u0bae\7\5\2\2\u0bae\u0c41\3\2\2\2\u0baf\u0c41"+
		"\5\u00fe\u0080\2\u0bb0\u0c41\7\u013f\2\2\u0bb1\u0bb2\5\u0140\u00a1\2\u0bb2"+
		"\u0bb3\7\7\2\2\u0bb3\u0bb4\7\u013f\2\2\u0bb4\u0c41\3\2\2\2\u0bb5\u0bb6"+
		"\7\4\2\2\u0bb6\u0bbb\5\u00e4s\2\u0bb7\u0bb8\7\6\2\2\u0bb8\u0bba\5\u00e4"+
		"s\2\u0bb9\u0bb7\3\2\2\2\u0bba\u0bbd\3\2\2\2\u0bbb\u0bb9\3\2\2\2\u0bbb"+
		"\u0bbc\3\2\2\2\u0bbc\u0bbe\3\2\2\2\u0bbd\u0bbb\3\2\2\2\u0bbe\u0bbf\7\5"+
		"\2\2\u0bbf\u0c41\3\2\2\2\u0bc0\u0bc1\7\4\2\2\u0bc1\u0bc2\5&\24\2\u0bc2"+
		"\u0bc3\7\5\2\2\u0bc3\u0c41\3\2\2\2\u0bc4\u0bc5\5\u013e\u00a0\2\u0bc5\u0bd1"+
		"\7\4\2\2\u0bc6\u0bc8\5\u00b0Y\2\u0bc7\u0bc6\3\2\2\2\u0bc7\u0bc8\3\2\2"+
		"\2\u0bc8\u0bc9\3\2\2\2\u0bc9\u0bce\5\u00f0y\2\u0bca\u0bcb\7\6\2\2\u0bcb"+
		"\u0bcd\5\u00f0y\2\u0bcc\u0bca\3\2\2\2\u0bcd\u0bd0\3\2\2\2\u0bce\u0bcc"+
		"\3\2\2\2\u0bce\u0bcf\3\2\2\2\u0bcf\u0bd2\3\2\2\2\u0bd0\u0bce\3\2\2\2\u0bd1"+
		"\u0bc7\3\2\2\2\u0bd1\u0bd2\3\2\2\2\u0bd2\u0bd3\3\2\2\2\u0bd3\u0bda\7\5"+
		"\2\2\u0bd4\u0bd5\7d\2\2\u0bd5\u0bd6\7\4\2\2\u0bd6\u0bd7\7\u012d\2\2\u0bd7"+
		"\u0bd8\5\u00f4{\2\u0bd8\u0bd9\7\5\2\2\u0bd9\u0bdb\3\2\2\2\u0bda\u0bd4"+
		"\3\2\2\2\u0bda\u0bdb\3\2\2\2\u0bdb\u0bde\3\2\2\2\u0bdc\u0bdd\t$\2\2\u0bdd"+
		"\u0bdf\7\u00ae\2\2\u0bde\u0bdc\3\2\2\2\u0bde\u0bdf\3\2\2\2\u0bdf\u0be2"+
		"\3\2\2\2\u0be0\u0be1\7\u00ba\2\2\u0be1\u0be3\5\u0136\u009c\2\u0be2\u0be0"+
		"\3\2\2\2\u0be2\u0be3\3\2\2\2\u0be3\u0c41\3\2\2\2\u0be4\u0be5\5\u0146\u00a4"+
		"\2\u0be5\u0be6\7\u0148\2\2\u0be6\u0be7\5\u00f0y\2\u0be7\u0c41\3\2\2\2"+
		"\u0be8\u0be9\7\4\2\2\u0be9\u0bec\5\u0146\u00a4\2\u0bea\u0beb\7\6\2\2\u0beb"+
		"\u0bed\5\u0146\u00a4\2\u0bec\u0bea\3\2\2\2\u0bed\u0bee\3\2\2\2\u0bee\u0bec"+
		"\3\2\2\2\u0bee\u0bef\3\2\2\2\u0bef\u0bf0\3\2\2\2\u0bf0\u0bf1\7\5\2\2\u0bf1"+
		"\u0bf2\7\u0148\2\2\u0bf2\u0bf3\5\u00f0y\2\u0bf3\u0c41\3\2\2\2\u0bf4\u0c41"+
		"\5\u0146\u00a4\2\u0bf5\u0bf6\7\4\2\2\u0bf6\u0bf7\5\u00f0y\2\u0bf7\u0bf8"+
		"\7\5\2\2\u0bf8\u0c41\3\2\2\2\u0bf9\u0bfa\7`\2\2\u0bfa\u0bfb\7\4\2\2\u0bfb"+
		"\u0bfc\5\u0146\u00a4\2\u0bfc\u0bfd\7l\2\2\u0bfd\u0bfe\5\u00f8}\2\u0bfe"+
		"\u0bff\7\5\2\2\u0bff\u0c41\3\2\2\2\u0c00\u0c01\t%\2\2\u0c01\u0c02\7\4"+
		"\2\2\u0c02\u0c03\5\u00f8}\2\u0c03\u0c04\t&\2\2\u0c04\u0c07\5\u00f8}\2"+
		"\u0c05\u0c06\t\'\2\2\u0c06\u0c08\5\u00f8}\2\u0c07\u0c05\3\2\2\2\u0c07"+
		"\u0c08\3\2\2\2\u0c08\u0c09\3\2\2\2\u0c09\u0c0a\7\5\2\2\u0c0a\u0c41\3\2"+
		"\2\2\u0c0b\u0c0c\7\u0114\2\2\u0c0c\u0c0e\7\4\2\2\u0c0d\u0c0f\t(\2\2\u0c0e"+
		"\u0c0d\3\2\2\2\u0c0e\u0c0f\3\2\2\2\u0c0f\u0c11\3\2\2\2\u0c10\u0c12\5\u00f8"+
		"}\2\u0c11\u0c10\3\2\2\2\u0c11\u0c12\3\2\2\2\u0c12\u0c13\3\2\2\2\u0c13"+
		"\u0c14\7l\2\2\u0c14\u0c15\5\u00f8}\2\u0c15\u0c16\7\5\2\2\u0c16\u0c41\3"+
		"\2\2\2\u0c17\u0c18\7\u00bc\2\2\u0c18\u0c19\7\4\2\2\u0c19\u0c1a\5\u00f8"+
		"}\2\u0c1a\u0c1b\7\u00c5\2\2\u0c1b\u0c1c\5\u00f8}\2\u0c1c\u0c1d\7l\2\2"+
		"\u0c1d\u0c20\5\u00f8}\2\u0c1e\u0c1f\7h\2\2\u0c1f\u0c21\5\u00f8}\2\u0c20"+
		"\u0c1e\3\2\2\2\u0c20\u0c21\3\2\2\2\u0c21\u0c22\3\2\2\2\u0c22\u0c23\7\5"+
		"\2\2\u0c23\u0c41\3\2\2\2\u0c24\u0c25\t)\2\2\u0c25\u0c26\7\4\2\2\u0c26"+
		"\u0c27\5\u00f8}\2\u0c27\u0c28\7\5\2\2\u0c28\u0c29\7\u0130\2\2\u0c29\u0c2a"+
		"\7r\2\2\u0c2a\u0c2b\7\4\2\2\u0c2b\u0c2c\7\u00b6\2\2\u0c2c\u0c2d\7\35\2"+
		"\2\u0c2d\u0c2e\5^\60\2\u0c2e\u0c35\7\5\2\2\u0c2f\u0c30\7d\2\2\u0c30\u0c31"+
		"\7\4\2\2\u0c31\u0c32\7\u012d\2\2\u0c32\u0c33\5\u00f4{\2\u0c33\u0c34\7"+
		"\5\2\2\u0c34\u0c36\3\2\2\2\u0c35\u0c2f\3\2\2\2\u0c35\u0c36\3\2\2\2\u0c36"+
		"\u0c39\3\2\2\2\u0c37\u0c38\7\u00ba\2\2\u0c38\u0c3a\5\u0136\u009c\2\u0c39"+
		"\u0c37\3\2\2\2\u0c39\u0c3a\3\2\2\2\u0c3a\u0c41\3\2\2\2\u0c3b\u0c3c\7\u0134"+
		"\2\2\u0c3c\u0c3d\7\4\2\2\u0c3d\u0c3e\5\u00f0y\2\u0c3e\u0c3f\7\5\2\2\u0c3f"+
		"\u0c41\3\2\2\2\u0c40\u0b4c\3\2\2\2\u0c40\u0b4e\3\2\2\2\u0c40\u0b57\3\2"+
		"\2\2\u0c40\u0b60\3\2\2\2\u0c40\u0b6c\3\2\2\2\u0c40\u0b79\3\2\2\2\u0c40"+
		"\u0b80\3\2\2\2\u0c40\u0b8d\3\2\2\2\u0c40\u0b96\3\2\2\2\u0c40\u0b9f\3\2"+
		"\2\2\u0c40\u0ba8\3\2\2\2\u0c40\u0baf\3\2\2\2\u0c40\u0bb0\3\2\2\2\u0c40"+
		"\u0bb1\3\2\2\2\u0c40\u0bb5\3\2\2\2\u0c40\u0bc0\3\2\2\2\u0c40\u0bc4\3\2"+
		"\2\2\u0c40\u0be4\3\2\2\2\u0c40\u0be8\3\2\2\2\u0c40\u0bf4\3\2\2\2\u0c40"+
		"\u0bf5\3\2\2\2\u0c40\u0bf9\3\2\2\2\u0c40\u0c00\3\2\2\2\u0c40\u0c0b\3\2"+
		"\2\2\u0c40\u0c17\3\2\2\2\u0c40\u0c24\3\2\2\2\u0c40\u0c3b\3\2\2\2\u0c41"+
		"\u0c4c\3\2\2\2\u0c42\u0c43\f\f\2\2\u0c43\u0c44\7\b\2\2\u0c44\u0c45\5\u00f8"+
		"}\2\u0c45\u0c46\7\t\2\2\u0c46\u0c4b\3\2\2\2\u0c47\u0c48\f\n\2\2\u0c48"+
		"\u0c49\7\7\2\2\u0c49\u0c4b\5\u0146\u00a4\2\u0c4a\u0c42\3\2\2\2\u0c4a\u0c47"+
		"\3\2\2\2\u0c4b\u0c4e\3\2\2\2\u0c4c\u0c4a\3\2\2\2\u0c4c\u0c4d\3\2\2\2\u0c4d"+
		"\u00fd\3\2\2\2\u0c4e\u0c4c\3\2\2\2\u0c4f\u0c5e\7\u00ad\2\2\u0c50\u0c51"+
		"\7\u0147\2\2\u0c51\u0c5e\5\u0146\u00a4\2\u0c52\u0c5e\5\u0108\u0085\2\u0c53"+
		"\u0c54\5\u0146\u00a4\2\u0c54\u0c55\5\u0152\u00aa\2\u0c55\u0c5e\3\2\2\2"+
		"\u0c56\u0c5e\5\u014e\u00a8\2\u0c57\u0c5e\5\u0106\u0084\2\u0c58\u0c5a\5"+
		"\u0152\u00aa\2\u0c59\u0c58\3\2\2\2\u0c5a\u0c5b\3\2\2\2\u0c5b\u0c59\3\2"+
		"\2\2\u0c5b\u0c5c\3\2\2\2\u0c5c\u0c5e\3\2\2\2\u0c5d\u0c4f\3\2\2\2\u0c5d"+
		"\u0c50\3\2\2\2\u0c5d\u0c52\3\2\2\2\u0c5d\u0c53\3\2\2\2\u0c5d\u0c56\3\2"+
		"\2\2\u0c5d\u0c57\3\2\2\2\u0c5d\u0c59\3\2\2\2\u0c5e\u00ff\3\2\2\2\u0c5f"+
		"\u0c60\t*\2\2\u0c60\u0101\3\2\2\2\u0c61\u0c62\t+\2\2\u0c62\u0103\3\2\2"+
		"\2\u0c63\u0c64\t,\2\2\u0c64\u0105\3\2\2\2\u0c65\u0c66\t-\2\2\u0c66\u0107"+
		"\3\2\2\2\u0c67\u0c6a\7\u0083\2\2\u0c68\u0c6b\5\u010a\u0086\2\u0c69\u0c6b"+
		"\5\u010e\u0088\2\u0c6a\u0c68\3\2\2\2\u0c6a\u0c69\3\2\2\2\u0c6a\u0c6b\3"+
		"\2\2\2\u0c6b\u0109\3\2\2\2\u0c6c\u0c6e\5\u010c\u0087\2\u0c6d\u0c6f\5\u0110"+
		"\u0089\2\u0c6e\u0c6d\3\2\2\2\u0c6e\u0c6f\3\2\2\2\u0c6f\u010b\3\2\2\2\u0c70"+
		"\u0c71\5\u0112\u008a\2\u0c71\u0c72\5\u0114\u008b\2\u0c72\u0c74\3\2\2\2"+
		"\u0c73\u0c70\3\2\2\2\u0c74\u0c75\3\2\2\2\u0c75\u0c73\3\2\2\2\u0c75\u0c76"+
		"\3\2\2\2\u0c76\u010d\3\2\2\2\u0c77\u0c7a\5\u0110\u0089\2\u0c78\u0c7b\5"+
		"\u010c\u0087\2\u0c79\u0c7b\5\u0110\u0089\2\u0c7a\u0c78\3\2\2\2\u0c7a\u0c79"+
		"\3\2\2\2\u0c7a\u0c7b\3\2\2\2\u0c7b\u010f\3\2\2\2\u0c7c\u0c7d\5\u0112\u008a"+
		"\2\u0c7d\u0c7e\5\u0116\u008c\2\u0c7e\u0c7f\7\u010e\2\2\u0c7f\u0c80\5\u0116"+
		"\u008c\2\u0c80\u0111\3\2\2\2\u0c81\u0c83\t.\2\2\u0c82\u0c81\3\2\2\2\u0c82"+
		"\u0c83\3\2\2\2\u0c83\u0c87\3\2\2\2\u0c84\u0c88\7\u0150\2\2\u0c85\u0c88"+
		"\7\u0152\2\2\u0c86\u0c88\5\u0152\u00aa\2\u0c87\u0c84\3\2\2\2\u0c87\u0c85"+
		"\3\2\2\2\u0c87\u0c86\3\2\2\2\u0c88\u0113\3\2\2\2\u0c89\u0c8a\t/\2\2\u0c8a"+
		"\u0115\3\2\2\2\u0c8b\u0c8c\t\60\2\2\u0c8c\u0117\3\2\2\2\u0c8d\u0c91\7"+
		"f\2\2\u0c8e\u0c8f\7\13\2\2\u0c8f\u0c91\5\u0142\u00a2\2\u0c90\u0c8d\3\2"+
		"\2\2\u0c90\u0c8e\3\2\2\2\u0c91\u0119\3\2\2\2\u0c92\u0c93\7\24\2\2\u0c93"+
		"\u0c94\7\u0139\2\2\u0c94\u0c95\5\u011a\u008e\2\u0c95\u0c96\7\u013b\2\2"+
		"\u0c96\u0cc1\3\2\2\2\u0c97\u0c98\7\u009a\2\2\u0c98\u0c99\7\u0139\2\2\u0c99"+
		"\u0c9a\5\u011a\u008e\2\u0c9a\u0c9b\7\6\2\2\u0c9b\u0c9c\5\u011a\u008e\2"+
		"\u0c9c\u0c9d\7\u013b\2\2\u0c9d\u0cc1\3\2\2\2\u0c9e\u0ca5\7\u00fc\2\2\u0c9f"+
		"\u0ca1\7\u0139\2\2\u0ca0\u0ca2\5\u012c\u0097\2\u0ca1\u0ca0\3\2\2\2\u0ca1"+
		"\u0ca2\3\2\2\2\u0ca2\u0ca3\3\2\2\2\u0ca3\u0ca6\7\u013b\2\2\u0ca4\u0ca6"+
		"\7\u0137\2\2\u0ca5\u0c9f\3\2\2\2\u0ca5\u0ca4\3\2\2\2\u0ca6\u0cc1\3\2\2"+
		"\2\u0ca7\u0ca8\7\u0083\2\2\u0ca8\u0cab\t\61\2\2\u0ca9\u0caa\7\u010e\2"+
		"\2\u0caa\u0cac\7\u00a3\2\2\u0cab\u0ca9\3\2\2\2\u0cab\u0cac\3\2\2\2\u0cac"+
		"\u0cc1\3\2\2\2\u0cad\u0cae\7\u0083\2\2\u0cae\u0cb1\t\62\2\2\u0caf\u0cb0"+
		"\7\u010e\2\2\u0cb0\u0cb2\t\63\2\2\u0cb1\u0caf\3\2\2\2\u0cb1\u0cb2\3\2"+
		"\2\2\u0cb2\u0cc1\3\2\2\2\u0cb3\u0cbe\5\u0146\u00a4\2\u0cb4\u0cb5\7\4\2"+
		"\2\u0cb5\u0cba\7\u0150\2\2\u0cb6\u0cb7\7\6\2\2\u0cb7\u0cb9\7\u0150\2\2"+
		"\u0cb8\u0cb6\3\2\2\2\u0cb9\u0cbc\3\2\2\2\u0cba\u0cb8\3\2\2\2\u0cba\u0cbb"+
		"\3\2\2\2\u0cbb\u0cbd\3\2\2\2\u0cbc\u0cba\3\2\2\2\u0cbd\u0cbf\7\5\2\2\u0cbe"+
		"\u0cb4\3\2\2\2\u0cbe\u0cbf\3\2\2\2\u0cbf\u0cc1\3\2\2\2\u0cc0\u0c92\3\2"+
		"\2\2\u0cc0\u0c97\3\2\2\2\u0cc0\u0c9e\3\2\2\2\u0cc0\u0ca7\3\2\2\2\u0cc0"+
		"\u0cad\3\2\2\2\u0cc0\u0cb3\3\2\2\2\u0cc1\u011b\3\2\2\2\u0cc2\u0cc7\5\u011e"+
		"\u0090\2\u0cc3\u0cc4\7\6\2\2\u0cc4\u0cc6\5\u011e\u0090\2\u0cc5\u0cc3\3"+
		"\2\2\2\u0cc6\u0cc9\3\2\2\2\u0cc7\u0cc5\3\2\2\2\u0cc7\u0cc8\3\2\2\2\u0cc8"+
		"\u011d\3\2\2\2\u0cc9\u0cc7\3\2\2\2\u0cca\u0ccb\5\u00dan\2\u0ccb\u0cce"+
		"\5\u011a\u008e\2\u0ccc\u0ccd\7\u00ac\2\2\u0ccd\u0ccf\7\u00ad\2\2\u0cce"+
		"\u0ccc\3\2\2\2\u0cce\u0ccf\3\2\2\2\u0ccf\u0cd1\3\2\2\2\u0cd0\u0cd2\5\u0120"+
		"\u0091\2\u0cd1\u0cd0\3\2\2\2\u0cd1\u0cd2\3\2\2\2\u0cd2\u0cd4\3\2\2\2\u0cd3"+
		"\u0cd5\5$\23\2\u0cd4\u0cd3\3\2\2\2\u0cd4\u0cd5\3\2\2\2\u0cd5\u0cd7\3\2"+
		"\2\2\u0cd6\u0cd8\5\u0118\u008d\2\u0cd7\u0cd6\3\2\2\2\u0cd7\u0cd8\3\2\2"+
		"\2\u0cd8\u011f\3\2\2\2\u0cd9\u0cda\7G\2\2\u0cda\u0cdb\5\u00f0y\2\u0cdb"+
		"\u0121\3\2\2\2\u0cdc\u0ce1\5\u0124\u0093\2\u0cdd\u0cde\7\6\2\2\u0cde\u0ce0"+
		"\5\u0124\u0093\2\u0cdf\u0cdd\3\2\2\2\u0ce0\u0ce3\3\2\2\2\u0ce1\u0cdf\3"+
		"\2\2\2\u0ce1\u0ce2\3\2\2\2\u0ce2\u0123\3\2\2\2\u0ce3\u0ce1\3\2\2\2\u0ce4"+
		"\u0ce5\5\u0142\u00a2\2\u0ce5\u0ce8\5\u011a\u008e\2\u0ce6\u0ce7\7\u00ac"+
		"\2\2\u0ce7\u0ce9\7\u00ad\2\2\u0ce8\u0ce6\3\2\2\2\u0ce8\u0ce9\3\2\2\2\u0ce9"+
		"\u0ceb\3\2\2\2\u0cea\u0cec\5$\23\2\u0ceb\u0cea\3\2\2\2\u0ceb\u0cec\3\2"+
		"\2\2\u0cec\u0125\3\2\2\2\u0ced\u0cf2\5\u0128\u0095\2\u0cee\u0cef\7\6\2"+
		"\2\u0cef\u0cf1\5\u0128\u0095\2\u0cf0\u0cee\3\2\2\2\u0cf1\u0cf4\3\2\2\2"+
		"\u0cf2\u0cf0\3\2\2\2\u0cf2\u0cf3\3\2\2\2\u0cf3\u0127\3\2\2\2\u0cf4\u0cf2"+
		"\3\2\2\2\u0cf5\u0cf6\5\u0142\u00a2\2\u0cf6\u0cfa\5\u011a\u008e\2\u0cf7"+
		"\u0cf9\5\u012a\u0096\2\u0cf8\u0cf7\3\2\2\2\u0cf9\u0cfc\3\2\2\2\u0cfa\u0cf8"+
		"\3\2\2\2\u0cfa\u0cfb\3\2\2\2\u0cfb\u0129\3\2\2\2\u0cfc\u0cfa\3\2\2\2\u0cfd"+
		"\u0cfe\7\u00ac\2\2\u0cfe\u0d02\7\u00ad\2\2\u0cff\u0d02\5\u0120\u0091\2"+
		"\u0d00\u0d02\5$\23\2\u0d01\u0cfd\3\2\2\2\u0d01\u0cff\3\2\2\2\u0d01\u0d00"+
		"\3\2\2\2\u0d02\u012b\3\2\2\2\u0d03\u0d08\5\u012e\u0098\2\u0d04\u0d05\7"+
		"\6\2\2\u0d05\u0d07\5\u012e\u0098\2\u0d06\u0d04\3\2\2\2\u0d07\u0d0a\3\2"+
		"\2\2\u0d08\u0d06\3\2\2\2\u0d08\u0d09\3\2\2\2\u0d09\u012d\3\2\2\2\u0d0a"+
		"\u0d08\3\2\2\2\u0d0b\u0d0d\5\u0146\u00a4\2\u0d0c\u0d0e\7\u0147\2\2\u0d0d"+
		"\u0d0c\3\2\2\2\u0d0d\u0d0e\3\2\2\2\u0d0e\u0d0f\3\2\2\2\u0d0f\u0d12\5\u011a"+
		"\u008e\2\u0d10\u0d11\7\u00ac\2\2\u0d11\u0d13\7\u00ad\2\2\u0d12\u0d10\3"+
		"\2\2\2\u0d12\u0d13\3\2\2\2\u0d13\u0d15\3\2\2\2\u0d14\u0d16\5$\23\2\u0d15"+
		"\u0d14\3\2\2\2\u0d15\u0d16\3\2\2\2\u0d16\u012f\3\2\2\2\u0d17\u0d18\7\u012c"+
		"\2\2\u0d18\u0d19\5\u00f0y\2\u0d19\u0d1a\7\u0109\2\2\u0d1a\u0d1b\5\u00f0"+
		"y\2\u0d1b\u0131\3\2\2\2\u0d1c\u0d1d\7\u012e\2\2\u0d1d\u0d22\5\u0134\u009b"+
		"\2\u0d1e\u0d1f\7\6\2\2\u0d1f\u0d21\5\u0134\u009b\2\u0d20\u0d1e\3\2\2\2"+
		"\u0d21\u0d24\3\2\2\2\u0d22\u0d20\3\2\2\2\u0d22\u0d23\3\2\2\2\u0d23\u0133"+
		"\3\2\2\2\u0d24\u0d22\3\2\2\2\u0d25\u0d26\5\u0142\u00a2\2\u0d26\u0d27\7"+
		"\25\2\2\u0d27\u0d28\5\u0136\u009c\2\u0d28\u0135\3\2\2\2\u0d29\u0d58\5"+
		"\u0142\u00a2\2\u0d2a\u0d2b\7\4\2\2\u0d2b\u0d2c\5\u0142\u00a2\2\u0d2c\u0d2d"+
		"\7\5\2\2\u0d2d\u0d58\3\2\2\2\u0d2e\u0d51\7\4\2\2\u0d2f\u0d30\7\'\2\2\u0d30"+
		"\u0d31\7\35\2\2\u0d31\u0d36\5\u00f0y\2\u0d32\u0d33\7\6\2\2\u0d33\u0d35"+
		"\5\u00f0y\2\u0d34\u0d32\3\2\2\2\u0d35\u0d38\3\2\2\2\u0d36\u0d34\3\2\2"+
		"\2\u0d36\u0d37\3\2\2\2\u0d37\u0d52\3\2\2\2\u0d38\u0d36\3\2\2\2\u0d39\u0d3a"+
		"\t\64\2\2\u0d3a\u0d3b\7\35\2\2\u0d3b\u0d40\5\u00f0y\2\u0d3c\u0d3d\7\6"+
		"\2\2\u0d3d\u0d3f\5\u00f0y\2\u0d3e\u0d3c\3\2\2\2\u0d3f\u0d42\3\2\2\2\u0d40"+
		"\u0d3e\3\2\2\2\u0d40\u0d41\3\2\2\2\u0d41\u0d44\3\2\2\2\u0d42\u0d40\3\2"+
		"\2\2\u0d43\u0d39\3\2\2\2\u0d43\u0d44\3\2\2\2\u0d44\u0d4f\3\2\2\2\u0d45"+
		"\u0d46\t\65\2\2\u0d46\u0d47\7\35\2\2\u0d47\u0d4c\5^\60\2\u0d48\u0d49\7"+
		"\6\2\2\u0d49\u0d4b\5^\60\2\u0d4a\u0d48\3\2\2\2\u0d4b\u0d4e\3\2\2\2\u0d4c"+
		"\u0d4a\3\2\2\2\u0d4c\u0d4d\3\2\2\2\u0d4d\u0d50\3\2\2\2\u0d4e\u0d4c\3\2"+
		"\2\2\u0d4f\u0d45\3\2\2\2\u0d4f\u0d50\3\2\2\2\u0d50\u0d52\3\2\2\2\u0d51"+
		"\u0d2f\3\2\2\2\u0d51\u0d43\3\2\2\2\u0d52\u0d54\3\2\2\2\u0d53\u0d55\5\u0138"+
		"\u009d\2\u0d54\u0d53\3\2\2\2\u0d54\u0d55\3\2\2\2\u0d55\u0d56\3\2\2\2\u0d56"+
		"\u0d58\7\5\2\2\u0d57\u0d29\3\2\2\2\u0d57\u0d2a\3\2\2\2\u0d57\u0d2e\3\2"+
		"\2\2\u0d58\u0137\3\2\2\2\u0d59\u0d5a\7\u00ce\2\2\u0d5a\u0d6a\5\u013a\u009e"+
		"\2\u0d5b\u0d5c\7\u00e4\2\2\u0d5c\u0d6a\5\u013a\u009e\2\u0d5d\u0d5e\7\u00ce"+
		"\2\2\u0d5e\u0d5f\7\31\2\2\u0d5f\u0d60\5\u013a\u009e\2\u0d60\u0d61\7\17"+
		"\2\2\u0d61\u0d62\5\u013a\u009e\2\u0d62\u0d6a\3\2\2\2\u0d63\u0d64\7\u00e4"+
		"\2\2\u0d64\u0d65\7\31\2\2\u0d65\u0d66\5\u013a\u009e\2\u0d66\u0d67\7\17"+
		"\2\2\u0d67\u0d68\5\u013a\u009e\2\u0d68\u0d6a\3\2\2\2\u0d69\u0d59\3\2\2"+
		"\2\u0d69\u0d5b\3\2\2\2\u0d69\u0d5d\3\2\2\2\u0d69\u0d63\3\2\2\2\u0d6a\u0139"+
		"\3\2\2\2\u0d6b\u0d6c\7\u011a\2\2\u0d6c\u0d73\t\66\2\2\u0d6d\u0d6e\79\2"+
		"\2\u0d6e\u0d73\7\u00e3\2\2\u0d6f\u0d70\5\u00f0y\2\u0d70\u0d71\t\66\2\2"+
		"\u0d71\u0d73\3\2\2\2\u0d72\u0d6b\3\2\2\2\u0d72\u0d6d\3\2\2\2\u0d72\u0d6f"+
		"\3\2\2\2\u0d73\u013b\3\2\2\2\u0d74\u0d79\5\u0140\u00a1\2\u0d75\u0d76\7"+
		"\6\2\2\u0d76\u0d78\5\u0140\u00a1\2\u0d77\u0d75\3\2\2\2\u0d78\u0d7b\3\2"+
		"\2\2\u0d79\u0d77\3\2\2\2\u0d79\u0d7a\3\2\2\2\u0d7a\u013d\3\2\2\2\u0d7b"+
		"\u0d79\3\2\2\2\u0d7c\u0d81\5\u0140\u00a1\2\u0d7d\u0d81\7d\2\2\u0d7e\u0d81"+
		"\7\u008d\2\2\u0d7f\u0d81\7\u00dd\2\2\u0d80\u0d7c\3\2\2\2\u0d80\u0d7d\3"+
		"\2\2\2\u0d80\u0d7e\3\2\2\2\u0d80\u0d7f\3\2\2\2\u0d81\u013f\3\2\2\2\u0d82"+
		"\u0d87\5\u0146\u00a4\2\u0d83\u0d84\7\7\2\2\u0d84\u0d86\5\u0146\u00a4\2"+
		"\u0d85\u0d83\3\2\2\2\u0d86\u0d89\3\2\2\2\u0d87\u0d85\3\2\2\2\u0d87\u0d88"+
		"\3\2\2\2\u0d88\u0141\3\2\2\2\u0d89\u0d87\3\2\2\2\u0d8a\u0d8b\5\u0146\u00a4"+
		"\2\u0d8b\u0d8c\5\u0144\u00a3\2\u0d8c\u0143\3\2\2\2\u0d8d\u0d8e\7\u013e"+
		"\2\2\u0d8e\u0d90\5\u0146\u00a4\2\u0d8f\u0d8d\3\2\2\2\u0d90\u0d91\3\2\2"+
		"\2\u0d91\u0d8f\3\2\2\2\u0d91\u0d92\3\2\2\2\u0d92\u0d95\3\2\2\2\u0d93\u0d95"+
		"\3\2\2\2\u0d94\u0d8f\3\2\2\2\u0d94\u0d93\3\2\2\2\u0d95\u0145\3\2\2\2\u0d96"+
		"\u0d9a\5\u0148\u00a5\2\u0d97\u0d98\6\u00a4\22\2\u0d98\u0d9a\5\u015a\u00ae"+
		"\2\u0d99\u0d96\3\2\2\2\u0d99\u0d97\3\2\2\2\u0d9a\u0147\3\2\2\2\u0d9b\u0da2"+
		"\7\u0156\2\2\u0d9c\u0da2\5\u014a\u00a6\2\u0d9d\u0d9e\6\u00a5\23\2\u0d9e"+
		"\u0da2\5\u0158\u00ad\2\u0d9f\u0da0\6\u00a5\24\2\u0da0\u0da2\5\u015c\u00af"+
		"\2\u0da1\u0d9b\3\2\2\2\u0da1\u0d9c\3\2\2\2\u0da1\u0d9d\3\2\2\2\u0da1\u0d9f"+
		"\3\2\2\2\u0da2\u0149\3\2\2\2\u0da3\u0da7\7\u0157\2\2\u0da4\u0da5\6\u00a6"+
		"\25\2\u0da5\u0da7\7\u014c\2\2\u0da6\u0da3\3\2\2\2\u0da6\u0da4\3\2\2\2"+
		"\u0da7\u014b\3\2\2\2\u0da8\u0da9\7\u0157\2\2\u0da9\u014d\3\2\2\2\u0daa"+
		"\u0dac\6\u00a8\26\2\u0dab\u0dad\7\u013e\2\2\u0dac\u0dab\3\2\2\2\u0dac"+
		"\u0dad\3\2\2\2\u0dad\u0dae\3\2\2\2\u0dae\u0dd6\7\u0151\2\2\u0daf\u0db1"+
		"\6\u00a8\27\2\u0db0\u0db2\7\u013e\2\2\u0db1\u0db0\3\2\2\2\u0db1\u0db2"+
		"\3\2\2\2\u0db2\u0db3\3\2\2\2\u0db3\u0dd6\7\u0152\2\2\u0db4\u0db6\6\u00a8"+
		"\30\2\u0db5\u0db7\7\u013e\2\2\u0db6\u0db5\3\2\2\2\u0db6\u0db7\3\2\2\2"+
		"\u0db7\u0db8\3\2\2\2\u0db8\u0dd6\t\67\2\2\u0db9\u0dbb\7\u013e\2\2\u0dba"+
		"\u0db9\3\2\2\2\u0dba\u0dbb\3\2\2\2\u0dbb\u0dbc\3\2\2\2\u0dbc\u0dd6\7\u0150"+
		"\2\2\u0dbd\u0dbf\7\u013e\2\2\u0dbe\u0dbd\3\2\2\2\u0dbe\u0dbf\3\2\2\2\u0dbf"+
		"\u0dc0\3\2\2\2\u0dc0\u0dd6\7\u014d\2\2\u0dc1\u0dc3\7\u013e\2\2\u0dc2\u0dc1"+
		"\3\2\2\2\u0dc2\u0dc3\3\2\2\2\u0dc3\u0dc4\3\2\2\2\u0dc4\u0dd6\7\u014e\2"+
		"\2\u0dc5\u0dc7\7\u013e\2\2\u0dc6\u0dc5\3\2\2\2\u0dc6\u0dc7\3\2\2\2\u0dc7"+
		"\u0dc8\3\2\2\2\u0dc8\u0dd6\7\u014f\2\2\u0dc9\u0dcb\7\u013e\2\2\u0dca\u0dc9"+
		"\3\2\2\2\u0dca\u0dcb\3\2\2\2\u0dcb\u0dcc\3\2\2\2\u0dcc\u0dd6\7\u0154\2"+
		"\2\u0dcd\u0dcf\7\u013e\2\2\u0dce\u0dcd\3\2\2\2\u0dce\u0dcf\3\2\2\2\u0dcf"+
		"\u0dd0\3\2\2\2\u0dd0\u0dd6\7\u0153\2\2\u0dd1\u0dd3\7\u013e\2\2\u0dd2\u0dd1"+
		"\3\2\2\2\u0dd2\u0dd3\3\2\2\2\u0dd3\u0dd4\3\2\2\2\u0dd4\u0dd6\7\u0155\2"+
		"\2\u0dd5\u0daa\3\2\2\2\u0dd5\u0daf\3\2\2\2\u0dd5\u0db4\3\2\2\2\u0dd5\u0dba"+
		"\3\2\2\2\u0dd5\u0dbe\3\2\2\2\u0dd5\u0dc2\3\2\2\2\u0dd5\u0dc6\3\2\2\2\u0dd5"+
		"\u0dca\3\2\2\2\u0dd5\u0dce\3\2\2\2\u0dd5\u0dd2\3\2\2\2\u0dd6\u014f\3\2"+
		"\2\2\u0dd7\u0dd8\7\u0118\2\2\u0dd8\u0de3\5\u011a\u008e\2\u0dd9\u0de3\5"+
		"$\23\2\u0dda\u0de3\5\u0118\u008d\2\u0ddb\u0ddc\t8\2\2\u0ddc\u0ddd\7\u00ac"+
		"\2\2\u0ddd\u0de3\7\u00ad\2\2\u0dde\u0ddf\7\u00ef\2\2\u0ddf\u0de3\5\u0120"+
		"\u0091\2\u0de0\u0de1\7S\2\2\u0de1\u0de3\7G\2\2\u0de2\u0dd7\3\2\2\2\u0de2"+
		"\u0dd9\3\2\2\2\u0de2\u0dda\3\2\2\2\u0de2\u0ddb\3\2\2\2\u0de2\u0dde\3\2"+
		"\2\2\u0de2\u0de0\3\2\2\2\u0de3\u0151\3\2\2\2\u0de4\u0de8\7\u014b\2\2\u0de5"+
		"\u0de6\6\u00aa\31\2\u0de6\u0de8\7\u014c\2\2\u0de7\u0de4\3\2\2\2\u0de7"+
		"\u0de5\3\2\2\2\u0de8\u0153\3\2\2\2\u0de9\u0dec\5\u0152\u00aa\2\u0dea\u0dec"+
		"\7\u00ad\2\2\u0deb\u0de9\3\2\2\2\u0deb\u0dea\3\2\2\2\u0dec\u0155\3\2\2"+
		"\2\u0ded\u0df0\7\u0150\2\2\u0dee\u0df0\5\u0152\u00aa\2\u0def\u0ded\3\2"+
		"\2\2\u0def\u0dee\3\2\2\2\u0df0\u0157\3\2\2\2\u0df1\u0df2\t9\2\2\u0df2"+
		"\u0159\3\2\2\2\u0df3\u0df4\t:\2\2\u0df4\u015b\3\2\2\2\u0df5\u0df6\t;\2"+
		"\2\u0df6\u015d\3\2\2\2\u01d5\u0162\u017b\u0188\u018f\u0197\u0199\u01ad"+
		"\u01b1\u01b7\u01ba\u01bd\u01c4\u01c7\u01cb\u01ce\u01d5\u01e0\u01e2\u01ea"+
		"\u01ed\u01f1\u01f4\u01fa\u0205\u020b\u0210\u0232\u023f\u0258\u0261\u0265"+
		"\u026b\u026f\u0274\u027a\u0286\u028e\u0294\u02a1\u02a6\u02b6\u02bd\u02c1"+
		"\u02c7\u02d6\u02da\u02e0\u02e6\u02e9\u02ec\u02f2\u02f6\u02fe\u0300\u0309"+
		"\u030c\u0315\u031a\u0320\u0327\u032a\u0330\u033b\u033e\u0342\u0347\u034c"+
		"\u0353\u0356\u0359\u0360\u0365\u036e\u0376\u037c\u037f\u0382\u0388\u038c"+
		"\u0391\u0394\u0398\u039a\u03a2\u03aa\u03ad\u03b2\u03b8\u03be\u03c1\u03c5"+
		"\u03c8\u03cc\u03e8\u03eb\u03ef\u03f5\u03f8\u03fb\u0401\u0409\u040e\u0414"+
		"\u041a\u041d\u0424\u042b\u0433\u0444\u0452\u0455\u045b\u0464\u046d\u0475"+
		"\u047a\u047f\u0486\u048c\u0491\u0499\u049c\u04a0\u04ac\u04b0\u04b7\u052b"+
		"\u0533\u053b\u0544\u054e\u0552\u0555\u055b\u0561\u056d\u0579\u057e\u0587"+
		"\u058f\u0596\u0598\u059b\u05a0\u05a4\u05a9\u05ac\u05b1\u05ba\u05bf\u05c2"+
		"\u05c7\u05cb\u05d0\u05d2\u05d6\u05df\u05e7\u05ed\u05f8\u05ff\u0608\u060d"+
		"\u0610\u0626\u0628\u0631\u0638\u063b\u0642\u0646\u064c\u0654\u065f\u066a"+
		"\u0672\u0678\u0684\u068b\u0692\u069e\u06a6\u06ac\u06b2\u06b5\u06be\u06c1"+
		"\u06ca\u06cd\u06d6\u06d9\u06e2\u06e5\u06e8\u06ed\u06ef\u06f3\u06ff\u0706"+
		"\u070d\u0710\u0712\u071e\u0722\u0726\u072c\u0730\u0738\u073c\u073f\u0742"+
		"\u0745\u0749\u074d\u0752\u0756\u0759\u075c\u075f\u0763\u0768\u076c\u076f"+
		"\u0772\u0775\u0777\u077d\u0784\u0789\u078c\u078f\u0793\u079d\u07a1\u07a3"+
		"\u07a6\u07aa\u07b0\u07b4\u07bf\u07c9\u07cd\u07d9\u07e5\u07f4\u07f9\u07ff"+
		"\u0806\u0816\u081b\u0828\u082d\u0835\u083b\u083f\u0842\u0845\u084c\u0852"+
		"\u085b\u0865\u0874\u0879\u087b\u087f\u0888\u0895\u089a\u089e\u08a6\u08a9"+
		"\u08ad\u08bb\u08c8\u08cd\u08d1\u08d4\u08d8\u08de\u08e1\u08e8\u08f4\u08ff"+
		"\u090c\u0917\u091c\u0924\u0929\u0930\u0939\u093c\u0941\u0948\u094b\u0950"+
		"\u0956\u095c\u0961\u0965\u096b\u096f\u0972\u0977\u097a\u097f\u0983\u0986"+
		"\u0989\u098f\u0994\u099b\u099e\u09b0\u09b2\u09b5\u09c0\u09cb\u09d2\u09da"+
		"\u09e1\u09e5\u09e8\u09f0\u09f8\u09fe\u0a06\u0a12\u0a15\u0a1b\u0a1f\u0a21"+
		"\u0a2a\u0a36\u0a38\u0a3f\u0a46\u0a4c\u0a52\u0a54\u0a5b\u0a63\u0a6b\u0a71"+
		"\u0a76\u0a7d\u0a83\u0a87\u0a89\u0a90\u0a99\u0aa0\u0aaa\u0aaf\u0ab3\u0abc"+
		"\u0ac9\u0acb\u0ad3\u0ad5\u0ad9\u0ae1\u0aea\u0af0\u0af8\u0afd\u0b09\u0b0e"+
		"\u0b11\u0b17\u0b1b\u0b20\u0b25\u0b2a\u0b30\u0b45\u0b47\u0b64\u0b68\u0b71"+
		"\u0b75\u0b87\u0b8a\u0b92\u0b9b\u0ba4\u0bbb\u0bc7\u0bce\u0bd1\u0bda\u0bde"+
		"\u0be2\u0bee\u0c07\u0c0e\u0c11\u0c20\u0c35\u0c39\u0c40\u0c4a\u0c4c\u0c5b"+
		"\u0c5d\u0c6a\u0c6e\u0c75\u0c7a\u0c82\u0c87\u0c90\u0ca1\u0ca5\u0cab\u0cb1"+
		"\u0cba\u0cbe\u0cc0\u0cc7\u0cce\u0cd1\u0cd4\u0cd7\u0ce1\u0ce8\u0ceb\u0cf2"+
		"\u0cfa\u0d01\u0d08\u0d0d\u0d12\u0d15\u0d22\u0d36\u0d40\u0d43\u0d4c\u0d4f"+
		"\u0d51\u0d54\u0d57\u0d69\u0d72\u0d79\u0d80\u0d87\u0d91\u0d94\u0d99\u0da1"+
		"\u0da6\u0dac\u0db1\u0db6\u0dba\u0dbe\u0dc2\u0dc6\u0dca\u0dce\u0dd2\u0dd5"+
		"\u0de2\u0de7\u0deb\u0def";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}