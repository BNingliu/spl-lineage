package com.myxql.parser.model;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class DropTable extends Statement {
    private List<TableName> tableNames; // mysql支持一个语句删除多个表
    private Boolean isView = false; // 表或视图, true为视图，false为表

    public List<TableName> getTableNames() {
        return this.tableNames;
    }

    public void setTableNames(List<TableName> tableNames) {
        this.tableNames = tableNames;
    }

    public DropTable(List<TableName> tableNames) {
        super();
        this.tableNames = Objects.requireNonNull(tableNames, "tableNames is null");
    }

    public Boolean getView() {
        return isView;
    }

    public void setView(Boolean view) {
        isView = view;
    }

    @Override
    public String toString() {
        return "DropTable(, tableNames=" + this.tableNames + ")";
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.tableNames);
    }

    @Override
    public boolean equals(Object that) {
        if(that == null) {
            return false;
        }
        if (this != that) {
            if (that instanceof DropTable) {
                DropTable var2 = (DropTable)that;
                if (this.tableNames.equals(var2.tableNames)) {
                    return true;
                }
            }

            return false;
        } else {
            return true;
        }
    }
}
