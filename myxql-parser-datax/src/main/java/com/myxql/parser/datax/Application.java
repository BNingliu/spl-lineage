package com.myxql.parser.datax;


import com.alibaba.fastjson2.JSON;
import com.myxql.parser.datax.enums.SqlEngineEnum;

/**
 * @author: again
 */
public class Application {
    public static void main(String[] args) {
        SqlParserService parserService = SqlParserFactory.getParser(SqlEngineEnum.HIVE);
        String sql = "INSERT INTO TABLE db_test.table_result SELECT t1.id, t2.name FROM ( SELECT id1 + id2 AS id FROM db_test.table1 ) t1 LEFT JOIN ( SELECT id, name FROM ( SELECT id, sourcename AS name FROM db_test.table2 ) ) t2 ON t1.id=t2.id";
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
//        System.out.println("sql类型");
//        System.out.println(parserService.parseSqlType(sql));
//        System.out.println("\n");

        System.out.println("sql格式化");
        System.out.println(parserService.parseSqlFormatter(sql));
        System.out.println("\n");

        System.out.println("表血缘");
        System.out.println(JSON.toJSONString(parserService.parseSqlTableLineage(sql)));
        System.out.println("\n");

        System.out.println("字段血源");
        System.out.println(JSON.toJSONString(parserService.parseSqlFieldLineage(sql)));
        System.out.println("\n");
//
//        String createSql = "CREATE TABLE db1.table1 (id number comment 'id', name string comment '姓名', age number)";
//        System.out.println("元数据");
//        System.out.println(JSON.toJSONString(parserService.parseSqlMetadata(createSql)));
//        System.out.println("\n");

    }
}
