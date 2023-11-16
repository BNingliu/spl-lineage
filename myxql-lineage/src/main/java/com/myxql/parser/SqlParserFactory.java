package com.myxql.parser;

import com.myxql.parser.hive.parser.MyHiveSQLParser;
import com.myxql.parser.spark.parser.MySparkSQLParser;

/**
 * @ClassName SqlParserFactory
 * @description:
 * @Date: 2023/2/16
 */
public class SqlParserFactory {

    public static SqlParserService getParser(EngineTypeEnum dbTypeEnum) {
        if (EngineTypeEnum.SPARK.equals(dbTypeEnum)) {
            return new MySparkSQLParser();
        } else if (EngineTypeEnum.HIVE.equals(dbTypeEnum)) {
            return new MyHiveSQLParser();
//        } else if (SqlEngineEnum.MYSQL.equals(sqlEngineEnum)) {
//            return new MysqlSqlParser();
//        } else if (EngineTypeEnum.PRESTO.equals(dbTypeEnum)) {
//            return new MyPresoSqlParser();
        }
        throw new RuntimeException("db type is not support");
    }
}
