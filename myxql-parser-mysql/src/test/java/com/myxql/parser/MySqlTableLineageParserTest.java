//package com.myxql.parser;
//
//import static org.junit.Assert.assertTrue;
//
//import com.alibaba.fastjson.JSONObject;
//import com.myxql.parser.model.*;
//import com.myxql.parser.mysql.parser.MySqlSQLParser;
//import org.junit.Assert;
//import org.junit.Test;
//
//import java.util.List;
//import java.util.Optional;
//
///**
// * Unit test for table lineage parser.
// */
//public class MySqlTableLineageParserTest {
//    private SqlParserService parserService = new MySqlSQLParser();
//
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
//    public void createTableNoPartitionTest() {
//        String sql = "CREATE TABLE dc_cluster_compute ( " +
//                "id	    int	comment	'id', " +
//                "data_center	varchar(10)	comment	'数据中心', " +
//                "code	varchar(10)	comment	'code', " +
//                "name	varchar(10)	comment	'集群名称' " +
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
//                Assert.assertEquals(table.getColumns().get().size(), 4);
////                Assert.assertEquals("数据中心", table.getColumns().get().get(1).getComment().get());
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
//                "`message` VARCHAR(100) COMMENT '', " +
//                "`collect_time` TIMESTAMP COMMENT '', " +
//                "`the_date` VARCHAR(10) COMMENT '', " +
//                "`the_nums` VARCHAR(10) COMMENT '') ";
//
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        statement.map(stmt -> {
//            if (stmt instanceof Table) {
//                Table table = (Table) stmt;
//                String name = table.getTableName();
//                Assert.assertEquals("export_test_dt", name);
//                Assert.assertEquals(4, table.getColumns().get().size());
//                Assert.assertEquals("the_date", table.getColumns().get().get(2).getName());
//                Assert.assertEquals("the_nums", table.getColumns().get().get(3).getName());
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
//                "message varchar(10), " +
//                "collect_time timestamp " +
//                ");";
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        statement.map(stmt -> {
//            if (stmt instanceof Table) {
//                Table table = (Table) stmt;
//                String name = table.getTableName();
//                Assert.assertEquals("dzlog_test_dt", name);
//                if(table.getColumns().isPresent()) {
//                    List<Column> columnList = table.getColumns().get();
//                    Assert.assertEquals(columnList.size(), 2);
//                }
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//    }
//
//
//    @Test
//    public void descTableTest0() {
//        String sql = "desc users";
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
//        String sql = "create table \nIF NOT EXISTS tdl_users_1 as select *, bigdata.name from bigdata.users a left outer join address b on a.addr_id = b.id";
//
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        statement.map(stmt -> {
//            if (stmt instanceof Table) {
//                Table table = (Table) stmt;
//                String name = table.getTableName();
//                Assert.assertEquals(StatementType.CREATE_TABLE_AS_SELECT, statementLineage.getType());
//                Assert.assertEquals("tdl_users_1", name);
//                Assert.assertEquals("select *, bigdata.name from bigdata.users a left outer join address b on a.addr_id = b.id", table.getQuerySql().get());
//                Assert.assertEquals(2, table.getTableData().get().getInputTables().size());
//                Assert.assertEquals("users", table.getTableData().get().getInputTables().get(0).getTableName());
//                Assert.assertEquals("address", table.getTableData().get().getInputTables().get(1).getTableName());
//
////                Assert.assertEquals("bigdata.test", table.getTableData().get().getFunctionNames().iterator().next());
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
//                "AS SELECT 1 as a, \"a\" as b";
//
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        statement.map(stmt -> {
//            if (stmt instanceof Table) {
//                Table table = (Table) stmt;
//                String name = table.getTableName();
//                Assert.assertEquals(StatementType.CREATE_TABLE_AS_SELECT, statementLineage.getType());
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
//        String sql = "create table \nIF NOT EXISTS tdl_users_1 as select * from users a left outer join address b on a.addr_id = b.id";
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
//        String sql = "create table bigdata.test_iceberg_1 as " +
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
//            if (stmt instanceof DropTable) {
//                DropTable dropTable = (DropTable) stmt;
//                Assert.assertEquals(dropTable.getTableNames().size(), 1);
//                Assert.assertEquals(dropTable.getTableNames().get(0).getTableName(), "sale_detail_drop2");
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
//            if (stmt instanceof DropTable) {
//                DropTable view = (DropTable) stmt;
//                Assert.assertEquals(true, view.getView());
//                String name = view.getTableNames().get(0).getTableName();
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
//        String sql = "select * from `demo_rp`.users a join address b on a.addr_id=b.id limit 101";
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        Assert.assertEquals(StatementType.SELECT, statementLineage.getType());
//        statement.map(stmt -> {
//            if (stmt instanceof TableData) {
//                TableData tableData = (TableData) stmt;
//                System.out.println("queryTest0, tableData="+ JSONObject.toJSONString(tableData));
//                Assert.assertEquals(2, tableData.getInputTables().size());
//                Assert.assertEquals("users", tableData.getInputTables().get(0).getTableName());
//                Assert.assertEquals("demo_rp.users", tableData.getInputTables().get(0).getFullTableName());
//                Assert.assertEquals("address", tableData.getInputTables().get(1).getTableName());
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
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//    }
//
//    @Test
//    public void queryTest2() {
//        String sql = "select * from users a inner join (select * from address where type='hangzhou') b on a.addr_id=b.id limit 101";
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        Assert.assertEquals(StatementType.SELECT, statementLineage.getType());
//        statement.map(stmt -> {
//            if (stmt instanceof TableData) {
//                TableData tableData = (TableData) stmt;
//                Assert.assertEquals(2, tableData.getInputTables().size());
//                Assert.assertEquals("users", tableData.getInputTables().get(0).getTableName());
//                Assert.assertEquals("address", tableData.getInputTables().get(1).getTableName());
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
///*
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
//*/
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
//        String sql = "insert into users PARTITION('20170220') values('libinsong', 12, 'test'), ('libinsong', 13, 'test')";
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
///*
//    @Test
//    public void countCondTest() {
//        String sql = "select count(mac) from test_table where a=2";
//
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Assert.assertEquals(StatementType.SELECT, statementLineage.getType());
//        Optional<Statement> statement = statementLineage.getStatement();
//        statement.map(stmt -> {
//            if (stmt instanceof TableData) {
//                TableData tableData = (TableData) stmt;
//                System.out.println("tableData="+tableData);
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
//        String sql = "INSERT INTO db_test.table_result SELECT t1.id, name FROM ( SELECT id1 + id2 AS id FROM db_test.table1 ) t1 LEFT JOIN ( SELECT id, name FROM ( SELECT id, sourcename AS name FROM db_test.table2 ) ) t2 ON t1.id=t2.id";
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
//*/
//
//}
