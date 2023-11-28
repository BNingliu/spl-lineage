package com.myxql.parser.model;

import com.alibaba.fastjson2.JSONObject;
import org.apache.commons.lang3.tuple.Pair;

import java.util.List;
import java.util.Objects;
import java.util.Set;

/**
 * 字段血缘解析使用
 */
public class SelectItem extends Statement {
    public static String FIELD_TYPE_FIELD = "field";
    public static String FIELD_TYPE_CONST = "const";

    // 如: select a, b, bd.Test(id) as c
    private Set<String> fieldNames; // 来源列名
    private String alias;           // 列别名, c
    private String process;         // 计算处理,  a, b, bd.Test(id)
    private String tableName;      // 所属表别名
    private String fieldType = SelectItem.FIELD_TYPE_FIELD;      // 字段类型,字段：field, 常量const

    public Set<String> getFieldNames() {
        return fieldNames;
    }

    public void setFieldNames(Set<String> fieldNames) {
        this.fieldNames = fieldNames;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getProcess() {
        return process;
    }

    public void setProcess(String process) {
        this.process = process;
    }
    public String getTableName() {
        return this.tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getFieldType() {
        return fieldType;
    }

    public void setFieldType(String fieldType) {
        this.fieldType = fieldType;
    }

    static public Pair<String, String> parseAlias(String alias) {
        String[] parts = alias.split("\\.");
        Pair<String, String> pair = parts.length > 1 ? Pair.of(parts[0], parts[1]) : Pair.of(parts[0], null);
        return pair;
    }

    @Override
    public String toString() {
        return "SelectItem(fieldNames=" + this.fieldNames + ", alias=" + this.alias
                + ", process=" + this.process + ")";
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.fieldNames, this.alias, this.process);
    }

    @Override
    public boolean equals(Object that) {
        if(that == null) {
            return false;
        }
        if (this != that) {
            if (that instanceof SelectItem) {
                SelectItem var2 = (SelectItem) that;
                if (this.fieldNames.equals(var2.fieldNames) && this.alias.equals(var2.alias) &&
                    this.process.equals(var2.process)) {
                    return true;
                }
            }

            return false;
        } else {
            return true;
        }
    }

}
