package com.myxql.parser.model;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ColumnLineage {
    /**
     * 目标字段
     */
    private ColumnName targetField;

    /**
     * 来源字段列表
     */
    private Set<ColumnName> sourceFields = new HashSet<>();

    public ColumnName getTargetField() {
        return targetField;
    }

    public void setTargetField(ColumnName targetField) {
        this.targetField = targetField;
    }

    public void setSourceFields(Set<ColumnName> sourceFields) {
        this.sourceFields.addAll(sourceFields);
    }

    public Set<ColumnName> getSourceFields() {
        return this.sourceFields;
    }

    @Override
    public String toString() {
        return "ColumnName(targetField=" + this.targetField + ", sourceFields=" + this.sourceFields + ")";
    }

    @Override
    public int hashCode() {
        int var1 = (this.targetField != null ? this.targetField.hashCode() : 0) * 31;
        return var1 + (this.sourceFields != null ? Objects.hash(this.sourceFields) : 0);
    }

    @Override
    public boolean equals(Object that) {
        if(that == null) {
            return false;
        }
        if (this != that) {
            if (that instanceof ColumnLineage) {
                ColumnLineage var2 = (ColumnLineage) that;
                if (this.targetField.equals(var2.targetField) && this.sourceFields.equals(var2.sourceFields)) {
                    return true;
                }
            }

            return false;
        } else {
            return true;
        }
    }

}
