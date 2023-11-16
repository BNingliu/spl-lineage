//package com.myxql.parser.job;
//
//import com.myxql.parser.job.parser.MyJobParser;
//import com.myxql.parser.model.*;
//import org.junit.Assert;
//import org.junit.Test;
//
//import java.util.List;
//import java.util.Optional;
//
//public class MyJobParserTest {
//    @Test
//    public void setConfigTest1() {
//        String sql = "set hive.test = 'hello world'; " +
//            "set hive.test = setsd,sd,resr; " +
//            "set hive.test = hello-world; " +
//            "set hive.test = hello ${usename} test; " +
//            "#set hive.test = hello comment;\n " +
//            "set hive.test = hello 'test' world; " +
//            "set hive.test = hello \"test\" world; " +
//            "set hive.test = hdfs://user/hive; " +
//            "set hive.test = 12,12; " +
//            "set hive.test = 3.45; " +
//            "set hive.test = ibdex.json; " +
//            "unset hive.test; " +
//            "set hive.test = dw.eset_sdfe_sd; " +
//            "set hive.test = demo.test; " +
//            "set hive.test = dsd(id)%=2; " +
//            "tet_test-demo_1.23-sdfd.jar com.example.Demo1 param1  param2 'hello \\n world' " +
//             "'hdfs://user/hive' " +
//             "'{\"user\": \"binsong.li\", " +
//             " address: \"hangzhou\" " +
//             "}' " +
//             "/user/jars/* " +
//             "--jars /user/jars/flink.jar";
//
//        List<StatementLineage> statementLineages = MyJobParser.parse(sql);
//        Assert.assertEquals(15, statementLineages.size());
//
//        StatementLineage statementLineage = statementLineages.get(0);
//        Optional<Statement> statement = statementLineage.getStatement();
//        Assert.assertEquals(StatementType.JOB_SET, statementLineage.getType());
//        statement.map(stmt -> {
//            if (stmt instanceof SetData) {
//                SetData setData = (SetData) stmt;
//                Assert.assertEquals("hive.test", setData.getKey());
//                Assert.assertEquals("hello world", setData.getValue().get());
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//
//        int setCount = 0;
//        for(StatementLineage stmtData : statementLineages) {
//            if(stmtData.getType() == StatementType.JOB_SET) {
//                setCount = setCount + 1;
//            }
//        }
//
//        Assert.assertEquals(13, setCount);
//
//        statementLineage = statementLineages.get(10);
//        statement = statementLineage.getStatement();
//        Assert.assertEquals(StatementType.JOB_UNSET, statementLineage.getType());
//        statement.map(stmt -> {
//            if (stmt instanceof UnSetData) {
//                UnSetData data = (UnSetData) stmt;
//                Assert.assertEquals("hive.test", data.getKey());
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//
//        statementLineage = statementLineages.get(14);
//        statement = statementLineage.getStatement();
//        Assert.assertEquals(StatementType.JOB, statementLineage.getType());
//        statement.map(stmt -> {
//            if (stmt instanceof JobData) {
//                JobData jobData = (JobData) stmt;
//                Assert.assertEquals("tet_test-demo_1.23-sdfd.jar", jobData.getResourceName());
//                Assert.assertEquals("com.example.Demo1", jobData.getClassName());
//                Assert.assertEquals(8, jobData.getParams().get().size());
//                Assert.assertEquals("/user/jars/*", jobData.getParams().get().get(5));
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//    }
//
//    @Test
//    public void setConfigTest2() {
//        String sql = "demo.jar com.myxql.Demo1 'hello \"test\" world' param2 \n param3";
//
//        List<StatementLineage> statementLineages = MyJobParser.parse(sql);
//        Assert.assertEquals(1, statementLineages.size());
//
//        StatementLineage statementData = statementLineages.get(0);
//        Optional<Statement> statement = statementData.getStatement();
//        Assert.assertEquals(StatementType.JOB, statementData.getType());
//        statement.map(stmt -> {
//            if (stmt instanceof JobData) {
//                JobData jobData = (JobData) stmt;
//                Assert.assertEquals("demo.jar", jobData.getResourceName());
//                Assert.assertEquals("com.myxql.Demo1", jobData.getClassName());
//                Assert.assertEquals(3, jobData.getParams().get().size());
//
//                Assert.assertEquals("hello \"test\" world", jobData.getParams().get().get(0));
//                Assert.assertEquals("param3", jobData.getParams().get().get(2));
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//    }
//
//    @Test
//    public void setConfigTest3() {
//        String sql = "set spark.yarn.queue=newoffline; " +
//            "set spark.sql.autoBroadcastJoinThreshold=40485760; " +
//            "set spark.executor.memory=8g; " +
//            "set spark.sql.hive.convertMetastoreParquet=true ; " +
//            "set spark.driver.maxResultSize=4g; " +
//            "set spark.driver.memory=10g; " +
//            "set spark.psi.ds=20180312; " +
//            "set spark.psi.dstTable=dw.index_psi_dt; " +
//            "set spark.psi.dims=idnumber; " +
//            "set spark.psi.num=0; " +
//            "set spark.psi.parNum=2; " +
//            "set spark.indexPSI.type=2; " +
//            "set spark.metrics.indexFile=index-mobile.json; " +
//            "psi_new_calculate_metrics-1.1-SNAPSHOT-jar-with-dependencies.jar  com.example.dw.psi.StartDCJob 1,3,sd,qw";
//
//        List<StatementLineage> statementLineages = MyJobParser.parse(sql);
//        Assert.assertEquals(14, statementLineages.size());
//
//        StatementLineage statementData = statementLineages.get(13);
//        Optional<Statement> statement = statementData.getStatement();
//        Assert.assertEquals(StatementType.JOB, statementData.getType());
//        statement.map(stmt -> {
//            if (stmt instanceof JobData) {
//                JobData jobData = (JobData) stmt;
//                Assert.assertEquals("psi_new_calculate_metrics-1.1-SNAPSHOT-jar-with-dependencies.jar", jobData.getResourceName());
//                Assert.assertEquals("com.example.dw.psi.StartDCJob", jobData.getClassName());
//                Assert.assertEquals("1,3,sd,qw", jobData.getParams().get().get(0));
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//    }
//
//    @Test
//    public void setConfigTest4() {
//        String sql = "set spark.yarn.queue=newoffline; " +
//            "set spark.dynamicAllocation.maxExecutors=100; " +
//            "set spark.driver.maxResultSize=30g; " +
//            "set spark.driver.memory=15g; " +
//            "set spark.executor.instances=80; " +
//            "set spark.executor.cores=5; " +
//            "set spark.executor.memory=30g; " +
//            "set spark.sql.shuffle.partitions=5000; " +
//            "set spark.shuffle.io.maxRetries=60; " +
//            "set spark.shuffle.io.retryWait=60s; " +
//            "set spark.metrics.indexFile=index-mobile.json; " +
//            "set spark.metrics.indexInputTable=dw.dwa_mobile_model_dt; " +
//            "set spark.metrics.indexOutputTable=dw.app_mdl_mobile_index_dt; " +
//            "set spark.metrics.indexWaitFullPartition=true; " +
//            "set spark.metrics.indexHashWhere=abs(hash(mobile))%4=3; " +
//            "new_calculate_metrics-100-SNAPSHOT-jar-with-dependencies.jar com.example.dw.index.StartDCJob IndexOffline 2018-03-18";
//
//        List<StatementLineage> statementLineages = MyJobParser.parse(sql);
//        Assert.assertEquals(16, statementLineages.size());
//
//        StatementLineage statementData = statementLineages.get(15);
//        Optional<Statement> statement = statementData.getStatement();
//        Assert.assertEquals(StatementType.JOB, statementData.getType());
//        statement.map(stmt -> {
//            if (stmt instanceof JobData) {
//                JobData jobData = (JobData) stmt;
//                Assert.assertEquals("new_calculate_metrics-100-SNAPSHOT-jar-with-dependencies.jar", jobData.getResourceName());
//                Assert.assertEquals("com.example.dw.index.StartDCJob", jobData.getClassName());
//                Assert.assertEquals("2018-03-18", jobData.getParams().get().get(1));
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//    }
//
//    @Test
//    public void setConfigTest5() {
//        String sql = "set spark.shuffle.compress=true;set spark.rdd.compress=true; " +
//            "set spark.driver.maxResultSize=3g; " +
//            "set spark.serializer=org.apache.spark.serializer.KryoSerializer; " +
//            "set spark.kryoserializer.buffer.max=1024m; " +
//            "set spark.kryoserializer.buffer=256m; " +
//            "set spark.network.timeout=300s; " +
//            "createHfile-1.2-SNAPSHOT-jar-with-dependencies.jar iee_test.euSaveHBase gaea_offline:account_mobile sh md shda.interest_radar_mobile_score_dt 20180318 /anc.fu/sh/mobile/loan 400 '%7B%22job_type%22=' --jar";
//
//        List<StatementLineage> statementLineages = MyJobParser.parse(sql);
//        Assert.assertEquals(8, statementLineages.size());
//
//        StatementLineage statementData = statementLineages.get(7);
//        Optional<Statement> statement = statementData.getStatement();
//        Assert.assertEquals(StatementType.JOB, statementData.getType());
//        statement.map(stmt -> {
//            if (stmt instanceof JobData) {
//                JobData jobData = (JobData) stmt;
//                Assert.assertEquals("createHfile-1.2-SNAPSHOT-jar-with-dependencies.jar", jobData.getResourceName());
//                Assert.assertEquals("iee_test.euSaveHBase", jobData.getClassName());
//                Assert.assertEquals("/anc.fu/sh/mobile/loan", jobData.getParams().get().get(5));
//                Assert.assertEquals("400", jobData.getParams().get().get(6));
//                Assert.assertEquals("%7B%22job_type%22=", jobData.getParams().get().get(7));
//                Assert.assertEquals("--jar", jobData.getParams().get().get(8));
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//    }
//
//    @Test
//    public void setConfigTest6() {
//        String sql = "set spark.toMysql.url=jdbc:mysql://192.168.40.110:3306/data_quality;set spark.toMysql.user=dq; " +
//            "set spark.toMysql.password=0nlpSvpgC5leeKuw; " +
//            "set spark.screenJob.screenType=3; " +
//            "set spark.screenJob.test=true; " +
//            "set spark.screenTool.srcTable=default.activity_flat; " +
//            "set spark.toMysql.tableName=province; " +
//            "set spark.toMysql.field=creditProvinceAmountJson,creditForeignAmount,creditCityAmountJson,zhejiangFraud,fraudProvinceAmountJson; " +
//            "province-1.0-SNAPSHOT-jar-with-dependencies.jar com.example.screen_dc.ScreenJob /xiaoyong.fu/2017-22-03/sh/mobile/loan/ --write-private-test; " +
//            "province-1.0-SNAPSHOT-jar-with-dependencies.jar com.example.screen_dc.ScreenJob /xiaoyong.fu/2017-22-03/sh/mobile/loan/ --write-private-test";
//
//        List<StatementLineage> statementLineages = MyJobParser.parse(sql);
//        Assert.assertEquals(10, statementLineages.size());
//
//        StatementLineage statementData = statementLineages.get(9);
//        Optional<Statement> statement = statementData.getStatement();
//        Assert.assertEquals(StatementType.JOB, statementData.getType());
//        statement.map(stmt -> {
//            if (stmt instanceof JobData) {
//                JobData jobData = (JobData) stmt;
//                Assert.assertEquals("province-1.0-SNAPSHOT-jar-with-dependencies.jar", jobData.getResourceName());
//                Assert.assertEquals("com.example.screen_dc.ScreenJob", jobData.getClassName());
//                Assert.assertEquals("/xiaoyong.fu/2017-22-03/sh/mobile/loan/", jobData.getParams().get().get(0));
//                Assert.assertEquals("--write-private-test", jobData.getParams().get().get(1));
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//    }
//
//    @Test
//    public void setConfigTest7() {
//        String sql = "raph.edgesSNAPSHOT.eventType.jar com.example.graph.PhoenixCSVWriterJob graph_csv_s_2 /user/datacompute/bigdata/data/shuoyi.zhao/graph_csv_s_2/2018/12/day_12 " +
//            "/user/datacompute/bigdata/data/shuoyi.zhao/graph_csv_s_new_2/Loan/2018/12/day_12 500 Loan hdfs://192.168.40.37,hdfs://192.168.39.133 hdfs://192.168.40.37,hdfs://192.168.39.130";
//
//        List<StatementLineage> statementLineages = MyJobParser.parse(sql);
//        Assert.assertEquals(1, statementLineages.size());
//
//        StatementLineage statementData = statementLineages.get(0);
//        Optional<Statement> statement = statementData.getStatement();
//        Assert.assertEquals(StatementType.JOB, statementData.getType());
//        statement.map(stmt -> {
//            if (stmt instanceof JobData) {
//                JobData jobData = (JobData) stmt;
//                Assert.assertEquals("raph.edgesSNAPSHOT.eventType.jar", jobData.getResourceName());
//                Assert.assertEquals("com.example.graph.PhoenixCSVWriterJob", jobData.getClassName());
//                Assert.assertEquals("hdfs://192.168.40.37,hdfs://192.168.39.130", jobData.getParams().get().get(6));
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//    }
//
//    @Test
//    public void setConfigTest8() {
//        String sql = "set spark.app.name=sparkAppName;set spark.memory.storageFraction=0.1;set spark.memory.fraction=0.95;set spark.memory.useLegacyMode=true;set master=yarn-cluster;/user/pontus_2.1/pontus-core-2.1.0-SNAPSHOT-fat.jar com.example.pontus.core.Engine customCmd \"-j{'readerFields':[{'field':'uuid','type':'string'},{'field':'rule_detail','type':'string'}],'resourceSetting':{'spark.driver.memory':'2g','spark.pontus.writer.mapper':'2'},'reader':{'databaseName':'afraudtech','connectionType':'hive','table':'antifraud_rule_result'},'writerFields':[{'transform':'uuid','field':'uuid','type':'varchar(32)'},{'filter':'where id=\'test\'','transform':'rule_detail','field':'policy_recommendation','type':'text'}],'writer':{'dataSourceId':'364','connectionAttr':'jdbc:mysql://192.168.74.136:3306/athena','password':'6ydJDezPBLBuco+sCV6QL6XsdTN/ShtYIz1Gi3TVusw=','writeMode':'UPSERT','userName':'athena','connectionType':'mysql','table':'edison_warning_result'}}\"  --jars /user/pontus_2.1/*";
//
//        List<StatementLineage> statementLineages = MyJobParser.parse(sql);
//        Assert.assertEquals(6, statementLineages.size());
//
//        StatementLineage statementData = statementLineages.get(5);
//        Optional<Statement> statement = statementData.getStatement();
//        Assert.assertEquals(StatementType.JOB, statementData.getType());
//        statement.map(stmt -> {
//            if (stmt instanceof JobData) {
//                JobData jobData = (JobData) stmt;
//                Assert.assertEquals("/user/pontus_2.1/pontus-core-2.1.0-SNAPSHOT-fat.jar", jobData.getResourceName());
//                Assert.assertEquals("com.example.pontus.core.Engine", jobData.getClassName());
//                Assert.assertEquals(4, jobData.getParams().get().size());
//                String config = "-j{'readerFields':[{'field':'uuid','type':'string'},{'field':'rule_detail','type':'string'}],'resourceSetting':{'spark.driver.memory':'2g','spark.pontus.writer.mapper':'2'},'reader':{'databaseName':'afraudtech','connectionType':'hive','table':'antifraud_rule_result'},'writerFields':[{'transform':'uuid','field':'uuid','type':'varchar(32)'},{'filter':'where id=\'test\'','transform':'rule_detail','field':'policy_recommendation','type':'text'}],'writer':{'dataSourceId':'364','connectionAttr':'jdbc:mysql://192.168.74.136:3306/athena','password':'6ydJDezPBLBuco+sCV6QL6XsdTN/ShtYIz1Gi3TVusw=','writeMode':'UPSERT','userName':'athena','connectionType':'mysql','table':'edison_warning_result'}}";
//                Assert.assertEquals(config.trim(), jobData.getParams().get().get(1));
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//    }
//
//    @Test
//    public void setConfigTest9() {
//        String sql = "set spark.app.name=sparkAppName;set spark.memory.storageFraction=0.1;set spark.memory.fraction=0.95;set spark.memory.useLegacyMode=true;use testdb;select aa from d;select cc from abc;";
//
//        List<StatementLineage> statementLineages = MyJobParser.parse(sql);
//        Assert.assertEquals(7, statementLineages.size());
//        StatementLineage statementData = statementLineages.get(6);
//        Optional<Statement> statement = statementData.getStatement();
//        Assert.assertEquals(StatementType.JOB_SQL, statementData.getType());
//        statement.map(stmt -> {
//            if (stmt instanceof JobSql) {
//                JobSql jobText = (JobSql) stmt;
//                Assert.assertEquals("selectccfromabc", jobText.getSql());
//            } else if(stmt instanceof JobData) {
//                JobData jobData = (JobData) stmt;
//                Assert.assertEquals("/user/pontus_2.1/pontus-core-2.1.0-SNAPSHOT-fat.jar", jobData.getResourceName());
//                Assert.assertEquals("com.example.pontus.core.Engine", jobData.getClassName());
//                Assert.assertEquals(4, jobData.getParams().get().size());
//                String config = "-j{'readerFields':[{'field':'uuid','type':'string'},{'field':'rule_detail','type':'string'}],'resourceSetting':{'spark.driver.memory':'2g','spark.pontus.writer.mapper':'2'},'reader':{'databaseName':'afraudtech','connectionType':'hive','table':'antifraud_rule_result'},'writerFields':[{'transform':'uuid','field':'uuid','type':'varchar(32)'},{'filter':'where id=\'test\'','transform':'rule_detail','field':'policy_recommendation','type':'text'}],'writer':{'dataSourceId':'364','connectionAttr':'jdbc:mysql://192.168.74.136:3306/athena','password':'6ydJDezPBLBuco+sCV6QL6XsdTN/ShtYIz1Gi3TVusw=','writeMode':'UPSERT','userName':'athena','connectionType':'mysql','table':'edison_warning_result'}}";
//                Assert.assertEquals(config.trim(), jobData.getParams().get().get(1));
//            } else {
//                Assert.fail();
//            }
//            return null;
//        });
//    }
//
//}
