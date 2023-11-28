package com.myxql.parser;

import com.myxql.parser.model.ColumnLineage;
import com.myxql.parser.model.MultiStatementLineage;
import com.myxql.parser.model.StatementLineage;

import java.util.List;

/**
 * SqlParserService
 * description: sql解析接口
 * Date: 2023/2/16
 */
public interface SqlParserService {
    /**
     * 获取sql类型
     */
    SqlTypeEnum parseSqlType(String sql);

    /**
     * sql格式化
     */
    String parseSqlFormatter(String sql);

    /**
     * sql解析表元数据
     */
    StatementLineage parseSqlTableLineage(String sql);

    /**
     * sql解析表元数据，支持多条语句
     */
    MultiStatementLineage parseMultiSqlTableLineage(String sql);

    /**
     * sql解析字段元数据
     */
    StatementLineage parseSqlFieldLineage(String sql);

    List<ColumnLineage> parseSqlFieldLineage2(String sql);

}
