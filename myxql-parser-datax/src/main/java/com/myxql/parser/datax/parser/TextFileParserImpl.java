
package com.myxql.parser.datax.parser;

import com.alibaba.fastjson2.JSONObject;
import com.myxql.parser.datax.enums.Constant;
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
public class TextFileParserImpl extends ParserHandler {
    private Integer dbType;

    public TextFileParserImpl(Integer dbType) {
        super(dbType);
        this.dbType =dbType;
    }
    public  List<TableName> parserReader( JSONObject reader){
        List<TableName> list = new ArrayList<>();

        JSONObject parameter = reader.getJSONObject(Constant.PARAMETER);
        TableName tableName = new TableName();
        String databaseName = parameter.getJSONArray("path").getString(0);
        tableName.setTableName(databaseName);
         tableName.setDbType(dbType);
        String metaType =tableName.getDbType()+":textfile";
        tableName.setMetaType(Optional.of(metaType));
        list.add(tableName);
        return list;

    }

    public  List<TableName> parserWriter( JSONObject writer){
       return new ArrayList<>();
    }


}
