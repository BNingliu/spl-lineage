package com.myxql.parser;

import com.myxql.parser.db.Platform;
import com.myxql.parser.hive.parser.DataSQLParser;
import com.myxql.parser.spark.parser.MySparkSQLParser;

/**
 * @ClassName SqlParserFactory
 * @description:
 * @Date: 2023/2/16
 */
public class SqlParserFactory {

    public static SqlParserService getParser(Integer dbType,Integer relationship) {
        if (Platform.spark.getPlatform()==dbType) {
            return new MySparkSQLParser();
        } else if (Platform.hive.getPlatform()==dbType) {
            return new DataSQLParser(dbType,relationship);
        } else if (Platform.impala.getPlatform()==dbType) {
            return new DataSQLParser(dbType,relationship);
//        } else if (SqlEngineEnum.MYSQL.equals(sqlEngineEnum)) {
//            return new MysqlSqlParser();
//        } else if (EngineTypeEnum.PRESTO.equals(dbTypeEnum)) {
//            return new MyPresoSqlParser();
        }

        throw new RuntimeException("db type is not support");
    }
}
