package com.myxql.parser;

import com.myxql.parser.model.ColumnLineage;
import com.myxql.parser.model.MultiStatementLineage;
import com.myxql.parser.model.StatementLineage;

import java.util.List;

/**
 * @ClassName SqlParserAbstractFactory
 * @description:
 * @Date: 2023/2/16
 */
public abstract class SqlParserAbstract implements SqlParserService {

//    public static final Logger logger = LoggerFactory.getLogger(SqlParserAbstract.class);

    private void notSupport(String msg) {
//        logger.error("not support {}", msg);
    }

    @Override
    public SqlTypeEnum parseSqlType(String sql) {
        notSupport("parseSqlType");
        return null;
    }

    @Override
    public String parseSqlFormatter(String sql) {
        notSupport("parseSqlFormatter");
        return null;
    }

    @Override
    public StatementLineage parseSqlTableLineage(String sql) {
        notSupport("parseSqlTableLineage");
        return null;
    }

    @Override
    public MultiStatementLineage parseMultiSqlTableLineage(String sql) {
        notSupport("parseMultiSqlTableLineage");
        return null;
    }

    @Override
    public StatementLineage parseSqlFieldLineage(String sql) {
        notSupport("parseSqlFieldLineage");
        return null;
    }

    @Override
    public List<ColumnLineage> parseSqlFieldLineage2(String sql) {
        notSupport("parseSqlFieldLineage");
        return null;
    }
}
