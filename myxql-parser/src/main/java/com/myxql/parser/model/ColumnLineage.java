package com.myxql.parser.model;

import lombok.Data;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Data
public class ColumnLineage {
    /**
     * 目标字段
     */
    private ColumnName targetField;

    /**
     * 来源字段列表
     */
    private Set<ColumnName> sourceFields = new HashSet<>();

    private Integer relationship;

}
