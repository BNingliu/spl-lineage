package com.myxql.parser.datax;

import com.alibaba.fastjson2.JSON;
import com.myxql.parser.datax.parser.ParserFactory;
import com.myxql.parser.model.StatementLineage;

/**
 * @program: myxql
 * @description:
 * @author: liuningbo
 * @create: 2023/11/15 13:21
 */
public class Demo {
    public static void main(String[] args) {
        String  sql ="{\n" +
                "\t\"job\":{\n" +
                "\t\t\"setting\":{\n" +
                "\t\t\t\"speed\":{\n" +
                "\t\t\t\t\"channel\":\"3\",\n" +
                "\t\t\t\t\"byte\":\"1047552\"\n" +
                "\t\t\t},\n" +
                "\t\t\t\"errorLimit\":{\n" +
                "\t\t\t\t\"record\":\"0\",\n" +
                "\t\t\t\t\"percentage\":\"0.02\"\n" +
                "\t\t\t}\n" +
                "\t\t},\n" +
                "\t\t\"content\":[\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"reader\":{\n" +
                "\t\t\t\t\t\"name\":\"postgresqlreader\",\n" +
                "\t\t\t\t\t\"parameter\":{\n" +
                "\t\t\t\t\t\t\"column\":[\n" +
                "\t\t\t\t\t\t\t\"id\",\n" +
                "\t\t\t\t\t\t\t\"name\",\n" +
                "\t\t\t\t\t\t\t\"avg\",\n" +
                "\t\t\t\t\t\t\t\"phone\",\n" +
                "\t\t\t\t\t\t\t\"column1\"\n" +
                "\t\t\t\t\t\t],\n" +
                "\t\t\t\t\t\t\"username\":\"28b209a56a48524a165f30c0196c2d14\",\n" +
                "\t\t\t\t\t\t\"password\":\"28b209a56a48524a165f30c0196c2d14\",\n" +
                "\t\t\t\t\t\t\"splitPk\":\"\",\n" +
                "\t\t\t\t\t\t\"connection\":[\n" +
                "\t\t\t\t\t\t\t{\n" +
                "\t\t\t\t\t\t\t\t\"table\":[\n" +
                "\t\t\t\t\t\t\t\t\t\"public.ods_ods_v5\"\n" +
                "\t\t\t\t\t\t\t\t],\n" +
                "\t\t\t\t\t\t\t\t\"jdbcUrl\":[\n" +
                "\t\t\t\t\t\t\t\t\t\"jdbc:postgresql://192.168.2.131:15432/qianbase\"\n" +
                "\t\t\t\t\t\t\t\t]\n" +
                "\t\t\t\t\t\t\t}\n" +
                "\t\t\t\t\t\t]\n" +
                "\t\t\t\t\t}\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t\"writer\":{\n" +
                "\t\t\t\t\t\"name\":\"aftwriter\",\n" +
                "\t\t\t\t\t\"parameter\":{\n" +
                "\t\t\t\t\t\t\"path\":\"/home/aft4c/file/\",\n" +
                "\t\t\t\t\t\t\"fileName\":\"ods_v1\",\n" +
                "\t\t\t\t\t\t\"writeMode\":\"truncate\",\n" +
                "\t\t\t\t\t\t\"suffix\":\".del\",\n" +
                "\t\t\t\t\t\t\"compress\":\"\",\n" +
                "\t\t\t\t\t\t\"compressPassword\":\"\",\n" +
                "\t\t\t\t\t\t\"header\":[\n" +
                "\t\t\t\t\t\t\t\"id\",\n" +
                "\t\t\t\t\t\t\t\"name\",\n" +
                "\t\t\t\t\t\t\t\"avg\",\n" +
                "\t\t\t\t\t\t\t\"phone\",\n" +
                "\t\t\t\t\t\t\t\"column1\"\n" +
                "\t\t\t\t\t\t],\n" +
                "\t\t\t\t\t\t\"fieldDelimiter\":\"|@|\",\n" +
                "\t\t\t\t\t\t\"op\":\"aft\",\n" +
                "\t\t\t\t\t\t\"app\":\"di\",\n" +
                "\t\t\t\t\t\t\"r_app\":\"base\",\n" +
                "\t\t\t\t\t\t\"basePort\":\"10066\",\n" +
                "\t\t\t\t\t\t\"host\":\"192.168.2.133\",\n" +
                "\t\t\t\t\t\t\"port\":\"7966\",\n" +
                "\t\t\t\t\t\t\"username\":\"8abf392fe1e40e9c0fa7f9fd8a12a43f\",\n" +
                "\t\t\t\t\t\t\"password\":\"792232e75b3336cc758d9f866ff9c4d0\"\n" +
                "\t\t\t\t\t}\n" +
                "\t\t\t\t}\n" +
                "\t\t\t}\n" +
                "\t\t]\n" +
                "\t},\n" +
                "\t\"core\":{\n" +
                "\t\t\"transport\":{\n" +
                "\t\t\t\"channel\":{\n" +
                "\t\t\t\t\"speed\":{\n" +
                "\t\t\t\t\t\"batchSize\":\"2048\",\n" +
                "\t\t\t\t\t\"record\":\"-1\",\n" +
                "\t\t\t\t\t\"byte\":\"1231412\"\n" +
                "\t\t\t\t}\n" +
                "\t\t\t}\n" +
                "\t\t}\n" +
                "\t}\n" +
                "}";
        StatementLineage statementLineage = ParserFactory.getrelationSqlHandler(sql);
        System.out.println(JSON.toJSONString(statementLineage));


//        DataxParser dataxParser = new DataxParser(Platform.datax.getPlatform());
//        StatementLineage data = dataxParser.parseSqlTableLineage(sql);
//        TableData tableData =(TableData) data.getStatement().get();
//        JSONObject jsonObject = new JSONObject();
//        jsonObject.put("descName","代发可群标签");
//        TableName tableName = new TableName(Optional.of("portrait_80"),"xx标签",jsonObject);
//        tableData.setOutpuTables(Collections.singletonList(tableName));
//
//        System.out.println(JSON.toJSONString(data));



    }
}
