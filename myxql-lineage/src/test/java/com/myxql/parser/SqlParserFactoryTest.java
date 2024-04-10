package com.myxql.parser;

import com.alibaba.fastjson2.JSON;
import com.myxql.parser.db.Platform;
import com.myxql.parser.model.StatementLineage;

public class SqlParserFactoryTest {
  public static void main(String[] args) {
      String sql = "SELECT t1.id, name FROM ( SELECT id1 + id2 AS id FROM db_test.table1 ) t1 LEFT JOIN ( SELECT id, name FROM ( SELECT id, sourcename AS name FROM db_test.table2 ) ) t2 ON t1.id=t2.id";
//      sql="INSERT INTO TABLE db_test.table_result SELECT  userid AS distinct_id, province AS tag_value,xx AS base_day FROM  tag_source.tag_import ";
//      sql="select id as distinct_id,age as tag_value, current_date as base_day from public.customer  where dd='你好' and xs='wobuhai' ";

      sql="select id as distinct_id ,activity_type as tag_value ,pow(2,2) as base_day from public.ods_activity_main";
      SqlParserService parserService = SqlParserFactory.getParser(Platform.teledb.getPlatform(),1);
      StatementLineage data = parserService.parseSqlTableLineage(sql);

//      List<ColumnLineage> columnLineages = parserService.parseSqlFieldLineage2(sql);
      System.out.println(JSON.toJSONString(data));
//      System.out.println(JSON.toJSONString(columnLineages));

  }
}
