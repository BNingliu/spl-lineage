package com.myxql.parser.model;

import java.util.Objects;
import java.util.Optional;

public final class SetData extends Statement {
    private String key;
    private Optional<String> value;

    public String getKey() {
        return this.key;
    }

    public Optional<String> getValue() {
        return this.value;
    }

    public SetData(String key, Optional<String> value) {
        super();
        this.key = Objects.requireNonNull(key, "key is null");
        this.value = value;
    }

    @Override
    public String toString() {
        return "SetData(key=" + this.key + ", value=" + this.value + ")";
    }

    @Override
    public int hashCode() {
        int var1 = (this.key != null ? this.key.hashCode() : 0) * 31;
        return var1 + (this.value.isPresent() ? this.value.get().hashCode() : 0);
    }

    @Override
    public boolean equals(Object that) {
        if(that == null) {
            return false;
        }
        if (this != that) {
            if (that instanceof SetData) {
                SetData var2 = (SetData)that;
                if (this.key.equals(var2.key) && this.value.equals(var2.value)) {
                    return true;
                }
            }

            return false;
        } else {
            return true;
        }
    }
}