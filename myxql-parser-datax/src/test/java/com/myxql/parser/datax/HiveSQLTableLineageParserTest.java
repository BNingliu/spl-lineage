package com.myxql.parser.datax;//package com.myxql.parser.hive;
//
//import com.alibaba.fastjson.JSONObject;
//import com.myxql.parser.SqlParserService;
//import com.myxql.parser.hive.parser.MyHiveSQLParser;
//import com.myxql.parser.model.*;
//import org.junit.Assert;
//import org.junit.Test;
//
//import java.util.Optional;
//
///**
// * Unit test for simple App.
// */
//public class HiveSQLTableLineageParserTest {
//    private SqlParserService parserService = new MyHiveSQLParser();
///*
//    @Test
//    public void createDatabaseTest() {
//        String sql = "CREATE DATABASE IF NOT EXISTS myxql";
//
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        statement.map(stmt -> {
//            if (stmt instanceof Database) {
//                String name = ((Database) stmt).getDatabaseName();
//                Assert.assertEquals("myxql", name);
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//    }
//
//    @Test
//    public void createDatabaseWithLocationTest() {
//        String sql = "CREATE DATABASE IF NOT EXISTS myxql location 'hdfs://hive/apps/myxql'";
//
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        statement.map(stmt -> {
//            if (stmt instanceof Database) {
//                Database database = (Database) stmt;
//                String name = database.getDatabaseName();
//                Assert.assertEquals("myxql", name);
//                String location = database.getLocation().get();
//                Assert.assertEquals("hdfs://hive/apps/myxql", location);
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//    }
//
//    @Test
//    public void dropDatabaseTest() {
//        String sql = "drop DATABASE IF EXISTS myxql";
//
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        statement.map(stmt -> {
//            if (stmt instanceof Database) {
//                String name = ((Database) stmt).getDatabaseName();
//                Assert.assertEquals("myxql", name);
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//    }
//
//    @Test
//    public void createTableTest() {
//        String sql = "CREATE TABLE if not exists test.users ( " +
//                "name         STRING COMMENT 'Employee name', " +
//                "address      int COMMENT 'address', " +
//                "item1      double, " +
//                "item2      DECIMAL(9, 2), " +
//                "item3      TIMESTAMP, " +
//                "item4      BIGINT, " +
//                "item5      BOOLEAN " +
//                ") " +
//                "PARTITIONED BY (ds STRING COMMENT 'part sdf') " +
//                "STORED AS ORC ";
//
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        statement.map(stmt -> {
//            if (stmt instanceof Table) {
//                Table table = ((Table) stmt);
//                String name = table.getDatabaseName().get();
//                Assert.assertEquals("test", name);
//                Assert.assertFalse(table.getLocation());
//                Assert.assertFalse(table.getExternal());
//                Assert.assertEquals(table.getFileFormat().get(), "ORC");
//                Assert.assertFalse(table.getTemporary());
//
//                Assert.assertEquals(1, table.getPartitionColumnNames().get().size());
//                Assert.assertEquals("ds", table.getPartitionColumnNames().get().get(0));
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//    }
//
//
//    @Test
//    public void createTableTestPartition() {
//        String sql = "create table if not exists platformtool.test_users_dt( " +
//                "name string comment '姓名', " +
//                "address string comment '地址', " +
//                "image binary comment 'image' " +
//                ") " +
//                "comment 'user info' " +
//                "PARTITIONED BY (ds string, event_type string)";
//
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        statement.map(stmt -> {
//            if (stmt instanceof Table) {
//                Table table = (Table) stmt;
//                Optional<String> name = table.getDatabaseName();
//                Assert.assertEquals("platformtool", name.get());
//                Assert.assertEquals("姓名", table.getColumns().get().get(0).getComment().get());
//                Assert.assertEquals("hive", table.getCreateTableType());
//                Assert.assertEquals(2, table.getPartitionColumnNames().get().size());
//                Assert.assertEquals("ds", table.getPartitionColumnNames().get().get(0));
//                Assert.assertEquals("event_type", table.getPartitionColumnNames().get().get(1));
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//    }
//
//    @Test
//    public void createTableNoPartitionTest() {
//        String sql = "CREATE TABLE dc_cluster_compute ( " +
//                "id	    bigint	comment	'id', " +
//                "data_center	string	comment	'数据中心', " +
//                "code	string	comment	'code', " +
//                "name	string	comment	'集群名称' " +
//                ") " +
//                "comment	'计算集群'";
//
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        statement.map(stmt -> {
//            if (stmt instanceof Table) {
//                Table table = (Table) stmt;
//                String name = table.getTableName();
//                Assert.assertEquals("dc_cluster_compute", name);
//                Assert.assertEquals("hive", table.getCreateTableType());
//                Assert.assertEquals("数据中心", table.getColumns().get().get(1).getComment().get());
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//    }
//
//    @Test
//    public void createTableTest3() {
//        String sql = "CREATE TABLE bigdata.iceberg_test_dt ( " +
//                "id bigint, " +
//                "data string) " +
//                "stored as iceberg " +
//                "PARTITIONED BY (ds string)";
//
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        statement.map(stmt -> {
//            if (stmt instanceof Table) {
//                Table table = (Table) stmt;
//                String name = table.getTableName();
//                Assert.assertEquals("iceberg_test_dt", name);
//                Assert.assertEquals("hive", table.getCreateTableType());
//                Assert.assertEquals(1, table.getPartitionColumnNames().get().size());
//                Assert.assertEquals("ds", table.getPartitionColumnNames().get().get(0));
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//    }
//
//    @Test
//    public void createTableTest4() {
//        String sql = "CREATE TABLE `bigdata`.`export_test_dt` ( " +
//                "`message` STRING COMMENT '', " +
//                "`collect_time` TIMESTAMP COMMENT '', " +
//                "`ds` STRING COMMENT '') " +
//                "STORED AS orc " +
//                "PARTITIONED BY (ds) ";
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        statement.map(stmt -> {
//            if (stmt instanceof Table) {
//                Table table = (Table) stmt;
//                String name = table.getTableName();
//                Assert.assertEquals("export_test_dt", name);
//                Assert.assertEquals("orc", table.getFileFormat().get());
//                Assert.assertEquals(1, table.getPartitionColumnNames().get().size());
//                Assert.assertEquals("ds", table.getPartitionColumnNames().get().get(0));
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//    }
//
//    @Test
//    public void createTableTest5() {
//        String sql = "CREATE TABLE `bigdata`.`export_test_dt` ( " +
//                "`message` STRING COMMENT '', " +
//                "`collect_time` TIMESTAMP COMMENT '', " +
//                "`the_date` STRING COMMENT '', " +
//                "`the_nums` STRING COMMENT '') " +
//                "STORED AS orc " +
//                "PARTITIONED BY (the_date, the_nums)";
//
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        statement.map(stmt -> {
//            if (stmt instanceof Table) {
//                Table table = (Table) stmt;
//                String name = table.getTableName();
//                Assert.assertEquals("export_test_dt", name);
//                Assert.assertEquals("orc", table.getFileFormat().get());
//                Assert.assertEquals(2, table.getPartitionColumnNames().get().size());
//                Assert.assertEquals("the_date", table.getPartitionColumnNames().get().get(0));
//                Assert.assertEquals("the_nums", table.getPartitionColumnNames().get().get(1));
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//    }
//
//    @Test
//    public void createTableTest7() {
//        String sql = "CREATE TABLE test_demo_test (name string, age int) " +
//                "STORED AS orc";
//
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        statement.map(stmt -> {
//            if (stmt instanceof Table) {
//                Table table = (Table) stmt;
//                String name = table.getTableName();
//                Assert.assertEquals("test_demo_test", name);
//                Assert.assertEquals("orc", table.getFileFormat().get());
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//    }
//
//    @Test
//    public void createTableTest9() {
//        String sql = "create table dzlog_test_dt ( " +
//                "message string, " +
//                "collect_time timestamp " +
//                ") " +
//                "stored as parquet " +
//                "partitioned by (ds string)";
//
//        try {
//            StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//            Optional<Statement> statement = statementLineage.getStatement();
//            statement.map(stmt -> {
//                if (stmt instanceof Table) {
//                    Table table = (Table) stmt;
//                    String name = table.getTableName();
//                    Assert.assertEquals("dzlog_test_dt", name);
//                    Assert.assertEquals("parquet", table.getFileFormat().get());
//                } else {
//                    Assert.fail();
//                }
//                return null;
//            });
//        } catch (Exception e) {
//            Assert.assertTrue(true);
//        }
//    }
//
//    @Test
//    public void descTableTest0() {
//        String sql = "desc table users";
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        statement.map(stmt -> {
//            if (stmt instanceof Table) {
//                Table table = (Table) stmt;
//                String name = table.getTableName();
//                Assert.assertEquals("users", name);
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//    }
//
//    @Test
//    public void createTableLikeTest() {
//        String sql = "create table IF NOT EXISTS test.sale_detail_like  like demo.sale_detail";
//
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        statement.map(stmt -> {
//            if (stmt instanceof CreateTableLike) {
//                CreateTableLike createTableLike = (CreateTableLike) stmt;
//                String name = createTableLike.getNewTableName();
//                Assert.assertEquals("sale_detail", createTableLike.getOldTableName().get());
//                Assert.assertEquals("sale_detail_like", name);
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//    }
//
//    @Test
//    public void createTableSelectTest() {
//        String sql = "create table \nIF NOT EXISTS tdl_users_1 STORED AS ORC as select *, bigdata.TEST(name) from bigdata.users a left outer join address b on a.addr_id = b.id";
//
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        statement.map(stmt -> {
//            if (stmt instanceof Table) {
//                Table table = (Table) stmt;
//                String name = table.getTableName();
//                Assert.assertEquals(StatementType.CREATE_TABLE_AS_SELECT, statementLineage.getType());
//                Assert.assertEquals(table.getFileFormat().get(), "ORC");
//                Assert.assertEquals("tdl_users_1", name);
//                Assert.assertEquals("select *, bigdata.TEST(name) from bigdata.users a left outer join address b on a.addr_id = b.id", table.getQuerySql().get());
//                Assert.assertEquals(2, table.getTableData().get().getInputTables().size());
//                Assert.assertEquals("users", table.getTableData().get().getInputTables().get(0).getTableName());
//                Assert.assertEquals("address", table.getTableData().get().getInputTables().get(1).getTableName());
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//    }
//
//    @Test
//    public void createTableSelectTest1() {
//        String sql = "CREATE TABLE t " +
//                "STORED AS ICEBERG " +
//                "PARTITIONED BY (b) " +
//                "AS SELECT 1 as a, \"a\" as b";
//
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        statement.map(stmt -> {
//            if (stmt instanceof Table) {
//                Table table = (Table) stmt;
//                String name = table.getTableName();
//                Assert.assertEquals(StatementType.CREATE_TABLE_AS_SELECT, statementLineage.getType());
//                Assert.assertEquals("ICEBERG", table.getFileFormat().get());
//                Assert.assertEquals("t", name);
//                Assert.assertEquals("SELECT 1 as a, \"a\" as b", table.getQuerySql().get());
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//    }
//
//    @Test
//    public void createTableSelectTest2() {
//        String sql = "create table \nIF NOT EXISTS tdl_users_1 stored as parquet as (select * from users a left outer join address b on a.addr_id = b.id)";
//
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        statement.map(stmt -> {
//            if (stmt instanceof Table) {
//                Table table = (Table) stmt;
//                String name = table.getTableName();
//                Assert.assertEquals(StatementType.CREATE_TABLE_AS_SELECT, statementLineage.getType());
//                Assert.assertEquals("tdl_users_1", name);
//                Assert.assertEquals("select * from users a left outer join address b on a.addr_id = b.id", table.getQuerySql().get());
//                Assert.assertEquals(2, table.getTableData().get().getInputTables().size());
//                Assert.assertEquals("parquet", table.getFileFormat().get());
//                Assert.assertEquals("address", table.getTableData().get().getInputTables().get(1).getTableName());
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//    }
//
//    @Test
//    public void createTableSelectTest3() {
//        String sql = "create table \nIF NOT EXISTS tdl_users_1 stored as parquet as (select * from users a left outer join address b on a.addr_id = b.id" +
//                " left outer join `bigdata`.users c on c.userid_id = a.id)";
//
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        statement.map(stmt -> {
//            if (stmt instanceof Table) {
//                Table table = (Table) stmt;
//                String name = table.getTableName();
//                Assert.assertEquals(StatementType.CREATE_TABLE_AS_SELECT, statementLineage.getType());
//                Assert.assertEquals("tdl_users_1", name);
//                Assert.assertEquals(3, table.getTableData().get().getInputTables().size());
//                Assert.assertEquals("address", table.getTableData().get().getInputTables().get(1).getTableName());
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//    }
//
//    @Test
//    public void createTableSelectTest4() {
//        String sql = "create table bigdata.test_iceberg_1 stored as iceberg PARTITIONED BY(ds) as " +
//                "SELECT 'xxx' as name, 23 as price, '20211203' as ds";
//
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        statement.map(stmt -> {
//            if (stmt instanceof Table) {
//                Table table = (Table) stmt;
//                String name = table.getTableName();
//                Assert.assertEquals(StatementType.CREATE_TABLE_AS_SELECT, statementLineage.getType());
//                Assert.assertEquals("test_iceberg_1", name);
//                Assert.assertEquals("SELECT 'xxx' as name, 23 as price, '20211203' as ds", table.getQuerySql().get());
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//    }
//
//    @Test
//    public void dropTableTest() {
//        String sql = "drop table if exists sale_detail_drop2";
//
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        statement.map(stmt -> {
//            if (stmt instanceof Table) {
//                Table table = (Table) stmt;
//                String name = table.getTableName();
//                Assert.assertEquals("sale_detail_drop2", name);
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//    }
//
//    @Test
//    public void dropViewTest() {
//        String sql = "drop view if exists sale_detail_drop2";
//
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        statement.map(stmt -> {
//            if (stmt instanceof View) {
//                View view = (View) stmt;
//                String name = view.getTableName();
//                Assert.assertEquals("sale_detail_drop2", name);
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//    }
//
//    @Test
//    public void truncateTableTest() {
//        String sql = "TRUNCATE TABLE test.user partition(ds='20170403')";
//
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        statement.map(stmt -> {
//            if (stmt instanceof Table) {
//                Table table = (Table) stmt;
//                String name = table.getTableName();
//                Assert.assertEquals("user", name);
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//    }
//
//    @Test
//    public void queryTest0() {
//        String sql = "select * from `demo_rp`.bigdata.users a join address b on a.addr_id=b.id limit 101";
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        Assert.assertEquals(StatementType.SELECT, statementLineage.getType());
//        statement.map(stmt -> {
//            if (stmt instanceof TableData) {
//                TableData tableData = (TableData) stmt;
//                System.out.println("queryTest0, tableData="+JSONObject.toJSONString(tableData));
//                Assert.assertEquals(2, tableData.getInputTables().size());
//                Assert.assertEquals("users", tableData.getInputTables().get(0).getTableName());
////                Assert.assertEquals("demo_rp.bigdata.users", tableData.getInputTables().get(0).getFullTableName());
//                Assert.assertEquals("demo_rp.bigdata.users", tableData.getInputTables().get(0).getFullTableName());
//                Assert.assertEquals("address", tableData.getInputTables().get(1).getTableName());
//                Assert.assertEquals((Integer) 101, tableData.getLimit().get());
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//    }
//
//    @Test
//    public void queryTest1() {
//        String sql = "select * from (select * from users where name='melin') a limit 1001";
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        Assert.assertEquals(StatementType.SELECT, statementLineage.getType());
//        statement.map(stmt -> {
//            if (stmt instanceof TableData) {
//                TableData tableData = (TableData) stmt;
//                Assert.assertEquals(1, tableData.getInputTables().size());
//                Assert.assertEquals("users", tableData.getInputTables().get(0).getTableName());
//                Assert.assertEquals((Integer) 1001, tableData.getLimit().get());
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//    }
//
//    @Test
//    public void queryTest2() {
//        String sql = "select * from users a join (select * from address where type='hangzhou') b on a.addr_id=b.id limit 101";
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        Assert.assertEquals(StatementType.SELECT, statementLineage.getType());
//        statement.map(stmt -> {
//            if (stmt instanceof TableData) {
//                TableData tableData = (TableData) stmt;
//                Assert.assertEquals(2, tableData.getInputTables().size());
//                Assert.assertEquals("users", tableData.getInputTables().get(0).getTableName());
//                Assert.assertEquals("address", tableData.getInputTables().get(1).getTableName());
//                Assert.assertEquals((Integer)101, tableData.getLimit().get());
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//    }
//
///*
//    @Test
//    public void queryTest3() {
//        String sql = "select bzdys, bzhyyh, bzdy, week, round((bzdy-bzdys)*100/bzdys, 2) " +
//                "from (select lag(bzdy) over (order by week) bzdys, bzhyyh, bzdy, week " +
//                "from (select count(distinct partner_code) bzhyyh, count(1) bzdy, week from tdl_dt2x_table)) limit 111";
//
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        Assert.assertEquals(StatementType.SELECT, statementLineage.getType());
//        statement.map(stmt -> {
//            if (stmt instanceof TableData) {
//                TableData tableData = (TableData) stmt;
//                Assert.assertEquals(1, tableData.getInputTables().size());
//                Assert.assertEquals("tdl_dt2x_table", tableData.getInputTables().get(0).getTableName());
//                Assert.assertEquals((Integer) 111, tableData.getLimit().get());
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//    }
//*/
///*
//    @Test
//    public void queryTest4() {
//        String sql = "select 2-1";
//
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        Assert.assertEquals(StatementType.SELECT, statementLineage.getType());
//        statement.map(stmt -> {
//            if (stmt instanceof TableData) {
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//    }
//*/
//    @Test
//    public void queryTest5() {
//        String sql = "select \n" +
//                "     t.table_name\n" +
//                "     ,concat_ws('.',t.database_name,t.table_name) tab_name\n" +
//                "     ,t.database_name\n" +
//                "     ,t.owner \n" +
//                "     ,count(distinct t2.project_code) prj_cnt\n" +
//                "     ,count(distinct t1.obj_name) app_user_cnt\n" +
//                "     from tidb_datacompute.t_table t \n" +
//                "     left join tidb_datacompute.sec_table_privs t1\n" +
//                "            on t.table_name = t1.table_name\n" +
//                "           and t1.status=1\n" +
//                "           and t1.expire_date >= current_date\n" +
//                "     left join tidb_datacompute.dc_project_member t2\n" +
//                "             on t1.obj_id = t2.user_id\n" +
//                "     where t.`lifecycle` == 1\n" +
//                "     group by t.table_name,t.owner,t.database_name ";
//
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        Assert.assertEquals(StatementType.SELECT, statementLineage.getType());
//        statement.map(stmt -> {
//            if (stmt instanceof TableData) {
//                TableData tableData = (TableData) stmt;
//                Assert.assertEquals(3, tableData.getInputTables().size());
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//    }
///*
//    @Test
//    public void queryTest6() {
//        String sql = "select * from test";
//
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        Assert.assertEquals(StatementType.SELECT, statementLineage.getType());
//        statement.map(stmt -> {
//            if (stmt instanceof TableData) {
//                TableData tableData = (TableData) stmt;
//                Assert.assertEquals(1, tableData.getInputTables().size());
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//    }
//
//    @Test
//    public void queryTest8() {
//        String sql = "select 'test' as name";
//
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        Assert.assertEquals(StatementType.SELECT, statementLineage.getType());
//        statement.map(stmt -> {
//            if (stmt instanceof TableData) {
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//    }
//
//    @Test
//    public void insertIntoTest0() {
//        String sql = "insert into TABLE users PARTITION(ds='20170220') values('libinsong', 12, 'test'), ('libinsong', 13, 'test')";
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        Assert.assertEquals(StatementType.INSERT_VALUES, statementLineage.getType());
//        if(statementLineage.getValues().isPresent()) {
//            Assert.assertEquals(2, statementLineage.getValues().get().size());
//        }
//        statement.map(stmt -> {
//            if (stmt instanceof TableData) {
//                TableData tableData = (TableData) stmt;
//                Assert.assertEquals(InsertMode.INTO, tableData.getInsertMode().get());
//                Assert.assertEquals("users", tableData.getOutpuTables().get(0).getTableName());
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//    }
//
//    @Test
//    public void insertIntoTest1() {
//        String sql = "insert into bigdata.delta_lsw_test values('lsw'),('lsw1')";
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        Assert.assertEquals(StatementType.INSERT_VALUES, statementLineage.getType());
//        if(statementLineage.getValues().isPresent()) {
//            Assert.assertEquals(2, statementLineage.getValues().get().size());
//        }
//        statement.map(stmt -> {
//            if (stmt instanceof TableData) {
//                TableData tableData = (TableData) stmt;
//                Assert.assertEquals(InsertMode.INTO, tableData.getInsertMode().get());
//                Assert.assertEquals("delta_lsw_test", tableData.getOutpuTables().get(0).getTableName());
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//    }
//
//    @Test
//    public void insertTableCustomColumn() {
//        String sql = "INSERT INTO test_demo_test (name) VALUES('lisi')";
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        Assert.assertEquals(StatementType.INSERT_VALUES, statementLineage.getType());
//        statement.map(stmt -> {
//            if (stmt instanceof TableData) {
//                TableData tableData = (TableData) stmt;
//                Assert.assertEquals(InsertMode.INTO, tableData.getInsertMode().get());
//                Assert.assertEquals("test_demo_test", tableData.getOutpuTables().get(0).getTableName());
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//    }
//
//    @Test
//    public void insertOverwriteTest0() {
//        String sql = "insert OVERWRITE TABLE users PARTITION(ds='20170220') values('libinsong')";
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        Assert.assertEquals(StatementType.INSERT_VALUES, statementLineage.getType());
//        statement.map(stmt -> {
//            if (stmt instanceof TableData) {
//                TableData tableData = (TableData) stmt;
//                Assert.assertEquals(InsertMode.OVERWRITE, tableData.getInsertMode().get());
//                Assert.assertEquals(1, tableData.getPartitions().get().size());
//                Assert.assertEquals("users", tableData.getOutpuTables().get(0).getTableName());
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//    }
//
//    @Test
//    public void insertOverwriteTest1() {
//        String sql = "insert OVERWRITE TABLE users PARTITION(ds=10) values('libinsong', '20170220')";
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        Assert.assertEquals(StatementType.INSERT_VALUES, statementLineage.getType());
//        statement.map(stmt -> {
//            if (stmt instanceof TableData) {
//                TableData tableData = (TableData) stmt;
//                Assert.assertEquals(InsertMode.OVERWRITE, tableData.getInsertMode().get());
//                Assert.assertEquals(1, tableData.getPartitions().get().size());
//                Assert.assertEquals("users", tableData.getOutpuTables().get(0).getTableName());
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//    }
//
//    @Test
//    public void insertOverwriteQueryTest2() {
//        String sql = "insert INTO users PARTITION(ds='20170220') select * from account a join address b on a.addr_id=b.id";
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        Assert.assertEquals(StatementType.INSERT_SELECT, statementLineage.getType());
//        statement.map(stmt -> {
//            if (stmt instanceof TableData) {
//                TableData tableData = (TableData) stmt;
//                Assert.assertEquals("users", tableData.getOutpuTables().get(0).getTableName());
//                Assert.assertEquals(InsertMode.INTO, tableData.getInsertMode().get());
//                Assert.assertEquals(1, tableData.getPartitions().get().size());
//
//                Assert.assertEquals(2, tableData.getInputTables().size());
//                Assert.assertEquals("account", tableData.getInputTables().get(0).getTableName());
//                Assert.assertEquals("address", tableData.getInputTables().get(1).getTableName());
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//        Assert.assertEquals(statementLineage.getQuerySql().get(), "select * from account a join address b on a.addr_id=b.id");
//    }
//
//    @Test
//    public void insertOverwriteQueryTest3() {
//        String sql = "insert INTO users select *, bigdata.Test(id) from account a join address b on a.addr_id=b.id";
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        Assert.assertEquals(StatementType.INSERT_SELECT, statementLineage.getType());
//        statement.map(stmt -> {
//            if (stmt instanceof TableData) {
//                TableData tableData = (TableData) stmt;
//                Assert.assertEquals("users", tableData.getOutpuTables().get(0).getTableName());
//                Assert.assertEquals(InsertMode.INTO, tableData.getInsertMode().get());
//                if(tableData.getPartitions().isPresent()) {
//                    Assert.assertEquals(0, tableData.getPartitions().get().size());
//                }
//
//                Assert.assertEquals(2, tableData.getInputTables().size());
//                Assert.assertEquals("account", tableData.getInputTables().get(0).getTableName());
//                Assert.assertEquals("address", tableData.getInputTables().get(1).getTableName());
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//        Assert.assertEquals(statementLineage.getQuerySql().get(), "select *, bigdata.Test(id) from account a join address b on a.addr_id=b.id");
//    }
//
//    @Test
//    public void insertOverwriteQueryTest4() {
//        String sql = "insert OVERWRITE TABLE users PARTITION(ds='20170220') select * from account1 union all " +
//                "select * from account2";
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        Assert.assertEquals(StatementType.INSERT_SELECT, statementLineage.getType());
//        statement.map(stmt -> {
//            if (stmt instanceof TableData) {
//                TableData tableData = (TableData) stmt;
//                Assert.assertEquals("users", tableData.getOutpuTables().get(0).getTableName());
//                Assert.assertEquals(InsertMode.OVERWRITE, tableData.getInsertMode().get());
//                Assert.assertEquals(1, tableData.getPartitions().get().size());
//
//                Assert.assertEquals(2, tableData.getInputTables().size());
//                Assert.assertEquals("account1", tableData.getInputTables().get(0).getTableName());
//                Assert.assertEquals("account2", tableData.getInputTables().get(1).getTableName());
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//        Assert.assertEquals(statementLineage.getQuerySql().get(), "select * from account1 union all select * from account2");
//    }
//
//    @Test
//    public void countCondTest() {
//        String sql = "select count(mac) From test_table where a=2";
//
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Assert.assertEquals(StatementType.SELECT, statementLineage.getType());
//        Optional<Statement> statement = statementLineage.getStatement();
//        statement.map(stmt -> {
//            if (stmt instanceof TableData) {
//                TableData tableData = (TableData) stmt;
//                Assert.assertEquals("test_table", tableData.getInputTables().get(0).getTableName());
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//    }
//
//    @Test
//    public void insertTest0() {
//        String sql = "INSERT INTO TABLE db_test.table_result SELECT t1.id, name FROM ( SELECT id1 + id2 AS id FROM db_test.table1 ) t1 LEFT JOIN ( SELECT id, name FROM ( SELECT id, sourcename AS name FROM db_test.table2 ) ) t2 ON t1.id=t2.id";
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        Assert.assertEquals(StatementType.INSERT_SELECT, statementLineage.getType());
//        statement.map(stmt -> {
//            if (stmt instanceof TableData) {
//                TableData tableData = (TableData) stmt;
//                Assert.assertEquals(2, tableData.getInputTables().size());
//                Assert.assertEquals(1, tableData.getOutpuTables().size());
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//    }
//
//    @Test
//    public void cetInsertTest0() {
//        String sql = "with " +
//                "a as (select * from src where key is not null), " +
//                "b as (select * from src2 where value>0), " +
//                "c as (select * from src3 where value>0), " +
//                "d as (select a.key,b.value from a inner join b on a.key=b.key), " +
//                "e as (select a.key,c.value from a left outer join c on a.key=c.key and c.key is not null) " +
//                "insert overwrite table srcp partition (p='abc') " +
//                "select * from d union all select * from e";
//
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        Assert.assertEquals(StatementType.INSERT_SELECT, statementLineage.getType());
//        statement.map(stmt -> {
//            if (stmt instanceof TableData) {
//                TableData tableData = (TableData) stmt;
//                Assert.assertEquals(3, tableData.getInputTables().size());
//                Assert.assertEquals(5, tableData.getCteTempTables().size());
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//    }
//
//    @Test
//    public void insertOverwriteTest10() {
//        String sql = "insert overwrite table tmp.aaa\n" +
//                "    select human_name, company_name,collect_set(content) as content from\n" +
//                "            (SELECT legal_name as human_name,name as company_name,action_content as content\n" +
//                "                    from ods.company_dishonest_info WHERE dt='2023-06-05' and legal_name_type=1 and deleted=0\n" +
//                "                    union all\n" +
//                "                    SELECT name,company_name,file_path from ods.company_zxr_restrict WHERE dt='2023-06-05' and deleted=0 and length(trim(company_name))>0) b\n" +
//                "    group by human_name,company_name;\n";
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        Assert.assertEquals(StatementType.INSERT_SELECT, statementLineage.getType());
//        statement.map(stmt -> {
//            if (stmt instanceof TableData) {
//                TableData tableData = (TableData) stmt;
//                Assert.assertEquals(2, tableData.getInputTables().size());
//                Assert.assertEquals("company_dishonest_info", tableData.getInputTables().get(0).getTableName());
//                Assert.assertEquals(0, tableData.getCteTempTables().size());
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//    }
//*/
//    @Test
//    public void insertOverwriteTest11() {
//        String sql = "insert overwrite table bbbb select count(1) from tmp.aaaa;";
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        Assert.assertEquals(StatementType.INSERT_SELECT, statementLineage.getType());
//        statement.map(stmt -> {
//            if (stmt instanceof TableData) {
//                TableData tableData = (TableData) stmt;
//                Assert.assertEquals(1, tableData.getInputTables().size());
//                Assert.assertEquals("aaaa", tableData.getInputTables().get(0).getTableName());
//                Assert.assertEquals(0, tableData.getCteTempTables().size());
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//    }
//
//    @Test
//    public void ifFuncTest() {
//        String sql = "insert overwrite table bbbb select date_sub(current_date(),1) as a,if(a>=1,1,0) as b from xxx";
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        Assert.assertEquals(StatementType.INSERT_SELECT, statementLineage.getType());
//        statement.map(stmt -> {
//            if (stmt instanceof TableData) {
//                TableData tableData = (TableData) stmt;
//                Assert.assertEquals(1, tableData.getInputTables().size());
//                Assert.assertEquals("xxx", tableData.getInputTables().get(0).getTableName());
//                Assert.assertEquals(0, tableData.getCteTempTables().size());
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//    }
//}
