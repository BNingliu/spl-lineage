package com.myxql.parser.datax.parser;

import com.alibaba.fastjson2.JSONObject;
import com.myxql.parser.datax.enums.Constant;
import com.myxql.parser.datax.util.DatabaseUrlParser;
import com.myxql.parser.model.TableName;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @program: spl-lineage
 * @description:
 * @author: liuningbo
 * @create: 2023/12/25 15:25
 */
public class HiveParserImpl extends ParserHandler {
    private Integer dbType;

    public HiveParserImpl(Integer dbType) {
        super(dbType);
        this.dbType =dbType;
    }

    public List<TableName> parserWriter(JSONObject writer){
        List<TableName> list = new ArrayList<>();

        JSONObject parameter = writer.getJSONObject(Constant.PARAMETER);
        TableName tableName = new TableName();

        String databaseName = parameter.getString("dbName");
        String fileName = parameter.getString("fileName");
        tableName.setTableName(fileName);
        tableName.setDbType(dbType);
        tableName.setDatabaseName(databaseName);
        String defaultFS = parameter.getString("defaultFS");
        tableName.setMetaType(Optional.of(DatabaseUrlParser.extractIpPortAndDatabase(dbType,defaultFS)));
        list.add(tableName);
        return list;
    }


}
