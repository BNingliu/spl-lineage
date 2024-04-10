package com.myxql.parser.datax.parser;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONObject;
import com.myxql.parser.db.Platform;
import com.myxql.parser.model.StatementLineage;
import com.myxql.parser.model.StatementType;
import com.myxql.parser.model.TableData;
import com.myxql.parser.model.TableName;

import java.util.List;
import java.util.Optional;

/**
 * @program: ytd-data-integration
 * @description:
 * @author: liuningbo
 * @create: 2023/12/04 11:11
 */
public class ParserFactory {

    public static StatementLineage getrelationSqlHandler(String sql) {
        JSONObject dataxJson = JSON.parseObject(sql);
        JSONObject jsonContent = dataxJson.getJSONObject("job").getJSONArray("content").getJSONObject(0);

        JSONObject reader = jsonContent.getJSONObject("reader");
        ParserHandler readerHandler = getrelationHandler(reader.getString("name"));
        List<TableName> readers = readerHandler.parserReader(reader);

        JSONObject writer = jsonContent.getJSONObject("writer");
        ParserHandler writerHandler = getrelationHandler(writer.getString("name"));
        List<TableName> writers = writerHandler.parserWriter(writer);

        TableData tableData = new TableData();
        tableData.setInputTables(readers);
        tableData.setOutpuTables(writers);
        if(writers.size()==0){
            return null;
        }
        StatementLineage statementLineage = new StatementLineage(
                StatementType.INSERT_SELECT,
                Optional.of(tableData)
        );
        return statementLineage;
    }
    public static ParserHandler getrelationHandler(String name) {
        name= name.toLowerCase().replaceAll("reader", "").replaceAll("writer", "");
        if (Platform.mysql.getName().equals(name)) {
            return new ParserHandler(Platform.getPlatform(name).getPlatform());
        } else  if (Platform.hdfs.getName().equals(name)) {
            return new HiveParserImpl(Platform.getPlatform(name).getPlatform());
        } else  if (Platform.ftp.getName().equals(name)||Platform.aft.getName().equals(name)) {
            return new FtpParserImpl(Platform.getPlatform(name).getPlatform());
        } else  if (Platform.txtfile.getName().equals(name)) {
            return new TextFileParserImpl(Platform.getPlatform(name).getPlatform());
        }  else {
            return new ParserHandler(Platform.getPlatform(name).getPlatform());
        }
    }

}
