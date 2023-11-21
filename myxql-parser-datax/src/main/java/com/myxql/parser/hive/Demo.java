package com.myxql.parser.hive;

import com.alibaba.fastjson2.JSON;
import com.myxql.parser.db.Platform;
import com.myxql.parser.hive.parser.MyHiveSQLParser;
import com.myxql.parser.model.*;

import java.util.List;
import java.util.Optional;

/**
 * @program: myxql
 * @description:
 * @author: liuningbo
 * @create: 2023/11/15 13:21
 */
public class Demo {
    public static void main(String[] args) {
        String sql = "INSERT INTO TABLE db_test.table_result SELECT t1.id, name FROM ( SELECT id1 + id2 AS id FROM db_test.table1 ) t1 LEFT JOIN ( SELECT id, name FROM ( SELECT id, sourcename AS name FROM db_test.table2 ) ) t2 ON t1.id=t2.id";

        //    sql =
        //        "INSERT INTO TABLE db_test.table_result SELECT DISTINCT mobile distinct_id ,  \n"
        //            + "           CASE WHEN t2.org_name=\"V上海自贸区\"  THEN 1\n"
        //            + "                ELSE 0\n"
        //            + "            end tag_value,from_unixtime(unix_timestamp(),'yyyy-MM-dd')
        // base_day\n"
        //            + "from  \n"
        //            + "(select mobile,case when length(org_code) < 8 then concat('0',org_code)  else
        // org_code  end  as org_code  from bhyh.customer\n"
        //            + "union\n"
        //            + "select mobile,case when length(org_code) < 8 then concat('0',org_code)  else
        // org_code end as org_code from bhyh.new_customer\n"
        //            + ") t1\n"
        //            + "inner JOIN bhyh.org t2\n"
        //            + "on t1.org_code=t2.org_code  ";

        sql =
                "INSERT INTO TABLE db_test.table_result " +
                        "select distinct m1.mobile_t1 distinct_id,\n" +
                        "case when m1.mobile_t2 is null then 1\n" +
                        "when m1.mobile_t2 is not null then 2 \n" +
                        "else 0 end tag_value,from_unixtime(unix_timestamp(),'yyyy-MM-dd') base_day \n" +
                        "from\n" +
                        "(select t1.mobile mobile_t1,t2.mobile mobile_t2 from bhyh.customer  t1  \n" +
                        "left join \n" +
                        "(select mobile from bhyh.customer group by mobile having count(1) >1) t2\n" +
                        "on t1.mobile = t2.mobile\n" +
                        ") m1\n" +
                        "left join \n" +
                        "(SELECT * from (SELECT cif,mobile, row_number() over (PARTITION BY cif ORDER BY create_time DESC) rm \n" +
                        "                from bhyh.customer) ct WHERE ct.rm =1 )  m2\n" +
                        "on m1.mobile_t1= m2.mobile\n" +
                        "where m2.mobile is not null ";


//        System.out.println(sql.length());
        MyHiveSQLParser parserService = new MyHiveSQLParser(Platform.hive.getPlatform());
//        StatementLineage data = parserService.parseSqlTableLineage(sql);
//        System.out.println(JSON.toJSONString(data));

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
