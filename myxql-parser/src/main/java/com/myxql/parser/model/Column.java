package com.myxql.parser.model;


import java.util.Objects;
import java.util.Optional;

public final class Column extends Statement {
    private Optional<String> oldName;
    private Optional<String> defaultExpression;
    private Optional<String> expression;
    private boolean isPk;
    private Optional<String> position;
    private Optional<String> afterCol;
    private String name;
    private Optional<String> type;
    private Optional<String> comment;
    private boolean nullable;

    public Optional<String> getOldName() {
        return this.oldName;
    }

    public void setOldName(Optional<String> var1) {
        this.oldName = var1;
    }

    public Optional<String> getDefaultExpression() {
        return this.defaultExpression;
    }

    public void setDefaultExpression(Optional<String> var1) {
        this.defaultExpression = var1;
    }

    public Optional<String> getExpression() {
        return this.expression;
    }

    public void setExpression(Optional<String> var1) {
        this.expression = var1;
    }

    public boolean isPk() {
        return this.isPk;
    }

    public void setPk(boolean var1) {
        this.isPk = var1;
    }

    public Optional<String> getPosition() {
        return this.position;
    }

    public void setPosition(Optional<String> var1) {
        this.position = var1;
    }

    public Optional<String> getAfterCol() {
        return this.afterCol;
    }

    public void setAfterCol(Optional<String> var1) {
        this.afterCol = var1;
    }

    public String getName() {
        return this.name;
    }

    public Optional<String> getType() {
        return this.type;
    }

    public Optional<String> getComment() {
        return this.comment;
    }

    public boolean getNullable() {
        return this.nullable;
    }

    public Column(String name, Optional<String> type, Optional<String> comment, boolean nullable) {
        super();
        this.name = Objects.requireNonNull(name, "name is null");
        this.type = type;
        this.comment = comment;
        this.nullable = nullable;
    }

    @Override
    public String toString() {
        return "Column(name=" + this.name + ", type=" + this.type + ", comment=" + this.comment + ", nullable=" + this.nullable + ")";
    }

    @Override
    public int hashCode() {
        int var1 = (this.name != null ? this.name.hashCode() : 0) * 31;
        var1 = (var1 + (this.type.isPresent() ? this.type.hashCode() : 0)) * 31;
        var1 = (var1 + (this.comment.isPresent() ? this.comment.hashCode() : 0)) * 31;

        return var1 + (this.nullable ? 1 : 0);
    }

    @Override
    public boolean equals(Object that) {
        if(that == null) {
            return false;
        }
        if (this != that) {
            if (that instanceof Column) {
                Column var2 = (Column)that;
                if (this.name.equals(var2.name) && this.type.equals(var2.type)
                        && this.comment.equals(var2.comment) && this.nullable == var2.nullable) {
                    return true;
                }
            }

            return false;
        } else {
            return true;
        }
    }
}