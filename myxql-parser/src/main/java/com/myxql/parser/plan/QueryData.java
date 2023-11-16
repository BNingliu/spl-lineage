package com.myxql.parser.plan;

import com.myxql.parser.antlr4.Origin;
import com.myxql.parser.model.SelectItem;
import com.myxql.parser.model.TableData;
import com.myxql.parser.model.TableName;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * 进入select前
 * 解析每个select存信息并保存父子关系
 * 父子来源于from subSelect, join subSelect
 */
public class QueryData extends LogicalPlan {
    /**
     * select字段
     */
    private List<SelectItem> selectItems;

    /**
     * 来源表，来源子select则为null
     */
//    private TableName fromTable;

    /**
     * 表别名
     */
//    String tableAlias;
    private List<FromTable> fromTables = new ArrayList<>();

    /**
     * 是否union, union只有children元素
     * @param location
     */
    private Boolean isUnion = false;

    public QueryData(Origin location) {
        super(Optional.of(location));
    }

    // 增加子查询
    public void addSubquery(QueryData queryData) {
        this.addChild(queryData);
    }

    public List<SelectItem> getSelectItems() {
        return selectItems;
    }

    public void setSelectItems(List<SelectItem> projectItems) {
        this.selectItems = projectItems;
    }

    public List<FromTable> getFromTables() {
        return this.fromTables;
    }

    public void setFromTables(List<FromTable> fromTable) {
        this.fromTables = fromTable;
    }

    public void addFromTable(FromTable fromTable) {
        this.fromTables.add(fromTable);
    }

    public void setIsUnion(Boolean union) {
        this.isUnion = union;
    }

    public Boolean getIsUnion() {
        return this.isUnion;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("selectItems="+this.selectItems);
        stringBuilder.append(",fromTables="+this.fromTables);

        return stringBuilder.toString();
    }
}
