package com.myxql.parser.mysql;

import com.alibaba.fastjson.JSON;
import com.myxql.parser.model.*;
import com.myxql.parser.mysql.parser.MySqlSQLParser;

import java.util.List;
import java.util.Optional;

/**
 * @program: myxql
 * @description:
 * @author: liuningbo
 * @create: 2023/11/15 13:21
 */
public class Demo2 {
  public static void main(String[] args) {
      String sql = "INSERT INTO TABLE db_test.table_result SELECT t1.id, name FROM ( SELECT id1 + id2 AS id FROM db_test.table1 ) t1 LEFT JOIN ( SELECT id, name FROM ( SELECT id, sourcename AS name FROM db_test.table2 ) ) t2 ON t1.id=t2.id";

      sql =
              "insert into users db_test.table_result SELECT \n"
                      + " count( DISTINCT t1.cif) from \n"
                      + " (SELECT  cif,average_monthly,org_code,create_time from \n"
                      + "(SELECT cif,mobile,average_monthly,org_code,create_time,row_number() OVER (PARTITION BY cif ORDER BY cast(average_monthly as FLOAT) DESC ) rm \n"
                      + "from bhyh.average_monthly_assets WHERE create_time>=substr(regexp_replace(cast(add_months(current_timestamp(), -4) as string),'-',''),1,6) )ct  WHERE ct.rm=1 ) t1\n"
                      + "inner join \n"
                      + "(SELECT cif,average_monthly,org_code,create_time from (\n"
                      + "SELECT cif,mobile,average_monthly,org_code,create_time,row_number() OVER (PARTITION BY cif ORDER BY cast(average_monthly as FLOAT) DESC ) rm\n"
                      + "from bhyh.average_monthly_assets WHERE  create_time <=substr(regexp_replace(cast(add_months(current_timestamp(), -5) as string),'-',''),1,6) )ct  WHERE ct.rm=1 ) t2\n"
                      + "on t1.cif=t2.cif\n"
                      + "\n"
                      + "WHERE  cast(t1.average_monthly as FLOAT)<100000 \n"
                      + "and cast(t2.average_monthly as FLOAT)>=100000";
      MySqlSQLParser parserService = new MySqlSQLParser();
      StatementLineage data = parserService.parseSqlTableLineage(sql);
      System.out.println(JSON.toJSONString(data));

// 输入的SQL语句
//       sql = "INSERT INTO TABLE db_test.table_result(idd, name) SELECT t1.id, name_x FROM ( SELECT id1 + id2 AS id FROM db_test.table1 ) t1 LEFT JOIN ( SELECT id, name_x FROM ( SELECT id, sourcename AS name_x FROM db_test.table2 ) ) t2 ON t1.id=t2.id";
       // 解析字段血缘
      StatementLineage statementLineage = parserService.parseSqlFieldLineage(sql);
// 解析语句，返回语句血缘数据
      Optional<Statement> statement = statementLineage.getStatement();
      StatementType type = statementLineage.getType();
      // 获取语句类型

      System.out.println(type);
    statement.map(
        stmt -> {
          if (stmt instanceof TableData) {
            TableData tableData = (TableData) stmt;
            // 字段血缘数据
            List<ColumnLineage> columnLineageList = tableData.getColumnDatas().get();
              System.out.println(JSON.toJSONString(columnLineageList));

//            // 字段血缘列表
//            System.out.println(columnLineageList.size());
//              // 字段来源
//
//              System.out.println(columnLineageList.get(0).getSourceFields().size());
//              System.out.println( columnLineageList.get(1).getSourceFields().size());

          }
          return null;
        });
  }
}
