package com.myxql.parser.model;

import java.util.Objects;

public class UnSetData extends Statement {
    private String key;

    public String getKey() {
        return this.key;
    }

    public UnSetData(String key) {
        super();
        this.key = Objects.requireNonNull(key, "key is null");
    }

    @Override
    public String toString() {
        return "UnSetData(key=" + this.key + ")";
    }

    @Override
    public int hashCode() {
        return this.key != null ? this.key.hashCode() : 0;
    }

    @Override
    public boolean equals(Object that) {
        if(that == null) {
            return false;
        }
        if (this != that) {
            if (that instanceof UnSetData) {
                UnSetData var2 = (UnSetData)that;
                if (this.key.equals(var2.key)) {
                    return true;
                }
            }

            return false;
        } else {
            return true;
        }
    }
}