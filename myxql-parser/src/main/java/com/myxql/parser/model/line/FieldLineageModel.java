package com.myxql.parser.model.line;

import lombok.Data;

import java.util.HashSet;


@Data
public class FieldLineageModel {
    /**
     * 目标字段
     */
    private FieldNameModel targetField;

    /**
     * 来源字段列表
     */
    private HashSet<FieldNameWithProcessModel> sourceFields;


}
