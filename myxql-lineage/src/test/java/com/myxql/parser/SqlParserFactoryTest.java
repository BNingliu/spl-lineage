package com.myxql.parser;

import com.alibaba.fastjson2.JSON;
import com.myxql.parser.db.Platform;
import com.myxql.parser.model.StatementLineage;
import org.junit.Test;

public class SqlParserFactoryTest {
  public static void main(String[] args) {
      String sql = "INSERT INTO TABLE db_test.table_result SELECT t1.id, name FROM ( SELECT id1 + id2 AS id FROM db_test.table1 ) t1 LEFT JOIN ( SELECT id, name FROM ( SELECT id, sourcename AS name FROM db_test.table2 ) ) t2 ON t1.id=t2.id";

      SqlParserService parserService = SqlParserFactory.getParser(Platform.hive.getPlatform(),1);
      StatementLineage data = parserService.parseSqlTableLineage(sql);
      System.out.println(JSON.toJSONString(data));

  }
}
