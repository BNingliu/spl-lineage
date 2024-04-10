package com.myxql.parser.datax.util;

import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import com.myxql.parser.datax.enums.Constant;

/**
 * @program: spl-lineage
 * @description:
 * @author: liuningbo
 * @create: 2023/12/22 10:53
 */
public class DataXJsonHelper {

    /**
     * @param name
     * @return
     * @desc 处理特殊字符
     */
    public static String doConvertKeyword(String name) {
        if (name == null) {
            return null;
        }
        name = name.trim();
        name = name.replaceAll("\\[", "");
        name = name.replaceAll("]", "");
        name = name.replaceAll("`", "");
        name = name.replaceAll("\"", "");
        name = name.replaceAll("'", "");

        return name;
    }


    public static String[] getTableAndCatalog(String tableName) {
        tableName = doConvertKeyword(tableName);

        return tableName.split("\\.");
    }

    public static JSONObject getConnect(JSONObject jsonObject) {
        JSONObject parameter = jsonObject.getJSONObject(Constant.PARAMETER);
        JSONArray connections = parameter.getJSONArray(Constant.CONNECTION);
        JSONObject connect = connections.getJSONObject(0);
        return connect;
    }

    public static String getJsonObject(JSONObject connect, String key) {

        Object o = connect.get(key);
        if (o instanceof JSONArray) {
            JSONArray jsonArray = connect.getJSONArray(key);
            return jsonArray.getString(0);
        }   if (o instanceof String) {
            return  connect.getString(key);
        } else {
            return connect.getString(key);
        }

    }


}
