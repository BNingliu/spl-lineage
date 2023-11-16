package com.myxql.parser.model;

import java.util.Objects;
import java.util.Optional;

public final class StreamColumn extends Statement {
    private String name;
    private Optional<String> type;
    private Optional<String> comment;
    private Optional<String> jsonPath;
    private Optional<String> pattern;

    public String getName() {
        return this.name;
    }

    public Optional<String> getType() {
        return this.type;
    }

    public Optional<String> getComment() {
        return this.comment;
    }

    public Optional<String> getJsonPath() {
        return this.jsonPath;
    }

    public Optional<String> getPattern() {
        return this.pattern;
    }

    public StreamColumn(String name, Optional<String> type, Optional<String> comment, Optional<String> jsonPath, Optional<String> pattern) {
        super();
        this.name = Objects.requireNonNull(name, "name is null");
        this.type = type;
        this.comment = comment;
        this.jsonPath = jsonPath;
        this.pattern = pattern;
    }

    @Override
    public String toString() {
        return "StreamColumn(name=" + this.name + ", type=" + this.type + ", comment=" + this.comment + ", jsonPath=" + this.jsonPath + ", pattern=" + this.pattern + ")";
    }

    @Override
    public int hashCode() {
        int var1 = (this.name != null ? this.name.hashCode() : 0) * 31;
        var1 = (var1 + (this.type.isPresent() ? this.type.get().hashCode() : 0)) * 31;
        var1 = (var1 + (this.comment.isPresent() ? this.comment.hashCode() : 0)) * 31;
        var1 = (var1 + (this.jsonPath.isPresent() ? this.jsonPath.get().hashCode() : 0)) * 31;
        return var1 + (this.pattern.isPresent() ? this.pattern.get().hashCode() : 0);
    }

    @Override
    public boolean equals(Object that) {
        if(that == null) {
            return false;
        }
        if (this != that) {
            if (that instanceof StreamColumn) {
                StreamColumn var2 = (StreamColumn)that;
                if (this.name.equals(var2.name) && this.type.equals(var2.type)
                        && this.comment.equals(var2.comment) && this.jsonPath.equals(var2.jsonPath)
                        && this.pattern.equals(var2.pattern)) {
                    return true;
                }
            }

            return false;
        } else {
            return true;
        }
    }
}