package com.myxql.parser.plan;

import com.myxql.parser.antlr4.Origin;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
   支持单SingleInsert或MultiInsert
 */
public class InsertInto extends LogicalPlan {
    public static String TARGET_TYPE_TABLE = "table";
    public static String TARGET_TYPE_DIR = "dir";
    // "table","dir"
    private String targetType;
    // 多个InsertIntoTable 或 InsertIntoDir
    private List<LogicalPlan> insertInto;

    public InsertInto(Origin location, String insertType) {
        super(Optional.ofNullable(location));
        this.targetType = insertType;
        this.insertInto = new ArrayList<>();
    }

    public void addInsertInto(LogicalPlan plan) {
        this.insertInto.add(plan);
    }

    public void addInsertIntos(List<LogicalPlan> plans) {
        this.insertInto.addAll(plans);
    }

    public List<LogicalPlan> getInsertIntos() {
        return this.insertInto;
    }

    public String getTargetType() {
        return this.targetType;
    }
}
