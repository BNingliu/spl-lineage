package com.myxql.parser.datax;


import com.myxql.parser.datax.enums.SqlEngineEnum;
import com.myxql.parser.datax.parser.MyHiveSqlParser;

/**
 * @ClassName SqlParserFactory
 * @description:
 * @author: again
 * @Date: 2021/3/10 4:21 下午
 */
public class SqlParserFactory {

    public static SqlParserService getParser(SqlEngineEnum sqlEngineEnum) {
        if (SqlEngineEnum.HIVE.equals(sqlEngineEnum)) {
            return new MyHiveSqlParser();
        }
        throw new RuntimeException("db type is not support");
    }
}
