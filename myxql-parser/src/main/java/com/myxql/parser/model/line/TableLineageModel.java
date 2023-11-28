package com.myxql.parser.model.line;

import com.myxql.parser.model.TableNameModel;

import java.util.HashSet;


public class TableLineageModel {

    private TableNameModel outputTable;

    /**
     * 输入的表名列表
     */
    private HashSet<TableNameModel> inputTables;

    public TableNameModel getOutputTable() {
        return outputTable;
    }

    public void setOutputTable(TableNameModel outputTable) {
        this.outputTable = outputTable;
    }

    public HashSet<TableNameModel> getInputTables() {
        return inputTables;
    }

    public void setInputTables(HashSet<TableNameModel> inputTables) {
        this.inputTables = inputTables;
    }
}
