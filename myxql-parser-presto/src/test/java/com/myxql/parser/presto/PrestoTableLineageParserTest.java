//package com.myxql.parser.presto;
//
//import com.alibaba.fastjson.JSONObject;
//import com.myxql.parser.antlr4.ParseException;
//import com.myxql.parser.SqlParserService;
//import com.myxql.parser.model.*;
//import com.myxql.parser.presto.parser.MyPrestoSQLParser;
//import org.junit.Assert;
//import org.junit.Test;
//
//import java.util.Map;
//import java.util.Optional;
//
//public class PrestoTableLineageParserTest {
//    private MyPrestoSQLParser parserService = new MyPrestoSQLParser();
///*
//    @Test
//    public void createDatabaseTest() {
//        String sql = "CREATE Schema IF NOT EXISTS myxql";
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
//        String sql = "drop Schema IF EXISTS myxql";
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
//                "COMMENT 'hello world' " +
//                "with (\"dataCenter\"='hangzhou')";
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
//                Assert.assertFalse(table.getTemporary());
//
//                Assert.assertEquals(7, table.getColumns().get().size());
//                Assert.assertEquals("'hello world'", table.getComment().get());
//                Assert.assertEquals(1, table.getProperties().get().size());
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
//                "with ( " +
//                "\"transient_lastDdlTime\" = '1627281671')";
//
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        statement.map(stmt -> {
//            if (stmt instanceof Table) {
//                Table table = (Table) stmt;
//                String name = table.getTableName();
//                Assert.assertEquals("export_test_dt", name);
//                Assert.assertEquals(3, table.getColumns().get().size());
//                Assert.assertEquals(1, table.getProperties().get().size());
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//    }
//
//    @Test
//    public void createTableTest7() {
//        String sql = "CREATE TABLE test_demo_test (name string, age int) ";
//
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        statement.map(stmt -> {
//            if (stmt instanceof Table) {
//                Table table = (Table) stmt;
//                String name = table.getTableName();
//                Assert.assertEquals("test_demo_test", name);
//                Assert.assertEquals(2, table.getColumns().get().size());
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//    }
//
//    @Test
//    public void createTableSelectTest() {
//        String sql = "create table \nIF NOT EXISTS tdl_users_1 as select *, bigdata.TEST(name) from bigdata.users a left outer join address b on a.addr_id = b.id";
//
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        statement.map(stmt -> {
//            if (stmt instanceof Table) {
//                Table table = (Table) stmt;
//                String name = table.getTableName();
//                Assert.assertEquals(StatementType.CREATE_TABLE_AS_SELECT, statementLineage.getType());
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
//    public void createTableSelectTest2() {
//        String sql = "create table \nIF NOT EXISTS tdl_users_1 as (select * from users a left outer join address b on a.addr_id = b.id)";
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
//    public void createTableSelectTest3() {
//        String sql = "create table \nIF NOT EXISTS tdl_users_1 as (select * from users a left outer join address b on a.addr_id = b.id" +
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
//        String sql = "create table huaixin_rp.bigdata.test_iceberg_1 as " +
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
//        String sql = "create table tdl_users_1 as select * from bigdata.users a left outer join address b on a.addr_id = b.id";
//
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        statement.map(stmt -> {
//            if (stmt instanceof Table) {
//                Table table = (Table) stmt;
//                String name = table.getTableName();
//                Assert.assertEquals(StatementType.CREATE_TABLE_AS_SELECT, statementLineage.getType());
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
//        String sql = "TRUNCATE TABLE test.user";
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
//                "as " +
//                "select * from account ";
//
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        statement.map(stmt -> {
//            if (stmt instanceof View) {
//                View view = (View) stmt;
//                String name = view.getTableName();
//                Assert.assertEquals("view_users", name);
//                Assert.assertEquals("select * from account", view.getQuerySql().get());
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//    }
//
//    @Test
//    public void createViewTest1() {
//        String sql = "CREATE MATERIALIZED View if not exists view_users " +
//                "comment 'view test' " +
//                "as " +
//                "select *, bigdata.test(name) from account";
//
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        statement.map(stmt -> {
//            if (stmt instanceof View) {
//                View view = (View) stmt;
//                String name = view.getTableName();
//                Assert.assertEquals("view_users", name);
//                Assert.assertEquals("'view test'", view.getComment().get());
//                Assert.assertEquals("select *, bigdata.test(name) from account", view.getQuerySql().get());
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
//    public void addColumnsTest() {
//        String sql = "alter table test.sale_detail add column col_name1 string comment 'col_name1'";
//
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        statement.map(stmt -> {
//            if (stmt instanceof Table) {
//                Table table = (Table) stmt;
//                Assert.assertEquals(StatementType.ALTER_TABLE_ADD_COL, statementLineage.getType());
//                String name = table.getTableName();
//                Assert.assertEquals("sale_detail", name);
//                Assert.assertEquals(1, table.getColumns().get().size());
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
//                Assert.assertEquals("demo_rp.bigdata.users", tableData.getInputTables().get(0).getFullTableName());
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
//                "           and t1.expire_date >= current_date\n" +
//                "     left join tidb_datacompute.dc_project_member t2\n" +
//                "             on t1.obj_id = t2.user_id\n" +
//                "     where t.`lifecycle` = 1" +
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
//        String sql = "insert into users values('libinsong', 12, 'test'), ('libinsong', 13, 'test')";
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
//*/
//
//    @Test
//    public void insertIntoQueryTest2() {
//        String sql = "insert INTO users  select * from account a join address b on a.addr_id=b.id";
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        Assert.assertEquals(StatementType.INSERT_SELECT, statementLineage.getType());
//        statement.map(stmt -> {
//            if (stmt instanceof TableData) {
//                TableData tableData = (TableData) stmt;
//                Assert.assertEquals("users", tableData.getOutpuTables().get(0).getTableName());
//                Assert.assertEquals(InsertMode.INTO, tableData.getInsertMode().get());
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
//    public void insertIntoQueryTest3() {
//        String sql = "insert INTO users select *, bigdata.Test(id) from account a join address b on a.addr_id=b.id";
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        Assert.assertEquals(StatementType.INSERT_SELECT, statementLineage.getType());
//        statement.map(stmt -> {
//            if (stmt instanceof TableData) {
//                TableData tableData = (TableData) stmt;
//                Assert.assertEquals("users", tableData.getOutpuTables().get(0).getTableName());
//                Assert.assertEquals(InsertMode.INTO, tableData.getInsertMode().get());
//
//                Assert.assertEquals(2, tableData.getInputTables().size());
//                Assert.assertEquals("account", tableData.getInputTables().get(0).getTableName());
//                Assert.assertEquals("address", tableData.getInputTables().get(1).getTableName());
//
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//        Assert.assertEquals(statementLineage.getQuerySql().get(), "select *, bigdata.Test(id) from account a join address b on a.addr_id=b.id");
//    }
//
//    @Test
//    public void insertIntoQueryTest4() {
//        String sql = "insert INTO users select * from account1 union all " +
//                "select * from account2";
//        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
//        Optional<Statement> statement = statementLineage.getStatement();
//        Assert.assertEquals(StatementType.INSERT_SELECT, statementLineage.getType());
//        statement.map(stmt -> {
//            if (stmt instanceof TableData) {
//                TableData tableData = (TableData) stmt;
//                Assert.assertEquals("users", tableData.getOutpuTables().get(0).getTableName());
//                Assert.assertEquals(InsertMode.INTO, tableData.getInsertMode().get());
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
///*
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
//*/
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
//    public void cetSelectTest0() {
//        String sql = "with q1 as ( select key from q2 where key = '5'), " +
//                "q2 as ( select key from test where key = '5') " +
//                "select * from (select key from q1) a";
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
//    public void createTableTbl() {
//        String sql = "create table bigdata.test_orc9_dt ( " +
//                "name string comment '', " +
//                "name2 String comment '' " +
//                ") " +
//                "comment 'orc测试'" +
//                "with (compression=ZSTD, fileFormat=orc, encryption=0, \"orc.encrypt\"=\"hz_admin_key:name2\", \"orc.mask\"=\"nullify:name\") ";
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
//        String sql = "select count(type='mac' or null) from test_table where a=2";
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
//}
