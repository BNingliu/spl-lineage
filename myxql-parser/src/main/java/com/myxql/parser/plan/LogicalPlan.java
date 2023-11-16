package com.myxql.parser.plan;

import com.myxql.parser.antlr4.Origin;
import com.myxql.parser.model.Statement;

import java.util.*;

// 逻辑计划，提供了解析表达式操作
public abstract class LogicalPlan extends Statement implements Comparable<LogicalPlan> {
    private String id;
    private Optional<Origin> location;
    // 子查询
    private List<LogicalPlan> children = new ArrayList<>();
    // with ctes
    private Map<String, LogicalPlan> ctes = new HashMap<>();

    public LogicalPlan(Optional<Origin> location) {
        this.location = location;
    }

    public LogicalPlan(String id) {
        this(Optional.empty());
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean hasChildren() {
        return this.children.size() > 0;
    }

    public List<LogicalPlan> getChildren() {
        return children;
    }

    public void setChildren(List<LogicalPlan> children) {
        this.children = children;
    }

    public void addChild(LogicalPlan logicalPlan) {
        this.children.add(logicalPlan);
    }

    public Boolean hasCtes() {
        return !this.ctes.isEmpty();
    }

    public Map<String, LogicalPlan> getCtes() {
        return this.ctes;
    }

    public void setCtes(Map<String, LogicalPlan> ctes) {
        this.ctes = ctes;
    }

    public void addCte(String alias, LogicalPlan plan) {
        this.ctes.put(alias, plan);
    }

    public Boolean containsCte(String alias) {
        return this.ctes.containsKey(alias);
    }


    public LogicalPlan findById(String id) {
        LogicalPlan tmp = new LogicalPlan(id) {};
        return this.findTreeNode(tmp);
    }

    /**
     * 从当前节点及其所有子节点中搜索某节点
     *
     * @param cmp
     * @return
     */
    public LogicalPlan findTreeNode(Comparable<LogicalPlan> cmp) {
        for (LogicalPlan element : this.children) {
            if (cmp.compareTo(element) == 0)
                return element;
            else
                return element.findTreeNode(cmp);
        }

        return null;
    }

    @Override
    public int compareTo(LogicalPlan that) {
        System.out.println("this.id="+this.id+" that="+that);
        return this.id.compareTo(that.id);
    }

    /*
    public NodeLocation getLocation() {
        return this.location.get();
    }
 */
}
