# spl-lineage


#### 介绍

血缘分析，支持包括spark/hive/impala/presto/postgreSQL/mysql等常见大数据引擎，采用antlr4实现从SQL语句中解析表血缘关系和字段血缘解关系。同时支持从SQL作业中分解参数及提取每条SQL的血缘数据。
#### 说明
基于 antlr4-4.9.3 与jdk-1.8 版本
#### 软件架构

软件架构说明

     |--------------------------------------------------------------|
     |SparkSQL  |  HiveSQL |  MySQL    |   PostgreSQL  |      ...   |
     |----------------Antlr4----------------------------------------|
     |   语法树解析（逻辑计划）、SQL格式化、SQL改写                     |
     |--------------------------------------------------------------|
     |   血缘模型：                                                  |
     |   1）作业输入输出                                             |
     |   2）表、分区、属性、表上下游关系                               |
     |   3）字段上下游关系                                            |
     |--------------------------------------------------------------|
        
#### 路线图
1.  SparkSQL表及字段血缘解析，已完成
2.  作业参数及作业输入输出表解析，已完成
3.  HiveSQL表及字段血缘解析，已完成
4.  PrestoSQL表级血缘解析，已完成，字段血缘解析，已完成
5.  Mysql表血缘解析，已完成，字段血缘解析，开发中
6.  PostgreSQL表血缘解析，已完成，字段血缘解析，开发中
7.  暂不支持链接metastore，因此*语法暂不支持

#### 使用说明

   使用时请可参考每个模块下的测试样例代码。 
   
1.  表数据血缘

    ~~~
    // 创建SQL解析对象
    SqlParserService parserService = new MyHiveSQLParser();
    // 待解析的SQL语句
    String sql = "INSERT INTO TABLE db_test.table_result SELECT t1.id, name FROM ( SELECT id1 + id2 AS id FROM db_test.table1 ) t1 LEFT JOIN ( SELECT id, name FROM ( SELECT id, sourcename AS name FROM db_test.table2 ) ) t2 ON t1.id=t2.id";
    // 解析语句，返回语句血缘数据
    StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
    // 获取语句数据
    Optional<Statement> statementData = statementLineage.getStatement();
    // 获取语句类型
    Assert.assertEquals(StatementType.INSERT_SELECT, statementLineage.getType());
    statement.map(stmt -> {
        if (stmt instanceof TableData) {
            // 表数据对象
            TableData tableData = (TableData) stmt;
            // 输入表
            Assert.assertEquals(2, tableData.getInputTables().size());
            // 输出表
            Assert.assertEquals(1, tableData.getOutpuTables().size());
        } else {
            Assert.fail();
        }
        return null;
    });
    ~~~
    
2.  字段血缘
    
    ~~~
    // 创建SQL解析对象
    SqlParserService parserService = new MyHiveSQLParser();
    // 输入的SQL语句
    String sql = "INSERT INTO TABLE db_test.table_result(idd, name) SELECT t1.id, name_x FROM ( SELECT id1 + id2 AS id FROM db_test.table1 ) t1 LEFT JOIN ( SELECT id, name_x FROM ( SELECT id, sourcename AS name_x FROM db_test.table2 ) ) t2 ON t1.id=t2.id";
    // 解析字段血缘
    StatementLineage statementLineage = parserService.parseSqlFieldLineage(sql);
    // 解析语句，返回语句血缘数据
    Optional<Statement> statement = statementLineage.getStatement();
    // 获取语句类型
    Assert.assertEquals(StatementType.INSERT_SELECT, statementLineage.getType());
    statement.map(stmt -> {
        if (stmt instanceof TableData) {
            TableData tableData = (TableData) stmt;
            // 字段血缘数据
            List<ColumnLineage> columnLineageList = tableData.getColumnDatas().get();
            // 字段血缘列表
            Assert.assertEquals(2, columnLineageList.size());
            // 字段来源
            Assert.assertEquals(3, columnLineageList.get(0).getSourceFields().size());
            Assert.assertEquals(1, columnLineageList.get(1).getSourceFields().size());
        } else {
            Assert.fail();
        }
        return null;
    });
    ~~~
    
3.  作业血缘
    ~~~
    // 包含参数设置及SQL语句的作业
    String sql = "set spark.app.name=sparkAppName;set spark.memory.storageFraction=0.1;set spark.memory.fraction=0.95;set spark.memory.useLegacyMode=true;use testdb;select aa from d;select cc from abc;";
    // 创建作业解析对象并解析作业
    List<StatementLineage> statementLineages = MyJobParser.parse(sql);
    Assert.assertEquals(7, statementLineages.size());
    // 获取作业血缘数据
    StatementLineage statementData = statementLineages.get(6);
    Optional<Statement> statement = statementData.getStatement();
    // 作业类型
    Assert.assertEquals(StatementType.JOB_SQL, statementData.getType());
    statement.map(stmt -> {
        if (stmt instanceof JobSql) { // SQL作业
            JobSql jobText = (JobSql) stmt;
            Assert.assertEquals("selectccfromabc", jobText.getSql());
        } else {
            Assert.fail();
        }
        return null;
    });
    ~~~
    
