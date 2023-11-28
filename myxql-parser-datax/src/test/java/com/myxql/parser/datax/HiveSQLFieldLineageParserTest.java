package com.myxql.parser.datax;//package com.myxql.parser.hive;
//
//import com.myxql.parser.SqlParserService;
//import com.myxql.parser.hive.parser.MyHiveSQLParser;
//import com.myxql.parser.model.*;
//import org.junit.Assert;
//import org.junit.Test;
//
//import java.util.List;
//import java.util.Optional;
//
//public class HiveSQLFieldLineageParserTest {
//    private SqlParserService parserService = new MyHiveSQLParser();
///*
//    @Test
//    public void insertQueryTest1() {
//        String sql = "INSERT INTO TABLE db_test.table_result(idd, name) SELECT t1.id, name_x FROM ( SELECT id1 + id2 AS id FROM db_test.table1 ) t1 LEFT JOIN ( SELECT id, name_x FROM ( SELECT id, sourcename AS name_x FROM db_test.table2 ) ) t2 ON t1.id=t2.id";
//
//        StatementLineage statementLineage = parserService.parseSqlFieldLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        Assert.assertEquals(StatementType.INSERT_SELECT, statementLineage.getType());
//        statement.map(stmt -> {
//            if (stmt instanceof TableData) {
//                TableData tableData = (TableData) stmt;
//                List<ColumnLineage> columnLineageList = tableData.getColumnDatas().get();
//                Assert.assertEquals(2, columnLineageList.size());
//                Assert.assertEquals(3, columnLineageList.get(0).getSourceFields().size());
//                Assert.assertEquals(1, columnLineageList.get(1).getSourceFields().size());
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//        Assert.assertEquals(statementLineage.getQuerySql().get(), "INSERT INTO TABLE db_test.table_result(idd, name) SELECT t1.id, name_x FROM ( SELECT id1 + id2 AS id FROM db_test.table1 ) t1 LEFT JOIN ( SELECT id, name_x FROM ( SELECT id, sourcename AS name_x FROM db_test.table2 ) ) t2 ON t1.id=t2.id");
//    }
//
//    @Test
//    public void insertQueryTest2() {
//        String sql = "INSERT INTO TABLE db_test.table_result SELECT t1.id, name_x FROM ( SELECT id1 + id2 AS id FROM db_test.table1 ) t1 LEFT JOIN ( SELECT id, name_x FROM ( SELECT id, sourcename AS name_x FROM db_test.table2 ) ) t2 ON t1.id=t2.id";
//
//        StatementLineage statementLineage = parserService.parseSqlFieldLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        Assert.assertEquals(StatementType.INSERT_SELECT, statementLineage.getType());
//        statement.map(stmt -> {
//            if (stmt instanceof TableData) {
//                TableData tableData = (TableData) stmt;
//                List<ColumnLineage> columnLineageList = tableData.getColumnDatas().get();
//                Assert.assertEquals(2, columnLineageList.size());
//                Assert.assertEquals(3, columnLineageList.get(0).getSourceFields().size());
//                Assert.assertEquals(1, columnLineageList.get(1).getSourceFields().size());
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//        Assert.assertEquals(statementLineage.getQuerySql().get(), "INSERT INTO TABLE db_test.table_result SELECT t1.id, name_x FROM ( SELECT id1 + id2 AS id FROM db_test.table1 ) t1 LEFT JOIN ( SELECT id, name_x FROM ( SELECT id, sourcename AS name_x FROM db_test.table2 ) ) t2 ON t1.id=t2.id");
//    }
//
//    @Test
//    public void cetInsertCteTest0() {
//        String sql = "with " +
//                "a as (select key,a2 from src where key is not null), " +
//                "b as (select b1,value from src2 where value>0), " +
//                "c as (select c1,value from src3 where value>0), " +
//                "d as (select a.key,b.value from a inner join b on a.key=b.key), " +
//                "e as (select a.key,c.value from a left outer join c on a.key=c.key and c.key is not null) " +
//                "insert overwrite table srcp partition (p='abc') " +
//                "select key,value from d union all select key,value from e";
//
//        StatementLineage statementLineage = parserService.parseSqlFieldLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        Assert.assertEquals(StatementType.INSERT_SELECT, statementLineage.getType());
//        statement.map(stmt -> {
//            if (stmt instanceof TableData) {
//                TableData tableData = (TableData) stmt;
//                List<ColumnLineage> columnLineageList = tableData.getColumnDatas().get();
//                Assert.assertEquals(2, columnLineageList.size());
//                Assert.assertEquals(1, columnLineageList.get(0).getSourceFields().size());
//                Assert.assertEquals(2, columnLineageList.get(1).getSourceFields().size());
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//    }
//
//    @Test
//    public void insertUinonTest() {
//        String sql = "insert INTO table customers " +
//                "     SELECT updates.customerId as mergeKey, updates.* " +
//                "     FROM updates " +
//                "     UNION ALL " +
//                "     SELECT NULL as mergeKey, customers.* " +
//                "     FROM updates inner JOIN customers " +
//                "     ON updates.customerid = customers.customerid " +
//                "     WHERE customers.current = true AND updates.address <> customers.address";
//        StatementLineage statementLineage = parserService.parseSqlFieldLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        Assert.assertEquals(StatementType.INSERT_SELECT, statementLineage.getType());
//        statement.map(stmt -> {
//            if (stmt instanceof TableData) {
//                TableData tableData = (TableData) stmt;
//                List<ColumnLineage> columnLineageList = tableData.getColumnDatas().get();
//                Assert.assertEquals(2, columnLineageList.size());
//                Assert.assertEquals(1, columnLineageList.get(0).getSourceFields().size());
//                Assert.assertEquals(2, columnLineageList.get(1).getSourceFields().size());
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//    }
//
//    @Test
//    public void mutilInsertTest() {
//        String sql = "FROM default.sample_07 " +
//                "INSERT OVERWRITE TABLE toodey1 SELECT sample_07.code0,sample_07.salary0 " +
//                "INSERT OVERWRITE TABLE toodey2 SELECT sample_07.code1,sample_07.salary1 WHERE sample_07.salary >= 50000 " +
//                "INSERT OVERWRITE TABLE toodey3 SELECT sample_07.total_emp,sample_07.salary WHERE sample_07.salary <= 50000";
//
//        StatementLineage statementLineage = parserService.parseSqlFieldLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        Assert.assertEquals(StatementType.MULTI_INSERT, statementLineage.getType());
//        statement.map(stmt -> {
//            if (stmt instanceof TableData) {
//                TableData tableData = (TableData) stmt;
//                List<ColumnLineage> columnLineageList = tableData.getColumnDatas().get();
//                Assert.assertEquals(6, columnLineageList.size());
//                Assert.assertEquals(1, columnLineageList.get(0).getSourceFields().size());
//                Assert.assertEquals(1, columnLineageList.get(1).getSourceFields().size());
//                Assert.assertEquals(1, columnLineageList.get(2).getSourceFields().size());
//                Assert.assertEquals(1, columnLineageList.get(3).getSourceFields().size());
//                Assert.assertEquals(1, columnLineageList.get(4).getSourceFields().size());
//                Assert.assertEquals(1, columnLineageList.get(5).getSourceFields().size());
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//    }
//*/
//
//    @Test
//    public void insertOverwriteTest0() {
//        String sql = "insert overwrite table tmp.aaa\n" +
//                "    select human_name, company_name,collect_set(content) as content from\n" +
//                "            (SELECT legal_name as human_name,name as company_name,action_content as content\n" +
//                "                    from ods.company_dishonest_info WHERE dt='2023-06-05' and legal_name_type=1 and deleted=0\n" +
//                "                    union all\n" +
//                "                    SELECT name,company_name,file_path from ods.company_zxr_restrict WHERE dt='2023-06-05' and deleted=0 and length(trim(company_name))>0) b\n" +
//                "    group by human_name,company_name;\n";
//
//        StatementLineage statementLineage = parserService.parseSqlFieldLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        Assert.assertEquals(StatementType.INSERT_SELECT, statementLineage.getType());
//        statement.map(stmt -> {
//            if (stmt instanceof TableData) {
//                TableData tableData = (TableData) stmt;
//                List<ColumnLineage> columnLineageList = tableData.getColumnDatas().get();
//                Assert.assertEquals(3, columnLineageList.size());
//                Assert.assertEquals(1, columnLineageList.get(0).getSourceFields().size());
//                Assert.assertEquals(2, columnLineageList.get(1).getSourceFields().size());
//                Assert.assertEquals(1, columnLineageList.get(2).getSourceFields().size());
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//    }
//
//}
