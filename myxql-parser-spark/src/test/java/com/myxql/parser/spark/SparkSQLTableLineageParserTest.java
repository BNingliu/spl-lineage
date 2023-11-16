//package com.myxql.parser.spark;
//
//import com.myxql.parser.antlr4.ParseException;
//import com.myxql.parser.SqlParserService;
//import com.myxql.parser.model.*;
//import com.myxql.parser.spark.parser.MySparkSQLParser;
//import org.junit.Assert;
//import org.junit.Test;
//
//import java.util.Map;
//import java.util.Optional;
//
//public class SparkSQLTableLineageParserTest {
//    private SqlParserService parserService = new MySparkSQLParser();
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
//    public void descDatabaseTest() {
//        String sql = "desc database myxql";
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
//            ") " +
//            "COMMENT 'hello world' " +
//            "PARTITIONED BY (ds STRING COMMENT 'part sdf') " +
//            "STORED AS ORC " +
//            "TBLPROPERTIES ('dataCenter'='hangzhou')";
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
////                Assert.assertEquals(7, table.getLifeCycle());
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
//    @Test
//    public void createTableTestPartition() {
//        String sql = "create table if not exists platformtool.test_users_dt( " +
//                    "name string comment '姓名', " +
//                    "address string comment '地址', " +
//                    "image binary comment 'image' " +
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
//            ") " +
//            "comment	'计算集群'";
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
//            "id bigint, " +
//            "data string) " +
//            "stored as iceberg " +
//            "PARTITIONED BY (ds string)";
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
//            "`message` STRING COMMENT '', " +
//            "`collect_time` TIMESTAMP COMMENT '', " +
//            "`ds` STRING COMMENT '') " +
//            "USING orc " +
//            "PARTITIONED BY (ds) " +
//            "TBLPROPERTIES ( " +
//            "'transient_lastDdlTime' = '1627281671')";
//
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        statement.map(stmt -> {
//            if (stmt instanceof Table) {
//                Table table = (Table) stmt;
//                String name = table.getTableName();
//                Assert.assertEquals("export_test_dt", name);
//                Assert.assertEquals("orc", table.getFileFormat().get());
//                Assert.assertEquals("spark", table.getCreateTableType());
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
//              "`message` STRING COMMENT '', " +
//              "`collect_time` TIMESTAMP COMMENT '', " +
//              "`the_date` STRING COMMENT '', " +
//              "`the_nums` STRING COMMENT '') " +
//            "USING orc " +
//            "PARTITIONED BY (the_date, the_nums) " +
//            "TBLPROPERTIES ('transient_lastDdlTime' = '1627288235')";
//
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        statement.map(stmt -> {
//            if (stmt instanceof Table) {
//                Table table = (Table) stmt;
//                String name = table.getTableName();
//                Assert.assertEquals("export_test_dt", name);
//                Assert.assertEquals("orc", table.getFileFormat().get());
//                Assert.assertEquals("spark", table.getCreateTableType());
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
//            "using orc";
//
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        statement.map(stmt -> {
//            if (stmt instanceof Table) {
//                Table table = (Table) stmt;
//                String name = table.getTableName();
//                Assert.assertEquals("test_demo_test", name);
//                Assert.assertEquals("orc", table.getFileFormat().get());
//                Assert.assertEquals("spark", table.getCreateTableType());
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
//            ") " +
//            "using parquet " +
//            "partitioned by (ds string)";
//
//        try {
//            parserService.parseSqlTableLineage(sql);
//            Assert.fail();
//        } catch (Exception e) {
//            Assert.assertTrue(true);
//        }
//    }
//
//    @Test
//    public void createHudiTableTest5() {
//        String sql = "create table test_hudi_table ( id int, name string, price double, ts long, dt string) " +
//            "using hudi " +
//            "tblproperties ( " +
//              "type = 'MOR', " +
//              "primaryKey = 'id, name', " +
//              "preCombineField = 'ts' " +
//             ") " +
//            "partitioned by (dt)";
//
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        Assert.assertEquals(StatementType.CREATE_TABLE, statementLineage.getType());
//        statement.map(stmt -> {
//            if (stmt instanceof Table) {
//                Table table = (Table) stmt;
//                String name = table.getTableName();
//                Assert.assertEquals("test_hudi_table", name);
//                Assert.assertEquals(2, table.getHudiPrimaryKeys().size());
//                Assert.assertEquals("id", table.getHudiPrimaryKeys().get(0));
//                Assert.assertEquals("name", table.getHudiPrimaryKeys().get(1));
//                Assert.assertEquals("MOR", table.getHudiType());
//
//                Assert.assertEquals("hudi", table.getFileFormat().get());
//                Assert.assertEquals(1, table.getPartitionColumnNames().get().size());
//                Assert.assertEquals("dt", table.getPartitionColumnNames().get().get(0));
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//    }
//
//    @Test
//    public void createHudiTableTest6() {
//        String sql = "create table test_hudi_table ( id int, name string, price double, ts long, dt string) " +
//            "using hudi " +
//            "tblproperties (" +
//              "type = 'cow'," +
//              "primaryKey = 'id, name'," +
//              "preCombineField = 'ts'" +
//             ") " +
//            "partitioned by (dt)";
//
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        Assert.assertEquals(StatementType.CREATE_TABLE, statementLineage.getType());
//        statement.map(stmt -> {
//            if (stmt instanceof Table) {
//                Table table = (Table) stmt;
//                String name = table.getTableName();
//                Assert.assertEquals("test_hudi_table", name);
//                Assert.assertEquals(2, table.getHudiPrimaryKeys().size());
//                Assert.assertEquals("id", table.getHudiPrimaryKeys().get(0));
//                Assert.assertEquals("name", table.getHudiPrimaryKeys().get(1));
//                Assert.assertEquals("cow", table.getHudiType());
//
//                Assert.assertEquals("hudi", table.getFileFormat().get());
//                Assert.assertEquals(1, table.getPartitionColumnNames().get().size());
//                Assert.assertEquals("dt", table.getPartitionColumnNames().get().get(0));
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//    }
//
//    @Test
//    public void createIcebergTable() {
//        String sql = "CREATE TABLE IF NOT EXISTS iceberg_melin.test_table_02 ( " +
//                "id bigint, data string, ds timestamp) " +
//            "USING iceberg PARTITIONED BY (days(ts))";
//        //trimIndent();
//
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        Assert.assertEquals(StatementType.CREATE_TABLE, statementLineage.getType());
//        statement.map(stmt -> {
//            if (stmt instanceof Table) {
//                Table table = (Table) stmt;
//                String name = table.getTableName();
//                Assert.assertEquals("test_table_02", name);
//
//                Assert.assertEquals("iceberg", table.getFileFormat().get());
//                Assert.assertEquals(1, table.getPartitionColumnNames().get().size());
//                Assert.assertEquals("days(ts)", table.getPartitionColumnNames().get().get(0));
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//    }
//
//    @Test
//    public void replaceHudiTableTest() {
//        String sql = "create or replace table test_hudi_table ( id int, name string, price double, ts long, dt string) " +
//            "using hudi " +
//            "tblproperties ( " +
//              "type = 'mor', " +
//              "primaryKey = 'id, name', " +
//              "preCombineField = 'ts' " +
//             ") " +
//            "partitioned by (dt)";
//
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        Assert.assertEquals(StatementType.REPLACE_TABLE, statementLineage.getType());
//        statement.map(stmt -> {
//            if (stmt instanceof Table) {
//                Table table = (Table) stmt;
//                String name = table.getTableName();
//                Assert.assertEquals("test_hudi_table", name);
//                Assert.assertEquals(2, table.getHudiPrimaryKeys().size());
//                Assert.assertEquals("id", table.getHudiPrimaryKeys().get(0));
//                Assert.assertEquals("name", table.getHudiPrimaryKeys().get(1));
//                Assert.assertEquals("mor", table.getHudiType());
//
//                Assert.assertEquals("hudi", table.getFileFormat().get());
//                Assert.assertEquals(1, table.getPartitionColumnNames().get().size());
//                Assert.assertEquals("dt", table.getPartitionColumnNames().get().get(0));
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
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
//    public void descPartitionTest() {
//        String sql = "DESC formatted user partition(ds=20190708)";
//
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        statement.map(stmt -> {
//            if (stmt instanceof Table) {
//                Table table = (Table) stmt;
//                Assert.assertEquals(StatementType.DESC_TABLE, statementLineage.getType());
//                Assert.assertEquals("user", table.getTableName());
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
//
//                Assert.assertEquals("bigdata.test", table.getTableData().get().getFunctionNames().iterator().next());
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
//               "USING ICEBERG " +
//               "PARTITIONED BY (b) " +
//               "AS SELECT 1 as a, \"a\" as b";
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
////                Assert.assertEquals("b", table.getPartitionColumnNames().get().get(0));
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//    }
//
//    @Test
//    public void createTableSelectTest2() {
//        String sql = "create table \nIF NOT EXISTS tdl_users_1 using parquet as (select * from users a left outer join address b on a.addr_id = b.id)";
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
//        String sql = "create table \nIF NOT EXISTS tdl_users_1 using parquet as (select * from users a left outer join address b on a.addr_id = b.id" +
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
//                //Assert.assertEquals("select * from users a left outer join address b on a.addr_id = b.id", statement.querySql)
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
//        String sql = "create table huaixin_rp.bigdata.test_iceberg_1 using iceberg PARTITIONED BY(ds) as " +
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
//    public void replaceTableSelectTest() {
//        String sql = "create or replace table tdl_users_1 STORED AS ORC as select * from bigdata.users a left outer join address b on a.addr_id = b.id";
//
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        statement.map(stmt -> {
//            if (stmt instanceof Table) {
//                Table table = (Table) stmt;
//                String name = table.getTableName();
//                Assert.assertEquals(StatementType.REPLACE_TABLE_AS_SELECT, statementLineage.getType());
//                Assert.assertEquals(table.getFileFormat().get(), "ORC");
//                Assert.assertEquals("tdl_users_1", name);
//                Assert.assertEquals("select * from bigdata.users a left outer join address b on a.addr_id = b.id", table.getQuerySql().get());
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
//    public void createViewTest0() {
//        String sql = "CREATE View view_users " +
//            "comment 'view test' " +
//            "as " +
//            "select * from account ";
//
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        statement.map(stmt -> {
//            if (stmt instanceof View) {
//                View view = (View) stmt;
//                String name = view.getTableName();
//                Assert.assertEquals("view_users", name);
//                Assert.assertEquals("view test", view.getComment().get());
////                Assert.assertEquals("select * from account", view.getQuerySql().get());
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//    }
//
//    @Test
//    public void createViewTest1() {
//        String sql = "CREATE View if not exists view_users " +
//            "comment 'view test' " +
//            "as " +
//            "select *, bigdata.test(name) from account";
//
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        statement.map(stmt -> {
//            if (stmt instanceof View) {
//                View view = (View) stmt;
//                String name = view.getTableName();
//                Assert.assertEquals("view_users", name);
//                Assert.assertEquals("view test", view.getComment().get());
//                Assert.assertEquals(1, view.getFunctionNames().size());
//                Assert.assertEquals("bigdata.test", view.getFunctionNames().iterator().next());
//
////                Assert.assertEquals("select *, bigdata.test(name) from account", view.getQuerySql().get());
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//    }
//
//    @Test
//    public void alterViewTest0() {
//        String sql = "ALTER VIEW v1 AS SELECT x, UPPER(s) s FROM t2";
//
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        statement.map(stmt -> {
//            if (stmt instanceof View) {
//                View view = (View) stmt;
//                String name = view.getTableName();
//                Assert.assertEquals("v1", name);
////                Assert.assertEquals("SELECT x, UPPER(s) s FROM t2", view.getQuerySql().get());
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//    }
//
//    @Test
//    public void renameTableTest() {
//        String sql = "alter table test.table_name rename to new_table_name";
//
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        statement.map(stmt -> {
//            if (stmt instanceof RenameTable) {
//                RenameTable table = (RenameTable) stmt;
//                String name = table.getNewName();
//                Assert.assertEquals("new_table_name", name);
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//    }
//
//    @Test
//    public void alterTablePropertiesTest() {
//        String sql = "ALTER TABLE test.sale_detail SET TBLPROPERTIES ('comment' = 'new coments for statement sale_detail', 'lifeCycle' = '7')";
//
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        statement.map(stmt -> {
//            if (stmt instanceof Table) {
//                Table table = (Table) stmt;
//                Assert.assertEquals(StatementType.ALTER_TABLE_PROPERTIES, statementLineage.getType());
//                String name = table.getTableName();
//                Assert.assertEquals("sale_detail", name);
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//    }
//
//    @Test
//    public void addColumnsTest() {
//        String sql = "alter table test.sale_detail add columns (col_name1 string comment 'col_name1', col_name2 string comment 'col_name2')";
//
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        statement.map(stmt -> {
//            if (stmt instanceof Table) {
//                Table table = (Table) stmt;
//                Assert.assertEquals(StatementType.ALTER_TABLE_ADD_COLS, statementLineage.getType());
//                String name = table.getTableName();
//                Assert.assertEquals("sale_detail", name);
//                Assert.assertEquals(2, table.getColumns().get().size());
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//    }
//
//    @Test
//    public void addColumnTest() {
//        String sql = "ALTER TABLE db.sample ADD COLUMN age int FIRST";
//
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        statement.map(stmt -> {
//            if (stmt instanceof Table) {
//                Table table = (Table) stmt;
//                Assert.assertEquals(StatementType.ALTER_TABLE_ADD_COL, statementLineage.getType());
//                String name = table.getTableName();
//                Assert.assertEquals("sample", name);
//                Assert.assertEquals(1, table.getColumns().get().size());
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//    }
//
//    @Test
//    public void renameColumnTest() {
//        String sql = "ALTER TABLE db.sample RENAME COLUMN data TO payload";
//
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        statement.map(stmt -> {
//            if (stmt instanceof AlterColumn) {
//                AlterColumn column = (AlterColumn) stmt;
//                Assert.assertEquals(StatementType.ALTER_TABLE_RENAME_COL, statementLineage.getType());
//                String name = column.getTableName();
//                Assert.assertEquals("sample", name);
//                Assert.assertEquals("payload", column.getAction().get().getNewColumName().get());
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//    }
//
//    @Test
//    public void changeColumnTest() {
//        String sql = "ALTER TABLE db.sample ALTER COLUMN location.lat TYPE double";
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        Assert.assertEquals(StatementType.ALTER_TABLE_CHANGE_COL, statementLineage.getType());
//        statement.map(stmt -> {
//            if (stmt instanceof AlterColumn) {
//                AlterColumn column = (AlterColumn) stmt;
//                String name = column.getTableName();
//                Assert.assertEquals("sample", name);
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//
//        sql = "ALTER TABLE db.sample ALTER COLUMN id DROP NOT NULL";
//        statementLineage = parserService.parseSqlTableLineage(sql);
//        statement = statementLineage.getStatement();
//        Assert.assertEquals(StatementType.ALTER_TABLE_CHANGE_COL, statementLineage.getType());
//        statement.map(stmt -> {
//            if (stmt instanceof AlterColumn) {
//                AlterColumn column = (AlterColumn) stmt;
//                String name = column.getTableName();
//                Assert.assertEquals("sample", name);
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//
//        sql = "ALTER TABLE db.sample ALTER COLUMN point.z AFTER y";
//        statementLineage = parserService.parseSqlTableLineage(sql);
//        statement = statementLineage.getStatement();
//        Assert.assertEquals(StatementType.ALTER_TABLE_CHANGE_COL, statementLineage.getType());
//        statement.map(stmt -> {
//            if (stmt instanceof AlterColumn) {
//                AlterColumn column = (AlterColumn) stmt;
//                String name = column.getTableName();
//                Assert.assertEquals("sample", name);
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//
//        sql = "ALTER TABLE db.sample ALTER COLUMN id COMMENT 'unique id'";
//        statementLineage = parserService.parseSqlTableLineage(sql);
//        statement = statementLineage.getStatement();
//        Assert.assertEquals(StatementType.ALTER_TABLE_CHANGE_COL, statementLineage.getType());
//        statement.map(stmt -> {
//            if (stmt instanceof AlterColumn) {
//                AlterColumn column = (AlterColumn) stmt;
//                String name = column.getTableName();
//                Assert.assertEquals("sample", name);
//                String dataType = null;
//                if(column.getAction().isPresent()) {
//                    if(column.getAction().get().getDataType().isPresent()) {
//                        dataType = column.getAction().get().getDataType().get();
//                    }
//                }
//                Assert.assertNull(dataType);
//                Assert.assertEquals("unique id", column.getAction().get().getComment().get());
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//
//        sql = "ALTER TABLE demo CHANGE COLUMN price Type float COMMENT '价格'";
//        statementLineage = parserService.parseSqlTableLineage(sql);
//        statement = statementLineage.getStatement();
//        Assert.assertEquals(StatementType.ALTER_TABLE_CHANGE_COL, statementLineage.getType());
//        statement.map(stmt -> {
//            if (stmt instanceof AlterColumn) {
//                AlterColumn column = (AlterColumn) stmt;
//                String name = column.getTableName();
//                Assert.assertEquals("demo", name);
//                Assert.assertEquals("float", column.getAction().get().getDataType().get());
//                Assert.assertEquals("价格", column.getAction().get().getComment().get());
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//    }
//
//    @Test
//    public void changeColumnTest1() {
//        String sql = "ALTER TABLE test_user11_dt ALTER COLUMN ds comment 'ddd'";
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        Assert.assertEquals(StatementType.ALTER_TABLE_CHANGE_COL, statementLineage.getType());
//        statement.map(stmt -> {
//            if (stmt instanceof AlterColumn) {
//                AlterColumn column = (AlterColumn) stmt;
//                String name = column.getTableName();
//                Assert.assertEquals("test_user11_dt", name);
//                Assert.assertEquals("ds", column.getAction().get().getColumName().get());
//                String columName = null;
//                if(column.getAction().isPresent()) {
//                    if(column.getAction().get().getNewColumName().isPresent()) {
//                        columName = column.getAction().get().getNewColumName().get();
//                    }
//                }
//                Assert.assertNull(columName);
//                String dataType = null;
//                if(column.getAction().isPresent()) {
//                    if(column.getAction().get().getDataType().isPresent()) {
//                        dataType = column.getAction().get().getDataType().get();
//                    }
//                }
//                Assert.assertNull(dataType);
//                Assert.assertEquals("ddd", column.getAction().get().getComment().get());
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//    }
//
//    @Test
//    public void dropColumnTest() {
//        String sql = "ALTER TABLE db.sample DROP COLUMN id";
//
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        Assert.assertEquals(StatementType.ALTER_TABLE_DROP_COL, statementLineage.getType());
//        statement.map(stmt -> {
//            if (stmt instanceof AlterColumn) {
//                AlterColumn column = (AlterColumn) stmt;
//                String name = column.getTableName();
//                Assert.assertEquals("sample", name);
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//    }
//
//    @Test
//    public void setTableLocationTest() {
//        String sql = "alter table demo partition(ds='20180317') set location '/user/hive'";
//
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        Assert.assertEquals(StatementType.ALTER_TABLE_SET_LOCATION, statementLineage.getType());
//        statement.map(stmt -> {
//            if (stmt instanceof TableSource) {
//                TableSource tableSource = (TableSource) stmt;
//                String name = tableSource.getTableName();
//                Assert.assertEquals("demo", name);
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//    }
//
//    @Test
//    public void updateColumnTest() {
//        String sql = "ALTER TABLE sale_detail CHANGE COLUMN old_col_name new_col_name string comment 'sdsd'";
//
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        statement.map(stmt -> {
//            if (stmt instanceof AlterColumn) {
//                AlterColumn column = (AlterColumn) stmt;
//                String name = column.getTableName();
//                Assert.assertEquals("sale_detail", name);
//                Assert.assertEquals("sdsd", column.getAction().get().getComment().get());
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//
//        String sql1 = "ALTER TABLE test_users_dt CHANGE age2 age3 int";
//
//        StatementLineage statementLineage1 = parserService.parseSqlTableLineage(sql1);
//        Optional<Statement> statement1 = statementLineage1.getStatement();
//        statement1.map(stmt -> {
//            if (stmt instanceof AlterColumn) {
//                AlterColumn column = (AlterColumn) stmt;
//                String name = column.getTableName();
//                Assert.assertEquals("test_users_dt", name);
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//    }
//
//    @Test
//    public void dropPartitionTest0() {
//        String sql = "ALTER TABLE page_view DROP IF EXISTS PARTITION (dt='2008-08-08', country='us'), PARTITION (dt='2008-08-09', country='us')";
//
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        Assert.assertEquals(StatementType.ALTER_TABLE_DROP_PARTS, statementLineage.getType());
//        statement.map(stmt -> {
//            if (stmt instanceof DropTablePartition) {
//                DropTablePartition tablePartition = (DropTablePartition) stmt;
//                String name = tablePartition.getTableName();
//                Assert.assertEquals("page_view", name);
//                Assert.assertTrue(tablePartition.getIfExists());
//                Assert.assertEquals(2, tablePartition.getPartitionSpecs().size());
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//    }
//
//    @Test
//    public void dropPartitionTest1() {
//        String sql = "ALTER TABLE page_view DROP PARTITION (dt='2008-08-08', country='us'), PARTITION (dt='2008-08-09', country='us')";
//
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        Assert.assertEquals(StatementType.ALTER_TABLE_DROP_PARTS, statementLineage.getType());
//        statement.map(stmt -> {
//            if (stmt instanceof DropTablePartition) {
//                DropTablePartition tablePartition = (DropTablePartition) stmt;
//                String name = tablePartition.getTableName();
//                Assert.assertEquals("page_view", name);
//                Assert.assertFalse(tablePartition.getIfExists());
//                Assert.assertEquals(2, tablePartition.getPartitionSpecs().size());
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//    }
//
//    @Test
//    public void addPartitionTest0() {
//        String sql = "ALTER TABLE page_view ADD PARTITION (partCol = 'value1') ";
//
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        Assert.assertEquals(StatementType.ALTER_TABLE_ADD_PARTS, statementLineage.getType());
//        statement.map(stmt -> {
//            if (stmt instanceof AddTablePartition) {
//                AddTablePartition tablePartition = (AddTablePartition) stmt;
//                String name = tablePartition.getTableName();
//                Assert.assertFalse(tablePartition.getIfNotExists());
//                Assert.assertEquals("page_view", name);
//                Assert.assertEquals(1, tablePartition.getPartitionSpecs().size());
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//    }
//
//    @Test
//    public void addPartitionTest1() {
//        String sql = "ALTER TABLE page_view add IF NOT EXISTS PARTITION (dt='2008-08-08', country='us')";
//
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        Assert.assertEquals(StatementType.ALTER_TABLE_ADD_PARTS, statementLineage.getType());
//        statement.map(stmt -> {
//            if (stmt instanceof AddTablePartition) {
//                AddTablePartition tablePartition = (AddTablePartition) stmt;
//                String name = tablePartition.getTableName();
//                Assert.assertEquals("page_view", name);
//                Assert.assertTrue(tablePartition.getIfNotExists());
//                Assert.assertEquals(1, tablePartition.getPartitionSpecs().size());
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//    }
//
//    @Test
//    public void renamePartitionTest() {
//        String sql = "ALTER TABLE page_view PARTITION (dt='2008-08-08')  RENAME TO PARTITION (dt='20080808')";
//
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        statement.map(stmt -> {
//            if (stmt instanceof Table) {
//                Table table = (Table) stmt;
//                String name = table.getTableName();
//                Assert.assertEquals("page_view", name);
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//    }
//
//    @Test
//    public void createFuncTest() {
//        String sql = "CREATE FUNCTION train_perceptron AS 'hivemall.classifier.PerceptronUDTF' " +
//                "using jar 'hdfs://tdhdfs/user/datacompute/platformtool/resources/132/latest/hivemall-spark.jar'";
//
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        statement.map(stmt -> {
//            if (stmt instanceof Function) {
//                Function func = (Function) stmt;
//                String name = func.getName();
//                Assert.assertEquals("train_perceptron", name);
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//    }
//
//    @Test
//    public void createFuncTest1() {
//        String sql = "CREATE TEMPORARY FUNCTION IF NOT EXISTS stream_json_extract_value AS 'com.dataworker.spark.jobserver.driver.udf.GenericUDTFJsonExtractValue'";
//
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        statement.map(stmt -> {
//            if (stmt instanceof Function) {
//                Function func = (Function) stmt;
//                String name = func.getName();
//                Assert.assertEquals("stream_json_extract_value", name);
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//    }
//
//    @Test
//    public void dropFuncTest() {
//        String sql = "drop FUNCTION train_perceptron";
//
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        statement.map(stmt -> {
//            if (stmt instanceof Function) {
//                Function func = (Function) stmt;
//                String name = func.getName();
//                Assert.assertEquals("train_perceptron", name);
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//    }
//
//    @Test
//    public void descFunctionTest() {
//        String sql = "desc function random_int";
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        statement.map(stmt -> {
//            if (stmt instanceof Function) {
//                Function func = (Function) stmt;
//                String name = func.getName();
//                Assert.assertEquals("random_int", name);
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
//                Assert.assertEquals(2, tableData.getInputTables().size());
//                Assert.assertEquals("users", tableData.getInputTables().get(0).getTableName());
////                Assert.assertEquals("demo_rp.bigdata.users", tableData.getInputTables().get(0).getFullTableName());
//                Assert.assertEquals("bigdata.users", tableData.getInputTables().get(0).getFullTableName());
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
//
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
//
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
//                "           and t1.expire_date >= current_date()\n" +
//                "     left join tidb_datacompute.dc_project_member t2\n" +
//                "             on t1.obj_id = t2.user_id\n" +
//                "     where t.`lifecycle` == 1" +
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
//
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
//    public void queryTest7() {
//        String sql = "select true is false";
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
//        String sql = "insert OVERWRITE TABLE users PARTITION(ds) values('libinsong', '20170220')";
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
//                Assert.assertEquals(0, tableData.getPartitions().get().size());
//
//                Assert.assertEquals(2, tableData.getInputTables().size());
//                Assert.assertEquals("account", tableData.getInputTables().get(0).getTableName());
//                Assert.assertEquals("address", tableData.getInputTables().get(1).getTableName());
//
//                Assert.assertEquals("bigdata.test", tableData.getFunctionNames().iterator().next());
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
//    public void mutilInsertTest() {
//        String sql = "FROM default.sample_07 " +
//                "INSERT OVERWRITE TABLE toodey1 SELECT sample_07.code,sample_07.salary " +
//                "INSERT OVERWRITE TABLE toodey2 SELECT sample_07.code,sample_07.salary WHERE sample_07.salary >= 50000 " +
//                "INSERT OVERWRITE TABLE toodey3 SELECT sample_07.total_emp,sample_07.salary WHERE sample_07.salary <= 50000";
//
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        Assert.assertEquals(StatementType.MULTI_INSERT, statementLineage.getType());
//        statement.map(stmt -> {
//            if (stmt instanceof TableData) {
//                TableData tableData = (TableData) stmt;
//                Assert.assertEquals("sample_07", tableData.getInputTables().get(0).getTableName());
//                Assert.assertEquals(3, tableData.getOutpuTables().size());
//                Assert.assertEquals("toodey3", tableData.getOutpuTables().get(2).getTableName());
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//    }
//
//    @Test
//    public void showTablesTest() {
//        String sql = "show Tables";
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Assert.assertEquals(StatementType.SHOW_TABLES, statementLineage.getType());
//
//        sql = "show Tables in bigdata";
//        statementLineage = parserService.parseSqlTableLineage(sql);
//        Assert.assertEquals(StatementType.SHOW_TABLES, statementLineage.getType());
//        Optional<Statement> statement = statementLineage.getStatement();
//        statement.map(stmt -> {
//            if (stmt instanceof Database) {
//                Database database = (Database) stmt;
//                Assert.assertEquals("bigdata", database.getDatabaseName());
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//
//        sql = "show Tables from bigdata";
//        statementLineage = parserService.parseSqlTableLineage(sql);
//        Assert.assertEquals(StatementType.SHOW_TABLES, statementLineage.getType());
//        statement = statementLineage.getStatement();
//        statement.map(stmt -> {
//            if (stmt instanceof Database) {
//                Database database = (Database) stmt;
//                Assert.assertEquals("bigdata", database.getDatabaseName());
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//    }
//
//    @Test
//    public void showViewsTest() {
//        String sql = "show views";
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Assert.assertEquals(StatementType.SHOW_VIEWS, statementLineage.getType());
//
//        sql = "show views in bigdata";
//        statementLineage = parserService.parseSqlTableLineage(sql);
//        Assert.assertEquals(StatementType.SHOW_VIEWS, statementLineage.getType());
//        Optional<Statement> statement = statementLineage.getStatement();
//        statement.map(stmt -> {
//            if (stmt instanceof Database) {
//                Database database = (Database) stmt;
//                Assert.assertEquals("bigdata", database.getDatabaseName());
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//
//        sql = "show views from bigdata";
//        statementLineage = parserService.parseSqlTableLineage(sql);
//        Assert.assertEquals(StatementType.SHOW_VIEWS, statementLineage.getType());
//        statement = statementLineage.getStatement();
//        statement.map(stmt -> {
//            if (stmt instanceof Database) {
//                Database database = (Database) stmt;
//                Assert.assertEquals("bigdata", database.getDatabaseName());
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//    }
//
//    @Test
//    public void useTest() {
//        String sql = "use bigdata";
//
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Assert.assertEquals(StatementType.USE, statementLineage.getType());
//        Optional<Statement> statement = statementLineage.getStatement();
//        statement.map(stmt -> {
//            if (stmt instanceof Database) {
//                Database database = (Database) stmt;
//                Assert.assertEquals("bigdata", database.getDatabaseName());
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//    }
//
//    @Test
//    public void setTest() {
//        String sql = "set spark.executor.memory=30g";
//
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Assert.assertEquals(StatementType.SET, statementLineage.getType());
//    }
//
//    @Test
//    public void substrFile() {
//        String sql = "SELECT substring('Spark SQL' from 5)";
//
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Assert.assertEquals(StatementType.SELECT, statementLineage.getType());
//    }
//
//    @Test
//    public void deleteTest() {
//        String sql = "delete from aa.user where name='xc'";
//
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        Assert.assertEquals(StatementType.DELETE, statementLineage.getType());
//        statement.map(stmt -> {
//            if (stmt instanceof DeleteTable) {
//                DeleteTable table = (DeleteTable) stmt;
//                Assert.assertEquals("user", table.getTableName());
//                Assert.assertEquals("name='xc'", table.getWhere().get());
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//    }
//
//    @Test
//    public void updateTest0() {
//        String sql = "update user set name='xxx', age=20 where id=2";
//
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        Assert.assertEquals(StatementType.UPDATE, statementLineage.getType());
//        statement.map(stmt -> {
//            if (stmt instanceof UpdateTable) {
//                UpdateTable updateTable = (UpdateTable) stmt;
//                Assert.assertEquals("user", updateTable.getTableName());
//                Assert.assertEquals("id=2", updateTable.getWhere().get());
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//    }
//
//    @Test
//    public void updateTest1() {
//        String sql = "update user set name='xxx'";
//
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        Assert.assertEquals(StatementType.UPDATE, statementLineage.getType());
//        statement.map(stmt -> {
//            if (stmt instanceof UpdateTable) {
//                UpdateTable updateTable = (UpdateTable) stmt;
//                Assert.assertEquals("user", updateTable.getTableName());
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//    }
//
//    @Test
//    public void cetSelectTest0() {
//        String sql = "with q1 as ( select key from q2 where key = '5'), " +
//            "q2 as ( select key from test where key = '5') " +
//            "select * from (select key from q1) a";
//
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        Assert.assertEquals(StatementType.SELECT, statementLineage.getType());
//        statement.map(stmt -> {
//            if (stmt instanceof TableData) {
//                TableData tableData = (TableData) stmt;
//                Assert.assertEquals("test", tableData.getInputTables().get(1).getTableName());
//                Assert.assertEquals(2, tableData.getCteTempTables().size());
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
//            "a as (select * from src where key is not null), " +
//            "b as (select  * from src2 where value>0), " +
//            "c as (select * from src3 where value>0), " +
//            "d as (select a.key,b.value from a join b on a.key=b.key), " +
//            "e as (select a.key,c.value from a left outer join c on a.key=c.key and c.key is not null) " +
//            "insert overwrite table srcp partition (p='abc') " +
//            "select * from d union all select * from e";
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
//    public void createExternalTableTest1() {
//        String sql = "CREATE EXTERNAL TABLE s3Db.test_zc_s3( " +
//                        "name String COMMENT 'name', " +
//                        "cnt INT COMMENT 'cnt' " +
//                    ") COMMENT '原始数据表' " +
//                    "LOCATION 'hdfs://hive/test/'";
//
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        statement.map(stmt -> {
//            if (stmt instanceof Table) {
//                Table table = (Table) stmt;
//                String name = table.getDatabaseName().get();
//                Assert.assertEquals(table.getLocationPath().get(),"LOCATION'hdfs://hive/test/'");
//                Assert.assertEquals("s3Db", name);
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//    }
//
//    @Test
//    public void createTableTbl() {
//        String sql = "create table bigdata.test_orc9_dt ( " +
//                        "name string comment '', " +
//                        "name2 String comment '' " +
//                    ") " +
//                    "TBLPROPERTIES ('compression'='ZSTD', 'fileFormat'='orc', 'encryption'='0', \"orc.encrypt\"=\"hz_admin_key:name2\", \"orc.mask\"='nullify:name') " +
//                    "STORED AS orc " +
//                    "comment 'orc测试'";
//
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        statement.map(stmt -> {
//            if (stmt instanceof Table) {
//                Table table = (Table) stmt;
//                Map<String, String> prop = table.getProperties().get();
//                if(prop != null) {
//                    Assert.assertEquals("ZSTD", prop.get("compression"));
//                }
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//    }
//
//    @Test
//    public void countCondTest() {
//        String sql = "select count(type='mac' or null) From test_table where a=2";
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
//    public void typeConstructor() {
//        String sql = "select date '20220-02-13' as demo";
//        parserService.parseSqlTableLineage(sql);
//
//        sql = "select timestamp '20220-02-13' as demo";
//        parserService.parseSqlTableLineage(sql);
//
//        sql = "select time '20220-02-13' as demo";
//        parserService.parseSqlTableLineage(sql);
//    }
//
//    @Test
//    public void notSupportSql() {
//        String sql = "insert overwrite directory '/user/ahao' ROW FORMAT DELIMITED FIELDS TERMINATED BY '\\t' select * from nlp_dev.all_category_sample";
//        try {
//            parserService.parseSqlTableLineage(sql);
//            Assert.fail();
//        } catch (ParseException ex) {
//            Assert.assertTrue(true);
//        }
//    }
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
//
//    @Test
//    public void insertOverwriteTest1() {
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
//}
