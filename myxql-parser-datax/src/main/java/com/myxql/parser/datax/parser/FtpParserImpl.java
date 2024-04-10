package com.myxql.parser.datax.parser;

import com.alibaba.fastjson2.JSONObject;
import com.myxql.parser.datax.enums.Constant;
import com.myxql.parser.db.Platform;
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
public class FtpParserImpl extends ParserHandler {
    private Integer dbType;

    public FtpParserImpl(Integer dbType) {
        super(dbType);
        this.dbType =dbType;
    }
    public  List<TableName> parserReader( JSONObject reader){
        List<TableName> list = new ArrayList<>();

        JSONObject parameter = reader.getJSONObject(Constant.PARAMETER);
        TableName tableName = new TableName();
        String databaseName = parameter.getJSONArray("path").getString(0);
        tableName.setTableName(databaseName);

        if("sftp".equals(parameter.getString("protocol"))){
            tableName.setDbType(Platform.sftp.getPlatform());
        }else {
            tableName.setDbType(dbType);
        }
        String metaType =tableName.getDbType()+":"+parameter.getString("host")+":"+parameter.getString("port");
        tableName.setMetaType(Optional.of(metaType));
        list.add(tableName);
        return list;

    }


    public  List<TableName> parserWriter( JSONObject writer){
        return new ArrayList<>();
    }
}
