package com.myxql.parser.model;

import org.apache.commons.lang3.StringUtils;

import java.util.Optional;

public class ModelHelper {
    public static String innerFullTableName(Optional<String> catalogName, Optional<String> databaseName, String tableName) {
        if (catalogName.isPresent()) {
            return catalogName.get() + '.' + databaseName.get() + '.' + tableName;
        } else {
            return databaseName.isPresent() ? databaseName.get() + '.' + tableName : tableName;
        }
    }

    public static String dealNameMark(String name) {
        if(name.startsWith("`") && name.endsWith("`")) {
            return name.substring(1, name.length()-1);
        }else{
            return name;
        }
    }

    public static String cleanQuote(String value) {
        String result = value;
        if (StringUtils.startsWith(result, "'") && StringUtils.endsWith(result, "'")) {
            result = StringUtils.substring(result, 1, -1);
        }

        if (StringUtils.startsWith(result, "\"") && StringUtils.endsWith(result, "\"")) {
            result = StringUtils.substring(result, 1, -1);
        }
        return result;
    }

}
