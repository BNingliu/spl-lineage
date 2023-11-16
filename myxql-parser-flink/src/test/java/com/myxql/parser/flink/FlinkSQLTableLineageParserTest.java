package com.myxql.parser.flink;

import com.myxql.parser.SqlParserService;
import com.myxql.parser.flink.parser.MyFlinkSQLParser;
import com.myxql.parser.model.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.Optional;

public class FlinkSQLTableLineageParserTest {
    private SqlParserService parserService = new MyFlinkSQLParser();

    @Test
    public void createTableTest() {
        String sql = "CREATE TABLE myxql (`user` BIGINT, product STRING, order_time TIMESTAMP(3), WATERMARK FOR order_time AS order_time - INTERVAL '5' SECOND) WITH ('connector' = 'kafka')";

        StatementLineage statementLineage = parserService.parseSqlTableLineage(sql);
        Optional<Statement> statement = statementLineage.getStatement();
        statement.map(stmt -> {
            if (stmt instanceof Table) {
                Table table = (Table) stmt;
                String name = table.getTableName();
                Assert.assertEquals("myxql", name);
                Assert.assertEquals(3, table.getColumns().get().size());
            } else {
                Assert.fail();
            }
            return null;
        });
    }

    @Test
    public void parseMultiSqlTest() {
        String sql = "CREATE TABLE IF NOT EXISTS `RETEK_XX_ITEM_ATTR_TRANSLATE_PRODUCT_ENRICHMENT`("+
              "`ITEM`                 STRING,"+
              "`UDA_ID`               DECIMAL(5,0),"+
              "`UDA_VALUE_ID`         DECIMAL(3,0),"+
              "`LANG`                 DECIMAL(6,0),"+
              "`TRANSLATED_VALUE`     STRING,"+
              "`LAST_UPDATE_ID`       STRING,"+
              "`CREATE_DATETIME`      TIMESTAMP(3),"+
              "`LAST_UPDATE_DATETIME` TIMESTAMP(3),"+
              "`KAFKA_PROCESS_TIME` AS PROCTIME(),"+
              "`record_time` TIMESTAMP_LTZ(3) METADATA FROM 'timestamp',"+
              "`cost` AS price * quantity"+
            ") WITH ("+
            "   'connector' = 'kafka',"+
            "'properties.acks' = '-1',"+
            "'properties.allow.auto.create.topics' = 'true',"+
            "   'topic' = 'test',"+
            "   'properties.bootstrap.servers' = 'localhost:9082',"+
            "   'value.format' = 'changelog-json',"+
            "   'properties.group.id' = 'test',"+
            "   'key.fields' = 'ITEM;UDA_ID;LANG',"+
            "   'key.format'='json',"+
            "   'scan.startup.mode' = 'earliest-offset',"+
            "   'value.changelog-json.timestamp-format.standard'='ISO-8601',"+
            "   'value.changelog-json.ignore-parse-errors' = 'true'"+
            ");"+
            "CREATE VIEW IF NOT EXISTS `MDM_VIEW_PRODUCT_ENRICHMENT` AS"+
            "(SELECT 'WTCTH' BU_CODE, 'WTCTH' FORMULA_COUNTRY_ID,"+
            "   uif.ITEM PRODUCT_ID,"+
            "   CAST(CAST(uif.UDA_ID AS DECIMAL(5, 0)) AS STRING) ENRICHMENT_ID,"+
            "   uif.UDA_TEXT ENRICHMENT_VALUE,"+
            "   u.UDA_DESC ENRICHMENT_DESC,"+
            "   u.SINGLE_VALUE_IND SINGLE_VALUE_IND,"+
            "   u.DISPLAY_TYPE CONTROL_TYPE,"+
            "   'EN' LANG,"+
            "   'FLINKJDBC' CREATE_BY,"+
            "   uif.LAST_UPDATE_ID LAST_UPDATE_BY,"+
            "   uif.CREATE_DATETIME CREATED,"+
            "   uif.LAST_UPDATE_DATETIME LAST_UPDATED"+
            "FROM RETEK_UDA_ITEM_FF_PRODUCT_ENRICHMENT uif"+
            "JOIN MDM_DIM_UDA_LOOKUPMAP_ORACLE FOR SYSTEM_TIME AS OF uif.KAFKA_PROCESS_TIME AS u"+
            "   ON CAST(uif.UDA_ID AS DECIMAL(5, 0)) = u.UDA_ID"+
            "JOIN MDM_DIM_PRODUCT_ATTRIB_TYPE_LOOKUPMAP_MYSQL FOR SYSTEM_TIME AS OF uif.KAFKA_PROCESS_TIME AS pat"+
            "   ON CAST(CAST(uif.UDA_ID AS DECIMAL(5, 0)) AS STRING) = pat.ATTRIB_ID"+
            "   AND pat.ATTRIB_TYPE = 'PRODUCT_ENRICHMENT'"+
            ");"+

            "INSERT INTO PROCESSED_MDM_PRODUCT_ENRICHMENT(PRODUCT_ID, ENRICHMENT_ID, LANG, ENRICHMENT_VALUE,LAST_UPDATED)"+
            "select PRODUCT_ID, ENRICHMENT_ID, LANG, ENRICHMENT_VALUE,LAST_UPDATED from MDM_VIEW_PRODUCT_ENRICHMENT_TRANSLATE;";

        MultiStatementLineage statements = parserService.parseMultiSqlTableLineage(sql);
        StatementLineage createTable = statements.get(0);
        Statement createStatement = createTable.getStatement().get();
        if (createStatement instanceof Table) {
            Table table = (Table) createStatement;
            Assert.assertEquals("RETEK_XX_ITEM_ATTR_TRANSLATE_PRODUCT_ENRICHMENT", table.getTableName());
            Assert.assertEquals(11, table.getColumns().get().size());
            Assert.assertEquals("PROCTIME()", table.getColumns().get().get(8).getExpression());
//            Assert.assertEquals("timestamp", table.getColumns().get().get(9).metadataKey);
            Assert.assertEquals("price * quantity", table.getColumns().get().get(10).getExpression());

            Assert.assertEquals(12, table.getProperties().get().size());
        } else {
            Assert.fail();
        }

/*
        StatementLineage createView = statements.get(1);
        Statement viewStatement = createView.getStatement().get();
        if (viewStatement instanceof View) {
            View view = (View) viewStatement;
            Assert.assertEquals("MDM_VIEW_PRODUCT_ENRICHMENT", view.getTableName());
            Assert.assertEquals(3, viewStatement.getInputTables().size());
        } else {
            Assert.fail();
        }

        StatementLineage insertTable = statements.get(2);
        Statement insertStatement = insertTable.getStatement().get();
        if (insertStatement instanceof InsertStatement) {
            Assert.assertEquals("PROCESSED_MDM_PRODUCT_ENRICHMENT", insertTable.outputTables.get(0).tableName)
            Assert.assertEquals(1, insertTable.getInputTables().size());
            Assert.assertEquals(5, insertTable.getColumns().size());
        } else {
            Assert.fail();
        }
 */
    }

}
