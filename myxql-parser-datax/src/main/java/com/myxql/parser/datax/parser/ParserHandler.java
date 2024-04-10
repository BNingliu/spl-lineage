package com.myxql.parser.datax.parser;

import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import com.myxql.parser.datax.enums.Constant;
import com.myxql.parser.datax.util.DataXJsonHelper;
import com.myxql.parser.datax.util.DatabaseUrlParser;
import com.myxql.parser.model.TableName;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @program: spl-lineage
 * @description:
 * @author: liuningbo
 * @create: 2023/12/21 14:54
 */
@Data
public class ParserHandler {

    private Integer dbType;
    public ParserHandler(Integer dbType) {
        this.dbType =dbType;
    }


    public  List<TableName> parserReader( JSONObject reader){
        List<TableName> list = new ArrayList<>();
        JSONObject connect = DataXJsonHelper.getConnect(reader);
        JSONArray tables = connect.getJSONArray(Constant.TABLE);
        String jdbcUrl = DataXJsonHelper.getJsonObject(connect,Constant.JDBCURL);
        for (Object table : tables) {
            TableName tableName = new TableName();
            String[] catalogAndTable = DataXJsonHelper.getTableAndCatalog(table.toString());
            if(catalogAndTable.length==2){
                tableName.setCatalogName(catalogAndTable[0]);
                tableName.setTableName(catalogAndTable[1]);
            }else {
                tableName.setTableName(catalogAndTable[0]);
            }
            tableName.setDbType(dbType);
            tableName.setDatabaseName(DatabaseUrlParser.extractDatabaseName(jdbcUrl));
            tableName.setMetaType(Optional.of(DatabaseUrlParser.extractIpPortAndDatabase(dbType,jdbcUrl)));
            list.add(tableName);
        }
        return list;
    }

    public  List<TableName> parserWriter( JSONObject writer){
        List<TableName> list = new ArrayList<>();
        JSONObject connect = DataXJsonHelper.getConnect(writer);
        JSONArray tables = connect.getJSONArray(Constant.TABLE);
        String jdbcUrl = DataXJsonHelper.getJsonObject(connect,Constant.JDBCURL);
        for (Object table : tables) {
            TableName tableName = new TableName();
            String[] catalogAndTable = DataXJsonHelper.getTableAndCatalog(table.toString());
            if(catalogAndTable.length==2){
                tableName.setCatalogName(catalogAndTable[0]);
                tableName.setTableName(catalogAndTable[1]);
            }else {
                tableName.setTableName(catalogAndTable[0]);
            }
            tableName.setDbType(dbType);
            tableName.setDatabaseName(DatabaseUrlParser.extractDatabaseName(jdbcUrl));
            tableName.setMetaType(Optional.of(DatabaseUrlParser.extractIpPortAndDatabase(dbType,jdbcUrl)));
            list.add(tableName);
        }
        return list;
    }
}
