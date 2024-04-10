package com.myxql.parser;

import com.myxql.parser.clickhouse.parser.ClickHouseSQLParser;
import com.myxql.parser.datax.DataxParser;
import com.myxql.parser.db.Platform;
import com.myxql.parser.hive.parser.DataSQLParser;
import com.myxql.parser.postgresql.parser.MyPostgreSQLParser;
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
        }   else if (Platform.qianbase.getPlatform()==dbType) {
            return new DataSQLParser(dbType,relationship);
        }else if (Platform.ClickHouse.getPlatform()==dbType) {
            return new ClickHouseSQLParser(dbType,relationship);
        }else if (Platform.teledb.getPlatform()==dbType) {
            return new MyPostgreSQLParser(dbType,relationship);
        }else if (Platform.datax.getPlatform()==(dbType)) {
            return new DataxParser(relationship);
//        } else if (EngineTypeEnum.PRESTO.equals(dbTypeEnum)) {
//            return new MyPresoSqlParser();
        }

        throw new RuntimeException("db type is not support");
    }
}
